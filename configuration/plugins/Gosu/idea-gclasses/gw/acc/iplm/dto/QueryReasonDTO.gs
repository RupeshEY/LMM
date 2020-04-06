package gw.acc.iplm.dto

/**
 * To be used as part of ECFClaimResponsePanelSet.LloydsSAP PCF ListView.
 * This file will work as a workaround for the ListView limitation where it's not possible to use the iterator
 * itself to present data in a ListView. It has to be a property of an object.
 */
class QueryReasonDTO {

  public var _reason: ECFQueryReason_Ext as Reason

  construct () {}

  construct(reason: ECFQueryReason_Ext){
    _reason = reason
  }
}