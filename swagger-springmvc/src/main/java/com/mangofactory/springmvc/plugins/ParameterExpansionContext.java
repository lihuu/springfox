package com.mangofactory.springmvc.plugins;

import com.mangofactory.schema.plugins.DocumentationType;
import com.mangofactory.service.model.builder.ParameterBuilder;

import java.lang.reflect.Field;

public class ParameterExpansionContext {

  private final String dataTypeName;
  private final String parentName;
  private final Field field;
  private final DocumentationType documentationType;
  private ParameterBuilder parameterBuilder;

  public ParameterExpansionContext(String dataTypeName, String parentName, Field field, DocumentationType
          documentationType, ParameterBuilder parameterBuilder) {
    this.dataTypeName = dataTypeName;
    this.parentName = parentName;
    this.field = field;
    this.documentationType = documentationType;
    this.parameterBuilder = parameterBuilder;
  }

  public String getDataTypeName() {
    return dataTypeName;
  }

  public String getParentName() {
    return parentName;
  }

  public Field getField() {
    return field;
  }

  public DocumentationType getDocumentationType() {
    return documentationType;
  }

  public ParameterBuilder getParameterBuilder() {
    return parameterBuilder;
  }


}
