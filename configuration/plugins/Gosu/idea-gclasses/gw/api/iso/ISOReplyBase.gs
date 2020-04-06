package gw.api.iso

uses gw.api.locale.DisplayKey
uses gw.datatype.DataTypes
uses gw.document.DocumentProduction

uses javax.xml.transform.OutputKeys
uses javax.xml.transform.Source
uses javax.xml.transform.TransformerFactory
uses javax.xml.transform.URIResolver
uses javax.xml.transform.dom.DOMSource
uses javax.xml.transform.stream.StreamResult
uses javax.xml.transform.stream.StreamSource
uses java.io.StringWriter
uses java.lang.StringBuilder
uses java.lang.Throwable
uses java.text.ParseException
uses java.text.SimpleDateFormat
uses java.util.Collections
uses java.util.Date
uses java.util.HashSet
uses gw.api.util.ConfigAccess
uses gw.plugin.Plugins
uses gw.plugin.document.IDocumentTemplateSource

/**
 * Parses the asynchronous response (RSP) from ISO in response to an intial request and identifies the corresponding
 * claim/exposure encoded in the response RqUID field. Provides methods to verify that the response is
 * valid and successful, and to add details about the reply (XML document, match reports) to
 * the claim/exposure
 */
@Export
class ISOReplyBase implements IISOReply {

  /**
   * The xml received in the response is stored in an XPNode. The XPNode constructor parses the xml into a DOM. The wrapping
   * XPNode then allows XPath expressions to be used to access the elements and attributes of the DOM.
   */
  private final var _isoResponse : XPNode

  /** The ISO properties */
  private final var _isoProperties : ISOProperties as readonly Properties

  /** The reply's request id */
  private final var _requestId : ISORequestId as readonly RequestId
  
  /** The claim/exposure corresponding to this reply */
  private final var _reportable : ISOReportable as readonly Reportable

  private final var _logger = ISOProperties.LOGGER

  /**
   * Create a new ISOReply object from the given XML string. Also checks the password and
   * finds the claim/exposure associated with this reply.
   * @param xml the XML string to be parsed
   * @throws an ISOBadReplyException if the reply cannot be parsed, does not have a valid
   *   RqUID, or contains a bad customer password
   */
  @Throws(ISOBadReplyException, "If response cannot be parsed, or password/requestId is not valid.")
  construct(xml : String) {
    _isoProperties = ISOProperties.instance()

    try {
      _isoResponse = new XPNode(xml)
    } catch (e : Throwable ) {
      var msg = DisplayKey.get("Java.Error.ISO.Response.Parse")
      _logger.error(msg + ": " + xml)
      throw new ISOBadReplyException(msg, e)
    }

    if (_logger.DebugEnabled) {
      _logger.debug(DisplayKey.get("Java.Logger.ISO.Response.Transport.ReceivedRSP", _isoResponse.format()))
    }

    var elementPath = "ClaimInvestigationAddRs/MsgStatus"
    var msgStatus = _isoResponse.getElement(elementPath)
    if (msgStatus == null) {
      var msg = DisplayKey.get("Java.Error.ISO.Response.MissingElement", elementPath)
      _logger.error(msg + ": " + xml)
      throw new ISOBadReplyException(msg)
    }
    elementPath = "ClaimInvestigationAddRs/MsgStatus/MsgStatusCd"
    var msgStatusCd = _isoResponse.getElement(elementPath)
    if (msgStatusCd == null) {
      var msg = DisplayKey.get("Java.Error.ISO.Response.MissingElement", elementPath)
      _logger.error(msg + ": " + xml)
      throw new ISOBadReplyException(msg)
    }

    var rqUID = _isoResponse.getElementContent("ClaimInvestigationAddRs/RqUID")
    _requestId = ISORequestId.parse(rqUID, _isoProperties.getTestSuffix())
    if (not ValidCustomerPassword) {
      var msg = DisplayKey.get("Java.Error.ISO.Response.InvalidPassword")
      _logger.error(msg + ": " + xml)
      throw new ISOBadReplyException(msg)
    }
    if (RequestId == null) {
      var msg = DisplayKey.get("Java.Error.ISO.Response.InvalidRequestId")
      _logger.error(msg + ": " + xml)
      throw new ISOBadReplyException(msg)
    }
    _reportable = gw.transaction.Transaction.Current.loadBean(RequestId.ReportableId) as ISOReportable
  }

