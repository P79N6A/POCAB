import { Component, Input  } from '@angular/core';
import { LoginService } from '../../../login/shared/services/LoginService';

@Component({
  selector: 'app-main-nav',
  templateUrl: './main-nav.component.html',
  styleUrls: ['./main-nav.component.css']
})
export class MainNavComponent   {

  @Input() label;
  private loginService: LoginService;

  constructor(loginService: LoginService) {
    this.loginService = loginService;
  }

  logout(): void {
    this.loginService.logout().subscribe(res => console.log(res));
  }
}
