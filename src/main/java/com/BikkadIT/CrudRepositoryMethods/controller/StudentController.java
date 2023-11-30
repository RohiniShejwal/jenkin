package com.BikkadIT.CrudRepositoryMethods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepositoryMethods.entities.Student;
import com.BikkadIT.CrudRepositoryMethods.service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI; 
	
	    public String saveStudent(Student stu) {
		boolean saveStudent = studentServiceI.saveStudent(stu);
		if (saveStudent) {
			return "Student Saved Successfully";
		}else {
		return "Student not saved";

	}
  }
	   
	    public String saveAllStudent(List<Student> student) {
			
	    	boolean save = studentServiceI.saveAllStudent(student);
	    	if(save) {
	    		return "All records saved successfully";
	    		
	    	}else
	    	return "Record not saved";
	    	
	    } 
	    
	    public Student getStudentById(int sid) {
		
		   Student stu = studentServiceI.getStudentById(sid);
		   return stu;
	}
	    
	    public List<Student> getStudentsByMP(List<Integer> ids){
			
	    	List<Student> findAll = studentServiceI.getStudentsByMP(ids);
	    	return findAll;
	    	
	    }
	    	
	    public List<Student> getAllRecords(){
				List<Student> findAll = studentServiceI.getAllRecords();
	    		
	    		return findAll;
	    		
	    }
	    
	    public boolean checkRecord(int sid) {
			boolean find = studentServiceI.CheckRecord(sid);
	    	return find;
	    	
	    }
	    
	    public long counttotalRecords() {
			long counttotalRecords = studentServiceI.counttotalRecords();
	    	return counttotalRecords;
	    	
	    }
	    
	    public String DeleteRecordById(int id) {
			String deleteRecordById = studentServiceI.DeleteRecordById(id);
	    	
	    	return deleteRecordById;
	    	
	    }
	    
	    public String deleteRecordByEntity(Student stu) {
			String deleteRecordByEntity = studentServiceI.deleteRecordByEntity(stu);
	    	
			return deleteRecordByEntity;
	    }
	    	
	    	
	    	
	    	
	    	}
