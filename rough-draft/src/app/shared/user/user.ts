import { ProjectModel } from '../project/project';


export module UserModel {
    export class User {
        id: number;
        userName: string;
        pwd: string;
        projects: ProjectModel.Project[];

        constructor(userName: string, pwd: string) {
            this.userName = userName;
            this.pwd = pwd;
        }

        setId (id: number) {
            this.id = id;
        }
        setUserName (userName: string) {
            this.userName = userName;
        }
        setPassword(password: string) {
            this.pwd = password;
        }
        setProjects(projects: ProjectModel.Project[]) {
            this.projects = projects;
        }
        getId(): number {
            return this.id;
        }
        getUserName(): string {
            return this.userName;
        }
        getProjects(): ProjectModel.Project[] {
            return this.projects;
        }
        toString(): string {
            return "id: " + this.id + "userName: " + this.userName + "pwd: " + this.pwd + "projects: " + this.projects;
        }
    }
}