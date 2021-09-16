package com.Taazaa.Service;

import java.util.List;

import com.Taazaa.Entity.EmployeeEntity;



public interface EmployeeService {

	public Integer Insert(EmployeeEntity emp);

	EmployeeEntity findOneEmp(Integer id);

	public List<EmployeeEntity> findAll();

	void delete(Integer eid);

	void Update(EmployeeEntity emp);

	
}
