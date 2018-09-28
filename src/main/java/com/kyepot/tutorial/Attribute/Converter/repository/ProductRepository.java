/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
package com.kyepot.tutorial.Attribute.Converter.repository;

import com.kyepot.tutorial.Attribute.Converter.entities.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
