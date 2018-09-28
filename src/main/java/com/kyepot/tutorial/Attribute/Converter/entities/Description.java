/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.entities;

/**
 * @author siddhey
 *
 */
public class Description {

  public Description() {
  }

  private String brand;

  private String price;

  public String getBrand() {
    return brand;
  }

  public String getPrice() {
    return price;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public Description(String brand, String price) {
    this.brand = brand;
    this.price = price;
  }

  @Override
  public String toString() {
    return brand + "," + price;
  }

}
