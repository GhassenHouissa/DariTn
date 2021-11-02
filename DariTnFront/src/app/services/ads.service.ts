import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdsService {
public baseUrl = 'http://localhost:9090/daritn';
    
  constructor(private http:HttpClient) { }

  postAds(ads: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl+"/postAds"}`, ads);
  }

/*   postMedia(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl+"/deleteAds"}/${id}`);
  } */


  getAllAds(): Observable<any> {
    return this.http.get(`${this.baseUrl+"/getAllAds"}`);
  }


  deleteAds(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl+"/deleteAds"}/${id}`);
  }

  updateAds(ads : Object  ): Observable<Object> {
    return this.http.put(`${this.baseUrl+"/putAds"}`, ads);
  }

  getAds(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl+"/getAdsById"}/${id}`);
  }


}
