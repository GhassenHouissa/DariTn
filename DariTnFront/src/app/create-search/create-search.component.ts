import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Search } from 'src/model/Search';
import { SearchService } from '../service/search.service';

@Component({
  selector: 'app-create-search',
  templateUrl: './create-search.component.html',
  styleUrls: ['./create-search.component.css']
})
export class CreateSearchComponent implements OnInit {

  id: String;
  ListSearchs : Search[] ; 
  search : Search = new Search() ;

  constructor(private servSearch: SearchService , private router:Router) { }

  ngOnInit(): void {
  }

  addsearch(){ 
    this.servSearch.addSearch(this.id ,this.search).subscribe(()=>this.router.navigateByUrl("searchs")); 
    this.router.navigateByUrl('searchs');
    } 

}
