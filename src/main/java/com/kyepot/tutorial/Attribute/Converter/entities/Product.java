/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.entities;

import com.kyepot.tutorial.Attribute.Converter.converters.DescriptionConvertor;

import java.util.UUID;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * @author siddhey
 *
 */
@Entity
public class Product {

  @Id
  private String uuid;

  private String name;
  
  @Convert(converter = DescriptionConvertor.class)
  private Description description;
  
  public Description getDescription() {
    return description;
  }

  public void setDescription(Description description) {
    this.description = description;
  }

  public String getUuid() {
    return uuid;
  }

  public String getName() {
    return name;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public void setName(String name) {
    this.name = name;
  }

  @PrePersist
  private void ensureId() {
    this.setUuid(UUID.randomUUID().toString());
  }

}
