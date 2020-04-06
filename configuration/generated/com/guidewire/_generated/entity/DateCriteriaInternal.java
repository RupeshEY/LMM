package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DateCriteria.eti;DateCriteria.eix;DateCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DateCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.custom.DateCriteriaPublicMethods {
  /**
   * Gets the value of the DateFieldToSearch field.
   * The date field which is being restricted. The available choices are filtered by the SearchType field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DateFieldsToSearchType getDateFieldToSearch();
  
  
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
   * The type of search, filters the date fields allowed in the DateFieldToSearch field and the preset ranges allowed in the DateRangeChoice field.
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
   * Sets the value of the DateFieldToSearch field.
   */
  public void setDateFieldToSearch(typekey.DateFieldsToSearchType value);
  
  
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