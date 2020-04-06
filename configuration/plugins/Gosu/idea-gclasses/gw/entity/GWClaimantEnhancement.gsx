package gw.entity

uses java.lang.IllegalArgumentException

/**
 * Enhancements for Persons that have Claimant role in a Claim
 */
@Export
enhancement GWClaimantEnhancement : entity.Person {

  property get PersonClaimantIDType() : typekey.ClaimantIDType {
    if (this.ClaimantIDType == null) {
      this.ClaimantIDType = ClaimantIDType.TC_S
    }
    return this.ClaimantIDType
  }

  property set PersonClaimantIDType(idType : typekey.ClaimantIDType) {
    this.ClaimantIDType = idType
  }

  /**
   *  Clear the claimant information for the fields that don't correspond to the
   *  new ClaimantIDType
   */
  function clearClaimantFields() {
    var claimantType = this.ClaimantIDType

    switch (claimantType) {

      case ClaimantIDType.TC_A:   this.GreenCardNumber = null
                                  this.PassportNumber = null
                                  this.SSNReleaseAuthorized = null
                                  this.TaxID = null
                                  this.VisaNumber = null
                                  break

      case ClaimantIDType.TC_E:   this.GreenCardNumber = null
                                  this.JurisdictionAssignedID = null
                                  this.PassportNumber = null
                                  this.SSNReleaseAuthorized = null
                                  this.TaxID = null
                                  break

      case ClaimantIDType.TC_G:   this.JurisdictionAssignedID = null
                                  this.PassportNumber = null
                                  this.SSNReleaseAuthorized = null
                                  this.TaxID = null
                                  this.VisaNumber = null
                                  break

      case ClaimantIDType.TC_P:   this.GreenCardNumber = null
                                  this.JurisdictionAssignedID = null
                                  this.SSNReleaseAuthorized = null
                                  this.TaxID = null
                                  this.VisaNumber = null
                                  break

      case ClaimantIDType.TC_S:   this.GreenCardNumber = null
                                  this.JurisdictionAssignedID = null
                                  this.PassportNumber = null
                                  this.VisaNumber = null
                                  break

      default:                    throw new IllegalArgumentException("Invalid ClaimantIDType set to the Person.ClaimantIDType.")

    }

  }
}
