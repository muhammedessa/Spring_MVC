package com.muhammedessa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.muhammedessa.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {
	
	//LoginService loginservice = new LoginService();
	
//	@Autowired
//	LoginService loginservice;
//	
//	@RequestMapping(value="/login" , method = RequestMethod.GET)
//	//@ResponseBody
//	public String loginPage() {
//		return "login";
//	}
//	
//	
//	@RequestMapping(value="/login" , method = RequestMethod.POST)
//	 
//	public String getLoginInfo(
//			@RequestParam String name,
//			@RequestParam String password,
//			ModelMap model) {
//		//System.out.println(name);
//		
//		if(!loginservice.checkValidateUser(name, password)) {
//			model.put("errorMsg", "Check your name and password");
//			return "login";
//		}
//		
//		model.put("name", name);
//		model.put("password", password);
//		return "home";
//	}
//	
//	
//	
//	@RequestMapping(value="/home") 
//	public String homePage() {
//		return "home";
//	}

}
