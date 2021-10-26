CREATE TABLE person (
  id SERIAL PRIMARY KEY,
  fname varchar(30) NOT NULL,
  lname varchar(30) NOT NULL,
  email varchar(30) NOT NULL UNIQUE,
  password varchar(30) NOT NULL
);

CREATE TABLE event (
  id SERIAL PRIMARY KEY,
  name varchar(30) NOT NULL,
  key varchar(30) UNIQUE NOT NULL,
  author_id int NOT NULL,
  date varchar(20) NOT NULL,
  FOREIGN KEY (author_id) REFERENCES person(id) ON DELETE CASCADE
);

CREATE TABLE participation (
  person_id int NOT NULL,
  event_id int NOT NULL,
  PRIMARY KEY ( person_id, event_id ),
  FOREIGN KEY ( person_id ) REFERENCES person(id) ON UPDATE  NO ACTION  ON DELETE CASCADE,
  FOREIGN KEY ( event_id ) REFERENCES event(id) ON UPDATE  NO ACTION  ON DELETE CASCADE
);

CREATE TABLE comment (
  id SERIAL PRIMARY KEY,
  author_id int NOT NULL,
  event_id int NOT NULL,
  date varchar(20) NOT NULL,
  content varchar(50) NOT NULL,
  FOREIGN KEY (author_id) REFERENCES person(id) ON DELETE CASCADE,
  FOREIGN KEY (event_id) REFERENCES event(id) ON DELETE CASCADE
);
