package gw.acc.iplm.enhancements.entity

enhancement ECFClaimParticipantRole_ExtEnhancement: ECFClaimParticipantRole_Ext {

  /**
   * Checks the Initial Participant Function taken from the ECF Message being responded to and compares this to the
   * New Participant Function. The New Participant Function will be different if the user changed it from the Claim Response UI.
   *
   * @return - true if the New Participant Function is different to the Initial Participant Function
   */
  property get ParticipantFunctionChanged(): Boolean {
    return this.InitialParticipantFunction != this.NewParticipantFunction
  }

  property get AgreementParty(): Boolean {
    return this.NewParticipantFunction == TC_AGREEMENTPARTY
  }

  property set AgreementParty(setToAgreementParty: Boolean) {
    this.NewParticipantFunction = setToAgreementParty ? TC_AGREEMENTPARTY : TC_FOLLOWER
  }
}
