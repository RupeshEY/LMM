package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass

class ECFRetrieveClaimRsEnhancementTest extends GUnitTestClass {
  var claimNotifyXML = ECFMessageUtil.createNewClaimRetrieveRs()

  function testClaimsScheme2010() {
    claimNotifyXML.ClaimMovement.Extension.Claim.ClaimsScheme = "2010"
    assertEquals(ECFScheme_Ext.TC_2010, claimNotifyXML.ClaimsScheme)
  }

  function testClaimsScheme2006() {
    claimNotifyXML.ClaimMovement.Extension.Claim.ClaimsScheme = "2006 and prior"
    assertEquals(ECFScheme_Ext.TC_2006ANDPRIOR, claimNotifyXML.ClaimsScheme)
  }
}