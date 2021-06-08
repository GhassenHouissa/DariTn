import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ads } from 'src/model/Ads';
import { Favorites } from 'src/model/Favorites';
import { StatisticPayment } from 'src/model/StatisticPayment';
import { Orders } from 'src/model/Orders';
import { FavoritesService } from '../service/favorites.service';
import { OrdersService } from '../service/orders.service';
import { RechercheService } from '../service/recherche.service';

@Component({
  selector: 'app-agent-single',
  templateUrl: './agent-single.component.html',
  styleUrls: ['./agent-single.component.css']
})
export class AgentSingleComponent implements OnInit {

  constructor(private route: ActivatedRoute, private router : Router , private favserv: FavoritesService , private rechserv: RechercheService , private servOrder: OrdersService) { }

  id: number ;
  id1: number ;
  favorites: Favorites ;
  content: string ;
  ListAds : Ads[] ;
  ads : Ads = new Ads() ;
  ListOrders: Orders[];
  orders: Orders;
  statPayement: StatisticPayment;
  listPayment: StatisticPayment[];

  statisticPayment : StatisticPayment = new StatisticPayment () ;

  ngOnInit(): void {
    this.rechserv.getContent(this.content).subscribe(res=>{console.log(res);
      this.ListAds=res}) ;
    
      

  }

  public findByContent(){
    const resp = this.rechserv.getContent(this.content);
    resp.subscribe((data) => {
      this.ListAds = data;
      console.log(this.ListAds);  });
}




  

}
