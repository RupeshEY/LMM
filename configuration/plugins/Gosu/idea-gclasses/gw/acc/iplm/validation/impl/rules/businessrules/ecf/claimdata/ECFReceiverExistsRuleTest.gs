package gw.acc.iplm.validation.impl.rules.businessrules.ecf.claimdata

uses gw.acc.iplm.exception.ecfwb.ECFErrorCodeType
uses gw.acc.iplm.testutils.AssertUtils
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class ECFReceiverExistsRuleTest extends GUnitTestClass {

  private var _validation : ECFReceiverExistsRule

  override function beforeMethod() {
    _validation = new ECFReceiverExistsRule()
  }

  function testBothFieldsInMessage() {
    var message = ECFMessageEntityUtil.createClaimNotifyRq()

    assertNotNull(message.ReceiverPartyId)
    assertNotNull(message.ReceiverPartyAgency)

    try {
      _validation.validate(message)
    } catch (e: Exception) {
      fail("Message should be processed successfully. " + e.StackTraceAsString)
    }
  }

  function testPartyIdMissing() {
    var message = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.ReceiverPartyId = null
    }, ECFConstants.ECF_SUPER_USER)

    assertNull(message.ReceiverPartyId)
    assertNotNull(message.ReceiverPartyAgency)
    AssertUtils.assertCausesECFExceptionWithType(\-> _validation.validate(message), ECFErrorCodeType.MISSING_RECEIVER_FIELDS)
  }

  function testPartyAgencyMissing() {
    var message = ECFMessageEntityUtil.createClaimNotifyRq()

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      message = bundle.add(message)
      message.ReceiverPartyAgency = null
    }, ECFConstants.ECF_SUPER_USER)

    assertNotNull(message.ReceiverPartyId)
    assertNull(message.ReceiverPartyAgency)
    AssertUtils.assertCausesECFExceptionWithType(\-> _validation.validate(message), ECFErrorCodeType.MISSING_RECEIVER_FIELDS)
  }
}