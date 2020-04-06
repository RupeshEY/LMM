package com.guidewire._generated.entity;

@javax.annotation.Generated(value = "com.guidewire.pl.metadata.codegen.Codegen", comments = "Contact.eti;Contact.eix;Contact.etx")
@java.lang.SuppressWarnings(value = {"deprecation", "unchecked"})
public interface ContactInternal extends com.guidewire._generated.entity.RetireableInternal, com.guidewire._generated.entity.ValidatableInternal, com.guidewire._generated.entity.AddressBookConvertableInternal, com.guidewire._generated.entity.GlobalContactNameInternal, com.guidewire._generated.entity.CommonContactInternal, com.guidewire._generated.entity.ExtractableInternal, com.guidewire._generated.entity.OverlapTableInternal, com.guidewire._generated.entity.EventAwareInternal, com.guidewire.pl.domain.contact.CommonContactAdapter, com.guidewire.pl.domain.contact.ContactGraphGenerator, com.guidewire.pl.domain.contact.ContactPublicMethods, com.guidewire.pl.domain.contact.OfficialIDBaseContainer, com.guidewire.pl.domain.contact.impl.AddressBookConvertableImplCallback, com.guidewire.pl.domain.contact.impl.AddressBookConvertableInternalMethods, com.guidewire.pl.domain.contact.impl.CommonContactImplCallback, com.guidewire.pl.domain.contact.impl.CommonContactInternalMethods, com.guidewire.pl.domain.contact.impl.ContactInternalMethods, com.guidewire.pl.system.bundle.CommitCallback, com.guidewire.pl.system.bundle.InsertCallback, com.guidewire.pl.system.bundle.RemoveCallback, com.guidewire.pl.system.bundle.UpdateCallback, com.guidewire.pl.system.entity.LevelAwareValidatableBean, gw.api.contact.ContactLifecycle, gw.api.contact.ContactMinimalTags {
  java.lang.String CONTACTADDED_EVENT = "ContactAdded";
  
  java.lang.String CONTACTCHANGED_EVENT = "ContactChanged";
  
  java.lang.String CONTACTREMOVED_EVENT = "ContactRemoved";
  
  java.lang.String CONTACTTAGSUPDATED_EVENT = "ContactTagsUpdated";
  
  java.lang.String CONTACTUPDATEDINAB_EVENT = "ContactUpdatedInAB";
  
