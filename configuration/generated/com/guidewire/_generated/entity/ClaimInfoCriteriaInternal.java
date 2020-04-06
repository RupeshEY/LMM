package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimInfoCriteria.eti;ClaimInfoCriteria.eix;ClaimInfoCriteria.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimInfoCriteriaInternal extends com.guidewire._generated.entity.VersionableInternal, gw.cc.claim.archiving.entity.ClaimInfoCriteria, java.io.Serializable {
  /**
   * Gets the value of the AddressCriteria field.
   * Set of criteria to match by address.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getAddressCriteria();
  
  
  public gw.pl.persistence.core.Key getAddressCriteriaID();
  
  
  /**
   * Gets the value of the ClaimNumber field.
   * Match by claim number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getClaimNumber();
  
  
  /**
   * Gets the value of the ClaimSearchType field.
   * The type of claim search to perform.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSearchType getClaimSearchType();
  
  
  /**
   * Gets the value of the FreeTextClaimSearchType field.
   * The type of claim search to perform.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FreeTextClaimSearchType getFreeTextClaimSearchType();
  
  
  /**
   * Gets the value of the FreeTextNameSearchType field.
   * Type of name search for claim search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.FreTxtClmSrchNameSrchTyp getFreeTextNameSearchType();
  
  
  /**
   * Gets the value of the NameCriteria field.
   * Set of criteria to match by name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.CCNameCriteria getNameCriteria();
  
  
  public gw.pl.persistence.core.Key getNameCriteriaID();
  
  
  /**
   * Gets the value of the NameSearchType field.
   * Type of name search for claim search.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimSearchNameSearchType getNameSearchType();
  
  
  /**
   * Gets the value of the PolicyNumber field.
   * Match by policy number.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicyNumber();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ClaimInfoCriteria getSubtype();
  
  
  /**
   * Gets the value of the UCR_Ext field.
   * A Unique Claim Reference (UCR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUCR_Ext();
  
  
  /**
   * Gets the value of the UMR_Ext field.
   * A Unique Market Reference (UMR) Number
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getUMR_Ext();
  
  
  /**
   * Sets the value of the AddressCriteria field.
   */
  public void setAddressCriteria(entity.Address value);
  
  
  public void setAddressCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimNumber field.
   */
  public void setClaimNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the ClaimSearchType field.
   */
  public void setClaimSearchType(typekey.ClaimSearchType value);
  
  
  /**
   * Sets the value of the FreeTextClaimSearchType field.
   */
  public void setFreeTextClaimSearchType(typekey.FreeTextClaimSearchType value);
  
  
  /**
   * Sets the value of the FreeTextNameSearchType field.
   */
  public void setFreeTextNameSearchType(typekey.FreTxtClmSrchNameSrchTyp value);
  
  
  /**
   * Sets the value of the NameCriteria field.
   */
  public void setNameCriteria(entity.CCNameCriteria value);
  
  
  public void setNameCriteriaID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the NameSearchType field.
   */
  public void setNameSearchType(typekey.ClaimSearchNameSearchType value);
  
  
  /**
   * Sets the value of the PolicyNumber field.
   */
  public void setPolicyNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.ClaimInfoCriteria value);
  
  
  /**
   * Sets the value of the UCR_Ext field.
   */
  public void setUCR_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the UMR_Ext field.
   */
  public void setUMR_Ext(java.lang.String value);
  
  
  
}