import { Component, OnInit } from '@angular/core';
import { NotificationService } from '../sevices/notification.service';
import { Notification } from '../model/notification';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-notification',
  templateUrl: './notification.component.html',
  styleUrls: ['./notification.component.css']
})
export class NotificationComponent implements OnInit {

  n:Notification;
  Tnotifications:Observable<Notification[]>;

  constructor(private servicenotification:NotificationService) { }

  
  numberNotifications:string;
  position:Observable<number>;

  ngOnInit(): void {
  this.reloadDataa();
  this.numberNotifications=this.servicenotification.numberNotifications;
  this.servicenotification.numbNotifications().subscribe(data=>{this.numberNotifications=data.toString()})
  }

  reloadDataa() {this.Tnotifications= this.servicenotification.getAllNotif();
  }

  numbrNotifications() {return this.servicenotification.numbNotifications()};

  deleteNotif(IdNotif:number){this.servicenotification.deleteNotifById(IdNotif).subscribe(()=>this.servicenotification.getAllNotif().subscribe(data=>{this.Tnotifications}));
    }

    refresh(): void {
      window.location.reload();
  }

  


}
