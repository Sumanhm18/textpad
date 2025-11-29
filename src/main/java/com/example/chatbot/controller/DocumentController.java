package com.example.chatbot.controller;

import com.example.chatbot.model.Document;
import com.example.chatbot.model.DocumentUpdate;
import com.example.chatbot.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @MessageMapping("/document.update/{documentId}")
    @SendTo("/topic/document/{documentId}")
    public DocumentUpdate updateDocument(@DestinationVariable String documentId,
                                         @Payload DocumentUpdate update) {
        // Update the document in the service
        documentService.updateDocument(documentId, update.getContent());
        return update;
    }

    @GetMapping("/api/document/{documentId}")
    @ResponseBody
    public Document getDocument(@PathVariable String documentId) {
        return documentService.getDocument(documentId);
    }

    @PostMapping("/api/document/{documentId}")
    @ResponseBody
    public Document saveDocument(@PathVariable String documentId, 
                                 @RequestBody String content) {
        return documentService.updateDocument(documentId, content);
    }
}
