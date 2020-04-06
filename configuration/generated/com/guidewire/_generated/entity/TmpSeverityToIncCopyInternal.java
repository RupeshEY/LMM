package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TmpSeverityToIncCopy.eti;TmpSeverityToIncCopy.eix;TmpSeverityToIncCopy.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TmpSeverityToIncCopyInternal extends com.guidewire.pl.domain.persistence.core.impl.BeanInternal, gw.cc.exposure.entity.TmpSeverityToIncCopy {
  /**
   * Gets the value of the IncidentID field.
   * The ID of the incident to be updated by a join to this temp table
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getIncidentID();
  
  
  /**
   * Gets the value of the SeverityTmp field.
   * The SeverityType value to copy from cc_exposure to cc_incident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SeverityType getSeverityTmp();
  
  
  /**
   * Sets the value of the IncidentID field.
   */
  public void setIncidentID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SeverityTmp field.
   */
  public void setSeverityTmp(typekey.SeverityType value);
  
  
  
}