package gw.acc.iplm.enhancements.entity

uses gw.api.locale.DisplayKey

enhancement ECFMessageResponseAcknowledgement_ExtEnhancement: ECFMessageResponseAcknowledgement_Ext {

  /**
   * Returns a formatted error message with the error code and the response description
   *
   * @return Error Message: String
   */
  property get ErrorMessage(): String {
    return this.ErrorCode == null ? null : DisplayKey.get("Accelerator.IPLM.Error.FormatWithErrorCode", this.ErrorCode, this.ResponseDescription)
  }

  /**
   * Returns a boolean indicating if the acknowledgment status of the transaction is rejected.
   *
   * @return Rejected: boolean
   */
  property get IsRejected(): boolean {
    return this.AcknowledgementStatus == ECFAcknowledgementStatus_Ext.TC_REJECTED
  }

  /**
   * Returns a boolean indicating if the acknowledgment status indicates this response did not contain any Claim Data
   *
   * @return HasNoClaimData: boolean
   */
  property get HasNoClaimData(): boolean {
    return ECFAckLevelCode_Ext.TF_NOCLAIMDATA.TypeKeys.contains(this.AckLevel)
  }
}
