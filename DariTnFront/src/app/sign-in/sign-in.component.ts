import { Component, enableProdMode, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Role } from '../entity/Role';
import { User } from '../entity/user';
import { TokenStorageService } from '../service/token-storage.service';
import { AuthenticationService } from './authentication.service';


enableProdMode();
@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  form: any = {
    username: null,
    password: null
  };
  isLoggedIn = false;
  isLoginFailed = false;
  errorMessage = '';
  user: User;
  msg = '';
   roles :string[] = [];

  constructor(private authService: AuthenticationService, private tokenStorage: TokenStorageService, private router: Router) { }
  

  ngOnInit(): void {
    if (this.tokenStorage.getToken()) {
      this.isLoggedIn = true;
      this.roles = this.tokenStorage.getUser().roles;
    }
  }

  onSubmit(): void {
    const { username, password } = this.form;
    
    this.authService.login(this.form.username, this.form.password).subscribe(
      data => {
        this.tokenStorage.saveToken(data.jwttoken);
       // this.tokenStorage.saveUser(data);

        /* this.isLoginFailed = false;
        this.isLoggedIn = true; */
        this.roles = this.tokenStorage.getUser().roles;
        
        /* this.reloadPage(); */
         if (sessionStorage.getItem("roles").includes("Admin")){
          this.router.navigate(["/Dashboard"]);
        }else {
          this.router.navigate(["/home"]);
        } 
      },
      err => {
        this.errorMessage = err.error.message;
        this.isLoginFailed = true;
      } 
    );
  }

  reloadPage(): void {
    window.location.reload();
  }
  
  logout(): void {
    sessionStorage.clear;
    this.tokenStorage.signOut();
    window.location.reload();
  }

  /* authenticat() { */

    /* this.authservice.authenticate(new Authenticate(this.form.username, this.form.password)).subscribe(
      data => {
        localStorage.setItem('Token', data.jwttoken)
        localStorage.setItem('Type', data.type)
        localStorage.setItem('Username', data.username)
        localStorage.setItem('Authorities', data.authorities)
     },
     error => {
     this.msg = 'Username Or password Invalid';
     }
   ) */
/*  } */
}
