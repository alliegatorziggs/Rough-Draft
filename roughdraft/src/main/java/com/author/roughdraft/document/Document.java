//package com.author.roughdraft.document;
//
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.PrePersist;
//import java.io.File;
//import java.time.LocalDateTime;
//
//@Entity
//public class Document {
//
//    @Id
//    @GeneratedValue
//    private Long id;
//
//    private File source;
//    private String comment;
//    private LocalDateTime timestamp;
//
//    public Document() { }
//
//    public Document(String comment, String source) {
//        this.source = source;
//        this.comment = comment;
//    }
//
//    @PrePersist
//    public void addTimeStamp() {
//        timestamp = LocalDateTime.now();
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
////    public void setSource(File source) {
////        this.source = source;
////    }
//    public void setComment(String comment) {
//        this.comment = comment;
//    }
//
//    public Long getId() {
//        return id;
//    }
////    public File getSource() {
////        return source;
////    }
//    public LocalDateTime getTimestamp() {
//        return timestamp;
//    }
//    public String getComment() {
//        return comment;
//    }
//}
