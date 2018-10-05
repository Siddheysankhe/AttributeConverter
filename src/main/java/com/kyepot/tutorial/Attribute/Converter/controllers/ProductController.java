/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.controllers;

import com.kyepot.tutorial.Attribute.Converter.entities.Product;
import com.kyepot.tutorial.Attribute.Converter.services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author siddhey
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {
  private ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }
  
  @GetMapping("/list")
  public List<Product> list() {
    return productService.listAllProducts();
  }
  
  @PostMapping("/add")
  public Product create(@RequestBody Product product){
    return productService.create(product);
  }
  
}
