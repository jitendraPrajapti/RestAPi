package com.Taazaa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="EmpDetails")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	 private Integer Eid;
	@Column(name="ename")
	 private String ename;
	@Column(name="Email")
	 private String Email;
	@Column(name="Mobile")
	 private String Mobile;
	@Column(name="Role")
	 private String Role;
}
