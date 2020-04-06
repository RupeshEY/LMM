package gw.acc.iplm.xmlmapper.writeback

uses gw.acc.iplm.xmlmapper.writeback.ilu.ILULeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.ilu.ILUSAPClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lirma.LirmaLeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lirma.LirmaSAPClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lloyds.LloydsLeadClaimResponseRqMapper
uses gw.acc.iplm.xmlmapper.writeback.lloyds.LloydsSAPClaimResponseRqMapper

class ClaimResponseRqMapperFactory {

  public function getMapper(claimResponseRqMessage: ECFMessageClaimResponseRq_Ext): ClaimResponseRequestMapper {
    var modeCode = claimResponseRqMessage.BureauType.DisplayName.replace("'", "") + claimResponseRqMessage.RespondAsParticipantFunction.Code
    switch (ECFClaimResponseMode_Ext.get(modeCode)) {
      case ECFClaimResponseMode_Ext.TC_LLOYDSLEAD:
        return new LloydsLeadClaimResponseRqMapper(claimResponseRqMessage)
      case ECFClaimResponseMode_Ext.TC_LLOYDSAGREEMENTPARTY:
        return new LloydsSAPClaimResponseRqMapper(claimResponseRqMessage)
      case ECFClaimResponseMode_Ext.TC_LIRMALEAD:
        return new LirmaLeadClaimResponseRqMapper(claimResponseRqMessage)
      case ECFClaimResponseMode_Ext.TC_LIRMAAGREEMENTPARTY:
        return new LirmaSAPClaimResponseRqMapper(claimResponseRqMessage)
      case ECFClaimResponseMode_Ext.TC_ILULEAD:
        return new ILULeadClaimResponseRqMapper(claimResponseRqMessage)
      case ECFClaimResponseMode_Ext.TC_ILUAGREEMENTPARTY:
        return new ILUSAPClaimResponseRqMapper(claimResponseRqMessage)
    }

    return null
  }

}