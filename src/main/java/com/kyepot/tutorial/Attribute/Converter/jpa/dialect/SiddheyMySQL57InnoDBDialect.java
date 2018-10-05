/**
 * Copyright (C) 2016-2018 KyePot - All Rights Reserved Unauthorized copying of this file, via any medium
 * is strictly prohibited Proprietary and confidential.
 */
/**
 * 
 */
package com.kyepot.tutorial.Attribute.Converter.jpa.dialect;

import org.hibernate.dialect.MySQL57InnoDBDialect;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;

/**
 * @author siddhey
 *
 */
public class SiddheyMySQL57InnoDBDialect extends MySQL57InnoDBDialect {
  
  public SiddheyMySQL57InnoDBDialect(){
    super();
    registerFunction("LIMIT",
        new SQLFunctionTemplate(StandardBasicTypes.SERIALIZABLE, "limit ?1"));
    registerFunction("MATCH", new SQLFunctionTemplate(
        StandardBasicTypes.INTEGER, "match(?1) against  (?2 in boolean mode)"));
  }

}
