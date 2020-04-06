package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Zone.eti;Zone.eix;Zone.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ZoneInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.geodata.zone.ZonePublicMethods, com.guidewire.pl.domain.geodata.zone.impl.ZoneInternalMethods {
  /**
   * Adds the given element to the ForwardLinkedZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToForwardLinkedZones(entity.ZoneLink element);
  
  
  /**
   * Adds the given element to the ReverseLinkedZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReverseLinkedZones(entity.ZoneLink element);
  
  
  /**
   * Gets the value of the Code field.
   * The code for this zone, this is the value that should be used for lookups.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCode();
  
  
  /**
   * Gets the value of the CodeDenorm field.
   * denorm field for Code
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCodeDenorm();
  
  
  /**
   * Gets the value of the Country field.
   * The country to which the zone belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getCountry();
  
  
  /**
   * Gets the value of the ForwardLinkedZones field.
   * Zones that are forward linked to this zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ZoneLink[] getForwardLinkedZones();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the zone, this is the value used to populate fields.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameDenorm field.
   * denorm field for Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm();
  
  
  /**
   * Gets the value of the ReverseLinkedZones field.
   * Zones that are reverse linked to this zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ZoneLink[] getReverseLinkedZones();
  
  
  /**
   * Gets the value of the ZoneType field.
   * Type of zone.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ZoneType getZoneType();
  
  
  /**
   * Removes the given element from the ForwardLinkedZones array. This is achieved by marking the element for removal.
   */
  public void removeFromForwardLinkedZones(entity.ZoneLink element);
  
  
  /**
   * Removes the given element from the ForwardLinkedZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromForwardLinkedZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ReverseLinkedZones array. This is achieved by marking the element for removal.
   */
  public void removeFromReverseLinkedZones(entity.ZoneLink element);
  
  
  /**
   * Removes the given element from the ReverseLinkedZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReverseLinkedZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Code field.
   */
  public void setCode(java.lang.String value);
  
  
  /**
   * Sets the value of the CodeDenorm field.
   */
  public void setCodeDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Country field.
   */
  public void setCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the ForwardLinkedZones field.
   */
  public void setForwardLinkedZones(entity.ZoneLink[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameDenorm field.
   */
  public void setNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the ReverseLinkedZones field.
   */
  public void setReverseLinkedZones(entity.ZoneLink[] value);
  
  
  /**
   * Sets the value of the ZoneType field.
   */
  public void setZoneType(typekey.ZoneType value);
  
  
  
}