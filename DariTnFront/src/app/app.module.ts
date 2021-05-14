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
import { ListePropertyComponent } from './liste-property/liste-property.component';
import { DetailsListePropertyComponent } from './details-liste-property/details-liste-property.component';
import { PagingComponent } from './paging/paging.component';
import { BouttonActionComponent } from './boutton-action/boutton-action.component';
import { NewPropertyComponent } from './new-property/new-property.component';
import { Details2Component } from './details2/details2.component';
import { Details3Component } from './details3/details3.component';
/* test */
import { LayoutModule } from '@progress/kendo-angular-layout';
import { LabelModule } from '@progress/kendo-angular-label';
import { InputsModule } from '@progress/kendo-angular-inputs';
import { UploadsModule, UploadModule } from '@progress/kendo-angular-upload';
import { DropDownsModule } from '@progress/kendo-angular-dropdowns';
import { DateInputsModule } from '@progress/kendo-angular-dateinputs';

import { UploadInterceptor } from '../app/services/upload-interceptor';

import { ButtonsModule } from '@progress/kendo-angular-buttons';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ToolBarModule } from '@progress/kendo-angular-toolbar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { UpdateAdsComponent } from './update-ads/update-ads.component';



/* /test */


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
    ListePropertyComponent,
    DetailsListePropertyComponent,
    PagingComponent,
    BouttonActionComponent,
    NewPropertyComponent,
    Details2Component,
    Details3Component,
    UpdateAdsComponent, 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    LayoutModule,
    InputsModule,
    LabelModule,
    UploadsModule,
    DropDownsModule,
    DateInputsModule,
    ButtonsModule,
    ToolBarModule,
    UploadModule
  ],
  providers: [
    {
      provide: HTTP_INTERCEPTORS,
      useClass: UploadInterceptor,
      multi: true
    }  ],
  bootstrap: [AppComponent],
})
export class AppModule { }
