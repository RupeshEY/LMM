package gw.acc.iplm.xmlmapper.soap

uses gw.acc.iplm.testutils.ECFMessageEntityUtil
uses gw.acc.iplm.testutils.ECFMessageUtil
uses gw.acc.iplm.utils.ECFConstants
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentContentSourceBase
uses gw.testharness.v3.GUnitTestClass
uses org.apache.commons.io.IOUtils

uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.MessageFactory
uses java.io.File
uses java.io.FileInputStream

class SoapAttachmentBuilderTest extends GUnitTestClass {

  function testXmlAttachedToSoapMessage() {
    var xml = ECFMessageUtil.createNewDocumentDownloadRq()
    var messageFactory = MessageFactory.newInstance()
    var message = messageFactory.createMessage()
    var builder = new SoapAttachmentBuilder(message)
    message = builder.addXmlAttachment(xml, "test-cid-xml")

    var attachments = message.Attachments.toList()
    assertNotNull(attachments)
    assertEquals(1, attachments.size())
    assertEquals(1, attachments.where(\attachment -> (attachment as AttachmentPart).ContentId == "<test-cid-xml>").size())
    assertEquals(xml.asUTFString(), IOUtils.toString((attachments.first() as AttachmentPart).DataHandler.InputStream))
  }

  function testDocumentAttachedToSoapMessage() {
    var document = ECFMessageEntityUtil.createDocumentDownloadRq().Document
    document = addFileToDocument(document, ECFMessageUtil.SAMPLE_ATTACHMENT_FILE)
    var messageFactory = MessageFactory.newInstance()
    var message = messageFactory.createMessage()
    var builder = new SoapAttachmentBuilder(message)
    message = builder.addDocumentAttachment(document, "test-cid-doc")

    var attachments = message.Attachments.toList()
    assertNotNull(attachments)
    assertEquals(1, attachments.size())
    assertEquals(1, attachments.where(\attachment -> (attachment as AttachmentPart).ContentId == "<test-cid-doc>").size())
    (attachments.first() as AttachmentPart).DataHandler.InputStream.close()
    deleteDocument(document)
  }

  function testAddTwoAttachmentsToSoapMessage() {
    var document = ECFMessageEntityUtil.createDocumentDownloadRq().Document
    document = addFileToDocument(document, ECFMessageUtil.SAMPLE_ATTACHMENT_FILE)
    var xml = ECFMessageUtil.createNewDocumentDownloadRq()

    var messageFactory = MessageFactory.newInstance()
    var message = messageFactory.createMessage()
    var builder = new SoapAttachmentBuilder(message)
    message = builder.addDocumentAttachment(document, "test-cid-doc")
    message = builder.addXmlAttachment(xml, "test-cid-xml")

    var attachments = message.Attachments.toList()
    assertNotNull(attachments)
    assertEquals(2, attachments.size())
    assertEquals(1, attachments.where(\elt -> (elt as AttachmentPart).ContentId == "<test-cid-doc>").size())
    assertEquals(1, attachments.where(\elt -> (elt as AttachmentPart).ContentId == "<test-cid-xml>").size())
    attachments.each(\attachment -> {
      (attachment as AttachmentPart).DataHandler.InputStream.close()
    })

    deleteDocument(document)
  }

  private function addFileToDocument(document: Document, file: File): Document {
    var testInputStream = new FileInputStream(file)
    var docContentSource = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    gw.transaction.Transaction.runWithNewBundle(\bundle -> {
      document = bundle.add(document)
      docContentSource.addDocument(testInputStream, document)
    }, ECFConstants.ECF_SUPER_USER)

    return document.refresh() as Document
  }

  private function deleteDocument(document: Document) {
    var docContentSource = Plugins.get("IDocumentContentSource") as IDocumentContentSourceBase
    docContentSource.removeDocument(document)
  }
}