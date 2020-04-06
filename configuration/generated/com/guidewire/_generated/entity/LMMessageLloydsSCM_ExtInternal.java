package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LMMessageLloydsSCM_Ext.eti;LMMessageLloydsSCM_Ext.eix;LMMessageLloydsSCM_Ext.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LMMessageLloydsSCM_ExtInternal extends com.guidewire._generated.entity.LMMessage_ExtInternal {
  /**
   * Gets the value of the AsOfDate field.
   * Message as of date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getAsOfDate();
  
  
  /**
   * Gets the value of the BureauLeadingInsurerComments field.
   * Bureau leading insurer or reinsurer comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBureauLeadingInsurerComments();
  
  
  /**
   * Gets the value of the CedentPartyName field.
   * Cedent party name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCedentPartyName();
  
  
  /**
   * Gets the value of the ContactData field.
   * All contact information.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SCMMessageClaimDataContacts_Ext getContactData();
  
  
  public gw.pl.persistence.core.Key getContactDataID();
  
  
  /**
   * Gets the value of the CreationDate field.
   * Message creation date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getCreationDate();
  
  
  /**
   * Gets the value of the LossDescription field.
   * Loss description
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossDescription();
  
  
  /**
   * Gets the value of the LossEndDate field.
   * Loss end date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossEndDate();
  
  
  /**
   * Gets the value of the LossLocation field.
   * Loss location
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLossLocation();
  
  
  /**
   * Gets the value of the LossStartDate field.
   * Loss start date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getLossStartDate();
  
  
  /**
   * Gets the value of the MessageSequence field.
   * Message Sequence Number. Each OCR gets a new sequence number starting at 1.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getMessageSequence();
  
  
  /**
   * Gets the value of the MovementReferenceSequence field.
   * Movement Reference. Formatted as XX - Message Sequence
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMovementReferenceSequence();
  
  
  /**
   * Gets the value of the Narrative field.
   * Message's narrative
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNarrative();
  
  
  /**
   * Gets the value of the OCR field.
   * Originating Claim Office Reference
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOCR();
  
  
  /**
   * Gets the value of the OriginalCurrency field.
   * The original currency of the message
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOriginalCurrency();
  
  
  /**
   * Gets the value of the OutstandingFees field.
   * Financial amount of Outstanding Fees
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingFees();
  
  
  /**
   * Gets the value of the OutstandingFees_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingFees_amt();
  
  
  /**
   * Gets the value of the OutstandingFees_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingFees_cur();
  
  
  /**
   * Gets the value of the OutstandingIndemnity field.
   * Financial amount of Outstanding Indemnity
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getOutstandingIndemnity();
  
  
  /**
   * Gets the value of the OutstandingIndemnity_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getOutstandingIndemnity_amt();
  
  
  /**
   * Gets the value of the OutstandingIndemnity_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getOutstandingIndemnity_cur();
  
  
  /**
   * Gets the value of the PaidThisTimeFees field.
   * Financial amount of Fees Paid This Time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidThisTimeFees();
  
  
  /**
   * Gets the value of the PaidThisTimeFees_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidThisTimeFees_amt();
  
  
  /**
   * Gets the value of the PaidThisTimeFees_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidThisTimeFees_cur();
  
  
  /**
   * Gets the value of the PaidThisTimeIndemnity field.
   * Financial amount of Indemnity Paid This Time
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidThisTimeIndemnity();
  
  
  /**
   * Gets the value of the PaidThisTimeIndemnity_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidThisTimeIndemnity_amt();
  
  
  /**
   * Gets the value of the PaidThisTimeIndemnity_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidThisTimeIndemnity_cur();
  
  
  /**
   * Gets the value of the PaidToDateFees field.
   * Financial amount of Fees Paid To Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidToDateFees();
  
  
  /**
   * Gets the value of the PaidToDateFees_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidToDateFees_amt();
  
  
  /**
   * Gets the value of the PaidToDateFees_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidToDateFees_cur();
  
  
  /**
   * Gets the value of the PaidToDateIndemnity field.
   * Financial amount of Indemnity Paid To Date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.pl.currency.MonetaryAmount getPaidToDateIndemnity();
  
  
  /**
   * Gets the value of the PaidToDateIndemnity_amt field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getPaidToDateIndemnity_amt();
  
  
  /**
   * Gets the value of the PaidToDateIndemnity_cur field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPaidToDateIndemnity_cur();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Stores the Policy Number received in the message. Can either be the ReinsurerReference or InsurerReference.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the ReceiverShare field.
   * Insurer/Reinsurer (depending on which is the receiver) share on this claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getReceiverShare();
  
  
  /**
   * Gets the value of the SCMRiskCode field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.SCMRiskCode_Ext getSCMRiskCode();
  
  
  public gw.pl.persistence.core.Key getSCMRiskCodeID();
  
  
  /**
   * Gets the value of the SettlementCurrency field.
   * The currency in which amounts will be settled
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getSettlementCurrency();
  
  
  /**
   * Gets the value of the SyndicateLineNumber field.
   * Syndicate's Line Number on this Claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSyndicateLineNumber();
  
  
  /**
   * Sets the value of the AsOfDate field.
   */
  public void setAsOfDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BureauLeadingInsurerComments field.
   */
  public void setBureauLeadingInsurerComments(java.lang.String value);
  
  
  /**
   * Sets the value of the CedentPartyName field.
   */
  public void setCedentPartyName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactData field.
   */
  public void setContactData(entity.SCMMessageClaimDataContacts_Ext value);
  
  
  public void setContactDataID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CreationDate field.
   */
  public void setCreationDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossDescription field.
   */
  public void setLossDescription(java.lang.String value);
  
  
  /**
   * Sets the value of the LossEndDate field.
   */
  public void setLossEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LossLocation field.
   */
  public void setLossLocation(java.lang.String value);
  
  
  /**
   * Sets the value of the LossStartDate field.
   */
  public void setLossStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the MessageSequence field.
   */
  public void setMessageSequence(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the MovementReferenceSequence field.
   */
  public void setMovementReferenceSequence(java.lang.String value);
  
  
  /**
   * Sets the value of the Narrative field.
   */
  public void setNarrative(java.lang.String value);
  
  
  /**
   * Sets the value of the OCR field.
   */
  public void setOCR(java.lang.String value);
  
  
  /**
   * Sets the value of the OriginalCurrency field.
   */
  public void setOriginalCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the OutstandingFees field.
   */
  public void setOutstandingFees(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the OutstandingFees_amt field.
   */
  public void setOutstandingFees_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OutstandingFees_cur field.
   */
  public void setOutstandingFees_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the OutstandingIndemnity field.
   */
  public void setOutstandingIndemnity(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the OutstandingIndemnity_amt field.
   */
  public void setOutstandingIndemnity_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the OutstandingIndemnity_cur field.
   */
  public void setOutstandingIndemnity_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PaidThisTimeFees field.
   */
  public void setPaidThisTimeFees(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PaidThisTimeFees_amt field.
   */
  public void setPaidThisTimeFees_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidThisTimeFees_cur field.
   */
  public void setPaidThisTimeFees_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PaidThisTimeIndemnity field.
   */
  public void setPaidThisTimeIndemnity(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PaidThisTimeIndemnity_amt field.
   */
  public void setPaidThisTimeIndemnity_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidThisTimeIndemnity_cur field.
   */
  public void setPaidThisTimeIndemnity_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PaidToDateFees field.
   */
  public void setPaidToDateFees(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PaidToDateFees_amt field.
   */
  public void setPaidToDateFees_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidToDateFees_cur field.
   */
  public void setPaidToDateFees_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PaidToDateIndemnity field.
   */
  public void setPaidToDateIndemnity(gw.pl.currency.MonetaryAmount value);
  
  
  /**
   * Sets the value of the PaidToDateIndemnity_amt field.
   */
  public void setPaidToDateIndemnity_amt(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the PaidToDateIndemnity_cur field.
   */
  public void setPaidToDateIndemnity_cur(typekey.Currency value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ReceiverShare field.
   */
  public void setReceiverShare(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the SCMRiskCode field.
   */
  public void setSCMRiskCode(entity.SCMRiskCode_Ext value);
  
  
  public void setSCMRiskCodeID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the SettlementCurrency field.
   */
  public void setSettlementCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the SyndicateLineNumber field.
   */
  public void setSyndicateLineNumber(java.lang.String value);
  
  
  
}