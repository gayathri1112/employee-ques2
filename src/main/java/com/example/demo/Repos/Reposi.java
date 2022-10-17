package com.example.demo.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Employee;

public interface Reposi extends JpaRepository<Employee,Long>
{

}
