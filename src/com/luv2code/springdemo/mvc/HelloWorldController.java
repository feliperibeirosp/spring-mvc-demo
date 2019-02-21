package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("/processFormTwo")
	public String processFormTwo(HttpServletRequest request, Model model) {
		
		String nome = request.getParameter("studentName");
		
		nome = nome.toUpperCase();
		
		String message = "Yo! " + nome;
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}

	@RequestMapping("/processFormThree")
	public String processFormThree(@RequestParam("studentName") String nome, Model model) {
		
		nome = nome.toUpperCase();
		
		String message = "Yo! " + nome;
		
		model.addAttribute("message", message);
		
		return "helloworld";
	}
}
