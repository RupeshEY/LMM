package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "ClaimContact.eti;ClaimContact.eix;ClaimContact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ClaimContactInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.cc.domain.claim.impl.ClaimContactInternal, com.guidewire.pl.domain.persistence.core.KeyableBeanPublicMethods, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, gw.api.contact.ContactHandle, gw.cc.claim.entity.ClaimContact {
  java.lang.String CLAIMCONTACTADDED_EVENT = "ClaimContactAdded";
  
  java.lang.String CLAIMCONTACTCHANGED_EVENT = "ClaimContactChanged";
  
  java.lang.String CLAIMCONTACTCONTACTCHANGED_EVENT = "ClaimContactContactChanged";
  
  java.lang.String CLAIMCONTACTREMOVED_EVENT = "ClaimContactRemoved";
  
  /**
   * Adds the given element to the Roles array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToRoles(entity.ClaimContactRole element);
  
  
  /**
   * Gets the value of the BenefitEndDate field.
   * Benefit end date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getBenefitEndDate();
  
  
  /**
   * Gets the value of the BenefitEndReason field.
   * Reason benefits ended (deprecated in favor of BenefitEndReasonType)
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getBenefitEndReason();
  
  
  /**
   * Gets the value of the BenefitEndReasonType field.
   * Reason benefits ended - typelist
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.BenefitEndReasonType getBenefitEndReasonType();
  
  
  /**
   * Gets the value of the Claim field.
   * Claim with which the contact is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Claim getClaim();
  
  
  public gw.pl.persistence.core.Key getClaimID();
  
  
  /**
   * Gets the value of the Contact field.
   * Contact associated with the claim or exposure.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Contact getContact();
  
  
  public gw.pl.persistence.core.Key getContactID();
  
  
  /**
   * Gets the value of the ContactNameDenorm field.
   * denormalization of contact name, to speed up search for claim by contact name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getContactNameDenorm();
  
  
  /**
   * Gets the value of the ContactValidFrom field.
   * Start Date when this Contact is valid on this claim 
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getContactValidFrom();
  
  
  /**
   * Gets the value of the ContactValidTo field.
   * Date when this Contact is no longer valid on this claim
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getContactValidTo();
  
  
  /**
   * Gets the value of the DependentType field.
   * Type of dependent - spouse, child etc.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.DependentType getDependentType();
  
  
  /**
   * Gets the value of the EssentialServiceType field.
   * Type essential service provided by contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.EssentialServiceType getEssentialServiceType();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the PersonFirstNameDenorm field.
   * denormalization of person first name, to speed up search for claim by person name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPersonFirstNameDenorm();
  
  
  /**
   * Gets the value of the PersonLastNameDenorm field.
   * denormalization of person last name, to speed up search for claim by person name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPersonLastNameDenorm();
  
  
  /**
   * Gets the value of the Policy field.
   * Policy with which the contact is associated.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Policy getPolicy();
  
  
  public gw.pl.persistence.core.Key getPolicyID();
  
  
  /**
   * Gets the value of the ProviderType field.
   * Provider type
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ProviderType getProviderType();
  
  
  /**
   * Gets the value of the Roles field.
   * The roles that this claimcontact has.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ClaimContactRole[] getRoles();
  
  
  /**
   * Gets the value of the Service field.
   * The service provided by contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getService();
  
  
  /**
   * Gets the value of the ClaimantFlag field.
   * Denorm field indicating whether or not this ClaimContact has the role of claimant.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isClaimantFlag();
  
  
  /**
   * Gets the value of the ContactProhibited field.
   * Indicates whether contact is prohibited with this contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isContactProhibited();
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   */
  public void removeFromRoles(entity.ClaimContactRole element);
  
  
  /**
   * Removes the given element from the Roles array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromRoles(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the BenefitEndDate field.
   */
  public void setBenefitEndDate(java.util.Date value);
  
  
  /**
   * Sets the value of the BenefitEndReason field.
   */
  public void setBenefitEndReason(java.lang.String value);
  
  
  /**
   * Sets the value of the BenefitEndReasonType field.
   */
  public void setBenefitEndReasonType(typekey.BenefitEndReasonType value);
  
  
  /**
   * Sets the value of the Claim field.
   */
  public void setClaim(entity.Claim value);
  
  
  public void setClaimID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ClaimantFlag field.
   */
  public void setClaimantFlag(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Contact field.
   */
  public void setContact(entity.Contact value);
  
  
  public void setContactID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ContactNameDenorm field.
   */
  public void setContactNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the ContactProhibited field.
   */
  public void setContactProhibited(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the ContactValidFrom field.
   */
  public void setContactValidFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the ContactValidTo field.
   */
  public void setContactValidTo(java.util.Date value);
  
  
  /**
   * Sets the value of the DependentType field.
   */
  public void setDependentType(typekey.DependentType value);
  
  
  /**
   * Sets the value of the EssentialServiceType field.
   */
  public void setEssentialServiceType(typekey.EssentialServiceType value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the PersonFirstNameDenorm field.
   */
  public void setPersonFirstNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the PersonLastNameDenorm field.
   */
  public void setPersonLastNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Policy field.
   */
  public void setPolicy(entity.Policy value);
  
  
  public void setPolicyID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the ProviderType field.
   */
  public void setProviderType(typekey.ProviderType value);
  
  
  /**
   * Sets the value of the Roles field.
   */
  public void setRoles(entity.ClaimContactRole[] value);
  
  
  /**
   * Sets the value of the Service field.
   */
  public void setService(java.lang.String value);
  
  
  
}