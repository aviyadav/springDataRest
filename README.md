# springDataRest


mvn spring-boot:run

feed:
INSERT INTO EMPLOYEES (ID, FIRST_NAME, LAST_NAME, EMAIL) 
VALUES
(1, 'Gregory', 'Hughes', 'GregoryHughes@armyspy.com'),
(2, 'Frank', 'Clarke', 'FrankClarke@armyspy.com'),
(3, 'Susan', 'Moore', 'SusanMoore@armyspy.com');


GET - http://localhost:8080/employees
GET - http://localhost:8080/employees/1

POST - http://localhost:8080/employees
{
  "email": "johndoe2@example.com",
  "firstName": "john2",
  "id": 5,
  "lastName": "doe2"
}

PUT - http://localhost:8080/employees/5
{
  "email": "johndoe2200909@example.com",
  "firstName": "john2987699",
  "lastName": "doe2211212212"
}

DELETE - http://localhost:8080/employees/5

Pagination
http://localhost:8080/members?page=0&size=2

sort
http://localhost:8080/members?sort=firstName

Query Methods
http://localhost:8080/members/search/findByFirstName?firstName=Susan