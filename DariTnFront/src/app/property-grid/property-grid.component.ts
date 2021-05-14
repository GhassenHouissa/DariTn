import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Ads } from 'src/modelAds/ads';
import { AdsService } from '../services/ads.service';

@Component({
  selector: 'app-property-grid',
  templateUrl: './property-grid.component.html',
  styleUrls: ['./property-grid.component.css']
})
export class PropertyGridComponent implements OnInit {
  adss: Observable<Ads[]>;

  constructor(
    private adsService:AdsService,
     private router: Router,
  ) { }
  ngOnInit(): void {
    this.reloadData();  

  }
  reloadData() {
    this.adss = this.adsService.getAllAds();
  }
  propSingle(id: number){
    this.router.navigate(['Property-Single', id]);
  }
}
