package gw.acc.iplm.utils


uses gw.acc.iplm.xsd.imr.schema_wsdl.acordmsgsvc_v_1_4_0.PostRs
uses org.apache.commons.io.IOUtils

uses javax.xml.soap.AttachmentPart
uses javax.xml.soap.SOAPMessage
uses java.io.IOException

/**
 * This class is a container for SOAP message utility methods
 */
class SOAPUtility {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * Create a Byte Array from the specified attachment.
   *
   * @param iterator
   * @param attachmentId
   * @return Byte Array
   */
  public static function getByteArrayForFileAttachment(iterator: java.util.Iterator, attachmentId: String): byte[] {
    while (iterator.hasNext()) {
      var attachmentPart = (iterator.next() as AttachmentPart)
      var contentId = attachmentPart.ContentId
      contentId = contentId.replace("<", "")
      contentId = contentId.replace(">", "")
      if (contentId == attachmentId) {
        return createByteArray(attachmentPart)
      }
    }
    return null
  }

  private static function createByteArray(attachmentPart: AttachmentPart): byte[] {
    var dataHandler = attachmentPart.getDataHandler()
    var contentTransferEncoding = attachmentPart.getMimeHeader(SOAPMessageConstants.CONTENT_TRANSFER_ENCODING)
    try {
      if (contentTransferEncoding?.first()?.toLowerCase() == ECFMessageConstants.BASE64) {
        return Base64.Encoder.encode(IOUtils.toByteArray(dataHandler.InputStream))
      } else {
        return IOUtils.toByteArray(dataHandler.InputStream)
      }
    } catch (e: IOException) {
      LOGGER.error("Was unable to extract attachment from IMR Message due to {}", e.Message)
    }

    return null
  }

  /**
   * This function will process IMR response receipt.
   *
   * @param soapResponse representing soap message response
   * @return PostRs the PostRs object extracted from the soap body message.
   */
  public static function processReceipt(soapResponse: SOAPMessage): PostRs {
    var postRsNode = ECFUtils.getNode(soapResponse.SOAPBody.ChildNodes, PostRs.$QNAME.LocalPart)
    var postRs = PostRs.parse(ECFUtils.convertNodeToString(postRsNode))
    return postRs
  }
}