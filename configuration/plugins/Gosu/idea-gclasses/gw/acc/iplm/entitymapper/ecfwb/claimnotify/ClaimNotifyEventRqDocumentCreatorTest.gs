package gw.acc.iplm.entitymapper.ecfwb.claimnotify


uses gw.acc.iplm.services.EntityMapperService
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.api.testdata.TestDataUtil
uses gw.testharness.v3.GUnitTestClass

class ClaimNotifyEventRqDocumentCreatorTest extends GUnitTestClass {

  public static final var DOCUMENT1_ID: String = "229207fe-c65d-4e2b-b623-95ea69c01465"
  public static final var DOCUMENT2_REF: String = "REF1"
  public static final var DELTA: double = 001d
  private var _entityMapperService = new EntityMapperService()

  function testNewClaimNotifyRqWithDocuments() {
    TestDataUtil.runWithExistingBundleNoCommit(TestDataUtil.createNonPersistentBundle(), \-> {
      TestDataUtil.runAsUser(User.util.UnrestrictedUser, \-> {
        final var xmlPayload = ECFMessageUtil.createNewClaimNotifyRq()
        final var ecfMessage = _entityMapperService.createEntity(xmlPayload) as ECFMessageClaimNotifyRq_Ext
        assertEquals(7, ecfMessage.Docs.Count)

        var doc1 = ecfMessage.Docs.firstWhere(\doc -> doc.DocumentId == DOCUMENT1_ID)
        assertEquals("1.0", doc1.Version)
        assertNull(doc1.Reference)
        assertEquals("229207fe-c65d-4e2b-b623-95ea69c01465", doc1.DocumentId)
        assertNotNull(doc1.VersionDate)
        assertEquals(IMRDocumentType_Ext.TC_BORDEREAU_OUTSTANDING_LOSS_AND_LOSS_ADJUSTMENT_EX, doc1.DocType)
        assertEquals(typekey.ECFFileFormat_Ext.TC_APP_VND_WORDPROCESSINGML_DOC, doc1.FileFormat)
        assertEquals(ECFMsgNotifRqDocSizeUnit_Ext.TC_KB, doc1.FileSizeUnit)
        assertEquals("testSD", doc1.Description)
        assertEquals(135d, doc1.FileSize.doubleValue(), DELTA)

        var doc2 = ecfMessage.Docs.firstWhere(\doc -> doc.Reference == DOCUMENT2_REF)
        assertEquals("1.1", doc2.Version)
        assertNull(doc2.DocumentId)
        assertNotNull(doc2.VersionDate)
        assertEquals(IMRDocumentType_Ext.TC_CORRESPONDENCE_CLIENT, doc2.DocType)
        assertEquals(typekey.ECFFileFormat_Ext.TC_APP_VND_WORDPROCESSINGML_DOC, doc2.FileFormat)
        assertEquals(ECFMsgNotifRqDocSizeUnit_Ext.TC_MB, doc2.FileSizeUnit)
        assertNull(doc2.Description)
        assertEquals(298d, doc2.FileSize.doubleValue(), DELTA)
      })
    })
  }
}