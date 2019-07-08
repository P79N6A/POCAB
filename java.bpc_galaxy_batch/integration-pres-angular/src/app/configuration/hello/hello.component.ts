import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HelloService } from '../services/HelloService';

@Component({
  selector: 'hello',
  templateUrl: './hello.component.html'
})
export class HelloComponent {

  private selectedName = '';
  private helloService: HelloService;
  public queryResult: string;

  constructor(helloService: HelloService, route: ActivatedRoute) {
    route.params.subscribe(params => {
        const name = params['name'];
        if (name != null) {
          this.selectedName = name;
        }
    });

    helloService.sayHelloTo(this.selectedName).subscribe(result => this.queryResult = result);
  }

}
