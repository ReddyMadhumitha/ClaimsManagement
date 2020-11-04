package com.hcl.claimsmanagementsystem.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
    public ModelAndView home() {
        return new ModelAndView("redirect:user/homepage");
    }
}