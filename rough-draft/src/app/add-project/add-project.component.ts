import { Component, OnInit, Input } from '@angular/core';
import { ProjectService } from '../shared/project/project.service';
import { ProjectModel } from '../shared/project/project';
import { UserService } from '../shared';
import { UserModel } from '../shared/user/user';

@Component({
  selector: 'app-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.css'],
  providers: [ProjectService, UserService]
})
export class AddProjectComponent implements OnInit {
  
  @Input() user: UserModel.User;
  constructor(private projectService: ProjectService, private userService: UserService) { }
  
  ngOnInit() {
  }

  success: boolean = false;
  error: String;

  createProject() {
    var title: string = (<HTMLInputElement>document.getElementById("title")).value;
    var project: ProjectModel.Project = new ProjectModel.Project();
    project.setProjectName(title, this.userService.currentUser);
    project.setAuthor(this.user);
    this.projectService.addProject(project).subscribe(
      data =>
        this.success = true,
        error => this.error = "Ehhh, that didn't quite work"
    )
    location.reload();
  }


}
