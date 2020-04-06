package gw.acc.iplm.utils

uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Id
uses gw.acc.iplm.xsd.jv_ins_reinsurance_2014_06.Party
uses gw.api.database.Query
uses gw.xml.date.XmlDate
uses gw.xml.date.XmlDateTime
uses org.w3c.dom.Node
uses org.w3c.dom.NodeList
uses org.xml.sax.InputSource

uses javax.xml.parsers.DocumentBuilderFactory
uses javax.xml.soap.MessageFactory
uses javax.xml.soap.MimeHeaders
uses javax.xml.soap.SOAPMessage
uses javax.xml.transform.OutputKeys
uses javax.xml.transform.TransformerFactory
uses javax.xml.transform.dom.DOMResult
uses javax.xml.transform.dom.DOMSource
uses javax.xml.transform.stream.StreamResult
uses java.io.ByteArrayInputStream
uses java.io.ByteArrayOutputStream
uses java.io.StringWriter
uses java.nio.charset.StandardCharsets
uses java.text.ParseException

class ECFUtils {

  private static final var LOGGER = ECFConstants.LOGGER_BLOCK()

  /**
   * To Handle flexible date format by Accord.
   * The date string must conform to specific date formats.
   * If date string is null or not able to parse date with given formats, it returns null
   *
   * @param dateString
   * @return Date
   */
  public static function parseFlexibleDateType(final dateString: String): Date {
    final var dateFormats = {ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_DAY_ONLY,
        ECFConstants.ECF_DATE_FORMAT_YEAR_MONTH_ONLY, ECFConstants.ECF_DATE_FORMAT_YEAR_ONLY}
    if (dateString != null) {
      for (dateFormat in dateFormats) {
        try {
          return dateFormat.get().parse(dateString)
        } catch (e: ParseException) {
          //Dont need to throw it
        }
      }
    }
    return null
  }


  /**
   * This function will take xml Node object and returns the xml representation string.
   *
   * @param Node representing any xml node object
   * @return String the xml representation for the input node object.
   */
  public static function convertNodeToString(node: Node): String {
    var stringWriter = new StringWriter()
    var transformer = TransformerFactory.newInstance().newTransformer()
    transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes")
    transformer.setOutputProperty(OutputKeys.INDENT, "yes")
    transformer.transform(new DOMSource(node), new StreamResult(stringWriter))
    return stringWriter.toString()
  }

  /**
   * This function will take xml string and convert it to document object.
   *
   * @param xmlString representing any xml valid string
   * @return Document the document representation for the input xml string.
   */
  public static function convertXmlStringToDocument(xmlString: String): org.w3c.dom.Document {
    var documentBuilderFactory = DocumentBuilderFactory.newInstance()
    documentBuilderFactory.setNamespaceAware(true)
    var documentBuilder = documentBuilderFactory.newDocumentBuilder()
    var document = documentBuilder.parse(new InputSource(new ByteArrayInputStream(xmlString.getBytes(StandardCharsets.UTF_8))))
    return document
  }

  /**
   * This method will convert soap message to document.
   *
   * @param soapMsg The soap message we want to convert.
   * @return Document the resulting org.w3c.dom.Document object from the soap message.
   */
  public static function convertSoapMessageToDocument(soapMsg: SOAPMessage): org.w3c.dom.Document {
    var src = soapMsg.getSOAPPart().getContent()
    var tf = TransformerFactory.newInstance()
    var transformer = tf.newTransformer()
    var result = new DOMResult()
    transformer.transform(src, result)
    return result.getNode() as org.w3c.dom.Document
  }

  /**
   * This method will create party object according to the Acord standards.
   *
   * @param agency    A Agency type
   * @param partyId   A Id for the Party
   * @param partyName A Name for the Party
   * @return Party object
   */
  public static function createParty(agency: String, partyId: String, partyName: String): Party {
    var id = new Id()
    id.$Value = partyId
    id.Agency = agency
    var party = new Party()
    party.Id_elem[0] = id
    party.Name = partyName
    return party
  }

  /**
   * This method will create SOAP Message from XML Envelop payload.
   *
   * @param xml representing valid Envelop xml payload
   * @return SOAPMessage
   */
  public static function createSoapMessageFromXML(xml: String): SOAPMessage {
    var factory = MessageFactory.newInstance()
    var soapMessage = factory.createMessage(new MimeHeaders(), new ByteArrayInputStream(xml.getBytes(StandardCharsets.UTF_8)))
    return soapMessage
  }

  /**
   * This method will return Nodes collection List.
   *
   * @param NodeList Object type
   * @return List<Node>
   */
  public static function getChildNodes(nodesList: NodeList): List<Node> {
    var nodes = new ArrayList<Node>()
    for (1..nodesList.Length index x) {
      nodes.add(nodesList.item(x))
    }
    return nodes
  }

