package com.Taazaa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Taazaa.model.Department;

public interface DepartmentRepo extends JpaRepository<Department,  Integer> {

}
