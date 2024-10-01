# PlayerData

## 🛠️ Installing
### 1. Clone the repository
### 2. Backend
- Navigate to backend folder: cd server (start the application)
- Start the server with Docker Compose using: _docker-compose up_
### 3. Frontend 
- Navigate to frontend folder: cd client 
- Install all the dependencies: npm install 
- Start the developement server: _npm run serve_

🛠️ Prerequisites: Java 17, Maven, Docker, Spring Boot, Vue.js.

## 💻 Application

### Backend: 
- N-Tier Layered Architecture with Java - Spring Boot (tested with Postman & Mockito. Dependencies: lombok to reduce boilerplate code, Spring Web, Spring Data JPA, MySQL driver)
- Exposes API to return a list of 10 players in JSON format which are already initialized into the database.

### Database: 
- MySQL (using Docker containerized solution with MySQL image. Initialized with player data)

### Frontend: 
- Vue.js + TailwindCSS
- Fetches the player data from the API created in the backend.
- Displays data with the following columns: Birth Date, First Name, Last Name, City.
- Sorting functionality added to birth date in ascending/descending order.
  
<img width="949" alt="image" src="https://github.com/user-attachments/assets/1ec296bd-6225-432b-85e5-25dc341bbae4">

> <em>Image 1: Showcases the application.</em>

<img width="947" alt="image" src="https://github.com/user-attachments/assets/9ada1f73-966c-4cc8-b025-829aa490c924">

> <em>Image 2: Demonstrates description of the sorting functionality when the icon is hovered</em>
