package gw.acc.iplm.respondrules.lirma

uses gw.acc.iplm.config.LMCompaniesDataLoader

/**
 * This class is intended to test the LIRMA respond availability
 * scenarios from the point of view of a LIRMA Second Agreement
 * Party participant.
 */
class LirmaRespondButtonAvailabilitySAPScenarioTest extends LirmaRespondRuleTester {

  private static var _lirmaSAPId: String = new LMCompaniesDataLoader().LirmaCompanies.first().FirstId

  /**
   * The broker releases a transaction.
   */
  public function testBrokerReleasingTransaction() {
    var releasedTransactionClaimNotify = brokerReleasesTransaction()

    assertFalse("The SAP should not be able to respond to a newly released transaction.", respondButtonAvailable(releasedTransactionClaimNotify))
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
   * The lead circulates a released transaction.
   */
  public function testLeadCirculating() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))

    assertTrue("The SAP should be able to respond to a circulated transaction as they have not yet agreed.", respondButtonAvailable(leadCirculatesClaimNotify))
  }

  /**
   * The lead agrees after they have circulated the transaction.
   */
  public function testLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var leadAgreesClaimNotify = leadAgrees(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))

    assertTrue("The SAP should be able to respond after the Lead as they have not yet agreed.", respondButtonAvailable(leadAgreesClaimNotify))
  }

  /**
   * The second agreement party agrees, but the lead has not.
   */
  public function testSAPAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var sapAgreesClaimNotify = sapAgrees(_lirmaSAPId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The SAP should not be able to respond to this transaction as they already agreed.", respondButtonAvailable(sapAgreesClaimNotify))
  }

  /**
   * After the lead agrees followed by the second agreement party agreement.
   */
  public function testSAPAgreesAfterLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var leadAgreesClaimNotify = leadAgrees(_otherCarrierId)
    var sapAgreesClaimNotify = sapAgrees(_lirmaSAPId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The SAP should not be able to respond as they have already agreed.", respondButtonAvailable(sapAgreesClaimNotify))
  }

  /**
   * The broker is acknowledging that all parties have agreed on
   * this transaction.
   */
  public function testBrokerAcknowledgesAllAgreed() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var leadAgreesClaimNotify = leadAgrees(_otherCarrierId)
    var brokerAcknowledgesAllAgreedClaimNotify = brokerAcknowledgesAllAgreed()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The SAP should not be able to respond after broker acknowledges that everyone has agreed.", respondButtonAvailable(brokerAcknowledgesAllAgreedClaimNotify))
  }

  /**
   * While the broker is making changes no one should be able to
   * respond to this transaction.
   */
  public function testBrokerMakingChanges_Transaction3() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus3()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The SAP should not be able to respond while the broker is making changes.", respondButtonAvailable(brokerMakingChangesClaimNotify))
  }

  /**
   * While the broker is making changes no one should be able to
   * respond to this transaction.
   */
  public function testBrokerMakingChanges_Transaction4() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus4()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The SAP should not be able to respond while the broker is making changes.", respondButtonAvailable(brokerMakingChangesClaimNotify))
  }

  /**
   * The lead rejects the claim.
   */
  public function testClaimRejectedByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionRejectedClaimNotify = leadRejectsTransaction(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond after the lead rejects the Claim.", respondButtonAvailable(transactionRejectedClaimNotify))
  }

  /**
   * The lead cancels the claim.
   */
  public function testClaimCancelledByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionCancelledClaimNotify = leadCancelsTransaction(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond after the lead cancels the Claim.", respondButtonAvailable(transactionCancelledClaimNotify))
  }

  /**
   * The lead deletes the claim.
   */
  public function testClaimDeletedByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionDeletedClaimNotify = brokerDeletesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond after the lead deletes the Claim.", respondButtonAvailable(transactionDeletedClaimNotify))
  }

  /**
   * The broker creates an e-event before the lead circulates.
   */
  public function testBrokerCreatesEEvent_BeforeCirculation() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var eEventClaimNotify = brokerCreatesEEvent()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The SAP should not be able to respond while an E-Event exists.", respondButtonAvailable(eEventClaimNotify))
  }

  /**
   * The broker creates an e-event after the lead circulates.
   */
  public function testBrokerCreatesEEvent_AfterCirculation() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_otherCarrierId)
    var eEventClaimNotify = brokerCreatesEEvent()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The SAP should not be able to respond while an E-Event exists.", respondButtonAvailable(eEventClaimNotify))
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyEntity = super.createClaimNotifyRqEntity(_lirmaSAPId)
    claimNotifyEntity = setLead(claimNotifyEntity, _otherCarrierId)
    claimNotifyEntity = setSecondAgreementParty(claimNotifyEntity, {_lirmaSAPId, _otherCarrierId2})
    return claimNotifyEntity
  }
}