package com.BikkadIT.CrudRepositoryMethods;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.CrudRepositoryMethods.controller.StudentController;
import com.BikkadIT.CrudRepositoryMethods.entities.Student;

@SpringBootApplication
public class CrudRepositoryMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethodsApplication.class, args);
		StudentController bean = context.getBean(StudentController.class);
		
//		Student stu = new Student();
//		stu.setSid(1);
//		stu.setSname("Rohini");
//		stu.setSaddress("nashik");
//		stu.setSrank(5);
//		stu.setSemail("rohini@gmail");
//		stu.setSpassword("2212");
//		
//		//save method
		//String result = bean.saveStudent(stu);
//		System.out.println(result);
//		
//		Student stu1 = new Student();
//		stu1.setSid(2);
//		stu1.setSname("Sopan");
//		stu1.setSaddress("pune");
//		stu1.setSrank(2);
//		stu1.setSemail("sopan@gmail");
//		stu1.setSpassword("2213");
//
//
//		Student stu2 = new Student();
//		stu2.setSid(3);
//		stu2.setSname("Suraj");
//		stu2.setSaddress("mumbai");
//		stu2.setSrank(3);
//		stu2.setSemail("suraj@gmail");
//		stu2.setSpassword("2214");
//
//				
//		List<Student> list = new ArrayList();
//		list.add(stu);
//		list.add(stu1);
//		list.add(stu2);
		
		// saveAll method
//	    bean.saveAllStudent(list);
	
		//findById method
		
//		Student stu = bean.getStudentById(2);
//		System.out.println(stu);
		
		
		//findAllById
		
//		List<Integer> l = new ArrayList();
//		l.add(2);
//		l.add(3);
//		
//		List<Student> findAll = bean.getStudentsByMP(l);
//		System.out.println(findAll);
		
		//findAll
		
//		List<Student> findAll = bean.getAllRecords();
//		System.out.println(findAll);
		
		//existsById
		
//		boolean find = bean.checkRecord(1);
//		System.out.println(find);
		
		//count
		
//		long count = bean.counttotalRecords();
//		System.out.println(count);
		
		//deletebyId
		
//		String delete = bean.DeleteRecordById(2);
//		System.out.println(delete);
		
		//deletebyEntity
		
//		Student stu = new Student();
//		stu.setSid(3);
//		
//		String deleteRecordByEntity = bean.deleteRecordByEntity(stu);
//		System.out.println(deleteRecordByEntity);
	}
}
