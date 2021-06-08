import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { EmailTemplate } from 'src/model/EmailTemplate';
import { EmailService } from '../service/email.service';

@Component({
  selector: 'app-email',
  templateUrl: './email.component.html',
  styleUrls: ['./email.component.css']
})
export class EmailComponent implements OnInit {

  emailTemplate : EmailTemplate =  new EmailTemplate ;
 

  constructor(private servEmail: EmailService , private router: Router) { }

  ngOnInit(): void {
  }

  addEmail(){
    this.servEmail.addEmailText(this.emailTemplate).subscribe();
  }


}
