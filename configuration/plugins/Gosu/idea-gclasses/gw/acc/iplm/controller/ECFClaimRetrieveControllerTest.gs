package gw.acc.iplm.controller

uses gw.acc.iplm.InterceptorManagerWrapper
uses gw.acc.iplm.config.LMCompaniesDataLoader
uses gw.acc.iplm.dto.PartyDto
uses gw.acc.iplm.testutils.EntityUtil
uses gw.acc.iplm.testutils.MockitoStatics
uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFClaimRetrieveControllerTest extends GUnitTestClass implements MockitoStatics{

  private var _mockedInterceptorManager: InterceptorManagerWrapper
  private var _ecfClaimRetrieveController : ECFClaimRetrieveController

  override function beforeMethod() {
    super.beforeMethod()
    _mockedInterceptorManager = mock(InterceptorManagerWrapper)
    _ecfClaimRetrieveController = new ECFClaimRetrieveController()
  }

  function testInitializeNewClaimRetrieve() {
    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      _ecfClaimRetrieveController.Sender = _ecfClaimRetrieveController.AllCompanies.first()

      var entity = _ecfClaimRetrieveController.initializeNewClaimRetrieve(null, bundle)

      assertNull("Sender should have been reset", _ecfClaimRetrieveController.Sender)
      assertTrue("Entity should be a new entity", entity.New)
    })
  }

  function testAllCompanies() {
    var configuredCompanies = new LMCompaniesDataLoader().AllCompanies

    configuredCompanies.eachWithIndex(\company, idx -> {
      assertEquals(company.FirstId, _ecfClaimRetrieveController.AllCompanies.get(idx).Id)
      assertEquals(company.FirstAgency, _ecfClaimRetrieveController.AllCompanies.get(idx).Agency)
      assertEquals(company.Name, _ecfClaimRetrieveController.AllCompanies.get(idx).Name)
    })
  }

  function testOnBureauChanged_PopulatesSenderDetails() {
    var sender = new PartyDto("id", "name", "agency")

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = new ECFMessageClaimRetrieveRq_Ext()
      _ecfClaimRetrieveController.Sender = sender

      entity = _ecfClaimRetrieveController.onBureauChanged(entity)

      assertEquals("Id doesnt match", sender.Id, entity.SenderPartyId)
      assertEquals("Name doesnt match", sender.Name, entity.SenderPartyName)
      assertEquals("Agency doesnt match", sender.Agency, entity.SenderPartyAgency)
    })
  }

  function testOnBureauChanged_ClearsClaimType() {
    var sender = new PartyDto("id", "name", "agency")

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = new ECFMessageClaimRetrieveRq_Ext()
      entity.ClaimType = ECFClaimTypeCode_Ext.TC_000
      _ecfClaimRetrieveController.Sender = sender

      entity = _ecfClaimRetrieveController.onBureauChanged(entity)

      assertNull("Claim Type should be cleared", entity.ClaimType)
    })
  }

  function testOnBureauChanged_NullSender() {

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = new ECFMessageClaimRetrieveRq_Ext()
      entity.SenderPartyId = "id"
      entity.SenderPartyName = "name"
      entity.SenderPartyAgency = "agency"
      entity.ClaimType = ECFClaimTypeCode_Ext.TC_000

      entity = _ecfClaimRetrieveController.onBureauChanged(entity)

      assertNull("Receiver ID should be cleared", entity.SenderPartyId)
      assertNull("Receiver Name should be cleared", entity.SenderPartyName)
      assertNull("Receiver Agency should be cleared", entity.SenderPartyAgency)
    })
  }

  function testGetClaimTypeForSender_LloydsSender() {
    var sender = new PartyDto("id", "name", ECFBureauType_Ext.TC_LLOYDS.Code)
    assertEquals(_ecfClaimRetrieveController.getClaimTypeForSender(sender), ECFClaimTypeCode_Ext.TF_LLOYDS.TypeKeys)
  }

  function testGetClaimTypeForSender_ILUSender() {
    var sender = new PartyDto("id", "name", ECFBureauType_Ext.TC_ILU.Code)
    assertEquals(_ecfClaimRetrieveController.getClaimTypeForSender(sender), ECFClaimTypeCode_Ext.TF_ILU.TypeKeys)
  }

  function testGetClaimTypeForSender_LIRMASender() {
    var sender = new PartyDto("id", "name", ECFBureauType_Ext.TC_LIRMA.Code)
    assertEquals(_ecfClaimRetrieveController.getClaimTypeForSender(sender), ECFClaimTypeCode_Ext.TF_LIRMA.TypeKeys)
  }

  function testGetClaimTypeForSender_UnknownSender() {
    var sender = new PartyDto("id", "name", "agency")
    assertNull(_ecfClaimRetrieveController.getClaimTypeForSender(sender))
  }

  function testSendRequest() {
    _ecfClaimRetrieveController.InterceptorManager = _mockedInterceptorManager

    EntityUtil.runAsUnrestrictedUserNoCommit(\bundle -> {
      var entity = new ECFMessageClaimRetrieveRq_Ext()

      _ecfClaimRetrieveController.sendRequest(entity)

      Mockito.verify(_mockedInterceptorManager, Mockito.times(1)).intercept(entity)
    })
  }
}