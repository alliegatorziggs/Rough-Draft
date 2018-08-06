//package com.author.roughdraft.document;
//
//
//import com.author.roughdraft.project.Project;
//import com.author.roughdraft.project.ProjectRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//@RequestMapping(path = "/documents")
//public class DocumentController {
//    @Autowired
//    private DocumentRepository repository;
//
//    @GetMapping(path="/all")
//    public @ResponseBody
//    Iterable<Document> getAllDocuments() {
//        return repository.findAll();
//    }
//}
