package com.example.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.modelo.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {	
		ModelAndView mav = new ModelAndView();
		mav.addObject("Producto", new Producto());
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {	
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("index");
		}
		
		mav.addObject("codigo", producto.getCodigo());
		mav.addObject("nombreProducto", producto.getNombreProducto());
		mav.addObject("marca", producto.getMarca());
		mav.addObject("descripcion", producto.getDescripcion());
		mav.addObject("existencias", producto.getExistencias());
		
		mav.setViewName("resultado");
		return mav;
	}
	
	
	

	
	
}
