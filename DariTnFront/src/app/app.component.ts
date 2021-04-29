import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //title = 'DariTnFront';
  title: string;

  constructor(){
    this.title='spring Boot - Angular Application';
  }
}
