import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Ads } from 'src/model/Ads';

@Injectable({
  providedIn: 'root'
})
export class RechercheService {

  urlretrieverecher = "http://localhost:8082/DARITN/servlet/show-all-ads";
  urlLocationComposition ="http://localhost:8082/DARITN/servlet/loc";
  urlUpload ="http://localhost:8082/DARITN/servlet/uploadfile";
  urlReduction = "http://localhost:8082/DARITN/servlet/reduction/";
  urlContent ="http://localhost:8082/DARITN/servlet/con";
  urlloc="http://localhost:8082/DARITN/servlet/locationn";
  urlachat= "http://localhost:8082/DARITN/servlet/achat";

  constructor(private recherhttp : HttpClient) { }

  getAllAds(): Observable<Ads[]>{
    return this.recherhttp.get<Ads[]>(this.urlretrieverecher) ;
    }

    public getprod(location: string | undefined, composition: string | undefined ): Observable<any>{
      return this.recherhttp.get(`${this.urlLocationComposition}/${location}`);
    }

   public upload (formData){
     console.log("upload service function is called")
     console.log(formData)
     return this.recherhttp.post<FormData>(this.urlUpload, formData , {
       reportProgress: true ,
       observe: 'events'
     });
   }


   public getReduction(reduction: boolean | undefined): Observable<any>{
    return this.recherhttp.get("http://localhost:8082/DARITN/servlet/reduction/"+1);
  }

  public getReductions(reduction: boolean | undefined): Observable<any>{
    return this.recherhttp.get("http://localhost:8082/DARITN/servlet/reductions/"+1);
  }

  public getAugmentation(augmentation: boolean | undefined): Observable<any>{
    return this.recherhttp.get("http://localhost:8082/DARITN/servlet/augmentation/"+1);
  }

  public getAugmentations(augmentation: boolean | undefined): Observable<any>{
    return this.recherhttp.get("http://localhost:8082/DARITN/servlet/augmentations/"+1);
  }


  getAds(id:number):Observable<any> {
    return this.recherhttp.get("http://localhost:8082/DARITN/servlet/retrieve-ads/"+id);
  }

  public getContent(content: string | undefined): Observable<any>{
    return this.recherhttp.get(`${this.urlContent}/${content}`);
  } 

  getloc(): Observable<number>{
    return this.recherhttp.get<number>(this.urlloc) ;
    }

    getachat(): Observable<number>{
      return this.recherhttp.get<number>(this.urlachat) ;
      }

      getprice1(): Observable<number>{
        return this.recherhttp.get<number>("http://localhost:8082/DARITN/servlet/price") ;
        }

        getprice2(): Observable<number>{
          return this.recherhttp.get<number>("http://localhost:8082/DARITN/servlet/pricee") ;
          }
  
          getprice3(): Observable<number>{
            return this.recherhttp.get<number>("http://localhost:8082/DARITN/servlet/pric") ;
            }

            getprice4(): Observable<number>{
              return this.recherhttp.get<number>("http://localhost:8082/DARITN/servlet/pri") ;
              }
      
    
}
