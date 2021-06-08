import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Orders } from 'src/model/Orders';
import { StatisticPayment } from 'src/model/StatisticPayment';

@Injectable({
  providedIn: 'root'
})
export class OrdersService {

  url = "http://localhost:8082/DARITN/servlet/retrieve-all-orders" ;

  constructor(private orderhttp : HttpClient) { }

  addstatistic(statPayment: StatisticPayment ): Observable<any>{
    return this.orderhttp.post("http://localhost:8082/DARITN/servlet/criteria",statPayment) ;
  }

  getAllOrders(): Observable<Orders[]>{
    return this.orderhttp.get<Orders[]>(this.url) ;
    }
}
