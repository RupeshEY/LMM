package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "OrganizationSearchCriteria.eti;OrganizationSearchCriteria.eix;OrganizationSearchCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface OrganizationSearchCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, com.guidewire.cc.domain.community.impl.OrganizationSearchCriteriaCoreExtMethods, com.guidewire.pl.domain.community.impl.OrganizationSearchCriteriaInternalMethods, java.io.Serializable {
  /**
   * Gets the value of the ContactCity field.
   * The contact city for the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactCity();
  
  
  /**
   * Gets the value of the ContactCityKanji field.
   * The contact city kanji for the organization. Used only for Japanese.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactCityKanji();
  
  
  /**
   * Gets the value of the ContactCountry field.
   * The contact country for the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Country getContactCountry();
  
  
  /**
   * Gets the value of the ContactName field.
   * The contact name for the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactName();
  
  
  /**
   * Gets the value of the ContactPostal field.
   * The contact zip code/postal code for the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactPostal();
  
  
  /**
   * Gets the value of the ContactState field.
   * The contact state for the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.State getContactState();
  
  
  /**
   * Gets the value of the Name field.
   * The name of the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameKanji field.
   * The kanji name of the organization. Used only for Japanese.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the Type field.
   * The type of the organization.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BusinessType getType();
  
  
  /**
   * Gets the value of the Carrier field.
   * Flag indicating whether the organization is a carrier.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isCarrier();
  
  
  /**
   * Sets the value of the Carrier field.
   */
  public void setCarrier(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ContactCity field.
   */
  public void setContactCity(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactCityKanji field.
   */
  public void setContactCityKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactCountry field.
   */
  public void setContactCountry(typekey.Country value);
  
  
  /**
   * Sets the value of the ContactName field.
   */
  public void setContactName(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactPostal field.
   */
  public void setContactPostal(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactState field.
   */
  public void setContactState(typekey.State value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the Type field.
   */
  public void setType(typekey.BusinessType value);
  
  
  
}