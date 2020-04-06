package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ReinsuranceLossCause.eti;ReinsuranceLossCause.eix;ReinsuranceLossCause.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ReinsuranceLossCauseInternal extends com.guidewire._generated.entity.RetireableInternal, gw.cc.claim.entity.ReinsuranceLossCause {
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossCause field.
   * General cause of loss; dependent on loss type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LossCause getLossCause();
  
  
  /**
   * Gets the value of the ReinsuranceThreshold field.
   * Related reinsurance threshold.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReinsuranceThreshold getReinsuranceThreshold();
  
  
  public gw.pl.persistence.core.Key getReinsuranceThresholdID();
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossCause field.
   */
  public void setLossCause(typekey.LossCause value);
  
  
  /**
   * Sets the value of the ReinsuranceThreshold field.
   */
  public void setReinsuranceThreshold(entity.ReinsuranceThreshold value);
  
  
  public void setReinsuranceThresholdID(gw.pl.persistence.core.Key value);
  
  
  
}