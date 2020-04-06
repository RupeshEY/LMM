package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "FinancialCriterion.eti;FinancialCriterion.eix;FinancialCriterion.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface FinancialCriterionInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.custom.FinancialCriterionPublicMethods, com.guidewire.pl.domain.custom.impl.FinancialCriterionInternalMethods, com.guidewire.pl.system.service.search.SearchCriterionChoice {
  /**
   * Gets the value of the AmountEnd field.
   * The high end (inclusive) of the allowable range of money values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAmountEnd();
  
  
  /**
   * Gets the value of the AmountStart field.
   * The low end (inclusive) of the allowable range of money values.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getAmountStart();
  
  
  /**
   * Gets the value of the ChosenOption field.
   * The chosen configurable search option, specifies the money field to be restricted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChosenOption();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FinancialCriterion getSubtype();
  
  
  /**
   * Sets the value of the AmountEnd field.
   */
  public void setAmountEnd(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the AmountStart field.
   */
  public void setAmountStart(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the ChosenOption field.
   */
  public void setChosenOption(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.FinancialCriterion value);
  
  
  
}