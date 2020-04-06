package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SIUAnswerSet.eti;SIUAnswerSet.eix;SIUAnswerSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SIUAnswerSetInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.question.entity.SIUAnswerSet {
  /**
   * Gets the value of the AnswerSet field.
   * Fk to the AnswerSet
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.AnswerSet getAnswerSet();
  
  
  public gw.pl.persistence.core.Key getAnswerSetID();
  
  
  /**
   * Gets the value of the Claim field.
   * Fk to the Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Sets the value of the AnswerSet field.
   */
  public void setAnswerSet(entity.AnswerSet value);
  
  
  public void setAnswerSetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  
}