package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SubroAdversePartyOverride.eti;SubroAdversePartyOverride.eix;SubroAdversePartyOverride.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SubroAdversePartyOverrideInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the ExpectedRecovery field.
   * Expected recovery percentage from this Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExpectedRecovery();
  
  
  /**
   * Gets the value of the Fault field.
   * Contact's probable percentage of fault.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFault();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the SubroAdverseParty field.
   * The party whose fault and/or expected recovery are overridden.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SubroAdverseParty getSubroAdverseParty();
  
  
  public gw.pl.persistence.core.Key getSubroAdversePartyID();
  
  
  /**
   * Gets the value of the Subrogation field.
   * The subrogation with a fault and/or expected recovery different from the default.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Subrogation getSubrogation();
  
  
  public gw.pl.persistence.core.Key getSubrogationID();
  
  
  /**
   * Sets the value of the ExpectedRecovery field.
   */
  public void setExpectedRecovery(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Fault field.
   */
  public void setFault(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SubroAdverseParty field.
   */
  public void setSubroAdverseParty(entity.SubroAdverseParty value);
  
  
  public void setSubroAdversePartyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Subrogation field.
   */
  public void setSubrogation(entity.Subrogation value);
  
  
  public void setSubrogationID(gw.pl.persistence.core.Key value);
  
  
  
}