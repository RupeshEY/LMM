package gw.webservice.cc.cc900.financials

uses gw.api.financials.CheckCreator
uses gw.api.financials.CheckPayeeInfo
uses gw.api.financials.CurrencyAmount
uses gw.api.financials.TransactionApprovalRuleParameters
uses gw.api.server.AvailabilityLevel
uses gw.api.system.CCConfigParameters
uses gw.api.system.CCLoggerCategory
uses gw.api.util.CurrencyUtil
uses gw.api.webservice.cc.financials.TransactionSetApprovalResult
uses gw.api.webservice.exception.BadIdentifierException
uses gw.api.webservice.exception.EntityStateException
uses gw.api.webservice.exception.RequiredFieldException
uses gw.pl.persistence.core.Bundle
uses gw.pl.util.ArgCheck
uses gw.plugin.approval.ApprovalResult
uses gw.transaction.Transaction
uses gw.webservice.cc.cc900.CCWsiEntityApiBase
uses gw.webservice.cc.cc900.dto.ActivityDTO
uses gw.webservice.cc.cc900.dto.CheckDTO
uses gw.webservice.cc.cc900.dto.CheckPayeeDTO
uses gw.webservice.cc.cc900.dto.DocumentDTO
uses gw.webservice.cc.cc900.dto.TransactionDTO
uses gw.webservice.cc.cc900.dto.TransactionLineItemDTO
uses gw.webservice.cc.cc900.dto.TransactionSetDTO
uses gw.xml.ws.annotation.WsiAvailability
uses gw.xml.ws.annotation.WsiCheckDuplicateExternalTransaction
uses gw.xml.ws.annotation.WsiWebService

uses java.lang.RuntimeException
uses java.math.BigDecimal
uses java.util.Arrays
uses java.util.Calendar
uses java.util.Date

@WsiWebService("http://guidewire.com/cc/ws/gw/webservice/cc/cc900/financials/ClaimFinancialsAPI")
@WsiAvailability(AvailabilityLevel.MAINTENANCE)
@Export
class ClaimFinancialsAPI extends CCWsiEntityApiBase {
  private property get Delegate() : gw.api.webservice.cc.financials.ClaimFinancialsAPIImpl {
    return new gw.api.webservice.cc.financials.ClaimFinancialsAPIImpl()
  }

  /**
   * Imports a single transaction set. This method should be used only when
   * financials entry happens outside ClaimCenter. Note that this method
   * executes Validation rules when committing to the database.
   *
   * <p>Only transaction sets with status "approved" are allowed to be imported.
   *
   * <p>All transactions in the transaction set must have a status of
   * "submitted", "pendingvoid", "voided", "pendingstop", "stopped", or
   * "recoded".
   *
   * <p>All checks in the transaction set must have a status of "requested",
   * "pendingvoid", "voided", "pendingstop", "stopped", "issued", or "cleared".
   *
   * @param transactionSetDTO A set of financial transactions for a single
   * claim; all of the transactions must have the same currency. If the
   * reserving currency is not provided on the transaction, this method will
   * assume and set it to the claim currency.
   *
   * @return The public ID of the imported transaction set.
   */
  @Throws(EntityStateException, "If the transaction set contains a transaction or check with an invalid status.")
  @Throws(RequiredFieldException, "If the transaction set contains a check without a scheduled send date.")
  @WsiCheckDuplicateExternalTransaction
  public function importClaimFinancials(transactionSetDTO : TransactionSetDTO) : String {
    ArgCheck.nonNull(transactionSetDTO, "transactionSetDTO")
    ArgCheck.nonNull(transactionSetDTO.ClaimPublicID, "transactionSetDTO.ClaimID")
    var transactionSet : TransactionSet
    var bundle = Transaction.newBundle()
    var transactionSetType = transactionSetDTO.Subtype
    switch (transactionSetDTO.Subtype) {
      case typekey.TransactionSet.TC_CHECKSET:
          transactionSet = assembleCheckSet(transactionSetDTO, bundle).CheckSet
          (transactionSet as CheckSet).Checks.each(\check -> Delegate.validateImportedCheck(check))
          break
      case typekey.TransactionSet.TC_RECOVERYSET:
          transactionSet = assembleRecoverySet(transactionSetDTO, bundle)
          break
      case typekey.TransactionSet.TC_RECOVERYRESERVESET:
          transactionSet = assembleRecoveryReserveSet(transactionSetDTO, bundle)
          break
      case typekey.TransactionSet.TC_RESERVESET:
          transactionSet = assembleReserveSet(transactionSetDTO, bundle)
          break
      default:
          throw new RuntimeException("Unknown value '" + transactionSetType + "' set for TransactionSetDTO.Subtype. Must be " +
            "one of CheckSet, RecoverySet, RecoveryReserveSet or ReserveSet")
    }

    Delegate.addClaimFinancials(transactionSet, null, null, false)
    bundle.commit()

    return transactionSet.PublicID
  }

