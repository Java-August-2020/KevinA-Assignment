package com.kevin.Human.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HumanController {

	@RequestMapping("/")
	public String greetHuman(@RequestParam(value = "q", required = false) String entry, Model model) {
		if (entry == null) {
			model.addAttribute("default", "Hello Human!");
		} else {
			model.addAttribute("welcome", "Hello " + entry);
		}
		return "index.jsp";
	}

}
