package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO

/**
 * This class create Claimant Contact (Party)
 */
class ClaimantBuilder extends ContactBuilder {

  override function createContacts(): List<ClaimContact> {
    var newClaimContacts = new ArrayList<ClaimContact>()
    for(contactDetail in _contactDetails) {
      var newClaimContact: ClaimContact
      if (contactDetail.Name != null) {
        var claimant = _newClaim.Exposures*.Claimant.firstWhere(\contact -> contact.LMContactID_Ext?.toLowerCase() == contactDetail.Name?.toLowerCase())
        if (claimant == null) {
          newClaimContact = createClaimantWithExposure(contactDetail, LossPartyType.TC_THIRD_PARTY)
          newClaimContacts.add(newClaimContact)
        }
      } else {
        if (_newClaim.Exposures.firstWhere(\exposure -> exposure.Claimant == _newClaim.Insured) == null) {
          newClaimContact = createClaimantWithExposure(contactDetail, LossPartyType.TC_INSURED)
        }
      }
    }
    return newClaimContacts
  }

  private function createClaimantWithExposure(contactDetail: ContactDetailsDTO, lossPartyType: LossPartyType): ClaimContact {
    var exposure = _newClaim.newExposure(ExposureType.TC_PROPERTYDAMAGE, true)
    var incident = exposure.findBestIncidentForNewExposure()
    incident.Description = contactDetail.Description
    exposure.LossParty = lossPartyType
    exposure.PrimaryCoverage = CoverageType.TC_CPBLDGCOV
    exposure.State = ExposureState.TC_OPEN

    var newClaimContact: ClaimContact
    if (lossPartyType == LossPartyType.TC_INSURED) {
      _newClaim.Insured.LMContactID_Ext = contactDetail.Name
      exposure.ClaimantType = ClaimantType.TC_INSURED
      exposure.setContactByRole(ContactRole.TC_CLAIMANT, _newClaim.Insured)
    } else {
      var aPerson = new Person()
      aPerson.Name = contactDetail.Name
      aPerson.FirstName = contactDetail.Name
      newClaimContact = new ClaimContact(exposure)
      newClaimContact.Contact = aPerson
      newClaimContact.Contact.Name = aPerson.Name
      newClaimContact.Contact.LMContactID_Ext = contactDetail.Name
      newClaimContact.Claim = exposure.Claim
      exposure.ClaimantType = ClaimantType.TC_OTHER
      exposure.setContactByRole(ContactRole.TC_CLAIMANT, newClaimContact.Contact)
    }

    _newClaim.addToExposures(exposure)
    return newClaimContact
  }

}