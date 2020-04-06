package gw.acc.iplm.respondrules.ilu.agreementparty

uses gw.acc.iplm.respondrules.ilu.IluRespondRuleTester

class IluTransactionPartAutAgreedRule_AgreementPartyTest extends IluRespondRuleTester {

  public function testStateNotUpdatedForPartAutWhereNotAgreed(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify,{_iluTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertFalse("The transaction state should not be updated for a part aut where not agreed", updateTransactionState(claimNotify))
  }

  public function testStateUpdatedForPartAutWhereAlreadyAgreed(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify,{_iluTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)
    claimNotify = setAgreement(claimNotify, true)

    assertTrue("The transaction state should be updated for a part aut where already agreed", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForOtherTransaction(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, _iluTestId)
    claimNotify = setActionParticipant(claimNotify, _otherCarrierId2)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertFalse("The transaction state should not be updated for another transaction status", updateTransactionState(claimNotify))
  }

  public function testStateNotUpdatedForOtherOwnAgreement(){
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setActionCode(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setSecondAgreementParty(claimNotify, {_iluTestId, _otherCarrierId})
    claimNotify = setActionParticipant(claimNotify, _iluTestId)
    claimNotify = setLead(claimNotify, _otherCarrierId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AUT)

    assertFalse("The transaction state should not be updated for own agreement", updateTransactionState(claimNotify))
  }

  private function setAgreement(claimNotify: ECFMessageClaimNotifyRq_Ext, agree : boolean): ECFMessageClaimNotifyRq_Ext{
    claimNotify.ECFTransactionState.Agreed = agree
    return claimNotify
  }

  private function updateTransactionState(claimNotify: ECFMessageClaimNotifyRq_Ext): boolean {
    return new IluTransactionPartAutAgreedRule_AgreementParty().updateTansactionState(claimNotify)
  }

  override function createClaimNotifyRqEntity(): ECFMessageClaimNotifyRq_Ext {
    return super.createClaimNotifyRqEntity(_iluTestId)
  }
}