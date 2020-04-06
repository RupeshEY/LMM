package gw.acc.iplm.respondrules.ilu

uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.respondrules.RespondRuleTester
uses gw.api.util.ConfigAccess

uses java.io.File

abstract class IluRespondRuleTester extends RespondRuleTester {

  protected static var _iluLeadId: String = "urn:ilu:402802"
  protected static var _iluSAPId: String = "urn:ilu:402803"
  protected static var _iluClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Ilu-SAMPLE.xml")
  protected static var _iluTestId: String = new LMCompaniesDataLoader().ILUCompanies.first().FirstId

  override function beforeClass() {
    _carrierBureau = ECFBureauType_Ext.TC_ILU
    super.beforeClass()
  }

  abstract protected function createClaimNotifyRqEntity() : ECFMessageClaimNotifyRq_Ext

  protected function setLead(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, leadId: String): ECFMessageClaimNotifyRq_Ext {
    return super.setLead(claimNotifyEntity, leadId)
  }

  protected function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, secondAgreementPartyId: String): ECFMessageClaimNotifyRq_Ext {
    return super.setSecondAgreementParty(claimNotifyEntity, {secondAgreementPartyId})
  }

  protected function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, secondAgreementPartyIds: List<String>): ECFMessageClaimNotifyRq_Ext {
    return super.setSecondAgreementParty(claimNotifyEntity, secondAgreementPartyIds.map(\elt -> elt))
  }

  protected function brokerReleasesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerReReleasesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function penTransaction(actionParticipantId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_12_PENDED_REJECTED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, actionParticipantId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_PEN)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerUnpurgesClaim(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_8_PURGED)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadAgrees(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_15_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _iluLeadId)
    claimNotify = setResponseCode(claimNotify, TC_AUT)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function sapAgrees(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_15_PART_AUT)
    claimNotify = setExplanation(claimNotify, TC_R)
    claimNotify = setActionParticipant(claimNotify, _iluSAPId)
    claimNotify = setResponseCode(claimNotify, TC_AUT)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerAcknowledgesAllAgreed(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_30_AUTHORSD)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function xchangingAcknowledgesSigned(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _systemId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerIsMakingChanges_TransactionStatus3(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_3)
    claimNotify = setExplanation(claimNotify, TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerIsMakingChanges_TransactionStatus4(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_4)
    claimNotify = setExplanation(claimNotify, TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerDeletesTransaction(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_D)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerCreatesEEvent(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setExplanation(claimNotify, TC_E)
    claimNotify = setActionParticipant(claimNotify, _brokerId)
    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerSetsPolicyReinstatement(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_24_RIP_REQD)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerSetsPolicyReinstatementForPrevTx(): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity()
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_25_RIP_PREV)
    claimNotify = setExplanation(claimNotify, TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function createClaimNotifyRqEntity(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var company = new LMCompaniesDataLoader().ILUCompanies.firstWhere(\company -> company.FirstId == receiverId)
    return super.createClaimNotifyRqEntity(_iluClaimNotifyFile, company)
  }
}