  /**
   * Imports a single check set. Unlike <code>importClaimFinancials()</code>,
   * this method submits the check set for approval, and fires Transaction
   * Post-Setup rules after the data is approved. This method runs Validation
   * rules twice: before submitting for approval, and when committing to the
   * database.
   *
   * <p>This method should be used as a means to create check sets in an
   * automated way, since it runs the imported data through the same steps as
   * that entered through the UI.
   *
   * @param transactionSetDTO A set of checks for a single claim; all of the
   * checks must have the same currency. If the reserving currency is not
   * provided on the check, this method will assume and set it to the claim
   * currency.
   *
   * @param checkForDuplicateChecks If true, this method will additionally
   * verify if any of the checks being imported are duplicates of already
   * existing checks. If any such duplicates were found, the imported check set
   * will require approval.
   *
   * @return A validation result with details according to its state:
   * <ul>
   *   <li><code>INVALID</code>: The result will just contain a list of
   *     validation errors.
   *   <li><code>VALID_UNAPPROVED</code>: The result will contain the public ID
   *     of the imported check set as well as a list of reasons for approval.
   *   <li><code>VALID_APPROVED</code>: The result will just contain the public
   *     ID of the imported check set.
   * </ul>
   */
  @Throws(RequiredFieldException, "If the transaction set contains a check without a scheduled send date.")
  @WsiCheckDuplicateExternalTransaction
  public function createCheckSet(transactionSetDTO : TransactionSetDTO, checkForDuplicateChecks : boolean) : TransactionSetApprovalResult {
    ArgCheck.nonNull(transactionSetDTO, "transactionSetDTO")
    ArgCheck.nonNull(transactionSetDTO.ClaimPublicID, "transactionSetDTO.ClaimID")

    var transactionSetType = transactionSetDTO.Subtype
    if (transactionSetType != typekey.TransactionSet.TC_CHECKSET) {
      throw new RuntimeException("Incorrect value '" + transactionSetType + "' set for " +
          "TransactionSetDTO.Subtype. Must be set to CheckSet.")
    }
    transactionSetDTO.NewChecks.each( \ elt -> verifyCheckStatusNotSpecified(elt))
    transactionSetDTO.NewChecks*.NewPayments.each( \ elt -> verifyTransactionStatusNotSpecified(elt))

    var bundle = Transaction.newBundle()
    var checkCreator = assembleCheckSet(transactionSetDTO, bundle)

    var checkSet = checkCreator.CheckSet
    var validationResult = checkSet.validate()
    if (validationResult.hasErrors()) {
      return prepareResponseUsingValidationResult(validationResult)
    }

    if (checkForDuplicateChecks) {
      TransactionApprovalRuleParameters.CheckSetRequiresApprovalForDuplicateChecks.set(checkSet, true)
    }

    checkCreator.prepareForCommit()
    var approvalResult = checkCreator.ApprovalResult

    bundle.commit()

    return prepareResponseUsingApprovalResult(checkSet, approvalResult)
  }

  /**
   * Imports a single recovery set. Unlike <code>importClaimFinancials()</code>,
   * this method submits the recovery set for approval, and fires Transaction
   * Post-Setup rules after the data is approved. This method runs Validation
   * rules twice: before submitting for approval, and when committing to the
   * database.
   *
   * <p>This method should be used as a means to create recovery sets in an
   * automated way, since it runs the imported data through the same steps as
   * that entered through the UI.
   *
   * @param transactionSetDTO A set of recoveries for a single claim; all of the
   * recoveries must have the same currency. If the reserving currency is not
   * provided on the recovery, this method will assume and set it to the claim
   * currency.
   *
   * @return A validation result with details according to its state:
   * <ul>
   *   <li><code>INVALID</code>: The result will just contain a list of
   *     validation errors.
   *   <li><code>VALID_UNAPPROVED</code>: The result will contain the public ID
   *     of the imported recovery set as well as a list of reasons for approval.
   *   <li><code>VALID_APPROVED</code>: The result will just contain the public
   *     ID of the imported recovery set.
   * </ul>
   */
  @WsiCheckDuplicateExternalTransaction
  public function createRecoverySet(transactionSetDTO : TransactionSetDTO) : TransactionSetApprovalResult {
    ArgCheck.nonNull(transactionSetDTO, "transactionSetDTO")
    ArgCheck.nonNull(transactionSetDTO.ClaimPublicID, "transactionSetDTO.ClaimID")

    var transactionSetType = transactionSetDTO.Subtype
    if (transactionSetType != typekey.TransactionSet.TC_RECOVERYSET) {
      throw new RuntimeException("Incorrect value '" + transactionSetType + "' set for " +
          "TransactionSetDTO.Subtype. Must be set to RecoverySet.")
    }
    transactionSetDTO.NewRecoveries.each( \ elt -> verifyTransactionStatusNotSpecified(elt))

    var bundle = Transaction.newBundle()
    var recoverySet = assembleRecoverySet(transactionSetDTO, bundle)

    var validationResult = recoverySet.validate()
    if (validationResult.hasErrors()) {
      return prepareResponseUsingValidationResult(validationResult)
    }

    var approvalResult = recoverySet.prepareForCommit()
    bundle.commit()

    return prepareResponseUsingApprovalResult(recoverySet, approvalResult)
  }

  /**
   * Imports a single recovery reserve set. Unlike
   * <code>importClaimFinancials()</code>, this method submits the recovery
   * reserve set for approval, and fires Transaction Post-Setup rules after the
   * data is approved. This method runs Validation rules twice: before
   * submitting for approval, and when committing to the database.
   *
   * <p>This method should be used as a means to create recovery reserve sets in
   * an automated way, since it runs the imported data through the same steps as
   * that entered through the UI.
   *
   * @param transactionSetDTO A set of recovery reserves for a single claim; all
   * of the recovery reserves must have the same currency. If the reserving
   * currency is not provided on the recovery reserve, this method will assume
   * and set it to the claim currency.
   *
   * @return A validation result with details according to its state:
   * <ul>
   *   <li><code>INVALID</code>: The result will just contain a list of
   *     validation errors.
   *   <li><code>VALID_UNAPPROVED</code>: The result will contain the public ID
   *     of the imported recovery reserve set as well as a list of reasons for
   *     approval.
   *   <li><code>VALID_APPROVED</code>: The result will just contain the public
   *     ID of the imported recovery reserve set.
   * </ul>
   */
  @WsiCheckDuplicateExternalTransaction
  public function createRecoveryReserveSet(transactionSetDTO : TransactionSetDTO) : TransactionSetApprovalResult {
    ArgCheck.nonNull(transactionSetDTO, "transactionSetDTO")
    ArgCheck.nonNull(transactionSetDTO.ClaimPublicID, "transactionSetDTO.ClaimID")

    var transactionSetType = transactionSetDTO.Subtype
    if (transactionSetType != typekey.TransactionSet.TC_RECOVERYRESERVESET) {
      throw new RuntimeException("Incorrect value '" + transactionSetType + "' set for " +
          "TransactionSetDTO.Subtype. Must be set to RecoveryReserveSet.")
    }
    transactionSetDTO.NewRecoveryReserves.each( \ elt -> verifyTransactionStatusNotSpecified(elt))

    var bundle = Transaction.newBundle()
    var recoveryReserveSet = assembleRecoveryReserveSet(transactionSetDTO, bundle)

    var validationResult = recoveryReserveSet.validate()
    if (validationResult.hasErrors()) {
      return prepareResponseUsingValidationResult(validationResult)
    }

    var approvalResult = recoveryReserveSet.prepareForCommit()
    bundle.commit()

    return prepareResponseUsingApprovalResult(recoveryReserveSet, approvalResult)
  }

