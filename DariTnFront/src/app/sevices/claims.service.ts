import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Claims } from 'src/app/model/Claims';

@Injectable({
  providedIn: 'root'
})
export class ClaimsService {

 numberClaims: string;
  
   constructor(private claimshttp:HttpClient) { }
      
    getAllClaims(){
        return this.claimshttp.get<Claims[]>("http://localhost:9090/SpringMVC/servlet/retrieve-all-claims");
      }

      numbClaims(){
        return this.claimshttp.get("http://localhost:9090/SpringMVC/servlet/numberOfClaims");
      }

    deleteClaimById(id_claim:number){
        return this.claimshttp.delete("http://localhost:9090/SpringMVC/servlet/remove-claim/"+id_claim);
        }

    addClaim(claim:Claims){
        return this.claimshttp.post<Claims>("http://localhost:9090/SpringMVC/servlet/add-claim",claim);
        }
    
}

