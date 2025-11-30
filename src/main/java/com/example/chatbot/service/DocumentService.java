package com.example.chatbot.service;

import com.example.chatbot.model.Document;
import com.example.chatbot.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DocumentService {
    
    @Autowired
    private DocumentRepository documentRepository;

    public Document getDocument(String id) {
        Optional<Document> doc = documentRepository.findById(id);
        if (doc.isPresent()) {
            return doc.get();
        }
        // Create new document if not found
        Document newDoc = new Document(id);
        return documentRepository.save(newDoc);
    }

    public Document updateDocument(String id, String content) {
        Optional<Document> existingDoc = documentRepository.findById(id);
        Document document;
        
        if (existingDoc.isPresent()) {
            document = existingDoc.get();
            document.setContent(content);
        } else {
            document = new Document(id, content);
        }
        
        return documentRepository.save(document);
    }

    public boolean documentExists(String id) {
        return documentRepository.existsById(id);
    }

    public void deleteDocument(String id) {
        documentRepository.deleteById(id);
    }
}