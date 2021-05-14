import { Component, Input, ViewEncapsulation } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Ads } from 'src/modelAds/ads';

@Component({
  selector: 'app-details3',
  templateUrl: './details3.component.html',
  encapsulation: ViewEncapsulation.None,
  styleUrls: ['./details3.component.css']
})
export class Details3Component  {


  ads: Ads = new Ads();

  @Input() public paymentDetails: FormGroup;
}
