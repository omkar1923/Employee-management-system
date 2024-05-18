package com.qsp.employee_management_system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qsp.employee_management_system.dao.EmployeeDao;
import com.qsp.employee_management_system.dto.Employee;
import com.qsp.employee_management_system.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee) {
		return service.save(employee);

	}

	@PostMapping("/saveAll")
	public List<Employee> saveAll(@RequestBody List<Employee> list) {
		return service.saveAll(list);
	}

	@GetMapping("/findById")
	public Employee find(@RequestParam int id) {
		return service.find(id);
	}

	@GetMapping("/find/phone")
	public Employee phone(@RequestParam long phone) {
		return service.phone(phone);
	}

	@GetMapping("/find/email")
	public Employee email(@RequestParam String email) {
		return service.email(email);
	}

	@GetMapping("/findAll")
	public List<Employee> findAll() {
		return service.findAll();
	}

	@GetMapping("/find/name")
	public List<Employee> name(String name) {
		return service.name(name);
	}

	@GetMapping("/find/address")
	public List<Employee> address(String address) {
		return service.address(address);
	}

	@GetMapping("/find/designation")
	public List<Employee> designation(String designation) {
		return service.designation(designation);
	}

	@GetMapping("/login")
	public Employee login(@RequestParam String name, @RequestParam String password) {
		return service.login(name, password);
	}

//    Delete
	@DeleteMapping("/deleteById")
	public Employee delete(@RequestParam int id) {
		return service.delete(id);
	}

	@DeleteMapping("/delete/email")
	public Employee deleteByemail(@RequestParam String email) {
		return service.deleteByemail(email);
	}

	@DeleteMapping("/delete/phone")
	public Employee deleteByphone(@RequestParam long phone) {
		return service.deleteByphone(phone);
	}

	@DeleteMapping("/delete/name")
	public List<Employee> deleteByName(@RequestParam String name) {
		return service.deleteByName(name);
	}

	@DeleteMapping("/delete/designation")
	public List<Employee> deleteByDesignation(@RequestParam String designation) {
		return service.deleteByDesignation(designation);
	}

	@DeleteMapping("/delete/address")
	public List<Employee> deleteByAddress(@RequestParam String address) {
		return service.deleteByAddress(address);
	}

	@DeleteMapping("/delete/all")
	public List<Employee> deleteAll() {
		return service.deleteAll();
	}

//	update
	@PutMapping("/update")
	public Employee update(@RequestParam int id, @RequestBody Employee employee) {
		return service.update(id, employee);
	}

	@PatchMapping("/update/phone")
	public Employee updatePhone(@RequestParam int id, @RequestParam Long phone) {
		return service.updatePhone(id, phone);
	}

	@PatchMapping("/update/name")
	public Employee updateName(@RequestParam int id, @RequestParam String name) {
		return service.updateName(id, name);
	}

	@PatchMapping("/update/email")
	public Employee updateEmail(@RequestParam int id, @RequestParam String email) {
		return service.updateEmail(id, email);
	}

	@PatchMapping("/update/designation")
	public Employee updateDesignation(@RequestParam int id, @RequestParam String designation) {
		return service.updateDesignation(id, designation);
	}

	@PatchMapping("/update/salary")
	public Employee updateSalary(@RequestParam int id, @RequestParam double salary) {
		return service.updateSalary(id, salary);
	}

	@PatchMapping("/update/passwordByID")
	public Employee updatePasswordById(@RequestParam int id, @RequestParam String password) {
		return service.updatePasswordById(id, password);
	}

	@PatchMapping("/update/passwordByEmail")
	public Employee updatePasswordByEmail(@RequestParam String email, @RequestParam String password) {
		return service.updatePasswordByEmail(email, password);
	}

	@PatchMapping("/update/passwordByPhone")
	public Employee updatePasswordByPhone(@RequestParam long phone, @RequestParam String password) {
		return service.updatePasswordByPhone(phone, password);
	}
//	salary find by query

	@GetMapping("find/salary/lessthan")
	public List<Employee> findLessThanSalary(@RequestParam double salary) {
		return service.findLessThanSalary(salary);
	}

	@GetMapping("find/salary/greaterthan")
	public List<Employee> findGreaterThanSalary(@RequestParam double salary) {
		return service.findGreaterThanSalary(salary);
	}

	@GetMapping("find/salary/between")
	public List<Employee> findSalaryBtwn(@RequestParam double salary1, @RequestParam double salary2) {
		return service.findSalaryBtwn(salary1, salary2);
	}
}
