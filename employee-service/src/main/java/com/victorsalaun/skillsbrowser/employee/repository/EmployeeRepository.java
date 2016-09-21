package com.victorsalaun.skillsbrowser.employee.repository;

import com.victorsalaun.skillsbrowser.employee.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
