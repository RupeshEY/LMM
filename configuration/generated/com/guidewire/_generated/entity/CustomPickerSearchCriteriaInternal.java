package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "CustomPickerSearchCriteria.eti;CustomPickerSearchCriteria.eix;CustomPickerSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface CustomPickerSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.custom.CustomPickerSearchCriteriaPublicMethods, java.io.Serializable {
  /**
   * Gets the value of the State field.
   * TypeKey search criterion
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getState();
  
  
  /**
   * Gets the value of the TextColumn field.
   * Text search criterion
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTextColumn();
  
  
  /**
   * Sets the value of the State field.
   */
  public void setState(typekey.State value);
  
  
  /**
   * Sets the value of the TextColumn field.
   */
  public void setTextColumn(java.lang.String value);
  
  
  
}