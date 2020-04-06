package gw.acc.iplm.respondrules.lirma

uses gw.acc.iplm.config.LMCompaniesDataLoader

/**
 * This class is intended to test the LIRMA respond availability
 * scenarios from the point of view of a LIRMA Lead participant.
 */
class LirmaRespondButtonAvailabilityLeadScenarioTest extends LirmaRespondRuleTester {

  private var _lirmaLeadId: String = new LMCompaniesDataLoader().LirmaCompanies.first().FirstId

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
   * The broker unpurges a claim, releases a transaction and then
   * updates the transaction triggering a re-release.
   */
  public function testBrokerRereleasingTransaction() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))

    assertTrue("The Lead should be able to respond to a re-released transaction.", respondButtonAvailable(reReleasedTransactionClaimNotify))
  }

  /**
   * The lead circulates a released transaction.
   */
  public function testLeadCirculating() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))

    assertTrue("The Lead should be able to respond after they circulate.", respondButtonAvailable(leadCirculatesClaimNotify))
  }

  /**
   * The lead agrees after they have circulated the transaction.
   */
  public function testLeadAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var leadAgreesClaimNotify = leadAgrees(_lirmaLeadId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The Lead should not be able to respond again after they have agreed.", respondButtonAvailable(leadAgreesClaimNotify))
  }

  /**
   * The second agreement party agrees, but the lead has not.
   */
  public function testSAPAgrees() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var sapAgreesClaimNotify = sapAgrees(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))

    assertTrue("The Lead should be able to respond as they have not agreed yet.", respondButtonAvailable(sapAgreesClaimNotify))
  }

  /**
   * After the lead agrees followed by the second agreement party agreement.
   */
  public function testSAPAgreesAfterLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var leadAgreesClaimNotify = leadAgrees(_lirmaLeadId)
    var sapAgreesClaimNotify = sapAgrees(_otherCarrierId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
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
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var leadAgreesClaimNotify = leadAgrees(_lirmaLeadId)
    var brokerAcknowledgesAllAgreedClaimNotify = brokerAcknowledgesAllAgreed()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse(respondButtonAvailable(leadAgreesClaimNotify))
    assertFalse("The Lead should not be able to respond as all parties have already agreed.", respondButtonAvailable(brokerAcknowledgesAllAgreedClaimNotify))
  }

  /**
   * While the broker is making changes no one should be able to
   * respond to this transaction.
   */
  public function testBrokerMakingChanges_Transaction3() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var reReleasedTransactionClaimNotify = brokerReReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus3()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
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
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var brokerMakingChangesClaimNotify = brokerIsMakingChanges_TransactionStatus4()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(reReleasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker is making changes.", respondButtonAvailable(brokerMakingChangesClaimNotify))
  }

  /**
   * The lead rejects the claim.
   */
  public function testClaimRejectedByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionRejectedClaimNotify = leadRejectsTransaction(_lirmaLeadId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because they rejected the claim.", respondButtonAvailable(transactionRejectedClaimNotify))
  }

  /**
   * The lead cancels the claim.
   */
  public function testClaimCancelledByLead() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var transactionCancelledClaimNotify = leadCancelsTransaction(_lirmaLeadId)

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse("The Lead should not be able to respond because they cancelled the claim.", respondButtonAvailable(transactionCancelledClaimNotify))
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
    assertFalse("The Lead should not be able to respond because they deleted the claim.", respondButtonAvailable(transactionDeletedClaimNotify))
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
    assertFalse("The Lead should not be able to respond because the broker triggered an E-Event", respondButtonAvailable(eEventClaimNotify))
  }

  /**
   * The broker creates an e-event after the lead circulates.
   */
  public function testBrokerCreatesEEvent_AfterCirculation() {
    var unpurgedClaimNotify = brokerUnpurgesClaim()
    var releasedTransactionClaimNotify = brokerReleasesTransaction()
    var leadCirculatesClaimNotify = leadCirculates(_lirmaLeadId)
    var eEventClaimNotify = brokerCreatesEEvent()

    assertFalse(respondButtonAvailable(unpurgedClaimNotify))
    assertFalse(respondButtonAvailable(releasedTransactionClaimNotify))
    assertFalse(respondButtonAvailable(leadCirculatesClaimNotify))
    assertFalse("The Lead should not be able to respond because the broker triggered an E-Event", respondButtonAvailable(eEventClaimNotify))
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    var claimNotifyEntity = super.createClaimNotifyRqEntity(_lirmaLeadId)
    claimNotifyEntity = setLead(claimNotifyEntity, _lirmaLeadId)
    claimNotifyEntity = setSecondAgreementParty(claimNotifyEntity, {_otherCarrierId, _otherCarrierId2})
    return claimNotifyEntity
  }
}