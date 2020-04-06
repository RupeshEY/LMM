package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoveryTAccountLineItem.eti;RecoveryTAccountLineItem.eix;RecoveryTAccountLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoveryTAccountLineItemInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountLineItemDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountLineItemDelegateAdapter {
  /**
   * Gets the value of the CreditingTransaction field.
   * The TAccountTransaction for which this lineitem credits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecTAccountTransaction getCreditingTransaction();
  
  
  public gw.pl.persistence.core.Key getCreditingTransactionID();
  
  
  /**
   * Gets the value of the DebitingTransaction field.
   * The TAccountTransaction for which this lineitem debits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecTAccountTransaction getDebitingTransaction();
  
  
  public gw.pl.persistence.core.Key getDebitingTransactionID();
  
  
  /**
   * Gets the value of the DenormTransaction field.
   * Denormalized FK to RecTAccountTransaction table in order to speed up certain queries.  If both CreditingTransactionID and DebitingTransactionID are not null, then this field is NULL, otherwise this field will have same value as the non-null FK.  This allows us to query against this field only when looking for RecTAccountTransactions that are currently contributing to a RecoveryTAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecTAccountTransaction getDenormTransaction();
  
  
  public gw.pl.persistence.core.Key getDenormTransactionID();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the RecoveryTAccount field.
   * RecoveryTAccount with which this line item is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryTAccount getRecoveryTAccount();
  
  
  public gw.pl.persistence.core.Key getRecoveryTAccountID();
  
  
  /**
   * Gets the value of the ReservingAmount field.
   * The amount of money (in the reserving currency) in this line item that was either credited or debited against a RecoveryTAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReservingAmount();
  
  
  /**
   * Sets the value of the CreditingTransaction field.
   */
  public void setCreditingTransaction(entity.RecTAccountTransaction value);
  
  
  public void setCreditingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DebitingTransaction field.
   */
  public void setDebitingTransaction(entity.RecTAccountTransaction value);
  
  
  public void setDebitingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DenormTransaction field.
   */
  public void setDenormTransaction(entity.RecTAccountTransaction value);
  
  
  public void setDenormTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the RecoveryTAccount field.
   */
  public void setRecoveryTAccount(entity.RecoveryTAccount value);
  
  
  public void setRecoveryTAccountID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReservingAmount field.
   */
  public void setReservingAmount(java.math.BigDecimal value);
  
  
  
}