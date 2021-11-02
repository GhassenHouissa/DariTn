 import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { User } from '../entity/user';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-update-user',
  templateUrl: './update-user.component.html',
  styleUrls: ['./update-user.component.css']
})
export class UpdateUserComponent implements OnInit {

  user:User;
  constructor(private userService: UserService, private router :ActivatedRoute) { }

  ngOnInit(): void {
  }/*
  updateUser() {
    this.userService.updateUser( this.u)
      .subscribe(data => {
        console.log(data);
        this.u = new User();
        this.gotoList();
      }, error => console.log(error));
  }
  gotoList() {
    this.router.navigate(['/User Profile']);
  }
  

  onSubmit() {
    this.updateUser();    
  }*/
}
 