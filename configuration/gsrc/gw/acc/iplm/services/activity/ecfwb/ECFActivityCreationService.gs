package gw.acc.iplm.services.activity.ecfwb

uses entity.Activity
uses entity.LMMessage_Ext
uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.services.activity.ActivityCreationService
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFUtils
uses gw.api.locale.DisplayKey
uses gw.api.util.CurrencyUtil

/**
 * General interface for ECF activity creation.
 */
class ECFActivityCreationService implements ActivityCreationService {

  private static var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * <p>
   * This method creates activities for different ECF message types
   *
   * @param ecfMessage the message to create activity for.
   */
  public function createActivities(message: LMMessage_Ext) {
    final var ecfMessage = message as ECFMessage_Ext
    createDefaultActivity(ecfMessage)
    createConflictOfInterestActivity(ecfMessage)
    createCatastropheActivity(ecfMessage)
  }

  /**
   * This method create a activity for conflict of interest,
   * if there is conflict of interest for claim.
   *
   * @param ecfMessage the message to create activity for.
   */
  private function createConflictOfInterestActivity(ecfMessage: ECFMessage_Ext) {
    if (ecfMessage typeis ECFMessageClaimData_Ext
        and not ecfMessage.Claim.HasConflictOfInterest
        and ecfMessage.ConflictOfInterestInd) {
      var activity = new ActivityBuilder(ecfMessage.Claim).
          withActivityPatternName(ECFConstants.ECF_COI_ACTIVITY_PATTERN_CODE)
          .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ConflictOfInterestSubject", ecfMessage.UCR))
          .withMessage(ecfMessage).createActivity()
      LOGGER.info("Activity created for conflict of interest with subject: ${activity.Subject}")
    }
  }

  private function createDefaultActivity(ecfMessage: ECFMessage_Ext) {
    var activityBuilder: ActivityBuilder
    if (ecfMessage.Claim?.LMMessages?.Count == 1) {
      activityBuilder = createActivityForNewClaim(ecfMessage, ecfMessage.Claim)
    } else {
      activityBuilder = createActivitiesForExistingClaim(ecfMessage)
    }
    activityBuilder = createActivityForRespondableClaimData(activityBuilder, ecfMessage)
    activityBuilder = addMessageToActivity(activityBuilder, ecfMessage)
    activityBuilder?.createActivity()
  }

  /**
   * This method creates an activity for a PCS or LCO catastrophe code not found in CC,
   * if there is a new catastrophe code not found
   *
   * @param ecfMessage the message to create activity for.
   */
  private function createCatastropheActivity(ecfMessage: ECFMessage_Ext) {
    if(ecfMessage typeis ECFMessageClaimData_Ext
        and ecfMessage.HasCatastropheCodeDifferentFromLast
        and ecfMessage.HasNewCatastropheCode) {
      var activity = new ActivityBuilder(ecfMessage.Claim).
          withActivityPatternName(ECFConstants.ECF_CATASTROPHE_ACTIVITY_PATTERN_CODE)
          .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ShortSubject"))
          .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.Catastrophe.Subject", ecfMessage.LcoOrPcsCatastropheCode))
          .withDescription(buildCatastropheActivityDescription(ecfMessage))
          .withMessage(ecfMessage).createActivity()
      LOGGER.info("Activity created for new catastrophe code with subject: ${activity.Subject}")
    }
  }

