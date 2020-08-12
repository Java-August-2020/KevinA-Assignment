package com.kevin.Routing.dojocontroller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class DojoController {

	@RequestMapping(value = "{dojo}", method = RequestMethod.GET)
	public String dispayText(@PathVariable("dojo") String textName, Model model) {
		model.addAttribute("textName", textName);
		return "index.jsp";
	}
	

	@RequestMapping(value = "dojo/{burbank}", method = RequestMethod.GET)
	public String burbank(@PathVariable("burbank") String burbankName, Model model) {
		model.addAttribute("placeName", burbankName);
		return "index.jsp";
	}
	
	
	
	

}
