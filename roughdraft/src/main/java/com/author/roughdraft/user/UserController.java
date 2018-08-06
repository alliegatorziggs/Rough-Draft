package com.author.roughdraft.user;

import com.author.roughdraft.project.Project;
import com.author.roughdraft.project.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping (path="/users")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping(path="/add")
    public ResponseEntity<User> addNewUser (@RequestBody User user) {
        if (repository.findByUserName(user.getUserName()).isPresent()) {
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }
        return new ResponseEntity<User>(repository.save(user), HttpStatus.CREATED);
    }
    @GetMapping(path="/{id}")
    public ResponseEntity<User> getUser (@PathVariable Long id) {
        return new ResponseEntity<User>(repository.findById(id).get(), HttpStatus.ACCEPTED);
    }
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping (path="/{userName}")
    public ResponseEntity<User> getUser (@PathVariable String userName) {
        return new ResponseEntity<User>(repository.findByUserName(userName).get(), HttpStatus.ACCEPTED);
    }
    @PutMapping(path="/update")
    public ResponseEntity<User> updateUser (@RequestBody User user) {
        if (repository.findById(user.getId()).isPresent()) {
            return new ResponseEntity<User>(repository.save(user), HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
    @PutMapping (path="/login")
    public ResponseEntity<User> login (@RequestBody User loginUser) {
        User existingUser = repository.findByUserName(loginUser.getUserName()).get();
        if (loginUser.getPwd().equals(existingUser.getPwd())) {
            return new ResponseEntity<User>(existingUser, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping(path="/delete/{id}")
    public ResponseEntity<User> deleteUser (@RequestBody User user) {
        if (repository.findById(user.getId()).isPresent()) {
            repository.delete(user);
            return new ResponseEntity<User>(HttpStatus.ACCEPTED);
        }
        else {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
}
