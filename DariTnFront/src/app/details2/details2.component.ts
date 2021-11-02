import { Component, Input, ViewEncapsulation } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Ads } from 'src/modelAds/ads';

import { countries } from '../countries';
@Component({
  selector: 'app-details2',
  templateUrl: './details2.component.html',
  encapsulation: ViewEncapsulation.None,
  styleUrls: ['./details2.component.css']
})
export class Details2Component {
  ads: Ads = new Ads();

  public countries: Array<string> = countries;

    @Input() public personalDetails: FormGroup;
}