  /**
   * Imports a single reserve set. Unlike <code>importClaimFinancials()</code>,
   * this method submits the reserve set for approval, and fires Transaction
   * Post-Setup rules after the data is approved. This method runs Validation
   * rules twice: before submitting for approval, and when committing to the
   * database.
   *
   * <p>This method should be used as a means to create reserve sets in an
   * automated way, since it runs the imported data through the same steps as
   * that entered through the UI.
   *
   * @param transactionSetDTO A set of reserves for a single claim; all of the
   * reserves must have the same currency. If the reserving currency is not
   * provided on the reserve, this method will assume and set it to the claim
   * currency.
   *
   * @return A validation result with details according to its state:
   * <ul>
   *   <li><code>INVALID</code>: The result will just contain a list of
   *     validation errors.
   *   <li><code>VALID_UNAPPROVED</code>: The result will contain the public ID
   *     of the imported reserve set as well as a list of reasons for approval.
   *   <li><code>VALID_APPROVED</code>: The result will just contain the public
   *     ID of the imported reserve set.
   * </ul>
   */
  @WsiCheckDuplicateExternalTransaction
  public function createReserveSet(transactionSetDTO : TransactionSetDTO) : TransactionSetApprovalResult {
    ArgCheck.nonNull(transactionSetDTO, "transactionSetDTO")
    ArgCheck.nonNull(transactionSetDTO.ClaimPublicID, "transactionSetDTO.ClaimID")

    var transactionSetType = transactionSetDTO.Subtype
    if (transactionSetType != typekey.TransactionSet.TC_RESERVESET) {
      throw new RuntimeException("Incorrect value '" + transactionSetType + "' set for " +
          "TransactionSetDTO.Subtype. Must be set to ReserveSet.")
    }
    transactionSetDTO.NewReserves.each( \ elt -> verifyTransactionStatusNotSpecified(elt))

    var bundle = Transaction.newBundle()
    var reserveSet = assembleReserveSet(transactionSetDTO, bundle)

    var validationResult = reserveSet.validate()
    if (validationResult.hasErrors()) {
      return prepareResponseUsingValidationResult(validationResult)
    }

    var approvalResult = reserveSet.prepareForCommit()
    bundle.commit()

    return prepareResponseUsingApprovalResult(reserveSet, approvalResult)
  }

  /**
   * Performs a downstream denial of a check. A denied check can be resubmitted
   * as is, deleted, or left in denied state. <b>Important Note:</b> Only
   * single-payee checks can be denied.
   *
   * @param checkPublicID The public ID of the check to be denied.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function denyCheck(checkPublicID : String) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    check.denyCheck()
    bundle.commit()
  }

  /**
   * Performs a downstream denial of a recovery. A denied recovery can be
   * resubmitted as is, deleted, or left in denied state.
   *
   * @param recoveryPublicID The public ID of the recovery to be denied.
   */
  @Throws(BadIdentifierException, "If no recovery with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function denyRecovery(recoveryPublicID : String) {
    var bundle = Transaction.newBundle()
    var recovery = fetchByPublicID<Recovery>(recoveryPublicID, bundle)
    recovery.denyRecovery()
    bundle.commit()
  }

