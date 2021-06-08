import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Favorites } from 'src/model/Favorites';

@Injectable({
  providedIn: 'root'
})
export class FavoritesService {

  constructor(private favorishttp : HttpClient) { }

  addFavorites(id: number ,id1: number , favorites: Favorites ): Observable<any>{
    return this.favorishttp.post("http://localhost:8082/DARITN/servlet/addFavorites/"+ 4+"/"+ id, favorites) ;
  }
}
