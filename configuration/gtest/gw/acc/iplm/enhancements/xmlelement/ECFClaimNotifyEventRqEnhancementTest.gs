package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class ECFClaimNotifyEventRqEnhancementTest extends GUnitTestClass {
  var claimNotifyXML = ECFMessageUtil.createNewClaimNotifyRq()
  var respondErrorNotifyXML = ECFMessageUtil.createNewRespondErrorNotifyRq()
  var transactionErrorNotifyXML = ECFMessageUtil.createNewTransactionErrorNotifyRq()

  function testClaimsScheme2010() {
    claimNotifyXML.ClaimMovement.Extension.Claim.ClaimsScheme = "2010"
    assertEquals(ECFScheme_Ext.TC_2010, claimNotifyXML.ClaimsScheme)
  }

  function testClaimsScheme2006() {
    claimNotifyXML.ClaimMovement.Extension.Claim.ClaimsScheme = "2006 and prior"
    assertEquals(ECFScheme_Ext.TC_2006ANDPRIOR, claimNotifyXML.ClaimsScheme)
  }

  function testIsECFRespondError() {
    assertTrue(respondErrorNotifyXML.isECFRespondError())
  }

  function testIsECFRespondError_false() {
    assertFalse(claimNotifyXML.isECFRespondError())
    assertFalse(transactionErrorNotifyXML.isECFRespondError())
  }

  function testisECFTransactionError() {
    assertTrue(transactionErrorNotifyXML.isECFTransactionError())
  }

  function testisECFTransactionError_false() {
    assertFalse(claimNotifyXML.isECFTransactionError())
    assertFalse(respondErrorNotifyXML.isECFTransactionError())
  }

  function testHasErrorsAndWarnings_transactionError() {
    assertTrue(transactionErrorNotifyXML.hasErrorsAndWarnings())
  }

  function testHasErrorsAndWarnings_respondError() {
    assertTrue(respondErrorNotifyXML.hasErrorsAndWarnings())
  }

  function testHasErrorsAndWarnings_false() {
    assertFalse(claimNotifyXML.hasErrorsAndWarnings())
  }

  function testHasAdditionalInformation() {
    assertTrue(transactionErrorNotifyXML.hasAdditionalInformation())
  }

  function testHasAdditionalInformation_false() {
    assertFalse(claimNotifyXML.hasAdditionalInformation())
    assertFalse(respondErrorNotifyXML.hasAdditionalInformation())
  }
}