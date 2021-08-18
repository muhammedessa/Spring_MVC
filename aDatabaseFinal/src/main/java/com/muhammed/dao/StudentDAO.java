package com.muhammed.dao;

import java.util.List;

import com.muhammed.model.Student;


//The Data Access Object (DAO) pattern is a structural pattern 
//that allows us to isolate the application/business layer from 
//the persistence layer (usually a relational database, 
//but it could be any other persistence mechanism) using an abstract API.

//The functionality of this API is to hide from the application 
//all the complexities involved in performing CRUD operations 
//in the underlying storage mechanism. 
//This permits both layers to evolve separately without knowing 
//anything about each other.



public interface StudentDAO {
	
	List<Student> getAllStudent();
	void saveStudent (Student student);
	Student getStudentById(int id);
	int update( Student student);
	int delete(int id);
}










