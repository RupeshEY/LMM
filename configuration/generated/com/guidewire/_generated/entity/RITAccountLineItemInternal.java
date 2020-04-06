package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITAccountLineItem.eti;RITAccountLineItem.eix;RITAccountLineItem.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RITAccountLineItemInternal extends com.guidewire._generated.entity.EditableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TAccountLineItemDelegateInternal, com.guidewire.cc.domain.financials.taccount.TAccountLineItemDelegateAdapter, gw.cc.financials.taccount.entity.RITAccountLineItem {
  /**
   * Gets the value of the CreditingTransaction field.
   * The TAccountTransaction for which this lineitem credits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountTransaction getCreditingTransaction();
  
  
  public gw.pl.persistence.core.Key getCreditingTransactionID();
  
  
  /**
   * Gets the value of the DebitingTransaction field.
   * The TAccountTransaction for which this lineitem debits a t-account.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountTransaction getDebitingTransaction();
  
  
  public gw.pl.persistence.core.Key getDebitingTransactionID();
  
  
  /**
   * Gets the value of the DenormTransaction field.
   * Denormalized FK to TAccountTransaction table in order to speed up certain queries.  If both CreditingTransactionID and DebitingTransactionID are not null, then this field is NULL, otherwise this field will have same value as the non-null FK.  This allows us to query against this field only when looking for TAccountTransactions that are currently contributing to a TAccount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountTransaction getDenormTransaction();
  
  
  public gw.pl.persistence.core.Key getDenormTransactionID();
  
  
  /**
   * Gets the value of the TAccount field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccount getTAccount();
  
  
  public gw.pl.persistence.core.Key getTAccountID();
  
  
  /**
   * Sets the value of the CreditingTransaction field.
   */
  public void setCreditingTransaction(entity.RITAccountTransaction value);
  
  
  public void setCreditingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DebitingTransaction field.
   */
  public void setDebitingTransaction(entity.RITAccountTransaction value);
  
  
  public void setDebitingTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DenormTransaction field.
   */
  public void setDenormTransaction(entity.RITAccountTransaction value);
  
  
  public void setDenormTransactionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TAccount field.
   */
  public void setTAccount(entity.RITAccount value);
  
  
  public void setTAccountID(gw.pl.persistence.core.Key value);
  
  
  
}