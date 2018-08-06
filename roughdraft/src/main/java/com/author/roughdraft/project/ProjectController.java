package com.author.roughdraft.project;


import com.author.roughdraft.user.User;
import com.author.roughdraft.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/projects")
@CrossOrigin(origins = "http://localhost:4200")
public class ProjectController {
    @Autowired
    private ProjectRepository repository;

    @PostMapping(path="/add")
    public ResponseEntity<Project> addNewProject (@RequestBody Project project) {
        return new ResponseEntity<Project>(repository.save(project), HttpStatus.CREATED);
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Project> getAllProjects() {
        return repository.findAll();
    }

    @PostMapping(path="/projectlist")
    public ResponseEntity<Iterable<Project>> getUserProjects (@RequestBody User user) {
        return new ResponseEntity<Iterable<Project>>(repository.findProjectsByAuthorId(user.getId()), HttpStatus.ACCEPTED);
    }
    @GetMapping(path="/{userid}/{projectid}")
    public ResponseEntity<Project> getProject(@PathVariable("userid") Long userId, @PathVariable("projectid") Long projectId) {
        return new ResponseEntity<Project>(repository.findProjectByAuthorIdAndProjectId(userId, projectId), HttpStatus.ACCEPTED);
    }
    @PostMapping(path="/delete")
    public ResponseEntity deleteProject(@RequestBody Project project) {
        repository.delete(project);
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
