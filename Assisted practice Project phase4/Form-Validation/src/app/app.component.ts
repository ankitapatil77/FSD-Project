import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

   //Create FormGroup
   //Create FormGroup
  requiredForm!: FormGroup;
   constructor(private fb: FormBuilder) {
      this.myForm();
   }

   //Create required field validator for name
   myForm() {
      this.requiredForm = this.fb.group({
      name: ['', Validators.required ]
      });
   }
   ngOnInit()
   {

   }
}


