package com.author.roughdraft.project;

//import com.author.roughdraft.projectfile.ProjectFile;
import com.author.roughdraft.projectfile.ProjectFile;
import com.author.roughdraft.user.User;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany (targetEntity=ProjectFile.class)
    @JoinColumn(name = "project_id")
    private List<ProjectFile> files;

    private String projectName;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private User author;

    public Project() { }

    public Project(String projectName, Long user_id) {
        this.projectName = projectName;
    }

    public Long getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }
    public Long getUserId() {
        return author.getId();
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

}
