package gw.acc.iplm.entitymapper.imr.docupload

uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.utils.ECFConstants
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.testharness.v3.GUnitTestClass

class DocumentUploadRqAccessPartyMapperTest extends GUnitTestClass {

  private static var _mapper: DocumentUploadRqAccessPartyMapper

  override function beforeClass() {
    super.beforeClass()
  }

  function testCreateUploadAccessParties_Insurer() {
    var claim = createClaim()
    var result: List<ECFMessageDocumentUploadAccessParty_Ext>

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var insurer = bundle.add(new ClaimContact())
      insurer.Claim = claim
      var company = bundle.add(new Company(claim))
      company.Name = "test-company"
      company.ECFBureauId_Ext = "test-id"
      insurer.Contact = company
      var role = bundle.add(new ClaimContactRole())
      role.Role = ContactRole.TC_ECFCONTRACTMARKETINSURERORREINSURER_EXT

      insurer.addToRoles(role)
      claim.addToContacts(insurer)

      var document = createDocumentOnClaim(claim)
      result = _mapper.createUploadAccessParties(document)
    }, ECFConstants.ECF_SUPER_USER)

    assertEquals(1, result.size())
    assertEquals("test-company", result.first().PartyName)
    assertEquals("read", result.first().AccessRight)
    assertEquals("test-id", result.first().PartyId)
    assertEquals(ECFMessageConstants.INSURER_ROLE, result.first().PartyRole)
    assertEquals("remove", result.first().ListAction)
  }

  function testCreateUploadAccessParties_Broker() {
    var claim = createClaim()
    var result: List<ECFMessageDocumentUploadAccessParty_Ext>

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      var insurer = bundle.add(new ClaimContact())
      insurer.Claim = claim
      var company = bundle.add(new Company(claim))
      company.Name = "test-companyb"
      company.VendorNumber = "test-vendor"
      insurer.Contact = company
      var role = bundle.add(new ClaimContactRole())
      role.Role = ContactRole.TC_BROKER_EXT

      insurer.addToRoles(role)
      claim.addToContacts(insurer)

      var document = createDocumentOnClaim(claim)
      result = _mapper.createUploadAccessParties(document)
    }, ECFConstants.ECF_SUPER_USER)

    assertEquals(1, result.size())
    assertEquals("test-companyb", result.first().PartyName)
    assertEquals("read", result.first().AccessRight)
    assertEquals("test-vendor", result.first().PartyId)
    assertEquals(ContactRole.TC_BROKER_EXT.toString(), result.first().PartyRole)
    assertEquals("remove", result.first().ListAction)
  }

  private function createClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }

  private function createDocumentOnClaim(claim: Claim): Document {
    var newDocument: Document
    var currentTimeString = String.valueOf(System.currentTimeMillis())
      newDocument = gw.transaction.Transaction.Current.add(new Document())
      newDocument.IMRDocumentId = UUID.randomUUID().toString()
      newDocument.IMRDocumentVersion = currentTimeString
      newDocument.IMRDocumentVersionDtTime = new Date().toCalendar().getTime()
      newDocument.IMRInheritIndicator = false
      newDocument.Name = "DocDownloadTest_" + currentTimeString
      newDocument.MimeType = "application/pdf"
      newDocument.IMRFileSizeNum = 90
      newDocument.IMRFileSizeUnit = "KB"
      newDocument.IMRDocumentType = "document"
      newDocument.ECFStatus = ECFDocumentStatus_Ext.TC_ON_IMR
      newDocument.TR = String.valueOf(System.currentTimeMillis())
      newDocument.Claim = claim

    return newDocument
  }

}