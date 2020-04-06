package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.api.database.Query

/**
 * Class for mapping message data to ECFTransactionState_Ext entity
 */
class ClaimDataTransactionCreator {

  private static var DEFAULT_TRANSACTION_SEQUENCE_NUMBER = "001"

  /**
   * Looks up database for an existing ECFTransactionState_Ext for this UCR/TR/Receiver combo and if none exists, creates one.
   *
   * @param claimData - The ECFMessageClaimData_Ext entity to map from
   */
  public static function createTransactionState(claimData: ECFMessageClaimData_Ext) {
    claimData.ECFTransactionState = getTransactionState(claimData)
  }

  private static function getTransactionState(claimData: ECFMessageClaimData_Ext): ECFTransactionState_Ext {
    return Query.make(ECFTransactionState_Ext)
        .compare(ECFTransactionState_Ext#UCR, Equals, claimData.UCR)
        .compare(ECFTransactionState_Ext#TR, Equals, claimData.TR)
        .compare(ECFTransactionState_Ext#ReceiverId, Equals, claimData.ReceiverPartyId)
        .select().AtMostOneRow?:newTransactionState(claimData)
  }

  private static function newTransactionState(claimData: ECFMessageClaimData_Ext): ECFTransactionState_Ext {
    var transactionState = new ECFTransactionState_Ext()
    transactionState.Agreed = false
    transactionState.TR = claimData.TR
    transactionState.UCR = claimData.UCR
    transactionState.ReceiverId = claimData.ReceiverPartyId
    transactionState.TransactionSequence = Integer.parseInt(claimData.TransactionSequence?:DEFAULT_TRANSACTION_SEQUENCE_NUMBER)
    return transactionState
  }
}