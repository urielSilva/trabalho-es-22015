package br.unb.cic.es.scb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index(@ModelAttribute("message") String message) {
		
		ModelAndView mav = new ModelAndView("index");
		mav.getModel().put("message", message);
		
		return mav;
	}
}
