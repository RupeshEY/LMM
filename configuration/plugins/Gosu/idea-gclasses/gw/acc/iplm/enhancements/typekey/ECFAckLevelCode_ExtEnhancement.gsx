package gw.acc.iplm.enhancements.typekey

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType

enhancement ECFAckLevelCode_ExtEnhancement: ECFAckLevelCode_Ext {

  /**
   * Finds the correct ECFAckLevelCode_Ext element based on the Typekey name. Used to match Response Descriptions to Typekeys.
   * @param name
   * @return ECFAckLevelCode_Ext
   */
  public static function getByName(name: String) : ECFAckLevelCode_Ext {
    return ECFAckLevelCode_Ext.getTypeKeys(true).firstWhere(\elt -> elt.UnlocalizedName == name)?:ECFAckLevelCode_Ext.TC_UNKNOWN
  }

  /**
   * Maps a given ECFAckLevelCode_Ext Typekey to a ECFErrorCodeType
   * @return ECFErrorCodeType
   */
  property get ECFErrorCode() : ECFErrorCodeType {

    final var ackLevelToErrorCodeMapper: HashMap<ECFAckLevelCode_Ext, ECFErrorCodeType> = new HashMap<ECFAckLevelCode_Ext, ECFErrorCodeType>() {
        ECFAckLevelCode_Ext.TC_UNKNOWN               -> ECFErrorCodeType.CLAIM_RETRIEVE_UNKNOWN_DESCRIPTION,
        ECFAckLevelCode_Ext.TC_PARTIALRESPONSECLASS  -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_CLASS_UNAVAILABLE,
        ECFAckLevelCode_Ext.TC_PARTIALRESPONSEIMR    -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_IMR_UNAVAILABLE,
        ECFAckLevelCode_Ext.TC_UNAVAILABLE           -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_CENTRAL_SYSTEMS_UNAVAILABLE,
        ECFAckLevelCode_Ext.TC_REQUESTINVALID        -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_REQUEST_INVALID,
        ECFAckLevelCode_Ext.TC_SENDERINVALID         -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_SENDER_CLAIM_COMBINATION_INVALID,
        ECFAckLevelCode_Ext.TC_CLAIMNOTFOUND         -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_CLAIM_NOT_FOUND,
        ECFAckLevelCode_Ext.TC_NOTREGISTERED         -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_CARRIER_NOT_REGISTERED_TO_INVOKE_SERVICE,
        ECFAckLevelCode_Ext.TC_UNABLETORETRIEVECLAIM -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_UNABLE_TO_RETRIEVE_CLAIM_TRANSACTION,
        ECFAckLevelCode_Ext.TC_ORGCONFLICTED         -> ECFErrorCodeType.CLAIM_RETRIEVE_RESPONSE_ORGANISATION_IS_CONFLICTED
    }

    return ackLevelToErrorCodeMapper.get(this)
  }
}
