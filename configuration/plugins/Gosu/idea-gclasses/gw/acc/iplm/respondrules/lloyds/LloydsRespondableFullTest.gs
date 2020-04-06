package gw.acc.iplm.respondrules.lloyds

class LloydsRespondableFullTest extends LloydsRespondRuleTester {

  /**
   * Carrier is Lead and both SAPs.
   *
   * Scenario:
   * 1. Lead agrees
   * 2. First SAP agrees
   * 3. Second SAP queries
   * 4. Lead is required to agree again
   * 5. First SAP agrees
   * 6. Second SAP agrees
   * 7. Broker confirms all agreed
   * 8. Broker completes transaction
   */
  function testLloydsRespondAvailabilityScenarioTest(){
    var releasedTransaction_Lead = brokerReleasesTransaction(_lloydsLeadId)
    var releasedTransaction_SAP1 = brokerReleasesTransaction(_lloydsSAPId)
    var releasedTransaction_SAP2 = brokerReleasesTransaction(_lloydsSAPId2)

    assertTrue("The Lead should be able to respond to a newly released transaction (10-Awaiting/Queried).", respondButtonAvailable(releasedTransaction_Lead))
    assertFalse("SAP 1 should not be able to respond to a newly released transaction (10-Awaiting/Queried).", respondButtonAvailable(releasedTransaction_SAP1))
    assertFalse("SAP 2 should not be able to respond to a newly released transaction (10-Awaiting/Queried).", respondButtonAvailable(releasedTransaction_SAP2))

    var leadAgrees_Lead = leadAgrees(_lloydsLeadId)
    var leadAgrees_SAP1 = leadAgrees(_lloydsSAPId)
    var leadAgrees_SAP2 = leadAgrees(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond after they have agreed (14-PART-AUT).", respondButtonAvailable(leadAgrees_Lead))
    assertTrue("SAP 1 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(leadAgrees_SAP1))
    assertTrue("SAP 2 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(leadAgrees_SAP2))

    var firstSAPAgrees_Lead = firstSAPAgrees(_lloydsLeadId)
    var firstSAPAgrees_SAP1 = firstSAPAgrees(_lloydsSAPId)
    var firstSAPAgrees_SAP2 = firstSAPAgrees(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond when the Transaction Status is 14-PART-AUT.", respondButtonAvailable(firstSAPAgrees_Lead))
    assertFalse("SAP 1 should not be able to respond as they have already responded to this 14-PART-AUT.", respondButtonAvailable(firstSAPAgrees_SAP1))
    assertTrue("SAP 2 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(firstSAPAgrees_SAP2))

    var secondSAPQueries_Lead = secondSAPQueries(_lloydsLeadId)
    var secondSAPQueries_SAP1 = secondSAPQueries(_lloydsSAPId)
    var secondSAPQueries_SAP2 = secondSAPQueries(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond when the Transaction Status is 14-PART-AUT.", respondButtonAvailable(secondSAPQueries_Lead))
    assertFalse("SAP 1 should not be able to respond as they have already responded to this 14-PART-AUT.", respondButtonAvailable(secondSAPQueries_SAP1))
    assertTrue("SAP 2 should still be able to respond to the QUERY/RETURN 14-PART-AUT message.", respondButtonAvailable(secondSAPQueries_SAP2))
    assertTrue("SAP 2 should still be able to respond to the previous 14-PART-AUT message which they have not yet responded too.", respondButtonAvailable(firstSAPAgrees_SAP2))

    var brokerResetsToAwaitingQueried_Lead = brokerResetsToAwaitingQueried(_lloydsLeadId)
    var brokerResetsToAwaitingQueried_SAP1 = brokerResetsToAwaitingQueried(_lloydsSAPId)
    var brokerResetsToAwaitingQueried_SAP2 = brokerResetsToAwaitingQueried(_lloydsSAPId2)

    assertTrue("The Lead should be able to respond as they have not responded since the broker reset back to 10-AWAITING/QUERIED.", respondButtonAvailable(brokerResetsToAwaitingQueried_Lead))
    assertFalse("SAP 1 should not be able to respond to a 10-Awaiting/Queried transaction.", respondButtonAvailable(brokerResetsToAwaitingQueried_SAP1))
    assertFalse("SAP 2 should not be able to respond to a 10-Awaiting/Queried transaction.", respondButtonAvailable(brokerResetsToAwaitingQueried_SAP2))

    var leadAgreesAgain_Lead = leadAgrees(_lloydsLeadId)
    var leadAgreesAgain_SAP1 = leadAgrees(_lloydsSAPId)
    var leadAgreesAgain_SAP2 = leadAgrees(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond as they have already agreed (14-PART-AUT).", respondButtonAvailable(leadAgreesAgain_Lead))
    assertTrue("SAP 1 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(leadAgreesAgain_SAP1))
    assertTrue("SAP 2 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(leadAgreesAgain_SAP2))

    var firstSAPAgreesAgain_Lead = firstSAPAgrees(_lloydsLeadId)
    var firstSAPAgreesAgain_SAP1 = firstSAPAgrees(_lloydsSAPId)
    var firstSAPAgreesAgain_SAP2 = firstSAPAgrees(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond as they have already agreed (14-PART-AUT).", respondButtonAvailable(firstSAPAgreesAgain_Lead))
    assertFalse("SAP 1 should not be able to respond as they have already responded to this 14-PART-AUT.", respondButtonAvailable(firstSAPAgreesAgain_SAP1))
    assertTrue("SAP 2 should be able to respond as they have not yet responded to this 14-PART-AUT.", respondButtonAvailable(firstSAPAgreesAgain_SAP2))

    var secondSAPAgreesAgain_Lead = secondSAPAgrees(_lloydsLeadId)
    var secondSAPAgreesAgain_SAP1 = secondSAPAgrees(_lloydsSAPId)
    var secondSAPAgreesAgain_SAP2 = secondSAPAgrees(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond as they have already agreed (all parties have).", respondButtonAvailable(secondSAPAgreesAgain_Lead))
    assertFalse("SAP 1 should not be able to respond as they have already responded to this transaction (all parties have).", respondButtonAvailable(secondSAPAgreesAgain_SAP1))
    assertFalse("SAP 2 should not be able to respond as they have already responded to this transaction (all parties have).", respondButtonAvailable(secondSAPAgreesAgain_SAP2))

    var brokerCompletesTransaction_Lead = brokerCompletesTransaction(_lloydsLeadId)
    var brokerCompletesTransaction_SAP1 = brokerCompletesTransaction(_lloydsSAPId)
    var brokerCompletesTransaction_SAP2 = brokerCompletesTransaction(_lloydsSAPId2)

    assertFalse("The Lead should not be able to respond as the transaction is now complete (40-COMPLETE).", respondButtonAvailable(brokerCompletesTransaction_Lead))
    assertFalse("SAP 1 should not be able to respond as the transaction is now complete (40-COMPLETE).", respondButtonAvailable(brokerCompletesTransaction_SAP1))
    assertFalse("SAP 2 should not be able to respond as the transaction is now complete (40-COMPLETE).", respondButtonAvailable(brokerCompletesTransaction_SAP2))
  }
}