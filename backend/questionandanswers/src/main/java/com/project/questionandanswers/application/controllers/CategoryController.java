package com.project.questionandanswers.application.controllers;

import com.project.questionandanswers.infrastructure.repositories.dao.CategoryDao;
import com.project.questionandanswers.infrastructure.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {

    @Autowired
    private CategoryDao categoryDao;

    //@RequestMapping(value = "/categories")
    @GetMapping(path = "/categories")
    public List<Category> getCategories(){
        return categoryDao.getCategories();
    }
}
