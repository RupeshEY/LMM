package gw.acc.iplm.services.suspensequeue

uses gw.acc.iplm.dao.ECFClaimNotifyRqMessageDAO
uses gw.acc.iplm.dto.SuspenseQueueClaimTransactionDTO
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.api.util.DisplayableException
uses gw.transaction.Transaction

/**
 * This Service is responsible for processing business functionality related to Suspense queue.
 */
class ECFSuspenseQueueService extends SuspenseQueueService<ECFMessageClaimData_Ext> {

  private var _claimNotifyRqMessageDao: ECFClaimNotifyRqMessageDAO

  construct() {
    this(new ECFClaimNotifyRqMessageDAO())
  }

  construct(claimNotifyRqMessageDao: ECFClaimNotifyRqMessageDAO) {
    _claimNotifyRqMessageDao = claimNotifyRqMessageDao
  }

  /**
   * Assigns a suspended message to a user
   *
   * @param ecfMessage suspended message
   */
  function assignMessage(ecfMessage: ECFMessageClaimData_Ext): ECFMessageClaimData_Ext {
    var userToAssignTo: User = null
    if (ecfMessage.Claim != null) {
      userToAssignTo = ecfMessage.Claim?.AssignedUser
    } else {
      userToAssignTo = handleMsgAssignmentWithoutClaim(ecfMessage)
    }
    ecfMessage.assignUserAndDefaultGroup(userToAssignTo)
    ecfMessage = ecfMessage.refresh() as ECFMessageClaimData_Ext
    LOGGER.debug("ECF Message ${ecfMessage.UUID} assigned to user ${ecfMessage.AssignedUser}")

    return ecfMessage
  }

  private function handleMsgAssignmentWithoutClaim(ecfMessage: ECFMessageClaimData_Ext): User {
    if (ecfMessage.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM) {
      return getClaimRetrieveRqSender(ecfMessage)
    }

    var userToAssignTo: User = null
    var suspendedMessage = findAllSuspendedMsgsForClaimTransaction(ecfMessage)?.first()
    if (suspendedMessage != null and suspendedMessage.AssignedUser != null) {
      userToAssignTo = getUserAlreadyAssignedToThisTransaction(suspendedMessage)
    } else {
      userToAssignTo = getDefaultAssignmentUser(ecfMessage)
    }
    return userToAssignTo
  }

  /**
   * Suspended RetrieveClaimRs can be assigned to whoever sent the RetrieveClaimRq
   */
  private function getClaimRetrieveRqSender(ecfMessage: ECFMessageClaimData_Ext): User {
    var claimRetrieveRs = ecfMessage as ECFMessageClaimRetrieveRs_Ext
    var referredUUid = claimRetrieveRs.ClaimRetrieveReqReferredUUId
    var claimRetrieveRq = ECFUtils.findMessageByUUID(referredUUid)
    return claimRetrieveRq.CreateUser
  }

  /**
   * Message can be assigned to whoever is already handling suspended messages on this transaction
   */
  private function getUserAlreadyAssignedToThisTransaction(suspendedMessage: ECFMessageClaimData_Ext): User {
    var userToAssignTo = suspendedMessage.AssignedUser
    LOGGER.debug("ECF Message with UCR: ${suspendedMessage.UCR},UMR: ${suspendedMessage.UMR}, TR: ${suspendedMessage.TR} details already exist in suspense queue for user: ${userToAssignTo}. So assiging this message to user: ${userToAssignTo}")
    return userToAssignTo
  }

  /**
   * Use default assignment rule for this message type
   */
  private function getDefaultAssignmentUser(ecfMessage: ECFMessageClaimData_Ext): User {
    var isAssignmentFound = ecfMessage.autoAssign()
    LOGGER.debug("ECF Message ${ecfMessage.UUID} assignement found: ${isAssignmentFound}")
    return ecfMessage.AssignedUser
  }

  /**
   * Processes a list of ClaimData messages against a particular policy.
   * Returns null if any of the arguments are null.
   *
   * @param claimDataMessage
   * @param selectedPolicyNumber
   * @return The processed ClaimData message list.
   */
  public function applyMessageToPolicy(claimDataMessage: ECFMessageClaimData_Ext, selectedPolicyNumber: String): List<ECFMessageClaimData_Ext> {
    if (claimDataMessage == null or selectedPolicyNumber == null) {
      return null
    }

    var allSuspendedMsgsForClaimTransaction = findAllSuspendedMsgsForClaimTransaction(claimDataMessage)
    var cnMessagesWithNewPolicy: List<ECFMessageClaimData_Ext> = new ArrayList<ECFMessageClaimData_Ext>()
    allSuspendedMsgsForClaimTransaction.each(\elt -> {
      LOGGER.debug("Applying policy number ${selectedPolicyNumber} to message with UUID ${elt.UUID}, UMR: ${elt.UMR}, UCR:${elt.UCR}, TR: ${elt.TR}")
      cnMessagesWithNewPolicy.add(changePolicyNumberOnMessageEntity(elt, selectedPolicyNumber))
    })
    return unsuspendMessages(cnMessagesWithNewPolicy)
  }

