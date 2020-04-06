package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "SearchResult.eti;SearchResult.eix;SearchResult.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface SearchResultInternal extends com.guidewire._generated.entity.VersionableInternal {
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SearchResult getSubtype();
  
  
  /**
   * Gets the value of the UncappedResultCount field.
   * Returns the total number of matches that would have been returned had the results not been capped, or null if the value is unknown. The result of this method is relevant only if ResultsCapped returns true.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getUncappedResultCount();
  
  
  /**
   * Gets the value of the ResultsCapped field.
   * Returns true if and only if the results of the search have been capped, that is, if fewer results are contained in this result than actually satisfied the search criteria.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isResultsCapped();
  
  
  /**
   * Sets the value of the ResultsCapped field.
   */
  public void setResultsCapped(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.SearchResult value);
  
  
  /**
   * Sets the value of the UncappedResultCount field.
   */
  public void setUncappedResultCount(java.lang.Integer value);
  
  
  
}