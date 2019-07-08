import { Injectable } from '@angular/core';
import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { AbstractService } from './AbstractService';

/**
 * This class can request the server to get hello worlds.
 */
@Injectable()
export class HelloService extends AbstractService {

  /**
    * The service that can manage the hello world.
    *
    * @param http the http server requested to make http requests.
    */
  constructor(http: Http) {
    super(http);
  }

  protected getServiceSpecificUrl(): string {
    return 'hello';
  }

  /**
   * Start a GET request and send a hello to the person's name.
   * This request receive String formatted responses.
   * Request URL is "api/hello/${name}".
   * If an error is raised, then it is forwarded to the view.
   *
   * @param name the name of the person to say hello to.
   *
   * @return the hello ${name}.
   */
  sayHelloTo(name: string): Observable<string | any> {
    const url = `${this.getUrl()}/${name}`;
    return this.http.get(url)
            .pipe(
               map(res => super.extractStringFromResponse(res)),
               catchError(error => super.handleError(error))
            );
  }

}
