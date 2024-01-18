
package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentDao {

	//Implementing Dependency Injection for ProductRepository
		@Autowired
		StudentRepository studentRepository;

		public List<Student> getAllStudents() {
			
			return studentRepository.findAll();
		}
}