  /**
   * <p>
   * This method creates activity for Respond-able ClaimNotify or ClaimRetrieve and add it to the activity.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param ecfMessage      the message to create activity for.
   * @return ActivityBuilder
   */
  private function createActivityForRespondableClaimData(activityBuilder: ActivityBuilder, ecfMessage: ECFMessage_Ext): ActivityBuilder {
    if((ecfMessage.MessageType == ECFMessageType_Ext.TC_CLAIMNOTIFY or ecfMessage.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM)
      and (ecfMessage as ECFMessageClaimData_Ext).Respondable) {
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, DisplayKey.get("Accelerator.IPLM.Activity.ECF.RespondableMessageDescription", ecfMessage.TR), ecfMessage as ECFMessageClaimData_Ext)
    }
    return activityBuilder
  }

  private function addMessageToActivity(activityBuilder: ActivityBuilder, ecfMessage: ECFMessage_Ext): ActivityBuilder {
    if (ecfMessage.MessageType == ECFMessageType_Ext.TC_CLAIMNOTIFY or ecfMessage.MessageType == ECFMessageType_Ext.TC_RETRIEVECLAIM) {
      activityBuilder?.withMessage(ecfMessage)
    }
    return activityBuilder
  }

  /**
   * <p>
   * This method create activity for different ECF message type which creates new Claim.
   *
   * @param ecfMessage the message to create activity for.
   * @param Claim      the claim which needs activity.
   * @return ActivityBuilder
   */
  private function createActivityForNewClaim(ecfMessage: ECFMessage_Ext, claim: Claim): ActivityBuilder {
    var activityBuilder: ActivityBuilder
    switch (ecfMessage.MessageType) {
      case ECFMessageType_Ext.TC_CLAIMNOTIFY:
      case ECFMessageType_Ext.TC_RETRIEVECLAIM:
        LOGGER.debug("Assigning activity for new Claim creation")
        activityBuilder = new ActivityBuilder(claim)
            .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ShortSubject"))
            .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.NewClaimSubject", claim.UCR_Ext))
            .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.ECF.Description", java.util.Date.Now, claim.ClaimNumber))
        break
      default:
        activityBuilder = new ActivityBuilder(claim)
    }
    return activityBuilder
  }

  /**
   * <p>
   * This method create activity for different ECF message type which updates existing Claim.
   *
   * @param ecfMessage the ECF message to create activity for.
   * @return ActivityBuilder
   */
  private function createActivitiesForExistingClaim(ecfMessage: ECFMessage_Ext): ActivityBuilder {
    var activityBuilder: ActivityBuilder
    switch (ecfMessage.MessageType) {
      case ECFMessageType_Ext.TC_CLAIMNOTIFY:
      case ECFMessageType_Ext.TC_RETRIEVECLAIM:
        activityBuilder = createActivitiesForECFMessageClaimDataUpdatingAClaim(ecfMessage as ECFMessageClaimData_Ext)
        break
      case ECFMessageType_Ext.TC_TRANSACTIONERRORNOTIFY:
        createActivityForTransactionError(ecfMessage as ECFMessageClaimNotifyRq_Ext)
        break
      default:
        activityBuilder = new ActivityBuilder(ecfMessage.Claim)
    }
    return activityBuilder
  }

  private function createActivityForTransactionError(ecfMessage: ECFMessageClaimNotifyRq_Ext) {
    new ActivityBuilder(ecfMessage.Claim)
        .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.TransactionError.Subject", ecfMessage.TR, ecfMessage.UCR))
        .withDescription(ecfMessage.ErrorsOrWarnings.first().Description)
        .withMessage(ecfMessage).createActivity()
  }

  private function createActivitiesForECFMessageClaimDataUpdatingAClaim(ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    var latestECFMessageClaimData = ecfMessage.Claim.getLatestECFMessageClaimDataExcludingUUID(ecfMessage.UUID)
    var activityBuilder = createActivityForFinancialAmounts(null, latestECFMessageClaimData, ecfMessage)
    activityBuilder = createActivityForPcsCatastropheCode(activityBuilder, latestECFMessageClaimData, ecfMessage)
    activityBuilder = createActivityForLcoCatastropheCode(activityBuilder, latestECFMessageClaimData, ecfMessage)
    activityBuilder = createActivityForLossCause(activityBuilder, latestECFMessageClaimData, ecfMessage)
    activityBuilder = createActivityForResponseSuperseded(activityBuilder, ecfMessage)

    return activityBuilder
  }

  /**
   * <p>
   * This method creates activity for financial amounts which does not match the latest message financial amounts.
   * It returns ActivityBuilder or NULL in case of not matching financial lists.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param latestECFMessageClaimData the latest message to compare current message with.
   * @param ecfMessage the current message under processing.
   * @return ActivityBuilder
   */
  private function createActivityForFinancialAmounts(activityBuilder: ActivityBuilder, latestECFMessageClaimData: ECFMessageClaimData_Ext, ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    if (ecfMessage?.Financials == null and latestECFMessageClaimData?.Financials == null) {
      return null
    }

    var reserveAmountThreshold = ScriptParameters.ECFClaimReserveAmountThreshold
    var reserveAmountThresholdCurrency = reserveAmountThreshold.Currency?:CurrencyUtil.getDefaultCurrency()
    var currentFinancial = ecfMessage?.Financials?.firstWhere(\elt -> elt?.LossAndExpensesIncurred?.Currency == reserveAmountThresholdCurrency)?.LossAndExpensesIncurred
    var currentAmount = currentFinancial?.Amount
    var currentAmountCurrency = currentFinancial?.Currency
    var oldAmount = latestECFMessageClaimData?.Financials?.firstWhere(\elt -> elt?.LossAndExpensesIncurred?.Currency == reserveAmountThresholdCurrency)?.LossAndExpensesIncurred?.Amount

    if (currentAmount > oldAmount
        and currentAmount > reserveAmountThreshold.toNumber()) {
      LOGGER.debug("Creating activity for financials update")
      var description = DisplayKey.get("Accelerator.IPLM.Activity.ECF.ReserveAmountDescription",
          currentAmountCurrency?.DisplayName + currentAmount, reserveAmountThresholdCurrency.DisplayName + reserveAmountThreshold)
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, description, ecfMessage)
    }

    return activityBuilder
  }

  /**
   * <p>
   * This method creates activity for PcsCatastropheCode which does not match the latest message PcsCatastropheCode.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param latestECFMessageClaimData the latest message to compare current message with.
   * @param ecfMessage the current message under processing.
   * @return ActivityBuilder
   */
  private function createActivityForPcsCatastropheCode(activityBuilder: ActivityBuilder, latestECFMessageClaimData: ECFMessageClaimData_Ext, ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    if (latestECFMessageClaimData.PcsCatastropheCode != ecfMessage.PcsCatastropheCode) {
      LOGGER.debug("Creating activity for updated PCS Catastrophe Code")
      var description = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCodeDescription", fieldChangesAsString(latestECFMessageClaimData.PcsCatastropheCode.DisplayName, ecfMessage.PcsCatastropheCode.DisplayName))
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, description, ecfMessage)
    }
    return activityBuilder
  }

  /**
   * <p>
   * This method creates activity for LcoCatastropheCode which does not match the latest message LcoCatastropheCode.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param latestECFMessageClaimData the latest message to compare current message with.
   * @param ecfMessage the current message under processing.
   * @return ActivityBuilder
   */
  private function createActivityForLcoCatastropheCode(activityBuilder: ActivityBuilder, latestECFMessageClaimData: ECFMessageClaimData_Ext, ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    if (latestECFMessageClaimData.LcoCatastropheCode != ecfMessage.LcoCatastropheCode) {
      LOGGER.debug("Creating activity for updated LCO Catastrophe Code")
      var description = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCodeDescription", fieldChangesAsString(latestECFMessageClaimData.LcoCatastropheCode.DisplayName, ecfMessage.LcoCatastropheCode.DisplayName))
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, description, ecfMessage)
    }

    return activityBuilder
  }

  /**
   * <p>
   * This method creates activity for LossCause which does not match the latest message LossCause.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param latestECFMessageClaimData the latest message to compare current message with.
   * @param ecfMessage the current message under processing.
   * @return ActivityBuilder
   */
  private function createActivityForLossCause(activityBuilder: ActivityBuilder, latestECFMessageClaimData: ECFMessageClaimData_Ext, ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    if (latestECFMessageClaimData.LossCause != ecfMessage.LossCause) {
      LOGGER.debug("Creating activity for updated Loss Cause")
      var description = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LossCauseDescription", fieldChangesAsString(latestECFMessageClaimData.LossCause, ecfMessage.LossCause))
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, description, ecfMessage)
    }
    return activityBuilder
  }

  private function createActivityForResponseSuperseded(activityBuilder : ActivityBuilder, ecfMessage : ECFMessageClaimData_Ext) : ActivityBuilder {
    if (hasPreviousResponsePending(ecfMessage)) {
      var description = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PreviousResponseSuperseded")
      activityBuilder = getActivityBuilderForExistingClaim(activityBuilder, description, ecfMessage)

      var previousResponse = ecfMessage.Claim.getLatestClaimResponseRqMessageForTR(ecfMessage.TR)
      var activityToClose = previousResponse.ApprovalActivity
      closeActivity(activityToClose)
      //previous message status is set here, because other wise we lose the context of setting it for a superseded message
      previousResponse.Status = ECFMessageStatus_Ext.TC_SUPERSEDED
      return activityBuilder
    }
    return activityBuilder
  }

  private function hasPreviousResponsePending(ecfMessage : ECFMessageClaimData_Ext) : boolean {
    var response = ecfMessage.Claim.getLatestClaimResponseRqMessageForTR(ecfMessage.TR)
    return response?.Status == ECFMessageStatus_Ext.TC_FINANCIALAUTHORISATION
  }


  /**
   * <p>
   * This method will append new description to the current ActivityBuilder, activity object description or create a new object in case of updating existing claim.
   *
   * @param activityBuilder ActivityBuilder object for building activity entity.
   * @param description the description to append to activity description.
   * @param ecfMessage the current message under processing.
   * @return ActivityBuilder
   */
  private function getActivityBuilderForExistingClaim(activityBuilder: ActivityBuilder, description: String, ecfMessage: ECFMessageClaimData_Ext): ActivityBuilder {
    activityBuilder = activityBuilder?.appendDescription(description) ?:
        new ActivityBuilder(ecfMessage.Claim)
            .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ShortSubject"))
            .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ExistingClaimSubject", ecfMessage.Claim.UCR_Ext))
            .withDescription(description)

    return activityBuilder
  }

  /**
   * Displays a field change from an old value to a new value as a user readable string - e.g. changed from (oldValue) to (newValue); removed; to (newValue)
   *
   * @param oldValue
   * @param newValue
   * @return {@link java.lang.String} user readable string
   */
  private function fieldChangesAsString(oldValue: String, newValue: String) : String {
    if (oldValue == null) {
      return DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.To", newValue)
    } else if (newValue == null) {
      return DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.Removed")
    }

    return DisplayKey.get("Accelerator.IPLM.Activity.ECF.FieldChanges.FromTo", oldValue, newValue)
  }

  /**
   * <p>
   * Builds the description for the Catastrophe Activity based on the codes provided in message claim data
   *
   * @param ecfMessage - ECFMessageClaimData_Ext object containing catastrophe code(s) to build the activity description
   * @return a String containing the description for the activity that will be created.
   */
  private function buildCatastropheActivityDescription(ecfMessage: ECFMessageClaimData_Ext): String {
    var activityDescription = ""
    var pcsCatastropheCode = ecfMessage.PcsCatastropheCode?.Code
    var lcoCatastropheCode = ecfMessage.LcoCatastropheCode?.Code
    if(pcsCatastropheCode.NotBlank and lcoCatastropheCode.NotBlank) {
      activityDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsAndLcoCatastropheCode.Description", pcsCatastropheCode, lcoCatastropheCode)
    } else if (lcoCatastropheCode.NotBlank) {
      activityDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.LcoCatastropheCode.Description", lcoCatastropheCode)
    } else if (pcsCatastropheCode.NotBlank) {
      activityDescription = DisplayKey.get("Accelerator.IPLM.Activity.ECF.PcsCatastropheCode.Description", pcsCatastropheCode)
    }
    return activityDescription
  }

  /**
   * Create Activities specifically for Claim Retrieve Responses
   *
   * @param message Claim Retrieve Rs
   */
  public function createActivitiesForClaimRetrieveRs(message: ECFMessageClaimRetrieveRs_Ext) {
    createActivityForRejectedClaimRetrieve(message)
  }

  /**
   * Creates an activity for when a Claim Retrieve Rs has been rejected
   *
   * @param message Claim Retrieve Rs
   */
  private function createActivityForRejectedClaimRetrieve(message: ECFMessageClaimRetrieveRs_Ext) {
    if (message.ResponseAcknowledgement.IsRejected or message.ResponseAcknowledgement.HasNoClaimData) {
      var referredClaimRetrieveRq = ECFUtils.findMessageByUUID(message.ClaimRetrieveReqReferredUUId)

      new ActivityBuilder(message.Claim)
          .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimRetrieveRejected.Subject"))
          .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimRetrieveRejected.ShortSubject"))
          .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimRetrieveRejected.Description", referredClaimRetrieveRq.TR, message.Claim.ClaimNumber, message.ResponseAcknowledgement.ResponseDescription))
          .withMessage(referredClaimRetrieveRq)
          .createActivity()
    }
  }

  /**
   * Create Activities specifically for Claim Response Rs messages
   *
   * @param message Claim Response Rs
   */
  public function createActivitiesForClaimResponseRs(message: ECFMessageClaimResponseRs_Ext) {
    createActivityForRejectedClaimResponse(message)
  }

  /**
   * Create Activity related to authorising the financial agreement in a ClaimResponseRq message
   *
   * @param message the Claim Response Rq which failed authorisation
   */
  public function createActivityForClaimResponseAuthorisation(message: ECFMessageClaimResponseRq_Ext){
    var approvalActivity = new ActivityBuilder(message.Claim)
        .withActivityPatternName(ECFConstants.ECF_TRANSACTION_APPROVAL_PATTERN)
        .withMessage(message)
        .withApprovalIssue(message.ApprovalIssue)
        .createActivity()
    message.addToActivities(approvalActivity)
  }

  /**
   * Creates an activity for when a Claim Response Rs has been rejected
   *
   * @param message Claim Response Rs
   */
  private function createActivityForRejectedClaimResponse(message: ECFMessageClaimResponseRs_Ext) {
    if (message.ResponseAcknowledgement.IsRejected) {
      var referredClaimResponseRq = ECFUtils.findMessageByUUID(message.ReferredMessageUUId)

      new ActivityBuilder(message.Claim)
          .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimResponseRejected.Subject"))
          .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimResponseRejected.ShortSubject"))
          .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.ECF.ClaimResponseRejected.Description", referredClaimResponseRq.TR, message.Claim.ClaimNumber, message.ResponseAcknowledgement.ResponseDescription))
          .withMessage(referredClaimResponseRq)
          .createActivity()
    }
  }

  /**
   * Creates an activity for the sender of a Claim Response Rq when the supervisor has rejected the response
   *
   * @param rejectedActivity Rejected Activity
   */
  public function createActivityForClaimResponseAuthorizationRejection(rejectedActivity: Activity) {
    final var claimResponseRq = rejectedActivity.LMMessage_Ext as ECFMessageClaimResponseRq_Ext

    new ActivityBuilder(rejectedActivity.Claim)
        .withActivityPatternName(ECFConstants.OOTB_APPROVAL_DENIED)
        .assignedTo(claimResponseRq.CreateUser)
        .withMessage(claimResponseRq)
        .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.ECF.FinancialAuthorizationRejected.Description", claimResponseRq?.TR, rejectedActivity.CloseUser.DisplayName))
        .createActivity()
  }

  public function closeActivity(activity : Activity) {
    activity?.complete()
  }
}