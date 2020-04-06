package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Deductible.eti;Deductible.eix;Deductible.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DeductibleInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.api.financials.DeductibleUnlinkMethods, gw.cc.financials.deductible.entity.Deductible {
  /**
   * Adds the given element to the TransactionLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTransactionLineItems(entity.TransactionLineItem element);
  
  
  /**
   * Gets the value of the Amount field.
   * Deductible amount to be applied to a payment.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getAmount();
  
  
  /**
   * Gets the value of the Claim field.
   * The claim on which this deductible was created.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Coverage field.
   * The coverage, if any, whose deductible this entity represents.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Coverage getCoverage();
  
  
  public gw.pl.persistence.core.Key getCoverageID();
  
  
  /**
   * Gets the value of the Currency field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the EditReason field.
   * Reason for editing (override or waive) the deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEditReason();
  
  
  /**
   * Gets the value of the TransactionLineItems field.
   * The TransactionLineItems applied to this deductible.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionLineItem[] getTransactionLineItems();
  
  
  /**
   * Gets the value of the Overridden field.
   * Specifies whether this deductible has been overriden.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isOverridden();
  
  
  /**
   * Gets the value of the Paid field.
   * Specifies whether this deductible has been paid.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPaid();
  
  
  /**
   * Gets the value of the Waived field.
   * Specifies whether this deductible has been waived.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isWaived();
  
  
  /**
   * Removes the given element from the TransactionLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromTransactionLineItems(entity.TransactionLineItem element);
  
  
  /**
   * Removes the given element from the TransactionLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTransactionLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Amount field.
   */
  public void setAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Coverage field.
   */
  public void setCoverage(entity.Coverage value);
  
  
  public void setCoverageID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the EditReason field.
   */
  public void setEditReason(java.lang.String value);
  
  
  /**
   * Sets the value of the Overridden field.
   */
  public void setOverridden(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Paid field.
   */
  public void setPaid(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the TransactionLineItems field.
   */
  public void setTransactionLineItems(entity.TransactionLineItem[] value);
  
  
  /**
   * Sets the value of the Waived field.
   */
  public void setWaived(java.lang.Boolean value);
  
  
  
}