  /**
   * Checks whether the reply contains a valid customer password. The password can be given either in
   * the com_iso_CustLoginPwd aggregate, or embedded in the request id (or both). If the password in
   * either place matches this property will be true.
   */
  protected property get ValidCustomerPassword() : boolean {
    var validPassword = false
    var password = _isoResponse.getElementContent("ClaimInvestigationAddRs/com.iso_CustLoginPwd")
    validPassword = _isoProperties.CustomerPassword == password
    if (not validPassword and RequestId != null){
      validPassword = _isoProperties.CustomerPassword == RequestId.Password
    }
    return validPassword
  }

  /**
   * True if this reply is associated with a valid claim/exposure, false otherwise. Could
   * return false if a claim has been purged or archived.
   */
  property get Applicable() : boolean {
    return Reportable != null
  }

  /**
   * True if the the reply contains the expected "Success" message status code. If this property
   * is false then ISO did not accept the original message and there should be an error message
   * in MsgStatus.MsgStatusDesc. This property determines whether we ack or nack the corresponding
   * ISO transport message.
   */
  property get Successful() : boolean {
    var msgStatus = _isoResponse.getElementContent("ClaimInvestigationAddRs/MsgStatus/MsgStatusCd")
    return ISOConstants.RESPONSE_STATUS_SUCCESS == msgStatus
  }
  
  /**
   * Called if Successful is true, to add the XML reply string as a document on the exposure/claim.
   */
  function addReplyAsDocument() {
    var nameFormat = Properties.MatchReportNameFormat
    if (nameFormat.HasContent) {
      var name = new SimpleDateFormat(nameFormat).format(Date.CurrentDate)
      var document = new Document(Reportable.Bundle)
      document.Name = name
      document.Type = DocumentType.TC_ISO
      document.Claim = Reportable.ISOClaim
      document.Exposure = Reportable.ISOExposure
      document.Status = DocumentStatusType.TC_FINAL
      var template = Plugins.get(IDocumentTemplateSource).getDocumentTemplate("ISOMatchReport.gosu.xml", null)
      var xslFileURL = template.getContextObjectDefaultValueExpression("xsl_file")
      var html = processXMLWithXLSTStylesheet(xslFileURL)
      DocumentProduction.createAndStoreDocumentSynchronously(template, Collections.singletonMap("html", html), document)
    }
  }

  //This class is used for resolving relative stylesheets (via include href="...")
  class RelativeURIResolver implements URIResolver {
    override function resolve(href : String, base : String) : Source  {
      return new StreamSource(ConfigAccess.getConfigFile("config/iso/xsl/" + href).toURI().toString())
    }
  }

  //Style the XML from ISO via the xslt template (provided by ISO) and return the resulting html
  function processXMLWithXLSTStylesheet(xslFileURL : String) : String {
    var dom = _isoResponse.Document
    //we still need to add the processing instruction here because one of the stylesheets looks at it to
    //determine the relative path for images (imgBase)
    var pi = dom.createProcessingInstruction("xml-stylesheet", "type=\"text/xsl\" href=${xslFileURL}")
    //insert this processing instruction before the root element of the DOM
    dom.insertBefore(pi, dom.FirstChild)
    var domSource = new DOMSource(dom)
    var tFactory = TransformerFactory.newInstance()

    //This is the main xsl file used to do server-side transformation.  It includes other files at runtime that
    //are located via the RelativeURIResolver
    var xsltSource = new StreamSource(ConfigAccess.getConfigFile("config/iso/xsl/CS_Xml_Output.xsl").toURI().toString())
    // XXX for 'xsl:import' to load other xsls from class path
    tFactory.setURIResolver(new RelativeURIResolver())
    var cachedXSLT = tFactory.newTemplates(xsltSource)
    var transformer = cachedXSLT.newTransformer()
    transformer.setOutputProperty(OutputKeys.INDENT, "yes")
    var streamResult = new StreamResult(new StringWriter())
    //This actually does the transfor from XML to HTML via the xsl template provided by ISO
    transformer.transform(domSource, streamResult)
    return streamResult.getWriter().toString()
  }

