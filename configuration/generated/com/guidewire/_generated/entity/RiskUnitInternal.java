package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RiskUnit.eti;RiskUnit.eix;RiskUnit.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RiskUnitInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.policy.entity.RiskUnit {
  /**
   * Adds the given element to the Coverages array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCoverages(entity.RUCoverage element);
  
  
  /**
   * Gets the value of the ClassCode field.
   * The Class Code (if any) assigned to this risk unit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClassCode getClassCode();
  
  
  public gw.pl.persistence.core.Key getClassCodeID();
  
  
  /**
   * Gets the value of the Coverages field.
   * List of coverages directly related to the risk unit.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RUCoverage[] getCoverages();
  
  
  /**
   * Gets the value of the Description field.
   * Description of this risk
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getDescription();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Policy field.
   * Related policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the risk in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the RUNumber field.
   * Number of the risk unit on the policy.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRUNumber();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RiskUnit getSubtype();
  
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   */
  public void removeFromCoverages(entity.RUCoverage element);
  
  
  /**
   * Removes the given element from the Coverages array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCoverages(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the ClassCode field.
   */
  public void setClassCode(entity.ClassCode value);
  
  
  public void setClassCodeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Coverages field.
   */
  public void setCoverages(entity.RUCoverage[] value);
  
  
  /**
   * Sets the value of the Description field.
   */
  public void setDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
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
   * Sets the value of the RUNumber field.
   */
  public void setRUNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RiskUnit value);
  
  
  
}