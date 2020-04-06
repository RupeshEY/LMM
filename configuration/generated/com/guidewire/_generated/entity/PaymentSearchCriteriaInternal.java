package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "PaymentSearchCriteria.eti;PaymentSearchCriteria.eix;PaymentSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface PaymentSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.financials.impl.PaymentSearchCriteriaInternal, gw.cc.financials.entity.PaymentSearchCriteria, java.io.Serializable {
  /**
   * Gets the value of the ApprovedByGroup field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.GroupSearchCriterion getApprovedByGroup();
  
  
  public gw.pl.persistence.core.Key getApprovedByGroupID();
  
  
  /**
   * Gets the value of the ApprovedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getApprovedByUser();
  
  
  public gw.pl.persistence.core.Key getApprovedByUserID();
  
  
  /**
   * Gets the value of the CheckNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber();
  
  
  /**
   * Gets the value of the CheckStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getCheckStatus();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * Claim number to search for.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CreatedByUser field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.User getCreatedByUser();
  
  
  public gw.pl.persistence.core.Key getCreatedByUserID();
  
  
  /**
   * Gets the value of the DateCriterionChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.DateCriterionChoice getDateCriterionChoice();
  
  
  public gw.pl.persistence.core.Key getDateCriterionChoiceID();
  
  
  /**
   * Gets the value of the FinancialCriterion field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.FinancialCriterionMC getFinancialCriterion();
  
  
  public gw.pl.persistence.core.Key getFinancialCriterionID();
  
  
  /**
   * Gets the value of the InvoiceNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getInvoiceNumber();
  
  
  /**
   * Gets the value of the NameCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCNameCriteria getNameCriteria();
  
  
  public gw.pl.persistence.core.Key getNameCriteriaID();
  
  
  /**
   * Gets the value of the PayTo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo();
  
  
  /**
   * Sets the value of the ApprovedByGroup field.
   */
  public void setApprovedByGroup(entity.GroupSearchCriterion value);
  
  
  public void setApprovedByGroupID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ApprovedByUser field.
   */
  public void setApprovedByUser(entity.User value);
  
  
  public void setApprovedByUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CheckStatus field.
   */
  public void setCheckStatus(typekey.TransactionStatus value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CreatedByUser field.
   */
  public void setCreatedByUser(entity.User value);
  
  
  public void setCreatedByUserID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the DateCriterionChoice field.
   */
  public void setDateCriterionChoice(entity.DateCriterionChoice value);
  
  
  public void setDateCriterionChoiceID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FinancialCriterion field.
   */
  public void setFinancialCriterion(entity.FinancialCriterionMC value);
  
  
  public void setFinancialCriterionID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the InvoiceNumber field.
   */
  public void setInvoiceNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the NameCriteria field.
   */
  public void setNameCriteria(entity.CCNameCriteria value);
  
  
  public void setNameCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PayTo field.
   */
  public void setPayTo(java.lang.String value);
  
  
  
}