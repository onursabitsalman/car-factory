# car-factory
This is basic spring car factory project.

## How to run?
This is maven project ,so just clone and prompt `mvn clean install` then run CarFactoryApplication.

## How to use?
There is a swagger in the project URL:`http://localhost:9090/swagger-ui.html` <br> <br>

If you want to use postman or something else you can use these endpoints <br>
To get all produced cars -> `GET` `http://localhost:9090/car` <br>
To produce car -> `POST` `http://localhost:9090/car` Payload: `sedan` <br>
