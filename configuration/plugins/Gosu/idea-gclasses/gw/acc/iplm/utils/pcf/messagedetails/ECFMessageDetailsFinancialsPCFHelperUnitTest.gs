package gw.acc.iplm.utils.pcf.messagedetails

uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimDataFinancial_ExtBuilder
uses gw.acc.iplm.entitymapper.ecfwb.claimdata.ECFMessageClaimNotifyRq_ExtBuilder
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass

class ECFMessageDetailsFinancialsPCFHelperUnitTest extends GUnitTestClass {

  var helperUnderTest : ECFMessageDetailsFinancialsPCFHelper
  static var claimNotifyForTests : ECFMessageClaimNotifyRq_Ext
  var _notifyEntityBuilder = new ECFMessageClaimNotifyRq_ExtBuilder()
  var _financialBuilder = new ECFMessageClaimDataFinancial_ExtBuilder()

  override function beforeMethod(){
    claimNotifyForTests = ECFMessageEntityUtil.createClaimNotifyRq()
    super.beforeMethod()
  }

  public function testConvertOSNDCsvToFormattedOSNDsNullInput() {
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv: String = null
    assertEquals(null, helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsEmptyInput() {
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = ""
    assertEquals("", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsOneInput() {
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "a"
    assertEquals("a", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsMultipleInput() {
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "a,b"
    assertEquals("a\r\nb", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsInput_Lloyds() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LLOYDS
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "1234506122014"
    assertEquals("12345 - 06/12/2014", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsMultipleInput_Lloyds() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LLOYDS
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "1234506122014,5454503072012"
    assertEquals("12345 - 06/12/2014\r\n54545 - 03/07/2012", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsInput_LIRMA() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LIRMA
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "1204227653627"
    assertEquals("7653627 - 22/04/12", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsMultipleInput_LIRMA() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LIRMA
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "1204227653627,1212141237654"
    assertEquals("7653627 - 22/04/12\r\n1237654 - 14/12/12", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsInput_ILU() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_ILU
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "PMC146544560510"
    assertEquals("PM C 654456 - 05/10/14", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testConvertOSNDCsvToFormattedOSNDsConvertsMultipleInput_ILU() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_ILU
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var csv = "PMC146544560510,PMH126738272711"
    assertEquals("PM C 654456 - 05/10/14\r\nPM H 673827 - 27/11/12", helperUnderTest.convertOSNDCsvToFormattedOSNDs(csv))
  }

  public function testFormattedOSND_Lloyds() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LLOYDS
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var osnd = "1234506122014"
    assertEquals("12345 - 06/12/2014", helperUnderTest.formattedOSND(osnd))
  }

  public function testFormattedOSND_LIRMA() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_LIRMA
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var osnd = "1204227653627"
    assertEquals("7653627 - 22/04/12", helperUnderTest.formattedOSND(osnd))
  }

  public function testFormattedOSND_ILU() {
    claimNotifyForTests.BureauType = ECFBureauType_Ext.TC_ILU
    helperUnderTest = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    var osnd = "PMC146544560510"
    assertEquals("PM C 654456 - 05/10/14", helperUnderTest.formattedOSND(osnd))
  }

  public function testDoesNotHasFinancials() {
    var notifyMessage = _notifyEntityBuilder
        .create()
    var helper = new ECFMessageDetailsFinancialsPCFHelper(notifyMessage)

    assertFalse(helper.HasFinancial1)
    assertFalse(helper.HasFinancial2)
    assertFalse(helper.HasFinancial3)
    assertNull(helper.Financial1)
    assertNull(helper.Financial2)
    assertNull(helper.Financial3)
  }

  public function testDoesHaveOneFinancials() {
    var financial1 = _financialBuilder.create()
    var notifyMessage = _notifyEntityBuilder
        .withFinancials({financial1})
        .create()
    var helper = new ECFMessageDetailsFinancialsPCFHelper(notifyMessage)

    assertTrue(helper.HasFinancial1)
    assertFalse(helper.HasFinancial2)
    assertFalse(helper.HasFinancial3)
    assertEquals(helper.Financial1, financial1)
    assertNull(helper.Financial2)
    assertNull(helper.Financial3)
  }

  public function testDoesHaveFinancials() {
    var financial1 = _financialBuilder.withCurrency(Currency.TC_GBP).create()
    var financial2 = _financialBuilder.withCurrency(Currency.TC_EUR).create()
    var financial3 = _financialBuilder.withCurrency(Currency.TC_USD).create()
    var notifyMessage = _notifyEntityBuilder
        .withFinancials({financial1, financial2, financial3})
        .create()
    var helper = new ECFMessageDetailsFinancialsPCFHelper(notifyMessage)

    assertTrue(helper.HasFinancial1)
    assertTrue(helper.HasFinancial2)
    assertTrue(helper.HasFinancial3)
    assertCollectionEquals({helper.Financial1, helper.Financial2, helper.Financial3}, {financial2, financial1, financial3})
  }

  public function testNoInsurerSharePercentage() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claimNotifyForTests = bundle.add(claimNotifyForTests)
      claimNotifyForTests.ECFContractMarkets.firstWhere(\elt -> elt.PartyID == claimNotifyForTests.ReceiverPartyId).InsurerSharePercentage = null
    }, ECFConstants.ECF_SUPER_USER)

    var helper = new ECFMessageDetailsFinancialsPCFHelper(claimNotifyForTests)
    assertFalse("When no InsurerSharePercentage was provided, this should return false", helper.isLessThanFullShare())
  }
}