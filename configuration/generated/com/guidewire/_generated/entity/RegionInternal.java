package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Region.eti;Region.eix;Region.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RegionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.DecentralizedEntityInternal, com.guidewire.pl.domain.assignment.RegionPublicMethods, com.guidewire.pl.domain.assignment.impl.RegionInternalMethods {
  /**
   * Adds the given element to the Name_L10N_ARRAY array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToName_L10N_ARRAY(entity.Region_Name_L10N element);
  
  
  /**
   * Adds the given element to the RegionZones array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRegionZones(entity.RegionZone element);
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * name given to the region (this must be unique).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the Name_L10N_ARRAY field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Region_Name_L10N[] getName_L10N_ARRAY();
  
  
  /**
   * Array association for partition Name_L10N_ARRAYByLanguage on array Name_L10N_ARRAY
   */
  public entity.Region_Name_L10N getName_L10N_ARRAYByLanguage(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Gets the value of the RegionZones field.
   * The zones that define this region.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RegionZone[] getRegionZones();
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   */
  public void removeFromName_L10N_ARRAY(entity.Region_Name_L10N element);
  
  
  /**
   * Removes the given element from the Name_L10N_ARRAY array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromName_L10N_ARRAY(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RegionZones array. This is achieved by marking the element for removal.
   */
  public void removeFromRegionZones(entity.RegionZone element);
  
  
  /**
   * Removes the given element from the RegionZones array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRegionZones(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name_L10N_ARRAY field.
   */
  public void setName_L10N_ARRAY(entity.Region_Name_L10N[] value);
  
  
  /**
   * Sets the value of the RegionZones field.
   */
  public void setRegionZones(entity.RegionZone[] value);
  
  
  
}