package com.muhammedessa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.muhammedessa.dao.StudentDAO;
import com.muhammedessa.dto.StudentDTO;
import com.muhammedessa.models.Student;

@Controller
public class StudentController {
	
	@Autowired
	private StudentDAO studentDAO;
	 
	
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String homePage() { 
		return "index";
	}
	
	
	@RequestMapping(value="/showStudent", method=RequestMethod.GET)
	public String showStudentInfo(Model model) {
		List<Student> students = studentDAO.getAllStudents();
		
		for(Student stu:students) {
			System.out.println(stu);
		}
		model.addAttribute("students",students);
		return "student-list";
	}
	
	@RequestMapping(value="/addStudent", method=RequestMethod.GET)
	public String addStudent(Model model) {
		 StudentDTO studentDTO = new StudentDTO();
		model.addAttribute("student",studentDTO);
		return "add-student";
	}
	
	@RequestMapping(value="/saveStudent", method=RequestMethod.POST)
	public String addStudent(Student  student) {
		studentDAO.saveStudent(student); 
		return "redirect:/showStudent";
	}
	
	@RequestMapping(value="/edit", method=RequestMethod.GET)
	public String editStudent(@RequestParam int id,Model model) {
		Student student = studentDAO.getStudentById(id);
		model.addAttribute("student",student);
		return "edit-student";
	}
	
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public String updateStudent(Student  student) {
		studentDAO.update(student);
		return "redirect:/showStudent";
	}
	
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public String deleteStudent(@PathVariable int id) {
		 studentDAO.delete(id);
		return "redirect:/showStudent";
	}

}
