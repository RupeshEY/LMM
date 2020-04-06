package gw.contactmapper.ab900

uses gw.webservice.contactapi.mapping.MappingConstants

uses java.util.HashSet
uses java.util.Set

/**
 * Use this file to map between ClaimCenter entities in the Contact graph and 
 * XmlBackedInstance objects that represent ContactManager entities.
 */
@Export
internal class ContactMapper extends gw.contactmapper.ab900.ContactMapperCCBase {

  /**
   * Returns the set of mapped properties used to integrate with ContactManager.  
   * These properties are used to translate between entities in the Contact graph 
   * ("beans") and the XML sent to and from ContactManager.
   * 
   * By default, mappings are in both directions, "to XML" and "to bean".  For 
   * mappings that should only be used for one direction, use 
   *   .withMappingDirection(TO_XML) or
   *   .withMappingDirection(TO_BEAN)
   *     
   * By default, the property name is used in the XML.  If the property name in 
   * ContactManager is different from the local app, use
   *   .withABName(abName)
   * 
   * When mapping AddressBookUID, use the LINK_ID ABName:
   *   fieldMapping(Accident_Ext#AddressBookUID)
   *     .withABName(LINK_ID),
   * 
   * When mapping PublicID, use the TO_XML direction and the EXTERNAL_PUBLIC_ID 
   * ABName:
   *   fieldMapping(Accident_Ext#PublicID)
   *     .withMappingDirection(TO_XML)
   *     .withABName(EXTERNAL_PUBLIC_ID),
   * 
   * For simple fields, use
   *   fieldMapping(Entity#Property)
   * 
   * For foreign keys to child objects use, use
   *   fkMapping(Entity#Property)
   * and fieldMapping() for the properties on the child entity.  Example: Suppose the 
   * Contact data model was extended with DrivingHabits_Ext foreign key.  This would 
   * be added to the code:
   *   fkMapping(Contact#DrivingHabits_Ext)
   *   fieldMapping(DrivingHabits_Ext#AddressBookUID)
   *     .withABName(LINK_ID),
   *   fieldMapping(DrivingHabits_Ext#PublicID)
   *     .withMappingDirection(TO_XML)
   *     .withABName(EXTERNAL_PUBLIC_ID),
   *   fieldMapping(DrivingHabits_Ext#MilesPerWeek)
   *   fieldMapping(DrivingHabits_Ext#CommuteDistance)
   *   fieldMapping(DrivingHabits_Ext#Carpools)
   * 
   * For arrays of child objects use, use
   *   arrayMapping(Entity#Property)
   * and fieldMapping() for the properties on the child entity.  Example: Suppose the 
   * Contact data model was extended with AccidentHistory_Ext array of Accident_Ext 
   * objects.  This would be added to the code:
   *   arrayMapping(Contact#AccidentHistory_Ext)
   *   fieldMapping(Accident_Ext#AddressBookUID)
   *     .withABName(LINK_ID),
   *   fieldMapping(Accident_Ext#PublicID)
   *     .withMappingDirection(TO_XML)
   *     .withABName(EXTERNAL_PUBLIC_ID),
   *   fieldMapping(Accident_Ext#AccidentDate)
   *   fieldMapping(Accident_Ext#DamageCost)
   *   fieldMapping(Accident_Ext#DriverAtFault)
   *
   * withPersist() is used to indicate whether the property should be persisted.  If true, the
   * property will be returned in ContactIntegrationMapper.PersistProperties.  Defaults to true.
   *   fieldMapping(Contact#EmailAddress1)
   *     .withPersist(false)
   *
   * withAffectsSync() is used to indicate whether the property affects the sync status.  If true, the
   * property will be returned in ContactIntegrationMapper.AffectsSyncProperties.  Defaults to true.
   *   fieldMapping(Contact#EmailAddress1)
   *     .withAffectsSync(false)
   *
   */
  override property get Mappings() : Set<gw.contactmapper.ab900.CCPropertyMapping> {
    return new HashSet<gw.contactmapper.ab900.CCPropertyMapping>() {
      //All Contacts
      fieldMapping(Contact#AddressBookUID)
        .withABName(MappingConstants.LINK_ID),
      fieldMapping(Contact#PublicID)
        .withMappingDirection(TO_XML)
        .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),
      fieldMapping(Contact#Name),
      fieldMapping(Contact#NameKanji),
      fieldMapping(Contact#EmailAddress1),
      fieldMapping(Contact#EmailAddress2),
      fieldMapping(Contact#FaxPhone),
      fieldMapping(Contact#FaxPhoneCountry),
      fieldMapping(Contact#FaxPhoneExtension),
      fieldMapping(Contact#HomePhone),
      fieldMapping(Contact#HomePhoneCountry),
      fieldMapping(Contact#HomePhoneExtension),
      fieldMapping(Contact#PrimaryPhone),
      fieldMapping(Contact#Notes),
      fieldMapping(Contact#Preferred),
      fieldMapping(Contact#PreferredCurrency),
      fieldMapping(Contact#Score),
      fieldMapping(Contact#TaxID),
      fieldMapping(Contact#TaxStatus),
      fieldMapping(Contact#VendorNumber),
      fieldMapping(Contact#VendorType),
      fieldMapping(Contact#W9Received),
      fieldMapping(Contact#W9ReceivedDate),
      fieldMapping(Contact#W9ValidFrom),
      fieldMapping(Contact#W9ValidTo),
      fieldMapping(Contact#WithholdingRate),
      fieldMapping(Contact#WorkPhone),
      fieldMapping(Contact#WorkPhoneCountry),
      fieldMapping(Contact#WorkPhoneExtension),

        //Person
      fieldMapping(Person#FirstName),
      fieldMapping(Person#MiddleName),
      fieldMapping(Person#LastName),
      fieldMapping(Person#CellPhone),
      fieldMapping(Person#CellPhoneCountry),
      fieldMapping(Person#CellPhoneExtension),
      fieldMapping(Person#DateOfBirth),
      fieldMapping(Person#FormerName),
      fieldMapping(Person#Gender),
      fieldMapping(Person#LicenseNumber),
      fieldMapping(Person#LicenseState),
      fieldMapping(Person#MaritalStatus),
      fieldMapping(Person#NumDependents),
      fieldMapping(Person#NumDependentsU18),
      fieldMapping(Person#NumDependentsU25),
      fieldMapping(Person#Occupation),
      fieldMapping(Person#Prefix),
      fieldMapping(Person#Suffix),
      fieldMapping(Person#Particle),
      fieldMapping(Person#FirstNameKanji),
      fieldMapping(Person#LastNameKanji),
      fieldMapping(Person#TaxFilingStatus),

      //Other Contact subtypes
      fieldMapping(UserContact#EmployeeNumber),
      fieldMapping(Adjudicator#AdjudicativeDomain),
      fieldMapping(Adjudicator#AdjudicatorLicense),
      fieldMapping(Attorney#AttorneySpecialty),
      fieldMapping(Attorney#AttorneyLicense),
      fieldMapping(Doctor#DoctorSpecialty),
      fieldMapping(Doctor#MedicalLicense),
      fieldMapping(LawFirm#LawFirmSpecialty),
      fieldMapping(LegalVenue#VenueType),
      fieldMapping(MedicalCareOrg#MedicalOrgSpecialty),
      fieldMapping(AutoRepairShop#AutoRepairLicense),
      fieldMapping(AutoTowingAgcy#AutoTowingLicense),

      //Address
      fieldMapping(Address#AddressBookUID)
        .withABName(MappingConstants.LINK_ID),
      fieldMapping(Address#ExternalLinkID)
        .withMappingDirection(TO_XML)
        .withABName(MappingConstants.EXTERNAL_UNIQUE_ID),
      fieldMapping(Address#PublicID)
        .withMappingDirection(TO_XML)
        .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),
      fieldMapping(Address#AddressLine1),
      fieldMapping(Address#AddressLine2),
      fieldMapping(Address#AddressLine3),
      fieldMapping(Address#AddressType),
      fieldMapping(Address#City),
      fieldMapping(Address#County),
      fieldMapping(Address#Country),
      fieldMapping(Address#Description),
      fieldMapping(Address#GeocodeStatus)
        .withAffectsSync(false)
        .withPersist(true),
      fieldMapping(Address#PostalCode),
      fieldMapping(Address#State),
      fieldMapping(Address#ValidUntil),
      fieldMapping(Address#AddressLine1Kanji),
      fieldMapping(Address#AddressLine2Kanji),
      fieldMapping(Address#CityKanji),
      fieldMapping(Address#CEDEX),
      fieldMapping(Address#CEDEXBureau),

      //ContactAddress
      fieldMapping(ContactAddress#AddressBookUID)
          .withABName(MappingConstants.LINK_ID),
      fieldMapping(ContactAddress#ExternalLinkID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_UNIQUE_ID),
      fieldMapping(ContactAddress#PublicID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),

      //EFTData
      fieldMapping(EFTData#AddressBookUID)
          .withABName(MappingConstants.LINK_ID),
      fieldMapping(EFTData#ExternalLinkID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_UNIQUE_ID),
      fieldMapping(EFTData#PublicID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),

      fieldMapping(EFTData#AccountName),
      fieldMapping(EFTData#BankAccountNumber),
      fieldMapping(EFTData#BankAccountType),
      fieldMapping(EFTData#BankName),
      fieldMapping(EFTData#BankRoutingNumber),
      fieldMapping(EFTData#IsPrimary),

      //ContactCategoryScore
      fieldMapping(ContactCategoryScore#AddressBookUID)
          .withABName(MappingConstants.LINK_ID),
      fieldMapping(ContactCategoryScore#PublicID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),

      fieldMapping(ContactCategoryScore#ReviewCategory),
      fieldMapping(ContactCategoryScore#Score),

      //ContactTag
      fieldMapping(ContactTag#AddressBookUID)
          .withABName(MappingConstants.LINK_ID),
      fieldMapping(ContactTag#ExternalLinkID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_UNIQUE_ID),
      fieldMapping(ContactTag#PublicID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),

      fieldMapping(ContactTag#Type),

      //ContactContact (RelatedContacts)
      fieldMapping(ContactContact#AddressBookUID)
          .withABName(MappingConstants.LINK_ID),
      fieldMapping(ContactContact#ExternalLinkID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_UNIQUE_ID),
      fieldMapping(ContactContact#PublicID)
          .withMappingDirection(TO_XML)
          .withABName(MappingConstants.EXTERNAL_PUBLIC_ID),

      fieldMapping(ContactContact#Relationship)
          .withABName("Rel"),

      // Primary Address is mapped to XML here, but handled as part of all the addresses in mapping to Bean
      fkMapping(Contact#PrimaryAddress)
        .withMappingDirection(TO_XML),

      // Contact Addresses are mapped to XML here, but require special handling to Bean
      arrayMapping(Contact#ContactAddresses)
        .withMappingDirection(TO_XML),

      // Contact Addresses have a special handler to map all addresses to Bean to handle addresses being swapped between primary and secondary
      arrayMapping(Contact#ContactAddresses)
        .withMappingDirection(TO_BEAN)
        .withArrayBeanBlock( \ am, bp -> populateAddresses(bp.Bean, bp.XmlBackedInstance)),

      arrayMapping(Contact#EFTRecords),

      arrayMapping(Contact#Tags)
          .withAffectsSync(false),

      // Related contacts are only mapped to XML, the retrieval of related contacts is handled via POGOs not XmlBackedInstance
      arrayMapping(Contact#SourceRelatedContacts)
        .withMappingDirection(TO_XML)
        .withArrayXMLBlock( \ am, xp -> populateRelatedContactArrayXML(am, xp))
        .withEntityXMLBlock( \ lm, xp -> populateRelatedContactXML(lm, xp)),

      arrayMapping(Contact#TargetRelatedContacts)
        .withMappingDirection(TO_XML)
        .withArrayXMLBlock( \ am, xp -> populateRelatedContactArrayXML(am, xp))
        .withEntityXMLBlock( \ lm, xp -> populateRelatedContactXML(lm, xp)),

      arrayMapping(Contact#CategoryScores)
        .withMappingDirection(TO_BEAN)
        .withAffectsSync(false)
        .withPersist(true),

      fkMapping(ContactAddress#Address),

      fkMapping(ContactContact#RelatedContact)
          .withMappingDirection(BOTH)
          .withABName("RelABContact")
          .withEntityXMLBlock( \ lm, xp -> populateContactXmlForRelatedContact(lm, xp))
          .withEntityBeanBlock( \ lm, bp -> populateBeanFromXml(bp)),

      fkMapping(ContactContact#SourceContact)
          .withMappingDirection(BOTH)
          .withABName("SrcABContact")
          .withEntityXMLBlock( \ lm, xp -> populateContactXmlForRelatedContact(lm, xp))
          .withEntityBeanBlock( \ lm, bp -> populateBeanFromXml(bp))

    }
  }

}
