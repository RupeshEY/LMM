package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "MobilePropertyIncident.eti;MobilePropertyIncident.eix;MobilePropertyIncident.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface MobilePropertyIncidentInternal extends com.guidewire._generated.entity.PropertyIncidentInternal, gw.cc.exposure.entity.MobilePropertyIncident {
  /**
   * Gets the value of the LocationAddress field.
   * Location address of the incident. Previous fields that made up this address described as 'Location of the Exposed Vehicle'.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getLocationAddress();
  
  
  public gw.pl.persistence.core.Key getLocationAddressID();
  
  
  /**
   * Gets the value of the LossDesc field.
   * Loss occurred if Other is selected Description needed.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDesc();
  
  
  /**
   * Gets the value of the LossOccured field.
   * Where Loss occurred
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossOccured getLossOccured();
  
  
  /**
   * Sets the value of the LocationAddress field.
   */
  public void setLocationAddress(entity.Address value);
  
  
  public void setLocationAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LossDesc field.
   */
  public void setLossDesc(java.lang.String value);
  
  
  /**
   * Sets the value of the LossOccured field.
   */
  public void setLossOccured(typekey.LossOccured value);
  
  
  
}