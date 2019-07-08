import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-bnp-brand-bar',
  templateUrl: './bnp-brand-bar.component.html',
  styleUrls: ['./bnp-brand-bar.component.css']
})
export class BnpBrandBarComponent {

  @Input() logoUrl;

  constructor() {
    //document.getElementById("logo").innerHTML = '<img src="dist/' + image + '" alt="photo">';

  }
}
