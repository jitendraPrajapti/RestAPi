package com.Taazaa.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Taazaa.Entity.EmployeeEntity;
@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {



}