  /**
   * Issues a stop payment on a check. Offsetting reserves are created only if
   * the payment is not a supplement (since supplement payments never affect
   * open reserves in the first place) and either of the following holds:
   *
   * <ul>
   *   <li>The payment's exposure is closed (open reserves should always be zero
   *     for a closed exposure).
   *   <li>The open reserves for the payment's exposure's cost type is zero.
   * </ul>
   *
   * <p>Offsetting reserves are included in this check's check set. The status
   * of the check and all payments on the check are set to pending stop. The
   * status of any offsetting reserves is set to pending submission.
   *
   * <p>If this check belongs to a check group, then all checks in the group are
   * stopped.
   *
   * <p>This action does not require approval.
   *
   * @param checkPublicID The public ID of the check to stop.
   *
   * @param reason Text to prepend to the comments of the check. May be null.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function stopCheck(checkPublicID : String, reason : String) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    check.prependComment(reason)
    check.stopCheck()
    bundle.commit()
  }

  /**
   * Stops and reissues one check in a check group. Each check in a check group
   * represents one payee (or set of joint payees), and therefore one physical
   * check, for a multi-payee check. This method requires that the following
   * criteria are met:
   *
   * <ul>
   *   <li>The user has the "stop" permission.
   *   <li>The original check is reissuable and has one of these statuses:
   *     "requesting", "requested", "issued", or "notifying".
   *   </ul>
   * </ul>
   *
   * <p>A new, replacement check is created, the status of the original check is
   * set to "pendingstop", and then reissuance proceeds as follows:
   *
   * <ol>
   *   <li>If the original check was the primary check for the check group, the
   *     new check becomes the primary check and the original check is converted
   *     to a secondary check (still in the same check group), and all of the
   *     payments and deductions are moved to the new check.
   *   <li>Regardless of whether the original check already had a check portion,
   *     a new, fixed-amount check portion is created for it so that, in case it
   *     was not already defined by a fixed portion, its amount will not
   *     fluctuate (e.g., if it previously used a percentage portion).
   *   <li>A <code>CheckRpt</code> entity is created for the new check.
   *   <li>On the new check, the check number and issue date are set to null,
   *     the scheduled send date is set to today, and the status is is set to
   *     "awaitingsubmission".
   * </ol>
   *
   * @param checkPublicID The public ID of the check to stop and reissue.
   *
   * @param reason Text to prepend to the comments of the new check. May be
   * null.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function stopAndReissueCheck(checkPublicID : String, reason : String) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    var newCheck = check.createCheckForReissue()
    newCheck.prependComment(reason)
    newCheck.stopAndReissue(check)
    bundle.commit()
  }

  /**
   * Voids a check. Creates offsetting payments to offset each payment on the
   * check. Also creates offsetting reserves if a payment on the check is
   * eroding and either of the following is true:
   *
   * <ul>
   *   <li>The payment's exposure is closed (open reserves should always be zero
   *     for a closed exposure)
   *   <li>Open reserves on the payment's reserve line would become negative
   *     without an offsetting reserve.
   * </ul>
   *
   * <p>Offsetting reserves are included in this check's check set. The status
   * of the check and the original payments on the check are set to
   * "pendingvoid". The offsetting payments are set to "submitting" status. The
   * statuses of any offsetting reserves are also set to "submitting".
   *
   * <p>If this check belongs to a check group, then all checks in the group are
   * voided.
   *
   * <p>This action does not require approval.
   *
   * @param checkPublicID The public ID of the check to void.
   *
   * @param reason Text to prepend to the comments of the check. May be null.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function voidCheck(checkPublicID : String, reason : String) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    check.prependComment(reason)
    check.voidCheck()
    bundle.commit()
  }

  /**
   * Voids and reissues one check in a check group. Each check in a check group
   * represents one payee (or set of joint payees), and therefore one physical
   * check, for a multi-payee check. This method requires that the following
   * criteria are met:
   *
   * <ul>
   *   <li>The user has the "void" permission.
   *   <li>If the check was cleared, the user has the "voidclearedpmt"
   *     permission.
   *   <li>The check is reissuable and has one of these statuses: "requesting",
   *     "requested", "issued", "notifying", or "cleared".
   * </ul>
   *
   * <p>A new, replacement check is created, the status of the original check is
   * set to "pendingvoid", and then reissuance proceeds as follows:
   *
   * <ol>
   *   <li>If the original check was the primary check for the check group, the
   *     new check becomes the primary check and the original check is converted
   *     to a secondary check (still in the same check group), and all of the
   *     payments and deductions are moved to the new check.
   *  <li>Regardless of whether the original check already had a check portion,
   *    a new, fixed-amount check portion is created for it so that, in case it
   *    was not already defined by a fixed portion, its amount will not
   *    fluctuate (e.g., if it previously used a percentage portion).
   *  <li>A <code>CheckRpt</code> entity is created for the new check.
   *  <li>On the new check, the check number and issue date are set to null,
   *    the scheduled send date is set to today, and the status is set to
   *    "awaitingsubmission".
   * </ol>
   *
   * @param checkPublicID The public ID of the check to void and reissue.
   *
   * @param reason Text to prepend to the comments of the new check. May be
   * null.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function voidAndReissueCheck(checkPublicID : String, reason : String) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    var newCheck = check.createCheckForReissue()
    newCheck.prependComment(reason)
    newCheck.voidAndReissue(check)
    bundle.commit()
  }

  /**
   * Updates the status of a check that has been requested by a user in
   * ClaimCenter. For example, this method should be invoked when the status of
   * the check changes from "requested" to "issued". This should be used only
   * when financials entry happens in ClaimCenter.
   *
   * <p>Allowed check status are "issued", "cleared", "voided", and "stopped".
   * The "issued" and "cleared" statuses are not legal options if this check is
   * part of a multi-payee check group that has been voided or stopped.
   *
   * <p>If the check status is changed to "voided" or "stopped", the status on
   * the payments are updated to this, as well.
   *
   * <p>The <code>checkNumber</code> and <code>issueDate</code> parameters are
   * intended to be used when updating the check status to "issued". For other
   * updates, they can be null.
   *
   * <p>Note that if the check is pending stop or pending void and the new
   * status is issued or cleared, the statuses of the check and its payments are
   * updated and a warning activity is created and assigned to the user who
   * attempted to void or stop the check so that the user knows that the check
   * was not voided.
   *
   * @param checkPublicID The public ID of the check to be updated.
   *
   * @param checkNumber Number of the check. Optional; ignored if null.
   *
   * @param issueDate Date the check was issued. Optional; ignored if null.
   *
   * @param status Status of the check. Required; cannot be null.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function updateCheckStatus(checkPublicID : String, checkNumber : String, issueDate : Date, status : TransactionStatus) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    var calendar : Calendar = null
    if (issueDate != null) {
      calendar = Calendar.getInstance()
      calendar.setTime(issueDate)
    }
    check.updateCheckStatus(checkNumber, calendar, status)
    bundle.commit()
  }

  /**
   * Adjusts a check's claim and/or reporting amounts to the specified values.
   * Such adjustments are intended for cases where better values for the amounts
   * are determined later, after the check is created and escalated. For
   * example, if a check is written from a claim-currency bank account, the
   * amount actually deducted from that account's balance will be determined by
   * exchange rates in effect at the time the check clears. This method allows,
   * for example, the claim amounts of the payments to be adjusted to reflect
   * that amount for which the check actually cleared. Null may be passed for
   * <code>newClaimAmount</code> or <code>newReportingAmount</code>, in which
   * case no adjustment is made to that amount. Adjustments are distributed
   * proportionally among the check's payments and their line items. For
   * example, if the check has two payments with two line items each, having
   * claim amounts of $40, $20, $10, and $10 (a total of $80), and
   * <code>newClaimAmount</code> is $100, then the claim amounts will be
   * adjusted to $50, $25, $12.50, and $12.50. In this example, each claim
   * amount was increased by 25% (equal to the total relative increase), and
   * each new claim amount comprises the same fraction of the total as it did
   * before the adjustment. Adjustments to the claim and reporting amounts are
   * independent. If the check's reserving currency is the same as the claim
   * currency, the line item reserving amounts are also adjusted according to
   * <code>newClaimAmount</code>.
   *
   * <p>When this method is called, the system must be configured in
   * multi-currency mode and the check must:
   *
   * <ul>
   *   <li>Have already been escalated and sent downstream but not been canceled
   *     or transferred.
   *   <li>Not be part of a multi-payee (grouped) check.
   * </ul>
   *
   * <p>Foreign exchange adjustments only affect total incurred and total paid
   * calculations. They do not further erode reserves.
   *
   * @param checkPublicID The public ID of the check to receive the foreign
   * exchange adjustment.
   *
   * @param newClaimAmount The value to which the check's claim amount should be
   * adjusted; if null, the claim amount is not adjusted.
   *
   * @param newReportingAmount The value to which the check's reporting amount
   * should be adjusted; if null, the reporting amount is not adjusted.
   */
  @Throws(BadIdentifierException, "If no check with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function applyForeignExchangeAdjustmentToCheck(checkPublicID : String, newClaimAmount : BigDecimal, newReportingAmount : BigDecimal) {
    var bundle = Transaction.newBundle()
    var check = fetchByPublicID<Check>(checkPublicID, bundle)
    check.applyForeignExchangeAdjustment(newClaimAmount, newReportingAmount)
    bundle.commit()
  }

