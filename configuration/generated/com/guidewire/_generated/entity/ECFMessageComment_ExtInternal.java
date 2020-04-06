package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageComment_Ext.eti;ECFMessageComment_Ext.eix;ECFMessageComment_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageComment_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the Detail field.
   * Each company can provide up to x lines of comments with each line comprising up to 70 characters. These comments will be supplied in the order the comments were entered, with the oldest comment being the first instance. Suppliers should take care when displaying comments that they do so in a fixed width non proportional font so that it is displayed as entered.   ILU, Lloyd's and LIRMA Co. only
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDetail();
  
  
  /**
   * Gets the value of the ECFMessage field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessage_Ext getECFMessage();
  
  
  public gw.pl.persistence.core.Key getECFMessageID();
  
  
  /**
   * Gets the value of the LineNumber field.
   * Line no. allocated to the comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLineNumber();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ECFMessageComment_Ext getSubtype();
  
  
  /**
   * Sets the value of the Detail field.
   */
  public void setDetail(java.lang.String value);
  
  
  /**
   * Sets the value of the ECFMessage field.
   */
  public void setECFMessage(entity.ECFMessage_Ext value);
  
  
  public void setECFMessageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LineNumber field.
   */
  public void setLineNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ECFMessageComment_Ext value);
  
  
  
}