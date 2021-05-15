import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SearchComponentComponent } from './search-component/search-component.component';
import { NavbarComponentComponent } from './navbar-component/navbar-component.component';
import { IntroComponentComponent } from './intro-component/intro-component.component';
import { ServiceComponentComponent } from './service-component/service-component.component';
import { LatestPropertiesComponentComponent } from './latest-properties-component/latest-properties-component.component';
import { AgentComponentComponent } from './agent-component/agent-component.component';
import { LatestNewsComponentComponent } from './latest-news-component/latest-news-component.component';
import { TestimonialsComponentComponent } from './testimonials-component/testimonials-component.component';
import { FooterComponentComponent } from './footer-component/footer-component.component';
import { HttpClientModule } from '@angular/common/http';
import { PropertyGridComponent } from './property-grid/property-grid.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ErrorComponent } from './error/error.component';
import { BlogGrigComponent } from './blog-grig/blog-grig.component';
import { PropertySingleComponent } from './property-single/property-single.component';
import { BlogSingleComponent } from './blog-single/blog-single.component';
import { AgentSingleComponent } from './agent-single/agent-single.component';
import { AgentGridComponent } from './agent-grid/agent-grid.component';
import { ContactComponent } from './contact/contact.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { SignUpComponent } from './sign-up/sign-up.component';
import { FormsModule } from '@angular/forms';
import { DashboardComponent } from './dashboard/dashboard.component';
import {MatTooltipModule} from '@angular/material/tooltip';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { UserProfileComponent } from './user-profile/user-profile.component';
import {MatFormFieldModule} from '@angular/material/form-field'; 
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import { MatRippleModule } from '@angular/material/core';
import { authInterceptorProviders } from './_helpers/auth.interceptor';

 import { UpdateUserComponent } from './update-user/update-user.component'; 
 




@NgModule({  
  declarations: [
    AppComponent,
    SearchComponentComponent,
    NavbarComponentComponent,
    IntroComponentComponent,
    ServiceComponentComponent,
    LatestPropertiesComponentComponent,
    AgentComponentComponent,
    LatestNewsComponentComponent,
    TestimonialsComponentComponent,
    FooterComponentComponent,
    PropertyGridComponent,
    HomeComponent,
    AboutComponent,
    ErrorComponent,
    BlogGrigComponent,
    PropertySingleComponent,
    BlogSingleComponent,
    AgentSingleComponent,
    AgentGridComponent,
    ContactComponent,
    SignInComponent,
    SignUpComponent,
    DashboardComponent,
    UserProfileComponent,
    
     UpdateUserComponent ,
    
    
    

    
    

    
  ],

  exports: [
    MatButtonModule,
    MatFormFieldModule,
    MatInputModule,
    MatRippleModule
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    MatTooltipModule,
    BrowserAnimationsModule,
    BrowserModule,
    MatFormFieldModule, 
    MatButtonModule,
    MatInputModule,
    MatRippleModule,
     
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