  /**
   * Adjusts a payment's claim and/or reporting amounts to the specified values.
   * Such adjustments are intended for cases where better values for the amounts
   * are determined later, after the check is created and escalated. For
   * example, if a check is written from a claim-currency bank account, the
   * amount actually deducted from that account's balance will be determined by
   * exchange rates in effect at the time the check clears. This method allows,
   * for example, the claim amount of the payment to be adjusted to reflect that
   * amount for which the check actually cleared. Null may be passed for
   * <code>newClaimAmount</code> or <code>newReportingAmount</code>, in which
   * case no adjustment is made to that amount. Adjustments are distributed
   * proportionally among the payment's line items. For example, if the payment
   * has four line items with claim amounts of $40, $20, $10, and $10 (a total
   * of $80), and <code>newClaimAmount</code> is $100, then the claim amounts
   * will be adjusted to $50, $25, $12.50, and $12.50. In this example, each
   * claim amount was increased by 25% (equal to the total relative increase),
   * and each new claim amount comprises the same fraction of the total as it
   * did before the adjustment. Adjustments to the claim and reporting amounts
   * are independent. If the payment's reserving currency is the same as the
   * claim currency, the line item reserving amounts are also adjusted according
   * to <code>newClaimAmount</code>.
   *
   * <p>When this method is called, the system must be configured in
   * multi-currency mode and the payment must:
   *
   * <ul>
   *   <li>Be on a check that has already been escalated and sent downstream but
   *     not been canceled or transferred.
   *   <li>Not have been recoded.
   *   <li>Not be an offset payment.
   *   <li>Not be part of a multi-payee (grouped) check.
   * </ul>
   *
   * <p>Foreign exchange adjustments only affect total incurred and total paid
   * calculations. They do not further erode reserves.
   *
   * @param paymentPublicID The public ID of the payment to receive the foreign
   * exchange adjustment.
   *
   * @param newClaimAmount The value to which the payment's claim amount should
   * be adjusted; if null, the claim amount is not adjusted.
   *
   * @param newReportingAmount The value to which the payment's reporting amount
   * should be adjusted; if null, the reporting amount is not adjusted.
   */
  @Throws(BadIdentifierException, "If no payment with the specified public ID is found.")
  @WsiCheckDuplicateExternalTransaction
  public function applyForeignExchangeAdjustmentToPayment(paymentPublicID : String, newClaimAmount : BigDecimal, newReportingAmount : BigDecimal) {
    var bundle = Transaction.newBundle()
    var payment = fetchByPublicID<Payment>(paymentPublicID, bundle)
    payment.applyForeignExchangeAdjustment(newClaimAmount, newReportingAmount)
    bundle.commit()
  }

  /******************* Internal Methods **********************************/

  //--------------------
  // Assembly methods...
  //--------------------

  private function assembleCheckSet(checkSetDTO: TransactionSetDTO, bundle: Bundle) : CheckCreator {
    verifyCheckSetHasOnlyOneCheck(checkSetDTO)

    var claim = bundle.add(checkSetDTO.Claim)
    var checkDTO = checkSetDTO.NewChecks.single()

    verifyCheckHasAtLeastOnePayment(checkDTO)
    verifyCheckHasScheduledSendDate(checkDTO)

    var newPayments = checkSetDTO.NewChecks*.NewPayments
    var commonTransactionCurrency = newPayments[0].Currency
    var commonReservingCurrency = newPayments[0].ReservingCurrency
    var exchangeRateProvided = (checkSetDTO.NewExchangeRate != null)

    newPayments.each( \ paymentDTO -> {
      defaultReservingCurrencyFromClaimCurrency(paymentDTO, claim.Currency)

      verifyTransactionCurrencySame(paymentDTO, :currencyToMatch = commonTransactionCurrency)

      if (exchangeRateProvided) {
        verifyReservingCurrencySameWhenExchangeRateProvided(paymentDTO, commonReservingCurrency)
        verifyTransactionAndReservingCurrenciesDifferWhenExchangeRateProvided(paymentDTO)
      }
    })

    var firstPaymentDTO = checkDTO.NewPayments[0]

    var firstPaymentFirstLineItemDTO = firstPaymentDTO.NewLineItems[0]

    var checkCreator : CheckCreator

    if (firstPaymentDTO.Exposure != null) {
      var exposure = bundle.add(firstPaymentDTO.Exposure)
      checkCreator = exposure.newCheckCreator()
    } else {
      checkCreator = claim.newCheckCreator()
    }

    checkCreator
        .withCheckAmount(firstPaymentFirstLineItemDTO.TransactionAmount)
        .withCheckCurrency(firstPaymentDTO.Currency)
        .withComments(firstPaymentDTO.Comments)
        .withCostCategory(firstPaymentDTO.CostCategory)
        .withCostType(firstPaymentDTO.CostType)
        .withErodesReserves(not firstPaymentDTO.DoesNotErodeReserves)
        .withLineCategory(firstPaymentFirstLineItemDTO.LineCategory)
        .withMemo(checkDTO.Memo)
        .withPaymentMethod(checkDTO.PaymentMethod)
        .withPaymentType(firstPaymentDTO.PaymentType)
        .withPayTo(checkDTO.PayTo)
        .withReportabilityType(checkDTO.Reportability)
        .withRequestingUser(checkSetDTO.RequestingUser)
        .withReservingCurrency(firstPaymentDTO.ReservingCurrency)
        .withScheduledSendDate(checkDTO.ScheduledSendDate)

    assembleAndAddPayees(checkDTO, checkCreator)

    var check = checkCreator.createCheck()
    checkDTO.writeTo(check)

    verifyCheckHasAtLeastOnePayee(check)

    assembleAndAddPayments(checkDTO.NewPayments, check)
    verifyMultiplePaymentsAllowedIfPresent(check)

    if (exchangeRateProvided) {
      check.TransToReservingExchangeRate = CurrencyUtil.createCustomExchangeRateWithSet(checkSetDTO.NewExchangeRate,
          checkSetDTO.NewExchangeRateDescription, check.Currency, check.ReservingCurrency, check.Bundle)
    }

    var checkSet = check.CheckSet
    checkSetDTO.writeTo(checkSet)

    // CheckCreator computes Deductions once during the createCheck() call only. Since we would have possibly added
    // payments/payees to the check after that, we need to recompute the deductions.
    check.updateReportableAmountAndDeductions();

    assembleAndAddActivities(checkSetDTO.NewActivities, checkSet)
    assembleAndAddDocuments(checkSetDTO.NewDocuments, checkSet)

    associateAllClaimContactsInBundleWithClaim(bundle, claim)

    verifyCheckSetDoesNotExceedReservesIfNotAllowedTo(checkSet)

    return checkCreator
  }

