package com.qsp.employee_management_system.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsp.employee_management_system.dto.Employee;
import com.qsp.employee_management_system.repo.EmployeeRepo;

@Repository

public class EmployeeDao {
	@Autowired
	private EmployeeRepo repo;

	public Employee save(Employee employee) {
		return repo.save(employee);

	}

	public List<Employee> saveAll(List<Employee> list) {
		// TODO Auto-generated method stub
		return repo.saveAll(list);
	}

	public Employee remove(int id) {
		Optional<Employee> optional = repo.findById(id);
		if (optional.isPresent()) {
			repo.delete(optional.get());
			return optional.get();
		} else {
			return null;
		}
	}

	public Employee find(int id) {
		Optional<Employee> employee = repo.findById(id);
		if (employee != null) {
			return employee.get();
		} else {
			return null;
		}
	}

	public List<Employee> findAll() {
		return repo.findAll();
	}

	public Employee update(int id, Employee employee) {
		Optional<Employee> optional = repo.findById(id);
		if (optional.isPresent()) {
			employee.setId(id);
			repo.save(employee);
			return employee;

		} else {
			return null;
		}

	}

	public Employee login(String userName, String password) {
		try {
			long phoneNo = Long.parseLong(userName);
			Employee employee = repo.findByPhone(phoneNo);
			if (employee != null) {
				if (password.equals(employee.getPassword())) {
					return employee;
				} else {
					return null;
				}
			}

		} catch (Exception e) {
			Employee employee = repo.findByEmail(userName);
			if (employee != null) {
				if (password.equals(employee.getPassword())) {
					return employee;
				} else {
					return null;
				}
			}

		}
		return null;
	}

	public List<Employee> findByName(String name) {
		return repo.findByName(name);
	}

	public List<Employee> findByAddress(String address) {

		return repo.findByAddress(address);
	}

	public List<Employee> findByDesignation(String designation) {
		// TODO Auto-generated method stub
		return repo.findByDesignation(designation);
	}
	public Employee findByPhone(long phone) {
		
		return repo.findByPhone(phone);
	}

	public Employee findByEmail(String email) {
		// TODO Auto-generated method stub
		return repo.findByEmail(email);
	}
	
	public Employee deleteByEmail(String email) {
		// TODO Auto-generated method stub
		Employee employee = repo.findByEmail(email);
		if (employee != null) {
			repo.delete(employee);
			return employee;

		}
		return null;

	}

	public Employee deleteByPhone(long phone) {
		Employee employee = repo.findByPhone(phone);
		if (employee != null) {
			repo.delete(employee);
			return employee;

		}
		return null;
	}

	public List<Employee> deleteByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> employee = repo.findByName(name);
		if (employee != null) {
			repo.deleteAll(employee);
			return employee;

		}
		return null;
	}

	public List<Employee> deleteByDesignation(String designation) {
		// TODO Auto-generated method stub
		List<Employee> employee=repo.findByDesignation(designation);
		if(employee!=null) {
			repo.deleteAll(employee);
			return employee;
			
		}
		return null;
}

	public List<Employee> deleteByAddress(String address) {
		List<Employee> employee = repo.findByAddress(address);
		if (employee != null) {
			repo.deleteAll(employee);
			return employee;

		}
		return null;
	}

	public List<Employee> deleteAll() {
		// TODO Auto-generated method stub
		repo.deleteAll();
		return repo.findAll();
	}

	public Employee updatePhone(int id, long phone) {

		Employee employee = repo.getById(id);
		if (employee != null) {

			employee.setPhone(phone);
			repo.save(employee);
			return employee;
		} else {
			return null;
		}

	}

	public Employee updateName(int id, String name) {
		Optional<Employee> optional = repo.findById(id);
		if (optional.isPresent()) {
			Employee employee = optional.get();
			employee.setName(name);
			repo.save(employee);
			return employee;
		} else {
			return null;
		}
	}

	public Employee updateEmail(int id, String email) {
		Optional<Employee> optional = repo.findById(id);
		if (optional != null) {
			Employee employee = optional.get();
			employee.setEmail(email);
			repo.save(employee);
			return employee;

		}
		return null;
	}

	public Employee updateDesignation(int id, String designation) {
		Optional< Employee>optional=repo.findById(id);
		if(optional!=null) {
			Employee employee=optional.get();
			employee.setDesignation(designation);
			repo.save(employee);
			return employee;
		}
		return null;
	}

	public Employee updateSalary(int id, double salary) {
		Optional<Employee> optional = repo.findById(id);
		if (optional != null) {
			Employee employee = optional.get();
			employee.setSalary(salary);
			repo.save(employee);
			return employee;

		}
		return null;
	}

	public Employee updatePasswordById(int id, String password) {
		Optional<Employee> optional = repo.findById(id);
		if (optional != null) {
			Employee employee = optional.get();
			employee.setPassword(password);
			repo.save(employee);
			return employee;

		}
		return null;
	}

	public Employee updatePasswordByEmail(String email, String password) {
		Employee employee = repo.findByEmail(email);
		if (employee != null) {
			employee.setPassword(password);
			return employee;
		}
		return null;
	}

	public Employee updatePasswordByPhone(long phone, String password) {
		Employee employee = repo.findByPhone(phone);
		if (employee != null) {
			employee.setPassword(password);
			return employee;
		}
		return null;
	}

	public List<Employee> findLessThanSalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryLessThan(salary);
	}

	public List<Employee> findGreaterThanSalary(double salary) {
		// TODO Auto-generated method stub
		return repo.findBySalaryGreaterThan(salary);
	}

	public List<Employee> findSalaryBtwn(double salary1, double salary2) {
		// TODO Auto-generated method stub
		return repo.findBySalaryBetween(salary1, salary2);
	}

}
