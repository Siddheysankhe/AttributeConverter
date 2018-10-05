/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.services;

import com.kyepot.tutorial.Attribute.Converter.entities.Product;
import com.kyepot.tutorial.Attribute.Converter.repository.ProductRepository;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author siddhey
 *
 */
@Service
public class ProductService {
  
  private ProductRepository productRepository;

  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public List<Product> listAllProducts() {
    return productRepository.getLimitedProducts("mobile");
  }

  public Product create(Product product) {
    return productRepository.save(product);
  }

}
