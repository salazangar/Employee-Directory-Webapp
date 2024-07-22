package com.sid.springboot.controller;

import com.sid.springboot.entity.Employee;
import com.sid.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService theEmployeeService){
        employeeService = theEmployeeService;
    }

    @GetMapping("/listEmployees")
    public String listEmployees(Model theModel){

        // get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        // add to spring model
        theModel.addAttribute("employees", theEmployees);

        return "employees/list-employees";
    }

    @GetMapping("/showAddForm")
    public String showAddForm(Model theModel){

        // create model attribute to bind the data
        Employee theEmployee = new Employee();

        theModel.addAttribute("employee", theEmployee);

        return "employees/employee-form-add";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee){

        // save the employee
        employeeService.save(theEmployee);

        // use a redirect  to prevent multiple submissions
        return "redirect:/employees/listEmployees";
    }

    @GetMapping("/showUpdateForm")
    public String updateEmployee(@RequestParam("employeeId") int theId, Model theModel){

        // get employee from service
        Employee theEmployee = employeeService.findById(theId);

        // set employee in model to populate the form
        theModel.addAttribute("employee", theEmployee);

        // send over to our form
        return "employees/employee-form-update";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("employeeId") int theId){
        // delete the employee
        employeeService.deleteById(theId);

        // redirect to employee list
        return "redirect:/employees/listEmployees";
    }

}
