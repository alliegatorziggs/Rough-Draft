import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { ProjectService } from '../shared/project/project.service';
import { ProjectModel } from '../shared/project/project';
import { UserModel } from '../shared/user/user';
import { HomePageComponent } from '../home-page/home-page.component';
import { UserService } from '../shared';

@Component({
  selector: 'app-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.css'],
  providers: [ProjectService, UserService]
})
export class ProjectListComponent implements OnInit {

  @Input() projects: ProjectModel.Project[];
  @Output() projectSelected: EventEmitter<ProjectModel.Project> = new EventEmitter<ProjectModel.Project>();
  constructor(private projectService: ProjectService, private userService: UserService) { }

  //project: ProjectModel.Project;

  ngOnInit() {
  
  }

  selectProject(p: ProjectModel.Project) {
    console.log(p.projectName);
    //this.project = p;
    this.projectSelected.emit(p);
  }

}
