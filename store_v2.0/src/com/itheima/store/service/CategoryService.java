package com.itheima.store.service;

import java.sql.SQLException;
import java.util.List;

import com.itheima.store.domain.Category;



public interface CategoryService {

	List<Category> findAll() throws SQLException;

}
