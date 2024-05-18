package com.qsp.employee_management_system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.qsp.employee_management_system.dao.EmployeeDao;
import com.qsp.employee_management_system.dto.Employee;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDao dao;

	public Employee save(Employee employee) {

		double salary = employee.getSalary();
		if (salary <= 10000) {
			employee.setGrade('D');
		} else if (salary > 10000 && salary < 20000) {
			employee.setGrade('C');
		} else if (salary > 20000 && salary < 40000) {
			employee.setGrade('B');
		} else {
			employee.setGrade('A');
		}
		return dao.save(employee);

	}

	public List<Employee> saveAll(@RequestBody List<Employee> list) {
		for (Employee employee : list) {
			double salary = employee.getSalary();
			if (salary <= 10000) {
				employee.setGrade('D');
			} else if (salary > 10000 && salary < 20000) {
				employee.setGrade('C');
			} else if (salary > 20000 && salary < 40000) {
				employee.setGrade('B');
			} else {
				employee.setGrade('A');
			}

		}
		return dao.saveAll(list);
	}

	public Employee find(@RequestParam int id) {
		return dao.find(id);
	}

	public Employee phone(@RequestParam long phone) {
		return dao.findByPhone(phone);
	}

	public Employee email(@RequestParam String email) {
		return dao.findByEmail(email);
	}

	public List<Employee> findAll() {
		return dao.findAll();
	}

	public List<Employee> name(String name) {
		return dao.findByName(name);
	}

	public List<Employee> address(String address) {
		return dao.findByAddress(address);
	}

	public List<Employee> designation(String designation) {
		return dao.findByDesignation(designation);
	}

	public Employee login(@RequestParam String name, @RequestParam String password) {
		return dao.login(name, password);
	}

//    Delete

	public Employee delete(@RequestParam int id) {
		return dao.remove(id);
	}

	
	
	public Employee deleteByemail(@RequestParam String email) {
		return dao.deleteByEmail(email);
	}

	public Employee deleteByphone(@RequestParam long phone) {
		return dao.deleteByPhone(phone);
	}

	public List<Employee> deleteByName(@RequestParam String name) {
		return dao.deleteByName(name);
	}

	public List<Employee> deleteByDesignation(@RequestParam String designation) {
		return dao.deleteByDesignation(designation);
	}

	public List<Employee> deleteByAddress(@RequestParam String address) {
		return dao.deleteByAddress(address);
	}

	public List<Employee> deleteAll() {
		return dao.deleteAll();
	}

//	update

	public Employee update(@RequestParam int id, @RequestBody Employee employee) {
		return dao.update(id, employee);
	}

	public Employee updatePhone(@RequestParam int id, @RequestParam Long phone) {
		return dao.updatePhone(id, phone);
	}

	public Employee updateName(@RequestParam int id, @RequestParam String name) {
		return dao.updateName(id, name);
	}

	public Employee updateEmail(@RequestParam int id, @RequestParam String email) {
		return dao.updateEmail(id, email);
	}

	public Employee updateDesignation(@RequestParam int id, @RequestParam String designation) {
		return dao.updateDesignation(id, designation);
	}

	public Employee updateSalary(@RequestParam int id, @RequestParam double salary) {
		return dao.updateSalary(id, salary);
	}

	public Employee updatePasswordById(@RequestParam int id, @RequestParam String password) {
		return dao.updatePasswordById(id, password);
	}

	public Employee updatePasswordByEmail(@RequestParam String email, @RequestParam String password) {
		return dao.updatePasswordByEmail(email, password);
	}

	public Employee updatePasswordByPhone(@RequestParam long phone, @RequestParam String password) {
		return dao.updatePasswordByPhone(phone, password);
	}
//	salary find by query

	public List<Employee> findLessThanSalary(@RequestParam double salary) {
		return dao.findLessThanSalary(salary);
	}

	public List<Employee> findGreaterThanSalary(@RequestParam double salary) {
		return dao.findGreaterThanSalary(salary);
	}

	public List<Employee> findSalaryBtwn(@RequestParam double salary1, @RequestParam double salary2) {
		return dao.findSalaryBtwn(salary1, salary2);
	}

}
