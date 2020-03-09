INSERT INTO Person (name, surname, patronumic, dateOfBirth) VALUES('Никита', 'Хмелев', 'Анатольевич', '1999-06-11')
;
INSERT INTO Person (name, surname, patronumic, dateOfBirth) VALUES('Мария', 'Пьянкова', 'Владимировна', '1999-08-12')
;
INSERT INTO Person (name, surname, patronumic, dateOfBirth) VALUES('Наталия', 'Волкова', 'Дмитриевна', '1999-10-09')
;
INSERT INTO Person (name, surname, patronumic, dateOfBirth) VALUES('Глеб', 'Клепиков', 'Алексеевич', '1999-04-05')
;
INSERT INTO Mark (type) VALUES('Семья')
;
INSERT INTO Mark (type) VALUES('Друзья')
;
INSERT INTO Mark (type) VALUES('Работа')
;
INSERT INTO Mark (type) VALUES('Учеба')
;
INSERT INTO MarkSet(PersonID, MarkID) VALUES ( 2, 1)
;
INSERT INTO MarkSet(PersonID, MarkID) VALUES ( 3, 1)
;
INSERT INTO MarkSet(PersonID, MarkID) VALUES ( 4, 2)
;
INSERT INTO MarkSet(PersonID, MarkID) VALUES ( 4, 4)
;
INSERT INTO Phone(PersonID, number) VALUES(1, '89995480802')
;
INSERT INTO Phone(PersonID, number) VALUES(1, '89506642568')
;
INSERT INTO Phone(PersonID, number) VALUES(2, '89995485087')
;
INSERT INTO Phone(PersonID, number) VALUES(3, '89506647933')
;
INSERT INTO Phone(PersonID, number) VALUES(4, '89533519599')
;