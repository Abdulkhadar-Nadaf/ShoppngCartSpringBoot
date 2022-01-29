package com.controller;



import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.product;
import com.model.User;
import com.repository.productDao;
import com.service.userService;





@Controller
@RequestMapping("/login")
public class LoginController {
		
	@Autowired
	public userService us;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("users", new User());
		return mav;
	
	}
	
	
	/*@RequestMapping(method = RequestMethod.POST)
	public String afterLogin(@ModelAttribute("users") User u) {
		System.out.println("After login called");*/
		
		/*
		 * User u1 = us.users(u.getEmail(), u.getPassword()); System.out.println(u1);
		 * 
		 * if(Objects.nonNull(u1)) { return "redirect:/index"; }else { return
		 * "redirect:/login"; }
		 */
		
	}
	
	
	

