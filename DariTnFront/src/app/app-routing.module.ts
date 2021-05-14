import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AgentGridComponent } from './agent-grid/agent-grid.component';
import { AgentSingleComponent } from './agent-single/agent-single.component';
import { BlogGrigComponent } from './blog-grig/blog-grig.component';
import { BlogSingleComponent } from './blog-single/blog-single.component';
import { ContactComponent } from './contact/contact.component';
import { ErrorComponent } from './error/error.component';
import { HomeComponent } from './home/home.component';
import { ListePropertyComponent } from './liste-property/liste-property.component';
import { NewPropertyComponent } from './new-property/new-property.component';
import { PropertyGridComponent } from './property-grid/property-grid.component';
import { PropertySingleComponent } from './property-single/property-single.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { UpdateAdsComponent } from './update-ads/update-ads.component';
 
const routes: Routes = [
  { path :'',redirectTo:'home',pathMatch:'full'},
  { path :'blog', component: BlogGrigComponent},
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

/*  { path : '**', component: ErrorComponent}
 */
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
