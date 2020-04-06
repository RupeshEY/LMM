package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "TAccountLineItem.eti;TAccountLineItem.eix;TAccountLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TAccountLineItemInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountLineItemDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountLineItemDelegateAdapter, com.guidewire.cc.domain.financials.taccount.impl.TAccountLineItemDelegateInternal, gw.cc.financials.taccount.entity.TAccountLineItem {
  /**
   * Gets the value of the CreditingTransaction field.
   * The TAccountTransaction for which this lineitem credits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction getCreditingTransaction();
  
  
  public gw.pl.persistence.core.Key getCreditingTransactionID();
  
  
  /**
   * Gets the value of the DebitingTransaction field.
   * The TAccountTransaction for which this lineitem debits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction getDebitingTransaction();
  
  
  public gw.pl.persistence.core.Key getDebitingTransactionID();
  
  
  /**
   * Gets the value of the DenormTransaction field.
   * Denormalized FK to TAccountTransaction table in order to speed up certain queries.  If both CreditingTransactionID and DebitingTransactionID are not null, then this field is NULL, otherwise this field will have same value as the non-null FK.  This allows us to query against this field only when looking for TAccountTransactions that are currently contributing to a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction getDenormTransaction();
  
  
  public gw.pl.persistence.core.Key getDenormTransactionID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the ReservingAmount field.
   * The amount of money (in the reserving currency) in this line item that was either credited or debited against a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReservingAmount();
  
  
  /**
   * Gets the value of the TAccount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccount getTAccount();
  
  
  public gw.pl.persistence.core.Key getTAccountID();
  
  
  /**
   * Sets the value of the CreditingTransaction field.
   */
  public void setCreditingTransaction(entity.TAccountTransaction value);
  
  
  public void setCreditingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DebitingTransaction field.
   */
  public void setDebitingTransaction(entity.TAccountTransaction value);
  
  
  public void setDebitingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DenormTransaction field.
   */
  public void setDenormTransaction(entity.TAccountTransaction value);
  
  
  public void setDenormTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  public void setReservingAmount(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the TAccount field.
   */
  public void setTAccount(entity.TAccount value);
  
  
  public void setTAccountID(gw.pl.persistence.core.Key value);
  
  
  
}