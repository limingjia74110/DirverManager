package com.driver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {
	@RequestMapping(value = "/displayStudentList")
	public String displayAll(Model model) {
		return "student";
	}
}
