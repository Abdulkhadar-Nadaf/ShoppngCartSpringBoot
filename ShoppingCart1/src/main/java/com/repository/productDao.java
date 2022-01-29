package com.repository;



import java.util.List;

import javax.transaction.Transactional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.product;

@Repository
@Transactional
public interface productDao extends JpaRepository<product, Integer> {
	
	@Override
	List<product> findAll();
}
	