package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RuleVersionParentEdge.eti;RuleVersionParentEdge.eix;RuleVersionParentEdge.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RuleVersionParentEdgeInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire._generated.entity.RuleVersionDependentInternal, com.guidewire._generated.entity.OrderedChildInternal, gw.bizrules.domain.RuleVersionDependent {
  /**
   * Gets the value of the Owner field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getOwner();
  
  
  public gw.pl.persistence.core.Key getOwnerID();
  
  
  /**
   * Gets the value of the Parent field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RuleVersion getParent();
  
  
  public gw.pl.persistence.core.Key getParentID();
  
  
  /**
   * Gets the value of the AuditTrailParent field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAuditTrailParent();
  
  
  /**
   * Sets the value of the AuditTrailParent field.
   */
  public void setAuditTrailParent(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Owner field.
   */
  public void setOwner(entity.RuleVersion value);
  
  
  public void setOwnerID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Parent field.
   */
  public void setParent(entity.RuleVersion value);
  
  
  public void setParentID(gw.pl.persistence.core.Key value);
  
  
  
}