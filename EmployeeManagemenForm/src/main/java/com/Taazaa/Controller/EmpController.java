package com.Taazaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Taazaa.Model.Employee;
import com.Taazaa.Service.EmpService;
@Controller 
@RequestMapping(name="employee")
public class EmpController {
	
	 @Autowired 
	 private EmpService empservice;
	
	@GetMapping("/save")
	public String loadForm(Model model) {
		  Employee e=new Employee();
		  model.addAttribute("employee", e);
		
		 return "index";
	}
	
	 @PostMapping(name="/AddEmp")
	  public String HandlesubmitBtn(@ModelAttribute("emp") Employee emp,Model model) {
	boolean IsSaved=	empservice.insert(emp);
	if(IsSaved) {
		model.addAttribute("succMsg", "Successfully saved");
	}
	else {
		model.addAttribute("errmgs", "Failed");
	}
		  return "index";
	 }
}
