package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ServiceRequestStatementLineItem.eti;ServiceRequestStatementLineItem.eix;ServiceRequestStatementLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ServiceRequestStatementLineItemInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.vendormanagement.entity.ServiceRequestStatementLineItem {
  /**
   * Gets the value of the Amount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the Category field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestStatementLineItemCategory getCategory();
  
  
  /**
   * Gets the value of the Description field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the ServiceRequestStatement field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ServiceRequestStatement getServiceRequestStatement();
  
  
  public gw.pl.persistence.core.Key getServiceRequestStatementID();
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Category field.
   */
  public void setCategory(typekey.ServiceRequestStatementLineItemCategory value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the ServiceRequestStatement field.
   */
  public void setServiceRequestStatement(entity.ServiceRequestStatement value);
  
  
  public void setServiceRequestStatementID(gw.pl.persistence.core.Key value);
  
  
  
}