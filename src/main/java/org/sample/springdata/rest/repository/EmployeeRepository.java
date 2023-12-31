package org.sample.springdata.rest.repository;

import java.util.List;
import org.sample.springdata.rest.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByFirstName(@Param("firstName") String firstName);
}