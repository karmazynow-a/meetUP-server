INSERT INTO person (fname, lname, email, password) VALUES 
    ('Captain', 'America', 'ca@marvel.com', 'dummypass'),
    ('Iron', 'Man', 'im@marvel.com', 'dummypass'),
    ('Britney', 'Spears', 'britt@iscallin.com', 'dummypass'),
    ('Doja', 'Cat', 'doja@cat.com', 'dummypass'),
    ('Madonna', 'Queen', 'madonnamadonna.com', 'dummypass');


INSERT INTO event (name, key, author_id, date) VALUES 
    ('Tea with besties', 'key1', 1, '29-06-2020 19:00'),
    ('Partay', 'key2', 1, '16-07-2020 21:00'),
    ('Funeral', 'key3', 2, '27-01-2021 9:00');


INSERT INTO participation (person_id, event_id) VALUES 
    (1, 1), (1, 2), (1, 3),
    (2, 1), (2, 3),
    (3, 1);

INSERT INTO comment (author_id, event_id, date, content) VALUES
    (1, 1, '2020-04-29 11:00', 'comment1'),
    (1, 1, '2020-04-29 12:00', 'comment2'),
    (2, 1, '2020-04-29 13:00', 'comment3'),
    (1, 1, '2020-04-29 14:00', 'comment8');
