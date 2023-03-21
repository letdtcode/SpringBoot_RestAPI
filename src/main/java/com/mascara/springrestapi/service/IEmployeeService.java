package com.mascara.springrestapi.service;

import com.mascara.springrestapi.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees(int pageNumber, int pageSize);
//    Employee saveEmployee(Employee employee);
//    Employee getSingleEmployee(Long id);
//    void deleteEmployee(Long id);
//    Employee updateEmployee(Employee employee);
//    List<Employee> getEmployeesByName(String name);
//    List<Employee> getEmployeeByNameAndLocation(String name, String location);
//    List<Employee> getEmployeesByKeyword(String name);
}
