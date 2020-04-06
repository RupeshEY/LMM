package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "BulkInvoiceSearchCriteria.eti;BulkInvoiceSearchCriteria.eix;BulkInvoiceSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface BulkInvoiceSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.financials.bulkpay.impl.BulkInvoiceSearchCriteriaInternal, gw.cc.financials.bulkpay.entity.BulkInvoiceSearchCriteria, java.io.Serializable {
  /**
   * Gets the value of the CheckNumber field.
   * Match by check number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCheckNumber();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * Match by claim number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
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
   * Match by invoice number.
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
   * Match by PayTo.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPayTo();
  
  
  /**
   * Sets the value of the CheckNumber field.
   */
  public void setCheckNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
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