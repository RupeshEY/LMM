package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoveryTAccount.eti;RecoveryTAccount.eix;RecoveryTAccount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoveryTAccountInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.RecoveryTAccountInternal {
  /**
   * Adds the given element to the RecoveryTAccountLineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecoveryTAccountLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Gets the value of the CreditReservingBalance field.
   * The balance of the reserving currency credit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCreditReservingBalance();
  
  
  /**
   * Gets the value of the DebitReservingBalance field.
   * The balance of the reserving currency debit side of this t-account's ledger.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getDebitReservingBalance();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RecoveryCoding field.
   * FK to the RecoveryCoding that this TAccount is assoicated with.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryCoding getRecoveryCoding();
  
  
  public gw.pl.persistence.core.Key getRecoveryCodingID();
  
  
  /**
   * Gets the value of the RecoveryTAccountLineItems field.
   * Line items for this RecoveryTAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryTAccountLineItem[] getRecoveryTAccountLineItems();
  
  
  /**
   * Removes the given element from the RecoveryTAccountLineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromRecoveryTAccountLineItems(entity.RecoveryTAccountLineItem element);
  
  
  /**
   * Removes the given element from the RecoveryTAccountLineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecoveryTAccountLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreditReservingBalance field.
   */
  public void setCreditReservingBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DebitReservingBalance field.
   */
  public void setDebitReservingBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RecoveryCoding field.
   */
  public void setRecoveryCoding(entity.RecoveryCoding value);
  
  
  public void setRecoveryCodingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecoveryTAccountLineItems field.
   */
  public void setRecoveryTAccountLineItems(entity.RecoveryTAccountLineItem[] value);
  
  
  
}