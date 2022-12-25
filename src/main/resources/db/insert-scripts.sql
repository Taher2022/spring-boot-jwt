INSERT INTO zudemy_jwt.users
(id,
email,
name,
password,
username)
VALUES(1,'taher@gmail.com','Taher','$2a$10$yqq8ilise7SKBrh4bDHgYu2Cp2Mrf29i5TNbgOiv7IMzBpBqt8cDC','tali');

INSERT INTO zudemy_jwt.roles
(id,
name)
VALUES(1,'Admin');

INSERT INTO zudemy_jwt.user_roles
(user_id,
role_id)
VALUES(1,1);


