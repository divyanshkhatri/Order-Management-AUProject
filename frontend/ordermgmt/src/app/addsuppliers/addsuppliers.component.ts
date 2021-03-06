import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-addsuppliers',
  templateUrl: './addsuppliers.component.html',
  styleUrls: ['./addsuppliers.component.css']
})
export class AddsuppliersComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  supplierForm = new FormGroup({
    cid: new FormControl('',[Validators.required]),
    cname: new FormControl('',[Validators.required]),
    email : new FormControl('',[Validators.required]),
    phone : new FormControl('',[Validators.required]),
    address : new FormControl('',[Validators.required])
  });
}
