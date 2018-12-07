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
import com.kyepot.tutorial.Attribute.Exceptions.CustomizeException;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
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
    return productRepository.getAllProducts("mobile");
  }

  public Product create(Product product) {
    return productRepository.save(product);
  }

  public Product update(String productUuid) {
    Optional<Product> product = productRepository.findById(productUuid);
    if (!product.isPresent()) {
      throw new CustomizeException("Product Not Found",
          HttpStatus.INTERNAL_SERVER_ERROR);
    }
    return null;
  }

}
