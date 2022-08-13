package com.empl.springMongoDb.repository;

import com.empl.springMongoDb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface EmployeeRepository extends MongoRepository<Employee, Long> {
    Employee findByEmpNo();

    List<Employee> findByFullNameLike(String fullName);

    List<Employee> findByHireDateGreaterThan(Date hireDate);

    //Support native json query
    List<Employee> findCustomByFullName(String fullName);
}
