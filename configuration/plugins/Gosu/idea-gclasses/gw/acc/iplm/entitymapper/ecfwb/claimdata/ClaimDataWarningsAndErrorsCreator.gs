package gw.acc.iplm.entitymapper.ecfwb.claimdata

uses gw.acc.iplm.dto.ClaimMessageDTO
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs

/**
 * Mapper class for Claim soft warnings, warnings and errors
 */
class ClaimDataWarningsAndErrorsCreator {

  /**
   * Map SoftWarnings from ClaimMovement/Extension/Claim/Indicators/SoftWarnings/SoftWarningDescription</br>
   * Map Warnings and Errors from ErrorsAndWarnings
   *
   * @param claimData The ECFMessageClaimData_Ext to map to
   * @param xmlDto    The ClaimMessageDTO to map from
   */
  public static function createErrorsAndWarnings(final claimData: ECFMessageClaimData_Ext, final xmlDto: ClaimMessageDTO) {
    createSoftWarnings(claimData, xmlDto)
    if (xmlDto._claimNotifyRq != null) {
      createClaimNotifyErrorsWarnings(claimData, xmlDto._claimNotifyRq)
    } else {
      createRetrieveClaimErrorsWarnings(claimData, xmlDto._claimRetrieveRs)
    }
  }

  private static function createSoftWarnings(final claimData: ECFMessageClaimData_Ext, final xmlDto: ClaimMessageDTO) {
    var listOfWarnings = new ArrayList<String>()
    listOfWarnings.addAll(xmlDto._claimNotifyRq?.SoftWarnings ?: xmlDto._claimRetrieveRs?.SoftWarnings ?: {})

    for (warning in listOfWarnings) {
      var softWarning = new ECFMessageSoftWarning_Ext()
      softWarning.Description = warning
      softWarning.ECFMessage = claimData
      claimData.addToSoftWarnings(softWarning)
    }
  }

  /**
   * Map SoftWarnings from ClaimMovement/Extension/Claim/Indicators/SoftWarnings/SoftWarningDescription</br>
   * Map Warnings and Errors from ErrorsAndWarnings
   *
   * @param claimData The ECFMessageClaimData_Ext to map to
   * @param xmlDto    The ClaimNotifyEventRq to map from
   */
  public static function createClaimNotifyErrorsWarnings(final claimData: ECFMessageClaimData_Ext, final claimNotify: ClaimNotifyEventRq) {
    var errorsAndWarnings = claimNotify.ErrorsAndWarnings?.Result

    for (errorOrWarning in errorsAndWarnings) {
      var entityErrorOrWarning = new ECFMessageErrorOrWarning_Ext()
      entityErrorOrWarning.ErrorCode = errorOrWarning.ErrorCode
      entityErrorOrWarning.ErrorType = ECFErrorType_Ext.get(errorOrWarning.ErrorWarningLevel.toString())
      entityErrorOrWarning.Description = errorOrWarning.ErrorWarningDescription
      entityErrorOrWarning.ReferenceMessageUUID = claimData.UUID
      entityErrorOrWarning.ECFMessage = claimData
      claimData.addToErrorsOrWarnings(entityErrorOrWarning)
    }
  }

  /**
   * Map SoftWarnings from ClaimMovement/Extension/Claim/Indicators/SoftWarnings/SoftWarningDescription</br>
   * Map Warnings and Errors from ErrorsAndWarnings
   *
   * @param claimData The ECFMessageClaimData_Ext to map to
   * @param xmlDto    The RetrieveClaimRs to map from
   */
  public static function createRetrieveClaimErrorsWarnings(final claimData: ECFMessageClaimData_Ext, final retrieveClaim: RetrieveClaimRs) {
    var errorsAndWarnings = retrieveClaim.ErrorsAndWarnings?.Result

    for (errorOrWarning in errorsAndWarnings) {
      var entityErrorOrWarning = new ECFMessageErrorOrWarning_Ext()
      entityErrorOrWarning.ErrorCode = errorOrWarning.ErrorCode
      entityErrorOrWarning.ErrorType = ECFErrorType_Ext.get(errorOrWarning.ErrorWarningLevel.toString())
      entityErrorOrWarning.Description = errorOrWarning.ErrorWarningDescription
      entityErrorOrWarning.ReferenceMessageUUID = claimData.UUID
      entityErrorOrWarning.ECFMessage = claimData
      claimData.addToErrorsOrWarnings(entityErrorOrWarning)
    }
  }
}