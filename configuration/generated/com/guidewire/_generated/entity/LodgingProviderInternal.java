package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "LodgingProvider.eti;LodgingProvider.eix;LodgingProvider.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface LodgingProviderInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, gw.cc.exposure.entity.LodgingProvider {
  /**
   * Gets the value of the Comments field.
   * Comments
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getComments();
  
  
  /**
   * Gets the value of the Contact field.
   * Lodging provider name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the EndDate field.
   * Lodging end date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getEndDate();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the LodgingNights field.
   * Number of nights of lodging (for backward compatability only)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getLodgingNights();
  
  
  /**
   * Gets the value of the LodgingRate field.
   * Lodging cost per night
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public gw.api.financials.CurrencyAmount getLodgingRate();
  
  
  /**
   * Gets the value of the PropertyIncident field.
   * PropertyIncident
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.PropertyIncident getPropertyIncident();
  
  
  public gw.pl.persistence.core.Key getPropertyIncidentID();
  
  
  /**
   * Gets the value of the StartDate field.
   * Lodging start date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getStartDate();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LodgingProvider getSubtype();
  
  
  /**
   * Sets the value of the Comments field.
   */
  public void setComments(java.lang.String value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the EndDate field.
   */
  public void setEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LodgingNights field.
   */
  public void setLodgingNights(java.lang.Integer value);
  
  
  /**
   * Sets the value of the LodgingRate field.
   */
  public void setLodgingRate(gw.api.financials.CurrencyAmount value);
  
  
  /**
   * Sets the value of the PropertyIncident field.
   */
  public void setPropertyIncident(entity.PropertyIncident value);
  
  
  public void setPropertyIncidentID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the StartDate field.
   */
  public void setStartDate(java.util.Date value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.LodgingProvider value);
  
  
  
}