package com.sid.springboot.thymeleafdemo.controller;

import com.sid.springboot.thymeleafdemo.entity.Employee;
import com.sid.springboot.thymeleafdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model theModel){

        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }

}
