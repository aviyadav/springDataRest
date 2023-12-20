# springDataRest

### RUN

> mvn spring-boot:run

### Database - http://localhost:8080/h2-console
> JDBC Url: jdbc:h2:mem:testdb<br>
Username: sa<br>
Password: password<br>

### feed [SQL]:

> INSERT INTO EMPLOYEES (ID, FIRST_NAME, LAST_NAME, EMAIL)<br>
VALUES<br>
(1, 'Gregory', 'Hughes', 'GregoryHughes@armyspy.com'),<br>
(2, 'Frank', 'Clarke', 'FrankClarke@armyspy.com'),<br>
(3, 'Susan', 'Moore', 'SusanMoore@armyspy.com');<br>


## SWAGGER UI
> http://localhost:8080/swagger-ui/

### API TESTING

- GET - http://localhost:8080/employees

- GET - http://localhost:8080/employees/1

- POST - http://localhost:8080/employees

> {<br>
  "email": "johndoe2@example.com",<br>
  "firstName": "john2",<br>
  "id": 5,<br>
  "lastName": "doe2"<br>
}<br>


- PUT - http://localhost:8080/employees/5
> {<br>
  "email": "johndoe2200909@example.com",<br>
  "firstName": "john2987699",<br>
  "lastName": "doe2211212212"<br>
}<br>

- DELETE - http://localhost:8080/employees/5

#### Pagination
> http://localhost:8080/members?page=0&size=2

#### sort
> http://localhost:8080/members?sort=firstName

#### Query Methods
> http://localhost:8080/members/search/findByFirstName?firstName=Susan
