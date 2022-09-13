package com.cg.bi.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="Department")
public class Department 
{
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="deptname")
	private String DeptName;
	
	
	
	//setters and getters method
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDeptName() {
		return DeptName;
	}
	public void setDeptName(String deptName) {
		DeptName = deptName;
	}
	@Override
	public String toString() {
		return "Department [Id=" + Id + ", DeptName=" + DeptName + "]";
	}
	
	
	
	

}