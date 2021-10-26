# meetUP
The web app to sign up for private events. Users can find events only by entering the unique keys and sign up without the awareness of bystanders.

Client app avaliable https://github.com/karmazynow-a/meetUP-client

## Technologies
### Client
Framework ReactJS + Redux.

Also used:
* [Materialize](https://materializecss.com) for the styles,
* [axios](https://github.com/axios/axios) for the http queries,
* [moment](https://momentjs.com/) for the dates management.

### Server
RESTful web service with JEE. Database queries are managed with JPA.

On branch `JDBC` there is JDBC version of queries management, where the answers are passed by objects, not with lists like in JPA version.

### Database
PostgreSQL cloud database [ElephantSQL](https://www.elephantsql.com/)

## Instalation
Before running locally server or client app you have to provide database credentials in `meetUP-server/WebContent/META-INF/context.xml` and link to the database in order to send the REST queries in `meetUP-client/src/config.js`

More information about installing or deploying on IBM Cloud are available in documentation.

### Client
To install client app use:

    npm install
    npm start

### Server
To run server application locally you can use Eclipse environment with installed Tomcat Server. The details are in the documentation.

Also you will need extra libraries:

* jstl
* postgre

After downloading the *.jar files put them inside `meetUP-server/WebContent/WEB-INF/lib/`.

## Future development ideas
* return to JDBC (JPA was required) or chande JPA to objects not lists
* add polish language
* add animation for disappering and appearing cards
* block from accessing events by id that user is not participant
