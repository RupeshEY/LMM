package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrganizationZoneAdmin.eti;OrganizationZoneAdmin.eix;OrganizationZoneAdmin.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OrganizationZoneAdminInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire.pl.domain.community.OrganizationZoneAdminPublicMethods {
  /**
   * Gets the value of the Country field.
   * The country to which the zone belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Organization field.
   * Fk to the Organization
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Organization getOrganization();
  
  
  public gw.pl.persistence.core.Key getOrganizationID();
  
  
  /**
   * Gets the value of the ZoneCode field.
   * Code of the zone
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getZoneCode();
  
  
  /**
   * Gets the value of the ZoneType field.
   * Type of zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ZoneType getZoneType();
  
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Organization field.
   */
  public void setOrganization(entity.Organization value);
  
  
  public void setOrganizationID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ZoneCode field.
   */
  public void setZoneCode(java.lang.String value);
  
  
  /**
   * Sets the value of the ZoneType field.
   */
  public void setZoneType(typekey.ZoneType value);
  
  
  
}