package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Subrogation.eti;Subrogation.eix;Subrogation.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubrogationInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.CCAssignableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire.pl.domain.assignment.AssignablePublicMethods, com.guidewire.pl.domain.assignment.impl.AssignableInternalMethods, com.guidewire.pl.system.entity.PermissionAssignableCheck, gw.api.assignment.CCAssignableMethods, gw.cc.assignment.entity.CCAssignable {
  /**
   * Adds the given element to the SubroAdversePartyOverrides array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSubroAdversePartyOverrides(entity.SubroAdversePartyOverride element);
  
  
  /**
   * Gets the value of the CloseComment field.
   * Comment upon close of Subrogation opportunity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCloseComment();
  
  
  /**
   * Gets the value of the Exposure field.
   * The associated Exposure. If null, this subrogation is a claim-level subrogation.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Outcome field.
   * SubroClosedOutcome
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubroClosedOutcome getOutcome();
  
  
  /**
   * Gets the value of the Status field.
   * Status of this subrogation
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SubrogationStatus getStatus();
  
  
  /**
   * Gets the value of the SubroAdversePartyOverrides field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroAdversePartyOverride[] getSubroAdversePartyOverrides();
  
  
  /**
   * Gets the value of the SubrogationSummary field.
   * Associated SubrogationSummary
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubrogationSummary getSubrogationSummary();
  
  
  public gw.pl.persistence.core.Key getSubrogationSummaryID();
  
  
  /**
   * Removes the given element from the SubroAdversePartyOverrides array. This is achieved by marking the element for removal.
   */
  public void removeFromSubroAdversePartyOverrides(entity.SubroAdversePartyOverride element);
  
  
  /**
   * Removes the given element from the SubroAdversePartyOverrides array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSubroAdversePartyOverrides(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CloseComment field.
   */
  public void setCloseComment(java.lang.String value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Outcome field.
   */
  public void setOutcome(typekey.SubroClosedOutcome value);
  
  
  /**
   * Sets the value of the Status field.
   */
  public void setStatus(typekey.SubrogationStatus value);
  
  
  /**
   * Sets the value of the SubroAdversePartyOverrides field.
   */
  public void setSubroAdversePartyOverrides(entity.SubroAdversePartyOverride[] value);
  
  
  /**
   * Sets the value of the SubrogationSummary field.
   */
  public void setSubrogationSummary(entity.SubrogationSummary value);
  
  
  public void setSubrogationSummaryID(gw.pl.persistence.core.Key value);
  
  
  
}