package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "DocumentSearchResult.eti;DocumentSearchResult.eix;DocumentSearchResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface DocumentSearchResultInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.document.DocumentSearchResultPublicMethods, com.guidewire.pl.domain.document.impl.DocumentSearchResultInternalMethods {
  /**
   * Gets the value of the TotalResults field.
   * Gets the total number of results. Should only be populated if the corresponding DocumentSearchResultSpec has includeTotal = true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getTotalResults();
  
  
  /**
   * Sets the value of the TotalResults field.
   */
  public void setTotalResults(java.lang.Integer value);
  
  
  
}