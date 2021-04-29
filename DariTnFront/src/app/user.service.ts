import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from './entity/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  usersUrl = 'http://localhost:9090/daritn/add-user';

  constructor(private http: HttpClient) {
  } 
     /*public save(user:User){
     return this.http.post<User>(this.usersUrl, user);
   }*/

   postUser (u:User){
     return this.http.post(this.usersUrl,u);
   }
}

