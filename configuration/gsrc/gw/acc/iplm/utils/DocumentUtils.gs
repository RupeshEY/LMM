package gw.acc.iplm.utils

uses gw.api.database.Query
uses gw.util.GosuStringUtil

/**
 * This class should be responsible for any operations related to Document
 */
class DocumentUtils {

  /**
   * Find a document by it's IMR Document ID.
   *
   * @param imrDocumentId
   * @return Document
   */
  public static function findDocumentByIMRDocumentId(imrDocumentId: String): entity.Document {

    if (GosuStringUtil.isBlank(imrDocumentId)) {
      return null
    }

    return Query.make(Document)
        .compare(Document#IMRDocumentId, Equals, imrDocumentId)
        .select()
        .AtMostOneRow
  }

  /**
   * Find a document related to IMR request using the Upload Request
   * MsgID or UUID.
   *
   * @param uuid UUID of the upload request message.
   * @return Document
   */
  public static function findDocumentByUploadRqUUID(uuid: String): entity.Document {

    if (GosuStringUtil.isBlank(uuid)) {
      return null
    }

    var result = Query.make(ECFMessageDocumentUploadRq_Ext)
        .compare(ECFMessageDocumentUploadRq_Ext#UUID, Equals, uuid)
        .select()
        .AtMostOneRow

    return result?.Document
  }

  /**
   * Find a document by DocUid.
   *
   * @param docUID docUID document Id.
   * @return Document
   */
  public static function findDocument(docUID: String): entity.Document {

    if (GosuStringUtil.isBlank(docUID)) {
      return null
    }

    return gw.api.database.Query.make(entity.Document)
        .compare(entity.Document#DocUID, Equals, docUID)
        .select().AtMostOneRow
  }
}