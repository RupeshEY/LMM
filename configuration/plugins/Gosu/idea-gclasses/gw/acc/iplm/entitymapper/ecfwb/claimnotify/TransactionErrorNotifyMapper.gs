package gw.acc.iplm.entitymapper.ecfwb.claimnotify

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataTransactionCreator
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ClaimDataWarningsAndErrorsCreator
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.api.database.Query
uses gw.api.database.Relop

uses java.math.BigDecimal

/**
 * This is a sub mapper of ClaimNotifyRqEntityMapper for the case where the message is a TransactionErrorNotify type
 */
class TransactionErrorNotifyMapper {

  /**
   * Map the information required for a TransactionErrorNotify
   *
   * @param message    ECFMessageClaimNotifyRq_Ext to map to
   * @param claimNotifyRq ClaimNotifyEventRq to map from
   */
  public static function mapTransactionErrorNotify(final message: ECFMessageClaimNotifyRq_Ext, header: Xchangingheader, claimNotifyRq: ClaimNotifyEventRq): ECFMessageClaimNotifyRq_Ext {
    message.MessageType = ECFMessageType_Ext.TC_TRANSACTIONERRORNOTIFY
    message.UUID = claimNotifyRq?.UUId
    message.OriginTimeStamp = claimNotifyRq?.OriginTimeStamp
    ClaimDataWarningsAndErrorsCreator.createClaimNotifyErrorsWarnings(message, claimNotifyRq)

    message.UCR = getExtendedFieldValue(claimNotifyRq, claimNotifyRq.UCR_FIELD_NAME)
    message.UMR = getExtendedFieldValue(claimNotifyRq, claimNotifyRq.UMR_FIELD_NAME)
    message.TR = getExtendedFieldValue(claimNotifyRq, claimNotifyRq.TR_FIELD_NAME)
    message.MessageSequence = new BigDecimal(getExtendedFieldValue(claimNotifyRq, claimNotifyRq.MESSAGE_SEQUENCE_NUMBER_FIELD_NAME))
    message.BureauType = getBureau(claimNotifyRq)
    message.TransactionStatus = getTransactionStatus(message.ErrorsOrWarnings.first())
    message.Role = getRole(message, header)
    message.ReceiverPartyId = header.Receiver.Party.Id
    ClaimDataTransactionCreator.createTransactionState(message)
    message.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
    message.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
    return message
  }

  private static function getBureau(claimNotifyRq: ClaimNotifyEventRq): ECFBureauType_Ext {
    var bureauCode = getExtendedFieldValue(claimNotifyRq, claimNotifyRq.BUREAU_FIELD_NAME)
    switch (bureauCode) {
      case ECFMessageConstants.LIRMA_CODE:
        return ECFBureauType_Ext.TC_LIRMA
      case ECFMessageConstants.LLOYDS_CODE:
        return ECFBureauType_Ext.TC_LLOYDS
      case ECFMessageConstants.ILU_CODE:
        return ECFBureauType_Ext.TC_ILU
      default:
        return null
    }
  }

  private static function getTransactionStatus(transactionError: ECFMessageErrorOrWarning_Ext): ECFTransactionStatus_Ext {
    var errorCode = transactionError.ErrorCode
    switch (errorCode) {
      case ECFMessageConstants.CLAIM_TRANSACTION_IS_DELETED:
        return ECFTransactionStatus_Ext.TC_DELETED
      case ECFMessageConstants.CLAIM_TRANSACTION_IN_ERROR:
        return ECFTransactionStatus_Ext.TC_3
      case ECFMessageConstants.CLAIM_TRANSACTION_IN_ERROR_DUE_TO_PREVIOUS_TRANSACTION_CHANGE:
        return ECFTransactionStatus_Ext.TC_4
      default:
        return null
    }
  }

  private static function getRole(message: ECFMessageClaimNotifyRq_Ext, header: Xchangingheader) : ECFParticipantFunction_Ext{
    var ucr = message.UCR
    var claim = Query.make(Claim).compare(Claim#UCR_Ext, Relop.Equals, ucr).select().AtMostOneRow
    var id = header.Receiver.Party.Id
    return getRoleFfromPreviousMessageForThisId(claim, id)?:getRoleFromContractMarket(claim, id)
  }

  private static function getRoleFfromPreviousMessageForThisId(claim: Claim, id: String): ECFParticipantFunction_Ext {
    var previousMessageWithRole = claim.LMMessages?.
        whereTypeIs(ECFMessageClaimData_Ext)?.
        where(\elt -> elt.Role != null)?.
        where(\elt -> elt.ReceiverPartyId == id)?.
        orderByDescending(\e -> e.CreateTime)?.first()
    return previousMessageWithRole.Role
  }

  private static function getRoleFromContractMarket(claim: Claim, id: String): ECFParticipantFunction_Ext {
    var previousMessageWithRole = claim.LMMessages?.
        whereTypeIs(ECFMessageClaimData_Ext)?.
        where(\elt -> elt.MessageType == ECFMessageType_Ext.TC_CLAIMNOTIFY or elt.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM)?.
        where(\elt -> elt.Role != null)?.
        orderByDescending(\e -> e.CreateTime)?.first()
    var contractMarketForId = previousMessageWithRole?.ECFContractMarkets?.firstWhere(\elt -> elt.PartyID == id)
    return contractMarketForId?.ParticipantFunction
  }

  private static function getExtendedFieldValue(claimNotifyRq: ClaimNotifyEventRq, fieldName: String): String {
    for (field in claimNotifyRq.AdditionalInformation.ExtendedFields) {
      if (field.FieldName.equals(fieldName)) {
        return field.FieldValue
      }
    }
    return null
  }
}