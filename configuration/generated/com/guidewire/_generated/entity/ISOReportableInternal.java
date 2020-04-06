package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ISOReportable.eti;ISOReportable.eix;ISOReportable.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ISOReportableInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.iso.entity.ISOReportable {
  /**
   * Gets the value of the ISOReceiveDate field.
   * The last time a response was received from ISO for this object. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOReceiveDate();
  
  
  /**
   * Gets the value of the ISOSendDate field.
   * The last time a search request was sent to ISO. 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getISOSendDate();
  
  
  /**
   * Gets the value of the ISOStatus field.
   * Status of exposure with ISO - for example checked, not of interest.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ISOStatus getISOStatus();
  
  
  /**
   * Gets the value of the ISOKnown field.
   * Has a search request for this object been successfully received by ISO?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isISOKnown();
  
  
  /**
   * Sets the value of the ISOKnown field.
   */
  public void setISOKnown(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ISOReceiveDate field.
   */
  public void setISOReceiveDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ISOSendDate field.
   */
  public void setISOSendDate(java.util.Date value);
  
  
  /**
   * Sets the value of the ISOStatus field.
   */
  public void setISOStatus(typekey.ISOStatus value);
  
  
  
}