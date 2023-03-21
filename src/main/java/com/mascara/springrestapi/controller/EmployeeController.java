package com.mascara.springrestapi.controller;

import com.mascara.springrestapi.model.Employee;
import com.mascara.springrestapi.service.IEmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getEmployees(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return new ResponseEntity<List<Employee>>(employeeService.getEmployees(pageNumber, pageSize), HttpStatus.OK);
    }

//    @GetMapping("/employees/{id}")
//    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
//        return new ResponseEntity<Employee>(employeeService.getSingleEmployee(id), HttpStatus.OK);
//    }
//
//    @PostMapping("/employees")
//    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee) {
//        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
//    }
//
//    @PutMapping("/employees/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
//        employee.setId(id);
//        return new ResponseEntity<Employee>(employeeService.updateEmployee(employee), HttpStatus.OK);
//    }
//
//    @DeleteMapping("/employees")
//    public ResponseEntity<HttpStatus> deleteEmployee(@RequestParam Long id) {
//        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
//    }
//    @GetMapping("/employees/filterByName")
//    public ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam String name) {
//        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByName(name), HttpStatus.OK);
//    }
//
//    @GetMapping("/employees/filterByNameAndLocation")
//    public ResponseEntity<List<Employee>> getEmployeesByName(@RequestParam String name, @RequestParam String location) {
//        return new ResponseEntity<List<Employee>>(employeeService.getEmployeeByNameAndLocation(name,location), HttpStatus.OK);
//    }
//    @GetMapping("/employees/filterByKeyword")
//    public ResponseEntity<List<Employee>> getEmployeesByKeyword(@RequestParam String name) {
//        return new ResponseEntity<List<Employee>>(employeeService.getEmployeesByKeyword(name), HttpStatus.OK);
//    }
}
