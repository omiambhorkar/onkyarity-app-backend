package com.onkyarity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	@RequestMapping("/add")
	public ModelAndView add() {
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "add");
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub() {
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "sub");
		return mv;
	}

}