  /**
   * Called if Successful is true, to update the claim/exposure with details of the reply. Updates
   * the ISOReceiveDate and ISOKnown fields, nulls out the ISOErrorMessage and, if there are match
   * reports, creates an activity to notify the user.
   */
  function updateReportableOnSuccess() {
    Reportable.ISOReceiveDate = Date.CurrentDate
    Reportable.ISOErrorMessage = null
    if (Reportable.ISOMatchReports.hasMatch(\ m -> m.New)) {
      Reportable.ISOClaim.createActivityFromPattern(Reportable.ISOExposure, ActivityPattern.finder.getActivityPatternByCode("iso_matches"))
    }
    Reportable.ISOKnown = true
  }
  
  /**
   * Called if Successful is true, to add ISOMatchReport entities to the claim/exposure. A new
   * ISOMatchReport entity is created for each match report aggregate in the reply. If the new
   * match report matches an existing report, as determined by matchReportsAreEqual, then the
   * method handleDuplicateMatchReport is called to process the duplicates. Finally the method
   * handleObsoleteMatchReport is called for each match report in the claim/exposure's array 
   * that is not either new or one of the already processed duplicates.
   */
  function addMatchReportRecords() {
    var existingDuplicates = new HashSet<ISOMatchReport>()
    for (var matchDetail in _isoResponse.getElements("ClaimInvestigationAddRs/MatchDetails")) {
      var newReport = createMatchReport(matchDetail)
      var matchingExistingReport = Reportable.ISOMatchReports.firstWhere(\ r -> r != newReport and matchReportsAreEqual(r, newReport))
      if (matchingExistingReport != null) {
        handleDuplicateMatchReport(matchingExistingReport, newReport)
        existingDuplicates.add(matchingExistingReport)
      }
    }
    var newMatchReports = Reportable.Bundle.getInsertedBeansOfType(ISOMatchReport).toSet()
    for (matchReport in Reportable.ISOMatchReports) {
      if (not newMatchReports.contains(matchReport) and not existingDuplicates.contains(matchReport)) {
        handleObsoleteMatchReport(matchReport)
      }
    }
  }

  /**
   * Called if Successful is false to update the ISOErrorMessage and ISOReceiveDate fields on
   * the claim/exposure. Also creates a new activity to notify the user that an error has
   * occurred.
   */
  function updateReportableOnErrorStatus() : String {
    var path = "ClaimInvestigationAddRs/MsgStatus"
    var msgStatus = _isoResponse.getElement(path)
    var errorMessage = DisplayKey.get("Java.Error.ISO.IncorrectStatus", path, msgStatus.getElementContent("MsgStatusCd"),
      ISOConstants.RESPONSE_STATUS_SUCCESS, msgStatus.getElementContent("MsgStatusDesc"))
    Reportable.ISOErrorMessage = errorMessage
    Reportable.ISOReceiveDate = Date.CurrentDate
    var activity = Reportable.ISOClaim.createActivityFromPattern(Reportable.ISOExposure,
        ActivityPattern.finder.getActivityPatternByCode("iso_matches"))
    activity.Subject = DisplayKey.get("Java.Error.ISO.IncorrectStatus.Subject")
    activity.Description = errorMessage
    return errorMessage
  }
  
  /**
   * Utility to log the reply message to a file, if message logging is enabled in ISO.properties
   */
  function logReplyMessage() {
    var messageId = RequestId.getMessageId()    
    _isoProperties.MessageLogger.logResponse(messageId as int, _isoResponse.format())
  }

