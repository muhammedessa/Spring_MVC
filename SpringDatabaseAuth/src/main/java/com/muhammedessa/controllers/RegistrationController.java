package com.muhammedessa.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
import com.muhammedessa.dao.UserDao; 
import com.muhammedessa.models.User;

@Controller
public class RegistrationController {

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("register");
	    mav.addObject("user", new User()); 
	    return mav;
	  }

	  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("user") User user) {

		  userDao.register(user);

	  return new ModelAndView("index", "firstname", user.getFullname());
	  }
	  
}
