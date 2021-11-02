import { HttpClient,HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {  Observable } from 'rxjs';
import { map, catchError } from 'rxjs/operators';
import { JwtResponse } from '../entity/JwtResponse';
import { Role } from '../entity/Role';
import { User } from '../entity/user';

const AUTH_API ="http://localhost:9090/daritn/authenticate";

const BACK_API ="http://localhost:9090/daritn/";
const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {
  
  roles:Role;
  u: User ;
  options : any;
/*   http: any;
 */ 
  constructor(private authhttp :HttpClient) {
    this.u = new User();
    
   }
login(username: string,password: string){

    let headers = new HttpHeaders();
    headers = headers.set("Content-Type", "application/json");

    return this.authhttp.post<any>(AUTH_API , {
      username,
      password
    }, httpOptions)
    .pipe(
      map(userdata => {
        sessionStorage.setItem("username",username);
        let token= "Bearer "+ userdata.token;
        window.console.log("token : "+userdata.token);
        sessionStorage.setItem("token",token);
        sessionStorage.setItem("roles",userdata.role);

        console.log(" roles "+userdata.roles);
        return userdata; 
    })
    );
    }  
    
    /* login(user: User): Observable<User>{
      return this.authhttp.post(AUTH_API,user);
    } */

  /*   register(username: string, email: string, password: string): Observable<any> {
      return this.http.post(AUTH_API  ,{
        username,
        email,
        password
      }, httpOptions);
    } */
}  

