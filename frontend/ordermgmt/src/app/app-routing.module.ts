import { AddsuppliersComponent } from './addsuppliers/addsuppliers.component';
import { AddcustomersComponent } from './addcustomers/addcustomers.component';
import { SuppliersComponent } from './suppliers/suppliers.component';
import { CustomersComponent } from './customers/customers.component';

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { OrdersComponent } from './orders/orders.component';

const routes: Routes = [

  {
    path:'customers', component:CustomersComponent},
    {path: 'orders', component: OrdersComponent},
    {path : 'suppliers', component: SuppliersComponent},
    {path : 'addcustomers', component: AddcustomersComponent},
    {
      path : 'addsuppliers', component:AddsuppliersComponent
    }
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
