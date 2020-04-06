package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialistServiceCompatibleIncidentType.eti;SpecialistServiceCompatibleIncidentType.eix;SpecialistServiceCompatibleIncidentType.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialistServiceCompatibleIncidentTypeInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the IncidentType field.
   * The subclass of Incident with which the related SpecialistService is compatible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Incident getIncidentType();
  
  
  /**
   * Gets the value of the Service field.
   * The service that is compatible with the Incident type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialistService getService();
  
  
  public gw.pl.persistence.core.Key getServiceID();
  
  
  /**
   * Sets the value of the IncidentType field.
   */
  public void setIncidentType(typekey.Incident value);
  
  
  /**
   * Sets the value of the Service field.
   */
  public void setService(entity.SpecialistService value);
  
  
  public void setServiceID(gw.pl.persistence.core.Key value);
  
  
  
}