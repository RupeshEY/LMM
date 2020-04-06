package gw.acc.iplm.enhancements.entity

uses com.google.common.base.Splitter
uses com.google.common.base.Strings
uses entity.Activity
uses entity.ECFMessageComment_Ext
uses gw.acc.iplm.InterceptorManager
uses gw.acc.iplm.entitymapper.ecfwb.claimresponse.ClaimResponseRqEntityMapper
uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.exception.ecfwb.ECFException
uses gw.acc.iplm.services.UberPrecautionaryService
uses gw.acc.iplm.services.activity.ecfwb.ECFActivityCreationService
uses gw.acc.iplm.services.financial.ECFClaimResponseFinancialCalculator
uses gw.acc.iplm.services.financial.FinancialAuthorisationService
uses gw.acc.iplm.utils.ECFConstants
uses gw.api.database.Query
uses gw.api.financials.CurrencyAmount
uses gw.util.GosuStringUtil
uses org.apache.commons.lang.text.StrBuilder
uses typekey.Currency

/**
 * Enhancements for ClaimResponseRq messages.
 * For enhancement related with indicators, see {@link ECFMessageClaimResponseRq_ExtIndicatorsEnhancement}
 */
enhancement ECFMessageClaimResponseRq_ExtEnhancement : ECFMessageClaimResponseRq_Ext {

  /**
   * Looks for the ECFMessageClaimData_Ext entity that was responded to by this ECFMessageClaimResponseRq_Ext.
   * ECFMessageClaimData_Ext is an abstract entity for ECFMessageClaimNotifyRq_Ext and ECFMessageClaimRetrieveRs_Ext,
   * therefore the query is looking for this abstract entity in order to get related concrete entity.
   *
   * @return {@link entity.ECFMessageClaimData_Ext} The ECFMessageClaimData_Ext, which is either ECFMessageClaimNotifyRq_Ext or ECFMessageClaimRetrieveRs_Ext,
   * that was responded by this entity
   */
  property get ClaimDataResponded() : ECFMessageClaimData_Ext {
    var claimDataMessage = Query.make(ECFMessageClaimData_Ext)
    claimDataMessage.compare(ECFMessageClaimData_Ext#UUID, Equals, this.ReferredUUID)
    return claimDataMessage.select().AtMostOneRow
  }

  /**
   * True if the response code can be considered final (no more responses will be sent), false otherwise
   *
   * @return {@link boolean} True if response code is on the Final typefilter of the ECFResponseCode_Ext typelist, false otherwise
   */
  property get FinalResponse() : boolean {
    return ECFResponseCode_Ext.TF_FINAL.getTypeKeys().contains(this.ResponseCode)
  }

  /**
   * True if the response code can be considered an agreement (carrier is commiting to this transaction), false otherwise
   *
   * @return {@link boolean} True if response code indicates the carrier is agreeing to this transaction, false otherwise
   */
  property get Agreement() : boolean {
    return ECFResponseCode_Ext.TF_AGREEMENT.getTypeKeys().contains(this.ResponseCode)
  }

  /**
   * States if another query reason can be added.
   *
   * @return {@link boolean}
   */
  property get QueryReasonAvailable() : boolean {
    return this.QueryReasons.Count < ECFConstants.QUERY_REASON_LIMIT
  }

  /**
   * States if another public comment can be added.
   *
   * @return {@link boolean}
   */
  property get PublicCommentAvailable() : boolean {
    return this.PublicComments.Count < this.PublicCommentsLimit
  }

  /**
   * States if public comment can be added at all.
   * If message responding to has already used the limit, than returns false.
   * Otherwise, returns true
   *
   * @return {@link boolean}
   */
  public property get PublicCommentEditable() : boolean {
    return PublicCommentAvailableLineCountForResponse > 0
  }

  /**
   * States how many lines can be used in this message.
   *
   * @return {@link int}
   */
  public property get PublicCommentAvailableLineCountForResponse() : int {
    return this.PublicCommentsLimit - this.ClaimDataResponded.PublicComments.Count
  }

  /**
   * States if private comment can be added at all. For Lirma, returns false.
   * If message responding to has already used the limit, than returns false, as well.
   * Otherwise, returns true
   *
   * @return {@link boolean}
   */
  public property get PrivateCommentEditable() : boolean {
    return this.ClaimDataResponded.PrivateComments.Count < this.PrivateCommentsLimit
  }

  /**
   * States how many lines can be used in this message.
   *
   * @return {@link int}
   */
  public property get PrivateCommentAvailableLineCountForResponse() : int {
    return this.PrivateCommentsLimit - this.ClaimDataResponded.PrivateComments.Count
  }

  /**
   * States if another private comment can be added.
   *
   * @return {@link boolean}
   */
  property get PrivateCommentAvailable() : boolean {
    return this.PrivateComments.Count < this.PrivateCommentsLimit
  }

  /**
   * Returns the Bureau specific maximum amount of public comments.
   *
   * @return {@link int}
   */
  property get PublicCommentsLimit() : int {
    switch (this.BureauType) {
      case ECFBureauType_Ext.TC_LIRMA:
        return ECFConstants.LIRMA_COMMENTS_LIMIT
      case ECFBureauType_Ext.TC_LLOYDS:
      case ECFBureauType_Ext.TC_ILU:
      default:
        return ECFConstants.PUBLIC_COMMENTS_LIMIT
    }
  }

  /**
   * Returns the count of remaining lines for public comments.
   * It will never returns negative numbers, for values less than 1, the returning value will be 0
   *
   * @return {@link int}
   */
  public property get RemainingPublicLineCount() : int {
    var remaining = PublicCommentAvailableLineCountForResponse - this.PublicComments.Count
    return remaining > 0 ? remaining : 0
  }

  /**
   * Returns the count of remaining lines for private comments.
   * It will never returns negative numbers, for values less than 1, the returning value will be 0
   *
   * @return {@link int}
   */
  public property get RemainingPrivateLineCount() : int {
    var remaining = PrivateCommentAvailableLineCountForResponse - this.PrivateComments.Count
    return remaining > 0 ? remaining : 0
  }

  /**
   * Returns the Bureau specific maximum amount of private comments.
   *
   * @return {@link int}
   */
  property get PrivateCommentsLimit() : int {
    switch (this.BureauType) {
      case ECFBureauType_Ext.TC_LIRMA:
        return ECFConstants.PRIVATE_COMMENTS_LIMIT_LIRMA
      case ECFBureauType_Ext.TC_LLOYDS:
      case ECFBureauType_Ext.TC_ILU:
      default:
        return ECFConstants.PRIVATE_COMMENTS_LIMIT
    }
  }

  /**
   * Returns the available response codes for this response object.
   *
   * @return {@link java.util.List}<{@link typekey.ECFResponseCode_Ext}>
   */
  property get AvailableResponseCodes() : List<ECFResponseCode_Ext> {
    switch (this.BureauType) {
      case ECFBureauType_Ext.TC_LIRMA:
        return this.LeadResponse ? LirmaLeadResponseKeys : LirmaSAPResponseKeys
      case ECFBureauType_Ext.TC_LLOYDS:
        return this.LeadResponse ? LloydsLeadResponseCodes : LloydsSAPResponseCodes
      case ECFBureauType_Ext.TC_ILU:
        return ECFResponseCode_Ext.TF_ILU.TypeKeys
      default:
        return ECFResponseCode_Ext.AllTypeKeys
    }
  }

  /**
   * Returns the available response codes for a Lloyds Lead Role,
   * filtered by First Advice or Settlement.
   *
   * @return {@link java.util.List}<{@link typekey.ECFResponseCode_Ext}>
   */
  private property get LloydsLeadResponseCodes() : List<ECFResponseCode_Ext> {
    if (this.TransactionType.IsAdvice) {
      return ECFResponseCode_Ext.TF_LLOYDSLEADADVICE.TypeKeys
    } else {
      return ECFResponseCode_Ext.TF_LLOYDSLEADSETTLEMENT.TypeKeys
    }
  }

  /**
   * Returns the available response codes for a Lloyds AgreementParty Role,
   * filtered by First Advice or Settlement.
   *
   * @return {@link java.util.List}<{@link typekey.ECFResponseCode_Ext}>
   */
  private property get LloydsSAPResponseCodes() : List<ECFResponseCode_Ext> {
    if (this.TransactionType.IsAdvice) {
      return ECFResponseCode_Ext.TF_LLOYDSSAPADVICE.TypeKeys
    } else {
      return ECFResponseCode_Ext.TF_LLOYDSSAPSETTLEMENT.TypeKeys
    }
  }

  /**
   * Returns the available response codes for a LIRMA Lead,
   * filtered by whether the Lead Actions were selected or not
   *
   * @return {@link java.util.List}<{@link typekey.ECFResponseCode_Ext}>
   */
  private property get LirmaLeadResponseKeys() : List<ECFResponseCode_Ext> {
    if (this.LIRMALeadActions) {
      return this.ClaimDataResponded.LirmaLeadCirculated ? ECFResponseCode_Ext.TF_LIRMALEADCIRCULATED.TypeKeys : ECFResponseCode_Ext.TF_LIRMALEAD.TypeKeys
    } else {
      return LirmaSAPResponseKeys
    }
  }

  /**
   * Returns the available response codes for a LIRMA Agreement Party Role,
   * filtered by First Advice or Settlement.
   *
   * @return {@link java.util.List}<{@link typekey.ECFResponseCode_Ext}>
   */
  private property get LirmaSAPResponseKeys() : List<ECFResponseCode_Ext> {
    if (this.TransactionType.IsAdvice) {
      return ECFResponseCode_Ext.TF_LIRMASAPADVICE.TypeKeys
    } else {
      return ECFResponseCode_Ext.TF_LIRMASAPSETTLEMENT.TypeKeys
    }
  }

  /**
   * States if this is a LIRMA response.
   *
   * @return {@link boolean}
   */
  property get LirmaResponse() : Boolean {
    return this.BureauType == ECFBureauType_Ext.TC_LIRMA
  }

  /**
   * States if this is a Lead response.
   *
   * @return {@link boolean}
   */
  property get LeadResponse() : boolean {
    return this.ParticipantFunction == ECFParticipantFunction_Ext.TC_LEAD
  }

  /**
   * States if this is an Agreement Party response.
   *
   * @return {@link boolean}
   */
  property get AgreementPartyResponse() : boolean {
    return this.ParticipantFunction == ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
  }

  /**
   * Returns a validation message if public comment and private comment are not entered or
   * public comment max limit exceeds
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  public function validatePublicComments() : String {
    return validateAtLeastOneComment()?:validatePublicMaxLineLimit()
  }

  /**
   * Returns a validation message if public comment is not editable and private comment is not entered or
   * private comment max limit exceeds
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  public function validatePrivateComments() : String {
    return validateAtLeastOnePrivateComment()?:validatePrivateMaxLineLimit()
  }

  /**
   * Returns a validation message if we don't have at least one public or private comment.
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  public function validateAtLeastOneComment() : String {
    if (this.PublicComments.IsEmpty and this.PrivateComments.IsEmpty) {
      if (this.LirmaResponse) {
        return ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_COMMENT.toString()
      }

      return ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_PUBLIC_COMMENT_OR_ONE_PRIVATE_COMMENT.toString()
    }

    return null
  }

  /**
   * Returns a validation message if public comment is not editable and no private comment has entered.
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  private function validateAtLeastOnePrivateComment() : String {
    if (not this.PublicCommentEditable and this.PrivateComments.IsEmpty) {
      return ECFErrorCodeType.ECF_RESPONSE_NEEDS_AT_LEAST_ONE_PUBLIC_COMMENT_OR_ONE_PRIVATE_COMMENT.toString()
    }

    return null
  }

  /**
   * Returns a validation message if public comment max line limit exceeds.
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  private function validatePublicMaxLineLimit() : String {
    if (PublicCommentAvailableLineCountForResponse < this.PublicComments.Count) {
      if (this.LirmaResponse) {
        return ECFErrorCodeType.ECF_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
            .prepareMessage({String.valueOf(this.PublicCommentAvailableLineCountForResponse)}).toString()
      }

      return ECFErrorCodeType.ECF_PUBLIC_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
          .prepareMessage({String.valueOf(this.PublicCommentAvailableLineCountForResponse)}).toString()
    }

    return null
  }

  /**
   * Returns a validation message if private comment max line limit exceeds.
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  private function validatePrivateMaxLineLimit() : String {
    if (PrivateCommentAvailableLineCountForResponse < this.PrivateComments.Count) {
      return ECFErrorCodeType.ECF_PRIVATE_COMMENTS_MAXIMUM_LINES_EXCEEDED.MessageFormatter
          .prepareMessage({String.valueOf(PrivateCommentAvailableLineCountForResponse)}).toString()
    }

    return null
  }

  /**
   * States if a RequestToBroker is mandatory in this response.
   *
   * @return {@link boolean}
   */
  property get RequestToBrokerMandatory() : boolean {
    return this.ResponseCode == ECFResponseCode_Ext.TC_NO
        or this.ResponseCode == ECFResponseCode_Ext.TC_INF
        or this.ResponseCode == ECFResponseCode_Ext.TC_DIS
  }

  /**
   * Sets the CategoryCode
   * It is mandatory for Lirma Lead and only applicable for Lirma Lead, so no option for null value.
   *
   * @param {@link entity.ECFClaimCategoryCode_Ext} categoryCode
   */
  property set CategoryCodeTypeKey(categoryCode : ECFClaimCategoryCode_Ext) {
    this.CategoryCode = categoryCode
  }

  /**
   * Gets the CategoryCode, if it is null, gets the one from {@link ECFMessageClaimData_Ext}.
   *
   * @return {@link entity.ECFClaimCategoryCode_Ext} categoryCode
   */
  property get CategoryCodeTypeKey() : ECFClaimCategoryCode_Ext {
    this.CategoryCode = this.CategoryCode?:this.ClaimDataResponded.CategoryCode
    return this.CategoryCode
  }

  /**
   * Sets the SubCategoryCode
   * It is mandatory for Lirma Lead and only applicable for Lirma Lead, so no option for null value.
   *
   * @param {@link entity.ECFClaimSubCatCode_Ext} subCategoryCode
   */
  property set SubCategoryCodeTypeKey(subCategoryCode : ECFClaimSubCatCode_Ext) {
    this.SubCategoryCode = subCategoryCode
  }

  /**
   * Gets the CategoryCode, if it is null, gets the one from {@link ECFMessageClaimData_Ext}.
   *
   * @return {@link entity.ECFClaimSubCatCode_Ext} subCategoryCode
   */
  property get SubCategoryCodeTypeKey() : ECFClaimSubCatCode_Ext {
    this.SubCategoryCode = this.SubCategoryCode?:this.ClaimDataResponded.SubCategoryCode
    return this.SubCategoryCode
  }

  /**
   * Performs business validations on this ClaimResponse message
   * Sends this ClaimResponse message by passing the entity to
   * the Interceptor manager.
   */
  public function sendResponse() {
    checkForClassUserIdAndAccountCode()
    if (not checkFinancialAuthorisation()) {
      new ECFActivityCreationService().createActivityForClaimResponseAuthorisation(this)
      this.Status = ECFMessageStatus_Ext.TC_FINANCIALAUTHORISATION
      return
    }
    InterceptorManager.intercept(this)
  }

  /**
   * Gets the activities associated to the approval of this message.
   *
   * @return zero or more Activities of type Approval
   */
  property get ApprovalHistory(): Activity[] {
    return this.Activities.where(\elt -> elt.Type == ActivityType.TC_APPROVAL)
  }

  /**
   * Validates that the Contact Class User ID and
   * Account Code exist.
   * <p>
   * Throws an exception if they do not.
   */
  private function checkForClassUserIdAndAccountCode() {
    if (GosuStringUtil.isBlank(this.ContactClassUserId)
        or GosuStringUtil.isBlank(this.ContactClassAccountId)) {
      throw new ECFException(ECFErrorCodeType.ECF_CLASS_USERID_AND_ACCOUNTCODE_MANDATORY_ERROR)
    }
  }

  /**
   * Validates that the user sending this response is authorised to agree to a reserve of this amount
   * Only applies to Agree responses
   */
  public function checkFinancialAuthorisation() : boolean {
    if (not this.Agreement) {
      return true
    }

    return new FinancialAuthorisationService().isMessageAuthorised(this)
  }

  /**
   * Get the carrier's share of the financials on this transaction for a given currency
   *
   * @param ccy - the currency to convert the total summed amount to
   * @return the total summed amount on this Transaction, including new values in this response and existing values on the Transaction
   */
  public function carrierShareOfTransactionFinancialsInCurrency(ccy : Currency) : CurrencyAmount {
    return ECFClaimResponseFinancialCalculator.getMessageSum(this, ccy)
  }

  /**
   * Processes preconditions in the before validate trigger of the Response PCF page
   */
  public function processBeforeValidate() {
    clearLirmaLeadUnusedActions()
    populateLeadContacts()
  }

  /**
   * For a LIRMA Lead Response, it is possible to select whether to respond with Lead Actions or SAP Actions.
   * This method will clear the fields for the option that was not selected.
   */
  private function clearLirmaLeadUnusedActions() {
    if (this.LirmaResponse and this.LeadResponse) {
      if (this.LirmaLeadWithCompanyActions) {
        clearLirmaLeadActions()
      } else {
        clearLirmaSAPActions()
      }
    }
  }

  private function clearLirmaLeadActions() {
    var currentUser = User.util.CurrentUser

    ClaimResponseRqEntityMapper.mapContactFields(this, currentUser)
    this.ClassOfBusiness = null
    this.CategoryCode = null
    this.SubCategoryCode = null
    this.CedantInLiquidationIndicator = null
    this.SimultaneousRIPIndicator = null
    this.MinorPrecautionaryIndicator = null
    this.ChaseUpIndicator = null
    this.ChaseUpIndicatorInterval = null
    this.ContractConditionsApplyInd = null
    this.AllUnderwritersToSeeFileInd = null
    this.PublicComments.each(\comment -> comment.remove())

    ClaimResponseRqEntityMapper.createLeadClaimEntryAmounts(this, this.ClaimDataResponded)
    this.ImportedServicesNarrative1 = null
  }

  private function clearLirmaSAPActions() {
    this.InsurerOrReinsurerClaimRef1 = null
    this.InsurerOrReinsurerClaimRef2 = null
    this.RequestToBroker1 = null
    this.RequestToBroker2 = null
    this.PrivateFootnote = null
    this.NoFurtherResponseIndicator = null
    this.ImmediatePartCollectionInd = null
    this.MultipleResponseIndicator = null
  }


  /**
   * Populates the entity's Lead Contacts fields when we are responding to a First Advice
   */
  protected function populateLeadContacts() {
    final var leadsResponseToFirstAdvice = this.LeadResponse and this.TransactionType.FirstAdvice

    if (leadsResponseToFirstAdvice and not this.LirmaLeadWithCompanyActions) {
      this.LeadContactName = this.ContactName
      this.LeadContactEmail = this.ContactEmail
      this.LeadContactTelephone = this.ContactTelephone
    }
  }

  /**
   * Returns the available TriageCategories based on the ClaimsScheme
   * and what was previously set on this transaction.
   *
   * @param {@link ECFMessageClaimData_Ext} ecfClaimData
   * @return {@link java.util.List}<{@link entity.ECFMessageClaimData_Ext}>
   */
  public function getAvailableTriageCategories(ecfClaimData : ECFMessageClaimData_Ext) : List<ECFTriageCode_Ext> {
    var keyList = this.ClaimsScheme == ECFScheme_Ext.TC_2006ANDPRIOR ? ECFTriageCode_Ext.TF_2006ANDPRIOR.getTypeKeys() : ECFTriageCode_Ext.TF_2010.getTypeKeys()
    return keyList.where(\elt -> elt != ecfClaimData.TriageCategory)
  }

  /**
   * Returns if the Class of Business field is required. Currently this field is only required for LIRMA and ILU when the Claim is not in Bulk Mode.
   *
   * @return {@link java.lang.Boolean} Class of Business is required
   */
  public property get ClassOfBusinessRequired() : Boolean {
    switch (this.BureauType) {
      case ECFBureauType_Ext.TC_LIRMA:
      case ECFBureauType_Ext.TC_ILU:
        return this.ClaimDataResponded.ClaimType != ECFClaimTypeCode_Ext.TC_001
      default:
        return false
    }
  }

  /**
   * Gets the Private Comments on this Claim Data message, separated by new line for display on the UI
   */
  property get NewPrivateComments() : String {
    return getFormattedComments(this.PrivateComments)
  }

  /**
   * Gets the Public Comments on this Claim Data message, separated by new line for display on the UI
   */
  property get NewPublicComments() : String {
    return getFormattedComments(this.PublicComments)
  }

  private function getFormattedComments(comments : ECFMessageComment_Ext[]) : String {
    var sb = new StrBuilder()
    comments.sortBy(\comment -> comment.LineNumber).each(\comment -> sb.appendln(comment.Detail))
    return sb.toString()
  }

  /**
   * Set new private comments from the UI. This takes all new comments in as a single string, and then seperates them
   * into Comment Lines on each new line, and at each 70 characters, as per data dictionary. Also removes any blank lines.
   *
   * @param comments
   */
  public property set NewPrivateComments(comments : String) {
    this.PrivateComments.each(\comment -> comment.remove())

    if (Strings.isNullOrEmpty(comments)) {
      return
    }

    var splitComments = splitCommentsText(comments)

    for (comment in splitComments index idx) {
      if (not comment.isEmpty()) {
        var newComment = new ECFMessagePrivateComment_Ext()
        newComment.Detail = comment
        newComment.LineNumber = idx + 1
        this.addToPrivateComments(newComment)
      }
    }
  }

  /**
   * Set new public comments from the UI. This takes all new comments in as a single string, and then seperates them
   * into Comment Lines on each new line, and at each 70 characters, as per data dictionary. Also removes any blank lines.
   *
   * @param comments
   */
  public property set NewPublicComments(comments : String) {
    this.PublicComments.each(\comment -> comment.remove())

    if (Strings.isNullOrEmpty(comments)) {
      return
    }

    var splitComments = splitCommentsText(comments)

    for (comment in splitComments index idx) {
      if (not comment.isEmpty()) {
        var newComment = new ECFMessagePublicComment_Ext()
        newComment.Detail = comment
        newComment.LineNumber = idx + 1
        this.addToPublicComments(newComment)
      }
    }
  }

  private function splitCommentsText(comments : String) : ArrayList<String> {
    var splitComments = new ArrayList<String>()
    var commentNewLines = Splitter.onPattern(ECFConstants.PCF_COMMENT_LINE_SEPERATOR).split(comments).toTypedArray()
    commentNewLines.each(\comment -> splitComments.addAll(splitCommentLine(comment, ECFConstants.COMMENT_LINE_CHAR_LIMIT)))
    return splitComments
  }

  private function splitCommentLine(line : String, limit : Integer) : List<String> {
    var splitComments = new ArrayList<String>()
    var lineBuilder = new StringBuilder()
    var lineWeight = 0

    line.trim().split("").each(\character -> {
      final var characterWeight = ECFConstants.COMMENTS_XML_CHARACTERS_WEIGHT.getOrDefault(character, 1)
      lineWeight += characterWeight

      if (lineWeight > limit) {
        splitComments.add(lineBuilder.toString())
        lineBuilder.setLength(0)
        lineWeight = characterWeight
      }

      lineBuilder.append(character)
    })
    splitComments.add(lineBuilder.toString())

    return splitComments.map(\elt -> elt.trim())
  }

  /**
   * Returns a validation message if any Uber precautionary validation fail.
   * <p>
   * Otherwise returns null
   *
   * @return {@link java.lang.String} Validation message or null
   */
  public function validateUberPrecautionary() : String {
    return new UberPrecautionaryService(this).validateDataIntegrityForUberClaim()
  }

  /**
   * Returns true if claim response must have comments but they are full already.
   * <p>
   * Otherwise returns false
   *
   * @return {@link boolean}
   */
  public function commentsLimitReachedByIncomingMessage() : boolean {
    return this.ClaimDataResponded.Respondable
        and not responseSendAvailable()
  }

  /**
   * Returns true when there is editable comment or comment is not mandatory
   * <p>
   * Otherwise returns false
   *
   * @return {@link boolean}
   */
  public function responseSendAvailable() : boolean {
    final var lirmaAgreementParty = this.LirmaResponse and this.AgreementPartyResponse

    return this.PublicCommentEditable
        or this.PrivateCommentEditable
        or lirmaAgreementParty
        or this.LirmaLeadWithCompanyActions
  }

  /**
   * Indicates if this is a LIRMA Lead responding with Company Actions
   *
   * @return {@link Boolean}
   */
  property get LirmaLeadWithCompanyActions(): Boolean {
    return this.LirmaResponse and this.LeadResponse and not this.LIRMALeadActions
  }

  /**
   * Returns the Participant Function Role that should be displayed in the outbound XML message.
   * Currently returns the ParticipantFunction field, except when we are responding as a LIRMA Lead with Company Actions.
   *
   * @return ECFParticipantFunction_Ext
   */
  property get RespondAsParticipantFunction() : ECFParticipantFunction_Ext {
    return this.LirmaLeadWithCompanyActions ? ECFParticipantFunction_Ext.TC_AGREEMENTPARTY : this.ParticipantFunction
  }

  /**
   * Gets the most recent currently open Approval Activity for this message.
   *
   * @return the open Approval Activity or null if none found.
   */
  property get ApprovalActivity() : Activity {
    return this.ApprovalHistory.orderBy(\act -> act.CreateTime)
        .lastWhere(\act -> not act.Complete and not act.Rejected and not act.Approved)
  }
}
