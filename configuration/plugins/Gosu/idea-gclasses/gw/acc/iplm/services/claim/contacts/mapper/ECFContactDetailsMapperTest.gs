package gw.acc.iplm.services.claim.contacts.mapper

uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class ECFContactDetailsMapperTest extends GUnitTestClass {
  private var _ecfContactDetailsMapper: ECFContactDetailsMapper

  override public function beforeClass() {
    _ecfContactDetailsMapper = new ECFContactDetailsMapper()
  }

  public function testCreateAdjusterContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.AdjusterName).thenReturn("TestAdjusterName")
    Mockito.when(contactData.AdjusterReference).thenReturn("TestAdjusterReference")
    // Act
    var result = _ecfContactDetailsMapper.createAdjusterContactDetails(message)
    // Assert
    assertEquals(contactData.AdjusterName, result.Name)
    assertEquals(contactData.AdjusterReference, result.Reference)
  }

  public function testCreateAdjusterContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    // Act
    var result = _ecfContactDetailsMapper.createAdjusterContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.Reference)
  }

  public function testCreateBrokerContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.BrokerPartyId).thenReturn("TestBrokerPartyId")
    Mockito.when(contactData.BrokerPartyName).thenReturn("TestBrokerPartyName")
    Mockito.when(contactData.BrokerContactName).thenReturn("TestBrokerContactName")
    Mockito.when(contactData.BrokerContactTelephone).thenReturn("TestBrokerContactTelephone")
    // Act
    var result = _ecfContactDetailsMapper.createBrokerContactDetails(message)
    // Assert
    assertEquals(contactData.BrokerPartyId, result.Id)
    assertEquals(contactData.BrokerPartyName, result.Name)
    assertEquals(contactData.BrokerContactName, result.ContactName)
    assertEquals(contactData.BrokerContactTelephone, result.ContactPhone)
  }

  public function testCreateBrokerContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    // Act
    var result = _ecfContactDetailsMapper.createBrokerContactDetails(message)
    // Assert
    assertNull(result.Id)
    assertNull(result.Name)
    assertNull(result.ContactName)
    assertNull(result.ContactPhone)
  }

  public function testCreateBureauLeadContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(message.ReceiverPartyName).thenReturn("TestReceiverPartyName")
    Mockito.when(contactData.BureauLeadInsurerOrReinsurer).thenReturn("TestBureauLeadInsurerOrReinsurer")
    // Act
    var result = _ecfContactDetailsMapper.createBureauLeadContactDetails(message)
    // Assert
    assertEquals(contactData.BureauLeadInsurerOrReinsurer, result.Name)
    assertEquals(message.ReceiverPartyName, result.ReceiverName)
  }

  public function testCreateBureauLeadContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    // Act
    var result = _ecfContactDetailsMapper.createBureauLeadContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.ReceiverName)
  }

  public function testCreateClaimantContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    Mockito.when(message.Claimant).thenReturn("TestClaimant")
    Mockito.when(message.LossOrEventName).thenReturn("TestLossOrEventName")
    // Act
    var result = _ecfContactDetailsMapper.createClaimantContactDetails(message)
    // Assert
    assertEquals(message.Claimant, result.Name)
    assertEquals(message.LossOrEventName, result.Description)
  }

  public function testCreateClaimantContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    // Act
    var result = _ecfContactDetailsMapper.createClaimantContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.Description)
  }

  public function testCreateLawyerContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.LawyerName).thenReturn("TestLawyerName")
    Mockito.when(contactData.LawyerReference).thenReturn("TestLawyerReference")
    // Act
    var result = _ecfContactDetailsMapper.createLawyerContactDetails(message)
    // Assert
    assertEquals(contactData.LawyerName, result.Name)
    assertEquals(contactData.LawyerReference, result.Reference)
  }

  public function testCreateLawyerContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    // Act
    var result = _ecfContactDetailsMapper.createLawyerContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.Reference)
  }

  public function testCreateInsurerOrReinsurerContactDetails_WithInsurerData() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.InsurerId).thenReturn("TestInsurerId")
    Mockito.when(contactData.InsurerName).thenReturn("TestInsurerName")
    Mockito.when(contactData.InsurerAgency).thenReturn("TestInsurerAgency")
    // Act
    var result = _ecfContactDetailsMapper.createInsurerOrReinsurerContactDetails(message)
    // Assert
    assertEquals(contactData.InsurerId, result.Id)
    assertEquals(contactData.InsurerName, result.Name)
    assertEquals(contactData.InsurerAgency, result.Agency)
  }

  public function testCreateInsurerOrReinsurerContactDetails_WithReinsurerData() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contactData = Mockito.mock(ECFMessageClaimDataContacts_Ext)
    Mockito.when(message.ECFContactData).thenReturn(contactData)
    Mockito.when(contactData.ReinsurerId).thenReturn("TestReinsurerId")
    Mockito.when(contactData.ReinsurerName).thenReturn("TestReinsurerName")
    Mockito.when(contactData.ReinsurerAgency).thenReturn("TestReinsurerAgency")
    // Act
    var result = _ecfContactDetailsMapper.createInsurerOrReinsurerContactDetails(message)
    // Assert
    assertEquals(contactData.ReinsurerId, result.Id)
    assertEquals(contactData.ReinsurerName, result.Name)
    assertEquals(contactData.ReinsurerAgency, result.Agency)
  }

  public function testCreateContractMarketInsurerOrReinsurerContactDetails() {
    // Arrange
    var message = Mockito.mock(ECFMessageClaimData_Ext)
    var contractMarket1 = Mockito.mock(ECFContractMarket_Ext)
    var contractMarket2 = Mockito.mock(ECFContractMarket_Ext)
    var bureau1 = Mockito.mock(ECFBureauType_Ext)
    var bureau2 = Mockito.mock(ECFBureauType_Ext)
    Mockito.when(contractMarket1.PartyID).thenReturn("TestContractMarket1PartyId")
    Mockito.when(contractMarket1.PartyName).thenReturn("TestContractMarket1PartyName")
    Mockito.when(contractMarket1.Bureau).thenReturn(bureau1)
    Mockito.when(bureau1.Code).thenReturn(ECFBureauType_Ext.TC_LLOYDS.DisplayName)
    Mockito.when(contractMarket2.PartyID).thenReturn("TestContractMarket1PartyId")
    Mockito.when(contractMarket2.PartyName).thenReturn("TestContractMarket1PartyName")
    Mockito.when(contractMarket2.Bureau).thenReturn(bureau2)
    Mockito.when(bureau2.Code).thenReturn(ECFBureauType_Ext.TC_LIRMA.DisplayName)
    Mockito.when(message.ReceiverPartyName).thenReturn("TestReceiverPartyName")
    Mockito.when(message.ECFContractMarkets).thenReturn({contractMarket1, contractMarket2})
    // Act
    var result = _ecfContactDetailsMapper.createContractMarketInsurerOrReinsurerContactDetails(message)
    // Assert
    assertEquals(2, result.length)
    assertEquals(contractMarket1.PartyID, result.first().Id)
    assertEquals(contractMarket1.PartyName, result.first().Name)
    assertEquals(contractMarket1.Bureau.Code, result.first().Agency)
    assertEquals(contractMarket2.PartyID, result[1].Id)
    assertEquals(contractMarket2.PartyName, result[1].Name)
    assertEquals(contractMarket2.Bureau.Code, result[1].Agency)
  }
}