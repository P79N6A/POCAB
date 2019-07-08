
import {throwError as observableThrowError,  Observable } from 'rxjs';
import { map, filter, catchError, mergeMap } from 'rxjs/operators';
import { Injectable } from '@angular/core';
import { Request, XHRBackend, RequestOptions, Response, Http, RequestOptionsArgs, Headers } from '@angular/http';
import { Router, NavigationEnd, Event } from '@angular/router';

/**
 * This class handles generically the error on authentication.
 */
@Injectable()
export class AuthenticatedHttpService extends Http {

  private router: Router;

  constructor(backend: XHRBackend, defaultOptions: RequestOptions, router: Router) {
    super(backend, defaultOptions);
    this.router = router;
  }

  request(url: string | Request, options?: RequestOptionsArgs): Observable<Response> {
    return super.request(url, options).pipe(
    		catchError( error => {
    			if (error.status === 401 && (window.location.href.match(/\?/g) || []).length < 2) {
    				if (window.location.href != '/login') {
    					this.router.navigate(['/login']);
    				}
    			}
    			if ((error.status === 403 || error.status === 405) && (window.location.href.match(/\?/g) || []).length < 2) {
    				return observableThrowError(error);
    			}
    			return observableThrowError('');
    			}
    		)
    	);
  }
}
