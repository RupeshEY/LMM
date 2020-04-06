package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactOrigValue.eti;ContactOrigValue.eix;ContactOrigValue.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactOrigValueInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal {
  /**
   * Gets the value of the Contact field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the OrigType field.
   * the original values XMLElement type for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOrigType();
  
  
  /**
   * Gets the value of the OrigValue field.
   * the original values XML from CM saved for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOrigValue();
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the OrigType field.
   */
  public void setOrigType(java.lang.String value);
  
  
  /**
   * Sets the value of the OrigValue field.
   */
  public void setOrigValue(java.lang.String value);
  
  
  
}