package gw.api.iso

uses java.lang.Exception
uses gw.api.locale.DisplayKey

/**
 * Parses the initial synchronous AK (ACKnowledgment) or "receipt" returned by ISO in response to a search
 * or key field update request. Provides the ensureAccepted utility to verify that all the status
 * fields in the receipt are set correctly and that the request has been accepted for processing. The actual
 * response to the request is received asynchronously in ISOReplyPlugin.handleISOReply.
 */
@Export
class ISOReceiptBase implements IISOReceipt {

  /**
   * The xml received in the AK is stored in an XPNode. The XPNode constructor parses the xml into a DOM. The wrapping
   * XPNode then allows XPath expressions to be used to access the elements and attributes of the DOM.
   */
  private final var _isoAK : XPNode
  private final var _logger = ISOProperties.LOGGER

  /**
   * Create a new ISOReceipt from the given XML string
   */
  construct(xml : String) {
    try {
      _isoAK = new XPNode(xml)
    } catch (e : Exception) {
      var msg = DisplayKey.get("Java.Error.ISO.AK.Parse")
      _logger.error(msg  + ": " + xml)
      throw new ISOBadReceiptException(msg, e)
    }

    if (_logger.DebugEnabled) {
      _logger.debug(DisplayKey.get("Java.Logger.ISO.Message.Transport.ReceivedAK", _isoAK.format()))
    }
  }

  /**
   * Verify that all the status codes indicate the request was accepted by ISO for processing.
   */
  @Throws(ISOBadReceiptException, "If receipt contains a status code indicating that the request was not accepted for processing.")
  public function ensureAccepted() {
    checkACORDStatus()
    checkSignonStatus()
    checkClaimSvcStatus()
    checkClaimInvestigationAddStatus()
  }

  /**
   * Called by ensureAccepted to verify that the top level status code (for XML formatting) is correct. Throws an
   * ISOBadReceiptException explaining the problem if the code is incorrect.
   */
  protected function checkACORDStatus() {
    ensureStatusValid("ACORD/Status/StatusCd", \ -> ACORDStatusCode, ISOConstants.RECEIPT_STATUS_CODE_OK, \ -> ACORDStatusDesc)
  }

  /**
   * Called by ensureAccepted to verify that the SignonRs status code is correct. Throws an
   * ISOBadReceiptException explaining the problem if the code is incorrect.
   */
  protected function checkSignonStatus() {
    ensureStatusValid("ACORD/SignonRs/Status/StatusCd", \ -> SignonStatusCode, ISOConstants.RECEIPT_STATUS_CODE_OK, \ -> SignonStatusDesc)
  }

  /**
   * Called by ensureAccepted to verify that the ClaimsSvcRs status code is correct. Throws an
   * ISOBadReceiptException explaining the problem if the code is incorrect.
   */
  protected function checkClaimSvcStatus() {
    ensureStatusValid("ACORD/ClaimsSvcRs[1]/Status/StatusCd", \ -> ClaimsSvcStatusCode, ISOConstants.RECEIPT_STATUS_CODE_OK,
      \ -> ClaimsSvcStatusDesc)
  }

  /**
   * Called by ensureAccepted to verify that the ClaimInvestigationAddRs message status code is
   * correct. Throws an ISOBadReceiptException explaining the problem if the code is incorrect.
   */
  protected function checkClaimInvestigationAddStatus() {
    ensureStatusValid("ACORD/ClaimsSvcRs[1]/ClaimInvestigationAddRs/MsgStatus/MsgStatusCd", \ -> ClaimInvestigationAddCode,
      ISOConstants.RECEIPT_STATUS_RESPONSE_PENDING, \ -> ClaimInvestigationAddDesc)
  }

  /**
   * Utility method used by all the checks which verify that a status code has a particular expected
   * value. The parameters are the path to the status code, the code's value, the expected value and
   * the description of the problem given in the status description field.
   */
  @Throws(ISOBadReceiptException, "If the status code is not as expected")
  protected function ensureStatusValid(path : String, Code() : String, expectedCode : String, Desc() : String) {
    var code = Code()
    if (code == null || code.trim() == "")  {
      var msg = DisplayKey.get("Java.Error.ISO.AK.MissingElement", path)
      _logger.error(msg + ": " + _isoAK.format())
      throw new ISOBadReceiptException (msg)
    }
    if (!code.equalsIgnoreCase(expectedCode)) {
      var desc = Desc()
      if (desc == null || desc.trim() == "") {
        desc = DisplayKey.get("Java.Error.ISO.AK.MissingDesc")
      }
      throw new ISOBadReceiptException (path, code, expectedCode, desc)
    }
  }

  /**
   * All of the following properties return either an empty string ("") or the actual string.
   */
  private property get ACORDStatusCode() : String {
    return _isoAK.getElementContent("ACORD/Status/StatusCd")
  }

  private property get ACORDStatusDesc() : String {
    var elem = _isoAK.getElement("ACORD/Status/StatusDesc/StatusDescShort")
    if (elem != null) {
      return elem.getElementContent(".")
    }
    return _isoAK.getElementContent("ACORD/Status/StatusDesc")
  }

  private property get SignonStatusCode() : String {
    return _isoAK.getElementContent("ACORD/SignonRs/Status/StatusCd")
  }

  private property get SignonStatusDesc() : String {
    var elem = _isoAK.getElement("ACORD/SignonRs/Status/StatusDesc/StatusDescShort")
    if (elem != null) {
      return elem.getElementContent(".")
    }
    return _isoAK.getElementContent("ACORD/SignonRs/Status/StatusDesc")
  }

  private property get ClaimsSvcStatusCode() : String {
    return _isoAK.getElementContent("ACORD/ClaimsSvcRs[1]/Status/StatusCd")
  }

  private property get ClaimsSvcStatusDesc() : String {
    var elem = _isoAK.getElement("ACORD/ClaimsSvcRs[1]/Status/StatusDesc/StatusDescShort")
    if (elem != null) {
      return elem.getElementContent(".")
    }
    return _isoAK.getElementContent("ACORD/ClaimsSvcRs[1]/Status/StatusDesc")
  }

  private property get ClaimInvestigationAddCode() : String {
    return _isoAK.getElementContent("ACORD/ClaimsSvcRs[1]/ClaimInvestigationAddRs/MsgStatus/MsgStatusCd")
  }

  private property get ClaimInvestigationAddDesc() : String {
    return _isoAK.getElementContent("ACORD/ClaimsSvcRs[1]/ClaimInvestigationAddRs/MsgStatus/MsgStatusDesc")
  }
}


