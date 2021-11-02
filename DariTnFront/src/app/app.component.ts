

import * as Chartist from 'chartist';
import { TokenStorageService } from './service/token-storage.service';

import { Component , ViewEncapsulation, ViewChild } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  //title = 'DariTnFront';
  title: string;
  private roles: string;
  isLoggedIn = false;
  showAdminBoard = false;
  showDashBoard = false;
  showModeratorBoard = false;
  username?: string;

  constructor(private tokenStorageService: TokenStorageService){
    this.title='spring Boot - Angular Application';
    
  }
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
