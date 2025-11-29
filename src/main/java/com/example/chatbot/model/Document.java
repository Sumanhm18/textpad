package com.example.chatbot.model;

public class Document {
    
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
    }

    public String getId() {
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
