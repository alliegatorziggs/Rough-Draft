//package com.author.roughdraft.document;
//
//import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
//import org.apache.poi.xwpf.usermodel.XWPFDocument;
//
//import javax.persistence.Entity;
//import javax.xml.crypto.Data;
//import java.io.*;
//
//@Entity
//public class WordDocument extends Document {
//
//    private XWPFDocument wordDocument;
//
//    public WordDocument() { }
//
//    public WordDocument(String source, String comment) throws IOException{
//        super(new File(source), comment);
//        this.wordDocument = new XWPFDocument(new FileInputStream(source));
//    }
//
//    public String getHTML() {
//        XWPFWordExtractor extractor = new XWPFWordExtractor(wordDocument);
//        return extractor.getText();
//    }
//
//    public static void main(String[] args) {
//        try {
//            String FILEPATH = "/Users/AllisonZ/projects/VersionControlForAuthors_PassionProject/Hazel_Chapter 1.docx";
//            WordDocument docx = new WordDocument(FILEPATH, "This is a comment");
//            System.out.println(docx.getHTML());
//        }
//        catch (IOException e) {
//            System.out.println("epic fail :(");
//        }
//    }
//}

