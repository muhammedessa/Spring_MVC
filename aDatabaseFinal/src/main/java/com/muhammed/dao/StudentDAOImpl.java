package com.muhammed.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository; 
import org.springframework.jdbc.core.JdbcTemplate;
import com.muhammed.model.Student;
import com.muhammed.rowmapper.StudentRowMapper;


@Repository
public class StudentDAOImpl implements StudentDAO {
	  
	   
	private JdbcTemplate jdbcTemplate;

	public StudentDAOImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}
	    
	@Override
	public List<Student> getAllStudent() {
		String sql = "SELECT * FROM muhammed.student;";
		List<Student> students  =  jdbcTemplate.query(sql , new StudentRowMapper());
		return students;
	}

	@Override
	public void saveStudent(Student student) {
		Object[] studentInfo = { 
				student.getStudent_id() , student.getName() ,
				student.getCity() , student.getAge()};
				String sql = "INSERT INTO muhammed.student(student_id, name,city,age) VALUES(?,?,?,?);";
		 
	 jdbcTemplate.update(sql,studentInfo);
	 System.out.println("student info added successfully !");
	}
	
	@Override
	public Student getStudentById(int id){    
	    String sql="select * from muhammed.student where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new StudentRowMapper());    
	}  
	
	@Override
	public int update(Student student){  
		
    String sql=  "  UPDATE `student` SET `student_id`='"
            +student.getStudent_id()+"',`name`='"
	      +student.getName()+"',`city`='"
            +student.getCity()+"',`age`='"
	      +student.getAge()+"' WHERE `id`="+student.getId();
	     
	    return jdbcTemplate.update(sql);    
	}   
	
	@Override
	public int delete(int id){    
	    String sql="delete from muhammed.student where id="+id+"";    
	    return jdbcTemplate.update(sql);    
	}    

}
