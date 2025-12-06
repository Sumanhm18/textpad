# Real-time Collaborative Platform

A real-time collaborative platform built with Spring Boot and WebSocket, featuring both a chat application and a collaborative text editor (like dontpad.com) with MongoDB persistence.

## Features

### Collaborative Text Editor (DontPad Clone)

- Real-time collaborative text editing
- Automatic synchronization across all users
- Persistent storage with MongoDB
- Share documents via simple URLs
- Multiple users can edit simultaneously

### Chat Application

- Real-time messaging using WebSocket (STOMP protocol)
- Simple and clean UI
- User join/leave notifications
- Message broadcasting to all connected users

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- MongoDB Atlas account (or local MongoDB installation)

## How to Run

1. Build the project:

   ```bash
   mvn clean package
   ```

2. Run the application:

   ```bash
   mvn spring-boot:run
   ```

3. Access the application:

   **For Collaborative Editor (DontPad Clone):**

   ```
   http://localhost:8080/my-document
   http://localhost:8080/shopping-list
   http://localhost:8080/any-document-name
   ```

   **For Chat Application:**

   ```
   http://localhost:8080/chat
   ```

## Project Structure

```
chatbot/
├── src/
│   ├── main/
│   │   ├── java/com/example/chatbot/
│   │   │   ├── ChatBotApplication.java
│   │   │   ├── config/
│   │   │   │   └── WebSocketConfig.java
│   │   │   ├── controller/
│   │   │   │   ├── ChatController.java
│   │   │   │   ├── DocumentController.java
│   │   │   │   └── HomeController.java
│   │   │   ├── model/
│   │   │   │   ├── ChatMessage.java
│   │   │   │   ├── Document.java
│   │   │   │   └── DocumentUpdate.java
│   │   │   └── service/
│   │   │       └── DocumentService.java
│   │   │   └── repository/
│   │   │       └── DocumentRepository.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/
│   │           ├── index.html (chat UI)
│   │           └── pad.html (editor UI)
└── pom.xml

## Technology Stack

- Spring Boot 3.2.0
- Spring WebSocket
- Spring Data MongoDB
- MongoDB Atlas
- SockJS (WebSocket fallback)
- STOMP messaging protocol

## How It Works

### Collaborative Editor
1. Users access a document via URL
2. The document is loaded from MongoDB or created if new
3. WebSocket connection is established for real-time sync
4. Any changes are broadcast to all connected users editing the same document
5. Changes are automatically saved to MongoDB

### Chat Application
1. Users enter their name to join the chat room
2. Messages are sent via WebSocket and broadcast to all connected users
3. Join/leave notifications are displayed to all participants

## Use Cases

- **Collaborative note-taking** during meetings
- **Shared to-do lists** for teams
- **Quick text sharing** without account creation
- **Real-time brainstorming** sessions
- **Simple chat** for quick communication
- **Persistent document storage** with MongoDB
```
