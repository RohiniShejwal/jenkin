package com.BikkadIT.CrudRepositoryMethods.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethods.entities.Student;
import com.BikkadIT.CrudRepositoryMethods.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI{

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public boolean saveStudent(Student stu) {
		
		Student student= studentRepository.save(stu);
		
		if(student != null) {
			return true;
		}else
		return false;
	}

	@Override
	public boolean saveAllStudent(List<Student> student) {
		
		List<Student> save = (List<Student>) studentRepository.saveAll(student);
		
		if(save.isEmpty()) {
			return true;
		}else
		return false;
	}

	@Override
	public Student getStudentById(int sid) {
		
		Student stu = studentRepository.findById(sid).get();
		
		return stu;
	}

	@Override
	public List<Student> getStudentsByMP(List<Integer> ids) {
		List<Student> findAll = (List<Student>) studentRepository.findAllById(ids);
		return findAll;
	}

	@Override
	public List<Student> getAllRecords() {
		List<Student> findAll = (List<Student>) studentRepository.findAll();
		return findAll;
	}

	@Override
	public boolean CheckRecord(int sid) {
		boolean find = studentRepository.existsById(sid);
		return find;
	}

	@Override
	public long counttotalRecords() {
		long count = studentRepository.count();
		return count;
	}

	@Override
	public String DeleteRecordById(int id) {
		
		boolean existsById = studentRepository.existsById(id);
		if(existsById) {
		studentRepository.deleteById(id);
		return "Record Deleted";
	     }else {  
		return "Record not Deleted";
	     }
	}

	@Override
	public String deleteRecordByEntity(Student stu) {
	    int sid = stu.getSid();
	    boolean existsById = studentRepository.existsById(sid);
		if(existsById) {
		studentRepository.deleteById(sid);
		return "Record Deleted";
	     }else {  
		return "Record not Deleted";
	     }
	}

	@Override
	public List<Student> deleteRecordByMP(List<Integer> ids) {
	    studentRepository.deleteAllById(ids);
	    
		return null;
	}
}
