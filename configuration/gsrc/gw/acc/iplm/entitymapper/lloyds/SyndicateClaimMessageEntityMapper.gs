package gw.acc.iplm.entitymapper.lloyds

uses entity.LMMessage_Ext
uses gw.acc.iplm.dto.LMMessageDTO
uses gw.acc.iplm.entitymapper.LMMessageBaseEntityMapper
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.utils.ECFUtils
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.api.database.Query
uses gw.api.database.Relop
uses gw.pl.currency.MonetaryAmount
uses gw.xml.XmlElement
uses org.apache.commons.lang3.StringUtils

/**
 * Creates a new message entity from an SCM message payload.
 */
class SyndicateClaimMessageEntityMapper extends LMMessageBaseEntityMapper {


  override function isCorrectMessageType(message: XmlElement): boolean {
    var parsedMessage = Jv_Ins_Reinsurance.parse(message.asUTFString())

    // This field - ClaimMovement.Claim.ServiceProviderReference - Uniquely identifies an SCM message (only for SCM and is mandatory)
    return StringUtils.isNotEmpty(parsedMessage?.ClaimMovement?.Claim?.ServiceProviderReference)
  }

  override function createNewLMMessage(lmMessageDTO: LMMessageDTO): LMMessage_Ext {
    if (not isCorrectMessageType(lmMessageDTO.XMLPayLoad)) {
      return null
    }

    final var parsedSCMMessage = Jv_Ins_Reinsurance.parse(lmMessageDTO.XMLPayLoad.asUTFString())

    var lmMessage = new LMMessageLloydsSCM_Ext()
    lmMessage = mapCommonFields(lmMessage, parsedSCMMessage) as LMMessageLloydsSCM_Ext
    lmMessage = mapCreationDate(lmMessage, parsedSCMMessage)
    lmMessage = mapPolicy(lmMessage, parsedSCMMessage)
    lmMessage = mapLossFields(lmMessage, parsedSCMMessage)
    lmMessage = mapOCRFields(lmMessage, parsedSCMMessage)
    lmMessage = mapBureauLeadingInsurerOrReinsurerComments(lmMessage, parsedSCMMessage)
    lmMessage = mapContactInformation(lmMessage, parsedSCMMessage)
    lmMessage = mapRiskCode(lmMessage, parsedSCMMessage)
    lmMessage = mapFinancials(lmMessage, parsedSCMMessage)
    lmMessage = mapCurrencies(lmMessage, parsedSCMMessage)
    lmMessage = mapSyndicate(lmMessage, parsedSCMMessage)
    lmMessage = mapNarrative(lmMessage, parsedSCMMessage)
    lmMessage = mapReceiverShare(lmMessage, parsedSCMMessage)

    return lmMessage
  }

