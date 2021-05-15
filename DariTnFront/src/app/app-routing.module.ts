import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AgentGridComponent } from './agent-grid/agent-grid.component';
import { AgentSingleComponent } from './agent-single/agent-single.component';
import { AuthorizeAdminServiceService } from './authorize-admin-service.service';
import { BankComponent } from './bank/bank.component';
import { BlogSingleComponent } from './blog-single/blog-single.component';

import { ClaimsComponent } from './claims/claims.component';
import { ContactComponent } from './contact/contact.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { ListePropertyComponent } from './liste-property/liste-property.component';
import { NewPropertyComponent } from './new-property/new-property.component';
import { PropertyGridComponent } from './property-grid/property-grid.component';
import { PropertySingleComponent } from './property-single/property-single.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { UpdateAdsComponent } from './update-ads/update-ads.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { UserProfileComponent } from './user-profile/user-profile.component';
 
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
 { path :'new-property', component: NewPropertyComponent},
 { path :'my-list-property', component: ListePropertyComponent},
 { path :'update/:id', component: UpdateAdsComponent},
 { path : 'Sign In', component : SignInComponent},
 { path : 'Sign Up', component : SignUpComponent},
 { path : 'Claims', component : ClaimsComponent},
 { path : 'Dashboard' , component : DashboardComponent,canActivate:[AuthorizeAdminServiceService]},
 { path : 'User Profile' , component : UserProfileComponent},
 { path : 'updateUser' , component : UserProfileComponent}
 



 

/*  { path : '**', component: ErrorComponent}
 */
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
