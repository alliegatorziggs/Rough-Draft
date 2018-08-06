import {UserModel} from "../user/user";

export module ProjectModel {
    export class Project {
        id: number;
        projectName: string;
        author: UserModel.User;

        setId (id: number) {
            this.id = id;
        }
        setProjectName (projectName: string, author: UserModel.User) {
            this.projectName = projectName;
        }
        setAuthor(author: UserModel.User) {
            this.author = author;
        }
        getId(): number {
            return this.id;
        }
        getProjectName(): string {
            return this.projectName;
        }
        getAuthor(): UserModel.User {
            return this.author;
        }
    }
}