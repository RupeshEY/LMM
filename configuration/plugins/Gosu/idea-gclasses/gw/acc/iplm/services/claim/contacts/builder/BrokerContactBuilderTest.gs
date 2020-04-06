package gw.acc.iplm.services.claim.contacts.builder

uses gw.acc.iplm.services.claim.contacts.ContactDetailsDTO
uses gw.acc.iplm.services.claim.contacts.mapper.ECFContactDetailsMapper
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageClaimDataEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.lang3.StringUtils

/**
 * Tests for BrokerContactBuilder
 */
class BrokerContactBuilderTest extends GUnitTestClass {

  private final var _brokerContactBuilder = new BrokerContactBuilder()
  private var _contactDetailsDto: List<ContactDetailsDTO>

  override function beforeMethod() {
    _contactDetailsDto = new ArrayList<ContactDetailsDTO>()
  }

  function testCreateBrokerContactDataClaimRetrieve(){
    var claim = ClaimBuilderHelper.createClaim()
    var claimRetrieveRs = ECFMessageUtil.createNewClaimRetrieveRs()
    var results: List<ClaimContact>
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var ecfClaimData = new ECFMessageClaimData_Ext()
      ecfClaimData.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
      ecfClaimData.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      ecfClaimData.Content = new Blob(claimRetrieveRs.asUTFString().Bytes)
      ecfClaimData.UUID = claimRetrieveRs.UUId
      ecfClaimData.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(claimRetrieveRs.CreationDate)
      var ecfContactDetails = new ECFMessageClaimDataContacts_Ext()
      ecfContactDetails = bundle.add(ecfContactDetails)
      ecfClaimData.ECFContactData = ecfContactDetails
      ECFMessageClaimDataEntityUtil.mapClaimContacts(ecfClaimData, claimRetrieveRs)

      claim = bundle.add(claim)
      _contactDetailsDto.add(ECFContactDetailsMapper.createBrokerContactDetails(ecfClaimData))
      results = _brokerContactBuilder.createNewClaimContacts(ContactRole.TC_BROKER_EXT, claim, _contactDetailsDto)
    }, ECFConstants.ECF_SUPER_USER)
    // Assert
    assertEquals(1, results.Count)
    assertEquals("123566", claim.Broker_Ext.WorkPhone)
    assertEquals("G2 TEST 31AP", claim.Broker_Ext.Name)
    assertEquals("XXXXX", StringUtils.trim(claim.Broker_Ext.PrimaryContact.DisplayName))
    assertEquals("urn:lloyds:0001", claim.Broker_Ext.LMContactID_Ext)
  }

  function testCreateBrokerContactDataClaimNotify(){
    var claim = ClaimBuilderHelper.createClaim()
    var claimNotifyRq = ECFMessageUtil.createNewClaimNotifyRq()
    var results : List<ClaimContact>
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var ecfClaimData = new ECFMessageClaimData_Ext()
      ecfClaimData.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
      ecfClaimData.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      ecfClaimData.Content = new Blob(claimNotifyRq.asUTFString().Bytes)
      ecfClaimData.UUID = claimNotifyRq.UUId
      ecfClaimData.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(claimNotifyRq.CreationDate)
      var ecfContactDetails = new ECFMessageClaimDataContacts_Ext()
      ecfContactDetails = bundle.add(ecfContactDetails)
      ecfClaimData.ECFContactData = ecfContactDetails
      ECFMessageClaimDataEntityUtil.mapClaimContacts(ecfClaimData, claimNotifyRq)

      claim = bundle.add(claim)
      ecfClaimData.ECFContactData.BrokerContactName = "BRAD PAGE"
      _contactDetailsDto.add(ECFContactDetailsMapper.createBrokerContactDetails(ecfClaimData))
      results = _brokerContactBuilder.createNewClaimContacts(ContactRole.TC_BROKER_EXT, claim, _contactDetailsDto)
    }, ECFConstants.ECF_SUPER_USER)
    // Assert
    assertEquals(1, results.Count)
    assertEquals("1234", claim.Broker_Ext.WorkPhone)
    assertEquals("TEST BROKER 0001", claim.Broker_Ext.Name)
    assertEquals("BRAD", (claim.Broker_Ext.PrimaryContact as Person).FirstName)
    assertEquals("PAGE", (claim.Broker_Ext.PrimaryContact as Person).LastName)
    assertEquals("BRAD PAGE", StringUtils.trim(claim.Broker_Ext.PrimaryContact.DisplayName))
    assertEquals("GW0001", claim.Broker_Ext.LMContactID_Ext)
  }

  function testCreateBrokerContactDataClaimNotify_WithNullContactName(){
    var claim = ClaimBuilderHelper.createClaim()
    var claimNotifyRq = ECFMessageUtil.createNewClaimNotifyRq()
    var results : List<ClaimContact>
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var ecfClaimData = new ECFMessageClaimData_Ext()
      ecfClaimData.MessageCategory = LMMessageCategory_Ext.TC_ECFCLAIMNOTIFY
      ecfClaimData.MessageDirection = ECFMessageDirectionType_Ext.TC_INBOUND
      ecfClaimData.Content = new Blob(claimNotifyRq.asUTFString().Bytes)
      ecfClaimData.UUID = claimNotifyRq.UUId
      ecfClaimData.OriginTimeStamp = ECFConstants.ECF_XML_PAYLOAD_DATETIME_FORMAT.get().parse(claimNotifyRq.CreationDate)
      var ecfContactDetails = new ECFMessageClaimDataContacts_Ext()
      ecfContactDetails = bundle.add(ecfContactDetails)
      ecfClaimData.ECFContactData = ecfContactDetails
      ECFMessageClaimDataEntityUtil.mapClaimContacts(ecfClaimData, claimNotifyRq)

      claim = bundle.add(claim)
      ecfClaimData.ECFContactData.BrokerContactName = null
      _contactDetailsDto.add(ECFContactDetailsMapper.createBrokerContactDetails(ecfClaimData))
      results = _brokerContactBuilder.createNewClaimContacts(ContactRole.TC_BROKER_EXT, claim, _contactDetailsDto)
    }, ECFConstants.ECF_SUPER_USER)
    // Assert
    assertEquals(1, results.Count)
    assertEquals("1234", claim.Broker_Ext.WorkPhone)
    assertEquals("TEST BROKER 0001", claim.Broker_Ext.Name)
    assertNull((claim.Broker_Ext.PrimaryContact as Person).FirstName)
    assertEquals("GW0001", claim.Broker_Ext.LMContactID_Ext)
  }
}