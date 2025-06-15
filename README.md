# **Traffic Light system (Red, Yellow, Green based on seconds)**

Java + Spring Boot REST API

**Add a user (POST)**

* URL: `http://localhost:8080/api/users/add`
* Body (JSON):

  `{ "name": "Asad", "email": "asad@example.com", "password": "pass123" }`

  `{ "name": "Nadeem", "email": "Nadeem@example.com", "password": "pass123" }
  `

  * Store users temporarily in memory
  * Auto-generate `randomId` (letters + numbers)

**Get all users (GET)**

* URL: `http://localhost:8080/api/users/all`

**Traffic Light Status**

* URL: `http://localhost:8080/api/traffic/status?seconds=135`
* Response: `"GREEN - Data successfully loaded!"`
