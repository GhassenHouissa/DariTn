import { Component, Input, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ads } from 'src/modelAds/ads';
import { AdsService } from '../services/ads.service';
/* geolocation */
declare const L: any;
/* /geolocation */
@Component({
  selector: 'app-property-single',
  templateUrl: './property-single.component.html',
  styleUrls: ['./property-single.component.css']
})
export class PropertySingleComponent implements OnInit {
  id: number;
  ads:Ads;
  lg:any;
  alt:any;

  longg(x:any){
    this.lg=x;
  }
  latt(x:any){
    this.lg=x;
  }

  constructor(private route: ActivatedRoute, private router: Router,
    private adsService: AdsService ) { }

@Input() public longit

/* geolocation */
ngOnInit() {
   const latL=[this.alt,this.lg];
  /* ads */
  this.ads = new Ads();

  this.id = this.route.snapshot.params['id'];
  
  this.adsService.getAds(this.id)
    .subscribe(data => {
      console.log(data)
      this.ads = data;
    }, error => console.log(error));

  /* /ads */

  if (!navigator.geolocation) {
    console.log('location is not supported');
  }
  navigator.geolocation.getCurrentPosition((position) => {
    const coords = position.coords;
    const latLong = [coords.latitude, coords.longitude];
    console.log(
      `lat: ${position.coords.latitude}, lon: ${position.coords.longitude}`
    );
    let mymap = L.map('map').setView(latLong, 13);
    L.tileLayer(
      'https://api.mapbox.com/styles/v1/{id}/tiles/{z}/{x}/{y}?access_token=pk.eyJ1IjoiYWNocmFmMTk5NiIsImEiOiJja29uZnd3bm4wMTJ2MnJwYzZ6a2s3bDFtIn0.GnxfSiKdfloFOr6mbRY7bw',
      {
        attribution:
          'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
        maxZoom: 18,
        id: 'mapbox/streets-v11',
        tileSize: 512,
        zoomOffset: -1,
        accessToken: 'your.mapbox.access.token',
      }
    ).addTo(mymap);
    let marker = L.marker(latLong).addTo(mymap);

    marker.bindPopup('<b>Property location</b>').openPopup();

    let popup = L.popup()
      .setLatLng(latLong)
      .setContent('House...')
      .openOn(mymap);
  });
  this.watchPosition();
}

watchPosition() {
  let desLat = 0;
  let desLon = 0;
  let id = navigator.geolocation.watchPosition(
    (position) => {
      console.log(
        `lat: ${position.coords.latitude}, lon: ${position.coords.longitude}`
      );
      if (position.coords.latitude === desLat) {
        navigator.geolocation.clearWatch(id);
      }
    },
    (err) => {
      console.log(err);
    },
    {
      enableHighAccuracy: true,
      timeout: 5000,
      maximumAge: 0,
    }
  );
}
}

