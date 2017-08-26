package com.menntun.application.mobilekhridobackend.dao;


import java.util.List;

import com.menntun.application.mobilekhridobackend.dto.Category;

public interface CategoryDao {

	List<Category> listOfCateory();

	Category get(int id);
}
