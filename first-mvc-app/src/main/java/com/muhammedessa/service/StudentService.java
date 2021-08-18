package com.muhammedessa.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.muhammedessa.models.Student;

@Service
public class StudentService {
	
	private static int studentNumber = 4;
	private static List<Student> students = new ArrayList<Student>();
	
	static {
		students.add(new Student(1,"Muhammed Essa", "14-06-1984" , true));
		students.add(new Student(2,"Ahmed Ghassan", "24-03-1994" , true));
		students.add(new Student(3,"Osama Hassan", "10-12-1974" , true));
		students.add(new Student(4,"Ali Walid", "01-01-1964" , true));
	}
	
	public List<Student> readAllStudentd(){
		List<Student> student = new ArrayList<Student>();
		for(Student st : students) { 
				student.add(st); 
		}
		return student;
	}
	
	
	public void addStudent(String name, String date, boolean isActive) {
		students.add(new Student(++studentNumber,name, date , isActive));
	}
	
	public void deleteStudent(int id) {
		Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id) {
				iterator.remove();
			}
		}
	}
	
 
 public Student getStudentInfo(int id) {
	 for(Student student:students) {
		 if(student.getId() == id) {
			 return student;
		 }
	 }
	 return null;
 }
 
 public void updateStudent(
		 int id, String name,
		 String date,boolean isActive) {
	 Iterator<Student> iterator = students.iterator();
		while(iterator.hasNext()) {
			Student student = iterator.next();
			if(student.getId() == id) {
				student.setName(name);
				student.setDate(date);
			}
		}
	 
 }
	
	

}
