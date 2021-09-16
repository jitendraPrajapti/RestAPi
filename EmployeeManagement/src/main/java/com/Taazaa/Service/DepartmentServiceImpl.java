package com.Taazaa.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.Taazaa.Repo.DepartmentRepo;
import com.Taazaa.model.Department;

public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepo deptRepo;

	@Override
	public String save(Department dpt) {
		// TODO Auto-generated method stub
		 String str=deptRepo.save(dpt).getZipCode();
		
		return str;
	}

}
