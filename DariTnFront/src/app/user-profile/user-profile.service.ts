import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../entity/user';

 
@Injectable({
  providedIn: 'root'
})
export class UserProfileService {
  updateUrl = 'http://localhost:9090/daritn/modify-user';

  
  constructor(private http: HttpClient) { }


  putUser(u:User){
    return this.http.put(this.updateUrl,u)
  }

}
