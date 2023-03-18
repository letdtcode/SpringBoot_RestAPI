package com.mascara.springrestapi.service;

import com.mascara.springrestapi.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getEmployees();
    Employee saveEmployee(Employee employee);
    Employee getSingleEmployee(Long id);
    void deleteEmployee(Long id);
}
