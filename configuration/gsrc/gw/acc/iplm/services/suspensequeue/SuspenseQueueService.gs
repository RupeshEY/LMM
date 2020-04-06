package gw.acc.iplm.services.suspensequeue

uses entity.LMMessage_Ext
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.transaction.Transaction
uses org.slf4j.Logger

abstract class SuspenseQueueService<T extends LMMessage_Ext> {

  protected static final var LOGGER: Logger = ECFConstants.LOGGER_BLOCK()

  /**
   * Handle the assignment of a suspended message to a user
   *
   * @param message suspended message
   * @return Suspended message with assigned user
   */
  abstract function assignMessage(message: T) : T

  /**
   * Processes a Suspended Message against a particular policy.
   * Returns null if any of the arguments are null.
   *
   * @param message Suspended Message
   * @param selectedPolicyNumber Selected Policy Number
   * @return The processed list of messages.
   */
  abstract function applyMessageToPolicy(message: T, selectedPolicyNumber: String) : List<T>

  /**
   * Processes a Suspended Message against a particular claim.
   * Returns null if any of the arguments are null.
   *
   * @param message Suspended Message
   * @param selectedUCR Selected UCR
   * @return The processed list of messages.
   */
  abstract function applyMessageToClaim(message: T, selectedUCR: String): List<T>

  /**
   * This function will update the Suspend flag on an LMMessage_Ext entity.
   * The assignment algorithm depends on the message type and is implemented by the assignMessage function
   *
   * @param message The message to update
   * @param errorCode Validation reason error code
   * @param reason The reason why the message needs to be suspended
   * @return The updated LMMessage_Ext entity
   */
  public function suspendMessage(message: T, errorCode: Integer, reason: String): LMMessage_Ext {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.Suspended = true
      message.ValidationErrorCode = errorCode
      message.ValidationFailureReason = reason
      message = assignMessage(message)
    }, ECFConstants.ECF_SUPER_USER)

    return message
  }

  /**
   * Unsuspends a list of Suspended Messages.
   * Returns null if any of the arguments are null.
   *
   * @param messages List of suspended messages
   * @return The unsuspended list of messages.
   */
  protected function unsuspendMessages(messages: List<T>): List<T> {
    if (messages.isEmpty()) {
      return null
    }

    var unsuspendedMessages: List<T> = new ArrayList<T>()
    messages.each(\elt -> unsuspendedMessages.add(unsuspendMessageEntity(elt)))
    return unsuspendedMessages
  }

  /**
   * Unsuspends a message entity.
   *
   * @param message
   * @return Unsuspended message entity.
   */
  public function unsuspendMessageEntity(message: T): T {
    Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.Suspended = false
      message.ValidationErrorCode = null
      message.ValidationFailureReason = null
      message.AssignedUser = null
    }, ECFConstants.ECF_SUPER_USER)

    return message
  }

  /**
   * Delete(Retire) selected messages associated with particular claim transaction.
   *
   * @param ecfMessages An array of messages which need to be deleted.
   */
  public function deleteMessages(messages: T[]) {
    LOGGER.debug("Deleting Messages")
    Transaction.runWithNewBundle(\bundle -> {
      messages?.each(\message -> bundle.delete(message) )
    }, ECFConstants.ECF_SUPER_USER)
  }

  /**
   * Returns the suspended messages assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return An array of T entities that have been assigned to the provided user
   */
  public function getMessagesForUser(user: User): T[] {
    var query = Query.make(T)
        .compare(T#AssignedUser, Equals, user)
    var res = query.select().toTypedArray()
    LOGGER.info("We have found ${res.Count} messages for user ${user}")
    return res
  }

  /**
   * Returns the number of suspended messages assigned to a particular user.
   *
   * @param user The user to get the messages for
   * @return Number of suspended messages
   */
  function getSuspendedMessagesCountForUser(user: User): int {
    var query = Query.make(T)
        .compare(LMMessage_Ext#Suspended, Equals, true)
        .compare(LMMessage_Ext#AssignedUser, Equals, user)

    return query.select().Count
  }

}