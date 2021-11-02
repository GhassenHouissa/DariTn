import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { AuthenticationService } from './sign-in/authentication.service';

@Injectable({
  providedIn: 'root'
})
export class AuthorizeAdminServiceService implements CanActivate{

  constructor(private authservice: AuthenticationService,
    private router: Router) { }

  canActivate() {
    if (sessionStorage.getItem("roles").includes(null)
      || sessionStorage.getItem("roles").includes("Customer")
     ) {
      this.router.navigate(["/Sign In"]);
      return false;
    }
    return true;
  }

}

