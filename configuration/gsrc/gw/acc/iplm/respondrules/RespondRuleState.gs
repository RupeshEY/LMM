package gw.acc.iplm.respondrules

uses gw.acc.iplm.utils.ECFConstants

/**
 * This Class is the basic class for different rules implementation.
 * Those rules will be used to evaluate ECF messages respondable state.
 */

abstract class RespondRuleState<T extends ECFMessageClaimData_Ext> {

  /**
   * This method will evaluate Lloyds message respond-able state using the message data.
   * It have many implementations to reflect the different evaluation conditions which the
   * message must meet to allow user to respond to this message
   * it will return true if the Transaction state updated and false otherwise.
   *
   * @param ecfMessage T
   * @return boolean
   */
  abstract function updateTansactionState(ecfMessage: T): boolean

  /**
   * Update TransactionState for the message.
   * The transaction state entity is used to indicate if user should be allowed to respond to this message
   *
   * @param ecfMessage T
   * @param respondable    boolean
   */
  public function updateTransactionStateRespondableState(ecfMessage: T, respondable: boolean) {
    updateTransactionStateRespondableState(ecfMessage, respondable, ecfMessage.ECFTransactionState?.Agreed)
  }

  /**
   * Update TransactionState for the message.
   * The transaction state entity is used to indicate if user should be allowed to respond to this message
   *
   * @param ecfMessage T
   * @param respondable    boolean to indicate that user should be able to respond to this message
   * @param agreed    boolean to indicate if the receiver of this message is now 'agreed' to the Claim
   */
  public function updateTransactionStateRespondableState(ecfMessage: T, respondable: boolean, agreed: boolean) {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      ecfMessage = bundle.add(ecfMessage)
      ecfMessage.ECFTransactionState = bundle.add(ecfMessage.ECFTransactionState)
      ecfMessage.ECFTransactionState.UUID = respondable ? ecfMessage.UUID : null
      ecfMessage.ECFTransactionState.Agreed = agreed
    }, ECFConstants.ECF_SUPER_USER)
  }
}