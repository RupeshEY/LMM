package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialistServiceSearchCriteria.eti;SpecialistServiceSearchCriteria.eix;SpecialistServiceSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialistServiceSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the ContactSearchCriteria field.
   * ContactSearchCriteria which uses this code to perform a contact search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactSearchCriteria getContactSearchCriteria();
  
  
  public gw.pl.persistence.core.Key getContactSearchCriteriaID();
  
  
  /**
   * Gets the value of the SpecialistServiceCode field.
   * Specialist Service code to filter in the contact search criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSpecialistServiceCode();
  
  
  /**
   * Sets the value of the ContactSearchCriteria field.
   */
  public void setContactSearchCriteria(entity.ContactSearchCriteria value);
  
  
  public void setContactSearchCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SpecialistServiceCode field.
   */
  public void setSpecialistServiceCode(java.lang.String value);
  
  
  
}