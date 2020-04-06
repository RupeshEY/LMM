package gw.acc.iplm.respondrules.ilu

class IluRespondButtonAvailabilitySAPScenarioTest extends IluRespondRuleTester{

  /**
   * The broker releases a transaction.
   */
  public function testBrokerReleasingTransaction() {
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    assertFalse("The Agreement Party should not be able to respond to a newly released transaction.", respondButtonAvailable(releasedTransactionClaimNotify))
  }

  /**
   * The broker unpurges a claim and releases a transaction.
   */
  public function testBrokerUnpurgingClaim() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse("The SAP should not be able to respond to an unpurged, newly released transaction.", respondButtonAvailable(releasedTransactionClaimNotify))
  }

  /**
   * The broker unpurges a claim, releases a transaction and then
   * updates the transaction triggering a re-release.
   */
  public function testBrokerRereleasingTransaction() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond to a re-released transaction.", respondButtonAvailable(reReleasedTransactionClaimNotify))
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
    assertFalse("The SAP should not be able to respond because Lead pended the transaction.", respondButtonAvailable(transactionPendedClaimNotify))
  }

  /**
   * The SAP pended the claim.
   */
  public function testClaimPendedBySAP() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionPendedClaimNotify = penTransaction(_iluSAPId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond because they pended the transaction.", respondButtonAvailable(transactionPendedClaimNotify))
  }

  /**
   * The other SAP pended the claim.
   */
  public function testClaimPendedByOtherSAP() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionPendedClaimNotify = penTransaction(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond to a pen from another party.", respondButtonAvailable(transactionPendedClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatement() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatement()


    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond because the broker triggered reinstatement", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }

  public function testBrokerSetsPolicyReinstatementonPrevTx() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reinstatementTransactionClaimNotify = brokerSetsPolicyReinstatementForPrevTx()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond because the broker triggered reinstatement on prev Tx", respondButtonAvailable(reinstatementTransactionClaimNotify))
  }


  protected function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyEntity = super.createClaimNotifyRqEntity(_iluSAPId)
    claimNotifyEntity = setLead(claimNotifyEntity, _iluLeadId)
    claimNotifyEntity = setSecondAgreementParty(claimNotifyEntity, {_iluSAPId, _otherCarrierId2})
    return claimNotifyEntity
  }
}