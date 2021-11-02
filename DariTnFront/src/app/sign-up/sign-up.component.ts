import { Component, enableProdMode, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from 'src/app/entity/user';
import { Role } from '../entity/Role';
import { UserService } from '../service/user.service';
import { AuthenticationService } from '../sign-in/authentication.service';

enableProdMode();
@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {
  form: any = {
    username: null,
    email: null,
    password: null
  };
  isSuccessful = false;
  isSignUpFailed = false;
  errorMessage = '';
  user :User;
  constructor( private route: ActivatedRoute, 
    private router: Router, 
      private userService: UserService,
      private authservice: AuthenticationService) {
  this.user = new User();
      }
  ngOnInit(): void {
   
  }

  save() {
    this.user.role = Role.Customer;
    this.userService.postUser(this.user).subscribe( data => {
      this.router.navigate(["/Sign In"]);
    });
  }
}
