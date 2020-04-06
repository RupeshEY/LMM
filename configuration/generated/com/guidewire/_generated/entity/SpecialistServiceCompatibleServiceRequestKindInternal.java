package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialistServiceCompatibleServiceRequestKind.eti;SpecialistServiceCompatibleServiceRequestKind.eix;SpecialistServiceCompatibleServiceRequestKind.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialistServiceCompatibleServiceRequestKindInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Kind field.
   * The Kind with which the related SpecialistService is compatible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ServiceRequestKind getKind();
  
  
  /**
   * Gets the value of the Service field.
   * The service that is compatible with the Kind.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getService();
  
  
  public gw.pl.persistence.core.Key getServiceID();
  
  
  /**
   * Sets the value of the Kind field.
   */
  public void setKind(typekey.ServiceRequestKind value);
  
  
  /**
   * Sets the value of the Service field.
   */
  public void setService(entity.SpecialistService value);
  
  
  public void setServiceID(gw.pl.persistence.core.Key value);
  
  
  
}