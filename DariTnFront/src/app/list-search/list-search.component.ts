import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Search } from 'src/model/Search';
import { SearchService } from '../service/search.service';

@Component({
  selector: 'app-list-search',
  templateUrl: './list-search.component.html',
  styleUrls: ['./list-search.component.css']
})
export class ListSearchComponent implements OnInit {


  id: String;
  ListSearchs : Search[] ; 
  search : Search = new Search() ;


  constructor(private servSearch: SearchService , private router: Router) { }

  ngOnInit() {
    this.servSearch.getAllSearchs().subscribe(res=>{console.log(res);
      this.ListSearchs=res}) ;
  }

  deleteSearch(id:number , id2: number){
    this.servSearch.deleteSearchById(id , id2).subscribe(()=>this.servSearch.getAllSearchs().subscribe(data=>{this.ListSearchs=data}));
  }

  addSearch(){
    this.servSearch.addSearch(this.id , this.search).subscribe(()=>this.servSearch.getAllSearchs().subscribe(data=>{this.ListSearchs=data}));
  }

  updateSearch(id: number){
    this.router.navigate(['update',id]);
  }

  searchDetails(id: number){
    this.router.navigate(['details',id]);

  }

}
