# REST API Proxy

This project implements a REST API proxy using Spring. It redirects requests to https://jsonplaceholder.typicode.com and includes basic authentication, role-based access control.

## Requirements

1. Implemented handlers (GET, POST, PUT, DELETE) that proxy requests to https://jsonplaceholder.typicode.com:
   - `/api/posts/`
   - `/api/users/`
   - `/api/albums/`

2. Implemented basic registration and authentication with multiple accounts having different roles.

3. Developed a role-based access control model with at least 4 roles:
   - `ROLE_ADMIN`: has access to all handlers.
   - `ROLE_POSTS`: has access to handlers under `/posts/`.
   - `ROLE_USERS`: has access to handlers under `/users/`.
   - `ROLE_ALBUMS`: has access to handlers under `/albums/`.

4. Database Usage:
   - For storing user data.

## Technologies Used

- Java >=17
- Spring
- Docker
- PostgreSQL

## Usage

1. Clone the repository.
2. [Install Docker](https://docs.docker.com/get-docker/) if not already installed.
3. Navigate to the project directory.
4. Run `docker-compose up` to start the application and the associated database.
5. Access the API at [http://localhost:PORT](http://localhost:PORT).
