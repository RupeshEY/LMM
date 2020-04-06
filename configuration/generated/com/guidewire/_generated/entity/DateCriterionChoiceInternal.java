package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateCriterionChoice.eti;DateCriterionChoice.eix;DateCriterionChoice.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateCriterionChoiceInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.custom.DateCriterionChoicePublicMethods, com.guidewire.pl.domain.custom.impl.DateCriterionChoiceInternalMethods, com.guidewire.pl.system.service.search.SearchCriterionChoice {
  /**
   * Gets the value of the ChosenOption field.
   * The chosen configurable search option, specifies the date field to be restricted.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getChosenOption();
  
  
  /**
   * Gets the value of the DateRangeChoice field.
   * The chosen preset date range, if any. The available ranges are filtered by the SearchType field. Used if DateSearchType is "fromlist".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateRangeChoiceType getDateRangeChoice();
  
  
  /**
   * Gets the value of the DateSearchType field.
   * The type of date search, either "fromlist" (for a preset range) or "enteredrange" (for an explicitly entered range).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateSearchType getDateSearchType();
  
  
  /**
   * Gets the value of the EndDate field.
   * The end (inclusive) of the date range to which the chosen date field should be restricted.  Used if DateSearchType is "enteredrange".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the SearchType field.
   * The type of search, filters the preset ranges allowed in the DateRangeChoice field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SearchObjectType getSearchType();
  
  
  /**
   * Gets the value of the StartDate field.
   * The start (inclusive) of the date range to which the chosen date field should be restricted. Used if DateSearchType is "enteredrange".
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Sets the value of the ChosenOption field.
   */
  public void setChosenOption(java.lang.String value);
  
  
  /**
   * Sets the value of the DateRangeChoice field.
   */
  public void setDateRangeChoice(typekey.DateRangeChoiceType value);
  
  
  /**
   * Sets the value of the DateSearchType field.
   */
  public void setDateSearchType(typekey.DateSearchType value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the SearchType field.
   */
  public void setSearchType(typekey.SearchObjectType value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  
}