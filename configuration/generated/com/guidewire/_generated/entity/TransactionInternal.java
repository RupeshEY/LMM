package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Transaction.eti;Transaction.eix;Transaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface TransactionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.TransactionTAccountOperationsDelegateInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.impl.TransactionInternal, com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.entity.Transaction {
  java.lang.String TRANSACTIONADDED_EVENT = "TransactionAdded";
  
  java.lang.String TRANSACTIONCHANGED_EVENT = "TransactionChanged";
  
  java.lang.String TRANSACTIONREMOVED_EVENT = "TransactionRemoved";
  
  /**
   * Adds the given element to the LineItems array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToLineItems(entity.TransactionLineItem element);
  
  
  /**
   * Adds the given element to the Offsets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOffsets(entity.TransactionOffset element);
  
  
  /**
   * Adds the given element to the Onsets array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOnsets(entity.TransactionOnset element);
  
  
  /**
   * Adds the given element to the OriginTransactionOnsetArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOriginTransactionOnsetArray(entity.TransactionOnset element);
  
  
  /**
   * Adds the given element to the RecTAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRecTAccountTransactions(entity.RecTAccountTransaction element);
  
  
  /**
   * Adds the given element to the TAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTAccountTransactions(entity.TAccountTransaction element);
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.<p>Setting the claim also sets this transaction's currency to the claim's currency if it is null.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimToReportingExchangeRate field.
   * ExchangeRate to use when converting ClaimAmount to ReportingAmount. Setting this value updates the reporting amounts.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getClaimToReportingExchangeRate();
  
  
  public gw.pl.persistence.core.Key getClaimToReportingExchangeRateID();
  
  
  /**
   * Gets the value of the Comments field.
   * Comments about the transaction, such as a reason.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the CostCategory field.
   * The CostCategory for this transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostCategory getCostCategory();
  
  
  /**
   * Gets the value of the CostType field.
   * Type of cost (for example, claim cost or adjusting overhead).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
  /**
   * Gets the value of the Currency field.
   * The Currency of the transaction amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the LineItems field.
   * Set of line items that further categorize the transaction amount.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionLineItem[] getLineItems();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Offsets field.
   * Transactions that offset this transaction. A transaction should have at most one item in this array. This array is applicable only to a payment or recovery.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOffset[] getOffsets();
  
  
  /**
   * Gets the value of the Onsets field.
   * Transactions that onset this transaction. This array is applicable only to a payment or recovery.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOnset[] getOnsets();
  
  
  /**
   * Gets the value of the OriginTransactionOnset field.
   * TransactionOnset join entity pointing to this Transaction as an Onset.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOnset getOriginTransactionOnset();
  
  
  /**
   * Gets the value of the OriginTransactionOnsetArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionOnset[] getOriginTransactionOnsetArray();
  
  
  public gw.pl.persistence.core.Key getOriginTransactionOnsetID();
  
  
  /**
   * Gets the value of the RecTAccountTransactions field.
   * Set of T-account transactions that make up the lifecycle of this Transaction. Only applicable to Recoveries and RecoveryReserves.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecTAccountTransaction[] getRecTAccountTransactions();
  
  
  /**
   * Gets the value of the RecoveryCoding field.
   * The RecoveryCoding to which this transaction is coded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RecoveryCoding getRecoveryCoding();
  
  
  public gw.pl.persistence.core.Key getRecoveryCodingID();
  
  
  /**
   * Gets the value of the ReserveLine field.
   * The ReserveLine associated with this transaction.  For all transaction subtypes this ReserveLine will have matching Claim, Exposure, CostType and CostCategory.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ReserveLine getReserveLine();
  
  
  public gw.pl.persistence.core.Key getReserveLineID();
  
  
  /**
   * Gets the value of the ReservingCurrency field.
   * Reserving Currency of this transaction's ReserveLine. Indicates the currency in which reserves are to be set aside and eroded.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReservingCurrency();
  
  
  /**
   * Gets the value of the SubmitDate field.
   * Unused. May be removed in a future release.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getSubmitDate();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Transaction getSubtype();
  
  
  /**
   * Gets the value of the TAccountTransactions field.
   * Set of T-account transactions that make up the lifecycle of this Transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TAccountTransaction[] getTAccountTransactions();
  
  
  /**
   * Gets the value of the TransToClaimExchangeRate field.
   * ExchangeRate to use when converting TransactionAmount to ClaimAmount. Setting this value updates the claim and reporting amounts. Also sets the same ExchangeRate as TransToReservingExchangeRate if ClaimCurrency and ReservingCurrency are equal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getTransToClaimExchangeRate();
  
  
  public gw.pl.persistence.core.Key getTransToClaimExchangeRateID();
  
  
  /**
   * Gets the value of the TransToReservingExchangeRate field.
   * ExchangeRate to use when converting TransactionAmount to ReservingAmount. Setting this value updates the reserving amounts. Also sets the same ExchangeRate as TransToClaimExchangeRate if ClaimCurrency and ReservingCurrency are equal.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ExchangeRate getTransToReservingExchangeRate();
  
  
  public gw.pl.persistence.core.Key getTransToReservingExchangeRateID();
  
  
  /**
   * Gets the value of the TransactionSet field.
   * Set that groups together one or more transactions for approval.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.TransactionSet getTransactionSet();
  
  
  public gw.pl.persistence.core.Key getTransactionSetID();
  
  
  /**
   * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
   */
  public void removeFromLineItems(entity.TransactionLineItem element);
  
  
  /**
   * Removes the given element from the LineItems array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromLineItems(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Offsets array. This is achieved by marking the element for removal.
   */
  public void removeFromOffsets(entity.TransactionOffset element);
  
  
  /**
   * Removes the given element from the Offsets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOffsets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Onsets array. This is achieved by marking the element for removal.
   */
  public void removeFromOnsets(entity.TransactionOnset element);
  
  
  /**
   * Removes the given element from the Onsets array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOnsets(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the OriginTransactionOnsetArray array. This is achieved by marking the element for removal.
   */
  public void removeFromOriginTransactionOnsetArray(entity.TransactionOnset element);
  
  
  /**
   * Removes the given element from the OriginTransactionOnsetArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOriginTransactionOnsetArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the RecTAccountTransactions array. This is achieved by marking the element for removal.
   */
  public void removeFromRecTAccountTransactions(entity.RecTAccountTransaction element);
  
  
  /**
   * Removes the given element from the RecTAccountTransactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRecTAccountTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
   */
  public void removeFromTAccountTransactions(entity.TAccountTransaction element);
  
  
  /**
   * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTAccountTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimToReportingExchangeRate field.
   */
  public void setClaimToReportingExchangeRate(entity.ExchangeRate value);
  
  
  public void setClaimToReportingExchangeRateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the CostCategory field.
   */
  public void setCostCategory(typekey.CostCategory value);
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the LineItems field.
   */
  public void setLineItems(entity.TransactionLineItem[] value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the Offsets field.
   */
  public void setOffsets(entity.TransactionOffset[] value);
  
  
  /**
   * Sets the value of the Onsets field.
   */
  public void setOnsets(entity.TransactionOnset[] value);
  
  
  /**
   * Sets the value of the OriginTransactionOnset field.
   */
  public void setOriginTransactionOnset(entity.TransactionOnset value);
  
  
  /**
   * Sets the value of the OriginTransactionOnsetArray field.
   */
  public void setOriginTransactionOnsetArray(entity.TransactionOnset[] value);
  
  
  public void setOriginTransactionOnsetID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecTAccountTransactions field.
   */
  public void setRecTAccountTransactions(entity.RecTAccountTransaction[] value);
  
  
  /**
   * Sets the value of the RecoveryCoding field.
   */
  public void setRecoveryCoding(entity.RecoveryCoding value);
  
  
  public void setRecoveryCodingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReserveLine field.
   */
  public void setReserveLine(entity.ReserveLine value);
  
  
  public void setReserveLineID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReservingCurrency field.
   */
  public void setReservingCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the SubmitDate field.
   */
  public void setSubmitDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Transaction value);
  
  
  /**
   * Sets the value of the TAccountTransactions field.
   */
  public void setTAccountTransactions(entity.TAccountTransaction[] value);
  
  
  /**
   * Sets the value of the TransToClaimExchangeRate field.
   */
  public void setTransToClaimExchangeRate(entity.ExchangeRate value);
  
  
  public void setTransToClaimExchangeRateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TransToReservingExchangeRate field.
   */
  public void setTransToReservingExchangeRate(entity.ExchangeRate value);
  
  
  public void setTransToReservingExchangeRateID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the TransactionSet field.
   */
  public void setTransactionSet(entity.TransactionSet value);
  
  
  public void setTransactionSetID(gw.pl.persistence.core.Key value);
  
  
  
}