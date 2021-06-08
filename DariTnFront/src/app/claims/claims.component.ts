import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Claims } from '../model/Claims';
import { ClaimsService} from '../sevices/claims.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-claims',
  templateUrl: './claims.component.html',
  styleUrls: ['./claims.component.css']
})
export class ClaimsComponent implements OnInit {


  constructor(private serviceclaims:ClaimsService) { }

  Tclaims:Observable<Claims[]>;
  numberClaims:string;
  position:Observable<number>;

  ngOnInit(): void {
  this.reloadData();
  this.numberClaims=this.serviceclaims.numberClaims;
  this.serviceclaims.numbClaims().subscribe(data=>{this.numberClaims=data.toString()})
  }

  reloadData() {this.Tclaims= this.serviceclaims.getAllClaims();
  }

  numbrClaims() {return this.serviceclaims.numbClaims()};

  deleteClaim(id_claim:number){this.serviceclaims.deleteClaimById(id_claim).subscribe(()=>this.serviceclaims.getAllClaims().subscribe(data=>{this.Tclaims}));
    }

    refresh(): void {
      window.location.reload();
  }


    
/*

  showPosition(position) {
    var latlon = position.coords.latitude + "," + position.coords.longitude;
  
    var img_url = "https://maps.googleapis.com/maps/api/staticmap?center="+latlon+"&zoom=14&size=400x300&sensor=false&key=AIzaSyA3qyvE5OjuK2iefCsbk3KWTtP3_9tspWU";
  
    document.getElementById("mapholder").innerHTML = "<img src='"+img_url+"'>";
  }

  /*ViewClaims(){
    this.show=true;
    this.showIntAddClaims=false;
  }
 
  AddInsuranceShowDiv(){
    this.show=false;
    this.showIntAddInsurance=true;
  }

*/

}