  private function assembleAndAddPayees(checkDTO : CheckDTO, checkCreator : CheckCreator) {
    if (checkDTO.NewPrimaryPayee != null) {
      checkCreator.withPrimaryPayee(createCheckPayeeInfo(checkDTO.NewPrimaryPayee))
    }

    if (checkDTO.NewJointPayees != null) {
      checkDTO.NewJointPayees?.each( \jointPayeeDTO ->
          checkCreator.withJointPayee(createCheckPayeeInfo(jointPayeeDTO))
      )
    }

    if (checkDTO.NewAdditionalPayees != null) {
      checkDTO.NewAdditionalPayees?.each( \additionalPayeeDTO ->
          checkCreator.withJointPayee(createCheckPayeeInfo(additionalPayeeDTO))
      )
    }
  }

  private function assembleAndAddPayments(paymentDTOs : TransactionDTO[], check : Check) {

    paymentDTOs.eachWithIndex( \ paymentDTO, index -> {
      var payment : Payment
      var paymentLineItemsToAdd = paymentDTO.NewLineItems
      var numLineItems = paymentLineItemsToAdd.Count

      if (index == 0) {
        payment = check.Payments.single()
        // First Payment needs special handling, since it (and its first line item) is already added to the Check by the
        // CheckCreator. We only need to process and add any additional line items present on it.
        if (numLineItems > 1) {
          paymentLineItemsToAdd = Arrays.copyOfRange(paymentLineItemsToAdd, 1, numLineItems)
        } else {
          paymentLineItemsToAdd = {}
        }
      } else {
        payment = check.addNewPayment()
      }

      paymentDTO.writeTo(payment)

      payment.findAndSetReserveLine()
      assembleAndAddLineItems(paymentLineItemsToAdd, payment)
    })
  }

  private function assembleRecoverySet(recoverySetDTO : TransactionSetDTO, bundle : Bundle) : RecoverySet {
    var claim = bundle.add(recoverySetDTO.Claim)

    var recoverySet = claim.newRecoverySet()
    recoverySetDTO.writeTo(recoverySet)

    var newRecoveries = recoverySetDTO.NewRecoveries
    var commonTransactionCurrency = newRecoveries[0].Currency
    var commonReservingCurrency = newRecoveries[0].ReservingCurrency
    var exchangeRateProvided = (recoverySetDTO.NewExchangeRate != null)
    var customTransToReservingExchangeRate : ExchangeRate

    newRecoveries.each( \ recoveryDTO -> {
      defaultReservingCurrencyFromClaimCurrency(recoveryDTO, claim.Currency)

      verifyTransactionCurrencySame(recoveryDTO, :currencyToMatch = commonTransactionCurrency)

      if (exchangeRateProvided) {
        verifyReservingCurrencySameWhenExchangeRateProvided(recoveryDTO, commonReservingCurrency)
        verifyTransactionAndReservingCurrenciesDifferWhenExchangeRateProvided(recoveryDTO)
      }

      var recovery = recoverySet.newRecovery(recoveryDTO.Exposure, recoveryDTO.CostType, recoveryDTO.CostCategory,
          recoveryDTO.RecoveryCategory, recoveryDTO.ReservingCurrency)
      recoveryDTO.writeTo(recovery)

      assembleAndAddLineItems(recoveryDTO.NewLineItems, recovery)

      // Process exchange rate, if specified
      if (exchangeRateProvided) {
        if (customTransToReservingExchangeRate == null) {
          customTransToReservingExchangeRate = CurrencyUtil.createCustomExchangeRateWithSet(
              recoverySetDTO.NewExchangeRate, recoverySetDTO.NewExchangeRateDescription, recovery.Currency,
                  recovery.ReservingCurrency, recovery.Bundle)
        }

        recovery.TransToReservingExchangeRate = customTransToReservingExchangeRate
      }
    })

    assembleAndAddActivities(recoverySetDTO.NewActivities, recoverySet)
    assembleAndAddDocuments(recoverySetDTO.NewDocuments, recoverySet)

    associateAllClaimContactsInBundleWithClaim(bundle, claim)

    return recoverySet
  }

