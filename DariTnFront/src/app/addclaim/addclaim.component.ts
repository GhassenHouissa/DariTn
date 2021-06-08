import { Component, OnInit } from '@angular/core';
import { Claims } from '../model/Claims';
import { ClaimsService} from '../sevices/claims.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addclaim',
  templateUrl: './addclaim.component.html',
  styleUrls: ['./addclaim.component.css']
})
export class AddclaimComponent implements OnInit {

  claim : Claims = new Claims;

  constructor(private cs:ClaimsService, private claimrouter:Router) { }

  ngOnInit(): void {
  }

  addClaim(){this.cs.addClaim(this.claim).subscribe(()=>this.claimrouter.navigateByUrl("/AddClaims"));
    }
  
}
