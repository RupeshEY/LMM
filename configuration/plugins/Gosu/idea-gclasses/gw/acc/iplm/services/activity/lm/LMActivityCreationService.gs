package gw.acc.iplm.services.activity.lm

uses entity.LMMessage_Ext
uses gw.acc.iplm.exception.lm.LMErrorCodeType
uses gw.acc.iplm.exception.lm.LMException
uses gw.acc.iplm.services.activity.ActivityBuilder
uses gw.acc.iplm.services.activity.ActivityCreationService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey

class LMActivityCreationService implements ActivityCreationService {

  private static var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * Creates all activities triggered by a London Market message.
   *
   * @throws LMException - CLAIM_MISSING - When message.Claim is null
   * @param message LM Message that triggered the activity
   */
  override function createActivities(message: LMMessage_Ext) {
    if (message.Claim == null) {
      throw new LMException(LMErrorCodeType.CLAIM_MISSING)
    }

    createDefaultActivity(message)
  }

  /**
   * Creates the default activities when creating or updating a claim, triggered by an LM Message
   *
   * @throws LMException - CLAIM_HAS_NO_MESSAGES - When the claim has no LM messages associated with it
   * @param message LM message that triggered the activity
   * @param activityBuilder If any activity builder is provided, use that to create the activity, otherwise create a new instance of ActivityBuilder. Defaults to null.
   */
  protected function createDefaultActivity(message: LMMessage_Ext, activityBuilder: ActivityBuilder = null) {
    final var numMessagesOnClaim = message.Claim?.LMMessages?.Count

    if (numMessagesOnClaim == 0) {
      throw new LMException(LMErrorCodeType.CLAIM_HAS_NO_MESSAGES, message.Claim.ClaimNumber)
    }

    activityBuilder = activityBuilder ?: new ActivityBuilder(message.Claim)
    activityBuilder = numMessagesOnClaim == 1 ? activityForNewClaim(message, activityBuilder) : activityForExistingClaim(message, activityBuilder)
    activityBuilder?.withMessage(message)
    activityBuilder?.createActivity()
  }

  /**
   * Populates an ActivityBuilder with the necessary details to create an activity for a new Claim
   *
   * @param message LM Message that triggered the activity
   * @param activityBuilder Instance of an activity builder. All activity details will be appended to this.
   * @return ActivityBuilder
   */
  protected function activityForNewClaim(message: LMMessage_Ext, activityBuilder: ActivityBuilder): ActivityBuilder {
    LOGGER.info("Creating activity for a new Claim, triggered by an LM Message")

    activityBuilder = activityBuilder
      .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.LM.NewClaim.ShortSubject"))
      .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.LM.NewClaim.Subject", message.Claim.ClaimNumber, message.MessageTypeString))
      .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.LM.NewClaim.Description", message.Claim.ClaimNumber, message.UCR, message.MessageTypeString))

    return activityBuilder
  }

  /**
   * Populates an ActivityBuilder with the necessary details to create an activity for an existing Claim
   *
   * @param message LM Message that triggered the activity
   * @param activityBuilder Instance of an activity builder. All activity details will be appended to this.
   * @return ActivityBuilder
   */
  protected function activityForExistingClaim(message: LMMessage_Ext, activityBuilder: ActivityBuilder): ActivityBuilder {
    LOGGER.info("Creating activity for an existing Claim, triggered by an LM Message")

    activityBuilder = activityBuilder
      .withShortSubject(DisplayKey.get("Accelerator.IPLM.Activity.LM.ExistingClaim.ShortSubject"))
      .withSubject(DisplayKey.get("Accelerator.IPLM.Activity.LM.ExistingClaim.Subject", message.Claim.ClaimNumber, message.MessageTypeString))
      .withDescription(DisplayKey.get("Accelerator.IPLM.Activity.LM.ExistingClaim.Description", message.Claim.ClaimNumber, message.UCR, message.MessageTypeString))

    return activityBuilder
  }
}