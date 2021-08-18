package com.muhammedessa.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.muhammedessa.models.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
		student.setName(rs.getString("name"));
		student.setId(rs.getInt("id"));
		student.setAge(rs.getString("age"));
		student.setStudent_id(rs.getString("student_id"));
		student.setCity(rs.getString("city"));
		return student;
	}

}
