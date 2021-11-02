import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ads } from 'src/modelAds/ads';
import { AdsService } from '../services/ads.service';

@Component({
  selector: 'app-update-ads',
  templateUrl: './update-ads.component.html',
  styleUrls: ['./update-ads.component.css']
})
export class UpdateAdsComponent implements OnInit {


  id: number;
  ads:Ads;

  constructor(private route: ActivatedRoute, private router: Router,
    private adsService: AdsService ) { }

  ngOnInit(): void {

    this.ads = new Ads();

    this.id = this.route.snapshot.params['id'];
    
    this.adsService.getAds(this.id)
      .subscribe(data => {
        console.log(data)
        this.ads = data;
      }, error => console.log(error));

  }

  updateAds() {
    this.adsService.updateAds( this.ads)
      .subscribe(data => {
        console.log(data);
        this.ads = new Ads();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateAds();    
  }

  gotoList() {
    this.router.navigate(['/putAds']);
  }


}
