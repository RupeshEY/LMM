package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpPIPPrimaryDoctor.eti;TmpPIPPrimaryDoctor.eix;TmpPIPPrimaryDoctor.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpPIPPrimaryDoctorInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TmpPIPPrimaryDoctor {
  /**
   * Gets the value of the ClaimContactRoleID field.
   * The ID of the claim contact role to be copied
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getClaimContactRoleID();
  
  
  /**
   * Gets the value of the IncidentID field.
   * The ID of the incident to which the copied claim contact role will refer
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getIncidentID();
  
  
  /**
   * Sets the value of the ClaimContactRoleID field.
   */
  public void setClaimContactRoleID(java.lang.Long value);
  
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value);
  
  
  
}