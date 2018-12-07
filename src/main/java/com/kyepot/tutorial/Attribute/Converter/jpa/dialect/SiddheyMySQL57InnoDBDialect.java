/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.jpa.dialect;

import org.hibernate.dialect.MySQL57Dialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.type.StandardBasicTypes;

/**
 * @author siddhey
 *
 */
public class SiddheyMySQL57InnoDBDialect extends MySQL57Dialect {
  
  public SiddheyMySQL57InnoDBDialect(){
    super();
    registerFunction("MATCH", new SQLFunctionTemplate(
        StandardBasicTypes.INTEGER, "match(?1) against (?2 in boolean mode)"));
//    registerFunction("PARSE", new SQLFunctionTemplate(StandardBasicTypes.DATE, parse(?1)));
  }

}
