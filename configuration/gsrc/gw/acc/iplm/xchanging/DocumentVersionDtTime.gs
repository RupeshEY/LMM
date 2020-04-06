package gw.acc.iplm.xchanging

uses gw.acc.iplm.dto.XchangingFixParamDTO
uses gw.acc.iplm.utils.ECFMessageConstants
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentItem
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.DocumentList
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.xml.XmlElement

/* In the DocumentDownload response which we will receive from Xchanging,
* there is currently a bug where the DocumentVersionDtTime is not formatted correctly.
* It contains a space and is missing some milliseconds digits.
* We should implement a fix which checks for this error in this specific response, and if it exists then we should manually fix the data time BEFORE processing it.
* The solution should still be able to process responses without this error so that if it gets fixed in the future, no change will be necessary.
*
* JIRA: ACC-4830
*/
class DocumentVersionDtTime implements XchangingWorkAround {

  override function xchangingFix(xchangingFixDTO: XchangingFixParamDTO): XmlElement {
   return applyAcordStandardToXchangingMessages(xchangingFixDTO.XMLPayLoad)
  }

  private function applyAcordStandardToXchangingMessages(final xmlPayload: XmlElement): XmlElement {
    var messageType = xmlPayload.$QName.LocalPart
    if (messageType == ECFMessageConstants.REPOSITORY_OPERATION_RS_QNAME_LP
        and xmlPayload.getChild(RepositoryOperationRs.$ELEMENT_QNAME_RepositoryOperationTypeCd).$SimpleValue.Value == "RepositoryDownload") {

      var docList = xmlPayload.getChild(RepositoryOperationRs.$ELEMENT_QNAME_DocumentList)
      var docItem = docList.getChild(DocumentList.$ELEMENT_QNAME_DocumentItem)
      var document = docItem.getChild(DocumentItem.$ELEMENT_QNAME_Document)
      var docVersionDtTime = document.getChild(gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.Document.$ELEMENT_QNAME_DocumentVersionDtTime)
      var dateString = docVersionDtTime.$SimpleValue.Value as String
      if (dateString?.contains(" ")) {
        docVersionDtTime.set$Text(dateString.replace(" ", "T") + "0")
      }
    }
    return xmlPayload
  }
}