  private function assembleRecoveryReserveSet(recoveryReserveSetDTO : TransactionSetDTO, bundle : Bundle)
      : RecoveryReserveSet {
    var claim = bundle.add(recoveryReserveSetDTO.Claim)

    var recoveryReserveSet = claim.newRecoveryReserveSet()
    recoveryReserveSetDTO.writeTo(recoveryReserveSet)

    var newRecoveryReserves = recoveryReserveSetDTO.NewRecoveryReserves
    var commonTransactionCurrency = newRecoveryReserves[0].Currency
    var commonReservingCurrency = newRecoveryReserves[0].ReservingCurrency
    var exchangeRateProvided = (recoveryReserveSetDTO.NewExchangeRate != null)
    var customTransToReservingExchangeRate : ExchangeRate

    newRecoveryReserves.eachWithIndex( \ recoveryReserveDTO, index -> {
      defaultReservingCurrencyFromClaimCurrency(recoveryReserveDTO, claim.Currency)

      verifyTransactionCurrencySame(recoveryReserveDTO, :currencyToMatch = commonTransactionCurrency)

      if (exchangeRateProvided) {
        verifyReservingCurrencySameWhenExchangeRateProvided(recoveryReserveDTO, commonReservingCurrency)
        verifyTransactionAndReservingCurrenciesDifferWhenExchangeRateProvided(recoveryReserveDTO)
      }

      var recoveryReserve = recoveryReserveSet.newRecoveryReserve(recoveryReserveDTO.Exposure,
          recoveryReserveDTO.CostType, recoveryReserveDTO.CostCategory, recoveryReserveDTO.RecoveryCategory,
          recoveryReserveDTO.ReservingCurrency)

      recoveryReserveDTO.writeTo(recoveryReserve)
      assembleAndAddLineItems(recoveryReserveDTO.NewLineItems, recoveryReserve)

      // Process exchange rate, if specified
      if (exchangeRateProvided) {
        if (customTransToReservingExchangeRate == null) {
          customTransToReservingExchangeRate = CurrencyUtil.createCustomExchangeRateWithSet(
              recoveryReserveSetDTO.NewExchangeRate, recoveryReserveSetDTO.NewExchangeRateDescription,
                  recoveryReserve.Currency, recoveryReserve.ReservingCurrency, recoveryReserve.Bundle)
        }

        recoveryReserve.TransToReservingExchangeRate = customTransToReservingExchangeRate
      }
    })

    assembleAndAddActivities(recoveryReserveSetDTO.NewActivities, recoveryReserveSet)
    assembleAndAddDocuments(recoveryReserveSetDTO.NewDocuments, recoveryReserveSet)

    associateAllClaimContactsInBundleWithClaim(bundle, claim)

    return recoveryReserveSet
  }

  private function assembleReserveSet(reserveSetDTO : TransactionSetDTO, bundle : Bundle) : ReserveSet {
    var claim = bundle.add(reserveSetDTO.Claim)

    var reserveSet = claim.newReserveSet()
    reserveSetDTO.writeTo(reserveSet)

    var newReserves = reserveSetDTO.NewReserves
    var commonTransactionCurrency = newReserves[0].Currency
    var commonReservingCurrency = newReserves[0].ReservingCurrency
    var exchangeRateProvided = (reserveSetDTO.NewExchangeRate != null)
    var customTransToReservingExchangeRate : ExchangeRate

    reserveSetDTO.NewReserves.each( \ reserveDTO -> {
      defaultReservingCurrencyFromClaimCurrency(reserveDTO, claim.Currency)

      verifyTransactionCurrencySame(reserveDTO, :currencyToMatch = commonTransactionCurrency)

      if (exchangeRateProvided) {
        verifyReservingCurrencySameWhenExchangeRateProvided(reserveDTO, commonReservingCurrency)
        verifyTransactionAndReservingCurrenciesDifferWhenExchangeRateProvided(reserveDTO)
      }

      var reserve = reserveSet.newReserve(reserveDTO.Exposure, reserveDTO.CostType, reserveDTO.CostCategory,
          reserveDTO.ReservingCurrency)
      reserveDTO.writeTo(reserve)

      assembleAndAddLineItems(reserveDTO.NewLineItems, reserve)

      // Process exchange rate, if specified
      if(exchangeRateProvided) {
        if (customTransToReservingExchangeRate == null) {
          customTransToReservingExchangeRate = CurrencyUtil.createCustomExchangeRateWithSet(
              reserveSetDTO.NewExchangeRate, reserveSetDTO.NewExchangeRateDescription, reserve.Currency,
                  reserve.ReservingCurrency, reserve.Bundle)
        }

        reserve.TransToReservingExchangeRate = customTransToReservingExchangeRate
      }
    })

    assembleAndAddActivities(reserveSetDTO.NewActivities, reserveSet)
    assembleAndAddDocuments(reserveSetDTO.NewDocuments, reserveSet)

    associateAllClaimContactsInBundleWithClaim(bundle, claim)

    return reserveSet
  }

  private function assembleAndAddLineItems(transactionLineItemDTOs: TransactionLineItemDTO[],
                                             transaction: entity.Transaction) {
    verifyMultipleLineItemsAllowedIfPresent(transactionLineItemDTOs)

    transactionLineItemDTOs.each( \ lineItemDTO -> {
      var transactionLineItem = transaction.addNewLineItem(lineItemDTO.TransactionAmount, lineItemDTO.Comments,
          lineItemDTO.LineCategory)
      lineItemDTO.writeTo(transactionLineItem)
    })
  }

  private function assembleAndAddActivities(activityDTOs: ActivityDTO[], transactionSet: TransactionSet) : Activity[] {
    return activityDTOs.map( \ activityDTO -> {
      var activity = activityDTO.writeToNewEntityIn(transactionSet.Bundle)
      transactionSet.addToActivities(activity)

      return activity
    })
  }

  private function assembleAndAddDocuments(documentDTOs: DocumentDTO[], transactionSet: TransactionSet) : Document[] {
    return documentDTOs.map( \ documentDTO -> {
      var document = documentDTO.writeToNewEntityIn(transactionSet.Bundle)
      transactionSet.addLinkedDocument(document)

      return document
    })
  }

  //----------------------
  // Validation methods...
  //----------------------

