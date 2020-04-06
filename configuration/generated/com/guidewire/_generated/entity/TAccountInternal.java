package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccount.eti;TAccount.eix;TAccount.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountInternal, gw.cc.financials.taccount.entity.TAccount {
  /**
   * Adds the given element to the Entries array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEntries(entity.TAccountLineItem element);
  
  
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
   * Gets the value of the Entries field.
   * Set of TAccountLineItems that contribute to this T-Account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountLineItem[] getEntries();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReserveLine field.
   * FK to the ReserveLine that this TAccount is associated with.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine();
  
  
  public gw.pl.persistence.core.Key getReserveLineID();
  
  
  /**
   * Removes the given element from the Entries array. This is achieved by marking the element for removal.
   */
  public void removeFromEntries(entity.TAccountLineItem element);
  
  
  /**
   * Removes the given element from the Entries array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEntries(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the CreditReservingBalance field.
   */
  public void setCreditReservingBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the DebitReservingBalance field.
   */
  public void setDebitReservingBalance(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Entries field.
   */
  public void setEntries(entity.TAccountLineItem[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReserveLine field.
   */
  public void setReserveLine(entity.ReserveLine value);
  
  
  public void setReserveLineID(gw.pl.persistence.core.Key value);
  
  
  
}