package com.kevin.Routing.dojocontroller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class DojoController {

	@RequestMapping("")
	public String dispayText(Model model) {
		model.addAttribute("name", "attributeValue");
	
		return "index.jsp";
	}
	

	
	
	
	
	

}
