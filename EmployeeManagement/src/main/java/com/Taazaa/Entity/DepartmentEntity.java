package com.Taazaa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name="department")

public class DepartmentEntity {
	@Column(name="city" )
	private String City;
	@Column(name="state" )
	private String  state;
	@Column(name="ZipCode" )
	private String ZipCode;


}
