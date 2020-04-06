package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "RecoverySearchCriteria.eti;RecoverySearchCriteria.eix;RecoverySearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface RecoverySearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.financials.impl.RecoverySearchCriteriaInternal, gw.cc.financials.entity.RecoverySearchCriteria, java.io.Serializable {
  /**
   * Gets the value of the ClaimNumber field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the CostType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.CostType getCostType();
  
  
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
   * Gets the value of the NameCriteria field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCNameCriteria getNameCriteria();
  
  
  public gw.pl.persistence.core.Key getNameCriteriaID();
  
  
  /**
   * Gets the value of the RecoveryCategory field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.RecoveryCategory getRecoveryCategory();
  
  
  /**
   * Gets the value of the RecoveryStatus field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TransactionStatus getRecoveryStatus();
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the CostType field.
   */
  public void setCostType(typekey.CostType value);
  
  
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
   * Sets the value of the NameCriteria field.
   */
  public void setNameCriteria(entity.CCNameCriteria value);
  
  
  public void setNameCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the RecoveryCategory field.
   */
  public void setRecoveryCategory(typekey.RecoveryCategory value);
  
  
  /**
   * Sets the value of the RecoveryStatus field.
   */
  public void setRecoveryStatus(typekey.TransactionStatus value);
  
  
  
}