package gw.acc.iplm.validation.impl.rules.businessrules.lm

uses gw.acc.iplm.config.LMCustomerConfigUtil
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.validation.api.rules.LMMessageLogicValidationRule
uses org.apache.commons.lang3.StringUtils

/**
 * Validates the Broker Number.
 *
 * If the Broker Number is either null or doesn't match the list of Lloyd's companies in the system
 * this message will be suspended
 */
class LMBrokerNumberRule implements LMMessageLogicValidationRule<LMMessageLloydsSCM_Ext> {
  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  override function validate(message: LMMessageLloydsSCM_Ext) {
    final var partyId = message.ContactData.BrokerPartyId
    final var agency = message.ContactData.BrokerPartyAgency

    final var brokerInformationIsMissing = {agency, partyId}.hasMatch(\elt -> StringUtils.isBlank(elt))
    final var brokerIsLloyds = LMCustomerConfigUtil.isLloydsMember(agency, ECFUtils.buildLongPartyID(agency, partyId))

    if (brokerInformationIsMissing or not brokerIsLloyds) {
      LOGGER.warn("No valid broker with ID '${message.ContactData.BrokerPartyId}' and Bureau '${message.ContactData.BrokerPartyAgency}' was found")
      throw new LMException(LMErrorCodeType.NO_BROKING_COMPANY_IDENTIFIED)
    }
  }
}