package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITransactionSet.eti;RITransactionSet.eix;RITransactionSet.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RITransactionSetInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire.cc.domain.financials.impl.RITransactionSetInternal, gw.cc.financials.entity.RITransactionSet {
  /**
   * Adds the given element to the RITransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRITransactions(entity.RITransaction element);
  
  
  /**
   * Gets the value of the Claim field.
   * The claim entity to which this TransactionSet belongs.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the RI Transaction Set.  Typically, comments give some sense of why the transactions were created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the RITransactions field.
   * RITransactions in the set.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITransaction[] getRITransactions();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RITransactionSet getSubtype();
  
  
  /**
   * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
   */
  public void removeFromRITransactions(entity.RITransaction element);
  
  
  /**
   * Removes the given element from the RITransactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRITransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the RITransactions field.
   */
  public void setRITransactions(entity.RITransaction[] value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RITransactionSet value);
  
  
  
}