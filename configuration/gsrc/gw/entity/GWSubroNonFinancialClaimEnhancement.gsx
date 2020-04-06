package gw.entity

uses gw.api.locale.DisplayKey
uses gw.subrogation.financials.SubrogationOpportunity

uses java.lang.IllegalArgumentException
uses java.math.BigDecimal

@Export
enhancement GWSubroNonFinancialClaimEnhancement : entity.Claim {
  /**
   * Returns the sum of liability percentages of all adverse parties.
   */
  function AdversePartyLiabilityPercent() : BigDecimal {
    return this.SubrogationSummary.SubroAdverseParties.sum(\party -> party.Fault ?: 0)
  }

  /**
   * Returns the sum of expected recovery percentages of all adverse parties.
   * @return
   */
  function AdversePartyExpectedRecoveryPercent() : BigDecimal {
    return this.SubrogationSummary.SubroAdverseParties.sum(\party -> party.ExpectedRecovery ?: 0)
  }

  /**
   * Returns TC_GOV if any adverse party has SubroGovernmentInvolved == TC_GOV, or TC_NONGOV otherwise.
   */
  function SubroIsGovernmentInvolved() : SubroGovernmentInvolved {

    if (this.SubrogationSummary.SubroAdverseParties.toList().hasMatch(\ aAdverseParty -> aAdverseParty.SubroGovernmentInvolved == TC_GOV)) {
      return TC_GOV
    }
     return TC_NONGOV

  }

  /**
   * Returns whether subrogation should be automatically opened for this claim.
   * @return true if subrogation should be opened for this claim, false otherwise
   */
  function ActivateSubroModule(): Boolean {
    return SubrogationOpportunity.determineEligibility(this)
  }

  /**
   * Convenience virtual getter property for use in the UI.
   * Returns the SubrogationStatus of this claim's SubrogationSummary; null if subrogation has not been opened.
   */
  property get SubrogationStatus() : SubrogationStatus {
    return this.SubrogationSummary.Status
  }

  /**
   * Convenience virtual setter property for use in the UI.
   * A claim can only have its subrogation status directly set to OPEN or REVIEW; closing subrogation should be done
   * through the subrogation UI.
   *
   * Creates a claim-level subrogation summary if one does not already exist, and sets the single subrogation's status
   * to the given status.
   *
   * @param status SubrogationStatus to set on this claim's SubrogationSummary; only legal arguments are TC_OPEN and TC_REVIEW
   *
   * @throws IllegalArgumentException if there is already a subrogation summary on this claim with exposures being
   * subrogated individually.
   */
  property set SubrogationStatus(status : SubrogationStatus) {
    if (status != TC_OPEN and status != TC_REVIEW) {
      throw new IllegalArgumentException("Cannot set a claim's SubrogationStatus to anything other than OPEN or REVIEW.")
    }
    var summary = this.createSubrogationSummaryIdempotently()
    if (summary.Subrogations.length == 0) {
      summary.addToSubrogations(new Subrogation(this.Bundle))
    }
    summary.Status = status
  }

  /**
   * Creates a new SubroAdverseParty and adds it to this claim's SubrogationSummary.
   *
   * @return the newly created SubroAdverseParty
   */
  function newSubroAdverseParty() : SubroAdverseParty {
    var newItem = new SubroAdverseParty(this) 
    this.SubrogationSummary.addToSubroAdverseParties(newItem)
    return newItem 
  }


  /**
   * Returns an array of Notes with NoteTopicType == TC_SUBROGATION.
   */
  function getSubroNotes() : Note[] {
    return this.getViewableNotes(NoteTopicType.TC_SUBROGATION).toTypedArray()
  }

  /**
   * Returns an array of Matters where SubroRelated is true.
   */
  function getSubroMatters() : Matter[] {

    var numberOfSubroMatters = 0
    var numberOfThisSubroMatter = 0

    for (thisMatter in this.Matters) {
      if (thisMatter.SubroRelated == true) {
        numberOfSubroMatters = numberOfSubroMatters + 1
      }
    }

    var AllSubroMatters = new Matter[numberOfSubroMatters]

    for (thisMatter in this.Matters){
      if (thisMatter.SubroRelated == true) {
        AllSubroMatters[numberOfThisSubroMatter] = thisMatter
        numberOfThisSubroMatter = numberOfThisSubroMatter + 1
      }
    }

    return AllSubroMatters
  }

  /**
   * Returns a string representation of parties in arbitration.
   * This is a comma separated list of all adverse parties (or their insurer if it exists)
   * whose Strategy is either TC_ARBITRATE or TC_LAWSUIT.
   */
  function getPartiesInMatters() : String {
    var PartiesInArbitration = ""

    for (eachparty in this.SubrogationSummary.SubroAdverseParties)
      if (eachparty.Strategy ==TC_ARBITRATE or eachparty.Strategy == TC_LAWSUIT) {
        if  (PartiesInArbitration.length() > 0) {
          PartiesInArbitration = PartiesInArbitration + ", "
        }

        PartiesInArbitration = PartiesInArbitration + (eachparty.AdverseParty.Thirdpartyinsurer == null ? eachparty.AdverseParty.DisplayName : DisplayKey.get("Subrogation.InsurerForAdverseParty", eachparty.AdverseParty.Thirdpartyinsurer.DisplayName, eachparty.AdverseParty.DisplayName))
    }

    return PartiesInArbitration
  }

  /**
   * Returns an array of all ClaimContactRoles on this claim and its exposures with the TC_ADVERSEPARTY role.
   */
  function getAllAdversePartyRoles() : ClaimContactRole[] {
    var numberOfAdverseRole = 0
    var ClaimAdverseRoles :	ClaimContactRole[]
    ClaimAdverseRoles = this.getClaimContactRolesByRole(TC_ADVERSEPARTY)
    var numRolesAdded : int

    //  Count the number of AdversePartyRoles on Claim
    if (ClaimAdverseRoles.length > 0) {
      numberOfAdverseRole = ClaimAdverseRoles.length
    }

    //  Count the number of AdversePartyRoles on Exposures

    for (exp in this.Exposures) {
      numberOfAdverseRole = numberOfAdverseRole + exp.getClaimContactRolesByRole(TC_ADVERSEPARTY).length
    }
    //  Add each claim-based AdversePartyRoles to the arrary

    var AllAdverseRoles = new ClaimContactRole[numberOfAdverseRole]
    for (myrole in this.getClaimContactRolesByRole(TC_ADVERSEPARTY) index i) {
      AllAdverseRoles[i] = myrole
    }

    if (ClaimAdverseRoles.length > 0) {
      numRolesAdded = ClaimAdverseRoles.length
    }

    //  Add exposure claim-based AdversePartyRoles to the arrary
    for (exp in this.Exposures) {
      for (myrole in exp.getClaimContactRolesByRole(TC_ADVERSEPARTY)) {
        AllAdverseRoles[numRolesAdded] = myrole
        numRolesAdded = numRolesAdded + 1
      }
    }

    return AllAdverseRoles
  }

}
