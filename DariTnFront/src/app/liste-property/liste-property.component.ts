import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Ads } from 'src/modelAds/ads';
import { AdsService } from '../services/ads.service';

@Component({
  selector: 'app-liste-property',
  templateUrl: './liste-property.component.html',
  styleUrls: ['./liste-property.component.css']
})
export class ListePropertyComponent implements OnInit {

 /* test */
 adss: Observable<Ads[]>;
 
 /* /test */



/*   listArticle: Array<ArticleDto> = [];
 */ /*  errorMsg = ''; */

  constructor(
    private adsService:AdsService,
     private router: Router,
 /*     private articleService: ArticleService
 */  ) { }

  ngOnInit(): void {
/*     this.findListArticle();
 */
this.reloadData();  
}


reloadData() {
  this.adss = this.adsService.getAllAds();
}


deleteAds(id: number) {
  this.adsService.deleteAds(id)
    .subscribe(
      data => {
        console.log(data);
        this.reloadData();
      },
      error => console.log(error));
}

updateAds(id: number){
  this.router.navigate(['update', id]);
}

/*   findListArticle(): void {
    this.articleService.findAllArticles()
    .subscribe(articles => {
      this.listArticle = articles;
    });
  }
*/
/*   nouvelArticle(): void {
    this.router.navigate(['new-property']);
  } */
/*
  handleSuppression(event: any): void {
    if (event === 'success') {
      this.findListArticle();
    } else {
      this.errorMsg = event;
    }
  } */
}