  /**
   * Processes a list of ClaimData messages against a particular claim.
   * Returns null if any of the arguments are null.
   *
   * @param claimDataMessage List
   * @param selectedUCR
   * @return The processed ClaimData message list.
   */
  public function applyMessageToClaim(claimDataMessage: ECFMessageClaimData_Ext, selectedUCR: String): List<ECFMessageClaimData_Ext> {
    if (claimDataMessage == null or selectedUCR == null) {
      return null
    }

    var allSuspendedMsgsForClaimTransaction = findAllSuspendedMsgsForClaimTransaction(claimDataMessage)
    var cnMessagesWithNewUCR: List<ECFMessageClaimData_Ext> = new ArrayList<ECFMessageClaimData_Ext>()
    allSuspendedMsgsForClaimTransaction.each(\elt -> {
      LOGGER.debug("Applying UCR ${selectedUCR} to message with UUID ${elt.UUID}, UMR: ${elt.UMR}, UCR:${elt.UCR}, TR: ${elt.TR}")
      cnMessagesWithNewUCR.add(changeUCROnMessageEntity(elt, selectedUCR))
    })
    return unsuspendMessages(cnMessagesWithNewUCR)
  }

  /**
   * Delete (Retire) selected ECFMessages. After deleting these messages verifies that
   * if there are any other messages in the same transaction as the deleted messages, they are reprocessed against ECF.
   *
   * @param transactionHashMap A unique claim transaction combination of (UMR, UCR, TR).
   * @return The unsuspended list of ClaimData messages.
   */
  public function unsuspendMessagesForClaimTransactions(transactionHashMap: HashMap<String, SuspenseQueueClaimTransactionDTO>): List<ECFMessageClaimData_Ext> {
    var ecfMessagesToReprocess = new ArrayList<ECFMessageClaimData_Ext>()
    transactionHashMap?.eachValue(\sqDTO -> {
      var list = _claimNotifyRqMessageDao.findAllSuspendedMsgsForClaimTransaction(sqDTO.UCR, sqDTO.UMR, sqDTO.TR)
      ecfMessagesToReprocess.addAll(list)
    })
    return unsuspendMessages(ecfMessagesToReprocess)
  }

  /**
   * This method validates that selected array of ECF Messages does not have the than one selected claim transactions.
   * Each unique claim transaction is a combination of (UMR, UCR, TR).
   * If HashMap size is more than 1, it throws ECF Exception.
   *
   * @param ecfMessages
   */
  public function validateBeforeDeleteAdditionalMessages(ecfMessages: ECFMessageClaimData_Ext[]) {
    if (createClaimTransactionHashMap(ecfMessages).size() > 1) {
      var error = ECFErrorCodeType.SUSPENSE_QUEUE_NOT_UNIQUE_CLAIM_TRANSACTION
      LOGGER.debug("Suspense queue error [${error.ErrorCode}]:${error.toString()}")
      throw new DisplayableException(error.toString())
    }
  }

  /**
   * This method create a HashMap for the Claim Transactions.
   * Each unique claim transaction is a combination of (UMR, UCR, TR).
   *
   * @param ecfMessages
   * @return
   */
  public function createClaimTransactionHashMap(ecfMessages: ECFMessageClaimData_Ext[]): HashMap<String, SuspenseQueueClaimTransactionDTO> {
    var transactionsHashMap = new HashMap<String, SuspenseQueueClaimTransactionDTO>()
    ecfMessages?.each(\ecfMessage ->
        {
          if (ecfMessage != null) {
            var key = createClaimTransactionUniqueKey(ecfMessage)
            transactionsHashMap.put(key, new SuspenseQueueClaimTransactionDTO(ecfMessage.UMR, ecfMessage.UCR, ecfMessage.TR))
          }
        })
    return transactionsHashMap
  }

  private function createClaimTransactionUniqueKey(ecfMessage: ECFMessageClaimData_Ext): String {
    var key = ecfMessage.UMR + ecfMessage.UCR + ecfMessage.TR
    LOGGER.debug("Creating Claim Transaction Key for Suspense Queue: ${key}")
    return key
  }

  /**
   * Changes PolicyNumber property on the ECFMessageClaimData_Ext entity to supplied PolicyNumber.
   *
   * @param claimDataMessage
   * @param selectedPolicyNumber
   * @return The modified ClaimData message entity.
   */
  private function changePolicyNumberOnMessageEntity(claimDataMessage: ECFMessageClaimData_Ext, selectedPolicyNumber: String): ECFMessageClaimData_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      claimDataMessage = bundle.add(claimDataMessage)
      claimDataMessage.PolicyNumber = selectedPolicyNumber
    }, ECFConstants.ECF_SUPER_USER)

    return claimDataMessage
  }

  /**
   * Changes PolicyNumber property on the ECFMessageClaimData_Ext entity to supplied PolicyNumber.
   *
   * @param claimDataMessage
   * @param selectedPolicyNumber
   * @return The modified ClaimData message entity.
   */
  private function changeUCROnMessageEntity(claimDataMessage: ECFMessageClaimData_Ext, selectedUCR: String): ECFMessageClaimData_Ext {
    Transaction.runWithNewBundle(\bundle -> {
      claimDataMessage = bundle.add(claimDataMessage)
      claimDataMessage.UCR = selectedUCR
    }, ECFConstants.ECF_SUPER_USER)

    return claimDataMessage
  }

  /**
   * Check if the message with particular claim transaction details already exist in suspense queue.
   *
   * @param message
   * @return return true if the suspended message exist
   */
  public function isMessageTransactionAlreadyInSuspenseQueue(message: ECFMessageClaimData_Ext): boolean {
    return not findAllSuspendedMsgsForClaimTransaction(message).isEmpty()
  }

  /**
   * This method returns all suspended claim data messages for the given claim transaction
   *
   * @param message
   * @return List of all all suspended claim data messages
   */
  public function findAllSuspendedMsgsForClaimTransaction(message: ECFMessageClaimData_Ext): List<ECFMessageClaimData_Ext> {
    return _claimNotifyRqMessageDao.findAllSuspendedMsgsForClaimTransaction(message.UCR, message.UMR, message.TR)
  }
}