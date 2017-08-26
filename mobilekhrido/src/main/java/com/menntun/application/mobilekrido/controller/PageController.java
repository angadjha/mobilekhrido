package com.menntun.application.mobilekrido.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.menntun.application.mobilekhridobackend.dao.CategoryDao;
import com.menntun.application.mobilekhridobackend.dto.Category;

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
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllCategories(){
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "All Products");
		model.addObject("categories", categoryDao.listOfCateory());
		model.addObject("userClickedAllProducts", true);
		return model;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoriesProduct(@PathVariable("id") int id){
		ModelAndView model = new ModelAndView("page");
		Category category = null;
		category = categoryDao.get(id);
		model.addObject("title", category.getName());
		model.addObject("categories", categoryDao.listOfCateory());
		model.addObject("category", category);
		model.addObject("userClickedCategoryProducts", true);
		return model;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
