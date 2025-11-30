package com.example.chatbot.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "documents")
public class Document {
    
    @Id
    private String id;
    private String content;
    private long lastModified;

    public Document() {
        this.content = "";
        this.lastModified = System.currentTimeMillis();
    }

    public Document(String id) {
        this.id = id;
        this.content = "";
        this.lastModified = System.currentTimeMillis();
    }

    public Document(String id, String content) {
        this.id = id;
        this.content = content;
        this.lastModified = System.currentTimeMillis();
    }    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.lastModified = System.currentTimeMillis();
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }
}
