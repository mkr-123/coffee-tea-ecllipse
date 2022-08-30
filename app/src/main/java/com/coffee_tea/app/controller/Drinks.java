package com.coffee_tea.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.service.EmployeeService;


@RestController
@RequestMapping("drink")
public class Drinks {

@Autowired
private EmployeeService employeeService;

@RequestMapping("/getAllEmployees")
public  ResponseEntity<List<Employee>> getAllEmployee(){
	List<Employee> employee=employeeService.findAllEmployees();
	
	return new ResponseEntity<>(employee,HttpStatus.OK);
}
}
