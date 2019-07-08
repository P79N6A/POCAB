import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpModule, Http } from '@angular/http';

import { BnpBrandBarComponent } from './bnp-brand-bar/bnp-brand-bar.component';
import { MainNavComponent } from './main-nav/main-nav.component';
import { LoginModule } from '../../login/login.module';

/**
 * SHARED UI SHARED COMPONENTS
 *
 * @export
 * @class SharedUIModule
 */
@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    ReactiveFormsModule,
    LoginModule
  ],
  exports: [
    BnpBrandBarComponent,
    MainNavComponent
  ],
  declarations: [
    BnpBrandBarComponent,
    MainNavComponent
]
})
export class SharedUIModule { }
