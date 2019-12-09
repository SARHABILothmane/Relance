package com.relance.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerHome {
	@RequestMapping("/home")
public String  home() {
		return "home";
	}
}
