import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Comment } from 'src/model/Comment';
import { CommentService } from '../service/comment.service';

@Component({
  selector: 'app-edit-comment',
  templateUrl: './edit-comment.component.html',
  styleUrls: ['./edit-comment.component.css']
})
export class EditCommentComponent implements OnInit {

  id: number;
  comment: Comment;

  constructor(private route: ActivatedRoute, private router : Router , private commentServ : CommentService) { }

  ngOnInit(): void {
    this.comment =  new Comment();
    this.id = this.route.snapshot.params.id;

    this.commentServ.getComment(this.id).subscribe(data => {
      this.comment = data;

    }, error => console.log(error));
  }

  onSubmit(){
    this.commentServ.updateComment(this.comment)
    .subscribe(data => console.log(data), error => console.log(error));
    this.router.navigateByUrl('Blog-Single');
  }

}