  /**
   * This method will find XML node element in a node list.
   *
   * @param NodeList
   * @param nodeName
   * @return Node
   */
  public static function getNode(nodesList: NodeList, nodeName: String): Node {
    return getChildNodes(nodesList).firstWhere(\elt -> elt?.LocalName == nodeName)
  }

  /**
   * Locates a ECFMessageClaimData_Ext message with highest role Lead and if not found try to found one with Agreement Party
   *
   * @param claim The claim which we need to send ClaimRetrieveRq for.
   * @return ECFMessageClaimData_Ext with highest role for the insurer
   */
  public static function getClaimDataMessageForTR(claimDataTR: String, claim: Claim): ECFMessageClaimData_Ext {
    var claimDataMessages = claim.LMMessages.whereTypeIs(ECFMessageClaimData_Ext)
        .where(\ecfMessage -> ecfMessage.MessageType != ECFMessageType_Ext.TC_RESPONDERRORNOTIFY
            and not ecfMessage.Suspended)

    if (claimDataTR != null) {
      claimDataMessages = claimDataMessages.where(\message -> message.TR == claimDataTR)
    }

    var claimNotifyMessage = claimDataMessages.firstWhere(\elt -> (elt as ECFMessageClaimData_Ext).PrimaryParticipantLead)

    if (claimNotifyMessage == null) {
      claimNotifyMessage = claimDataMessages.firstWhere(\elt -> (elt as ECFMessageClaimData_Ext).PrimaryParticipantAgreementParty)
    }
    if (claimNotifyMessage == null) {
      claimNotifyMessage = claimDataMessages.firstWhere(\elt -> (elt as ECFMessageClaimData_Ext).PrimaryParticipantFollower)
    }


    return claimNotifyMessage
  }

  public static function getDateFromXMLDateTime(xmlDate: XmlDateTime): Date {
    return xmlDate?.toCalendar(TimeZone.getDefault())?.getTime()
  }

  public static function getDateFromXMLDate(xmlDate: XmlDate): Date {
    return xmlDate?.toCalendar(TimeZone.getDefault())?.getTime()
  }

  /**
   * Finds the ECFParticipantFunction_Ext based on a value which comes from the Data dictionary
   */
  public static function ecfParticipantFunctionParser(participantFunction: String): ECFParticipantFunction_Ext {
    if (ECFParticipantFunction_Ext.TC_AGREEMENTPARTY.DisplayName == participantFunction) {
      return ECFParticipantFunction_Ext.TC_AGREEMENTPARTY
    } else {
      return ECFParticipantFunction_Ext.get(participantFunction)
    }
  }

  /**
   * Find the Claim assigned to message by message UUID
   *
   * @param uuid
   * @return Claim
   */
  public static function findClaimByMessageUUID(uuid: String): Claim {
    return Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, Equals, uuid).select().AtMostOneRow?.Claim
  }

  /**
   * Find the message by its UUID
   *
   * @param uuid
   * @return ECFMessage_Ext
   */
  public static function findMessageByUUID(uuid: String): ECFMessage_Ext {
    return Query.make(ECFMessage_Ext).compare(ECFMessage_Ext#UUID, Equals, uuid).select().AtMostOneRow
  }

  public static function stripPrefixesFromID(id: String): String {
    return id.split(":").last().trim()
  }

  /**
   * Builds a Long Party ID (e.g. urn:lloyds:2623) based on a given bureau and id
   * @param bureau Bureau Code
   * @param id Bureau ID
   * @return Long Party ID
   */
  public static function buildLongPartyID(bureau: String, id: String) : String {
    final var prefix = "urn"
    return "${prefix}:${bureau}:${id}"
  }

  /**
   * Remove an empty white spaces anywhere in the given string.
   * <p>
   * E.g. 12-PENDED/ REJECTED replaced with 12-PENDED/REJECTED
   *
   * @param value A value with white spaces.
   * @return String A value without white spaces.
   */
  public static function stripWhiteSpaces(value : String): String {
    if (value != null) {
      return value.replaceAll("\\s+", "")
    }
    return value
  }


  /**
   * Checks if IMR message body is expected (PostRs/PostRq) or not.
   *
   * @param soapMessage
   * @return boolean
   */
  public static function isExpectedIMRMessage(soapMessage: SOAPMessage): boolean {
    var expectedMessageBody = ECFConstants.IMR_SUPPORTED_ENVELOPE_BODY_MESSAGE_TYPES.firstWhere(\message -> ECFUtils.getNode(soapMessage.getSOAPBody().ChildNodes, message) != null)
    if (expectedMessageBody == null) {
      return false
    }
    return true
  }

  /**
   * This method will log the soap message payload.
   *
   * @param soapMessage The SOAPMessage to log.
   * @return String
   */
  public static function logSoapMessageString(soapMessage: SOAPMessage): String {
    var outputStream = new ByteArrayOutputStream()
    soapMessage.writeTo(outputStream)
    var messageXml = new String(outputStream.toByteArray())
    LOGGER.debug("The message is :\n\n {}", messageXml)
    return messageXml
  }


}