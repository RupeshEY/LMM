package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TypeofProperty.eti;TypeofProperty.eix;TypeofProperty.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TypeofPropertyInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.TypeofProperty {
  /**
   * Gets the value of the Incident field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Incident getIncident();
  
  
  public gw.pl.persistence.core.Key getIncidentID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the TypeofProperty field.
   * The type of property affected.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TypeofProperty getTypeofProperty();
  
  
  /**
   * Sets the value of the Incident field.
   */
  public void setIncident(entity.Incident value);
  
  
  public void setIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the TypeofProperty field.
   */
  public void setTypeofProperty(typekey.TypeofProperty value);
  
  
  
}