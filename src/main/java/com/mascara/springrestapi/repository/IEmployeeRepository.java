package com.mascara.springrestapi.repository;

import com.mascara.springrestapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    List<Employee> findByName(String name);

    //Select * from table where name="dthanh" and location="VietNam"
    List<Employee> findByNameAndLocation(String name, String location);

    //Select * from table where name like "%tha%"
    List<Employee> findByNameContaining(String keyword);
}
