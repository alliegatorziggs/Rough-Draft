import { Component, OnInit, EventEmitter } from '@angular/core';
import { UserService } from '../shared';
import { UserModel } from '../shared/user/user';
import { ProjectModel } from '../shared/project/project';
import { ProjectService } from '../shared/project/project.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css'],
  providers: [UserService, ProjectService]
})
export class HomePageComponent implements OnInit {

  constructor(private userService: UserService, private projectService: ProjectService) { }

  user: UserModel.User;
  addNewProject: boolean = false;
  projectPanel: boolean = false;
  projects: ProjectModel.Project[];
  currProject: ProjectModel.Project;

  ngOnInit() {
    this.userService.login(new UserModel.User("BillThePony", "MoriaIsNoPlaceForAPony")).subscribe(
      data => {
        this.user = data.json() as UserModel.User;
        console.log(data.json());
        console.log(this.user.id);
        this.projectService.getProjectsForUser(this.user).subscribe (
         data => this.projects = data.json() as ProjectModel.Project[],
         error => console.log(error) 
        )
      },
        error => console.log(error)
    )
  }

  showAddNewProject() {  
    this.addNewProject = true;
    this.projectPanel = false;
  }

  showProjectPanel(event) {
    console.log(event);
    this.currProject = event;
    this.projectPanel = true;
    this.addNewProject = false;
  }


}
