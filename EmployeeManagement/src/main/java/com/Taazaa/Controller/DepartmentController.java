package com.Taazaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Taazaa.Service.DepartmentService;
import com.Taazaa.model.Department;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService departService;
	
	
	@PostMapping("/save")
	public ResponseEntity<String > saveDepart(@RequestBody Department dpt){
		 String str= departService.save(dpt);
		
		
		return  new ResponseEntity<String>("Department "+str+"save",HttpStatus.OK);
		
	}
	
}
