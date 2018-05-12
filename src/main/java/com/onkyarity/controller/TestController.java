package com.onkyarity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onkyarity.entity.Customer;
import com.onkyarity.service.CustomerService;

@RestController
public class TestController {
	
	@Autowired
	private CustomerService customerService;
	
	private ModelAndView mv = new ModelAndView("display");
	
	@RequestMapping("/add")
	public ModelAndView add() {
		//ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "add");
		return mv;
	}
	
	@RequestMapping("/sub")
	public ModelAndView sub() {
		//ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "sub");
		return mv;
	}
	
	@RequestMapping("/div")
	public ModelAndView div() {
		//ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "div");
		return mv;
	}
	
	@RequestMapping("/mul")
	public ModelAndView mul() {
		//ModelAndView mv = new ModelAndView("display");
		mv.addObject("msg", "mul");
		return mv;
	}
	
	@RequestMapping("/addCust")
	public ModelAndView addCustomer() {	
		Customer customer = new Customer();
		//customer.setId(1001);
		customer.setCustomerName("Onkar Ambhorkar");
		customer.setEmail("omiambhorkar@gmail.com");
		
		try {
			if(customer.getId()==0)
			{
				customerService.addCustomer(customer);
			}
			else
			{	
				customerService.updateCustomer(customer);
			}
			mv.addObject("msg", "Success");
		} catch (Exception e) {
			mv.addObject("msg", "Fail");
		}
 		
		return mv;
	}

}
