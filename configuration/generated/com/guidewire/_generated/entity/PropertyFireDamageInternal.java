package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PropertyFireDamage.eti;PropertyFireDamage.eix;PropertyFireDamage.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PropertyFireDamageInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.claim.entity.PropertyFireDamage {
  /**
   * Gets the value of the Claim field.
   * Claim that owns this damage object.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the FireSource field.
   * Description of the source of the fire
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFireSource();
  
  
  /**
   * Gets the value of the HowWasFireDiscovered field.
   * Description of how the fire was discovered
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHowWasFireDiscovered();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Arson field.
   * Boolean field to indicate if a claim involves arson
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isArson();
  
  
  /**
   * Gets the value of the FireDeptResponded field.
   * Did the fire department respond to the damage?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isFireDeptResponded();
  
  
  /**
   * Gets the value of the IsAnyoneInjured field.
   * Was anyone injured?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsAnyoneInjured();
  
  
  /**
   * Gets the value of the IsHomeHabitable field.
   * Can the insured live at home?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsHomeHabitable();
  
  
  /**
   * Gets the value of the IsHomeSecure field.
   * Is the home secure?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isIsHomeSecure();
  
  
  /**
   * Gets the value of the SmokeDamageOnly field.
   * Is the damage only from smoke and not fire?
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isSmokeDamageOnly();
  
  
  /**
   * Sets the value of the Arson field.
   */
  public void setArson(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FireDeptResponded field.
   */
  public void setFireDeptResponded(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the FireSource field.
   */
  public void setFireSource(java.lang.String value);
  
  
  /**
   * Sets the value of the HowWasFireDiscovered field.
   */
  public void setHowWasFireDiscovered(java.lang.String value);
  
  
  /**
   * Sets the value of the IsAnyoneInjured field.
   */
  public void setIsAnyoneInjured(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the IsHomeHabitable field.
   */
  public void setIsHomeHabitable(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the IsHomeSecure field.
   */
  public void setIsHomeSecure(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the SmokeDamageOnly field.
   */
  public void setSmokeDamageOnly(java.lang.Boolean value);
  
  
  
}