import { Component, OnInit } from '@angular/core';
import { UserService } from '../shared';
import { UserModel } from '../shared/user/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [UserService]
})
export class LoginComponent {

  error: string;
  welcomeMessage: string;

  constructor(private userService: UserService) { }
  
  user: UserModel.User;
  
  login() {
    var userName: string = (<HTMLInputElement>document.getElementById("login_username")).value;
    var password: string = (<HTMLInputElement>document.getElementById("login_password")).value;
    var user: UserModel.User = new UserModel.User(userName, password);
    // user.setUserName(userName);
    // user.setPassword(password);
    this.userService.login(user).subscribe(
      data =>
        this.user = data,
        error => this.error = "Login Failed."
    )
    if (this.user != null) {
      this.welcomeMessage = "Welcome, " + this.user.getUserName() + "!";
    }
  }

  setWelcomeMessage() {
    if (this.user != null) {
      "Welcome, " + this.user.getUserName() + "!";
    }
  }
}
