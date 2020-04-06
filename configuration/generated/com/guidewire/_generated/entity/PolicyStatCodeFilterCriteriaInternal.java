package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyStatCodeFilterCriteria.eti;PolicyStatCodeFilterCriteria.eix;PolicyStatCodeFilterCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyStatCodeFilterCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.policy.impl.PolicyStatCodeFilterCriteriaInternal, gw.cc.policy.entity.PolicyStatCodeFilterCriteria, java.io.Serializable {
  /**
   * Gets the value of the Policy field.
   * Policy on which to search for stat codes.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  
}