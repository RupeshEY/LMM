package gw.acc.iplm.respondrules.lloyds

uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.respondrules.RespondRuleTester
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.api.util.ConfigAccess

uses java.io.File

abstract class LloydsRespondRuleTester extends RespondRuleTester {

  protected static var _lloydsIds: Party[] = new LMCompaniesDataLoader().LloydsCompanies.toTypedArray()
  protected static var _lloydsLeadId: String = _lloydsIds[0].FirstId
  protected static var _lloydsSAPId: String = _lloydsIds[1].FirstId
  protected static var _lloydsSAPId2: String = _lloydsIds[2].FirstId
  protected static var _lloydsTestId: String = new LMCompaniesDataLoader().LloydsCompanies.first().FirstId

  protected static var _lloydsClaimNotifyFile: File = ConfigAccess.getConfigFile("config/iplm/testresources/claimnotify/ClaimNotifyEventRq-Lloyds-SAMPLE.xml")

  override function beforeClass() {
    _carrierBureau = ECFBureauType_Ext.TC_LLOYDS
    super.beforeClass()
  }

  protected function brokerCompletesTransaction(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_40_COMPLETE)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerReleasesTransaction(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_A)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function leadAgrees(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsLeadId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AGREE_PAY)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function firstSAPAgrees(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsSAPId)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AGREE_PAY)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function secondSAPAgrees(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_15_PART_AUT)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsSAPId2)
    claimNotify = setResponseCode(claimNotify, ECFResponseCode_Ext.TC_AGREE_PAY)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function secondSAPQueries(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, TC_14_PART_AUT)
    claimNotify = setExplanation(claimNotify, TC_R)
    claimNotify = setActionParticipant(claimNotify, _lloydsSAPId2)
    claimNotify = setResponseCode(claimNotify, TC_QUERY_RETURN)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function brokerResetsToAwaitingQueried(receiverId: String): ECFMessageClaimNotifyRq_Ext {
    var claimNotify = createClaimNotifyRqEntity(receiverId)
    claimNotify = setTransactionStatus(claimNotify, ECFTransactionStatus_Ext.TC_10_AWAITING_QUERIED)
    claimNotify = setExplanation(claimNotify, ECFActionCode_Ext.TC_U)
    claimNotify = setActionParticipant(claimNotify, _brokerId)

    return processClaimNotifyEntity(claimNotify)
  }

  protected function createClaimNotifyRqEntity(receiver: String): ECFMessageClaimNotifyRq_Ext {
    var company = new LMCompaniesDataLoader().LloydsCompanies.firstWhere(\company -> company.FirstId == receiver)
    var claimNotifyEntity = super.createClaimNotifyRqEntity(_lloydsClaimNotifyFile, company)
    claimNotifyEntity = setLead(claimNotifyEntity, _lloydsLeadId)
    claimNotifyEntity = setSecondAgreementParties(claimNotifyEntity, {_lloydsSAPId, _lloydsSAPId2})
    return claimNotifyEntity
  }

  private function setSecondAgreementParties(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, secondAgreementPartyIds: List<String>): ECFMessageClaimNotifyRq_Ext {
    var sapMap = new HashMap<String, typekey.ECFBureauType_Ext>()
    secondAgreementPartyIds.each(\elt -> {
      sapMap.put(elt, ECFBureauType_Ext.TC_LLOYDS)
    })

    return setSecondAgreementParties(claimNotifyEntity, sapMap)
  }

  private function setSecondAgreementParties(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, sapMap: HashMap<String, typekey.ECFBureauType_Ext>): ECFMessageClaimNotifyRq_Ext {
    var secondAgreementParties = claimNotifyEntity.ECFContractMarkets.where(\elt -> elt.ParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)
    var secondAgreementPartyParticipant1 = secondAgreementParties[0]
    var secondAgreementPartyParticipant2 = secondAgreementParties[1]

    var sapArray = sapMap.keySet().toList().toTypedArray()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      secondAgreementPartyParticipant1 = bundle.add(secondAgreementPartyParticipant1)
      secondAgreementPartyParticipant2 = bundle.add(secondAgreementPartyParticipant2)

      secondAgreementPartyParticipant1.PartyID = sapArray[0]
      secondAgreementPartyParticipant1.Bureau = sapMap.get(sapArray[0])
      if (claimNotifyEntity.ReceiverPartyId.equals(sapArray[0])) {
        claimNotifyEntity.BureauType = sapMap.get(sapArray[0])
        claimNotifyEntity.Role = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      }

      secondAgreementPartyParticipant2.PartyID = sapArray[1]
      secondAgreementPartyParticipant2.Bureau = sapMap.get(sapArray[0])
      if (claimNotifyEntity.ReceiverPartyId.equals(sapArray[1])) {
        claimNotifyEntity.BureauType = sapMap.get(sapArray[1])
        claimNotifyEntity.Role = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
      }


    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }
}