package com.mascara.springrestapi.service;

import com.mascara.springrestapi.model.Employee;
import com.mascara.springrestapi.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceimp implements IEmployeeService {

    @Autowired
    private IEmployeeRepository employeeRepository;
    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getSingleEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()) {
            return employee.get();
        }
        throw new RuntimeException("Employee is not found for the id "+id);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
