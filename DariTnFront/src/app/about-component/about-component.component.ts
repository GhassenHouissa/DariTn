import { Component, OnInit } from '@angular/core';
import { Router, Routes } from '@angular/router';

@Component({
  selector: 'app-about-component',
  templateUrl: './about-component.component.html',
  styleUrls: ['./about-component.component.css']
})
export class AboutComponentComponent implements OnInit {

  constructor(private _router: Router) { }

  ngOnInit(): void {
  }
  aboutAgent(){
   
    this._router.navigateByUrl("/about");
  }

}
