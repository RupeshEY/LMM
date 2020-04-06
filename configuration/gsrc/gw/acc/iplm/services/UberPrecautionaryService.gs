package gw.acc.iplm.services

uses gw.acc.iplm.utils.ECFConstants
uses gw.api.locale.DisplayKey
uses gw.pl.currency.MonetaryAmount

/**
 * This service class is responsible for validating Uber Precautionary Claims.
 */
class UberPrecautionaryService {

  private var LOGGER = ECFConstants.LOGGER_BLOCK()

  private static final var NO_ERROR = ""
  private static final var AND = " and "

  private var _claimResponseRq: ECFMessageClaimResponseRq_Ext
  private var _claimData: ECFMessageClaimData_Ext
  private var _financialsZeroError: String
  private var _claimSchemeError: String
  private var _outstandingQualifierError: String

  construct(claimResponseRq: ECFMessageClaimResponseRq_Ext) {
    _claimResponseRq = claimResponseRq
    _claimData = _claimResponseRq.ClaimDataResponded
  }

  /**
   * This method validates certain Uber Precautionary rules before sending Claim response request to CLASS.
   *
   * @return A string with error details, if any Uber Precautionary validation fails otherwise return null
   */
  public function validateDataIntegrityForUberClaim() :String {
    if (isUberPrecautionaryClaim()) {
      var errorMessage = consolidateErrorMessages()
      if (errorMessage.length() > 0) {
        var error = DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.CanNotIdentifyUberPrecautionary", errorMessage)
        LOGGER.debug("Uber Precautionary Claim UI Error: ${error}")
        return error
      }
    }
    return null
  }

  /**
   * This method evaluates that claim response request is for Uber Precutionary claim.
   *
   * @return true if Bureau type is Lloyd's, Role is Lead, Qualifier code is U and transaction type is First Advice
   */
  private function isUberPrecautionaryClaim(): boolean {
    return _claimResponseRq.BureauType == ECFBureauType_Ext.TC_LLOYDS
        and _claimResponseRq.isLeadResponse()
        and _claimResponseRq.OutstandingQualifierCode == ECFOutstandingQualifierCode_Ext.TC_U
        and _claimResponseRq.TransactionType.isFirstAdvice()
  }

  /**
   * This method consolidates error messages, if there are more than one UI errors.
   *
   * @return UI error message
   */
  private function consolidateErrorMessages(): String {
    _financialsZeroError = validateZeroFinancials()
    _claimSchemeError = validateClaimsScheme()
    _outstandingQualifierError = validateOutstandingQualifier()

    var errorMessageBuilder = new StringBuilder()
    errorMessageBuilder.append(_financialsZeroError).
        appendIf(hasApplicableErrors(), ", ").
        appendIf(isFinZeroAndClaimSchemeErrors(), AND).
        appendIf(isFinZeroAndQualifierErrors(), AND).
        append(_claimSchemeError).
        appendIf(hasApplicableErrors(), "," + AND).
        appendIf(isClaimSchemeAndQualifierErrors(), AND).
        append(_outstandingQualifierError)
    return errorMessageBuilder.toString()
  }

  private function hasApplicableErrors(): boolean {
    return _financialsZeroError.length() > 0 and _claimSchemeError.length() > 0 and _outstandingQualifierError.length() > 0
  }

  private function isFinZeroAndClaimSchemeErrors(): boolean {
    return _financialsZeroError.length() > 0 and _claimSchemeError.length() > 0 and _outstandingQualifierError.length() == 0
  }

  private function isFinZeroAndQualifierErrors(): boolean {
    return _financialsZeroError.length() > 0 and _claimSchemeError.length() == 0 and _outstandingQualifierError.length() > 0
  }

  private function isClaimSchemeAndQualifierErrors(): boolean {
    return _financialsZeroError.length() == 0 and _claimSchemeError.length() > 0 and _outstandingQualifierError.length() > 0
  }

  /**
   * This method validates that all the financials are zero (or blank) in Claim Notify/Retrieve.
   * i.e Outstanding_Amount, Previously_Paid_Amount,Incurred_Amount and Lead_Reserve_Amount are all zero (or blank),
   * or Lead_Reserve_Amount is set to zero (or blank) on Claim response screen
   *
   * @return A string with error or an empty string
   */
  private function validateZeroFinancials(): String {
    if (hasNonZeroClaimDataFinancials() or hasNonZeroClaimResponseFinancials()) {
      return DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.FinancialsAreGreaterThanZero")
    }
    return NO_ERROR
  }

  private function hasNonZeroClaimResponseFinancials(): boolean {
    return isZeroAmount(_claimResponseRq.LeadReserveAmount1)
        or isZeroAmount(_claimResponseRq.LeadReserveAmount2)
        or isZeroAmount(_claimResponseRq.LeadReserveAmount3)
  }

  private function hasNonZeroClaimDataFinancials(): boolean {
    return _claimData.Financials.hasMatch(\financial ->
        (
            (isZeroAmount(financial.Outstanding))
                or (isZeroAmount(financial.PreviouslyPaid))
                or (isZeroAmount(financial.Incurred))
        ))
  }

  private function isZeroAmount(monetaryAmount: MonetaryAmount): boolean {
    return monetaryAmount != null and not monetaryAmount.Amount.IsZero
  }

  /**
   * This method validates that claim scheme and triage category are valid for Uber Precautionary in Claim Response Request
   * <p>
   * i.e claims scheme is "2010" and (triage category is Blank, CTP Standard, VCS-XCS or VCS-Crawford) or
   * claims scheme is "2006 and Prior" and (triage category is "Not Specified" or "Standard")
   *
   * @return A string with error or an empty string
   */
  private function validateClaimsScheme(): String {
    if (isInvalid2010ClaimsScheme() or isInvalid2006AndPriorClaimsScheme()) {
      return DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.TriageCategoryIsComplex")
    }
    return NO_ERROR
  }

  private function isInvalid2010ClaimsScheme(): boolean {
    var triageCategory = _claimResponseRq.TriageCategory?:_claimData.TriageCategory
    return _claimResponseRq.ClaimsScheme == ECFScheme_Ext.TC_2010 and
        (triageCategory == ECFTriageCode_Ext.TC_CTP_COMPLEX)
  }

  private function isInvalid2006AndPriorClaimsScheme(): boolean {
    var triageCategory = _claimResponseRq.TriageCategory?:_claimData.TriageCategory
    return _claimResponseRq.ClaimsScheme == ECFScheme_Ext.TC_2006ANDPRIOR and
        (triageCategory == ECFTriageCode_Ext.TC_COMPLEX)
  }

  /**
   * This method validates that outstanding qualifier code is valid for Uber Precautionary in Claim Notify/Retrieve
   * i.e InValid Outstanding Qualifier code are C, R, S, V for Uber Precautionary
   *
   * @return A string with error or an empty string
   */
  private function validateOutstandingQualifier(): String {
    if (isInvalidOutStandingQualiferCode()) {
      return DisplayKey.get("Accelerator.IPLM.UberPrecautionary.Error.InvalidQualifierCode")
    }
    return NO_ERROR
  }

  private function isInvalidOutStandingQualiferCode():boolean {
    return _claimData.OutstandingAmountQualifier == ECFOutstandingQualifierCode_Ext.TC_C
        or _claimData.OutstandingAmountQualifier == ECFOutstandingQualifierCode_Ext.TC_R
        or _claimData.OutstandingAmountQualifier == ECFOutstandingQualifierCode_Ext.TC_S
        or _claimData.OutstandingAmountQualifier == ECFOutstandingQualifierCode_Ext.TC_V
  }
}