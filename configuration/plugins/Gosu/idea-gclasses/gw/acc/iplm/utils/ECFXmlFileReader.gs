package gw.acc.iplm.utils

uses gw.acc.iplm.xsd.claimnotify.claimnotifyeventrq.ClaimNotifyEventRq
uses gw.acc.iplm.xsd.claimresponse.claimresponserq.ClaimResponseRq
uses gw.acc.iplm.xsd.claimresponse.claimresponsers.ClaimResponseRs
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRq
uses gw.acc.iplm.xsd.imr.acord_repository_v_1_2_0.RepositoryOperationRs
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.acc.iplm.xsd.londonmarket.jvinsreinsurance.Jv_Ins_Reinsurance
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrq.RetrieveClaimRq
uses gw.acc.iplm.xsd.retrieveclaim.retrieveclaimrs.RetrieveClaimRs
uses gw.acc.iplm.xsd.wb_header_1_0.Xchangingheader
uses gw.xml.XmlElement
uses gw.xsd.w3c.soap11_envelope.Envelope
uses org.w3c.dom.Node
uses org.w3c.dom.NodeList

uses javax.xml.namespace.QName

/**
 * This is a utility class to handle Xml file.
 */
class ECFXmlFileReader {

  /**
   * Returns a String representing the UUID for the passed in message.
   *
   * @param xmlContent the xml message string to scan.
   * @return UUID element value or null if value not found in the message
   */
  static function getUUIDValueFromXML(messageType: LMMessageTypeString_Ext, messageXmlElement: XmlElement): String {
    var xmlContent = getPayloadObject(messageXmlElement).asUTFString()
    switch (messageType) {
      case LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMNOTIFYRQ_EXT:
        return ClaimNotifyEventRq.parse(xmlContent).UUId

      case LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERQ_EXT:
        return ClaimResponseRq.parse(xmlContent).UUId

      case LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRESPONSERS_EXT:
        return ClaimResponseRs.parse(xmlContent).UUId

      case LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERQ_EXT:
        return RetrieveClaimRq.parse(xmlContent).UUId

      case LMMessageTypeString_Ext.TC_ECFMESSAGECLAIMRETRIEVERS_EXT:
        return RetrieveClaimRs.parse(xmlContent).UUId

      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRQ_EXT:
      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRQ_EXT:
      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRQ_EXT:
        return RepositoryOperationRq.parse(xmlContent).MsgId

      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTDOWNLOADRS_EXT:
      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTUPLOADRS_EXT:
      case LMMessageTypeString_Ext.TC_ECFMESSAGEDOCUMENTSEARCHRS_EXT:
        return RepositoryOperationRs.parse(xmlContent).MsgId

      case LMMessageTypeString_Ext.TC_LMMESSAGELLOYDSSCM_EXT:
        return Jv_Ins_Reinsurance.parse(xmlContent).ClaimMovement.UUId

      default:
        return null
    }
  }

  public static function getPayloadObject(xmlElement: XmlElement): XmlElement {
    if (xmlElement.$QName.LocalPart != SOAPMessageConstants.SOAP_ENVELOPE_QNAME_LP) {
      return xmlElement
    } else {
      var body = xmlElement.getChild(SOAPMessageConstants.SOAP_BODY)
      return body.$Children[0]
    }
  }

  public static function getPayloadAsString(msgFileReadAsString: String): String {
    return ECFXmlFileReader.getPayloadObject(XmlElement.parse(msgFileReadAsString)).asUTFString()
  }

  /**
   * Takes in an XmlElement representing a SOAP Envelope, and extracts the ECF Message payload from it.
   *
   * @param XmlElement which represents the SOAP Envelope.
   * @return XmlElement which represents the ECF Message payload. If xmlContent is not Qualified Name of Envelope, this returns null.
   */
  public static function getEcfMessageFromEnvelop(xmlElement: XmlElement): XmlElement {
    var ecfMessage: XmlElement
    //TODO ACC-4614 - fix the way we extract data from the message
    if (xmlElement.$QName.LocalPart == SOAPMessageConstants.SOAP_ENVELOPE_QNAME_LP) {
      var soapMessage = ECFUtils.createSoapMessageFromXML(xmlElement.asUTFString())
      var node = getBodyNode(soapMessage.SOAPBody.ChildNodes)
      ecfMessage = XmlElement.parse(ECFUtils.convertNodeToString(node))
    }
    return ecfMessage
  }