  /**
   * Adds the given element to the CategoryScores array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToCategoryScores(entity.ContactCategoryScore element);
  
  
  /**
   * Adds the given element to the ContactAddresses array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToContactAddresses(entity.ContactAddress element);
  
  
  /**
   * Adds the given element to the EFTRecords array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToEFTRecords(entity.EFTData element);
  
  
  /**
   * Adds the given element to the FingerprintArray array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToFingerprintArray(entity.ContactFingerprint element);
  
  
  /**
   * Adds the given element to the OfficialIDs array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToOfficialIDs(entity.OfficialID element);
  
  
  /**
   * Adds the given element to the Reviews array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToReviews(entity.Review element);
  
  
  /**
   * Adds the given element to the SourceRelatedContacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToSourceRelatedContacts(entity.ContactContact element);
  
  
  /**
   * Adds the given element to the Tags array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTags(entity.ContactTag element);
  
  
  /**
   * Adds the given element to the TargetRelatedContacts array. This is achieved by setting the parent foreign key to this entity instance.
   */
  public void addToTargetRelatedContacts(entity.ContactContact element);
  
  
  /**
   * Gets the value of the AutoSync field.
   * A status code to indicate whether this entity allows auto-sync or not. Null means disallow.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.AutoSync getAutoSync();
  
  
  /**
   * Gets the value of the CategoryScores field.
   * List of categories and their average scores, associated with this Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactCategoryScore[] getCategoryScores();
  
  
  /**
   * Gets the value of the ContactAddresses field.
   * Secondary addresses associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactAddress[] getContactAddresses();
  
  
  /**
   * Gets the value of the EFTRecords field.
   * Electronic Funds Transfer data for the contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.EFTData[] getEFTRecords();
  
  
  /**
   * Gets the value of the EmailAddress1 field.
   * Primary email address associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress1();
  
  
  /**
   * Gets the value of the EmailAddress2 field.
   * Secondary email address associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getEmailAddress2();
  
  
  /**
   * Gets the value of the FaxPhone field.
   * Fax number associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFaxPhone();
  
  
  /**
   * Gets the value of the FaxPhoneCountry field.
   * Fax phone country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getFaxPhoneCountry();
  
  
  /**
   * Gets the value of the FaxPhoneExtension field.
   * Fax phone extension.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getFaxPhoneExtension();
  
  
  /**
   * Gets the value of the Fingerprint field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactFingerprint getFingerprint();
  
  
  /**
   * Gets the value of the FingerprintArray field.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactFingerprint[] getFingerprintArray();
  
  
  public gw.pl.persistence.core.Key getFingerprintID();
  
  
  /**
   * Gets the value of the HomePhone field.
   * Home phone number associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHomePhone();
  
  
  /**
   * Gets the value of the HomePhoneCountry field.
   * Home phone country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getHomePhoneCountry();
  
  
  /**
   * Gets the value of the HomePhoneExtension field.
   * Home phone extension.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getHomePhoneExtension();
  
  
  /**
   * Gets the value of the LMContactID_Ext field.
   * The ID of the ECF Contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getLMContactID_Ext();
  
  
  /**
   * Gets the value of the LoadCommandID field.
   * LoadCommand for load where row was created. If not null this object was loaded via the loader.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Long getLoadCommandID();
  
  
  /**
   * Gets the value of the Name field.
   * This contact's name.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getName();
  
  
  /**
   * Gets the value of the NameDenorm field.
   * denorm field for Name
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNameDenorm();
  
  
  /**
   * Gets the value of the Notes field.
   * Notes on this contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getNotes();
  
  
  /**
   * Gets the value of the OfficialIDs field.
   * TaxIDs associated with this contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.OfficialID[] getOfficialIDs();
  
  
  /**
   * Gets the value of the OrganizationType field.
   * Type of organization
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.OrganizationType getOrganizationType();
  
  
  /**
   * Gets the value of the OriginalInsurerReference_Ext field.
   * The original insurer reference
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getOriginalInsurerReference_Ext();
  
  
  /**
   * Gets the value of the PolicySystemId field.
   * Identifier for the contact in an external policy system
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getPolicySystemId();
  
  
  /**
   * Gets the value of the PreferredCurrency field.
   * The contact's preferred currency.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Currency getPreferredCurrency();
  
  
  /**
   * Gets the value of the PrimaryAddress field.
   * Primary address associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Address getPrimaryAddress();
  
  
  public gw.pl.persistence.core.Key getPrimaryAddressID();
  
  
  /**
   * Gets the value of the PrimaryLanguage field.
   * The account's preferred language
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LanguageType getPrimaryLanguage();
  
  
  /**
   * Gets the value of the PrimaryLocale field.
   * The account's preferred locale
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.LocaleType getPrimaryLocale();
  
  
  /**
   * Gets the value of the PrimaryPhone field.
   * Primary phone number type for the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PrimaryPhoneType getPrimaryPhone();
  
  
  /**
   * Gets the value of the Reviews field.
   * Reviews for Service Provider Management
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.Review[] getReviews();
  
  
  /**
   * Gets the value of the Score field.
   * Overall review Score for this Contact
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Integer getScore();
  
  
  /**
   * Gets the value of the SourceRelatedContacts field.
   * Contacts that point to this contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactContact[] getSourceRelatedContacts();
  
  
  /**
   * Gets the value of the SpecialtyType field.
   * Specialty of the doctor
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.SpecialtyType getSpecialtyType();
  
  
  /**
   * Gets the value of the Subtype field.
   * Identifies a particular subtype within a supertype table; each subtype of a supertype has its own unique subtype value
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.Contact getSubtype();
  
  
  /**
   * Gets the value of the Tags field.
   * List of ContactTags.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactTag[] getTags();
  
  
  /**
   * Gets the value of the TargetRelatedContacts field.
   * Contacts that this Contact points to.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public entity.ContactContact[] getTargetRelatedContacts();
  
  
  /**
   * Gets the value of the TaxID field.
   * Tax ID for the contact (SSN or EIN).
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getTaxID();
  
  
  /**
   * Gets the value of the TaxStatus field.
   * Status of the contact's tax ID; whether it is known or unknown.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.TaxStatus getTaxStatus();
  
  
  /**
   * Gets the value of the ValidationLevel field.
   * Validation level that this object passed (if any) before it was stored.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.ValidationLevel getValidationLevel();
  
  
  /**
   * Gets the value of the VendorNumber field.
   * Vendor number for the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getVendorNumber();
  
  
  /**
   * Gets the value of the VendorType field.
   * The company's vendor type.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.VendorType getVendorType();
  
  
  /**
   * Gets the value of the W9ReceivedDate field.
   * W-9 form received date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getW9ReceivedDate();
  
  
  /**
   * Gets the value of the W9ValidFrom field.
   * W-9 valid start date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getW9ValidFrom();
  
  
  /**
   * Gets the value of the W9ValidTo field.
   * W-9 valid to date
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.util.Date getW9ValidTo();
  
  
  /**
   * Gets the value of the WithholdingRate field.
   * The contact's backup withholding rate, or null if backup withholding is not required or is not known to be required.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.math.BigDecimal getWithholdingRate();
  
  
  /**
   * Gets the value of the WorkPhone field.
   * Business phone number associated with the contact.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWorkPhone();
  
  
  /**
   * Gets the value of the WorkPhoneCountry field.
   * Work phone country.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public typekey.PhoneCountryCode getWorkPhoneCountry();
  
  
  /**
   * Gets the value of the WorkPhoneExtension field.
   * Business phone extension.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.String getWorkPhoneExtension();
  
  
  /**
   * Gets the value of the LoadRelatedContacts field.
   * This field is deprecated. It was formerly used to determine whether related contacts should be loaded from the Address Book.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isLoadRelatedContacts();
  
  
  /**
   * Gets the value of the PendingLinkMessage field.
   * whether the contact link messasge is still pending from ContactManager
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPendingLinkMessage();
  
  
  /**
   * Gets the value of the Preferred field.
   * Whether the vendor is a preferred vendor.
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isPreferred();
  
  
  /**
   * Gets the value of the W9Received field.
   * Has W-9 form been received
   */
  @gw.internal.gosu.parser.ExtendedProperty
  public java.lang.Boolean isW9Received();
  
  
  /**
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   */
  public void removeFromCategoryScores(entity.ContactCategoryScore element);
  
  
  /**
   * Removes the given element from the CategoryScores array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromCategoryScores(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the ContactAddresses array. This is achieved by marking the element for removal.
   */
  public void removeFromContactAddresses(entity.ContactAddress element);
  
  
  /**
   * Removes the given element from the ContactAddresses array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromContactAddresses(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the EFTRecords array. This is achieved by marking the element for removal.
   */
  public void removeFromEFTRecords(entity.EFTData element);
  
  
  /**
   * Removes the given element from the EFTRecords array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromEFTRecords(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the FingerprintArray array. This is achieved by marking the element for removal.
   */
  public void removeFromFingerprintArray(entity.ContactFingerprint element);
  
  
  /**
   * Removes the given element from the FingerprintArray array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromFingerprintArray(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the OfficialIDs array. This is achieved by marking the element for removal.
   */
  public void removeFromOfficialIDs(entity.OfficialID element);
  
  
  /**
   * Removes the given element from the OfficialIDs array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromOfficialIDs(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Reviews array. This is achieved by marking the element for removal.
   */
  public void removeFromReviews(entity.Review element);
  
  
  /**
   * Removes the given element from the Reviews array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromReviews(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the SourceRelatedContacts array. This is achieved by marking the element for removal.
   */
  public void removeFromSourceRelatedContacts(entity.ContactContact element);
  
  
  /**
   * Removes the given element from the SourceRelatedContacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromSourceRelatedContacts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the Tags array. This is achieved by marking the element for removal.
   */
  public void removeFromTags(entity.ContactTag element);
  
  
  /**
   * Removes the given element from the Tags array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTags(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Removes the given element from the TargetRelatedContacts array. This is achieved by marking the element for removal.
   */
  public void removeFromTargetRelatedContacts(entity.ContactContact element);
  
  
  /**
   * Removes the given element from the TargetRelatedContacts array. This is achieved by marking the element for removal.
   * @deprecated Please use the version that takes an entity instead.
   */
  @java.lang.Deprecated
  public void removeFromTargetRelatedContacts(gw.pl.persistence.core.Key elementID);
  
  
  /**
   * Sets the value of the AutoSync field.
   */
  public void setAutoSync(typekey.AutoSync value);
  
  
  /**
   * Sets the value of the CategoryScores field.
   */
  public void setCategoryScores(entity.ContactCategoryScore[] value);
  
  
  /**
   * Sets the value of the ContactAddresses field.
   */
  public void setContactAddresses(entity.ContactAddress[] value);
  
  
  /**
   * Sets the value of the EFTRecords field.
   */
  public void setEFTRecords(entity.EFTData[] value);
  
  
  /**
   * Sets the value of the EmailAddress1 field.
   */
  public void setEmailAddress1(java.lang.String value);
  
  
  /**
   * Sets the value of the EmailAddress2 field.
   */
  public void setEmailAddress2(java.lang.String value);
  
  
  /**
   * Sets the value of the FaxPhone field.
   */
  public void setFaxPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the FaxPhoneCountry field.
   */
  public void setFaxPhoneCountry(typekey.PhoneCountryCode value);
  
  
  /**
   * Sets the value of the FaxPhoneExtension field.
   */
  public void setFaxPhoneExtension(java.lang.String value);
  
  
  /**
   * Sets the value of the Fingerprint field.
   */
  public void setFingerprint(entity.ContactFingerprint value);
  
  
  /**
   * Sets the value of the FingerprintArray field.
   */
  public void setFingerprintArray(entity.ContactFingerprint[] value);
  
  
  public void setFingerprintID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the HomePhone field.
   */
  public void setHomePhone(java.lang.String value);
  
  
  /**
   * Sets the value of the HomePhoneCountry field.
   */
  public void setHomePhoneCountry(typekey.PhoneCountryCode value);
  
  
  /**
   * Sets the value of the HomePhoneExtension field.
   */
  public void setHomePhoneExtension(java.lang.String value);
  
  
  /**
   * Sets the value of the LMContactID_Ext field.
   */
  public void setLMContactID_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the LoadCommandID field.
   */
  public void setLoadCommandID(java.lang.Long value);
  
  
  /**
   * Sets the value of the LoadRelatedContacts field.
   */
  public void setLoadRelatedContacts(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the Name field.
   */
  public void setName(java.lang.String value);
  
  
  /**
   * Sets the value of the NameDenorm field.
   */
  public void setNameDenorm(java.lang.String value);
  
  
  /**
   * Sets the value of the Notes field.
   */
  public void setNotes(java.lang.String value);
  
  
  /**
   * Sets the value of the OfficialIDs field.
   */
  public void setOfficialIDs(entity.OfficialID[] value);
  
  
  /**
   * Sets the value of the OrganizationType field.
   */
  public void setOrganizationType(typekey.OrganizationType value);
  
  
  /**
   * Sets the value of the OriginalInsurerReference_Ext field.
   */
  public void setOriginalInsurerReference_Ext(java.lang.String value);
  
  
  /**
   * Sets the value of the PendingLinkMessage field.
   */
  public void setPendingLinkMessage(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PolicySystemId field.
   */
  public void setPolicySystemId(java.lang.String value);
  
  
  /**
   * Sets the value of the Preferred field.
   */
  public void setPreferred(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the PreferredCurrency field.
   */
  public void setPreferredCurrency(typekey.Currency value);
  
  
  /**
   * Sets the value of the PrimaryAddress field.
   */
  public void setPrimaryAddress(entity.Address value);
  
  
  public void setPrimaryAddressID(gw.pl.persistence.core.Key value);
  
  
  /**
   * Sets the value of the PrimaryLanguage field.
   */
  public void setPrimaryLanguage(typekey.LanguageType value);
  
  
  /**
   * Sets the value of the PrimaryLocale field.
   */
  public void setPrimaryLocale(typekey.LocaleType value);
  
  
  /**
   * Sets the value of the PrimaryPhone field.
   */
  public void setPrimaryPhone(typekey.PrimaryPhoneType value);
  
  
  /**
   * Sets the value of the Reviews field.
   */
  public void setReviews(entity.Review[] value);
  
  
  /**
   * Sets the value of the Score field.
   */
  public void setScore(java.lang.Integer value);
  
  
  /**
   * Sets the value of the SourceRelatedContacts field.
   */
  public void setSourceRelatedContacts(entity.ContactContact[] value);
  
  
  /**
   * Sets the value of the SpecialtyType field.
   */
  public void setSpecialtyType(typekey.SpecialtyType value);
  
  
  /**
   * Sets the value of the Subtype field.
   */
  public void setSubtype(typekey.Contact value);
  
  
  /**
   * Sets the value of the Tags field.
   */
  public void setTags(entity.ContactTag[] value);
  
  
  /**
   * Sets the value of the TargetRelatedContacts field.
   */
  public void setTargetRelatedContacts(entity.ContactContact[] value);
  
  
  /**
   * Sets the value of the TaxID field.
   */
  public void setTaxID(java.lang.String value);
  
  
  /**
   * Sets the value of the TaxStatus field.
   */
  public void setTaxStatus(typekey.TaxStatus value);
  
  
  /**
   * Sets the value of the ValidationLevel field.
   */
  public void setValidationLevel(typekey.ValidationLevel value);
  
  
  /**
   * Sets the value of the VendorNumber field.
   */
  public void setVendorNumber(java.lang.String value);
  
  
  /**
   * Sets the value of the VendorType field.
   */
  public void setVendorType(typekey.VendorType value);
  
  
  /**
   * Sets the value of the W9Received field.
   */
  public void setW9Received(java.lang.Boolean value);
  
  
  /**
   * Sets the value of the W9ReceivedDate field.
   */
  public void setW9ReceivedDate(java.util.Date value);
  
  
  /**
   * Sets the value of the W9ValidFrom field.
   */
  public void setW9ValidFrom(java.util.Date value);
  
  
  /**
   * Sets the value of the W9ValidTo field.
   */
  public void setW9ValidTo(java.util.Date value);
  
  
  /**
   * Sets the value of the WithholdingRate field.
   */
  public void setWithholdingRate(java.math.BigDecimal value);
  
  
  /**
   * Sets the value of the WorkPhone field.
   */
  public void setWorkPhone(java.lang.String value);
  
  
  /**
   * Sets the value of the WorkPhoneCountry field.
   */
  public void setWorkPhoneCountry(typekey.PhoneCountryCode value);
  
  
  /**
   * Sets the value of the WorkPhoneExtension field.
   */
  public void setWorkPhoneExtension(java.lang.String value);
  
  
  
}