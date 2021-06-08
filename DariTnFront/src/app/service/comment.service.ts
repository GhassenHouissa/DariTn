import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Comment } from 'src/model/Comment';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CommentService {

  urlretrieveComment ="http://localhost:8082/DARITN/servlet/retrieve-all-comment";

  constructor(private httpComment: HttpClient) { }

  getAllComments(): Observable<Comment[]>{
    return this.httpComment.get<Comment[]>(this.urlretrieveComment) ;
    }

    addComment(id: number , id1: number , comment: Comment ): Observable<any>{
      return this.httpComment.post("http://localhost:8082/DARITN/servlet/addComment/"+ 7+"/"+ 4, comment) ;
    }

    deleteCommentById(id:number, id2: number){
      return this.httpComment.delete("http://localhost:8082/DARITN/servlet/remove-comment/"+id+"/"+7) ;
    }

    updateComment(value: any): Observable<any> {

      return this.httpComment.put("http://localhost:8082/DARITN/servlet/modify-comment", value);

    }

    getComment(id:number):Observable<any> {
      return this.httpComment.get("http://localhost:8082/DARITN/servlet/retrieve-comment/"+id);
    }
}
