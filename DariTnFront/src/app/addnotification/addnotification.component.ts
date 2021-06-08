import { Component, OnInit } from '@angular/core';
import { Notification } from '../model/notification';
import { NotificationService} from '../sevices/notification.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addnotification',
  templateUrl: './addnotification.component.html',
  styleUrls: ['./addnotification.component.css']
})
export class AddnotificationComponent implements OnInit {

  notification : Notification = new Notification;

  constructor(private ss:NotificationService, private notifrouter:Router) { }

  ngOnInit(): void {
  }

  addNotifications(){this.ss.addNotification(this.notification).subscribe(()=>this.notifrouter.navigateByUrl("/AddNotification"));
    }
    

}