  /**
   * Maps the creation date from the XML Content to the message entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  public static function mapCreationDate(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.CreationDate = xmlContent.CreationDate
    return message
  }

  /**
   * Maps the Syndicate fields from the XML Content to the message entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  public static function mapSyndicate(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.SyndicateLineNumber = xmlContent.SyndicateLineNumber
    return message
  }

  /**
   * Maps the policy information from the XML Content to the message entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  private function mapPolicy(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.PolicyNumber = xmlContent.PolicyNumber
    return message
  }

  /**
   * Maps the loss fields the XML Content to the message
   * entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  private function mapLossFields(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.LossStartDate = ECFUtils.parseFlexibleDateType(xmlContent.LossStartDate)
    message.LossEndDate = ECFUtils.parseFlexibleDateType(xmlContent.LossEndDate)
    message.LossDescription = xmlContent.LossDescription
    message.LossLocation = xmlContent.LossLocation
    return message
  }

  /**
   * Maps the Originating Claim Office Reference and Message Sequence from the XML Content to the message entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  private function mapOCRFields(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.OCR = xmlContent.OCR
    message.MovementReferenceSequence = xmlContent.MovementReferenceSequence

    try {
      message.MessageSequence = xmlContent.MessageSequence
    } catch (e: LMException) {
      LOGGER.info("Couldn't assign a Message Sequence to the message")
    }

    return message
  }

  /**
   * Maps the BureauLeadingInsurerOrReinsurerComments from the XML Content to the message entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  private function mapBureauLeadingInsurerOrReinsurerComments(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.BureauLeadingInsurerComments = xmlContent.BureauLeadingInsurerOrReinsurersComments
    return message
  }

  /**
   * Maps the contact information from the XML content to the message
   * entity.
   *
   * @param message
   * @param xmlContent
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  private function mapContactInformation(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    var scmContacts = new SCMMessageClaimDataContacts_Ext()
    scmContacts.BrokerPartyId = xmlContent.BrokerPartyId
    scmContacts.BrokerPartyName = xmlContent.BrokerPartyName
    scmContacts.BrokerPartyAgency = xmlContent.BrokerPartyAgency
    scmContacts.BrokerContactName = xmlContent.BrokerContactName
    scmContacts.BrokerContactTelephone = xmlContent.BrokerContactPhone
    scmContacts.BrokerContactDescription = xmlContent.BrokerContactDescription
    scmContacts.InsurerId = xmlContent.InsurerPartyId
    scmContacts.InsurerName = xmlContent.InsurerPartyName
    scmContacts.InsurerAgency = xmlContent.InsurerPartyAgency
    scmContacts.ReinsurerId = xmlContent.ReinsurerPartyId
    scmContacts.ReinsurerName = xmlContent.ReinsurerPartyName
    scmContacts.ReinsurerAgency = xmlContent.ReinsurerPartyAgency
    scmContacts.ServiceProviderId = xmlContent.ServiceProviderPartyId
    scmContacts.ServiceProviderName = xmlContent.ServiceProviderPartyName
    scmContacts.ServiceProviderAgency = xmlContent.ServiceProviderPartyAgency
    scmContacts.ServiceProviderDescription = xmlContent.ServiceProviderContactDescription
    scmContacts.ClaimAgreementPartyId = xmlContent.ClaimAgreementPartyId
    scmContacts.ClaimAgreementPartyAgency = xmlContent.ClaimAgreementPartyAgency
    scmContacts.ClaimAgreementParticipant = xmlContent.ClaimAgreementParticipantFunction
    scmContacts.CoverHolderName = xmlContent.CoverHolderName
    scmContacts.InsuredName = xmlContent.InsuredName
    scmContacts.BureauLeadingInsurerId = xmlContent.BureauLeadingInsurerOrReinsurerPartyId
    scmContacts.BureauLeadingInsurerName = xmlContent.BureauLeadingInsurerOrReinsurerPartyName
    scmContacts.BureauLeadingInsurerAgency = xmlContent.BureauLeadingInsurerOrReinsurerPartyAgency
    message.ContactData = scmContacts
    return message
  }

  /**
   * Maps the risk code from the XML message to the message
   *
   * @param message    the message to map the risk code to
   * @param xmlContent the xml to map the risk code from
   * @return message the message passed as argument with a mapped risk code added
   */
  public static function mapRiskCode(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.SCMRiskCode = getRiskCodeByString(xmlContent.RiskCode)
    return message
  }

  /**
   * Returns the SCMRiskCode_Ext entity matching the given code
   *
   * @param : code, the string value of the RiskCode
   * @return : the SCMRiskCode_ext entity matching the code (or null if no match)
   */
  public static function getRiskCodeByString(code: String): SCMRiskCode_Ext {
    var riskCode = Query.make(SCMRiskCode_Ext).compare(SCMRiskCode_Ext#Code, Relop.Equals, code).select().AtMostOneRow
    return riskCode
  }

  /**
   * Maps the financials from the XML message to the message entity
   * @param message
   * @param xmlContent
   * @return
   */
  public static function mapFinancials(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.PaidThisTimeIndemnity = xmlContent.PaidThisTimeIndemnity
    message.PaidThisTimeFees = xmlContent.PaidThisTimeFees
    message.PaidToDateIndemnity = xmlContent.PaidToDateIndemnity
    message.PaidToDateFees = xmlContent.PaidToDateFees
    message.OutstandingIndemnity = xmlContent.OutstandingIndemnity
    message.OutstandingFees = xmlContent.OutstandingFees
    return message
  }
  
  /**
   * Maps the Original and Settlement currencies from the XML content to the message entity.
   *
   * @param message Message Entity
   * @param xmlContent Xml Content
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  public static function mapCurrencies(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.OriginalCurrency = Currency.get(xmlContent.OriginalCurrency)
    message.SettlementCurrency = Currency.get(xmlContent.SettlementCurrency)
    return message
  }

  /**
   * Maps the Narrative field from the XML to the entity
   *
   * @param message Message Entity
   * @param xmlContent Xml Content
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  public static function mapNarrative(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.Narrative = xmlContent.Narrative
    return message
  }


  /**
   * Maps the Receiver Share field from the XML to the entity
   *
   * @param message Message Entity
   * @param xmlContent Xml Content
   * @return {@link entity.LMMessageLloydsSCM_Ext}
   */
  public static function mapReceiverShare(message: LMMessageLloydsSCM_Ext, xmlContent: Jv_Ins_Reinsurance): LMMessageLloydsSCM_Ext {
    message.ReceiverShare = xmlContent.ReceiverShare
    return message
  }
}