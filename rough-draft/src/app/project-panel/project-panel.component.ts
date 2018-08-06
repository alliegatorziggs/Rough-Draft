import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { UserModel } from '../shared/user/user';
import { ProjectModel } from '../shared/project/project';
import { ProjectService } from '../shared/project/project.service';

@Component({
  selector: 'app-project-panel',
  templateUrl: './project-panel.component.html',
  styleUrls: ['./project-panel.component.css'],
  providers: [ProjectService]
})
export class ProjectPanelComponent implements OnInit {

  @Input() project: ProjectModel.Project;
  constructor(private projectService: ProjectService) { }

  addFileDialog: boolean = false;


  ngOnInit() {
  }

  addFile() {
    this.addFileDialog = true;
  }

  deleteProject() {
    if (confirm("Do you really want to delete?")) {
      this.projectService.deleteProject(this.project).subscribe( 
        data => console.log(data), 
        error => console.log(error)
    );
      location.reload();
    }
  }
}
