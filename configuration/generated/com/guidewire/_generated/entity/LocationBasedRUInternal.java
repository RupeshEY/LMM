package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LocationBasedRU.eti;LocationBasedRU.eix;LocationBasedRU.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LocationBasedRUInternal extends com.guidewire._generated.entity.RiskUnitInternal, com.guidewire.cc.domain.policy.impl.LocationBasedRUInternal, gw.cc.policy.entity.LocationBasedRU {
  /**
   * Adds the given element to the Lienholders array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLienholders(entity.PropertyOwner element);
  
  
  /**
   * Gets the value of the Building field.
   * The building on the location that corresponds to this riskunit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Building getBuilding();
  
  
  public gw.pl.persistence.core.Key getBuildingID();
  
  
  /**
   * Gets the value of the Lienholders field.
   * List of lien holders for the property.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyOwner[] getLienholders();
  
  
  /**
   * Gets the value of the PolicyLocation field.
   * The PolicyLocation associated with this RiskUnit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PolicyLocation getPolicyLocation();
  
  
  public gw.pl.persistence.core.Key getPolicyLocationID();
  
  
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
   * Sets the value of the Building field.
   */
  public void setBuilding(entity.Building value);
  
  
  public void setBuildingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Lienholders field.
   */
  public void setLienholders(entity.PropertyOwner[] value);
  
  
  /**
   * Sets the value of the PolicyLocation field.
   */
  public void setPolicyLocation(entity.PolicyLocation value);
  
  
  public void setPolicyLocationID(gw.pl.persistence.core.Key value);
  
  
  
}