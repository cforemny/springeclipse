package com.crunchify.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
/*
 * author: Crunchify.com
 * 
 */
 
@Controller
public class CrunchifyHelloWorld {
	
	@RequestMapping("/SolneMiasto")
	public ModelAndView createSolneMiasto() {
 
		String message = "dupcia";
		return new ModelAndView("SolneMiasto", "message", message);
// 
//	@RequestMapping("/welcome")
//	public ModelAndView helloWorld() {
// 
//		String message = "dupcia";
//		return new ModelAndView("welcome", "message", message);
//	}
	
	}

}