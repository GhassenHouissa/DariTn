import { Component, OnInit } from '@angular/core';
import { TokenStorageService } from '../service/token-storage.service';

@Component({
  selector: 'app-navbar-component',
  templateUrl: './navbar-component.component.html',
  styleUrls: ['./navbar-component.component.css'],
})
export class NavbarComponentComponent implements OnInit {

  roles:string;
  isLoggedIn = false;
  username?: string;
  showDashBoard= false;
  constructor(private tokenStorageService: TokenStorageService) { }

  ngOnInit(): void {
    this.isLoggedIn = !!this.tokenStorageService.getToken();

    if (this.isLoggedIn) {
      const user = this.tokenStorageService.getUser();
      this.roles = sessionStorage.getItem("roles");

      console.log("roles => ", this.roles);

      this.showDashBoard = this.roles.includes("Admin");
      
      this.username = user.username;
    }
  }
  


}