  /**
   * Called to create a new ISOMatchReport entity from the given MatchDetails aggregate. Can be
   * overridden but subclasses would usually override populateMatchReportFromXML which is called
   * from within this method to populate all the simple fields in the match report.
   */
  protected function createMatchReport(matchDetail : XPNode) : ISOMatchReport {
    var matchReport = Reportable.addNewISOMatchReport()
    matchReport.ReceivedDate = Date.CurrentDate
    var lossDt = matchDetail.getElementContent("ClaimsOccurrence/LossDt")
    var lossTime = matchDetail.getElementContent("ClaimsOccurrence/LossTime")
    matchReport.DateOfLoss = createDateOfLoss(lossDt, lossTime)
    var matchReason = getMatchReasons(matchDetail)
    matchReport.MatchReasons = matchReason
    populateMatchReportFromXML(matchReport, matchDetail)
    return matchReport
  }

  /**
   * Called to determine whether two match reports are equal. If you add additional fields to ISOMatchReport
   * you should override this method, call super.matchReportsAreEqual and then add in equality checks for the
   * additional fields.
   */
  protected function matchReportsAreEqual(toFind : ISOMatchReport, report : ISOMatchReport) : boolean {
    return report.DateOfLoss == toFind.DateOfLoss
            and report.MatchReasons == toFind.MatchReasons
            and report.ClaimNumber == toFind.ClaimNumber
            and report.PolicyNumber == toFind.PolicyNumber
            and report.PolicyType == toFind.PolicyType
            and report.InsuringCompany == toFind.InsuringCompany
            and report.InsurerAddress1 == toFind.InsurerAddress1
            and report.InsurerAddress2 == toFind.InsurerAddress2
            and report.InsurerAddress3 == toFind.InsurerAddress3
            and report.InsurerAddressCity == toFind.InsurerAddressCity
            and report.InsurerAddressState == toFind.InsurerAddressState
            and report.InsurerAddressPostalCode == toFind.InsurerAddressPostalCode
            and report.InsurerPhone == toFind.InsurerPhone
  }
  
  /**
   * Called when a new ISO match report matches an existing match report. The default behavior is to update the
   * received date on the existing report and then discard the new report. Subclasses can change this behavior by
   * overriding this method.
   */  
  protected function handleDuplicateMatchReport(oldISOMatchReport : ISOMatchReport, newISOMatchReport : ISOMatchReport) {
    oldISOMatchReport.ReceivedDate = newISOMatchReport.ReceivedDate
    Reportable.Bundle.delete(newISOMatchReport)
  }
  
  /**
   * Called on all match reports which are obsolete - that is they were added when processing a previous reply
   * but do not match any of the new reports for the current reply. The default behavior is to just leave these
   * reports intact but subclasses can change this behavior by overriding this method.
   */  
  protected function handleObsoleteMatchReport(isoMatchReport : ISOMatchReport) {
  }
  
  /**
   * Utility to create a Date object from the LossDt/LossTime fields provided in a MatchDetails aggregate
   */
  protected function createDateOfLoss(date : String, time : String) : Date {
    var dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm")
    if (not date.HasContent) {
      return null 
    }
    var dateTime = date + " " + (time.HasContent ? time : "00.00")
    try {
      return dateFormat.parse(dateTime)
    } catch (e : ParseException) {
      return null
    }
  }

  /**
   * Builds a comma separated list of match reason codes from the list of MatchReasonInfo aggregates in
   * the given MatchDetails aggregate. If the resulting list is too long to fit in the ISOMatchReport
   * MatchReasons field it is truncated.
   */  
  protected function getMatchReasons(matchDetail : XPNode) : String {
    var alreadySeen = new HashSet<java.lang.String>()
    var reasons = new StringBuilder()
    for (var matchReasonInfo in matchDetail.getElements("MatchReasonInfo")) {
      for (var matchReasonCd in matchReasonInfo.getElements("MatchReasonCd")) {
        var reason = matchReasonCd.getElementContent(".")
        if (alreadySeen.add(reason)) {
          if (reasons.length() > 0) {
            reasons.append(",")
          }
          reasons.append(reason)
        }
      }
    }
    var lengthLimit = DataTypes.get(ISOMatchReport.Type.TypeInfo.getProperty("MatchReasons")).asPersistentDataType().Length
    if (reasons.length() > lengthLimit) {
      var lastCommaIndex = reasons.lastIndexOf(",", lengthLimit)
      reasons.setLength(lastCommaIndex >= 0 ? lastCommaIndex : 0);
    }
    return reasons.length() > 0 ? reasons.toString() : null;
  }
  
