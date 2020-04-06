package gw.acc.iplm.services.suspensequeue

uses gw.acc.iplm.utils.ECFConstants

class LMSuspenseQueueService extends SuspenseQueueService<LMMessageLloydsSCM_Ext> {

  /**
   * Handle the assignment of a suspended message to a user
   *
   * @param message Suspended message
   * @return Suspended message with assigned user
   */
  override function assignMessage(message: LMMessageLloydsSCM_Ext): LMMessageLloydsSCM_Ext {
    var isAssignmentFound = message.autoAssign()
    LOGGER.debug("LM Message ${message.UUID} assignment found: ${isAssignmentFound}")

    message = message.refresh() as LMMessageLloydsSCM_Ext
    return message
  }

  /**
   * Processes a Suspended Message against a particular policy.
   * Returns null if any of the arguments are null.
   *
   * @param message Suspended Message
   * @param selectedPolicyNumber Selected Policy Number
   * @return The processed ClaimNotify message list.
   */
  override function applyMessageToPolicy(message: LMMessageLloydsSCM_Ext, selectedPolicyNumber: String) : List<LMMessageLloydsSCM_Ext> {
    if (message == null or selectedPolicyNumber == null) {
      return null
    }

    message = changePolicyNumberOnMessageEntity(message, selectedPolicyNumber)
    return unsuspendMessages({message})
  }

  /**
   * Changes PolicyNumber property on the Message entity to supplied PolicyNumber.
   *
   * @param message Suspended Message
   * @param selectedPolicyNumber Selected Policy Number
   * @return The modified Suspended Message entity.
   */
  private function changePolicyNumberOnMessageEntity(message: LMMessageLloydsSCM_Ext, selectedPolicyNumber: String): LMMessageLloydsSCM_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.PolicyNumber = selectedPolicyNumber
    }, ECFConstants.ECF_SUPER_USER)

    return message
  }

  /**
   * Processes a list of Suspended Messages against a particular claim.
   * ! Not implemented !
   *
   * @param message Suspended Message
   * @param selectedUCR Selected UCR
   * @return The processed list of messages.
   */
  override function applyMessageToClaim(message: LMMessageLloydsSCM_Ext, selectedUCR: String): List<LMMessageLloydsSCM_Ext> {
    throw new UnsupportedOperationException("Method not implemented")
  }
}