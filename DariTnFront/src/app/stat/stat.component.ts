import { Component, OnInit } from '@angular/core';
import { ChartComponent } from "ng-apexcharts";

import {
  ApexNonAxisChartSeries,
  ApexResponsive,
  ApexChart
} from "ng-apexcharts";
import { RechercheService } from '../service/recherche.service';



export type ChartOptions = {
  series: ApexNonAxisChartSeries;
  chart: ApexChart;
  responsive: ApexResponsive[];
  labels: any;
};


@Component({
  selector: 'app-stat',
  templateUrl: './stat.component.html',
  styleUrls: ['./stat.component.css']
})
export class StatComponent  {

  n1: number;
  n2: number ;

  chart: ChartComponent;
  public chartOptions: Partial<ChartOptions>;

  constructor( private servstat: RechercheService) {
    this.servstat.getachat().subscribe((data) => (this.n1 = data));
    this.servstat.getloc().subscribe((data) => 
    this.chartOptions = {
      series: [this.n1 , data],
      chart: {
        width: 380,
        type: "pie"
      },
      labels: ["Purchase", "Rental"],
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


  
}
