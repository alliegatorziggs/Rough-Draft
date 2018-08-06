import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatDialogModule } from '@angular/material';


import { AppComponent } from './app.component';
import { UserListComponent } from './user-list/user-list.component';
import {  HttpModule } from '@angular/http';
import { AddUserComponent } from './add-user/add-user.component';
import { LoginComponent } from './login/login.component';
import { ProjectListComponent } from './project-list/project-list.component';
import { HomePageComponent } from './home-page/home-page.component';
import { AddProjectComponent } from './add-project/add-project.component';
import { ProjectPanelComponent } from './project-panel/project-panel.component';
import { AddFileComponent } from './add-file/add-file.component';

@NgModule({
  declarations: [
    AppComponent,
    UserListComponent,
    AddUserComponent,
    LoginComponent,
    ProjectListComponent,
    HomePageComponent,
    AddProjectComponent,
    ProjectPanelComponent,
    AddFileComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    CommonModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
