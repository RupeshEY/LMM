package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.anonymous.elements.RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer

uses java.math.BigDecimal

enhancement ECFRetrieveClaimRsInsurerOrReinsurer: RetrieveClaimRs_ClaimMovement_Extension_Contract_ContractMarket_InsurerOrReinsurer {

  /**
   * Gets the Party.FirstAgency.
   */
  property get Market(): String {
    return ECFBureauType_Ext.get(this.Party.FirstAgency).DisplayName
  }


  /**
   * Gets the Contact.PersonName.
   */
  property get ContactName(): String {
    return this.Contact.PersonName
  }

  /**
   * Gets the Contact.Email.
   */
  property get ContactEmail(): String {
    return this.Contact.Email
  }

  /**
   * Gets the Contact.Telephone.
   */
  property get ContactTelephone(): String {
    return this.Contact.Telephone
  }

  /**
   * Gets the PartyName.
   */
  property get PartyName(): String {
    return this.Party.Name
  }

  /**
   * Gets the ShareRate.
   */
  property get ShareRate(): BigDecimal {
    return this.InsurerSharePercentage.Rate
  }

  /**
   * Gets the Reference1.
   */
  property get Reference1(): String {
    return this.InsurerOrReinsurerClaimReference1
  }

  /**
   * Gets the Reference2.
   */
  property get Reference2(): String {
    return this.InsurerOrReinsurerClaimReference2
  }

  /**
   * Gets the ManagingAgentCode.
   */
  property get Code(): String {
    return this.ManagingAgentCode
  }

  /**
   * Gets the Role.
   */
  property get Role(): ECFParticipantFunction_Ext {
    return ECFUtils.ecfParticipantFunctionParser(this.ParticipantFunction)
  }

}
