import { Injectable } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';
import { ProjectModel } from './project';
import { UserModel } from '../user/user';


@Injectable()
export class ProjectService {
  constructor(private http: Http) { }
  //private allProjectsUrl = 'http://localhost:8080/projects/all';
  private addProjectUrl = 'http://localhost:8080/projects/add';
  private getProjectsUrl = 'http://localhost:8080/projects/projectlist';
  private deleteProjectUrl = 'http://localhost:8080/projects/delete'

//   getAll(): Observable<any> {
//     return this.http.get(this.allProjectsUrl);
//   }

  addProject(project: ProjectModel.Project): Observable<any> {
    console.log(project.getProjectName());
    return this.http.post(this.addProjectUrl, project);
  }

  // getProjectsForUser(userId: number) {
  //   return this.http.get(this.getProjectsUrl + userId);
  // }

  getProjectsForUser(user: UserModel.User): Observable<any> {
    return this.http.post(this.getProjectsUrl, user);
  }

  deleteProject(project: ProjectModel.Project): Observable<any> {
    return this.http.post(this.deleteProjectUrl, project);
  }
}