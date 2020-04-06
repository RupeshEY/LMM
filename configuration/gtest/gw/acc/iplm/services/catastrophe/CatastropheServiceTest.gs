package gw.acc.iplm.services.catastrophe

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass


class CatastropheServiceTest extends GUnitTestClass {

  private var catastropheService = new CatastropheService()

  private var dateTest = Date.getCurrentDate().addYears(-2)
  private var claim1: Claim
  private var claim2: Claim
  private var claim3: Claim
  private var claim4: Claim
  private var claim5: Claim
  private var claim6: Claim
  private var claim7: Claim
  private var claim8: Claim
  private var ucrTest_1 = "UCR_1"
  private var ucrTest_2 = "UCR_2"
  private var ucrTest_3 = "UCR_3"
  private var ucrTest_4 = "UCR_4"
  private var ucrTest_5 = "UCR_5"
  private var ucrTest_6 = "UCR_6"
  private var ucrTest_7 = "UCR_7"
  private var ucrTest_8 = "UCR_8"
  private var lcoCodeTest = ECFLCOCategoryCode_Ext.TC_00A
  private var pcsCodeTest = ECFPCSCategoryCode_Ext.TC_H40

  override function beforeMethod() {
    super.beforeMethod()
    deleteAllClaims()
    setUpECFMessagesAndClaims()
  }

  override function afterMethod(t: Throwable) {
    super.afterMethod(t)
    ECFMessageEntityUtil.deleteAllECFMessagesFromDB()
    ECFMessageEntityUtil.deleteAllCatastrophes()
    deleteAllClaims()
  }

  public function testAssociateWithECFClaims_WithLcoCode() {
    //GIVEN
    var cat = buildCatastrophe(lcoCodeTest.Code, null)
    //WHEN
    catastropheService.associateCatastropheWithECFClaims(cat)
    //THEN
    var linkedClaims = getAssociatedClaims(cat.LCOCode)
    assertTrue(cat.hasAssociatedClaims())
    assertEquals(linkedClaims.size(), 6)
    assertTrue(linkedClaims.containsAll({claim1, claim2, claim5, claim6, claim7, claim8}))
    assertEquals(linkedClaims[0].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[1].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[2].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[3].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[4].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[5].Catastrophe.LCOCode, lcoCodeTest.Code)
  }

  public function testAssociateWithECFClaims_WithPcsCode() {
    //GIVEN
    var cat = buildCatastrophe(null, pcsCodeTest.Code)
    //WHEN
    catastropheService.associateCatastropheWithECFClaims(cat)
    //THEN
    var linkedClaims = getAssociatedClaims(cat.PCSCatastropheNumber)
    assertTrue(cat.hasAssociatedClaims())
    assertEquals(linkedClaims.size(), 4)
    assertTrue(linkedClaims.containsAll({claim3, claim4, claim5, claim6}))
    assertEquals(linkedClaims[0].Catastrophe.PCSCatastropheNumber, pcsCodeTest.Code)
    assertEquals(linkedClaims[1].Catastrophe.PCSCatastropheNumber, pcsCodeTest.Code)
    assertEquals(linkedClaims[2].Catastrophe.PCSCatastropheNumber, pcsCodeTest.Code)
    assertEquals(linkedClaims[3].Catastrophe.PCSCatastropheNumber, pcsCodeTest.Code)
  }

  public function testAssociateWithECFClaims_WithLcoAndPcsCode() {
    //GIVEN
    var cat = buildCatastrophe(lcoCodeTest.Code, pcsCodeTest.Code)
    //WHEN
    catastropheService.associateCatastropheWithECFClaims(cat)
    //THEN
    var linkedClaims = getAssociatedClaims(cat.LCOCode)
    assertTrue(cat.hasAssociatedClaims())
    assertEquals(linkedClaims.size(), 6)
    assertTrue(linkedClaims.containsAll({claim1, claim2, claim5, claim6, claim7, claim8}))
    assertEquals(linkedClaims[0].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[1].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[2].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[3].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[4].Catastrophe.LCOCode, lcoCodeTest.Code)
    assertEquals(linkedClaims[5].Catastrophe.LCOCode, lcoCodeTest.Code)
  }

  public function testAssociateWithECFClaims_WithLcoAndPcsCodeNotFound() {
    //GIVEN
    var cat = buildCatastrophe(ECFLCOCategoryCode_Ext.TC_00C.Code, ECFPCSCategoryCode_Ext.TC_Y39.Code)
    //WHEN
    catastropheService.associateCatastropheWithECFClaims(cat)
    //THEN
    var linkedClaims = getAssociatedClaims(cat.LCOCode)
    assertFalse(cat.hasAssociatedClaims())
    assertTrue(linkedClaims.Empty)
  }

  public function testAssociateCatastropheWithECFClaims_NoLcoAndPcsCode() {
    //GIVEN
    var cat = buildCatastrophe(null, null)

    //WHEN
    catastropheService.associateCatastropheWithECFClaims(cat)

    //THEN
    var associatedClaims = getAssociatedClaims(cat)
    assertZero(associatedClaims.Count)
  }

