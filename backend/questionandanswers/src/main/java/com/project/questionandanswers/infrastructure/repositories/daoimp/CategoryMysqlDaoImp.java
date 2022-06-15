package com.project.questionandanswers.infrastructure.repositories.daoimp;

import com.project.questionandanswers.infrastructure.repositories.dao.CategoryDao;
import com.project.questionandanswers.infrastructure.entities.Category;
import com.project.questionandanswers.infrastructure.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository     //Tiene la funcionalidad de acceder al repositorio de la base de datos
@Transactional  //como arma las consultas sql
public class CategoryMysqlDaoImp implements CategoryDao {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getCategories() {
        String query = "FROM Category";
        List<Category> results = entityManager.createQuery(query).getResultList();

        return results;
    }
    @Override
    public List<Category> getCategoriesJpa(){
        return this.categoryRepository.findAll();
    }
}
