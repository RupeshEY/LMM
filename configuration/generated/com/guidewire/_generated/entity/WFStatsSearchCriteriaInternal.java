package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "WFStatsSearchCriteria.eti;WFStatsSearchCriteria.eix;WFStatsSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface WFStatsSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.workflow.WFStatsSearchCriteriaPublicMethods, com.guidewire.pl.domain.workflow.impl.WFStatsSearchCriteriaInternalMethods, java.io.Serializable {
  /**
   * Gets the value of the DateFrom field.
   * Date lower bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateFrom();
  
  
  /**
   * Gets the value of the DateTo field.
   * Date upper bound.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getDateTo();
  
  
  /**
   * Gets the value of the Type field.
   * The type of workflow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Workflow getType();
  
  
  /**
   * Sets the value of the DateFrom field.
   */
  public void setDateFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the DateTo field.
   */
  public void setDateTo(java.util.Date value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.Workflow value);
  
  
  
}