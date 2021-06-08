import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Search } from 'src/model/Search';
import { SearchService } from '../service/search.service';

@Component({
  selector: 'app-details-search',
  templateUrl: './details-search.component.html',
  styleUrls: ['./details-search.component.css']
})
export class DetailsSearchComponent implements OnInit {

  id: number;
  search: Search;

  constructor(private route: ActivatedRoute, private router : Router , private searchServ : SearchService) { }

  ngOnInit() {
    this.search =  new Search();
    this.id = this.route.snapshot.params.id;

    this.searchServ.getSearch(this.id).subscribe(data => {
      this.search = data;

    }, error => console.log(error));
        
  }

  goToList(){
    this.router.navigateByUrl('searchs');
  }

}
