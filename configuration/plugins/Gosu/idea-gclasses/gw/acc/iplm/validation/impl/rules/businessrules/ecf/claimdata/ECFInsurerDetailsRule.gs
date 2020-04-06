package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule

class ECFInsurerDetailsRule implements LMMessageLogicValidationRule<ECFMessageClaimData_Ext> {
  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * It validates that insurer details exist in the contract market.
   *
   * @param message the ECFMessageClaimData_Ext to check against
   * @throws IllegalArgumentException If Insurer details not found in Contract Market
   */
  override function validate(message: ECFMessageClaimData_Ext) {
    var insurerPartyId = message.ReceiverPartyId
    var insurerBureau = message.ReceiverPartyAgency
    var contractMarket = message.ECFContractMarkets
    var foundInsurer = false

    try {
      contractMarket.each(\market -> {
        var id = market.PartyID
        var currentMarketBureau = market.Bureau?.Code
        if (currentMarketBureau == insurerBureau and id == insurerPartyId) {
          foundInsurer = true
        }
      })

      if (not foundInsurer) {
        throw new ECFException(ECFErrorCodeType.CLAIM_NOTIFY_INSURER_DETAILS_NOT_FOUND_ERROR, {insurerPartyId, insurerBureau})
      }
    } catch (e: Exception) {
      LOGGER.debug("Claim Data Message validation failed", e)
      throw e
    }
  }
}