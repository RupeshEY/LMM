package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyLocation.eti;PolicyLocation.eix;PolicyLocation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyLocationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.policy.entity.PolicyLocation {
  /**
   * Adds the given element to the Buildings array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToBuildings(entity.Building element);
  
  
  /**
   * Adds the given element to the HighValueItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToHighValueItems(entity.PropertyItem element);
  
  
  /**
   * Adds the given element to the Lienholders array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLienholders(entity.PropertyOwner element);
  
  
  /**
   * Adds the given element to the LocationBasedRisks array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLocationBasedRisks(entity.LocationBasedRU element);
  
  
  /**
   * Gets the value of the Address field.
   * The address where this PolicyLocation exists.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddress();
  
  
  public gw.pl.persistence.core.Key getAddressID();
  
  
  /**
   * Gets the value of the Buildings field.
   * Buildings associated with this location.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Building[] getBuildings();
  
  
  /**
   * Gets the value of the HighValueItems field.
   * List of additional high value items.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyItem[] getHighValueItems();
  
  
  /**
   * Gets the value of the Lienholders field.
   * List of lienholders for the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyOwner[] getLienholders();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LocationBasedRisks field.
   * List of location based risk units for the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.LocationBasedRU[] getLocationBasedRisks();
  
  
  /**
   * Gets the value of the LocationNumber field.
   * The alphanumeric "number" associated with this location.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLocationNumber();
  
  
  /**
   * Gets the value of the Notes field.
   * Any notes associated with this location.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the Policy field.
   * This PolicyLocation's owning Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the policy location in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the PrimaryLocation field.
   * Indicates whether this PolicyLocation should be considered the primary one on the owning Policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPrimaryLocation();
  
  
  /**
   * Removes the given element from the Buildings array. This is achieved by marking the element for removal.
   */
  public void removeFromBuildings(entity.Building element);
  
  
  /**
   * Removes the given element from the Buildings array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromBuildings(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the HighValueItems array. This is achieved by marking the element for removal.
   */
  public void removeFromHighValueItems(entity.PropertyItem element);
  
  
  /**
   * Removes the given element from the HighValueItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromHighValueItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   */
  public void removeFromLienholders(entity.PropertyOwner element);
  
  
  /**
   * Removes the given element from the Lienholders array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLienholders(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the LocationBasedRisks array. This is achieved by marking the element for removal.
   */
  public void removeFromLocationBasedRisks(entity.LocationBasedRU element);
  
  
  /**
   * Removes the given element from the LocationBasedRisks array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLocationBasedRisks(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Address field.
   */
  public void setAddress(entity.Address value);
  
  
  public void setAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Buildings field.
   */
  public void setBuildings(entity.Building[] value);
  
  
  /**
   * Sets the value of the HighValueItems field.
   */
  public void setHighValueItems(entity.PropertyItem[] value);
  
  
  /**
   * Sets the value of the Lienholders field.
   */
  public void setLienholders(entity.PropertyOwner[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LocationBasedRisks field.
   */
  public void setLocationBasedRisks(entity.LocationBasedRU[] value);
  
  
  /**
   * Sets the value of the LocationNumber field.
   */
  public void setLocationNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the PrimaryLocation field.
   */
  public void setPrimaryLocation(java.lang.Boolean value);
  
  
  
}