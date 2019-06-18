package com.st.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.st.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	@Query("select p from com.st.entity.Product p")
	public List<Product> getInfo();
}


