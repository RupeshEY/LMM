package gw.acc.iplm.services.message.imr

uses gw.acc.iplm.exception.imr.IMRException
uses gw.acc.iplm.testutils.ClaimBuilderHelper
uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.api.database.Query
uses gw.testharness.v3.GUnitTestClass

uses javax.xml.namespace.QName

class IMRDocumentSearchRsServiceComponentTest extends GUnitTestClass {

  private var _imrDocumentSearchRsService : IMRDocumentSearchRsService


  override function beforeMethod() {
    super.beforeMethod()
    _imrDocumentSearchRsService = new IMRDocumentSearchRsService()
  }

  function testProcessResponseWithDocumentList() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var newClaim = ClaimBuilderHelper.createClaim()
    var sampleDocSearchRq = ECFMessageUtil.createNewDocumentSearchRq()
    sampleDocSearchRq.DocumentList?.first().DocumentItem?.first().ReferredObjects?.Claim?.BrokerReference = ucr
    var dsRqMsg = ECFMessageEntityUtil.createDocumentSearchRq(sampleDocSearchRq)
    var sampleDocSearchRs = ECFMessageUtil.createNewDocumentSearchRs()
    sampleDocSearchRs.ResponseInfo.MsgId = sampleDocSearchRq.MsgId

    var expectedFileName = sampleDocSearchRs.DocumentList.first().DocumentItem.first().Document.FileId
    var expectedDocId = sampleDocSearchRs.DocumentList.first().DocumentItem.first().Document.DocumentId
    var expectedTR = sampleDocSearchRs.DocumentList.first().DocumentItem.first().ReferredObjects.ClaimEntry.BrokerReference

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      dsRqMsg = bundle.add(dsRqMsg)
      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = ucr
      dsRqMsg.Claim = newClaim
    }, User.util.UnrestrictedUser)

    var dsRsMsg = ECFMessageEntityUtil.createDocumentSearchRs(sampleDocSearchRs)
    assertEquals("Expected the Claim Documents list to be empty initially.", 0, newClaim.Documents.Count)
    new IMRDocumentSearchRsService().process(dsRsMsg)
    newClaim.refresh()
    assertEquals(4, newClaim.Documents.Count)
    assertTrue(newClaim.Documents*.Name.contains(expectedFileName))
    assertTrue(newClaim.Documents*.IMRDocumentId.contains(expectedDocId))
    assertTrue(newClaim.Documents*.TR.contains(expectedTR))

    assertEquals(4, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == typekey.ECFDocumentStatus_Ext.TC_ON_IMR))
  }

  function testProcessResponseWithoutDocumentList() {
    var ucr = ClaimBuilderHelper.getNextUCR()
    var newClaim = ClaimBuilderHelper.createClaim()
    var sampleDocSearchRq = ECFMessageUtil.createNewDocumentSearchRq()
    sampleDocSearchRq.DocumentList?.first().DocumentItem?.first().ReferredObjects?.Claim?.BrokerReference = ucr
    var dsRqMsg = ECFMessageEntityUtil.createDocumentSearchRq(sampleDocSearchRq)
    var sampleDocSearchRs = ECFMessageUtil.createNewDocumentSearchRs()
    sampleDocSearchRs.ResponseInfo.MsgId = sampleDocSearchRq.MsgId
    sampleDocSearchRs.removeChild(new QName(DocumentList.$NAMESPACE.NamespaceURI, DocumentList.$QNAME.LocalPart))

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      dsRqMsg = bundle.add(dsRqMsg)
      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = ucr
      dsRqMsg.Claim = newClaim
    }, User.util.UnrestrictedUser)

    var dsRsMsg = ECFMessageEntityUtil.createDocumentSearchRs(sampleDocSearchRs)
    assertEquals("Expected the Claim Documents list to be empty initially.", 0, newClaim.Documents.Count)
    new IMRDocumentSearchRsService().process(dsRsMsg)
    newClaim.refresh()
    assertEquals(0, newClaim.Documents.Count)
  }

