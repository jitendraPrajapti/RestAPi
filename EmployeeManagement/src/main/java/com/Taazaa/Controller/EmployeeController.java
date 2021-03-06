package com.Taazaa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Taazaa.Entity.EmployeeEntity;
import com.Taazaa.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService eService;

	public EmployeeController() {
		System.out.println("EmployeeController.EmployeeController()");
	}

	@PostMapping(value = "/save")
	public ResponseEntity<String> saveEmp(@RequestBody EmployeeEntity emp) {
		Integer id = eService.Insert(emp);

		return new ResponseEntity<String>("employee" + id + "saved", HttpStatus.OK);
	}

	/*
	 * can be used to handle template variables @path variable
	 * 
	 * @GetMapping("/one/{id}") public ResponseEntity<EmployeeEntity>
	 * findOneEmp(@PathVariable Integer id){
	 * 
	 * EmployeeEntity emp= eService.findOne(id); return new
	 * ResponseEntity<EmployeeEntity>(emp,HttpStatus.OK); }
	 * 
	 * @GetMapping("/all") public ResponseEntity<List<EmployeeEntity>> findAll(){
	 * 
	 * List<EmployeeEntity> list=eService.findAll();
	 * 
	 * return new ResponseEntity<List<EmployeeEntity>>(list,HttpStatus.OK);
	 * 
	 * 
	 * }
	 * 
	 * HttpRequest body to a transfer or domain obj automatic deseri @RequestBody
	 * 
	 * @PutMapping("/find/{i[d}") public void Update(@RequestBody Employee
	 * emp,@PathVariable( name="eid") long eid ) { Employee
	 * em=eService.saveEmp(eid); if(em !=null) { eService.Update(emp);
	 * 
	 * 
	 * 
	 * @DeleteMapping("delete/{id}") public ResponseEntity<String>
	 * delete( @PathVariable Integer id){
	 * 
	 * eService.delete(id);
	 * 
	 * return new ResponseEntity<String>("Employee '" +id+ "'delete",
	 * HttpStatus.OK);
	 * 
	 * }
	 */}
