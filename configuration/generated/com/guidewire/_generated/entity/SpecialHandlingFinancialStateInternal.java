package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SpecialHandlingFinancialState.eti;SpecialHandlingFinancialState.eix;SpecialHandlingFinancialState.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SpecialHandlingFinancialStateInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.specialhandling.entity.SpecialHandlingFinancialState {
  /**
   * Adds the given element to the PreviousAmount array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToPreviousAmount(entity.SpecialHandlingPreviousAmount element);
  
  
  /**
   * Gets the value of the Claim field.
   * Claim that owns this SpecialHandlingFinancialState object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the PreviousAmount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SpecialHandlingPreviousAmount[] getPreviousAmount();
  
  
  /**
   * Array association for partition PreviousAmountByFinancialThreshold on array PreviousAmount
   */
  public entity.SpecialHandlingPreviousAmount getPreviousAmountByFinancialThreshold(com.guidewire.commons.entity.type2.IAssociativeArrayPropertyInfo property);
  
  
  /**
   * Removes the given element from the PreviousAmount array. This is achieved by marking the element for removal.
   */
  public void removeFromPreviousAmount(entity.SpecialHandlingPreviousAmount element);
  
  
  /**
   * Removes the given element from the PreviousAmount array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromPreviousAmount(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PreviousAmount field.
   */
  public void setPreviousAmount(entity.SpecialHandlingPreviousAmount[] value);
  
  
  
}