package gw.acc.iplm.respondrules.ilu

class IluRespondButtonAvailabilityLeadScenarioTest extends IluRespondRuleTester {

  /**
   * The broker releases a transaction.
   */
  public function testBrokerReleasingTransaction() {
    var releasedTransactionClaimNotify = brokerReleasesTransaction()

    assertTrue("The Lead should be able to respond to a newly released transaction.", respondButtonAvailable(releasedTransactionClaimNotify))
  }

  /**
   * The broker unpurges a claim and releases a transaction.
   */
  public function testBrokerUnpurgingClaim() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertTrue("The Lead should be able to respond to an unpurged & newly released transaction.", respondButtonAvailable(releasedTransactionClaimNotify))
  }

  /**
   * The broker releases a transaction and then
   * updates the transaction triggering a re-release.
   */
  public function testBrokerRereleasingTransaction() {
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()

    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertTrue("The Lead should be able to respond to a re-released transaction.", respondButtonAvailable(reReleasedTransactionClaimNotify))
  }

  public function testLeadPendsTransaction() {
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var pendedTransactionClaimNotify = penTransaction(_iluLeadId)

    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertTrue("The Lead should be able to respond to their own PEN (query) R message", respondButtonAvailable(pendedTransactionClaimNotify))
  }


  public function testSAPPendsTransaction(){
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var pendedTransactionClaimNotify = penTransaction(_iluSAPId)

    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond to a PEN message from an SAP as Lead already agreed", respondButtonAvailable(pendedTransactionClaimNotify))
  }

  /**
   * The lead agrees after they have circulated the transaction.
   */
  public function testLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond again after they have agreed.", respondButtonAvailable(leadAgreesClaimNotify))
  }

  /**
   * After the lead agrees followed by the second agreement party agreement.
   */
  public function testSAPAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var sapAgreesClaimNotify = sapAgrees()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond as they have already agreed.", respondButtonAvailable(sapAgreesClaimNotify))
  }

  /**
   * The broker is acknowledging that all parties have agreed on
   * this transaction.
   */
  public function testBrokerAcknowledgesAllAgreed() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var brokerAcknowledgesAllAgreedClaimNotify = brokerAcknowledgesAllAgreed()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond as all parties have already agreed.", respondButtonAvailable(brokerAcknowledgesAllAgreedClaimNotify))
  }

  /**
   * Xchanging acknowledging that this transaction is now signed
   */
  public function testXchangingAcknowledgesSigned() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var xchangingAcknowledgesSignedClaimNotify = xchangingAcknowledgesSigned()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond as the transaction is now signed and complete.", respondButtonAvailable(xchangingAcknowledgesSignedClaimNotify))
  }

  /**
   * While the broker is making changes no one should be able to
   * respond to this transaction.
   */
  public function testBrokerMakingChanges_Transaction3() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus3()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker is making changes.", respondButtonAvailable(brokerMakingChangesClaimNotify))
  }

  /**
   * While the broker is making changes no one should be able to
   * respond to this transaction.
   */
  public function testBrokerMakingChanges_Transaction4() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus4()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker is making changes.", respondButtonAvailable(brokerMakingChangesClaimNotify))
  }

  /**
   * The lead pended the claim.
   */
  public function testClaimPendedByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionPendedClaimNotify = penTransaction(_iluLeadId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertTrue("The Lead should be able to respond, even though the claim is pended.", respondButtonAvailable(transactionPendedClaimNotify))
  }

  /**
   * The broker deletes the claim.
   */
  public function testClaimDeletedByBroker() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionDeletedClaimNotify = brokerDeletesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because they deleted the claim.", respondButtonAvailable(transactionDeletedClaimNotify))
  }

  /**
   * The broker creates an e-event before the lead agrees
   */
  public function testBrokerCreatesEEvent() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var eEventClaimNotify = brokerCreatesEEvent()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered an E-Event", respondButtonAvailable(eEventClaimNotify))
  }

  /**
   * The broker creates an e-event after the lead agrees.
   */
  public function testBrokerCreatesEEvent_AfterLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var eEventClaimNotify = brokerCreatesEEvent()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered an E-Event", respondButtonAvailable(eEventClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatement() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatement()


    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered reinstatement", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatement_AfterLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatement()


    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered reinstatement", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatementonPrevTx() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatementForPrevTx()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered reinstatement on prev Tx", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatementonPrevTx_AfterLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadAgreesClaimNotify = leadAgrees()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatementForPrevTx()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered reinstatement on prev Tx", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }

  protected function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyEntity = super.createClaimNotifyRqEntity(_iluLeadId)
    claimNotifyEntity = setLead(claimNotifyEntity, _iluLeadId)
    claimNotifyEntity = setSecondAgreementParty(claimNotifyEntity, {_otherCarrierId, _otherCarrierId2})
    return claimNotifyEntity
  }
}