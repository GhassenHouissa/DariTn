import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Comment } from 'src/model/Comment';
import { CommentService } from '../service/comment.service';

@Component({
  selector: 'app-blog-single',
  templateUrl: './blog-single.component.html',
  styleUrls: ['./blog-single.component.css']
})
export class BlogSingleComponent implements OnInit {

  id: number;
  id1: number;
  ListComments : Comment[] ; 
  comment : Comment = new Comment() ;

  constructor(private servComment: CommentService , private router: Router) { }

  ngOnInit(): void {
    this.servComment.getAllComments().subscribe(res=>{console.log(res);
      this.ListComments=res}) ;
  }

  addcomment(){
    this.servComment.addComment(this.id, this.id1, this.comment).subscribe(()=>this.servComment.getAllComments().subscribe(data=>{this.ListComments=data}));
    this.router.navigateByUrl('Blog-Single');
  }

  deleteComment(id:number , id2: number){
    this.servComment.deleteCommentById(id , id2).subscribe(()=>this.servComment.getAllComments().subscribe(data=>{this.ListComments=data}));
  }

  updateComment(id: number){
    this.router.navigate(['updateComment',id]);
  }


}
