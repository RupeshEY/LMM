package gw.acc.iplm.enhancements.xmlelement

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFMessageClaimNotifyRq_ExtEnhancementTest extends GUnitTestClass {

  public function testXmlActionCode_NullContent() {
    //WHEN
    var claimNotifyRq = Mockito.mock(ECFMessageClaimNotifyRq_Ext)
    //THEN
    assertEquals(null, claimNotifyRq.XmlActionCode)
  }

  public function testXmlActionCode_NullExplanation() {
    //GIVEN
    var xmlActionCode: String = null

    doTestXmlActionCode(xmlActionCode)
  }

  public function testXmlActionCode() {
    //GIVEN
    var xmlActionCode = "F"

    doTestXmlActionCode(xmlActionCode)
  }

  private function doTestXmlActionCode(xmlActionCode: String) {
    var claimNotifyRq: ECFMessageClaimNotifyRq_Ext
    //WHEN
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyMessage1 = ECFMessageUtil.createNewClaimNotifyRq()
      claimNotifyMessage1.ClaimMovement.Explanation = xmlActionCode
      claimNotifyRq = ECFMessageEntityUtil.createClaimNotifyRq(claimNotifyMessage1)
      claimNotifyRq = bundle.add(claimNotifyRq)
    }, User.util.UnrestrictedUser)

    //THEN
    assertEquals(xmlActionCode, claimNotifyRq.XmlActionCode)
  }

}