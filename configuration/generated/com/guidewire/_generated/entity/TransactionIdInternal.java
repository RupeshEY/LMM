package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TransactionId.eti;TransactionId.eix;TransactionId.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionIdInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal {
  /**
   * Gets the value of the CreationTime field.
   * Time of creating the transaction id.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationTime();
  
  
  /**
   * Gets the value of the tid field.
   * Unique transaction id
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String gettid();
  
  
  /**
   * Sets the value of the CreationTime field.
   */
  public void setCreationTime(java.util.Date value);
  
  
  /**
   * Sets the value of the tid field.
   */
  public void settid(java.lang.String value);
  
  
  
}