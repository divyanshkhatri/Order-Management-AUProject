import { Component, OnInit, ViewChild, AfterViewInit } from '@angular/core';
import {MatDialog, MatDialogConfig, MatDialogRef, } from '@angular/material/dialog';
import {MatTableDataSource} from '@angular/material/table';
import {MatPaginator} from '@angular/material/paginator';
import { Router } from '@angular/router';
import {AddcustomersComponent} from '../addcustomers/addcustomers.component';
import { HttpClient } from '@angular/common/http';
import {merge, Observable, of as observableOf} from 'rxjs';
import {catchError, map, startWith, switchMap, take} from 'rxjs/operators';
import { MatSort } from '@angular/material/sort';

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrls: ['./customers.component.css']
})
export class CustomersComponent implements OnInit {

  displayedColumns: string[] = ['id', 'name', 'email', 'phone'];
  dataSource = new MatTableDataSource<Customer>();


  // @ViewChild(MatPaginator) paginator: MatPaginator;

  constructor(private router: Router, private dialog: MatDialog, private http: HttpClient) {
  }

  getRepoIssues(offset: number, limit: number) {

    const requestUrl =
        `http://localhost:8080/getcustomers?limit=${limit}&offset=${offset}`;

    return this.http.get<Customer[]>(requestUrl);
  }

  data: Customer[] = [];

  resultsLength = 0;
  isLoadingResults = true;
  isRateLimitReached = false;

  @ViewChild(MatPaginator, { static: true })
  paginator!: MatPaginator;

  @ViewChild(MatSort, { static: true })
  sort!: MatSort;

  fetchData() {
    console.log("next page", this.paginator.pageIndex, this.paginator.pageSize);
    // this.paginator.pageIndex = 2;
    this.getRepoIssues(this.paginator.pageSize*(this.paginator.pageIndex), this.paginator.pageSize).subscribe((data) => {
      this.dataSource.data = data;
    });
  }

  ngOnInit() {
    this.paginator.pageSize = 5;
    this.paginator.length = 100;
    this.getRepoIssues(0, 5).pipe(take(1)).subscribe((data) => {
      this.dataSource.data = data;
    });

      // this.dataSource.paginator = this.paginator;
      // this.dataSource.sort = this.sort;

  }

  openDialog() {
    const dialogConfig = new MatDialogConfig();

    dialogConfig.disableClose = false;
    dialogConfig.autoFocus = true;
    dialogConfig.height = '500px';
    dialogConfig.width = '400px';
    dialogConfig.hasBackdrop = true;

    this.dialog.open(AddcustomersComponent, dialogConfig);
  }

}


export interface Customer {

  customerId: number,
  customerName: String,
  customerEmail: String,
  customerPhone: String,
  customerAddress: String,
  customerPincode: String,

}
