package com.example.chatbot.service;

import com.example.chatbot.model.Document;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class DocumentService {

    private final Map<String, Document> documents = new ConcurrentHashMap<>();

    public Document getDocument(String id) {
        return documents.computeIfAbsent(id, Document::new);
    }

    public Document updateDocument(String id, String content) {
        Document document = documents.computeIfAbsent(id, Document::new);
        document.setContent(content);
        return document;
    }

    public boolean documentExists(String id) {
        return documents.containsKey(id);
    }

    public void deleteDocument(String id) {
        documents.remove(id);
    }
}
