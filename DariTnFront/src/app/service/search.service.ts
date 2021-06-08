import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Search } from 'src/model/Search';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SearchService {

  urlretrievesearch = "http://localhost:8082/DARITN/servlet/retrieve-all-search" ;
  
 urldeletesearch = "http://localhost:8082/DARITN/servlet/remove-search/";
 urlgetById ="http://localhost:8082/DARITN/servlet";
 urlupdate = "http://localhost:8082/DARITN/servlet/modify-search";


  constructor(private searchhttp : HttpClient) { }

  getAllSearchs(): Observable<Search[]>{
    return this.searchhttp.get<Search[]>(this.urlretrievesearch) ;
    }

    deleteSearchById(id:number, id2: number){
      return this.searchhttp.delete("http://localhost:8082/DARITN/servlet/remove-search/"+id+"/"+4) ;
    }
    

    addSearch(id: String , search:Search ): Observable<any>{
      return this.searchhttp.post("http://localhost:8082/DARITN/servlet/addSearch/"+ 4, search) ;
    }
    
    getSearch(id:number):Observable<any> {
      return this.searchhttp.get("http://localhost:8082/DARITN/servlet/retrieve-search/"+id);
    }

    updateSearch(value: any): Observable<any> {

      return this.searchhttp.put("http://localhost:8082/DARITN/servlet/modify-search", value);

    }
}
