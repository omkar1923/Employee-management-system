package com.qsp.employee_management_system.dto;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
@Entity
@Data
@Table(name = "employeeInfo")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employeeId")
	private int id;
	@Column(name = "employeeName")
	private String name;
	@Column(name = "employeePhone", unique = true)
	private long phone;
	@Column(name = "employeeAddress")
	private String address;
	@Column(name = "employeeEmail", unique = true)
	private String email;
	@Column(name = "employeePassword")
	private String password;
	@Column(name = "employeeSalary")
	private double salary;
	@Column(name = "employeeDesignation")
	private String designation;
	@Column(name = "employeeGrade")
	private char grade;

}
