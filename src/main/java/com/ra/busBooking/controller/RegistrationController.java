package com.ra.busBooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ra.busBooking.DTO.UserRegisteredDTO;
import com.ra.busBooking.service.DefaultUserService;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	 private DefaultUserService userService;

	    public RegistrationController(DefaultUserService userService) {
	        super();
	        this.userService = userService;
	    }

	    @ModelAttribute("user")
	    public UserRegisteredDTO userRegistrationDto() {
	        return new UserRegisteredDTO();
	    }

	    @GetMapping
	    public String showRegistrationForm() {
	        return "register";
	    }

	    @PostMapping
	    public String registerUserAccount(@ModelAttribute("user") 
	              UserRegisteredDTO registrationDto) {
	        userService.save(registrationDto);
	        return "redirect:/login";
	    }
}
