package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Student;

public class StudentDaoImpl implements StudentDao
{
	
	private EntityManager em;
	

	public StudentDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
	}

	@Override
	public void addStudent(Student s) {
		em.persist(s);
		
	}

	@Override
	public void updateStudent(Student s) {
		em.merge(s);
		
	}

	@Override
	public void deleteStudent(Student s) {
		em.remove(s);
		
	}

	@Override
	public Student getStudentById(int rollno) {
		Student s=em.find(Student.class, rollno);
		return s;
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}