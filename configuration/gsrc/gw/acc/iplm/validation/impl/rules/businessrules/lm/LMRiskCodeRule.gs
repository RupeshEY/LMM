package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

class LMRiskCodeRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext>{
  override function validate(message: LMMessageLloydsSCM_Ext) {
    if(message.SCMRiskCode == null){
      throw new LMException(LMErrorCodeType.RISK_CODE_NULL_OR_NOT_FOUND)
    }
  }
}