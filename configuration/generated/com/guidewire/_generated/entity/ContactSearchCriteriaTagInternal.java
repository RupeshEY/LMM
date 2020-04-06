package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactSearchCriteriaTag.eti;ContactSearchCriteriaTag.eix;ContactSearchCriteriaTag.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactSearchCriteriaTagInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the ContactSearchCriteria field.
   * ContactSearchCriteria
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactSearchCriteria getContactSearchCriteria();
  
  
  public gw.pl.persistence.core.Key getContactSearchCriteriaID();
  
  
  /**
   * Gets the value of the Type field.
   * Type of this ContactTag.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactTagType getType();
  
  
  /**
   * Sets the value of the ContactSearchCriteria field.
   */
  public void setContactSearchCriteria(entity.ContactSearchCriteria value);
  
  
  public void setContactSearchCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.ContactTagType value);
  
  
  
}