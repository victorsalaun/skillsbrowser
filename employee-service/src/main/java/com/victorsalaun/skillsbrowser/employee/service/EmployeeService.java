package com.victorsalaun.skillsbrowser.employee.service;

import com.victorsalaun.skillsbrowser.employee.domain.Employee;
import com.victorsalaun.skillsbrowser.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // CRUD

    public Employee create(Employee employee) {
        return employeeRepository.insert(employee);
    }

    public Employee read(final String id) {
        return employeeRepository.findOne(id);
    }

    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }

    // EXTRAS

    public List<Employee> list() {
        return employeeRepository.findAll();
    }

}
