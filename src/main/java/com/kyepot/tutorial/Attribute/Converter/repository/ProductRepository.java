/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
package com.kyepot.tutorial.Attribute.Converter.repository;

import com.kyepot.tutorial.Attribute.Converter.entities.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
  
  @Query("SELECT p FROM #{#entityName} p")
  List<Product> getAllProducts(@Param("name") final String name);
  
//  @Query("SELECT p FROM #{#entityName} p LIMIT(1)")
//  List<Product> getLimitedProducts();

}
