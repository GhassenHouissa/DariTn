import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AddclaimComponent } from './addclaim/addclaim.component';
import { AddnotificationComponent } from './addnotification/addnotification.component';
import { AgentGridComponent } from './agent-grid/agent-grid.component';
import { AgentSingleComponent } from './agent-single/agent-single.component';
import { BankComponent } from './bank/bank.component';
import { BlogSingleComponent } from './blog-single/blog-single.component';
import { ClaimsComponent } from './claims/claims.component';
import { ContactComponent } from './contact/contact.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { NotificationComponent } from './notification/notification.component';
import { PropertyGridComponent } from './property-grid/property-grid.component';
import { PropertySingleComponent } from './property-single/property-single.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
 
const routes: Routes = [
  { path :'',redirectTo:'home',pathMatch:'full'},
  { path :'bank', component: BankComponent},
  { path :'home', component: HomeComponent},
  { path :'property', component: PropertyGridComponent},
  { path :'about', component: AboutComponent},

 { path :'Property-Single', component: PropertySingleComponent},
 { path :'Blog-Single', component: BlogSingleComponent},
 { path :'Agents-Grid', component: AgentGridComponent},
 { path :'Agent-Single', component: AgentSingleComponent},
 { path :'Contact', component: ContactComponent},
 { path :'search', component: SearchComponentComponent},
 { path : 'Sign In', component : SignInComponent},
 { path : 'Sign Up', component : SignUpComponent},
 { path : 'Claims', component : ClaimsComponent},
 { path : 'Notification', component : NotificationComponent},
 { path : 'AddClaims', component : AddclaimComponent},
 { path : 'AddNotifications', component : AddnotificationComponent},
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