  private function setUpECFMessagesAndClaims() {
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var claimNotifyRq_Ucr1 = buildMessageClaimData(ECFMessageEntityUtil.createClaimNotifyRq(), ucrTest_1, lcoCodeTest, null)
      claim1 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim1.UCR_Ext = ucrTest_1
      claim1.addToLMMessages(claimNotifyRq_Ucr1)

      var claimRetrieve_Ucr2 = buildMessageClaimData(ECFMessageEntityUtil.createClaimRetrieveRs(), ucrTest_2, lcoCodeTest, null)
      claim2 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim2.UCR_Ext = ucrTest_2
      claim2.addToLMMessages(claimRetrieve_Ucr2)

      var claimNotifyRq_Ucr3 = buildMessageClaimData(ECFMessageEntityUtil.createClaimNotifyRq(), ucrTest_3, null, pcsCodeTest)
      claim3 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim3.UCR_Ext = ucrTest_3
      claim3.addToLMMessages(claimNotifyRq_Ucr3)

      var claimRetrieve_Ucr4 = buildMessageClaimData(ECFMessageEntityUtil.createClaimRetrieveRs(), ucrTest_4, null, pcsCodeTest)
      claim4 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim4.UCR_Ext = ucrTest_4
      claim4.addToLMMessages(claimRetrieve_Ucr4)

      var claimNotifyRq_Ucr5 = buildMessageClaimData(ECFMessageEntityUtil.createClaimNotifyRq(), ucrTest_5, lcoCodeTest, pcsCodeTest)
      claim5 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim5.UCR_Ext = ucrTest_5
      claim5.addToLMMessages(claimNotifyRq_Ucr5)

      var claimRetrieve_Ucr6 = buildMessageClaimData(ECFMessageEntityUtil.createClaimRetrieveRs(), ucrTest_6, lcoCodeTest, pcsCodeTest)
      claim6 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim6.UCR_Ext = ucrTest_6
      claim6.addToLMMessages(claimRetrieve_Ucr6)

      var claimNotifyRq_Ucr7 = buildMessageClaimData(ECFMessageEntityUtil.createClaimNotifyRq(), ucrTest_7, lcoCodeTest, ECFPCSCategoryCode_Ext.TC_H41)
      claim7 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim7.UCR_Ext = ucrTest_7
      claim7.addToLMMessages(claimNotifyRq_Ucr7)

      var claimRetrieve_Ucr8 = buildMessageClaimData(ECFMessageEntityUtil.createClaimRetrieveRs(), ucrTest_8, lcoCodeTest, ECFPCSCategoryCode_Ext.TC_H41)
      claim8 = ClaimBuilderHelper.createDefaultClaimWithLossDate(bundle, dateTest)
      claim8.UCR_Ext = ucrTest_8
      claim8.addToLMMessages(claimRetrieve_Ucr8)
    }, User.util.UnrestrictedUser)
  }

  private function buildMessageClaimData(ecfMessage: ECFMessageClaimData_Ext, ucr: String, lcoCode: ECFLCOCategoryCode_Ext, pcsCode: ECFPCSCategoryCode_Ext): ECFMessageClaimData_Ext {
    ecfMessage.UUID = UUID.randomUUID().toString()
    ecfMessage.Suspended = false
    ecfMessage.UCR = ucr
    ecfMessage.LcoCatastropheCode = lcoCode?:null
    ecfMessage.PcsCatastropheCode = pcsCode?:null
    return ecfMessage
  }

  private function buildCatastrophe(lcoCode: String, pcsCode: String): Catastrophe {
    var cat: Catastrophe
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      cat = new Catastrophe()
      var date = dateTest
      cat.LCOCode = lcoCode?:null
      cat.PCSCatastropheNumber = pcsCode?:null
      cat.Name = "CATASTROPHE TEST-" + (lcoCode.NotBlank ? "LCO" + lcoCode : "") + (pcsCode.NotBlank ? "PCS" + pcsCode : "")
      cat.Description = "CATASTROPHE TEST-" + (lcoCode.NotBlank ? "LCO" + lcoCode : "") + (pcsCode.NotBlank ? "PCS" + pcsCode : "")
      cat.Active = true
      cat.Type = CatastropheType.TC_ISO
      cat.CatastropheNumber = "087930"
      cat.CatastropheValidFrom = date
      cat.CatastropheValidTo = date.addDays(4)
    }, User.util.UnrestrictedUser)
    return cat
  }

  private function getAssociatedClaims(catastropheCode: String): List<Claim> {
    return Query.make(Claim).select().toList()
        .where(\elt -> elt.Catastrophe?.LCOCode == catastropheCode or elt.Catastrophe?.PCSCatastropheNumber == catastropheCode)
  }

  private function getAssociatedClaims(catastrophe: Catastrophe): List<Claim> {
    return Query.make(Claim).select().toList().where(\claim -> claim.Catastrophe == catastrophe)
  }

  public static function deleteAllClaims() {
    var claims = Query.make(Claim).select().toList()
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      claims.each(\elt -> {
        elt = bundle.add(elt)
        elt.UCR_Ext = null
        bundle.delete(elt.Policy)
        bundle.delete(elt)
      })
    }, User.util.UnrestrictedUser)
  }
}