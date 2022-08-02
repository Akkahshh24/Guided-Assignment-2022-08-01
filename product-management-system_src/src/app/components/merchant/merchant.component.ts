import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-merchant',
  templateUrl: './merchant.component.html',
  styleUrls: ['./merchant.component.css']
})
export class MerchantComponent implements OnInit {

  constructor(
    public router:Router
  ) { }

  ngOnInit(): void {
  }

  addProduct(){
    this.router.navigateByUrl("/addProduct");
  }

  addCategory(){
    this.router.navigateByUrl("/addCategory")
  }

}
