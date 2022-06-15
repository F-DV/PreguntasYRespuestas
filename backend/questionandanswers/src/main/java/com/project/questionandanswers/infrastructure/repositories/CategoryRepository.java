package com.project.questionandanswers.infrastructure.repositories;

import com.project.questionandanswers.infrastructure.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
