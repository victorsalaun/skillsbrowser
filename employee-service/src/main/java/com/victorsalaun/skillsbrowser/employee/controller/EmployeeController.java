package com.victorsalaun.skillsbrowser.employee.controller;

import com.victorsalaun.skillsbrowser.employee.domain.Employee;
import com.victorsalaun.skillsbrowser.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // CRUD

    @RequestMapping(
            value = "/v1",
            method = RequestMethod.POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @RequestMapping(
            value = "/v1",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private Employee read(@RequestParam String id) {
        return employeeService.read(id);
    }

    @RequestMapping(
            value = "/v1",
            method = RequestMethod.PUT,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @RequestMapping(
            value = "/v1",
            method = RequestMethod.DELETE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private void delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
    }

    // EXTRAS

    @RequestMapping(
            value = "/v1/list",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    private List<Employee> list() {
        return employeeService.list();
    }

}
