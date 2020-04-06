package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrganizationSelection.eti;OrganizationSelection.eix;OrganizationSelection.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OrganizationSelectionInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.community.entity.OrganizationSelection {
  /**
   * Gets the value of the Organization field.
   * Organization wrapped for use with the group picker.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization();
  
  
  public gw.pl.persistence.core.Key getOrganizationID();
  
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value);
  
  
  public void setOrganizationID(gw.pl.persistence.core.Key value);
  
  
  
}