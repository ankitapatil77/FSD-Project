import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
 
clickCount=0
  clickMe() {
    this.clickCount++;
  }
  title = 'EventBinding';
}