  static function getInsurerPartyDetailsFromXML(xmlContent: XmlElement): Party {
    var party: Party
    var soapMessage = ECFUtils.createSoapMessageFromXML(xmlContent.asUTFString())
    var node = getBodyNode(soapMessage.SOAPBody.ChildNodes)
    var nodeString = ECFUtils.convertNodeToString(node)
    var nodeXmlElement = XmlElement.parse(nodeString)

    switch (nodeXmlElement.$QName.LocalPart) {
      case ECFMessageConstants.CLAIM_NOTIFY_EVENT_RQ_QNAME_LP:
        var claimNotifyEventRq = ClaimNotifyEventRq.parse(nodeString)
        party = claimNotifyEventRq.ClaimMovement.Insurer.Party
        break
      case ECFMessageConstants.CLAIM_RETRIEVE_RS_QNAME_LP:
        var retrieveClaimRs = RetrieveClaimRs.parse(nodeString)
        party = retrieveClaimRs.ClaimMovement.Insurer.Party
        break
      case ECFMessageConstants.CLAIM_RESPONSE_RS_QNAME_LP:
        var claimResponseRs = ClaimResponseRs.parse(nodeString)
        party = claimResponseRs.Insurer.Party
        break
    }
    return party
  }


  private static function getBodyNode(childNdes: NodeList): Node {
    var node: Node
    if (ECFUtils.getChildNodes(childNdes)*.LocalName.contains(ClaimNotifyEventRq.$QNAME.LocalPart)) {
      node = ECFUtils.getNode(childNdes, ClaimNotifyEventRq.$QNAME.LocalPart)
    } else if (ECFUtils.getChildNodes(childNdes)*.LocalName.contains(RetrieveClaimRs.$QNAME.LocalPart)) {
      node = ECFUtils.getNode(childNdes, RetrieveClaimRs.$QNAME.LocalPart)
    } else if (ECFUtils.getChildNodes(childNdes)*.LocalName.contains(ClaimResponseRs.$QNAME.LocalPart)) {
      node = ECFUtils.getNode(childNdes, ClaimResponseRs.$QNAME.LocalPart)
    }
    return node
  }

  /**
   * Retrieves element from XML file
   *
   * @param startElement  the top most parent of the XML
   * @param parentElement the direct parent of the targeted element
   * @param childElement  the targeted element name
   * @return XmlElement
   */
  public static function getXmlElement(startElement: XmlElement, parentElement: XmlElement, childElement: String): XmlElement {
    var declaredNamespaces = startElement.$DeclaredNamespaces
    for (namespace in declaredNamespaces) {
      if (parentElement.getChild(new QName(namespace.getSecond(), childElement)) != null) {
        return parentElement.getChild(new QName(namespace.getSecond(), childElement))
      }
    }
    return null
  }

  /**
   * This method will take the xml payload string and returns the
   * corresponding xml object.
   *
   * @param xmlContent the XmlElement to convert
   * @return XmlElement representing xml object model.
   */
  static function getTypedXmlElement(xml: XmlElement): XmlElement {
    switch(xml.$QName.LocalPart){
      case ECFMessageConstants.CLAIM_NOTIFY_EVENT_RQ_QNAME_LP:
        return ClaimNotifyEventRq.parse(xml.asUTFString())
      case ECFMessageConstants.CLAIM_RESPONSE_RQ_QNAME_LP:
        return ClaimResponseRq.parse(xml.asUTFString())
      case ECFMessageConstants.CLAIM_RETRIEVE_RS_QNAME_LP:
        return RetrieveClaimRs.parse(xml.asUTFString())
      case LMMessageConstants.JV_INS_REINSURANCE_QNAME_LP:
        return Jv_Ins_Reinsurance.parse(xml.asUTFString())
      case SOAPMessageConstants.SOAP_ENVELOPE_QNAME_LP:
        return Envelope.parse(xml.asUTFString())
      default:
        return xml
    }
  }

  /**
   * This method parse ClaimNotifyEventRq or RetrieveClaimRs
   * and it will extract Xchangingheader object from the header
   *
   * @param xml the Envelope envelope to parse.
   * @return Xchangingheader.
   */
  public static function getXchangingHeader(xml: Envelope): Xchangingheader {
    var soapMessage = ECFUtils.createSoapMessageFromXML(xml.asUTFString())
    var node = ECFUtils.getNode(soapMessage.SOAPHeader.ChildNodes, Xchangingheader.$QNAME.LocalPart)
    if (node == null) {
      return null
    }
    var xchangingheaderNodeString = ECFUtils.convertNodeToString(node)
    var xchangingheader = Xchangingheader.parse(xchangingheaderNodeString)
    return xchangingheader
  }

}
