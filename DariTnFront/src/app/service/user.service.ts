import { HttpClient } from '@angular/common/http';
import { Injectable, ViewChild } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from 'src/app/entity/user';
import { catchError, map,tap} from 'rxjs/operators';


const API_URL = 'http://localhost:9090/daritn/';
@Injectable({
  providedIn: 'root'
})
export class UserService {

  addUrl = 'http://localhost:9090/daritn/add-user';
  updateUrl = 'http://localhost:9090/daritn/modify-user';

  dataSource: any;
  numberCustomer: string;
  numberAdmin:string;
  numberUsers:string;

  constructor(private http: HttpClient) {
  } 
     /*public save(user:User){
     return this.http.post<User>(this.usersUrl, user);
   }*/

   postUser (u:User){
     return this.http.post(this.addUrl,u);
   }

   putUser(u:User){
    return this.http.put(this.updateUrl,u);
  }

  updateUser(user : Object  ): Observable<Object> {
    return this.http.put(`${API_URL+"modify-user"}`, user);
  }
   /* getUsers(): Observable<User[]> {
    return this.http.get<User[]>(API_URL + "retrieve-all-users").pipe(
      map(data => {
        
        this.dataSource = data
        console.log(" data "+ data );
        return data; 
    }));
    }*/
     /*  .subscribe(response => {
      this.dataSource = new MatTableDataSource(response);
      this.dataSource.sort = this.sort;
    }); */
  
  
     getUsers(): Observable<any> {
      return this.http.get(`${API_URL+"retrieve-all-users"}`);
    }

    getUsersId(id: number): Observable<any> {
      return this.http.get(`${API_URL+"retrieve-all-users"}/${id}`);
    }
 


   deleteUser(id: number){
     return this.http.delete(`${API_URL+"remove-user"}/${id}`);
   }

   getnumber(){
     return this.http.get(API_URL +'numberOfUsers')
   }

   getnumberbyAdmin(){
     return this.http.get(API_URL + "countUserByRole/Admin")
   }

   getnumberbyCustomer(){
     return this.http.get(API_URL + "countUserByRole/Customer");
   }

   getUserByLogin(){
     return this.http.get(API_URL + "retrieveUserByLogin/{login}")
   }



 
}

