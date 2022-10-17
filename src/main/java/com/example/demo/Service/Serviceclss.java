package com.example.demo.Service;

import java.util.List;
import java.util.Optional;
//<div class="text-center">
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repos.Reposi;
import com.example.demo.model.Employee;

@Service
public class Serviceclss
{
	@Autowired
	Reposi myrepo;
	public  List<Employee> displayData()
	{
		 return myrepo.findAll();
	}
	public void saveDetails(Employee employee)
	{
		myrepo.save(employee);
	}
	public Employee getDet(long id)
	{
		Optional<Employee> id1=myrepo.findById(id);
		return id1.get();
	}
	public void delete(long id)
	{
		myrepo.deleteById(id);
	}
}
