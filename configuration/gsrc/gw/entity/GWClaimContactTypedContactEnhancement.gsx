package gw.entity

/**
 * Properties for accessing ClaimContact.Contact as specific contact types.
 */
@Export
enhancement GWClaimContactTypedContactEnhancement : entity.ClaimContact {

  property get Company() : Company { return this.Contact typeis Company ? this.Contact : null }
  property get CompanyVendor() : CompanyVendor { return this.Contact typeis CompanyVendor ? this.Contact : null }
  property get AutoRepairShop() : AutoRepairShop { return this.Contact typeis AutoRepairShop ? this.Contact : null }
  property get AutoTowingAgcy() : AutoTowingAgcy { return this.Contact typeis AutoTowingAgcy ? this.Contact : null }
  property get LawFirm() : LawFirm { return this.Contact typeis LawFirm ? this.Contact : null }
  property get MedicalCareOrg() : MedicalCareOrg { return this.Contact typeis MedicalCareOrg ? this.Contact : null }
  property get Person() : Person { return this.Contact typeis Person ? this.Contact : null }
  property get Adjudicator() : Adjudicator { return this.Contact typeis Adjudicator ? this.Contact : null }
  property get PersonVendor() : PersonVendor { return this.Contact typeis PersonVendor ? this.Contact : null }
  property get Attorney() : Attorney { return this.Contact typeis Attorney ? this.Contact : null }
  property get Doctor() : Doctor { return this.Contact typeis Doctor ? this.Contact : null }
  property get UserContact() : UserContact { return this.Contact typeis UserContact ? this.Contact : null }
  property get Place() : Place { return this.Contact typeis Place ? this.Contact : null }
  property get LegalVenue() : LegalVenue { return this.Contact typeis LegalVenue ? this.Contact : null }

}
