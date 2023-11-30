package com.BikkadIT.CrudRepositoryMethods.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethods.entities.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
