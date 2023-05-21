# Movie Review Backend

This repository contains the backend code for a Spring Boot application that provides API calls to retrieve movie details and post reviews.

## Getting Started

To get started with this project, follow the instructions below.

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- Maven
- Spring Boot

### Installation

1. Clone the repository to your local machine:

   ```
   git clone https://github.com/your-username/movie-review-backend.git
   ```

2. Navigate to the project directory:

   ```
   cd movie-review-backend
   ```

3. Build the project using Maven:

   ```
   mvn clean install
   ```

4. Run the application:

   ```
   mvn spring-boot:run
   ```

The application should now be running on `http://localhost:8080`.

## API Endpoints

The backend provides the following API endpoints for retrieving movie details and posting reviews.

### Get All Movies

Retrieves details for all movies.

- **URL**: `/api/v1/movies`
- **Method**: GET
- **Parameters**: None
- **Response**:
  - Status code: 200 (OK)
  - Body: JSON array containing movie details

### Get Movie by IMDb ID

Retrieves details for a specific movie using its IMDb ID.

- **URL**: `/api/v1/movies/{imdbId}`
- **Method**: GET
- **Parameters**:
  - `imdbId`: IMDb ID of the movie
- **Response**:
  - Status code: 200 (OK)
  - Body: JSON object containing movie details

### Post a Review

Posts a review for a movie.

- **URL**: `/api/v1/reviews`
- **Method**: POST
- **Parameters**: None
- **Request Body**: JSON object containing review details
- **Response**:
  - Status code: 201 (Created)
  - Body: JSON object containing the created review

## Database Configuration

This project uses mongoDB database. The database is pre-populated with sample movie data upon application startup. You can modify the database configuration in the `application.properties` file.

## Contributing

If you would like to contribute to this project, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature or bug fix.
3. Commit your changes.
4. Push the branch to your forked repository.
5. Submit a pull request.


## Acknowledgments

This project was inspired by the love for movies and the desire to create a simple movie review application. Thank you to all the contributors who helped make this project possible.
