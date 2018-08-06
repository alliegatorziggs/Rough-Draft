import { Component } from '@angular/core';
import { UserService } from './shared/user/user.service'
import { Router } from '../../node_modules/@angular/router';
import { ProjectModel } from './shared/project/project';
import { OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'Rough Draft';

  project1Name: string = "This is a book title";

  constructor() {
    
  }

  ngOnInit() {
  }
  //this.projects[0] = new ProjectModel.Project();
    // this.projects[0].setId(1);
    // this.projects[0].setProjectName("This is a book");
    // this.projects[0].setUserId(1);


  

}