// START HERE
  function testProcessMessage_ValidContent() {

    //create a claim
    var newClaim = createNewClaim()
    var docSearchResp = createDocumentSearchResponse(newClaim)
    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp, newClaim)

    //ensure the claim has no documents on it
    assertEquals("There should be no documents on the Claim at this stage.", 0, newClaim.Documents.Count)

    //ensure that the claim gets updated and documents added
    _imrDocumentSearchRsService.process(docSearchMessage)

    //Update the claim from the DB
    newClaim = refreshClaim(newClaim)

    //Ensure that there's now 4 documents, as there's only 1 new document
    assertEquals("There should be four documents on the Claim in total.", 4, newClaim.Documents.Count)
    assertEquals("There should be four documents on the Claim should have the status of On IMR.", 4, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == typekey.ECFDocumentStatus_Ext.TC_ON_IMR))
  }

  function testProcessMessage_NewDocsInSecondUpdate() {

    //create a claim
    var newClaim = createNewClaim()
    var docSearchResp = createDocumentSearchResponse(newClaim)

    //Remove one of the documents from the docSearchResp (3 total)
    docSearchResp.DocumentList.first().DocumentItem.remove(0)

    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp, newClaim)

    //ensure the claim has no documents on it
    assertEquals("There should be no documents on the Claim at this stage.", 0, newClaim.Documents.Count)

    //ensure that the claim gets updated and documents added
    _imrDocumentSearchRsService.process(docSearchMessage)

    //Update the claim from the DB
    newClaim = refreshClaim(newClaim)

    //Ensure that there's just 3 documents on the claim
    assertEquals("There should be three documents on the Claim at this stage", 3, newClaim.Documents.Count)

    //Create a new search response, but do not remove any documents this time (4 total)
    var docSearchResp2 = createDocumentSearchResponse(newClaim)
    var docSearchMessage2 = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp2, newClaim)

    _imrDocumentSearchRsService.process(docSearchMessage2)

    //Ensure that there's now 4 documents, as there's only 1 new document
    assertEquals("There should be four documents on the Claim in total.", 4, newClaim.Documents.Count)
    assertEquals("There should be four documents on the Claim should have the status of On IMR.", 4, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == typekey.ECFDocumentStatus_Ext.TC_ON_IMR))
  }

  function testProcessMessage_StatusKeptOnSecondUpdate() {

    //create a claim
    var newClaim = createNewClaim()
    var docSearchResp = createDocumentSearchResponse(newClaim)

    //Remove all but two of the documents from the docSearchResp
    docSearchResp.DocumentList.first().DocumentItem.remove(0)
    docSearchResp.DocumentList.first().DocumentItem.remove(0)

    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp, newClaim)

    //ensure the claim has no documents on it
    assertEquals("There should be no documents on the Claim at this stage.", 0, newClaim.Documents.Count)

    //ensure that the claim gets updated and documents added
    _imrDocumentSearchRsService.process(docSearchMessage)

    //Update the claim from the DB
    newClaim = refreshClaim(newClaim)

    //Ensure that there's just 2 documents on the claim
    assertEquals("There should be two documents on the Claim at this stage.", 2, newClaim.Documents.Count)

    var firstDoc = newClaim.Documents[0]
    var secondDoc = newClaim.Documents[1]

    //Set the one of the document statuses to OnDMS and the other to Pending Download
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)
      firstDoc = bundle.add(firstDoc)
      secondDoc = bundle.add(secondDoc)

      firstDoc.ECFStatus = ECFDocumentStatus_Ext.TC_ON_DMS
      secondDoc.ECFStatus = ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD
    }, "su")

    //Refresh the Claim
    newClaim = refreshClaim(newClaim)

    //Create a new search response, but do not remove any documents this time (4 total)
    var docSearchResp2 = createDocumentSearchResponse(newClaim)
    var docSearchMessage2 = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp2, newClaim)

    _imrDocumentSearchRsService.process(docSearchMessage2)

    //Update the claim from the DB
    newClaim = refreshClaim(newClaim)

    //Ensure that there's now 4 documents, as there's only 1 new document
    assertEquals("There should be four documents on the Claim in total.", 4, newClaim.Documents.Count)

    //Three should be on IMR
    assertEquals("Just two documents on the Claim should have the status of On IMR.", 2, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == typekey.ECFDocumentStatus_Ext.TC_ON_IMR))
    //One should be on DMS and IMR.
    assertEquals("Just one document on the Claim should have the status of On IMR and DMS.", 1, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == ECFDocumentStatus_Ext.TC_ON_IMR_AND_DMS))
    //One should be on Pending Download.
    assertEquals("Just one document on the Claim should have the status of Pending Download.", 1, newClaim.Documents*.ECFStatus.countWhere(\elt -> elt == ECFDocumentStatus_Ext.TC_PENDING_DOWNLOAD))
  }

  function testProcessMessage_NonXmlContent() {

    //create a claim
    var newClaim = createNewClaim()
    var docSearchResp = createDocumentSearchResponse(newClaim)
    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp, newClaim)

    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      docSearchMessage = bundle.add(docSearchMessage)
      docSearchMessage.Content = new Blob("This is not XML".Bytes)
    }, "su")

    //ensure the claim has no documents on it
    assertEquals(0, newClaim.Documents.Count)

    assertCausesException(\-> {
      _imrDocumentSearchRsService.process(docSearchMessage)
    }, IMRException)

  }

  function testProcessMessage_ClaimNotFound() {
    //Create a claim
    var newClaim = createNewClaim()

    //Create the RepositoryOperationRs
    var docSearchResp = createDocumentSearchResponse(newClaim)

    //Set the UCR on the claim to null so it can't be found
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      newClaim = bundle.add(newClaim)
      newClaim.UCR_Ext = null
    }, User.util.UnrestrictedUser)

    var docSearchMessage = ECFMessageEntityUtil.createDocumentSearchRs(docSearchResp, newClaim)
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      docSearchMessage = bundle.add(docSearchMessage)
      docSearchMessage.Claim = null
    }, User.util.UnrestrictedUser)

    //Ensure the claim has no documents on it
    assertEquals(0, newClaim.Documents.Count)

    assertCausesException(\-> {
      //No claim being found should cause an IMR exception
      _imrDocumentSearchRsService.process(docSearchMessage)
    }, IMRException)
  }

  private function createDocumentSearchResponse(newClaim: Claim): RepositoryOperationRs {
    var repOpResp = ECFMessageUtil.createNewDocumentSearchRs()

    //Set each UCR to the same as the claim's
    repOpResp.DocumentList.each(\docList -> {
      docList.DocumentItem.each(\docItem -> {
        docItem.ReferredObjects.Claim.BrokerReference = newClaim.UCR_Ext
      })
    })

    return repOpResp
  }

  private function createNewClaim(): Claim {
    return ClaimBuilderHelper.createClaim(true)
  }

  private function refreshClaim(claimToRefresh: Claim): Claim {
    return Query.make(Claim).compare(Claim#ClaimNumber, Equals, claimToRefresh.ClaimNumber).select().AtMostOneRow
  }

}