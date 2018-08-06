package com.author.roughdraft.projectfile;

import com.author.roughdraft.project.Project;
import com.author.roughdraft.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping(path = "/files")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectFileController {
    @Autowired
    private ProjectFileRepository repository;

//    @Autowired
//    ServletContext context;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<ProjectFile> getAllFiles() {
        return repository.findAll();
    }

    @PostMapping(path="/add")
    public ResponseEntity<ProjectFile> addNewProject (@RequestBody ProjectFile file) {
        return new ResponseEntity<ProjectFile>(repository.save(file), HttpStatus.CREATED);
    }
}