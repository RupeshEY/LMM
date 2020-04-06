package gw.acc.iplm.respondrules

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

uses java.io.File

abstract class RespondRuleTester extends GUnitTestClass {
  protected static var _testUCR: String
  protected static var _otherCarrierId: String = "GW2001"
  protected static var _otherCarrierId2: String = "GW2002"
  protected static var _brokerId: String = "9979"
  protected static var _systemId: String = "SYSTEM"
  protected static var _carrierBureau: ECFBureauType_Ext

  override public function beforeMethod() {
    super.beforeMethod()
    deleteAllMessages()
    _testUCR = ClaimBuilderHelper.getNextUCR()
  }

  /**
   * @param xml             - Message to create
   * @param receiverCompany - party to set as the Insurer in the message
   * @return
   */
  protected function createClaimNotifyRqEntity(xml: File, receiverCompany: Party): ECFMessageClaimNotifyRq_Ext {
    var xmlElement = ECFMessageUtil.createNewXmlMessage(xml)
    var claimNotifyXml = ClaimNotifyEventRq.parse(xmlElement.asUTFString())
    claimNotifyXml.UCR = _testUCR
    claimNotifyXml.ClaimMovement.Insurer.Party.Id_elem?.first()?.Value = receiverCompany.FirstId
    claimNotifyXml.ClaimMovement.Insurer.Party.Id_elem?.first()?.Agency = receiverCompany.FirstAgency
    claimNotifyXml.ClaimMovement.Insurer.Party.Name = receiverCompany.Name
    var claimNotifyEntity = new EntityMapperService().createEntity(claimNotifyXml) as ECFMessageClaimNotifyRq_Ext

    return claimNotifyEntity
  }

  protected function createClaimRetrieveRsEntity(): ECFMessageClaimRetrieveRs_Ext {
    var xmlElement = ECFMessageUtil.createNewClaimRetrieveRs()
    var claimRetrieveXml = RetrieveClaimRs.parse(xmlElement.asUTFString())
    claimRetrieveXml.UCR = _testUCR
    var claimRetrieveEntity = new EntityMapperService().createEntity(claimRetrieveXml) as ECFMessageClaimRetrieveRs_Ext

    return claimRetrieveEntity
  }

  protected function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, secondAgreementPartyIds: List<String>): ECFMessageClaimNotifyRq_Ext {
    var sapMap = new HashMap<String, typekey.ECFBureauType_Ext>()
    secondAgreementPartyIds.each(\elt -> {
      sapMap.put(elt, _carrierBureau)
    })

    return setSecondAgreementParty(claimNotifyEntity, sapMap)
  }

  private function setSecondAgreementParty(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, sapMap: HashMap<String, typekey.ECFBureauType_Ext>): ECFMessageClaimNotifyRq_Ext {
    var secondAgreementParties = claimNotifyEntity.ECFContractMarkets.where(\elt -> elt.ParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY)

    var sapArray = sapMap.keySet().toList().toTypedArray()
    for (sap in sapArray index i) {
      gw.transaction.Transaction.runWithNewBundle(\bundle -> {
        claimNotifyEntity = bundle.add(claimNotifyEntity)
        secondAgreementParties[i] = bundle.add(secondAgreementParties[i])
        secondAgreementParties[i].PartyID = sap
        secondAgreementParties[i].Bureau = sapMap.get(sap)

        if (claimNotifyEntity.ReceiverPartyId.equals(sap)) {
          claimNotifyEntity.BureauType = sapMap.get(sap)
          claimNotifyEntity.Role = ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
        }
      }, User.util.UnrestrictedUser)
    }

    return claimNotifyEntity
  }

  protected function setLead(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, leadId: String): ECFMessageClaimNotifyRq_Ext {
    return setLead(claimNotifyEntity, leadId, _carrierBureau)
  }

  protected function setLead(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, leadId: String, bureauType: ECFBureauType_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)

      var leadParticipant = claimNotifyEntity.ECFContractMarkets.firstWhere(\elt -> elt.ParticipantFunction == ECFParticipantFunction_Ext.TC_LEAD)
      leadParticipant = bundle.add(leadParticipant)

      leadParticipant.PartyID = leadId
      leadParticipant.Bureau = bureauType
      if (claimNotifyEntity.ReceiverPartyId.equals(leadId)) {
        claimNotifyEntity.BureauType = bureauType
        claimNotifyEntity.Role = ECFParticipantFunction_Ext.TC_LEAD
      }
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function setTransactionStatus(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, transactionStatus: ECFTransactionStatus_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.TransactionStatus = transactionStatus
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function setActionCode(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, actionCode: ECFActionCode_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ActionCode = actionCode
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function setResponseCode(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, responseCode: ECFResponseCode_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ResponseCode = responseCode
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function getClaimNotifyXml(): ClaimNotifyEventRq {
    var claimNotifyXml = ECFMessageUtil.createNewClaimNotifyRq()
    claimNotifyXml.UCR = _testUCR
    return claimNotifyXml
  }

  protected function setExplanation(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, actionCode: ECFActionCode_Ext): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ActionCode = actionCode
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function setActionParticipant(claimNotifyEntity: ECFMessageClaimNotifyRq_Ext, actionParticipant: String): ECFMessageClaimNotifyRq_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyEntity = bundle.add(claimNotifyEntity)
      claimNotifyEntity.ActionParticipant = ECFUtils.stripPrefixesFromID(actionParticipant)
    }, User.util.UnrestrictedUser)

    return claimNotifyEntity
  }

  protected function processClaimNotifyEntity(claimNotifyMessage: ECFMessageClaimNotifyRq_Ext): ECFMessageClaimNotifyRq_Ext {
    new InterceptorManagerWrapper().intercept(claimNotifyMessage)
    return claimNotifyMessage.refresh() as ECFMessageClaimNotifyRq_Ext
  }

  protected function deleteAllMessages() {
    var ecfMessages = Query.make(ECFMessage_Ext).select().toList()
    var transactionStates = Query.make(ECFTransactionState_Ext).select().toList()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessages.each(\elt -> {
        bundle.delete(elt)
      })

      transactionStates.each(\elt -> {
        bundle.delete(elt)
      })
    }, User.util.UnrestrictedUser)
  }

  protected function respondButtonAvailable(ecfMessage: ECFMessageClaimNotifyRq_Ext): boolean {
    return (ecfMessage.refresh() as ECFMessageClaimNotifyRq_Ext).Respondable
  }

}