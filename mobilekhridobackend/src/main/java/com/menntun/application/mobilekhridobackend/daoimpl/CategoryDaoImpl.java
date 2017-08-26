package com.menntun.application.mobilekhridobackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.menntun.application.mobilekhridobackend.dao.CategoryDao;
import com.menntun.application.mobilekhridobackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<Category>();
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("IPhone");
		category.setDescription("IPhone Categories");
		category.setImageUrl("iphone.jpg");
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Windows");
		category.setDescription("Windows Categories");
		category.setImageUrl("window.jpg");
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Android");
		category.setDescription("Android Categories");
		category.setImageUrl("android.jpg");
		
		categories.add(category);
		
	}
	@Override
	public List<Category> listOfCateory() {
		
		return categories;
	}
	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId()==id) return category;	
		}
		return null;
	}

}
