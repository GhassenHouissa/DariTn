import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { EmailTemplate } from 'src/model/EmailTemplate';

@Injectable({
  providedIn: 'root'
})
export class EmailService {

  urlUploadEmail ="http://localhost:8082/DARITN/servlet/attachemail";

  constructor(private emailHttp : HttpClient) { }

  addEmailText(emailtemplate: EmailTemplate): Observable<any>{
    return this.emailHttp.post("http://localhost:8082/DARITN/servlet/textemail", emailtemplate) ;
  }


  public uploadEmail (formData){
    console.log("upload service function is called")
    console.log(formData)
    return this.emailHttp.post<FormData>(this.urlUploadEmail, formData , {
      reportProgress: true ,
      observe: 'events'
    });
  }

}
