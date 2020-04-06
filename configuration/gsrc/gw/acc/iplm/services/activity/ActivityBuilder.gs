package gw.acc.iplm.services.activity

uses entity.Activity
uses entity.LMMessage_Ext
uses gw.acc.iplm.utils.ECFConstants
uses org.apache.commons.lang.StringUtils

/**
 * Builder for ECF activities.
 * Uses the ecf_activity Activity Pattern defined in activity-patterns.csv
 */
class ActivityBuilder {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()
  private var _activity: Activity
  private var _user: User
  private var _descriptionBuilder: StringBuilder
  private var _claim: Claim
  private var _subject: String
  private var _shortSubject: String
  private var _activityPatternName: String
  private var _message: LMMessage_Ext
  private var _approved: Boolean
  private var _approvalIssue: String

  /**
   * @param claim The claim you want to create this activity for
   */
  construct(claim: Claim) {
    _claim = claim
    _descriptionBuilder = new StringBuilder()
  }

  /**
   * @param activityPatternName The activity pattern name.
   * @return this builder
   */
  public function withActivityPatternName(activityPatternName: String): ActivityBuilder {
    _activityPatternName = activityPatternName
    return this
  }

  /**
   * @param subject The subject of the activity you are creating. If not set, will use the default from ecf_activity Activity Pattern
   * @return this builder
   */
  public function withSubject(subject: String): ActivityBuilder {
    _subject = subject
    return this
  }

  /**
   * @param shortSubject The short subject of the activity you are creating. If not set, will use the default from ecf_activity Activity Pattern
   * @return this builder
   */
  public function withShortSubject(shortSubject: String): ActivityBuilder {
    _shortSubject = shortSubject
    return this
  }

  /**
   * @param description The description of the activity you are creating. If not set, will use the default from ecf_activity Activity Pattern
   * @return this builder
   */
  public function withDescription(description: String): ActivityBuilder {
    _descriptionBuilder?.append(description)
    return this
  }

  /**
   * Set a description using withDescription() first before appending new lines.
   *
   * @param newLine A new string to append to the activity's description. Note: This will be appended on a <b>new line</b>
   * @return this builder
   */
  public function appendDescription(newLine: String): ActivityBuilder {
    _descriptionBuilder?.append("\n" + newLine)
    return this
  }


  /**
   * @param message Message to be associated with the activity.
   * @return this builder
   */
  public function withMessage(message: LMMessage_Ext): ActivityBuilder {
    _message = message
    return this
  }

  /**
   * @param user a User to assign this activity to
   * @return this builder
   */
  public function assignedTo(user: User): ActivityBuilder {
    _user = user
    return this
  }

  /**
   * @param approval if the activity is approved
   * @return this builder
   */
  public function withApproval(approved: boolean): ActivityBuilder {
    _approved = approved
    return this
  }

  /**
   *
   * @param issue the reason this activity needs approval
   * @return this builder
   */
  public function withApprovalIssue(issue : String): ActivityBuilder {
    _approvalIssue = issue
    return this
  }

  /**
   * Create an activity. It adds values from the builder methods. If any value is null,
   * it uses the default behavior of activity pattern.
   * If no activity pattern was specified, it uses the default ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE
   * Activity will be added to current bundle transaction<br>
   *
   * @return the Activity entity
   */
  public function createActivity(): Activity {
    if (not StringUtils.isBlank(_activityPatternName)) {
      _activity = _claim.createActivityFromPattern(null, ActivityPattern.finder.getActivityPatternByCode(_activityPatternName))
    } else {
      _activity = _claim.createActivityFromPattern(null, ActivityPattern.finder.getActivityPatternByCode(ECFConstants.ECF_CLAIM_ACTIVITY_PATTERN_CODE))
    }

    if (_user != null) {
      _activity.assignUserAndDefaultGroup(_user)
    }

    if (not StringUtils.isBlank(_subject)) {
      _activity.Subject = _subject
    }

    if (not StringUtils.isBlank(_shortSubject)) {
      _activity.ShortSubject = _shortSubject
    }

    if (_message != null) {
      _activity.LMMessage_Ext = _message
    }

    if (not StringUtils.isBlank(_descriptionBuilder?.toString())) {
      _activity?.Description = _descriptionBuilder?.toString().trim().concat("\n")
    }

    _activity.Approved = _approved
    _activity.ApprovalIssue = _approvalIssue

    gw.transaction.Transaction.getCurrent().add(_activity)
    LOGGER.info("Activity created and assigned to: " + _activity.AssignedUser)
    return _activity
  }
}