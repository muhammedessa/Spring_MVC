package com.muhammed.dao;

import java.util.List;

import com.muhammed.model.Student;

public interface StudentDAO {
	
	List<Student> getAllStudent();
	void saveStudent (Student student);

}
