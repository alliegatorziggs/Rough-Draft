package com.author.roughdraft.projectfile;


import com.author.roughdraft.project.Project;
import org.springframework.data.rest.core.annotation.RestResource;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", length=100, nullable=false)
    private String name;

    @Column(name="description", length=255)
    private String description;

    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name="content", nullable=false)
    private byte[] content;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    public ProjectFile() { }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Long getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public byte[] getContent() {
        return this.content;
    }

}
