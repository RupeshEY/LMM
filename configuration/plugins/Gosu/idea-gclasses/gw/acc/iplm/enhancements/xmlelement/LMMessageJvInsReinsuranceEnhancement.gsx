package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.LMFinancialConstants
uses gw.acc.iplm.utils.LMSequenceUtil
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Party
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Receiver
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.enums.ClaimMovementType_Sender
uses gw.pl.currency.MonetaryAmount
uses org.apache.commons.lang3.StringUtils

uses java.math.BigDecimal

enhancement LMMessageJvInsReinsuranceEnhancement: Jv_Ins_Reinsurance {


  /**
   * Gets the ClaimMovement.UUId value
   *
   * @return String - UUID
   */
  property get UUID(): String {
    return this.ClaimMovement.UUId
  }

  /**
   * Gets the ClaimMovement.Claim.BrokerReference value
   *
   * @return String - UCR
   */
  property get UCR(): String {
    return this.ClaimMovement.Claim.BrokerReference
  }

  /**
   * Gets the ClaimMovement.Contract.BrokerReference value
   *
   * @return String - UMR
   */
  property get UMR(): String {
    return this.ClaimMovement.Contract.BrokerReference
  }

  /**
   * Returns the Origin Timestamp of the message
   *
   * @return {@link Date} - OriginTimestamp
   */
  property get OriginTimestamp(): Date {
    // NOTE: This field is being populated with the CreationDate. This results from the fact the Origin Timestamp
    // is a required field on the entity and no other XML fields provide a timestamp directly.
    return this.CreationDate
  }

  /**
   * Returns the Message Creation Date
   *
   * @return {@link Date} - Creation Date
   */
  property get CreationDate(): Date {
    return ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY.get().parse(this.ClaimMovement.CreationDate)
  }

  /**
   * Gets the ClaimMovement.Receiver.Value
   *
   * @return String - Receiver
   */
  property get ReceiverPartyRoleCd(): String {
    return this.ClaimMovement.Receiver.Value
  }

  /**
   * Gets the ClaimMovement.Sender.Value
   *
   * @return String - Sender
   */
  property get SenderPartyRoleCd(): String {
    return this.ClaimMovement.Sender.Value
  }

  /**
   * Gets the correct Sender XML element based on the Sender that was sent on the message
   *
   * @return Party - Sender Element
   */
  property get SenderElement(): Party {

    final var createPartyFromSender = new HashMap<String, Party>(){
        ClaimMovementType_Sender.Broker.Value->this.ClaimMovement.Broker?.Party,
        ClaimMovementType_Sender.Reinsurer.Value->this.ClaimMovement.Reinsurer?.Party,
        ClaimMovementType_Sender.Insurer.Value->this.ClaimMovement.Insurer?.Party,
        ClaimMovementType_Sender.Serviceprovider.Value->this.ClaimMovement.ServiceProvider?.Party,
        ClaimMovementType_Sender.Cedent.Value->this.ClaimMovement.ServiceProvider?.Party
    }

    return createPartyFromSender.get(this.SenderPartyRoleCd)
  }

  /**
   * Gets the correct Receiver XML element based on the Receiver that was sent on the message
   *
   * @return Party - Receiver Element
   */
  property get ReceiverElement(): Party {

    final var createPartyFromReceiver = new HashMap<String, Party>(){
        ClaimMovementType_Receiver.Broker.Value->this.ClaimMovement.Broker?.Party,
        ClaimMovementType_Receiver.Reinsurer.Value->this.ClaimMovement.Reinsurer?.Party,
        ClaimMovementType_Receiver.Insurer.Value->this.ClaimMovement.Insurer?.Party,
        ClaimMovementType_Receiver.Serviceprovider.Value->this.ClaimMovement.ServiceProvider?.Party
    }

    return createPartyFromReceiver.get(this.ReceiverPartyRoleCd)
  }

  /**
   * Gets the Policy Number that was sent on the message. If the Claim.ReinsurerReference is filled, used that, otherwise use Claim.InsurerReference.
   *
   * @return String - Policy Number
   */
  property get PolicyNumber(): String {
    var policyReferences = {this.ClaimMovement.Claim.ReinsurerReference, this.ClaimMovement.Claim.InsurerReference}
    var firstReference = policyReferences.firstWhere(\elt -> StringUtils.isNotBlank(elt))?.trim()

    return StringUtils.substringBefore(firstReference, ECFConstants.LM_MESSAGE_POLICY_NUMBER_SEPARATOR)?:firstReference
  }

  /**
   * Gets the Loss Location that was sent on the message.
   *
   * @return String - Loss Location
   */
  property get LossLocation(): String {
    return this.ClaimMovement.Claim.LossLocation?.Location?.Description
  }

  /**
   * Gets the Loss Description
   *
   * @return String - Loss Description
   */
  property get LossDescription(): String {
    return this.ClaimMovement.LossDescription
  }

  /**
   * Gets the Loss Start Date
   *
   * @return String - Loss Start Date
   */
  property get LossStartDate(): String {
    return this.ClaimMovement.Claim.LossPeriod?.StartDate
  }

  /**
   * Gets the Loss End Date
   *
   * @return String - Loss End Date
   */
  property get LossEndDate(): String {
    return this.ClaimMovement.Claim.LossPeriod?.EndDate
  }

  /**
   * Gets Message Explanation
   *
   * @return String - Explanation
   */
  property get Explanation(): String {
    return this.ClaimMovement.Explanation
  }

  /**
   * Gets OCR - Originating Claim Office Reference
   *
   * @return String - Explanation
   */
  property get OCR(): String {
    return this.ClaimMovement.ClaimEntry.ServiceProviderReference
  }

  /**
   * Gets the First Party Id for Broker
   *
   * @return String - Broker party id
   */
  property get BrokerPartyId(): String {
    return this.ClaimMovement.Broker.Party.FirstId
  }

  /**
   * Gets the Party Name for Broker
   *
   * @return String - Broker party name
   */
  property get BrokerPartyName(): String {
    return this.ClaimMovement.Broker.Party.Name
  }

  /**
   * Gets the First Party Agency for Broker
   *
   * @return String - Broker party agency
   */
  property get BrokerPartyAgency(): String {
    return this.ClaimMovement.Broker.Party.FirstAgency
  }

  /**
   * Gets the Contact's Person Name for Broker
   *
   * @return String - Broker contact name
   */
  property get BrokerContactName(): String {
    return this.ClaimMovement.Broker.Contact?.PersonName
  }

  /**
   * Gets the Contact's Person Telephone for Broker
   *
   * @return String - Broker contact phone
   */
  property get BrokerContactPhone(): String {
    return this.ClaimMovement.Broker.Contact?.Telephone
  }

  /**
   * Gets the Contact's Description for Broker
   *
   * @return String - Broker contact description
   */
  property get BrokerContactDescription(): String {
    return this.ClaimMovement.Broker.Contact?.Description
  }

  /**
   * Gets the First Party Id for Insurer
   *
   * @return String - Insurer party id
   */
  property get InsurerPartyId(): String {
    return this.ClaimMovement.Insurer?.Party?.FirstId
  }

  /**
   * Gets the Party Name for Insurer
   *
   * @return String - Insurer party name
   */
  property get InsurerPartyName(): String {
    return this.ClaimMovement.Insurer?.Party?.Name
  }

  /**
   * Gets the First Party Agency for Insurer
   *
   * @return String - Insurer party agency
   */
  property get InsurerPartyAgency(): String {
    return this.ClaimMovement.Insurer?.Party?.FirstAgency
  }

  /**
   * Gets the First Party Id for Reinsurer
   *
   * @return String - Reinsurer party id
   */
  property get ReinsurerPartyId(): String {
    return this.ClaimMovement.Reinsurer?.Party?.FirstId
  }

  /**
   * Gets the Party Name for Reinsurer
   *
   * @return String - Reinsurer party name
   */
  property get ReinsurerPartyName(): String {
    return this.ClaimMovement.Reinsurer?.Party?.Name
  }

  /**
   * Gets the First Party Agency for Reinsurer
   *
   * @return String - Reinsurer party agency
   */
  property get ReinsurerPartyAgency(): String {
    return this.ClaimMovement.Reinsurer?.Party?.FirstAgency
  }

  /**
   * Gets the First Party Id for Service Provider
   *
   * @return String - Service Provider party id
   */
  property get ServiceProviderPartyId(): String {
    return this.ClaimMovement.ServiceProvider.Party.FirstId
  }

  /**
   * Gets the Party Name for Service Provider
   *
   * @return String - Service Provider party name
   */
  property get ServiceProviderPartyName(): String {
    return this.ClaimMovement.ServiceProvider.Party.Name
  }

  /**
   * Gets the First Party Agency for Service Provider
   *
   * @return String - Service Provider party agency
   */
  property get ServiceProviderPartyAgency(): String {
    return this.ClaimMovement.ServiceProvider.Party.FirstAgency
  }

  /**
   * Gets the Contact's Description for Service Provider
   *
   * @return String - Service Provider contact description
   */
  property get ServiceProviderContactDescription(): String {
    return this.ClaimMovement.ServiceProvider.Contact?.Description
  }

  /**
   * Gets the First Claim Agreement Party Id
   *
   * @return String - Claim Agreement Party Id
   */
  property get ClaimAgreementPartyId(): String {
    return this.ClaimMovement.ClaimAgreementParty?.first()?.Party.FirstId
  }

  /**
   * Gets the First Claim Agreement Party Agency
   *
   * @return String - Claim agreement party agency
   */
  property get ClaimAgreementPartyAgency(): String {
    return this.ClaimMovement.ClaimAgreementParty?.first()?.Party.FirstAgency
  }

  /**
   * Gets the First Claim Agreement Participant Function
   *
   * @return String - Claim agreement party participant function
   */
  property get ClaimAgreementParticipantFunction(): String {
    return this.ClaimMovement.ClaimAgreementParty?.first()?.ParticipantFunction
  }

  /**
   * Gets the Cover Holder Name
   *
   * @return String - Cover Holder Name
   */
  property get CoverHolderName(): String {
    return this.ClaimMovement.CoverHolder?.Party?.Name
  }

  /**
   * Gets the Insured Name
   *
   * @return String - Insured Name
   */
  property get InsuredName(): String {
    return this.ClaimMovement.Insured?.Party?.Name
  }

  /**
   * Gets the First Party Id for BureauLeadingInsurerOrReinsurer
   *
   * @return String - BureauLeadingInsurerOrReinsurer party id
   */
  property get BureauLeadingInsurerOrReinsurerPartyId(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party?.FirstId
  }

  /**
   * Gets the Party Name for BureauLeadingInsurerOrReinsurer
   *
   * @return String - BureauLeadingInsurerOrReinsurer party name
   */
  property get BureauLeadingInsurerOrReinsurerPartyName(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party?.Name
  }

  /**
   * Gets the First BureauLeadingInsurerOrReinsurer Party Agency
   *
   * @return String - BureauLeadingInsurerOrReinsurer party agency
   */
  property get BureauLeadingInsurerOrReinsurerPartyAgency(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurer?.Party.FirstAgency
  }

  /**
   * Gets the BureauLeadingInsurerOrReinsurersComments
   *
   * @return String - BureauLeadingInsurerOrReinsurerComments
   */
  property get BureauLeadingInsurerOrReinsurersComments(): String {
    return this.ClaimMovement.BureauLeadingInsurerOrReinsurersComments
  }

  /**
   * Parses the message sequence code (e.g. AA, AB, etc...) and converts it to an Integer
   */
  property get MessageSequence(): Integer {
    return LMSequenceUtil.convert(this.MovementReferenceSequence)
  }

  /**
   * Returns the Movement Reference. The Movement Reference is formatted as:
   * <p>
   * XXMMYY
   * <p>
   * XX - Message Sequence. See MessageSequence
   * MM - Month
   * YY - Year
   */
  property get MovementReference(): String {
    return StringUtils.substringBefore(this.ClaimMovement?.ClaimEntry?.BrokerReference, "/")?.toUpperCase()
  }

  /**
   * Returns the Sequence part of the Movement Reference
   * @return Movement Reference Sequence
   */
  property get MovementReferenceSequence() : String {
    return this.MovementReference.substring(0, 2)
  }

  /**
   * Extracts the Risk code from the message extension
   *
   * @return the Risk Code as string
   */
  property get RiskCode(): String {
    var claimExtensions = this.ClaimMovement.Extension.$Children?.
        where(\child -> child.$QName.LocalPart == "Claim").
        flatMap(\claim -> claim.$Children.where(\claimChildElement -> claimChildElement.$QName['localPart'] == "Extension"))

    var riskCode = claimExtensions.flatMap(\claimExtension -> claimExtension.$Children.
        where(\elt -> elt.$QName.LocalPart == "RiskCode")).first().$Text
    return riskCode
  }

  /**
   * Returns the Syndicate Line Number of the Insurer in the message
   *
   * @return {@link String} - Syndicate Line Number
   */
  property get SyndicateLineNumber() : String {
    return StringUtils.substringAfter(this.ReceiverElement?.Name?.toLowerCase(), "line number: ").trim()
  }

  /**
   * Returns the Message Narrative
   *
   * @return {@link String} - Narrative
   */
  property get Narrative() : String {
    return this.ClaimMovement.Explanation.trim()
  }

  /**
   * Returns the Indemnity paid this time
   *
   * @return {@link MonetaryAmount} Indemnity paid this time
   */
  property get PaidThisTimeIndemnity(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.PAID_THIS_TIME_INDEMNITY)
  }

  /**
   * Returns the Fees paid this time
   *
   * @return {@link MonetaryAmount} Fees paid this time
   */
  property get PaidThisTimeFees(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.PAID_THIS_TIME_FEES)
  }

  /**
   * Returns the Indemnity paid to date
   *
   * @return {@link MonetaryAmount} Indemnity paid to date
   */
  property get PaidToDateIndemnity(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.PAID_TO_DATE_INDEMNITY)
  }

  /**
   * Returns the Fees paid to date
   *
   * @return {@link MonetaryAmount} Fees paid to date
   */
  property get PaidToDateFees(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.PAID_TO_DATE_FEES)
  }

  /**
   * Returns the Outstanding Indemnity
   *
   * @return {@link MonetaryAmount} Outstanding Indemnity
   */
  property get OutstandingIndemnity(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.OUTSTANDING_AMOUNT_INDEMNITY)
  }

  /**
   * Returns the Outstanding Fees
   *
   * @return {@link MonetaryAmount} Outstanding Fees
   */
  property get OutstandingFees(): MonetaryAmount {
    return getMonetaryAmountForFinancialType(LMFinancialConstants.OUTSTANDING_AMOUNT_FEES)
  }

  private function getMonetaryAmountForFinancialType(type: String): MonetaryAmount {
    final var amountTag = this.ClaimMovement.ClaimMovementAmtItem?.firstWhere(\amt -> amt.Type == type)
    final var currency = Currency.get(amountTag?.Amt_elem?.first()?.Ccy)
    final var amount = amountTag?.Amt?.first()

    if (currency == null or amount == null) {
      return null
    }

    return new MonetaryAmount(amount, currency)
  }

  /**
   * Gets the Original Currency from the message
   *
   * @return String - Original Currency
   */
  property get OriginalCurrency(): String {
    return this.ClaimMovement.ContractReferenceCurrency?.Ccy
  }

  /**
   * Gets the Settlement Currency from the message
   *
   * @return String - Settlement Currency
   */
  property get SettlementCurrency(): String {
    return this.ClaimMovement.Extension?.$Children?.firstWhere(\elt -> elt.$QName.LocalPart == gw.acc.iplm.xsd.londonmarket.acord4all.SettlementCurrency.$QNAME.LocalPart)?.$Text
  }

  /**
   * Returns the Insurer or Reinsurer Share (depending on which is the receiver) in this Claim.
   * @return {@link Integer} - Receiver Share
   */
  property get ReceiverShare(): BigDecimal {
    final var createShareFromSender = new HashMap<String, BigDecimal>() {
        ClaimMovementType_Sender.Reinsurer.Value -> this.ClaimMovement?.ContractSection?.ReinsurerSharePercentage?.Rate,
        ClaimMovementType_Sender.Insurer.Value -> this.ClaimMovement?.ContractSection?.InsurerSharePercentage?.Rate
    }

    return createShareFromSender.get(this.ReceiverPartyRoleCd)

  }
}
