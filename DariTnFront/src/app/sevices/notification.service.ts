import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Notification } from 'src/app/model/notification';

@Injectable({
providedIn: 'root'
})

export class NotificationService {

  numberNotifications: string;

constructor(private notificationhttp:HttpClient) { }

getAllNotif(){
    return this.notificationhttp.get<Notification[]>("http://localhost:9090/SpringMVC/servlet/retrieve-all-notification");
  }

  numbNotifications(){
    return this.notificationhttp.get("http://localhost:9090/SpringMVC/servlet/numberOfNotification");
  }

deleteNotifById(IdNotif:number){
    return this.notificationhttp.delete("http://localhost:9090/SpringMVC/servlet/remove-notification/"+IdNotif);
    }

addNotification(notification:Notification){
    return this.notificationhttp.post<Notification>("http://localhost:9090/SpringMVC/servlet/add-notification",notification);
    }

  /*
getNotif(): Observable<any> {
    return this.notificationhttp.get(`${"http://localhost:9090/SpringMVC/servlet/retrieve-all-notification"}`);
  }

/*
getNotif() : Observable<string[]> {
    return this.notificationhttp.get<string[]>(this.notifURL);
    }

    getAllNotifByDescription(DescNotif:string) : Observable<Notif[]>{
        return this.notificationhttp.get<Notif[]>("http://localhost:9090/SpringMVC/servlet/retrieveNotificationByDescription/"+DescNotif);
        }
        */
}

