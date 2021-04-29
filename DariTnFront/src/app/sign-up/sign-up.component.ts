import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { User } from '../entity/user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {

  user :User;
  constructor( private route: ActivatedRoute, 
    private router: Router, 
      private userService: UserService) {
  this.user = new User();
      }
  ngOnInit(): void {
   
  }

  save() {
    this.userService.postUser(this.user).subscribe();
  }
}
