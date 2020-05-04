package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.modelo.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/index1")
	public ModelAndView index1() {	
		ModelAndView mav = new ModelAndView();
		mav.addObject("Producto", new Producto());
		mav.setViewName("index");
		return mav;
	}
	
}
