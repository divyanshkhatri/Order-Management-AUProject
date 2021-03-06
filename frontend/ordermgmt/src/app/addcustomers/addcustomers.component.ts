import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { CustomerServiceService } from '../Services/CustomerService/customer-service.service';

@Component({
  selector: 'app-addcustomers',
  templateUrl: './addcustomers.component.html',
  styleUrls: ['./addcustomers.component.css']
})
export class AddcustomersComponent implements OnInit {

  constructor(private customerService : CustomerServiceService) { }

  ngOnInit(): void {
  }

  custForm = new FormGroup({

    customerId: new FormControl('',[Validators.required]),
    customerName: new FormControl('',[Validators.required]),
    customerEmail : new FormControl('',[Validators.required]),
    customerPhone : new FormControl('',[Validators.required]),
    customerAddress : new FormControl('',[Validators.required]),
    customerPincode: new FormControl('', [Validators.required])
  });

  addCustomer() {
    this.customerService.addCustomer(this.custForm.value);
  }
}


// getCustomer() {
//   this.http.get<>("http://localhost:8080/getcustomers").subscribe((data) => {
//     console.log(data);
//   })

// }