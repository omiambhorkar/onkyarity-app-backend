package com.onkyarity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
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
	
	@RequestMapping("/div")
	public ModelAndView div() {
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "div");
		return mv;
	}
	
	@RequestMapping("/mul")
	public ModelAndView mul() {
		ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "mul");
		return mv;
	}

}
