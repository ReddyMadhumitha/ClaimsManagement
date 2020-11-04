/**
 * 
 */
package com.hcl.claimsmanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.claimsmanagementsystem.model.Credential;
import com.hcl.claimsmanagementsystem.model.User;
import com.hcl.claimsmanagementsystem.service.UserService; 

/**
 * @author reddy-madhumitha
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	
		@Autowired
		UserService userService;
		@RequestMapping(value = "/registration", method = RequestMethod.POST)
		public ModelAndView add(@ModelAttribute("user") User user) {
			if (userService.register(user))
				return new ModelAndView("registerSuccess");
			else
				return new ModelAndView("registerFailed");
		}

		@RequestMapping("/registration")
		public ModelAndView add() {
			return new ModelAndView("registration","user", new User());

		}
		
		@RequestMapping("/login")
		public ModelAndView addLogin() {
			return new ModelAndView("login","credential", new Credential());

		}
		@RequestMapping(value = "/login", method = RequestMethod.POST)
		public ModelAndView add1(@ModelAttribute("credential") Credential credential) {
			if (userService.login(credential))
				return new ModelAndView("loginSuccess");
			else
				return new ModelAndView("loginFailed");
		}
		@RequestMapping("/homepage")
		public ModelAndView addHome() {
			return new ModelAndView("homepage");

		}
		
	}


