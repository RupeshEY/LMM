package gw.entity

/**
 * Properties for accessing specific types of related contacts on a Claim.
 */
@Export
enhancement GWClaimRelatedContactsEnhancement : entity.Claim {

  property get RelatedCompanyArray() : Company[] { return this.RelatedContacts.whereTypeIs(Company) }
  property get RelatedCompanyVendorArray() : CompanyVendor[] { return this.RelatedContacts.whereTypeIs(CompanyVendor) }
  property get RelatedAutoRepairShopArray() : AutoRepairShop[] { return this.RelatedContacts.whereTypeIs(AutoRepairShop) }
  property get RelatedAutoTowingAgcyArray() : AutoTowingAgcy[] { return this.RelatedContacts.whereTypeIs(AutoTowingAgcy) }
  property get RelatedLawFirmArray() : LawFirm[] { return this.RelatedContacts.whereTypeIs(LawFirm) }
  property get RelatedMedicalCareOrgArray() : MedicalCareOrg[] { return this.RelatedContacts.whereTypeIs(MedicalCareOrg) }
  property get RelatedPersonArray() : Person[] { return this.RelatedContacts.whereTypeIs(Person) }
  property get RelatedAdjudicatorArray() : Adjudicator[] { return this.RelatedContacts.whereTypeIs(Adjudicator) }
  property get RelatedPersonVendorArray() : PersonVendor[] { return this.RelatedContacts.whereTypeIs(PersonVendor) }
  property get RelatedAttorneyArray() : Attorney[] { return this.RelatedContacts.whereTypeIs(Attorney) }
  property get RelatedDoctorArray() : Doctor[] { return this.RelatedContacts.whereTypeIs(Doctor) }
  property get RelatedUserContactArray() : UserContact[] { return this.RelatedContacts.whereTypeIs(UserContact) }
  property get RelatedPlaceArray() : Place[] { return this.RelatedContacts.whereTypeIs(Place) }
  property get RelatedLegalVenueArray() : LegalVenue[] { return this.RelatedContacts.whereTypeIs(LegalVenue) }

}
