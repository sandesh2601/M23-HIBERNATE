package com.cg.uni.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	
	@Id
	@Column(name="Rollno")
	private int rollno;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Percentage")
	private float percentage;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Streetno")
	private Address address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor for all the fields
	public Student(int rollno, String name, float percentage, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
		this.address = address;
	}


	//setters and getters method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}