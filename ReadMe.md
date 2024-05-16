# Backend Challenge Setup

Before starting make sure that you have the following installed :

- [Docker]: https://docs.docker.com/desktop/install/windows-install/;
- [Java Correto-21]: https://aws.amazon.com/pt/corretto/?filtered-posts.sort-by=item.additionalFields.createdDate&filtered-posts.sort-order=desc

After Installing the dependencies it needs to run "docker compose up" on the source of the project to create the docker Environment that as the container and some mock data;

The docker will run on the post 27017 make sure that every time the project needs to be run that the docker is running as well otherwise the project wont work.

The Database used on this project is a Mongo database.

Finally just need to run the file "BackEndChallengeApplication.java" with java to make the application run

## Application end points:

[Base url]: http://localhost:8080/api/movies

[GET]:

- "/" : Get a List of all the movies;
- "/moviesByDate" : Get a List of all movies order by launch date in Ascendant order;
- "/moviesAfterDate?startDate=xxxx-xx-xx" : Get a list of movies after the specified date on the params (format : year-month-day)

[POST]:

- "/" : Creates a new movie entry
  Example body:
  {
  "title":"Teste",
  "date":"2024-05-06",
  "rank": 5,
  "revenue": 20000
  }

  [PUT]:

- "/${id}": Updates a already existing movie based on the id
  Example body:
  {
  "title":"Teste2",
  "date":"2024-05-06",
  "rank": 6,
  "revenue": 50000
  }

  [DELETE]:

- "/${id}": Delete a Movie based on the id

There is also a PostMan Json File (Backend Challenge.postman_collection.json) on the base that can be imported on to Post Man.
