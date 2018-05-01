package com.cpBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.cpBoot.Service.IEmpService;
import com.cpBoot.model.Employee;

@RestController
@RequestMapping("/employee")
@Component
public class EmployeeController {
	@Autowired
	private IEmpService empService;
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmp() {
		return empService.getAllEmployee();
		
	}
	
	@PostMapping("/addEmp")
	public ResponseEntity<Void> addEmp(@RequestBody Employee emp, UriComponentsBuilder result){
		
		boolean flag=empService.addEmp(emp);
		if(flag==false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders hh=new HttpHeaders();
		hh.setLocation(result.path("/addEmp/{eId}").buildAndExpand(emp.geteId()).toUri());
		return new ResponseEntity<Void>(hh, HttpStatus.CREATED);
		
		
	}

}
 