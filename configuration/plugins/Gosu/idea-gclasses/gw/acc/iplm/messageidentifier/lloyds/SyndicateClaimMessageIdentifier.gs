package gw.acc.iplm.messageidentifier.lloyds

uses gw.acc.iplm.messageidentifier.BaseMessageIdentifier
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.xml.XmlElement
uses org.apache.commons.lang3.StringUtils

class SyndicateClaimMessageIdentifier extends BaseMessageIdentifier {

  override function messageType(): LMMessageTypeString_Ext {
    return LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT
  }

  override function canHandle(element: XmlElement): Boolean {
    var parsedMessage : Jv_Ins_Reinsurance

    try {
      parsedMessage = Jv_Ins_Reinsurance.parse(element.asUTFString())
    } catch (e: Exception) {
      return false
    }

    // This field - ClaimMovement.Claim.ServiceProviderReference - Uniquely identifies an SCM message (only for SCM and is mandatory)
    return StringUtils.isNotEmpty(parsedMessage?.ClaimMovement?.Claim?.ServiceProviderReference)
  }
}