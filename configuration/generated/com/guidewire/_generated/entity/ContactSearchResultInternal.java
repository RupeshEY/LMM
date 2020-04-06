package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactSearchResult.eti;ContactSearchResult.eix;ContactSearchResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactSearchResultInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.contact.ContactSearchResultPublicMethods, com.guidewire.pl.domain.contact.impl.ContactSearchResultInternalMethods {
  /**
   * Gets the value of the Contact field.
   * Gets the Contact that was matched, or null if none.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the ResultType field.
   * Provides more detail about the result of the match.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactMatchResultType getResultType();
  
  
  /**
   * Gets the value of the SearchResultType field.
   * Indicates wheather the search succeeded of failed, and if failed, why.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactSearchResultType getSearchResultType();
  
  
  /**
   * Gets the value of the TotalResults field.
   * Gets the total number of results. This will only be populated if the corresponding ContactSearchResultSpec has includeTotal = true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalResults();
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ResultType field.
   */
  public void setResultType(typekey.ContactMatchResultType value);
  
  
  /**
   * Sets the value of the SearchResultType field.
   */
  public void setSearchResultType(typekey.ContactSearchResultType value);
  
  
  /**
   * Sets the value of the TotalResults field.
   */
  public void setTotalResults(java.lang.Integer value);
  
  
  
}