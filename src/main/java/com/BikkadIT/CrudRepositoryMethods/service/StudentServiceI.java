package com.BikkadIT.CrudRepositoryMethods.service;

import java.util.List;

import com.BikkadIT.CrudRepositoryMethods.entities.Student;

public interface StudentServiceI {

	public boolean saveStudent(Student stu);
	
	public boolean saveAllStudent(List<Student> student);
	
	public Student getStudentById(int sid);
	
	public List<Student> getStudentsByMP(List<Integer> ids);

	public List<Student> getAllRecords();

	public boolean CheckRecord(int sid);
	
	public long counttotalRecords();
	
	public String DeleteRecordById(int id);
	
	public String deleteRecordByEntity(Student stu);
	
	public List<Student> deleteRecordByMP(List<Integer> ids);
	
	

}
