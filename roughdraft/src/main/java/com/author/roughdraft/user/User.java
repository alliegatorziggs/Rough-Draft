package com.author.roughdraft.user;

import com.author.roughdraft.project.Project;

import javax.persistence.*;
import java.util.Iterator;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="user_name")
    private String userName;

    @Column(name="pwd")
    private String pwd;

    @OneToMany(targetEntity=Project.class)
    @JoinColumn(name = "author_id")
    private List<Project> projects;

    public User() { }

    public User(String userName) {
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setPwd(String pwd) { this.pwd = pwd; }

    public String getUserName() {
        return userName;
    }
    public String getPwd() { return pwd; }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public Iterable<Project> getProjects() {
        return projects;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nuser Name: " + userName;
    }

}
