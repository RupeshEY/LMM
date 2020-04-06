package gw.acc.iplm.services.claim.contacts.mapper

uses gw.testharness.v3.GUnitTestClass
uses org.mockito.Mockito

class LMContactDetailsMapperTest extends GUnitTestClass {

  private var _lmContactDetailsMapper: LMContactDetailsMapper

  override public function beforeClass() {
    _lmContactDetailsMapper = new LMContactDetailsMapper()
  }

  public function testCreateBrokerContactDetails() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    Mockito.when(contactData.BrokerPartyId).thenReturn("TestBrokerPartyId")
    Mockito.when(contactData.BrokerPartyName).thenReturn("TestBrokerPartyName")
    Mockito.when(contactData.BrokerContactName).thenReturn("TestBrokerContactName")
    Mockito.when(contactData.BrokerContactTelephone).thenReturn("TestBrokerContactTelephone")
    // Act
    var result = _lmContactDetailsMapper.createBrokerContactDetails(message)
    // Assert
    assertEquals(contactData.BrokerPartyId, result.Id)
    assertEquals(contactData.BrokerPartyName, result.Name)
    assertEquals(contactData.BrokerContactName, result.ContactName)
    assertEquals(contactData.BrokerContactTelephone, result.ContactPhone)
  }

  public function testCreateBrokerContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    // Act & Assert
    assertCausesException(\-> {
      _lmContactDetailsMapper.createBrokerContactDetails(message)
    }, IllegalArgumentException)
  }

  public function testCreateClaimantContactDetails() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    Mockito.when(message.LossDescription).thenReturn("TestLossDescription")
    Mockito.when(contactData.InsuredName).thenReturn("TestName")
    // Act
    var result = _lmContactDetailsMapper.createClaimantContactDetails(message)
    // Assert
    assertEquals(contactData.InsuredName, result.Name)
    assertEquals(message.LossDescription, result.Description)
  }

  public function testCreateClaimantContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    // Act
    var result = _lmContactDetailsMapper.createClaimantContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.Description)
  }

  public function testCreateBureauLeadContactDetails() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    Mockito.when(message.ReceiverPartyName).thenReturn("TestReceiverPartyName")
    Mockito.when(contactData.BureauLeadingInsurerName).thenReturn("TestBureauLeadInsurerName")
    // Act
    var result = _lmContactDetailsMapper.createBureauLeadingInsurerContactDetails(message)
    // Assert
    assertEquals(contactData.BureauLeadingInsurerName, result.Name)
    assertEquals(message.ReceiverPartyName, result.ReceiverName)
  }

  public function testCreateBureauLeadContactDetails_WithNullValues() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    // Act
    var result = _lmContactDetailsMapper.createBureauLeadingInsurerContactDetails(message)
    // Assert
    assertNull(result.Name)
    assertNull(result.ReceiverName)
  }


  public function testCreateInsurerOrReinsurerContactDetails_WithInsurerData() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    Mockito.when(contactData.InsurerId).thenReturn("TestInsurerId")
    Mockito.when(contactData.InsurerName).thenReturn("TestInsurerName")
    Mockito.when(contactData.InsurerAgency).thenReturn("TestInsurerAgency")
    // Act
    var result = _lmContactDetailsMapper.createInsurerOrReinsurerContactDetails(message)
    // Assert
    assertEquals(contactData.InsurerId, result.Id)
    assertEquals(contactData.InsurerName, result.Name)
    assertEquals(contactData.InsurerAgency, result.Agency)
  }

  public function testCreateInsurerOrReinsurerContactDetails_WithReinsurerData() {
    // Arrange
    var message = Mockito.mock(LMMessageLloydsSCM_Ext)
    var contactData = Mockito.mock(SCMMessageClaimDataContacts_Ext)
    Mockito.when(message.ContactData).thenReturn(contactData)
    Mockito.when(contactData.ReinsurerId).thenReturn("TestReinsurerId")
    Mockito.when(contactData.ReinsurerName).thenReturn("TestReinsurerName")
    Mockito.when(contactData.ReinsurerAgency).thenReturn("TestReinsurerAgency")
    // Act
    var result = _lmContactDetailsMapper.createInsurerOrReinsurerContactDetails(message)
    // Assert
    assertEquals(contactData.ReinsurerId, result.Id)
    assertEquals(contactData.ReinsurerName, result.Name)
    assertEquals(contactData.ReinsurerAgency, result.Agency)
  }
}