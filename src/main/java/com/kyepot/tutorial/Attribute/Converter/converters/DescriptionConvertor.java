/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
package com.kyepot.tutorial.Attribute.Converter.converters;

import com.kyepot.tutorial.Attribute.Converter.entities.Description;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class DescriptionConvertor
    implements AttributeConverter<Description, String> {

  @Override
  public String convertToDatabaseColumn(Description attribute) {
    if (attribute == null) {
      return null;
    }
    return attribute.toString();
  }

  @Override
  public Description convertToEntityAttribute(String dbData) {
    if (dbData == null) {
      return null;
    }
    return new Description(dbData.split(",")[0], dbData.split(",")[1]);
  }

}
