package gw.acc.iplm.respondrules

class ClaimRetrieveDefaultRuleTest extends RespondRuleTester  {

  public function testStateUpdatedForAut(){
    var claimRetrieve = createClaimclaimRetrieveEntity()
    assertTrue("The transaction state should be updated for Claim Retrieve", updateTransactionState(claimRetrieve))
    var transaction = claimRetrieve.ECFTransactionState.refresh() as ECFTransactionState_Ext
    assertEquals(claimRetrieve.UUID, transaction.UUID)
  }

  private function updateTransactionState(claimRetrieve: ECFMessageClaimRetrieveRs_Ext): boolean {
    return new ClaimRetrieveDefaultRule().updateTansactionState(claimRetrieve)
  }

  private function createClaimclaimRetrieveEntity(): ECFMessageClaimRetrieveRs_Ext {
    return super.createClaimRetrieveRsEntity()
  }

}