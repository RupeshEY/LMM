package gw.acc.iplm.entitymapper.ecfwb.claimresponse

uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFIndicatorEnum
uses gw.pl.currency.MonetaryAmount
uses gw.pl.persistence.core.Bundle

class ClaimResponseRqEntityMapper {

  /**
   * Creates a {@link entity.ECFMessageClaimResponseRq_Ext} entity that contains unchanging data
   * from the message being responded to, and is ready for the user's
   * customisation.
   *
   * @param {@link entity.ECFMessageClaimData_Ext} ecfClaimDataMessage
   * @param {@link gw.pl.persistence.core.Bundle} bundle
   * @return {@link entity.ECFMessageClaimResponseRq_Ext}
   */
  public static function createClaimResponseRqEntity(ecfClaimDataMessage: ECFMessageClaimData_Ext, bundle: Bundle): ECFMessageClaimResponseRq_Ext {
    var claimResponseRq = new ECFMessageClaimResponseRq_Ext(bundle)

    claimResponseRq.OriginTimeStamp = Date.Now

    claimResponseRq.UUID = UUID.randomUUID().toString()

    claimResponseRq.UMR = ecfClaimDataMessage.UMR
    claimResponseRq.UCR = ecfClaimDataMessage.UCR
    claimResponseRq.TR = ecfClaimDataMessage.TR

    claimResponseRq.ReferredUUID = ecfClaimDataMessage.UUID
    claimResponseRq.MessageType = ECFMessageType_Ext.TC_CLAIMRESPOND
    claimResponseRq.Claim = ecfClaimDataMessage.Claim

    claimResponseRq.SenderPartyId = ecfClaimDataMessage.ReceiverPartyId
    claimResponseRq.SenderPartyAgency = ecfClaimDataMessage.ReceiverPartyAgency
    claimResponseRq.SenderPartyName = ecfClaimDataMessage.ReceiverPartyName

    claimResponseRq.ReceiverPartyId = ecfClaimDataMessage.SenderPartyId
    claimResponseRq.ReceiverPartyAgency = ecfClaimDataMessage.SenderPartyAgency
    claimResponseRq.ReceiverPartyName = ecfClaimDataMessage.SenderPartyName

    claimResponseRq.SenderPartyRoleCd = ecfClaimDataMessage.ReceiverPartyRoleCd
    claimResponseRq.ReceiverPartyRoleCd = ecfClaimDataMessage.SenderPartyRoleCd

    claimResponseRq.InsurerTransactionReference = ecfClaimDataMessage.Claim?.getLatestClaimResponseRqMessageForTR(ecfClaimDataMessage.TR)?.InsurerTransactionReference
    claimResponseRq.ParticipantFunction = ecfClaimDataMessage.Role
    claimResponseRq.AsOfDate = ecfClaimDataMessage.AsOfDate

    claimResponseRq.BureauType = ecfClaimDataMessage.BureauType
    claimResponseRq.ClaimLineNumber = ecfClaimDataMessage.ClaimLineNumber
    claimResponseRq.ClaimType = ecfClaimDataMessage.ClaimType
    claimResponseRq.ClaimsScheme = ecfClaimDataMessage.ClaimsScheme

    claimResponseRq = mapContactFields(claimResponseRq, User.util.CurrentUser)

    claimResponseRq.TransactionType = ecfClaimDataMessage.TransactionType
    claimResponseRq = generateClaimParticipantRoles(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = createLeadClaimEntryAmounts(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = mapNoFurtherResponse(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = mapMinorPrecautionaryIndicator(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = mapAllUnderwritersToSeeFileIndicator(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = mapContractConditionsApplyIndicator(claimResponseRq, ecfClaimDataMessage)
    claimResponseRq = mapClassOfBusiness(claimResponseRq, ecfClaimDataMessage)

    claimResponseRq = mapAdminLogData(claimResponseRq)

    return claimResponseRq
  }

  /**
   * Maps the admin log data such as message direction and category.
   *
   * @return {@link entity.ECFMessageClaimResponseRq_Ext} claimResponseRq
   * @return {@link entity.ECFMessageClaimResponseRq_Ext}
   */
  private static function mapAdminLogData(claimResponseRq : ECFMessageClaimResponseRq_Ext) : ECFMessageClaimResponseRq_Ext{
    claimResponseRq.MessageDirection = ECFMessageDirectionType_Ext.TC_OUTBOUND
    claimResponseRq.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMRESPONSE
    return claimResponseRq
  }

  /**
   * Maps the Contact fields on the Claim Response Rq entity with the details of a given user
   * @param claimResponseRq Initial Claim Response Rq entity
   * @param user User to get the details from
   * @return Resulting Claim Response Rq entity with the Contact Fields mapped
   */
  public static function mapContactFields(claimResponseRq: ECFMessageClaimResponseRq_Ext, user: User) : ECFMessageClaimResponseRq_Ext {
    claimResponseRq.ContactClassUserId = user.Credential.ClassUserId_Ext
    claimResponseRq.ContactClassAccountId = user.Credential.AccountCode_Ext
    claimResponseRq.ContactName = user.Contact.DisplayName
    claimResponseRq.ContactEmail = user.Contact.EmailAddress1 ?: user.Contact.EmailAddress2
    claimResponseRq.ContactTelephone = user.Contact.PrimaryPhoneValue ?: user.Contact.CellPhone

    return claimResponseRq
  }

  /**
   * Generates {@link entity.ECFClaimParticipantRole_Ext} entities for the provided
   * {@link entity.ECFMessageClaimResponseRq_Ext} representing the ContractMarket contacts
   * in the {@link entity.ECFMessageClaimData_Ext}.
   *
   * This allows for their roles to be modified in the outbound ClaimResponse request.
   *
   * @param {@link entity.ECFMessageClaimResponseRq_Ext} claimResponseRq
   * @param {@link entity.ECFMessageClaimData_Ext} ecfClaimData
   * @return {@link entity.ECFMessageClaimResponseRq_Ext}
   */
  private static function generateClaimParticipantRoles(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimData: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    var otherParticipants = ecfClaimData.ECFContractMarkets.where(\contractMarket -> contractMarket != ecfClaimData.ReceiverContractMarket)

    for (contractMarket in otherParticipants) {
      var newClaimPartRole = new ECFClaimParticipantRole_Ext()
      newClaimPartRole.PartyID = contractMarket.PartyID
      newClaimPartRole.PartyName = contractMarket.PartyName
      newClaimPartRole.BureauType = contractMarket.Bureau
      newClaimPartRole.NewParticipantFunction = contractMarket.ParticipantFunction
      newClaimPartRole.InitialParticipantFunction = contractMarket.ParticipantFunction
      claimResponseRq.addToClaimParticipantRoles(newClaimPartRole)
    }

    return claimResponseRq
  }

  /**
   * This method will create set the ClaimEntry Amounts on the
   * {@link entity.ECFMessageClaimResponseRq_Ext} for the Lead Roles.
   *
   * @return {@link entity.ECFMessageClaimResponseRq_Ext}
   */
  public static function createLeadClaimEntryAmounts(claimResponseRq: ECFMessageClaimResponseRq_Ext, _ecfClaimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    var financials = _ecfClaimDataMessage.FinancialsSortedByCurrency

    for (financial in financials index idx) {

      claimResponseRq.setFieldValue("Currency" + (idx + 1), financial.Currency)

      if (financial.SettlementAmount_cur != null) {
        claimResponseRq.setFieldValue("TargetCurrency" + (idx + 1), financial.Currency)
      }

      var bdZeroVal = 0bd.setScale(ECFConstants.DEFAULT_MONETARY_AMOUNT_SCALE)

      if (financial.SettlementVat_amt != null) {
        claimResponseRq.setFieldValue("VATAmount" + (idx + 1), financial.SettlementVat)
      } else {
        claimResponseRq.setFieldValue("VATAmount" + (idx + 1), new MonetaryAmount(bdZeroVal, financial.Currency))
      }

      if (_ecfClaimDataMessage.PrimaryParticipantLead and
          (_ecfClaimDataMessage.BureauType == TC_LLOYDS or _ecfClaimDataMessage.BureauType == TC_LIRMA)) {
        if (financial.LeadReserveAmount_amt != null) {
          claimResponseRq.setFieldValue("LeadReserveAmount" + (idx + 1), financial.LeadReserveAmount)
        } else {
          claimResponseRq.setFieldValue("LeadReserveAmount" + (idx + 1), new MonetaryAmount(bdZeroVal, financial.Currency))
        }
      }

      if (_ecfClaimDataMessage.PrimaryParticipantLead and
          _ecfClaimDataMessage.BureauType == TC_LLOYDS) {
        if (financial.LeadReserveFees_amt != null) {
          claimResponseRq.setFieldValue("LeadReserveFees" + (idx + 1), financial.LeadReserveFees)
        } else {
          claimResponseRq.setFieldValue("LeadReserveFees" + (idx + 1), new MonetaryAmount(bdZeroVal, financial.Currency))
        }
      } else {
        if (financial.ImportedServicesAmount_amt != null) {
          claimResponseRq.setFieldValue("ImportedServicesAmount" + (idx + 1), financial.ImportedServicesAmount)
        } else {
          claimResponseRq.setFieldValue("ImportedServicesAmount" + (idx + 1), new MonetaryAmount(bdZeroVal, financial.Currency))
        }
      }
    }

    return claimResponseRq
  }

  /**
   * Returns the value to populate NoFurtherResponseIndicator on the Claim Response entity based on the associated Claim Data message
   *
   * @param claimResponseRq Initial Claim Response Entity
   * @param ecfClaimDataMessage Claim Data message from which the value is going to be based on
   * @return {@link ECFMessageClaimResponseRq_Ext} Updated Claim Response Rq
   */
  internal static function mapNoFurtherResponse(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimDataMessage: ECFMessageClaimData_Ext) : ECFMessageClaimResponseRq_Ext {
    if (ecfClaimDataMessage.BureauType == ECFBureauType_Ext.TC_LIRMA) {
      claimResponseRq.NoFurtherResponseIndicator = ecfClaimDataMessage.NoFurtherResponseIndicator ?: ECFIndicatorEnum.N.IntegrationCode
    }
    return claimResponseRq
  }

  /**
   * Returns the value to populate MinorPrecautionaryIndicator on the Claim Response entity based on the associated Claim Data message
   *
   * @param claimResponseRq Initial Claim Response Entity
   * @param ecfClaimDataMessage Claim Data message from which the value is going to be based on
   * @return {@link ECFMessageClaimResponseRq_Ext} Updated Claim Response RqryIndicator
   */
  internal static function mapMinorPrecautionaryIndicator(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    if (ecfClaimDataMessage.Mode == TC_LIRMALEAD) {
      claimResponseRq.MinorPrecautionaryIndicator = ecfClaimDataMessage.CollectionUnlikelyIndicator ?: ECFIndicatorEnum.N.IntegrationCode
    }
    return claimResponseRq
  }

  /**
   * Returns the value to populate AllUnderwritersToSeeFileIndicator on the Claim Response entity based on the previous sent value
   *
   * @param claimResponseRq Initial Claim Response Entity
   * @param ecfClaimDataMessage Claim Data message from which the value is going to be based on
   * @return {@link ECFMessageClaimResponseRq_Ext} Updated Claim Response Rq
   */
  internal static function mapAllUnderwritersToSeeFileIndicator(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    if (ecfClaimDataMessage.LirmaLeadClaim) {
      claimResponseRq.AllUnderwritersToSeeFileInd = ecfClaimDataMessage.Claim?.getLatestClaimResponseRqMessageForTR(ecfClaimDataMessage.TR)?.AllUnderwritersToSeeFileInd ?: ECFIndicatorEnum.N.IntegrationCode
    }
    return claimResponseRq
  }

  /**
   * Returns the value to populate ContractConditionsApplyIndicator on the Claim Response entity based on the associated Claim Data message
   *
   * @param claimResponseRq Initial Claim Response Entity
   * @param ecfClaimDataMessage Claim Data message from which the value is going to be based on
   * @return {@link ECFMessageClaimResponseRq_Ext} Updated Claim Response Rq
   */
  internal static function mapContractConditionsApplyIndicator(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    if (ecfClaimDataMessage.Mode == TC_LIRMALEAD) {
      claimResponseRq.ContractConditionsApplyInd = ECFContractConditions_Ext.get(ecfClaimDataMessage.ContractualConditionsIndicator)
    }
    return claimResponseRq
  }

  /**
   * Returns the value to populate ClassOfBusiness on the Claim Response entity based on the associated Claim Data message
   *
   * @param claimResponseRq Initial Claim Response Entity
   * @param ecfClaimDataMessage Claim Data message from which the value is going to be based on
   * @return {@link ECFMessageClaimResponseRq_Ext} Updated Claim Response Rq
   */
  private static function mapClassOfBusiness(claimResponseRq: ECFMessageClaimResponseRq_Ext, ecfClaimDataMessage: ECFMessageClaimData_Ext): ECFMessageClaimResponseRq_Ext {
    var classOfBusinessRequired = ecfClaimDataMessage.ClaimType != ECFClaimTypeCode_Ext.TC_001

    if (classOfBusinessRequired and (ecfClaimDataMessage.Mode == TC_LIRMALEAD or ecfClaimDataMessage.Mode == TC_ILULEAD)) {
      claimResponseRq.ClassOfBusiness = ecfClaimDataMessage.ClassOfBusiness
    }
    return claimResponseRq
  }
}