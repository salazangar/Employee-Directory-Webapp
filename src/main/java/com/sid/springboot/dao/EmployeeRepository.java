package com.sid.springboot.dao;

import com.sid.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // the JpaRepository gives uss all the standard CRUD methods without us needing to code it

    // add a method to sort by first name
    public List<Employee> findAllByOrderByFirstNameAsc();

}
