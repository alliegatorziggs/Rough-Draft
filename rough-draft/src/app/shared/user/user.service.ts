import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';
import { UserModel } from './user';


@Injectable()
export class UserService {
  constructor(private http: Http) { }
  private allUsersUrl = 'http://localhost:8080/users/all';
  private addUserUrl = 'http://localhost:8080/users/add';
  private loginUrl = 'http://localhost:8080/users/login';

  currentUser: UserModel.User;


  getAll(): Observable<any> {
    return this.http.get(this.allUsersUrl);
  }

  addUser(user: UserModel.User): Observable<any> {
    console.log(user.getUserName);
    return this.http.post(this.addUserUrl, user);
  }

  getCurrentUser(): UserModel.User {
    return this.currentUser;
  }

  login(user: UserModel.User): Observable<any> {
    console.log(user.getUserName());
    return this.http.put(this.loginUrl, user);
  }

}
