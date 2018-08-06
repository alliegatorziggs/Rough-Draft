import { Component, OnInit } from '@angular/core';
import { UserService } from '../shared';
import { UserModel } from '../shared/user/user';


@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css'],
  providers: [UserService]
})
export class AddUserComponent {

  error: string;

  constructor(private userService: UserService) { }
  
  user: UserModel.User;
  
  addUser() {
    var userName: string = (<HTMLInputElement>document.getElementById("username")).value;
    var password: string = (<HTMLInputElement>document.getElementById("password")).value;
    var user: UserModel.User = new UserModel.User("", "");
    user.setUserName(userName);
    user.setPassword(password);
    this.userService.addUser(user).subscribe(
      data =>
        this.user = data,
        error => this.error = "Username taken. Please choose again."
    )
  }

}