  /**
   * Utility called to populate the fields in a match report entity from a MatchDetail aggregate. If you add
   * additional fields to ISOMatchReport you should override this method to call super.populateMatchReportFromXML
   * and then add in your additional fields.
   */
  protected function populateMatchReportFromXML(matchReport : ISOMatchReport, matchDetail : XPNode) {
    matchReport.ClaimNumber = matchDetail.getElementContent("ClaimsOccurrence/ItemIdInfo/InsurerId")
    matchReport.PolicyNumber = matchDetail.getElementContent("Policy/PolicyNumber")
    matchReport.PolicyType = matchDetail.getElementContent("Policy/LOBCd")
    var miscParties = matchDetail.getElements("Policy/MiscParty")
    if (miscParties.size() != 0) {
      var firstMiscParty = miscParties.get(0)
      var nameInfos = firstMiscParty.getElements("GeneralPartyInfo/NameInfo")
      matchReport.InsuringCompany = nameInfos.size() != 0 ?
        nameInfos.get(0).getElementContent("CommlName/CommercialName") : null
      var addresses = firstMiscParty.getElements("GeneralPartyInfo/Addr")
      if (addresses.size() != 0) {
        var firstAddr = addresses.get(0)
        matchReport.InsurerAddress1 = firstAddr.getElementContent("Addr1")
        matchReport.InsurerAddress2 = firstAddr.getElementContent("Addr2")
        matchReport.InsurerAddress3 = firstAddr.getElementContent("Addr3")
        matchReport.InsurerAddressCity = firstAddr.getElementContent("City")
        matchReport.InsurerAddressState = firstAddr.getElementContent("StateProvCd")
        matchReport.InsurerAddressPostalCode = firstAddr.getElementContent("PostalCode")
      }
      var phoneInfos = firstMiscParty.getElements("GeneralPartyInfo/Communications/PhoneInfo")
      if (phoneInfos.size() != 0) {
        var phoneNumbers = phoneInfos.get(0).getElements("PhoneNumber")
        if (phoneNumbers.size() != 0) {
          matchReport.InsurerPhone = phoneNumbers.get(0).getElementContent(".")
        }
      }
    }
  }

  /**
    * function to get the list of elements specified by the xPathString
    * @param xPathString the XPath that specifies the list of elements
    * @return the list of elements, each wrapped in its own XPNode
    */
  override function getElements(xPathString: String): List<XPNode> {
    return _isoResponse.getElements(xPathString)
  }

  /**
   * function to get the single element specified by the xPathString
   * @param xPathString the XPath that specifies the element
   * @return the element, wrapped in its own XPNode
   */
  override function getElement(xPathString: String): XPNode {
    return _isoResponse.getElement(xPathString)
  }

  /**
   * function to get the content of a single element specified by the xPathString
   * @param xPathString the XPath that specifies the element
   * @return the content of the element
   */
  override function getElementContent(xPathString: String): String {
    return _isoResponse.getElementContent(xPathString)
  }

  /**
   * function to get the value of a single attribute specified by the xPathString
   * @param xPathString the XPath that specifies the attribute
   * @return the value of the attribute
   */
  override function getAttributeValue(xPathString: String): String {
    return _isoResponse.getAttributeValue(xPathString)
  }

  /**
   * function to build a "pretty-printed" representation of the underlying xml of the reply
   * @return "pretty-printed" representation of the underlying xml of the reply
   */
  override function format() : String {
    return _isoResponse.format()
  }
}
