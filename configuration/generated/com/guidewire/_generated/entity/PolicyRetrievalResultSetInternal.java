package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PolicyRetrievalResultSet.eti;PolicyRetrievalResultSet.eix;PolicyRetrievalResultSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PolicyRetrievalResultSetInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.policy.entity.PolicyRetrievalResultSet {
  /**
   * Gets the value of the Result field.
   * Detailed information about the policy. This is valid only if exactly one policy is retrieved. If zero or multiple policies match the retrieval parameters, then this is null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getResult();
  
  
  public gw.pl.persistence.core.Key getResultID();
  
  
  /**
   * Gets the value of the NotUnique field.
   * True if the retrieval parameters map to multiple policies; false otherwise.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isNotUnique();
  
  
  /**
   * Sets the value of the NotUnique field.
   */
  public void setNotUnique(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Result field.
   */
  public void setResult(entity.Policy value);
  
  
  public void setResultID(gw.pl.persistence.core.Key value);
  
  
  
}