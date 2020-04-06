package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyOwner.eti;PropertyOwner.eix;PropertyOwner.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyOwnerInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.policy.entity.PropertyOwner {
  /**
   * Gets the value of the Lienholder field.
   * The relevant lienholder.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getLienholder();
  
  
  public gw.pl.persistence.core.Key getLienholderID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LocationBasedRU field.
   * The related risk unit/building.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationBasedRU getLocationBasedRU();
  
  
  public gw.pl.persistence.core.Key getLocationBasedRUID();
  
  
  /**
   * Gets the value of the OwnerType field.
   * Whether the lienholder is a partial owner or the sole owner.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OwnerType getOwnerType();
  
  
  /**
   * Gets the value of the Property field.
   * The related property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getProperty();
  
  
  public gw.pl.persistence.core.Key getPropertyID();
  
  
  /**
   * Sets the value of the Lienholder field.
   */
  public void setLienholder(entity.Contact value);
  
  
  public void setLienholderID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LocationBasedRU field.
   */
  public void setLocationBasedRU(entity.LocationBasedRU value);
  
  
  public void setLocationBasedRUID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the OwnerType field.
   */
  public void setOwnerType(typekey.OwnerType value);
  
  
  /**
   * Sets the value of the Property field.
   */
  public void setProperty(entity.PolicyLocation value);
  
  
  public void setPropertyID(gw.pl.persistence.core.Key value);
  
  
  
}