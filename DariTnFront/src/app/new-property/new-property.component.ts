import { FormGroup, FormControl, Validators } from '@angular/forms';

import { Component, OnInit, ViewEncapsulation, ViewChild, Output,EventEmitter  } from '@angular/core';
import { StepperComponent } from '@progress/kendo-angular-layout';
import { Ads } from 'src/modelAds/ads';
import { Router } from '@angular/router';
import { AdsService } from '../services/ads.service';
import { NgStyle } from '@angular/common';
//import * as EventEmitter from 'node:events';


@Component({
  selector: 'app-new-property',
  templateUrl: './new-property.component.html',   
   encapsulation: ViewEncapsulation.None,
  styleUrls: ['./new-property.component.scss']
})
export class NewPropertyComponent implements OnInit  {



/* consommation service */
/* @Output()  longitude = new EventEmitter<any>() ;
@Output()  latitude = new EventEmitter<any>() ;
 */
public latit : any;
public longit : any;

ads: Ads = new Ads();
submitted = false;

/* longitExp(){
    this.longitude.emit(this.longit);
} */

/* latitExp(){
    this.latitude.emit(this.latit);
} */
location(){
    navigator.geolocation.getCurrentPosition((position) => {
        const coords = position.coords;
        this.longit=coords.longitude;
        this.latit=coords.latitude;
        const latLong = [this.latit, this.longit];
        console.log(
          `lat: ${position.coords.latitude}, lon: ${position.coords.longitude}`
        ) 
       // console.log('xxxxYYYxxxx'+this.);

    });
}

constructor(private adsService: AdsService,
    private router: Router){   
}
    ngOnInit(): void {
        if (!navigator.geolocation) {
            console.log('location is not supported');
          }
      this.location();
    
    }

/* gotoList() {
    this.router.navigate(['/adses']);
  } */
save() {
    this.adsService
    .postAds(this.ads).subscribe(data => {
      console.log(data)
     // this.ads = new Ads();
    //  this.gotoList();
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }
 

/* /consommation service */

  public currentStep = 0;

  @ViewChild('stepper', { static: true })
public stepper: StepperComponent;
  private isStepValid = (index: number): boolean => {
      return this.getGroupAt(index).valid || this.currentGroup.untouched;
  };

  private shouldValidate = (index: number): boolean => {
      return this.getGroupAt(index).touched && this.currentStep >= index;
  };

  public steps = [
      {
          label: 'what do you sell?',
          isValid: this.isStepValid,
          validate: this.shouldValidate
      },
      {
          label: 'Category',
          isValid: this.isStepValid,
          validate: this.shouldValidate
      },
      {
          label: 'Property Details',
          isValid: this.isStepValid,
          validate: this.shouldValidate
      }
  ];

  public form = new FormGroup({
    propertyDetails: new FormGroup({
          title: new FormControl('', Validators.required),
          description: new FormControl(''),

          media: new FormControl(null)
      }),
      personalDetails: new FormGroup({
          country: new FormControl('', [Validators.required]),
          paymentType: new FormControl(null, Validators.required),
      }),
      paymentDetails: new FormGroup({
        roomType: new FormControl(null, Validators.required),

      })
  });

  public get currentGroup(): FormGroup {
      return this.getGroupAt(this.currentStep);
  }

  public next(): void {
      if (this.currentGroup.valid && this.currentStep !== this.steps.length) {
          this.currentStep += 1;
          return;
      }

      this.currentGroup.markAllAsTouched();
       this.stepper.validateSteps();
   }

  public prev(): void {
      this.currentStep -= 1;
  }

  public submit(): void {
      if (!this.currentGroup.valid) {
          this.currentGroup.markAllAsTouched();
           this.stepper.validateSteps();
       }
      if (this.form.valid) {
       this.save();    
          console.log('Submitted data', this.form.value);
      }
  }

  private getGroupAt(index: number): FormGroup {
      const groups = Object.keys(this.form.controls).map(groupName =>
          this.form.get(groupName)
          ) as FormGroup[];

      return groups[index];
  }



}
 
