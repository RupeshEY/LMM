package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RITransaction.eti;RITransaction.eix;RITransaction.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RITransactionInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.TransactionTAccountOperationsDelegateInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.financials.impl.RITransactionInternal, com.guidewire.cc.domain.financials.taccount.TransactionTAccountOperationsDelegateAdapter, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.cc.financials.entity.RITransaction {
  java.lang.String RITRANSACTIONADDED_EVENT = "RITransactionAdded";
  
  java.lang.String RITRANSACTIONCHANGED_EVENT = "RITransactionChanged";
  
  java.lang.String RITRANSACTIONREMOVED_EVENT = "RITransactionRemoved";
  
  /**
   * Adds the given element to the TAccountTransactions array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTAccountTransactions(entity.RITAccountTransaction element);
  
  
  /**
   * Gets the value of the Claim field.
   * The related claim.<p>Setting the claim also sets this transaction's currency (if null) to the claim's currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  /**
   * Gets the value of the ClaimAmount field.
   * The amount of this RITransaction in the Claim's currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getClaimAmount();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the ClaimToReportingExchangeRate field.
   * ExchangeRate to use when converting ClaimAmount to ReportingAmount. This must be null when the server is configured to run in single-currency mode and non-null otherwise.
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
   * Gets the value of the Exposure field.
   * The related exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Exposure getExposure();
  
  
  public gw.pl.persistence.core.Key getExposureID();
  
  
  /**
   * Gets the value of the RIAgreement field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RIAgreement getRIAgreement();
  
  
  public gw.pl.persistence.core.Key getRIAgreementID();
  
  
  /**
   * Gets the value of the RICoding field.
   * The RICoding on which this RI transaction is coded. The Claim, Exposure, CostType, CostCategory, and RIAgreement fields on an RI transaction match those same fields on its RICoding.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RICoding getRICoding();
  
  
  public gw.pl.persistence.core.Key getRICodingID();
  
  
  /**
   * Gets the value of the ReportingAmount field.
   * The amount of this line item in the app's default currency (reporting currency).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getReportingAmount();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RITransaction getSubtype();
  
  
  /**
   * Gets the value of the TAccountTransactions field.
   * Set of T-account transactions that make up the lifecycle of this Transaction.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITAccountTransaction[] getTAccountTransactions();
  
  
  /**
   * Gets the value of the TransactionSet field.
   * Set that groups together one or more transactions for approval.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.RITransactionSet getTransactionSet();
  
  
  public gw.pl.persistence.core.Key getTransactionSetID();
  
  
  /**
   * Gets the value of the Adjustment field.
   * True if this RITransaction was created to adjust the totals on its RICoding. This is usually used to distinguish explicit, user-requested adjustments from RITransactions that were created automatically for non-reinsurance Transactions.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isAdjustment();
  
  
  /**
   * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
   */
  public void removeFromTAccountTransactions(entity.RITAccountTransaction element);
  
  
  /**
   * Removes the given element from the TAccountTransactions array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTAccountTransactions(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the Adjustment field.
   */
  public void setAdjustment(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  /**
   * Sets the value of the ClaimAmount field.
   */
  public void setClaimAmount(gw.api.financials.CurrencyAmount value);
  
  
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
   * Sets the value of the Exposure field.
   */
  public void setExposure(entity.Exposure value);
  
  
  public void setExposureID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RIAgreement field.
   */
  public void setRIAgreement(entity.RIAgreement value);
  
  
  public void setRIAgreementID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RICoding field.
   */
  public void setRICoding(entity.RICoding value);
  
  
  public void setRICodingID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ReportingAmount field.
   */
  public void setReportingAmount(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.RITransaction value);
  
  
  /**
   * Sets the value of the TAccountTransactions field.
   */
  public void setTAccountTransactions(entity.RITAccountTransaction[] value);
  
  
  /**
   * Sets the value of the TransactionSet field.
   */
  public void setTransactionSet(entity.RITransactionSet value);
  
  
  public void setTransactionSetID(gw.pl.persistence.core.Key value);
  
  
  
}