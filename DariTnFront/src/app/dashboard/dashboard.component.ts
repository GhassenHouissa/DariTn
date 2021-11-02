import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import * as Chartist from 'chartist';
import { Observable } from 'rxjs';
import { User } from '../entity/user';
import { UserService } from '../service/user.service';
@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {
  /*user2:User; */
 from :any={
  login: null
 };
 user: Observable<User[]>;
 u:User;
 id:number;
 numberCustomer: string;
 numberAdmin: string;

 numberUsers:string;
  constructor(private userService: UserService, private router:Router ,private route:ActivatedRoute) { }

  startAnimationForLineChart(chart){
    let seq: any, delays: any, durations: any;
    seq = 0;
    delays = 80;
    durations = 500;
    
    
    chart.on('draw', function(data) {
      if(data.type === 'line' || data.type === 'area') {
        data.element.animate({
          d: {
            begin: 600,
            dur: 700,
            from: data.path.clone().scale(1, 0).translate(0, data.chartRect.height()).stringify(),
            to: data.path.clone().stringify(),
            easing: Chartist.Svg.Easing.easeOutQuint
          }
        });
      } else if(data.type === 'point') {
            seq++;
            data.element.animate({
              opacity: {
                begin: seq * delays,
                dur: durations,
                from: 0,
                to: 1,
                easing: 'ease'
              }
            });
        }
    });

    seq = 0;
};
startAnimationForBarChart(chart){
    let seq2: any, delays2: any, durations2: any;

    seq2 = 0;
    delays2 = 80;
    durations2 = 500;
    chart.on('draw', function(data) {
      if(data.type === 'bar'){
          seq2++;
          data.element.animate({
            opacity: {
              begin: seq2 * delays2,
              dur: durations2,
              from: 0,
              to: 1,
              easing: 'ease'
            }
          });
      }
    });

    seq2 = 0;
};
ngOnInit() {

  this.u = new User();

    this.id = this.route.snapshot.params['id'];
    
    this.userService.getUsersId(this.id)
      .subscribe(data => {
        console.log(data)
        this.user = data;
      }, error => console.log(error));

  this.get();
    /* ----------==========     Daily Sales Chart initialization For Documentation    ==========---------- */

    const dataDailySalesChart: any = {
        labels: ['M', 'T', 'W', 'T', 'F', 'S', 'S'],
        series: [
            [12, 17, 7, 17, 23, 18, 38]
        ]
    };

   const optionsDailySalesChart: any = {
        lineSmooth: Chartist.Interpolation.cardinal({
            tension: 0
        }),
        low: 0,
        high: 50, // creative tim: we recommend you to set the high sa the biggest value + something for a better look
        chartPadding: { top: 0, right: 0, bottom: 0, left: 0},
    }

    var dailySalesChart = new Chartist.Line('#dailySalesChart', dataDailySalesChart, optionsDailySalesChart);

    this.startAnimationForLineChart(dailySalesChart);


    /* ----------==========     Completed Tasks Chart initialization    ==========---------- */

    const dataCompletedTasksChart: any = {
        labels: ['12p', '3p', '6p', '9p', '12p', '3a', '6a', '9a'],
        series: [
            [230, 750, 450, 300, 280, 240, 200, 190]
        ]
    };

   const optionsCompletedTasksChart: any = {
        lineSmooth: Chartist.Interpolation.cardinal({
            tension: 0
        }),
        low: 0,
        high: 1000, // creative tim: we recommend you to set the high sa the biggest value + something for a better look
        chartPadding: { top: 0, right: 0, bottom: 0, left: 0}
    }

    var completedTasksChart = new Chartist.Line('#completedTasksChart', dataCompletedTasksChart, optionsCompletedTasksChart);

    // start animation for the Completed Tasks Chart - Line Chart
    this.startAnimationForLineChart(completedTasksChart);



    /* ----------==========     Emails Subscription Chart initialization    ==========---------- */

    var datawebsiteViewsChart = {
      labels: ['J', 'F', 'M', 'A', 'M', 'J', 'J', 'A', 'S', 'O', 'N', 'D'],
      series: [
        [542, 443, 320, 780, 553, 453, 326, 434, 568, 610, 756, 895]

      ]
    };
    var optionswebsiteViewsChart = {
        axisX: {
            showGrid: false
        },
        low: 0,
        high: 1000,
        chartPadding: { top: 0, right: 5, bottom: 0, left: 0}
    };
    var responsiveOptions: any[] = [
      ['screen and (max-width: 640px)', {
        seriesBarDistance: 5,
        axisX: {
          labelInterpolationFnc: function (value) {
            return value[0];
          }
        }
      }]
    ];
    var websiteViewsChart = new Chartist.Bar('#websiteViewsChart', datawebsiteViewsChart, optionswebsiteViewsChart, responsiveOptions);

    //start animation for the Emails Subscription Chart
    this.startAnimationForBarChart(websiteViewsChart);

    this.numberCustomer = this.userService.numberCustomer;
    this.numberAdmin = this.userService.numberAdmin;

    

    this.userService.getnumberbyCustomer().subscribe( data => {
      console.log( "data "+data.toString()); 
        this.numberCustomer = data.toString();
       
     }
   );

   this.userService.getnumberbyAdmin().subscribe( data => {
    console.log( "data "+data.toString()); 
      this.numberAdmin = data.toString();
     
   }
 );

 this.userService.getnumber().subscribe( data => {
  console.log( "data "+data.toString()); 
    this.numberUsers = data.toString();
   
 }
);
}

/* retrieveUsers(){
  return this.userService.getUsers();
} */

get() {
  this.user= this.userService.getUsers();
}
/* update(id: number){
  this.router.navigate(['updateUser', id]);
} */

remove(id: number){
  /* return this.userService.deleteUser() */
  
    this.userService.deleteUser(id)
      .subscribe(
        data => {
          console.log(data);
          this.get();
        },
        error => console.log(error));
  

}

modify(id: number){
  sessionStorage.setItem("userId", id.toString());
  console.log("id  from dashbors"+ id.toString );
 return this.router.navigate(["/User Profile"]);
}

numberofUsers(){
  return this.userService.getnumber();
}

numberOfAdmin(){
  return this.userService.getnumberbyAdmin();
}

numberOFCustomer(){
  return this.userService.getnumberbyCustomer();
}

retrieveUserByLogin(/* login:String */){
  /* sessionStorage.setItem("username",login); */
  return this.userService.getUserByLogin();
}

/* updateUser() {
  this.userService.updateUser( this.u)
    .subscribe(data => {
      console.log(data);
      this.u = new User();
      this.gotoList();
    }, error => console.log(error));
}
gotoList() {
  this.router.navigate(['/User Profile']);
} */

}
