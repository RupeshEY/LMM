package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ECFMessageClaimDataFinancial_Ext.eti;ECFMessageClaimDataFinancial_Ext.eix;ECFMessageClaimDataFinancial_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ECFMessageClaimDataFinancial_ExtInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal {
  /**
   * Gets the value of the AgreedNotSettled field.
   * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getAgreedNotSettled();
  
  
  /**
   * Gets the value of the AgreedNotSettled_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAgreedNotSettled_amt();
  
  
  /**
   * Gets the value of the AgreedNotSettled_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getAgreedNotSettled_cur();
  
  
  /**
   * Gets the value of the ClaimAgreedNotSettled field.
   * The amount that was previously agreed however not settled as yet on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getClaimAgreedNotSettled();
  
  
  /**
   * Gets the value of the ClaimAgreedNotSettled_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimAgreedNotSettled_amt();
  
  
  /**
   * Gets the value of the ClaimAgreedNotSettled_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimAgreedNotSettled_cur();
  
  
  /**
   * Gets the value of the ClaimLastPaid field.
   * The Previously Paid amount on a binder claim (For agreement only) at claim level. Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getClaimLastPaid();
  
  
  /**
   * Gets the value of the ClaimLastPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getClaimLastPaid_amt();
  
  
  /**
   * Gets the value of the ClaimLastPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getClaimLastPaid_cur();
  
  
  /**
   * Gets the value of the Currency field.
   * Reference Currency i.e. Original Currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrency();
  
  
  /**
   * Gets the value of the CurrentAgreeded field.
   * The amount to be agreed this time on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentAgreeded();
  
  
  /**
   * Gets the value of the CurrentAgreeded_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentAgreeded_amt();
  
  
  /**
   * Gets the value of the CurrentAgreeded_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentAgreeded_cur();
  
  
  /**
   * Gets the value of the CurrentCostsForContract field.
   * The amount now payable in respect of losses and expenses as reported in the current claim movement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentCostsForContract();
  
  
  /**
   * Gets the value of the CurrentCostsForContract_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentCostsForContract_amt();
  
  
  /**
   * Gets the value of the CurrentCostsForContract_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentCostsForContract_cur();
  
  
  /**
   * Gets the value of the CurrentLossesForContract field.
   * The amount now payable in respect of losses as reported in the current claim movement
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentLossesForContract();
  
  
  /**
   * Gets the value of the CurrentLossesForContract_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentLossesForContract_amt();
  
  
  /**
   * Gets the value of the CurrentLossesForContract_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentLossesForContract_cur();
  
  
  /**
   * Gets the value of the CurrentPaid field.
   * The amount to be Paid This Time on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getCurrentPaid();
  
  
  /**
   * Gets the value of the CurrentPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getCurrentPaid_amt();
  
  
  /**
   * Gets the value of the CurrentPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getCurrentPaid_cur();
  
  
  /**
   * Gets the value of the ECFMsg field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ECFMessageClaimData_Ext getECFMsg();
  
  
  public gw.pl.persistence.core.Key getECFMsgID();
  
  
  /**
   * Gets the value of the ExchangeRate field.
   * The rate of exchange
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getExchangeRate();
  
  
  /**
   * Gets the value of the FguAmountIncurred field.
   * The ISO (International standards organisation) coded identification of the currency in which all claim amounts for a contract are reported
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getFguAmountIncurred();
  
  
  /**
   * Gets the value of the FguAmountIncurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFguAmountIncurred_amt();
  
  
  /**
   * Gets the value of the FguAmountIncurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getFguAmountIncurred_cur();
  
  
  /**
   * Gets the value of the FguNarrative field.
   * Description of the current estimate for the claim from the ground up (i.e. the expected final total amount that will be paid for the claim overall)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFguNarrative();
  
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent field.
   * The paid loss plus expense for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getFullCostsPaidBefoRetent();
  
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getFullCostsPaidBefoRetent_amt();
  
  
  /**
   * Gets the value of the FullCostsPaidBefoRetent_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getFullCostsPaidBefoRetent_cur();
  
  
  /**
   * Gets the value of the ImportedServicesAmount field.
   * The amount of Imported Services that is included in the settlement amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getImportedServicesAmount();
  
  
  /**
   * Gets the value of the ImportedServicesAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getImportedServicesAmount_amt();
  
  
  /**
   * Gets the value of the ImportedServicesAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getImportedServicesAmount_cur();
  
  
  /**
   * Gets the value of the ImportedServicesNarrative field.
   * Explanation of the Imported Services amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getImportedServicesNarrative();
  
  
  /**
   * Gets the value of the Incurred field.
   * The Incurred amount  on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getIncurred();
  
  
  /**
   * Gets the value of the Incurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getIncurred_amt();
  
  
  /**
   * Gets the value of the Incurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getIncurred_cur();
  
  
  /**
   * Gets the value of the LeadReserveAmount field.
   * The amount of reserve recommended by the Leader, in original currency, not including any outstanding fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveAmount();
  
  
  /**
   * Gets the value of the LeadReserveAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveAmount_amt();
  
  
  /**
   * Gets the value of the LeadReserveAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveAmount_cur();
  
  
  /**
   * Gets the value of the LeadReserveFees field.
   * The amount of reserve for fees recommended by the Leader, in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLeadReserveFees();
  
  
  /**
   * Gets the value of the LeadReserveFees_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLeadReserveFees_amt();
  
  
  /**
   * Gets the value of the LeadReserveFees_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLeadReserveFees_cur();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount field.
   * Letter of Credit Amount (in Settlement Currency). 100% amount is shown
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLetterOfCreditAmount();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLetterOfCreditAmount_amt();
  
  
  /**
   * Gets the value of the LetterOfCreditAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLetterOfCreditAmount_cur();
  
  
  /**
   * Gets the value of the LetterOfCreditReference field.
   * The reference identifying a Letter of Credit
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLetterOfCreditReference();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LossAndExpensesIncurred field.
   * Total paid and outstanding loss amount (excluding expenses) from Zero for this claim to the Insured including claims under all policies from anyone and uninsured amounts
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getLossAndExpensesIncurred();
  
  
  /**
   * Gets the value of the LossAndExpensesIncurred_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getLossAndExpensesIncurred_amt();
  
  
  /**
   * Gets the value of the LossAndExpensesIncurred_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getLossAndExpensesIncurred_cur();
  
  
  /**
   * Gets the value of the Outstanding field.
   * The outstanding amount on a binder claim (For agreement  only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstanding();
  
  
  /**
   * Gets the value of the OutstandingLossPlus field.
   * The loss plus expense incurred for the claim under the contract before any applicable contract retention has been applied, and without any applicable contract limit being taken into consideration. The incurred amount under the contract as at a certain date is the sum of the the total paid amount and the oustanding claim amount as at the same date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingLossPlus();
  
  
  /**
   * Gets the value of the OutstandingLossPlus_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingLossPlus_amt();
  
  
  /**
   * Gets the value of the OutstandingLossPlus_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingLossPlus_cur();
  
  
  /**
   * Gets the value of the Outstanding_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstanding_amt();
  
  
  /**
   * Gets the value of the Outstanding_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstanding_cur();
  
  
  /**
   * Gets the value of the PreviouslyPaid field.
   * The Previously Paid amount on a binder claim (For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPreviouslyPaid();
  
  
  /**
   * Gets the value of the PreviouslyPaid_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPreviouslyPaid_amt();
  
  
  /**
   * Gets the value of the PreviouslyPaid_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPreviouslyPaid_cur();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to Fees, expressed as 100% amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getProfAdvisorFeesCurPayment();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getProfAdvisorFeesCurPayment_amt();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesCurPayment_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getProfAdvisorFeesCurPayment_cur();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding field.
   * The outstanding fees in original currency (also included in the outstanding)’: i.e. the overall Outstanding Amount (Orig Ccy) will include this amount as well as indemnity amount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getProfAdvisorFeesOutstanding();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getProfAdvisorFeesOutstanding_amt();
  
  
  /**
   * Gets the value of the ProfAdvisorFeesOutstanding_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getProfAdvisorFeesOutstanding_cur();
  
  
  /**
   * Gets the value of the ReinsuredReleasedAmount field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve released by a reinsured, expressed as 100% figure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredReleasedAmount();
  
  
  /**
   * Gets the value of the ReinsuredReleasedAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredReleasedAmount_amt();
  
  
  /**
   * Gets the value of the ReinsuredReleasedAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredReleasedAmount_cur();
  
  
  /**
   * Gets the value of the ReinsuredRetainedAmount field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to the reserve retained by a reinsured, expressed as 100%
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredRetainedAmount();
  
  
  /**
   * Gets the value of the ReinsuredRetainedAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredRetainedAmount_amt();
  
  
  /**
   * Gets the value of the ReinsuredRetainedAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredRetainedAmount_cur();
  
  
  /**
   * Gets the value of the ReinsuredRetainedInterest field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to interest on the reserve retained by a reinsured, expressed as 100%
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getReinsuredRetainedInterest();
  
  
  /**
   * Gets the value of the ReinsuredRetainedInterest_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReinsuredRetainedInterest_amt();
  
  
  /**
   * Gets the value of the ReinsuredRetainedInterest_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getReinsuredRetainedInterest_cur();
  
  
  /**
   * Gets the value of the SettlementAmount field.
   * The 100% settlement amount in settlement currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementAmount();
  
  
  /**
   * Gets the value of the SettlementAmount_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementAmount_amt();
  
  
  /**
   * Gets the value of the SettlementAmount_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementAmount_cur();
  
  
  /**
   * Gets the value of the SettlementTax field.
   * The part of the settled amount (in original currency) for the claim transaction that relates to tax (other than VAT). Expressed as 100% figure
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementTax();
  
  
  /**
   * Gets the value of the SettlementTax_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementTax_amt();
  
  
  /**
   * Gets the value of the SettlementTax_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementTax_cur();
  
  
  /**
   * Gets the value of the SettlementVat field.
   * The calculated VAT amount to be paid on the claim. Included in the Settlement Amount in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getSettlementVat();
  
  
  /**
   * Gets the value of the SettlementVat_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getSettlementVat_amt();
  
  
  /**
   * Gets the value of the SettlementVat_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementVat_cur();
  
  
  /**
   * Gets the value of the Vat field.
   * The VAT amount on a binder claim(For agreement only). Included in original currency
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getVat();
  
  
  /**
   * Gets the value of the Vat_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getVat_amt();
  
  
  /**
   * Gets the value of the Vat_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getVat_cur();
  
  
  /**
   * Sets the value of the AgreedNotSettled field.
   */
  public void setAgreedNotSettled(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the AgreedNotSettled_amt field.
   */
  public void setAgreedNotSettled_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the AgreedNotSettled_cur field.
   */
  public void setAgreedNotSettled_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ClaimAgreedNotSettled field.
   */
  public void setClaimAgreedNotSettled(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ClaimAgreedNotSettled_amt field.
   */
  public void setClaimAgreedNotSettled_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClaimAgreedNotSettled_cur field.
   */
  public void setClaimAgreedNotSettled_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ClaimLastPaid field.
   */
  public void setClaimLastPaid(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ClaimLastPaid_amt field.
   */
  public void setClaimLastPaid_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ClaimLastPaid_cur field.
   */
  public void setClaimLastPaid_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the Currency field.
   */
  public void setCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the CurrentAgreeded field.
   */
  public void setCurrentAgreeded(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the CurrentAgreeded_amt field.
   */
  public void setCurrentAgreeded_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CurrentAgreeded_cur field.
   */
  public void setCurrentAgreeded_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the CurrentCostsForContract field.
   */
  public void setCurrentCostsForContract(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the CurrentCostsForContract_amt field.
   */
  public void setCurrentCostsForContract_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CurrentCostsForContract_cur field.
   */
  public void setCurrentCostsForContract_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the CurrentLossesForContract field.
   */
  public void setCurrentLossesForContract(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the CurrentLossesForContract_amt field.
   */
  public void setCurrentLossesForContract_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CurrentLossesForContract_cur field.
   */
  public void setCurrentLossesForContract_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the CurrentPaid field.
   */
  public void setCurrentPaid(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the CurrentPaid_amt field.
   */
  public void setCurrentPaid_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the CurrentPaid_cur field.
   */
  public void setCurrentPaid_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ECFMsg field.
   */
  public void setECFMsg(entity.ECFMessageClaimData_Ext value);
  
  
  public void setECFMsgID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ExchangeRate field.
   */
  public void setExchangeRate(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FguAmountIncurred field.
   */
  public void setFguAmountIncurred(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the FguAmountIncurred_amt field.
   */
  public void setFguAmountIncurred_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FguAmountIncurred_cur field.
   */
  public void setFguAmountIncurred_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the FguNarrative field.
   */
  public void setFguNarrative(java.lang.String value);
  
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent field.
   */
  public void setFullCostsPaidBefoRetent(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent_amt field.
   */
  public void setFullCostsPaidBefoRetent_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the FullCostsPaidBefoRetent_cur field.
   */
  public void setFullCostsPaidBefoRetent_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount field.
   */
  public void setImportedServicesAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount_amt field.
   */
  public void setImportedServicesAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ImportedServicesAmount_cur field.
   */
  public void setImportedServicesAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ImportedServicesNarrative field.
   */
  public void setImportedServicesNarrative(java.lang.String value);
  
  
  /**
   * Sets the value of the Incurred field.
   */
  public void setIncurred(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the Incurred_amt field.
   */
  public void setIncurred_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Incurred_cur field.
   */
  public void setIncurred_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveAmount field.
   */
  public void setLeadReserveAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveAmount_amt field.
   */
  public void setLeadReserveAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveAmount_cur field.
   */
  public void setLeadReserveAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LeadReserveFees field.
   */
  public void setLeadReserveFees(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LeadReserveFees_amt field.
   */
  public void setLeadReserveFees_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LeadReserveFees_cur field.
   */
  public void setLeadReserveFees_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount field.
   */
  public void setLetterOfCreditAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount_amt field.
   */
  public void setLetterOfCreditAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LetterOfCreditAmount_cur field.
   */
  public void setLetterOfCreditAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the LetterOfCreditReference field.
   */
  public void setLetterOfCreditReference(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LossAndExpensesIncurred field.
   */
  public void setLossAndExpensesIncurred(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the LossAndExpensesIncurred_amt field.
   */
  public void setLossAndExpensesIncurred_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the LossAndExpensesIncurred_cur field.
   */
  public void setLossAndExpensesIncurred_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the Outstanding field.
   */
  public void setOutstanding(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the OutstandingLossPlus field.
   */
  public void setOutstandingLossPlus(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the OutstandingLossPlus_amt field.
   */
  public void setOutstandingLossPlus_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OutstandingLossPlus_cur field.
   */
  public void setOutstandingLossPlus_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the Outstanding_amt field.
   */
  public void setOutstanding_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Outstanding_cur field.
   */
  public void setOutstanding_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PreviouslyPaid field.
   */
  public void setPreviouslyPaid(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PreviouslyPaid_amt field.
   */
  public void setPreviouslyPaid_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PreviouslyPaid_cur field.
   */
  public void setPreviouslyPaid_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment field.
   */
  public void setProfAdvisorFeesCurPayment(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment_amt field.
   */
  public void setProfAdvisorFeesCurPayment_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesCurPayment_cur field.
   */
  public void setProfAdvisorFeesCurPayment_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding field.
   */
  public void setProfAdvisorFeesOutstanding(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding_amt field.
   */
  public void setProfAdvisorFeesOutstanding_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ProfAdvisorFeesOutstanding_cur field.
   */
  public void setProfAdvisorFeesOutstanding_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ReinsuredReleasedAmount field.
   */
  public void setReinsuredReleasedAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ReinsuredReleasedAmount_amt field.
   */
  public void setReinsuredReleasedAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ReinsuredReleasedAmount_cur field.
   */
  public void setReinsuredReleasedAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedAmount field.
   */
  public void setReinsuredRetainedAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedAmount_amt field.
   */
  public void setReinsuredRetainedAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedAmount_cur field.
   */
  public void setReinsuredRetainedAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedInterest field.
   */
  public void setReinsuredRetainedInterest(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedInterest_amt field.
   */
  public void setReinsuredRetainedInterest_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ReinsuredRetainedInterest_cur field.
   */
  public void setReinsuredRetainedInterest_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the SettlementAmount field.
   */
  public void setSettlementAmount(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the SettlementAmount_amt field.
   */
  public void setSettlementAmount_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SettlementAmount_cur field.
   */
  public void setSettlementAmount_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the SettlementTax field.
   */
  public void setSettlementTax(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the SettlementTax_amt field.
   */
  public void setSettlementTax_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SettlementTax_cur field.
   */
  public void setSettlementTax_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the SettlementVat field.
   */
  public void setSettlementVat(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the SettlementVat_amt field.
   */
  public void setSettlementVat_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SettlementVat_cur field.
   */
  public void setSettlementVat_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the Vat field.
   */
  public void setVat(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the Vat_amt field.
   */
  public void setVat_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the Vat_cur field.
   */
  public void setVat_cur(typekey.Currency value);
  
  
  
}