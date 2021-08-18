package com.muhammed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    
    
    
    
    @RequestMapping(value="/edit")    
    public String edit(@RequestParam int id, Model m){    
    	Student student=studentDAO.getStudentById(id);    
        m.addAttribute("student",student);  
        return "editform";    
    }    
    /* It updates model object. */    
    @RequestMapping(value="/update",method = RequestMethod.POST)    
    public String editsave(  Student student){  
 	 System.out.println( student.getId()  );
     	studentDAO.update(student);    
        return "redirect:/showStudent";    
    }   
    
    
    /* It deletes record for the given id in URL and redirects to /viewemp */    
    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
    	studentDAO.delete(id);    
        return "redirect:/showStudent";    
    }     
    
}






