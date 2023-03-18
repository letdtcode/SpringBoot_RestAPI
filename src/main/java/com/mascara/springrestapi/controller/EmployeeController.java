package com.mascara.springrestapi.controller;

import com.mascara.springrestapi.model.Employee;
import com.mascara.springrestapi.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getSingleEmployee(id);
    }

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        System.out.println("updating the employee data for the id " + id);
        return employee;
    }

    @DeleteMapping("/employees")
    public void deleteEmployee(@RequestParam Long id) {
        employeeService.deleteEmployee(id);
    }
}