  private function verifyCheckSetHasOnlyOneCheck(checkSetDTO : TransactionSetDTO) {
    if (checkSetDTO.NewChecks.Count > 1) {
      throw new RuntimeException("Importing of CheckSet with multiple checks is not supported")
    }
  }

  private function verifyCheckHasAtLeastOnePayment(checkDTO : CheckDTO) {
    if (not checkDTO.NewPayments.HasElements) {
      throw new RuntimeException("Check must have at least one payment")
    }
  }

  private function verifyCheckHasScheduledSendDate(checkDTO : CheckDTO) {
    if (checkDTO.ScheduledSendDate == null) {
      throw new RequiredFieldException("The scheduled send date of a check cannot be null");
    }
  }

  private function verifyCheckSetDoesNotExceedReservesIfNotAllowedTo(checkSet : CheckSet) {
    Delegate.verifyPaymentExceedsReservesParameterObeyed(checkSet)
  }

  private function verifyMultiplePaymentsAllowedIfPresent(check : Check) {
    Delegate.validateAllowMultiplePayments(check)
  }

  private function verifyCheckHasAtLeastOnePayee(check : Check) {
    if (not check.Payees.HasElements) {
      throw new RuntimeException("Check must have at least one payee")
    }
  }

  private function verifyCheckStatusNotSpecified(checkDTO : CheckDTO) {
    if (checkDTO.Status != null) {
      throw new RuntimeException("Newly created checks cannot have a status specified.")
    }
  }

  private function verifyTransactionStatusNotSpecified(transactionDTO : TransactionDTO) {
    if (transactionDTO.Status != null) {
      throw new RuntimeException("Newly created transactions cannot have a status specified.")
    }
  }

  private function verifyTransactionCurrencySame(transactionDTO: TransactionDTO, currencyToMatch: Currency) {
    if (currencyToMatch != transactionDTO.Currency) {
      throw new RuntimeException("All Transactions must have the same currency, but multiple ones were " +
          "detected : " + {currencyToMatch, transactionDTO.Currency})
    }
  }

  private function verifyReservingCurrencySameWhenExchangeRateProvided(transactionDTO: TransactionDTO, currencyToMatch: Currency) {
    if (currencyToMatch != transactionDTO.ReservingCurrency) {
      throw new RuntimeException("All Transactions must have the same reserving currency, but multiple " +
          "ones were detected : " + {currencyToMatch, transactionDTO.ReservingCurrency})
    }
  }

  private function verifyTransactionAndReservingCurrenciesDifferWhenExchangeRateProvided(transactionDTO: TransactionDTO) {
    if (transactionDTO.Currency == transactionDTO.ReservingCurrency) {
      throw new RuntimeException("An exchange rate was unnecessarily provided when the transaction currency " +
          "was equal to the reserving currency")
    }
  }

  private function verifyReservingAmountMatchesCalculatedOne(transaction: entity.Transaction,
                                                               exchangeRate: BigDecimal) {
    var reservingCurrency = transaction.ReservingCurrency
    var transactionAmount = transaction.TransactionAmount
    var calculatedReservingAmount = transactionAmount.convert(reservingCurrency, exchangeRate, transaction.RoundingMode)

    if (CurrencyAmount.compareMultiCurrency(transaction.ReservingAmount, calculatedReservingAmount) != 0) {
      CCLoggerCategory.APPLICATION_FINANCIALS.warn("Calculated ReservingAmount " + calculatedReservingAmount +
          " does not equal Transaction ReservingAmount " + transaction.ReservingAmount)
    }
  }

  private function verifyMultipleLineItemsAllowedIfPresent(transactionLineItemDTOs: TransactionLineItemDTO[]) {
    var numLineItems = transactionLineItemDTOs.Count

    if (not CCConfigParameters.AllowMultipleLineItems.Value and numLineItems > 1) {
      throw new RuntimeException("Transaction with " + numLineItems + " line items is not allowed, since " +
          "your system is not configured to allow multiple transaction line items per transaction")
    }
  }

  //-------------------
  // Utility methods...
  //-------------------

  private function defaultReservingCurrencyFromClaimCurrency(transactionDTO : TransactionDTO,
                                                               claimCurrency : Currency) {
    if (transactionDTO.ReservingCurrency == null) {
      transactionDTO.ReservingCurrency = claimCurrency
    }
  }

  private function createCheckPayeeInfo(checkPayeeDTO : CheckPayeeDTO) : CheckPayeeInfo {
    var checkPayeeInfo = new CheckPayeeInfo()
    checkPayeeInfo.withPayee(checkPayeeDTO.ClaimContact.Contact)
        .withPayeeRole(checkPayeeDTO.PayeeType)
        .withDeductionType(checkPayeeDTO.DeductionType)
        .withPercentage(checkPayeeDTO.Percentage)
        .withFixedAmount(checkPayeeDTO.FixedAmount)

    return checkPayeeInfo
  }

  private function associateAllClaimContactsInBundleWithClaim(bundle: Bundle, claim: Claim) {
    bundle.getInsertedBeansOfType(ClaimContact).each( \ claimContact -> {
      claimContact.Claim = claim
    })
  }

  private function prepareResponseUsingValidationResult(validationResult: gw.api.validation.ValidationResult)
      : TransactionSetApprovalResult {
    var transactionSetApprovalResult = new TransactionSetApprovalResult()
    transactionSetApprovalResult.validationFailed(validationResult.ErrorMessages)

    return transactionSetApprovalResult
  }

  private function prepareResponseUsingApprovalResult(transactionSet: TransactionSet, approvalResult: ApprovalResult)
      : TransactionSetApprovalResult {
    var transactionSetApprovalResult = new TransactionSetApprovalResult()
    var transactionSetId = transactionSet.PublicID
    if (approvalResult.RequiresApproval) {
      // approval was required
      transactionSetApprovalResult.unapproved(Arrays.asList(approvalResult.Messages), transactionSetId);
    } else {
      // no approval required
      transactionSetApprovalResult.approved(transactionSetId)
    }

    return transactionSetApprovalResult
  }

}