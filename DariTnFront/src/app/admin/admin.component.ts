import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ads } from 'src/model/Ads';
import { Comment } from 'src/model/Comment';
import { CommentService } from '../service/comment.service';
import { RechercheService } from '../service/recherche.service';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  ListComment: Comment[] ;
  id: number;
  id1: number;
  comment : Comment = new Comment() ;

  ListAds : Ads[] ;
  ads : Ads = new Ads() ;

  reduction: boolean;
  augmentation: boolean;

  constructor(private serComment: CommentService , private router: Router , private route: ActivatedRoute , private servRech: RechercheService  ) { }

  ngOnInit(): void {
    this.serComment.getAllComments().subscribe(res=>{console.log(res);
      this.ListComment=res}) ;


      this.servRech.getReduction(this.reduction).subscribe(res=>{console.log(res);
        this.ListAds=res}) ;

        this.servRech.getAugmentation(this.augmentation).subscribe(res=>{console.log(res);
          this.ListAds=res}) ;
  }

  
  deleteComments(id:number , id2: number){
    this.serComment.deleteCommentById(id , id2).subscribe(()=>this.serComment.getAllComments().subscribe(data=>{this.ListComment=data}));
  }

  addcomments(){
    this.router.navigate(['Blog-Single']);
  }



  public findReduction(){
    const res = this.servRech.getReduction(this.reduction);
    res.subscribe((data) => {
      this.ListAds = data;
      console.log(this.ListAds);  });
  }
  
  public findAugmentation(){
    const resps = this.servRech.getAugmentation(this.augmentation);
    resps.subscribe((data) => {
      this.ListAds = data;
      console.log(this.ListAds);  });
  }

}
