package com.example.chatbot.model;

public class DocumentUpdate {

    private String documentId;
    private String content;
    private String userId;

    public DocumentUpdate() {
    }

    public DocumentUpdate(String documentId, String content, String userId) {
        this.documentId = documentId;
        this.content = content;
        this.userId = userId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
