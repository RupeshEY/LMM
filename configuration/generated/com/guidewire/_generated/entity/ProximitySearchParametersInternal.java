package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ProximitySearchParameters.eti;ProximitySearchParameters.eix;ProximitySearchParameters.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ProximitySearchParametersInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.pl.domain.contact.ProximitySearchParametersPublicMethods, com.guidewire.pl.domain.contact.impl.ProximitySearchParametersInternalMethods {
  /**
   * Gets the value of the CorrectedSearchCenter field.
   * The corrected address (if any) corresponding to the SpatialPoint of that is being searched for, in localized/user-displayable form. This is normally set by the ProximitySearchPageHelper.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getCorrectedSearchCenter();
  
  
  /**
   * Gets the value of the GeocodeStatus field.
   * Gives the status of the provided SpatialPoint; this is normally copied from the a Geocodable entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.GeocodeStatus getGeocodeStatus();
  
  
  /**
   * Gets the value of the Number field.
   * Indicates either the radius (in UnitOfDistance units) if a distance based search, or the number of results to return if an ordinal search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getNumber();
  
  
  /**
   * Gets the value of the RadiusSearchMaxResults field.
   * Indicates the maximum number of items to return on a radius search.  Ignored if DistanceBasedSearch is false; if DistanceBasedSearch is true, and this value is null, zero, or negative, the search will be limited by the value of ProximityRadiusSearchDefaultMaxResultCount
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getRadiusSearchMaxResults();
  
  
  /**
   * Gets the value of the SavedSearchCenter field.
   * Used internally by ProximitySearchPageHelper to save the search center address (if any) in standardized form; DO NOT USE unless you are overriding the standard performProximitySearch() method.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getSavedSearchCenter();
  
  
  /**
   * Gets the value of the SpatialPoint field.
   * SpatialPoint to do a proximity search from; this is normally copied from the a Geocodable entity.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.database.spatial.SpatialPoint getSpatialPoint();
  
  
  /**
   * Gets the value of the UnitOfDistance field.
   * Indicates the UnitOfDistance to use, both to return distances in results and to indicate the unit of radius for distance-based searches.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.UnitOfDistance getUnitOfDistance();
  
  
  /**
   * Gets the value of the DistanceBasedSearch field.
   * Indicates whether this is a distance based search (within n-mi/km) or an ordinal search (nearest-n)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isDistanceBasedSearch();
  
  
  /**
   * Sets the value of the CorrectedSearchCenter field.
   */
  public void setCorrectedSearchCenter(java.lang.String value);
  
  
  /**
   * Sets the value of the DistanceBasedSearch field.
   */
  public void setDistanceBasedSearch(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the GeocodeStatus field.
   */
  public void setGeocodeStatus(typekey.GeocodeStatus value);
  
  
  /**
   * Sets the value of the Number field.
   */
  public void setNumber(java.lang.Integer value);
  
  
  /**
   * Sets the value of the RadiusSearchMaxResults field.
   */
  public void setRadiusSearchMaxResults(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SavedSearchCenter field.
   */
  public void setSavedSearchCenter(java.lang.String value);
  
  
  /**
   * Sets the value of the SpatialPoint field.
   */
  public void setSpatialPoint(gw.api.database.spatial.SpatialPoint value);
  
  
  /**
   * Sets the value of the UnitOfDistance field.
   */
  public void setUnitOfDistance(typekey.UnitOfDistance value);
  
  
  
}