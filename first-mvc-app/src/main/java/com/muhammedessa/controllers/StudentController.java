package com.muhammedessa.controllers;
 

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam; 

import com.muhammedessa.models.Student; 
import com.muhammedessa.service.StudentService;
import com.muhammedessa.valiation.CustomValidator;

 
@Controller
public class StudentController {
	 
	@Autowired
	StudentService studentService;
	
	@Autowired
	CustomValidator customValidator;
	
 	
	@RequestMapping(value="/students" , method = RequestMethod.GET)
	public String showStudentPage(ModelMap model) {
		model.addAttribute("students", studentService.readAllStudentd());
		System.out.println(getLoggedInUserName());
		System.out.println(isUserLoggedIn());
		
		return "students";
	}
	
	@RequestMapping(value="/add-student" , method = RequestMethod.GET)
	public String addStudentPage() {  
	//	throw new RuntimeException("This is test exception");
		return "add";
	}
	
	@RequestMapping(value="/add-student" , method = RequestMethod.POST)
	public String addToStudent( ModelMap model,  Student student ) 
	{   
		
		 if(!customValidator.checkNameLength(student.getName())) {
			 model.addAttribute("errorName", "name must be more than 3 chars");
			 return "add";
		 }
		studentService.addStudent( student.getName(), student.getDate(), false);
		return "redirect:students";
	}
	
	@RequestMapping(value="/delete-student" , method = RequestMethod.GET)
	public String deleteStudent(
			ModelMap model,
			@RequestParam int id 
			) { 
		studentService.deleteStudent(id);
		model.clear(); 
		return "redirect:students";
	}
	
 
	@RequestMapping(value="/edit-student" , method = RequestMethod.GET)
	public String editStudentPage(ModelMap model,  @RequestParam int id) {  
		model.addAttribute("student", studentService.getStudentInfo(id));
		return "update";
	}
	
	@RequestMapping(value="/update-student" , method = RequestMethod.POST)
	public String updateStudent( ModelMap model,  Student student ) 
	{   
		 System.out.println(student.getId());
		 
		studentService.updateStudent(
				student.getId(), student.getName(), 
				student.getDate(), student.getIsActive());
		return "redirect:students";
	}
	
	
	
	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}
	
	
	
	boolean isUserLoggedIn(){
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();
		if (principal instanceof UserDetails) {
			return true;
		}else {
			return false;
		} 
		}
	
	 
}
