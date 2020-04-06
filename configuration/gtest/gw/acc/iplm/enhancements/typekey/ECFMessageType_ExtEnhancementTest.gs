package gw.acc.iplm.enhancements.typekey

uses gw.testharness.v3.GUnitTestClass

class ECFMessageType_ExtEnhancementTest extends GUnitTestClass {

  function testIsECFWriteback_ClaimNotify() {
    final var messageType = ECFMessageType_Ext.TC_CLAIMNOTIFY
    assertTrue(messageType.ECFWritebackType)
  }

  function testIsECFWriteback_ClaimRespond() {
    final var messageType = ECFMessageType_Ext.TC_CLAIMRESPOND
    assertTrue(messageType.ECFWritebackType)
  }

  function testIsECFWriteback_ClaimRetrieve() {
    final var messageType = ECFMessageType_Ext.TC_RETRIEVECLAIM
    assertTrue(messageType.ECFWritebackType)
  }

  function testIsECFWriteback_RespondErrorNotify() {
    final var messageType = ECFMessageType_Ext.TC_RESPONDERRORNOTIFY
    assertTrue(messageType.ECFWritebackType)
  }

  function testIsECFWriteback_NumberOfMessages() {
    final var expectedNumberOfMessages = 5
    final var typeFilter = ECFMessageType_Ext.TF_ECFWRITEBACK
    assertEquals(expectedNumberOfMessages, typeFilter.getTypeKeys().size())
  }

  function testIsIMR_RepositoryDownload() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOAD
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_RepositoryDownloadReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOADRECEIPT
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_RepositoryUpload() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYUPLOAD
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_RepositoryUploadReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYUPLOADRECEIPT
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_RepositorySearch() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYSEARCH
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_RepositorySearchReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYSEARCHRECEIPT
    assertTrue(messageType.IMRType)
  }

  function testIsIMR_NumberOfMessages() {
    final var expectedNumberOfMessages = 6
    final var typeFilter = ECFMessageType_Ext.TF_IMR
    assertEquals(expectedNumberOfMessages, typeFilter.getTypeKeys().size())
  }

  function testIsClaimMovement_RepositorySearch() {
    final var messageType = ECFMessageType_Ext.TC_LLOYDSSYNDICATECLAIM
    assertTrue(messageType.ClaimMovementType)
  }

  function testIsClaimMovement_NumberOfMessages() {
    final var expectedNumberOfMessages = 1
    final var typeFilter = ECFMessageType_Ext.TF_CLAIMMOVEMENT
    assertEquals(expectedNumberOfMessages, typeFilter.getTypeKeys().size())
  }

  function testIsSubMessage_RespondErrorNotify() {
    final var messageType = ECFMessageType_Ext.TC_RESPONDERRORNOTIFY
    assertTrue(messageType.SubMessageType)
  }

  function testIsSubMessage_RepositoryDownloadReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYDOWNLOADRECEIPT
    assertTrue(messageType.SubMessageType)
  }

  function testIsSubMessage_RepositoryUploadReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYUPLOADRECEIPT
    assertTrue(messageType.SubMessageType)
  }

  function testIsSubMessage_RepositorySearchReceipt() {
    final var messageType = ECFMessageType_Ext.TC_REPOSITORYSEARCHRECEIPT
    assertTrue(messageType.SubMessageType)
  }

  function testIsSubMessage_NumberOfMessages() {
    final var expectedNumberOfMessages = 5
    final var typeFilter = ECFMessageType_Ext.TF_SUBMESSAGE
    assertEquals(expectedNumberOfMessages, typeFilter.getTypeKeys().size())
  }
}