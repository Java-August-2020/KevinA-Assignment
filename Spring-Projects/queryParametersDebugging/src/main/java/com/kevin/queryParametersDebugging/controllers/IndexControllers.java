package com.kevin.queryParametersDebugging.controllers;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexControllers {

	@RequestMapping("/")
	public String index(@RequestParam(value="q", required=false) String searchQuery, Model model) {
		model.addAttribute("search", searchQuery);
		System.out.println(searchQuery);
		return "index.jsp";
	}
	
	@RequestMapping("/users/{name}")
	public String userName(@PathVariable("name") String userName, Model model) {
		model.addAttribute("userName", userName);
		System.out.println(userName);
		return "index.jsp";
	}
}
