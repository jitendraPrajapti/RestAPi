package com.Taazaa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Taazaa.Model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
