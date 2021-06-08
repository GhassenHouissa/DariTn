import { Component, ViewChild } from "@angular/core";
import { Router } from "@angular/router";
import { ChartComponent } from "ng-apexcharts";

import {
  ApexNonAxisChartSeries,
  ApexResponsive,
  ApexChart,
  ApexStroke,
  ApexFill
} from "ng-apexcharts";
import { RechercheService } from "../service/recherche.service";

export type ChartOptions = {
  series: ApexNonAxisChartSeries;
  chart: ApexChart;
  responsive: ApexResponsive[];
  labels: any;
  stroke: ApexStroke;
  fill: ApexFill;
};

@Component({
  selector: "app-root",
  templateUrl: "./chart.component.html",
  styleUrls: ["./chart.component.css"]
})
export class CharttComponent {
  @ViewChild("chart") chart: ChartComponent;
  n1:number; n2:number; n3:number;
  public chartOptions: Partial<ChartOptions>;

  constructor(private servstat:RechercheService , private router: Router) {
    this.servstat.getprice1().subscribe((data) => (this.n1 = data));
    this.servstat.getprice2().subscribe((data) => (this.n2 = data));
    this.servstat.getprice3().subscribe((data) => (this.n3 = data));
    this.servstat.getprice4().subscribe((data) => 
    this.chartOptions = {
      series: [this.n1, this.n2,this.n3, data],
      chart: {
        type: "polarArea"
      },
      labels: ["Price between 100 -250 "," Price between 251- 470", "Price between 471-600", "Price between 601 -1000"],
      stroke: {
        colors: ["#fff"]
      },
      fill: {
        opacity: 0.8
      },
      responsive: [
        {
          breakpoint: 480,
          options: {
            chart: {
              width: 200
            },
            legend: {
              position: "bottom"
            }
          }
        }
      ]
    });
  }

  static(){
    this.router.navigate(['stat']);
  }
}
