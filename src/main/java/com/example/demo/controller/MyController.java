package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.Service.Serviceclss;
import com.example.demo.model.Employee;
@Controller
public class MyController
{
	@Autowired
	Serviceclss service;
	@RequestMapping("/")
	public String showHomePage(Model model)
	{
		System.out.println("Display is called");
		List<Employee> list= service.displayData();
		for(Employee employee : list)
		{
			System.out.println(employee.getId()+ " "+employee.getName()+""+employee.getSalary());
		}
		model.addAttribute("abc", service.displayData());
		return "show";
	}
	@RequestMapping("/addData")
	public String newData(Model model)
	{
		Employee employee= new Employee();
		model.addAttribute("employee", employee);
		return "add_pro";
	}
	@RequestMapping(value =  "/save" , method = RequestMethod.POST)
	public String saveData(@ModelAttribute("employee")Employee employee)
	{
		service.saveDetails(employee);
		return "redirect:/";
	}
	@RequestMapping("edit{id}")
	public ModelAndView editData(@PathVariable(name = "id") long id)
	{
		ModelAndView view = new ModelAndView("edit_data");
		Employee employee = service.getDet(id);
		view.addObject("employee", employee);
		return view;
	}

	@RequestMapping("/delete/{id}")
	public String deleteData(@PathVariable(name = "id") long id)
	{

		service.delete(id);
		return "redirect:/";
	}
}





