package com.finalproject.Food4u.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finalproject.Food4u.model.Category;

 
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

   

}
