import { AfterViewInit, Component, Input, ViewChild } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { TextBoxComponent } from '@progress/kendo-angular-inputs';

import { FileRestrictions } from '@progress/kendo-angular-upload';
import { Ads } from 'src/modelAds/ads';
import { AdsService } from '../services/ads.service';

@Component({
  selector: 'app-details-liste-property',
  templateUrl: './details-liste-property.component.html',
  styleUrls: ['./details-liste-property.component.css']
})
export class DetailsListePropertyComponent  {
  public uploadSaveUrl = 'saveUrl'; // should represent an actual API endpoint
  public uploadRemoveUrl = 'removeUrl'; // should represent an actual API endpoint
  imageSrc: string;


  ads: Ads = new Ads();


  public restrictions: FileRestrictions = {
      allowedExtensions: ['jpg', 'jpeg', 'png']
  };

  @Input() public propertyDetails: FormGroup;



  submitted = false;

  constructor(private adsService: AdsService,
    private router: Router){   
}
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
  onFileChange(event) {
    const reader = new FileReader();

    if (event.target.files && event.target.files.length) {
      const [image] = event.target.files;

      reader.readAsDataURL(image);

      reader.onload = () => {
        this.imageSrc = this.ads.media = reader.result as string;
      };
    }
  }
}