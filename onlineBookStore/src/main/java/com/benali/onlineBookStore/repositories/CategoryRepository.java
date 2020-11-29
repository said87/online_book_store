package com.benali.onlineBookStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.benali.onlineBookStore.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

	Category findAllById(long l);

}
