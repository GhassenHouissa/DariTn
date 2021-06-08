import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AdminComponent } from './admin/admin.component';
import { AgentGridComponent } from './agent-grid/agent-grid.component';
import { AgentSingleComponent } from './agent-single/agent-single.component';
import { BankComponent } from './bank/bank.component';
import { BlogSingleComponent } from './blog-single/blog-single.component';
import { CharttComponent } from './chart/chart.component';
import { ClaimsComponent } from './claims/claims.component';
import { ContactComponent } from './contact/contact.component';
import { CreateSearchComponent } from './create-search/create-search.component';
import { DetailsSearchComponent } from './details-search/details-search.component';
import { EditCommentComponent } from './edit-comment/edit-comment.component';
import { EditSearchComponent } from './edit-search/edit-search.component';
import { EmailComponent } from './email/email.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { ListSearchComponent } from './list-search/list-search.component';
import { PropertyGridComponent } from './property-grid/property-grid.component';
import { PropertySingleComponent } from './property-single/property-single.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { StatComponent } from './stat/stat.component';
 
const routes: Routes = [
  
  { path :'',redirectTo:'home',pathMatch:'full'},

  { path :'searchs', component: ListSearchComponent},
  { path :'addsearch', component: CreateSearchComponent},
  { path :'update/:id', component: EditSearchComponent},
  { path :'details/:id', component: DetailsSearchComponent},
  { path :'updateComment/:id', component: EditCommentComponent},
  { path :'mailing', component: EmailComponent},
  { path :'admin' , component: AdminComponent},

  { path :'bank', component: BankComponent},
  { path :'home', component: HomeComponent},
  { path :'property', component: PropertyGridComponent},
  { path :'about', component: AboutComponent},

 { path :'Property-Single', component: PropertySingleComponent},
 { path :'Blog-Single', component: BlogSingleComponent},
 { path :'Agents-Grid', component: AgentGridComponent},
 { path :'Agent-Single', component: AgentSingleComponent},
 { path :'Contact', component: ContactComponent},
 { path :'stat', component: StatComponent},
 { path :'search', component: SearchComponentComponent},
 { path : 'Sign In', component : SignInComponent},
 { path : 'Sign Up', component : SignUpComponent},
 { path : 'Claims', component : ClaimsComponent},
 { path: 'chart', component:CharttComponent}



 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
