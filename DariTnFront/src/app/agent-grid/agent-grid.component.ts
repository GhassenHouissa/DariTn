import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Ads } from 'src/model/Ads';
import { Favorites } from 'src/model/Favorites';
import { FavoritesService } from '../service/favorites.service';
import { RechercheService } from '../service/recherche.service';

@Component({
  selector: 'app-agent-grid',
  templateUrl: './agent-grid.component.html',
  styleUrls: ['./agent-grid.component.css']
})
export class AgentGridComponent implements OnInit {
  @ViewChild("fileUpload" , {static: false}) fileUpload: ElementRef; files = [] ;
  fileName: string ;

  ListAds : Ads[] ;
  ads : Ads = new Ads() ;
  location: string;
  composition : string ;
  reduction: boolean;
  augmentation: boolean;
  id: number;
  id1: number;


  favo: Favorites;
 

  favorites : Favorites = new Favorites() ;

  constructor(private route: ActivatedRoute , private servRech: RechercheService , private router: Router , private servFavorites : FavoritesService ) { }

  ngOnInit(): void {
    this.servRech.getAllAds().subscribe(res=>{console.log(res);
      this.ListAds=res}) ;


      this.favo =  new Favorites();
      this.id = this.route.snapshot.params.id;
  
      this.servRech.getAds(this.id).subscribe(data => {
        this.favo = data;
  
      }, error => console.log(error));
  }

  public findUserByEmailId(){
    const resp = this.servRech.getprod(this.location , this.composition);
    resp.subscribe((data) => {
      this.ListAds = data;
      console.log(this.ListAds);  });
}

public findReduction(){
  const res = this.servRech.getReductions(this.reduction);
  res.subscribe((data) => {
    this.ListAds = data;
    console.log(this.ListAds);  });
}

public findAugmentation(){
  const resps = this.servRech.getAugmentations(this.augmentation);
  resps.subscribe((data) => {
    this.ListAds = data;
    console.log(this.ListAds);  });
}

onClick(){
  const fileUpload = this.fileUpload.nativeElement;fileUpload.onchange = () => {
    for (let index = 0 ; index < fileUpload.files.length; index++)
    {
      const file = fileUpload.files[index];
      this.fileName = file.name +"is uploaded"

      this.files.push({ data: file, inProgress: false, progress: 0});
    }
    this.uploadFiles();
  };
  fileUpload.click();

}

private uploadFiles(){
  this.fileUpload.nativeElement.value= '';
  this.files.forEach(file => {
    this.uploadFile(file);
  });
}

uploadFile(file){
  const formData =  new FormData();
  formData.append('file', file.data);
  file.inProgress = true ;
  this.servRech.upload(formData).subscribe(
    rsp => {
      console.log(rsp.type)
    },
    error => {
      console.log(error)
      
    }
    

  ) ;
}

addfavorites(id: number){
  this.servFavorites.addFavorites(this.id, this.id1, this.favorites).subscribe(()=>this.servRech.getAllAds().subscribe(data=>{this.ListAds=data}));
}

ajoutComments(){
  this.router.navigate(['Blog-Single']);
}

}
