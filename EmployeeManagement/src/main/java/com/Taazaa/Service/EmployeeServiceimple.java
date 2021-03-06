package com.Taazaa.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Taazaa.Entity.EmployeeEntity;
import com.Taazaa.Repo.EmployeeRepo;
import com.Taazaa.ExceptionHandler.*;

@Service
public class EmployeeServiceimple implements EmployeeService {

	private EmployeeRepo emprepo;

	@Override
	public Integer Insert(EmployeeEntity emp) {
		// TODO Auto-generated method stub
		Integer id = emprepo.save(emp).getEid();

		return id;
	}

	@Override
	public EmployeeEntity findOneEmp(Integer id) {

		Optional<EmployeeEntity> eomp = emprepo.findById(id);
		EmployeeEntity emp = emprepo.orElseThrow(() -> new EmployeeNotFound("Employee Not Found"));
		return emp;
	}

	@Override
	public List<EmployeeEntity> findAll() {
		List<EmployeeEntity> list = emprepo.findAll();

		return list;
	}

	@Override
	public void delete(Integer eid) {
		// TODO Auto-generated method stub
		EmployeeEntity emp = findOneEmp(eid);
		emprepo.delete(emp);

	}

	@Override
	public void Update(EmployeeEntity emp) {
		// TODO Auto-generated method stub

	}

}
