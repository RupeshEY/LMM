package gw.acc.iplm.enhancements.entity

uses gw.acc.iplm.exception.lm.LMErrorCodeType

uses java.math.BigDecimal
uses java.math.MathContext
uses java.math.RoundingMode

enhancement LMMessageLloydsSCM_ExtEnhancement : LMMessageLloydsSCM_Ext {

  /**
   * Returns if the suspended SCM message can be applied to a Policy.
   * Note: Non-suspended messages will always return false.
   *
   * @return boolean Can be applied to a Policy
   */
  property get ApplicableToPolicy() : boolean {
    return this.Suspended
        and this.ValidationErrorCode == LMErrorCodeType.UCR_AND_POLICY_NUMBER_NOT_FOUND.ErrorCode
  }

  /**
   * Returns the sum of the PaidThisTimeFees to the PaidThisTimeIndemnity.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumPaidThisTime() : BigDecimal {
    if (this.PaidThisTimeIndemnity_amt == null) {
      return this.PaidThisTimeFees_amt
    } else if (this.PaidThisTimeFees_amt == null) {
      return this.PaidThisTimeIndemnity_amt
    } else {
      return this.PaidThisTimeFees_amt + this.PaidThisTimeIndemnity_amt
    }
  }

  /**
   * Returns the sum of the PaidToDateFees to the PaidToDateIndemnity.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumPaidToDate() : BigDecimal {
    if (this.PaidToDateIndemnity_amt == null) {
      return this.PaidToDateFees_amt
    } else if (this.PaidToDateFees_amt == null) {
      return this.PaidToDateIndemnity_amt
    } else {
      return this.PaidToDateFees_amt + this.PaidToDateIndemnity_amt
    }
  }

  /**
   * Returns the sum of the OutstandingFees to the OutstandingIndemnity.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumOutstandingAmount() : BigDecimal {
    if (this.OutstandingIndemnity_amt == null) {
      return this.OutstandingFees_amt
    } else if (this.OutstandingFees_amt == null) {
      return this.OutstandingIndemnity_amt
    } else {
      return this.OutstandingFees_amt + this.OutstandingIndemnity_amt
    }
  }

  /**
   * Returns the sum of the TotalIncurredFees to the TotalIncurredIndemnity.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumTotalIncurred() : BigDecimal {
    return this.SumTotalIncurredIndemity + this.SumTotalIncurredFees
  }

  /**
   * Returns the sum of all the incurred indemnity amounts.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumTotalIncurredIndemity() : BigDecimal {
    var allIndemities = {this.PaidThisTimeIndemnity_amt, this.PaidToDateIndemnity_amt, this.OutstandingIndemnity_amt}
    return allIndemities.where(\elt -> elt != null).sum()?:0bd
  }

  /**
   * Returns the sum of the TotalIncurredFees to the TotalIncurredIndemnity.
   *
   * @return {@link java.math.BigDecimal}
   */
  property get SumTotalIncurredFees() : BigDecimal {
    var allIndemities = {this.PaidThisTimeFees_amt, this.PaidToDateFees_amt, this.OutstandingFees_amt}
    return allIndemities.where(\elt -> elt != null).sum()?:0bd
  }

  /**
   * Calculates the receiver share of a total amount provided.
   *
   * @return {@link java.math.BigDecimal}
   */
  public function calculateReceiverShare(totalAmount : BigDecimal) : BigDecimal {
    if(totalAmount == null){
      return null
    }

    return (totalAmount * (this.ReceiverShare / 100.00bd)).setScale(2, RoundingMode.HALF_UP) ?: 0.00bd
  }

  /**
   * Returns a string pattern to help format SCM Financial Amounts for display.
   *
   * @return {@link java.lang.String}
   */
  property get FinancialAmountFormatPattern() : String {
    var decFormat = new java.text.DecimalFormat("###,###,###,###,##0.00")
    decFormat.setGroupingSize(3)
    return decFormat.toPattern()
  }
}
