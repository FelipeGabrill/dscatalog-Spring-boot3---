package com.dv.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dv.dscatalog.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
