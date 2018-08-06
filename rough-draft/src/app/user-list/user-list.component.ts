import { Component, OnInit } from '@angular/core';
import { UserService } from '../shared';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css'],
  providers: [UserService]
})
//export class UserListComponent implements OnInit {
export class UserListComponent {
  users: any[];

  constructor(private userService: UserService) { }

  //ngOnInit() {
  getAllUsers(){
    this.userService.getAll().subscribe(
      data =>
        this.users = data.json() as any[],
        error => console.log(error)
    )
  }

}
