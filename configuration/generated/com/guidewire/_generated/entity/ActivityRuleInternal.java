package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ActivityRule.eti;ActivityRule.eix;ActivityRule.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ActivityRuleInternal extends com.guidewire._generated.entity.RuleInternal, com.guidewire.bizrules.domain.RuleDomainMethods, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Adds the given element to the Jurisdictions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToJurisdictions(entity.AppCritJurisdiction element);
  
  
  /**
   * Adds the given element to the LossTypes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLossTypes(entity.AppCritLossType element);
  
  
  /**
   * Adds the given element to the PolicyTypes array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPolicyTypes(entity.AppCritPolicyType element);
  
  
  /**
   * Adds the given element to the Versions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToVersions(entity.ActivityRuleVersion element);
  
  
  /**
   * Gets the value of the Jurisdictions field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AppCritJurisdiction[] getJurisdictions();
  
  
  /**
   * Gets the value of the LossTypes field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AppCritLossType[] getLossTypes();
  
  
  /**
   * Gets the value of the PolicyTypes field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AppCritPolicyType[] getPolicyTypes();
  
  
  /**
   * Gets the value of the Versions field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ActivityRuleVersion[] getVersions();
  
  
  /**
   * Removes the given element from the Jurisdictions array. This is achieved by marking the element for removal.
   */
  public void removeFromJurisdictions(entity.AppCritJurisdiction element);
  
  
  /**
   * Removes the given element from the Jurisdictions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromJurisdictions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the LossTypes array. This is achieved by marking the element for removal.
   */
  public void removeFromLossTypes(entity.AppCritLossType element);
  
  
  /**
   * Removes the given element from the LossTypes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLossTypes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the PolicyTypes array. This is achieved by marking the element for removal.
   */
  public void removeFromPolicyTypes(entity.AppCritPolicyType element);
  
  
  /**
   * Removes the given element from the PolicyTypes array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPolicyTypes(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Versions array. This is achieved by marking the element for removal.
   */
  public void removeFromVersions(entity.ActivityRuleVersion element);
  
  
  /**
   * Removes the given element from the Versions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromVersions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Jurisdictions field.
   */
  public void setJurisdictions(entity.AppCritJurisdiction[] value);
  
  
  /**
   * Sets the value of the LossTypes field.
   */
  public void setLossTypes(entity.AppCritLossType[] value);
  
  
  /**
   * Sets the value of the PolicyTypes field.
   */
  public void setPolicyTypes(entity.AppCritPolicyType[] value);
  
  
  /**
   * Sets the value of the Versions field.
   */
  public void setVersions(entity.ActivityRuleVersion[] value);
  
  
  
}