import { Component, OnInit, Input, Output } from '@angular/core';
import { ProjectModel } from '../shared/project/project';

@Component({
  selector: 'app-add-file',
  templateUrl: './add-file.component.html',
  styleUrls: ['./add-file.component.css']
})
export class AddFileComponent implements OnInit {

  @Input() project: ProjectModel.Project;
  constructor() { }

  ngOnInit() {
  }

  addFile() {
    
  }
}
