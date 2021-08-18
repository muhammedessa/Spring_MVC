package com.muhammed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod; 
import com.muhammed.api.StudentDTO;
import com.muhammed.dao.StudentDAO;
import com.muhammed.model.Student; 

@Controller
public class StudentController {

     @Autowired
       private StudentDAO studentDAO  ;
	
    @RequestMapping(value="/showStudent" , method=RequestMethod.GET) 
	public String showStudentInfo(Model model) { 
    	 
    	List<Student> students = studentDAO.getAllStudent();
    	
    	for(Student stu : students) {
    		System.out.println(stu);
    	}
    	
    	model.addAttribute("students", students);
    	
		return "student-list";
	}
    
    
    
    @RequestMapping(value="/addStudent" , method=RequestMethod.GET) 
	public String addStudent(Model model) { 
    	StudentDTO studentDTO = new StudentDTO();
    	model.addAttribute("student", studentDTO);
		return "add-student";
	}
    
    
    
    @RequestMapping(value="/saveStudent" , method=RequestMethod.POST) 
	public String saveStudent( Student student ) { 
    //	System.out.println(studentDTO);
    	studentDAO.saveStudent(student);
		return "redirect:showStudent";
	}
    
}






