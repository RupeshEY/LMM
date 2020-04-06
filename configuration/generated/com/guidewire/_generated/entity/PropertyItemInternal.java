package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyItem.eti;PropertyItem.eix;PropertyItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.policy.entity.PropertyItem {
  /**
   * Gets the value of the AppraisedValue field.
   * Appraised value of the item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAppraisedValue();
  
  
  /**
   * Gets the value of the Description field.
   * Description of the item.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the property item in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the Property field.
   * The related property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getProperty();
  
  
  public gw.pl.persistence.core.Key getPropertyID();
  
  
  /**
   * Sets the value of the AppraisedValue field.
   */
  public void setAppraisedValue(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the Property field.
   */
  public void setProperty(entity.PolicyLocation value);
  
  
  public void setPropertyID(gw.pl.persistence.core.Key value);
  
  
  
}