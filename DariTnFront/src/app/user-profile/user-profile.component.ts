import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../entity/user';
import { map } from 'rxjs/operators';
import { UserProfileService } from './user-profile.service';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-user-profile',
  templateUrl: './user-profile.component.html',
  styleUrls: ['./user-profile.component.css']
})
export class UserProfileComponent implements OnInit {
  user:User;
  form: any = {
    id: null,
    login: null,
    firstName:null,
    lastName:null,
    email: null,
    password: null,
    role: null
  };
  
  successUpdateFlag =false;
  constructor(private userProfileService: UserProfileService, private  userService: UserService,  private router: Router,private route: ActivatedRoute) {this.user = new User(); }

  
  ngOnInit(): void {
    
    console.log(" Login  "+ sessionStorage.getItem("userId"));
     this.userService.getUsersId(parseInt(sessionStorage.getItem("userId")))
     .subscribe(data => {
     
      this.user.id = data.id;
      this.user.firstName = data.firstName;
      this.user.lastName = data.lastName;
      this.user.email = data.email;
      this.user.role = data.role;
      this.user.login = data.login;

      console.log(" Login  "+this.user.login);
      return data; 
  });
  
  }
  
  modify() {
    console.log(" update User with id = "+this.user.id);
    return this.userService.putUser(this.user).subscribe( data => {
      this.successUpdateFlag=true;
      //this.router.navigate(["/Sign In"]); 
      //window.location.reload();
    });
  }

 
}
