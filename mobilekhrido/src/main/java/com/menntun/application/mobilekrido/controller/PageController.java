package com.menntun.application.mobilekrido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.menntun.application.mobilekhridobackend.dao.CategoryDao;

@Controller
public class PageController {

	@Autowired
	private CategoryDao categoryDao;
	
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Home");
		model.addObject("categories", categoryDao.listOfCateory());
		model.addObject("userClickedHome", true);
		return model;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "About Us");
		model.addObject("userClickedAbout", true);
		return model;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Contact Us");
		model.addObject("userClickedContact", true);
		return model;
	}
}
