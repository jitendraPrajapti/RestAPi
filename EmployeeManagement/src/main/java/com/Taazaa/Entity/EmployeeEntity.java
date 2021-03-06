package com.Taazaa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EmpDetails")
public class EmployeeEntity {

	@Id
	@GeneratedValue
	private Integer eid;
	@Column(name = "ename")
	private String ename;
	@Column(name = "Email")
	private String Email;
	@Column(name = "mobile", length = 10)
	private String mobile;
	@Column(name="role")
	private String role;

}
