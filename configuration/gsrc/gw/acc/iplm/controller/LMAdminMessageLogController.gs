package gw.acc.iplm.controller

uses entity.LMMessage_Ext

class LMAdminMessageLogController {

  static public var MESSAGE_DETAILS_MODE_RESPONSE_REJECTED : String = "responserejected"
  static public var MESSAGE_DETAILS_MODE_RESPONSE_SUPERSEDED : String = "responsesuperseded"
  static public var MESSAGE_DETAILS_MODE_FINANCIAL_AUTHORISATION : String = "financialauthorisation"
  static public var MESSAGE_DETAILS_MODE_DEFAULT : String = "default"

  /**
   * Selects the appropriate Mode for the PCFs in the Message Details
   *
   * @param message Selected Message for the Message Details
   * @return Mode
   */
  static function messageDetailsMode(message : LMMessage_Ext) : String {
    if (message typeis ECFMessageClaimResponseRq_Ext) {
      switch (message.Status) {
        case TC_REJECTED:
          return MESSAGE_DETAILS_MODE_RESPONSE_REJECTED
        case TC_SUPERSEDED:
          return MESSAGE_DETAILS_MODE_RESPONSE_SUPERSEDED
        case TC_FINANCIALAUTHORISATION:
          return MESSAGE_DETAILS_MODE_FINANCIAL_AUTHORISATION
      }
    }
    return MESSAGE_DETAILS_MODE_DEFAULT
  }
}