package com.example.EmployeeExp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
	@GetMapping("/retrieve")
	public Employee getEmp() {
		Employee ob=new Employee(1,"Aryan");
		return ob;
	}
	@GetMapping("/")
	public String getthis() {
		return "Welcome Sir";
	}
}
