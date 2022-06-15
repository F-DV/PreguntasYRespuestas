package com.project.questionandanswers.infrastructure.repositories.dao;

import com.project.questionandanswers.infrastructure.entities.Category;

import java.util.List;

/**
 * @author FelipeQG
 * interaccion con la base de datos
 */

public interface CategoryDao{

    List<Category> getCategories();
    List<Category> getCategoriesJpa();
}
