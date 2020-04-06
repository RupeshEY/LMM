package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ContactInfoView.eti;ContactInfoView.eix;ContactInfoView.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactInfoViewInternal extends com.guidewire._generated.entity.KeyableBeanInternal, gw.cc.claim.archiving.entity.ContactInfoView {
  /**
   * Gets the value of the ClaimInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimInfo getClaimInfo();
  
  
  public gw.pl.persistence.core.Key getClaimInfoID();
  
  
  /**
   * Gets the value of the ContactInfo field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactInfo getContactInfo();
  
  
  public gw.pl.persistence.core.Key getContactInfoID();
  
  
  /**
   * Gets the value of the FirstName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstName();
  
  
  /**
   * Gets the value of the FirstNameKanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFirstNameKanji();
  
  
  /**
   * Gets the value of the LastName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastName();
  
  
  /**
   * Gets the value of the LastNameKanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLastNameKanji();
  
  
  /**
   * Gets the value of the MiddleName field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getMiddleName();
  
  
  /**
   * Gets the value of the Name field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameKanji field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameKanji();
  
  
  /**
   * Gets the value of the Particle field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getParticle();
  
  
  /**
   * Gets the value of the Prefix field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NamePrefix getPrefix();
  
  
  /**
   * Gets the value of the Role field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ContactRole getRole();
  
  
  /**
   * Gets the value of the Suffix field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.NameSuffix getSuffix();
  
  
  /**
   * Sets the value of the ClaimInfo field.
   */
  public void setClaimInfo(entity.ClaimInfo value);
  
  
  public void setClaimInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContactInfo field.
   */
  public void setContactInfo(entity.ContactInfo value);
  
  
  public void setContactInfoID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the FirstName field.
   */
  public void setFirstName(java.lang.String value);
  
  
  /**
   * Sets the value of the FirstNameKanji field.
   */
  public void setFirstNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the LastName field.
   */
  public void setLastName(java.lang.String value);
  
  
  /**
   * Sets the value of the LastNameKanji field.
   */
  public void setLastNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the MiddleName field.
   */
  public void setMiddleName(java.lang.String value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameKanji field.
   */
  public void setNameKanji(java.lang.String value);
  
  
  /**
   * Sets the value of the Particle field.
   */
  public void setParticle(java.lang.String value);
  
  
  /**
   * Sets the value of the Prefix field.
   */
  public void setPrefix(typekey.NamePrefix value);
  
  
  /**
   * Sets the value of the Role field.
   */
  public void setRole(typekey.ContactRole value);
  
  
  /**
   * Sets the value of the Suffix field.
   */
  public void setSuffix(typekey.NameSuffix value);
  
  
  
}