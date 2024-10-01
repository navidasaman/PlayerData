# PlayerData

## 🛠️ Installing
### 1. Clone the repository
### 2. Backend
- Navigate to backend folder: <code> cd server </code> (start the application)
- Start the server with Docker Compose using: <code> _docker-compose up_ </code>
### 3. Frontend 
- Navigate to frontend folder: <code> cd client </code>
- Install all the dependencies: <code> npm install</code>
- Start the developement server: <code> _npm run serve_ </code>

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
  
<img width="944" alt="image" src="https://github.com/user-attachments/assets/547c38b8-09d2-4607-9f81-57ce179c5303">

> <em>Image 1: Showcases the application.</em>

<img width="946" alt="image" src="https://github.com/user-attachments/assets/655086e3-48d6-42cf-a7bd-b738299c0631">

> <em>Image 2: Demonstrates description of the sorting functionality when the icon is hovered</em>
