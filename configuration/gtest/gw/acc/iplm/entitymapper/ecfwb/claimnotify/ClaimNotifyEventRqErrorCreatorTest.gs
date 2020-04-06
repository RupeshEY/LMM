package gw.acc.iplm.entitymapper.ecfwb.claimnotify


uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.anonymous.elements.ClaimNotifyEventRqType_ErrorsAndWarnings_Result
uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.enums.ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.namespace.QName

class ClaimNotifyEventRqErrorCreatorTest extends GUnitTestClass {

  public static final var CODE1: String = "code1"
  public static final var CODE2: String = "code2"
  public static final var CODE3: String = "code3"
  public static final var THIS_JUST_FAILED1: String = "ThisJustFailed1"
  public static final var THIS_JUST_FAILED2: String = "ThisJustFailed2"
  public static final var THIS_JUST_FAILED3: String = "ThisJustFailed3"
  public static final var THIS_JUST_FAILED4: String = "ThisJustFailed4"
  private var _claimNotifyRq: ECFMessageClaimNotifyRq_Ext
  private var _claimNotifyMessage: ClaimNotifyEventRq

  override function beforeMethod() {
    _claimNotifyMessage = ECFMessageUtil.createNewRespondErrorNotifyRq()
    _claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(_claimNotifyMessage)
  }

  function testCreateErrorsWithNullInput() {
    _claimNotifyMessage.ErrorsAndWarnings?.removeChild(new QName(ClaimNotifyEventRqType_ErrorsAndWarnings_Result.$NAMESPACE.NamespaceURI, ClaimNotifyEventRqType_ErrorsAndWarnings_Result.$QNAME.LocalPart))
    _claimNotifyMessage.ClaimMovement?.Extension?.Claim?.Indicators?.removeChild(new QName(ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings.$NAMESPACE.NamespaceURI, ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings.$QNAME.LocalPart))
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        if (not _claimNotifyMessage.ErrorsAndWarnings.Result.isEmpty()) {
          _claimNotifyMessage.ErrorsAndWarnings?.Result?.each(\xmlErrorOrWarning -> {
            var errorsOrWarning = new ECFMessageErrorOrWarning_Ext(_claimNotifyRq)
            errorsOrWarning.ErrorCode = xmlErrorOrWarning.ErrorCode
            errorsOrWarning.ErrorType = ECFErrorType_Ext.get(xmlErrorOrWarning.ErrorWarningLevel.Value)
            errorsOrWarning.Description = xmlErrorOrWarning.ErrorWarningDescription
            errorsOrWarning.ReferenceMessageUUID = _claimNotifyRq.UUID
            _claimNotifyRq.addToErrorsOrWarnings(errorsOrWarning)
          })

          _claimNotifyMessage.ClaimMovement?.Extension?.Claim?.Indicators?.SoftWarnings?.each(\xmlError -> {
            var softWarning = new ECFMessageSoftWarning_Ext(_claimNotifyRq)
            softWarning.Description = xmlError.SoftWarningsDescription
            _claimNotifyRq.addToSoftWarnings(softWarning)
          })
        }        // nothing happens, no errors
      })
    })
  }

  function testCreateErrors() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var notifyRq = new ECFMessageClaimNotifyRq_ExtBuilder().create()
        final var errorsAndWarningsXml = new ClaimNotifyEventRqType_ErrorsAndWarnings()
        errorsAndWarningsXml.Result = new ArrayList<ClaimNotifyEventRqType_ErrorsAndWarnings_Result>()
        final var resultsXml = errorsAndWarningsXml.Result

        final var error1 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        error1.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        error1.ErrorCode = CODE1
        error1.ErrorWarningDescription = THIS_JUST_FAILED1
        resultsXml.add(error1)

        final var error2 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        error2.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._002
        error2.ErrorCode = CODE2
        error2.ErrorWarningDescription = THIS_JUST_FAILED2
        resultsXml.add(error2)

        final var warning1 = new ClaimNotifyEventRqType_ErrorsAndWarnings_Result()
        warning1.ErrorWarningLevel = ClaimNotifyEventRqType_ErrorsAndWarnings_Result_ErrorWarningLevel._001
        warning1.ErrorCode = CODE3
        warning1.ErrorWarningDescription = THIS_JUST_FAILED3
        resultsXml.add(warning1)

        final var softWarningsXml = new ArrayList<ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings>()

        final var softWarning1 = new ClaimNotifyEventRqType_ClaimMovement_Extension_Claim_Indicators_SoftWarnings()
        softWarning1.SoftWarningsDescription = THIS_JUST_FAILED4
        softWarningsXml.add(softWarning1)

        if (not errorsAndWarningsXml.Result.isEmpty()) {
          errorsAndWarningsXml.Result?.each(\xmlErrorOrWarning -> {
            var errorsOrWarning = new ECFMessageErrorOrWarning_Ext(notifyRq)
            errorsOrWarning.ErrorCode = xmlErrorOrWarning.ErrorCode
            errorsOrWarning.ErrorType = ECFErrorType_Ext.get(xmlErrorOrWarning.ErrorWarningLevel.Value)
            errorsOrWarning.Description = xmlErrorOrWarning.ErrorWarningDescription
            errorsOrWarning.ReferenceMessageUUID = notifyRq.UUID
            notifyRq.addToErrorsOrWarnings(errorsOrWarning)
          })

          softWarningsXml.each(\xmlError -> {
            var softWarning = new ECFMessageSoftWarning_Ext(notifyRq)
            softWarning.Description = xmlError.SoftWarningsDescription
            notifyRq.addToSoftWarnings(softWarning)
          })
        }

        assertEquals(3, notifyRq.ErrorsOrWarnings.length)
        var err1 = notifyRq.ErrorsOrWarnings.firstWhere(\err -> err.ErrorCode == CODE1)
        assertEquals(THIS_JUST_FAILED1, err1.Description)
        assertEquals(ECFErrorType_Ext.TC_002, err1.ErrorType)
        var err2 = notifyRq.ErrorsOrWarnings.firstWhere(\err -> err.ErrorCode == CODE2)
        assertEquals(THIS_JUST_FAILED2, err2.Description)
        assertEquals(ECFErrorType_Ext.TC_002, err2.ErrorType)
        var err3 = notifyRq.ErrorsOrWarnings.firstWhere(\err -> err.ErrorCode == CODE3)
        assertEquals(THIS_JUST_FAILED3, err3.Description)
        assertEquals(ECFErrorType_Ext.TC_001, err3.ErrorType)

        assertEquals(1, notifyRq.SoftWarnings.length)
        var softWarn1 = notifyRq.SoftWarnings[0]
        assertEquals(THIS_JUST_FAILED4, softWarn1.Description)
      })
    })
  }
}