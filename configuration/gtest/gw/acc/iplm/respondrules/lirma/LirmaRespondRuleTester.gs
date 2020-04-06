package gw.acc.iplm.respondrules.lirma

uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.respondrules.RespondRuleTester
uses gw.api.util.ConfigAccess

uses java.io.File

abstract class LirmaRespondRuleTester extends RespondRuleTester {

  protected static var _lirmaClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lirma-SAMPLE.xml")
  protected static var _lirmaTestId: String = new LMCompaniesDataLoader().LirmaCompanies.first().FirstId

  override function beforeClass() {
    _carrierBureau = ECFBureauType_Ext.TC_LIRMA
    super.beforeClass()
  }

  abstract function createClaimNotifyRqEntity() : ECFMessageClaimNotifyRq_Ext

  protected function createClaimNotifyRqEntity(receiver : String): ECFMessageClaimNotifyRq_Ext {
    var company = new LMCompaniesDataLoader().LirmaCompanies.firstWhere(\company -> company.FirstId == receiver)
    return super.createClaimNotifyRqEntity(_lirmaClaimNotifyFile, company)
  }

  protected function brokerReleasesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerReReleasesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerUnpurgesClaim(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_8_PURGED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadCirculates(actionParticipantId : String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CIR)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadAgrees(actionParticipantId : String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, secondAgreementPartyIds: List<String>): ECFMessageClaimNotifyRq_Ext {
    return super.setSecondAgreementParty(claimNotifyEntity, secondAgreementPartyIds)
  }

  protected function setLead(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, leadId: String): ECFMessageClaimNotifyRq_Ext {
    return super.setLead(claimNotifyEntity, leadId, ECFBureauType_Ext.TC_LIRMA)
  }

  protected function sapAgrees(actionParticipantId : String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_20_CIRCULATED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAA)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerAcknowledgesAllAgreed(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerIsMakingChanges_TransactionStatus3(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_3)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerIsMakingChanges_TransactionStatus4(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_4)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadRejectsTransaction(actionParticipantId : String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_REJ)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_REJ)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadCancelsTransaction(actionParticipantId : String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_45_CANCELD)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_CAN)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerDeletesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerCreatesEEvent(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    return processClaimNotifyEntity(claimNotify)
  }
}