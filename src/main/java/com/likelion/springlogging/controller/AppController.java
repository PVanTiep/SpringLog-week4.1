package com.likelion.springlogging.controller;

import com.likelion.springlogging.dto.DepartmentDto;
import com.likelion.springlogging.dto.EmployeeDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/likelion")
public class AppController {
    @PostMapping("/employeeDto")
    public String validEmployeeDto(@RequestBody @Valid EmployeeDto employeeDto){
        return "employeeDto is valid";
    }


    @PostMapping("/departmentDto")
    public String validDepartmentDto(@RequestBody @Valid DepartmentDto departmentDto){
        return "departmentDto is valid";
    }

}
