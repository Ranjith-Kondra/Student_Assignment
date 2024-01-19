package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;

@Service
public class StudentDao {
	
	//Implementing Dependency Injection for StudentRepository
	@Autowired
	StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public Student getStudentById(int studentId) {
		Student Student = new Student(0, "Student Not Found!!!", "",0.0);
		return studentRepository.findById(studentId).orElse(Student);
	}

	public List<Student> getStudentByName(String studentName) {
		return studentRepository.findByName(studentName);
	}

	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}
	
	public Student updateStudent(Student student) {
		if(getStudentById(student.getStdId()) != null){
			return studentRepository.save(student);
		} else {
			Student Student = new Student(0, "Student Not Found!!!", "",0.0);
			return Student;
		}
	}

	public Student deleteStudentById(int studentId) {
		studentRepository.deleteById(studentId);
		return new Student(0, "Student Deleted successfully!!!", "",0.0);
	}
	
}