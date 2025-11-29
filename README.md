# Real-time Collaborative Platform

A real-time collaborative platform built with Spring Boot and WebSocket, featuring both a chat application and a collaborative text editor (like dontpad.com).

## Features

### Collaborative Text Editor (DontPad Clone)

- 📝 Real-time collaborative text editing
- 🔄 Automatic synchronization across all users
- 💾 Auto-save functionality
- 🌐 Share documents via simple URLs
- 👥 Multiple users can edit simultaneously

### Chat Application

- Real-time messaging using WebSocket (STOMP protocol)
- Simple and clean UI
- User join/leave notifications
- Message broadcasting to all connected users

## Prerequisites

- Java 17 or higher
- Maven 3.6+

## How to Run

1. Build the project:
   ```bash

   ```
2. Open your browser and navigate to:

   **For Collaborative Editor (DontPad Clone):**

   ```
   http://localhost:8080
   ```

   Or access specific documents:

   ```
   http://localhost:8080/my-document
   http://localhost:8080/shopping-list
   ```

   **For Chat Application:**

   ```
   http://localhost:8080/chat
   ```

3. Start typing or chatting! Changes are synchronized in real-time.

   ```

   ```

4. Open your browser and navigate to:

   ```
   http://localhost:8080
   ```

5. Enter your name and start chatting!

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
│   │   └── resources/
## Technology Stack

- Spring Boot 3.2.0
- Spring WebSocket
- SockJS (WebSocket fallback)
- STOMP messaging protocol
- In-memory document storage (ConcurrentHashMap)

## How It Works

### Collaborative Editor
1. Users access a document via URL (e.g., `/shopping-list`)
2. The document is loaded from in-memory storage or created if new
3. WebSocket connection is established for real-time sync
4. Any changes are broadcast to all connected users editing the same document
5. Changes are automatically saved to the server

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

## Technology Stack

- Spring Boot 3.2.0
- Spring WebSocket
- SockJS (WebSocket fallback)
- STOMP messaging protocol
```
