package com.cg.client;

import com.cg.entities.Student;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		StudentService service=new StudentServiceImpl();
		
		Student s=new Student();
		
	/*	//create Operation
		s.setRollno(101);
		s.setName("RAJ");
		service.addStudent(s);
		*/
		 
	/* //create Operation
		s.setRollno(102);
		s.setName("SUYOG");
		service.addStudent(s);
		*/
	/*
		//retrieve data
		s=service.getStudentById(101);
		System.out.println("Student Roll No: "+s.getRollno());
		System.out.println("Student Name: "+s.getName());
		*/
	/*
		//update
		s=service.getStudentById(102);
		s.setName("SANDESH");
		service.updateStudent(s);
		*/
		
	   
		//delete
		s=service.getStudentById(101);
		service.deleteStudent(s);
		System.out.println("DATA DELETED");
		



	}

}