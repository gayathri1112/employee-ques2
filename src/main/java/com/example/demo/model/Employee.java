package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "table")
public class Employee {
@Id

	private long id;
@Column(name = "name")
	private String name;
@Column(name = "salary")
private double salary;

	public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary =salary;
}
	
	public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
