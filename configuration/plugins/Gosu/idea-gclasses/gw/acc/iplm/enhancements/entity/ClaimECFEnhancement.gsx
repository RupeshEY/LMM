package gw.acc.iplm.enhancements.entity

uses gw.util.IOrderedList
uses typekey.LMMessage_Ext

enhancement ClaimECFEnhancement: Claim {

  /**
   * Check if this ECF claim has been locked due to an E-Event ClaimNotify.
   * The Claim lock will expire after the number of hours set in ClaimNotify_EEvent_TimeOut_Hours.
   *
   * @return If EEventTime_Ext is null returns false.<br>
   * Checks the EEventTime_Ext and if it is within the ClaimNotify_EEvent_TimeOut_Hours value
   * returns true.<br>
   * If EEventTime_Ext was more hours ago than the value in
   * ClaimNotify_EEvent_TimeOut_Hours, sets EEventTime_Ext to null and returns false.
   */
  property get ECFLocked(): boolean {
    if (this.EEventTime_Ext == null) {
      return false
    }

    var expiredTimeOut = this.EEventTime_Ext.addHours(ScriptParameters.ClaimNotify_EEvent_TimeOut_Hours)
    var isExpired = expiredTimeOut < Date.Now

    if (isExpired) {
      this.EEventTime_Ext = null
    }

    return not isExpired
  }

  /**
   * Sets the ECFLocked status.
   * If set to true, EEventTime_Ext is updated to current time.
   * If set to false, EEventTime_Ext is set to null and Claim no longer locked.
   * <p>
   * The Claim lock will expire after the number of hours set in ClaimNotify_EEvent_TimeOut_Hours Script Parameter.
   * (EEventTime_Ext + ClaimNotify_EEvent_TimeOut_Hours = Lock removed)
   *
   * @param newECFLocked
   */
  property set ECFLocked(newECFLocked: boolean) {
    if (newECFLocked) {
      this.EEventTime_Ext = Date.Now
    } else {
      this.EEventTime_Ext = null
    }
  }

  /**
   * It returns all ClaimNotifyEventRq messages which are valid and ready to go
   * this will exclude messages which needs manual check and RespondErrorNotify messages.
   *
   * @return List<ECFMessageClaimNotifyRq_Ext>
   */
  property get ValidClaimNotifyRqs(): List<ECFMessageClaimNotifyRq_Ext> {
    return this.LMMessages.whereTypeIs(ECFMessageClaimNotifyRq_Ext)?.where(\ecfMessage -> not ecfMessage.Suspended and ecfMessage.MessageType != ECFMessageType_Ext.TC_RESPONDERRORNOTIFY)?.toList()
  }

  /**
   * Get all un-suspended SCM messages on this Claim.
   *
   * @return List<LMMessageLloydsSCM_Ext>
   */
  property get SCMMessages(): List<LMMessageLloydsSCM_Ext> {
    return this.LMMessages.whereTypeIs(LMMessageLloydsSCM_Ext)?.where(\scmMessage -> not scmMessage.Suspended)?.toList()
  }

  property get LatestMessagePerTransaction(): List<ECFMessageClaimData_Ext> {
    var allValidMessages = this.LMMessages.whereTypeIs(ECFMessageClaimData_Ext)?.where(\ecfMessage ->
        not ecfMessage.Suspended
        and ecfMessage.MessageType != ECFMessageType_Ext.TC_RESPONDERRORNOTIFY
        and not ecfMessage.ResponseAcknowledgement.IsRejected
        and not ecfMessage.ResponseAcknowledgement.HasNoClaimData)?.toList()
    var messagesPerTRPerID = allValidMessages.partition(\elt -> elt.TR + elt.ReceiverPartyId)

    return messagesPerTRPerID.Values.map(\messages ->
        messages.firstWhere(\msg -> msg.ECFTransactionState.UUID == msg.UUID)?:messages.sortByDescending(\msg -> msg.CreateTime).first())
  }

  /**
   * Returns all ClaimRetrieveEventRs messages which are associated to this claim
   */
  property get ClaimRetrieveRses(): List<ECFMessageClaimRetrieveRs_Ext> {
    return this.LMMessages.whereTypeIs(ECFMessageClaimRetrieveRs_Ext).toList()
  }

  /**
   * Get the latest successful ClaimRetrieveRs message on the claim
   * If Claim has no successful ClaimRetrieveRs messages, this will return null
   */
  property get LatestClaimRetrieveRsMessage(): ECFMessageClaimRetrieveRs_Ext {
    return this.ClaimRetrieveRses.sortByDescending(\e -> e.CreateTime).first()
  }

  /**
   * Returns all ClaimResponseRqs messages which are associated to this claim
   */
  property get ClaimResponseRqs(): List<ECFMessageClaimResponseRq_Ext> {
    return this.LMMessages.whereTypeIs(ECFMessageClaimResponseRq_Ext).toList()
  }

  /**
   * Returns the TransactionSequence number of the Transaction on this Claim that should be responded to now for a given receiver.
   * Returns 0 if there are no Transactions on this Claim which can be responded to.
   * @param receiver - The Receiver ID to check the TransactionSequence number for
   */
  public function  RespondableTransactionSequenceNumber(receiver : String): int {
    var sequenceNumberToRespondTo = this.TransactionStates
        .where(\elt -> elt.ReceiverId == receiver)
        .orderBy(\tx -> tx.TransactionSequence)
        .firstWhere(\tx -> not tx.Agreed)?.TransactionSequence
    return sequenceNumberToRespondTo
  }

  /**
   * Get the latest successful ClaimResponseRq message on the claim for the given TR
   * If Claim has no successful ClaimResponseRq messages for this TR, this will return null
   */
  public function getLatestClaimResponseRqMessageForTR(tr: String): ECFMessageClaimResponseRq_Ext {
    return this.ClaimResponseRqs.where(\e -> e.TR == tr).sortByDescending(\e -> e.CreateTime).first()
  }

  /**
   * Check if ECF information needs to show in the UI.
   *
   * @return boolean
   */
  public property get ECFVisible(): boolean {
    return this.LMMessages?.where(\elt -> elt.MessageType?.ECFWritebackType)?.hasMatch(\elt1 -> not elt1.Suspended)
  }

  /**
   * Check if SCM information needs to show in the UI.
   *
   * @return boolean
   */
  public property get SCMVisible(): boolean {
    return this.LMMessages?.whereTypeIs(LMMessageLloydsSCM_Ext)?.hasMatch(\elt -> not elt.Suspended)
  }

  /**
   * Check if London Market information needs to show or not.
   *
   * @return boolean If true, show London Market UI components otherwise don't show it
   */
  public property get LMVisible(): boolean {
    return this.LMMessages.HasElements
  }

  /**
   * Gets a list of unique TransactionReferences from the ECFMessage_Ext entities on
   * this claim.
   *
   * @return List<String> Unique TRs.
   */
  property get TransactionReferences(): List<String> {
    var cnTrs = this.LMMessages.whereTypeIs(ECFMessageClaimData_Ext)
        .where(\message -> not message.Suspended and message.TR != null)*.TR
        .toSet()
        .toList()
    return cnTrs?.sort()
  }

  /**
   * Gets a list of unique ECFTransactionState from the ECFMessage_Ext entities on
   * this claim.
   *
   * @return List of ECFTransactionState_Ext
   */
  property get TransactionStates(): List<ECFTransactionState_Ext> {
    var txStates = this.LMMessages.whereTypeIs(ECFMessageClaimData_Ext)*.ECFTransactionState.toList()
    return txStates
  }

  /**
   * find latest ECFMessageClaimData_Ext message which is not suspended and the message with passed UUID.
   *
   * @param uuid of the message to exclude
   * @return {@link ECFMessageClaimData_Ext}
   */
  public function getLatestECFMessageClaimDataExcludingUUID(uuid: String): ECFMessageClaimData_Ext {
    return this.LMMessages?.whereTypeIs(ECFMessageClaimData_Ext)
        ?.where(\elt -> elt.UUID != uuid and not elt.isSuspended())?.orderByDescending(\e -> e.CreateTime)?.first()
  }

  /**
   * TODO dependent on US14900 outcome, its stub testing
   * TODO Fix ... this.LossLocation?.Description?.startsWith("hasCOI")
   *
   * @return
   */
  property get HasConflictOfInterest(): boolean {
    return this.LossLocation?.Description?.startsWith("hasCOI")
  }

  /**
   * Gets latest message claim data received in CC.
   *
   * @return a ECFMessageClaimData_Ext object with latest claim data received in CC. If there's no latest message, this will return <code>null</code>.
   */
  property get LatestMessageClaimData(): ECFMessageClaimData_Ext {
    return getLastestMessagesNotSuspended()?.first()
  }

  /**
   * find latest Message Claim Data which is not suspended and the message with passed UUID.
   *
   * @param uuid of the message to exclude
   * @return ECFMessageClaimData_Ext
   */
  public function getLatestMessageClaimDataExcludingUUID(uuid: String): ECFMessageClaimData_Ext {
    return getLastestMessagesNotSuspended()?.where(\elt -> elt.UUID != uuid)?.first()
  }

  /**
   * Retrieves the Latest SCM Message with a given OCR excluding a specific UUId
   * @param ocr Originating Claim Reference
   * @param exclude_uuid UUId of the message to exclude
   * @return Latest SCM Message with a given OCR or null if no message was found
   */
  public function getHighestSCMMessageSequenceByOCR(ocr: String, exclude_uuid: String) : LMMessageLloydsSCM_Ext {

    final var allMessages = this.LMMessages?.whereTypeIs(LMMessageLloydsSCM_Ext)
    final var filteredMessages = allMessages?.where(\message -> message.OCR == ocr
                                                            and message.UUID != exclude_uuid
                                                            and message.MessageSequence != null
                                                            and not message.Suspended)
    final var latestMessage = filteredMessages?.orderBy(\message -> message.MessageSequence)?.last()

    return latestMessage
  }

  private function getLastestMessagesNotSuspended(): IOrderedList<ECFMessageClaimData_Ext> {
    return this.LMMessages?.whereTypeIs(ECFMessageClaimData_Ext)?.where(\elt -> not elt.Suspended)?.orderByDescending(\e -> e.CreateTime)
  }

  /**
   * Checks if this Claim is currently associated to any suspended London Market messages.
   * @return true if any messages associated to this Claim are suspended
   */
  property get HasSuspendedMessages() : boolean {
    return this.LMMessages.hasMatch(\lmMsg -> lmMsg.Suspended)
  }

}