package gw.api.iso
uses gw.api.locale.DisplayKey
uses java.lang.Long
uses xsd.iso.req.ClaimInvestigationAddRq

/**
 * Called to update ISO payloads right before they are actually sent to ISO. By
 * the time this object is invoked the message has been committed to the
 * database and any previous ISO messages associated with the claim have
 * completed.
 * <p>
 * The main job of ISOPreparePayload is to:
 * <ol>
 * <li>Set the RqUID fields in the request to a unique request id based on the
 *     message id, the claim/exposure id and the customer's ISO password.
 * <li>Set the ReplacementInd indicator field to indicate whether this is the
 *     first request for this claim/exposure, or if it is a replacement request
 *     for a claim/exposure already known to ISO. This relies on the messaging
 *     system's guarantee that all previous messages associated with the claim
 *     have been fully processed before we start to send the next message
 * <li>Check for the SuppressMatchInd flag. If this flag is set then there will
 *     be no response from ISO (unless there is an error). One special case; if
 *     SuppressMatchInd is on but the claim is not yet known to ISO then we
 *     force it off. Until the claim is known to ISO we need to get a response
 *     so we can tell if ISO will accept our message
 * </ol>
 * In addition to this core functionality this object has some code to help
 * testing (the following does not apply in production). When testing ISO it is
 * common to run into problems because tests typically send the same test data
 * to ISO repeatedly. This won't work because the first time the test runs the
 * test data won't be known to ISO, so it will need to be sent as an initial
 * request. But the next time the test runs ISO will already know about the test
 * data, so it will have to be sent as a "replacement" request. This makes it
 * hard to test the normal flow (first send an initial message, then send a
 * replacement).
 * <p>
 * To solve this problem there is a property in ISO.properties called
 * ISO.TestSuffix. This property should be 0 in production, but for testing it
 * can be set to a unique positive integer. ISOPreparePayload will then use
 * this integer to tack on a unique suffix to the various identifiers used in
 * ISO requests, fooling ISO into thinking it is seeing different data every time.
 * <p>
 * Much of what ISOPreparePayload does could be handled by a request plugin.
 * However request plugins have no way of passing additional information (other
 * than the modified payload) to the transport plugin, and we need to communicate
 * the state of SuppressMatchInd flag. So ISOPreparePayload is used instead of
 * a request plugin. 
 */
@Export
class ISOPreparePayload implements IISOPreparePayload {

  /** Logger for debug and error messages */
  var _logger = ISOProperties.LOGGER

  construct() {}

  /**
   * Main method, called to actually modify the message payload. Parses the
   * message payload, updates the RqUID fields with a valid request id, sets
   * the ReplacementInd field appropriately and, if testing, updates the test
   * ids. Finally returns the modified message payload and the SuppressMatchInd
   * flag.
   */
  override function preparePayload(payload : String, requestId : ISORequestId, reportable : ISOReportable) : IISOPreparePayload.PayloadState {
    var requestIdAsString = requestId.toString()
    if (_logger.DebugEnabled) {
      _logger.debug(DisplayKey.get("Java.Logger.ISO.Message.Transport.EnteringPreparePayload", requestId.MessageId, requestIdAsString))
    }

    var isoAcord = xsd.iso.req.ACORD.parse(payload)
    var addRequest = isoAcord.ClaimsSvcRq[0].ClaimInvestigationAddRq[0]
    
    var suppressMatches = false
    isoAcord.ClaimsSvcRq[0].RqUID = requestIdAsString
    if (addRequest != null) {
      suppressMatches = updateAddRequest(addRequest, reportable, requestId)
    }

    if (_logger.DebugEnabled) {
      _logger.debug(DisplayKey.get("Java.Logger.ISO.Message.Transport.LeavingPreparePayload", isoAcord.asUTFString()))
    }

    return new IISOPreparePayload.PayloadState(isoAcord.asUTFString(), suppressMatches)
  }
  
  /**
   * Updates the ClaimInvestigationAddRq part of the payload. Returns true if
   * the SuppressMatchInd flag is on, false otherwise. If SuppressMatchInd is
   * on but the claim is not yet known to ISO then we force it off
   */
  protected function updateAddRequest(addRequest : ClaimInvestigationAddRq,
                                      reportable : ISOReportable,
                                      requestId : ISORequestId) : boolean {
    addRequest.RqUID = requestId.toString()
    if (addRequest.ReplacementInd != null) {
      addRequest.ReplacementInd = reportable.ISOKnown ? ISOConstants.TRUE : ISOConstants.FALSE
    }
    var suppressMatches = addRequest.SuppressMatchInd == ISOConstants.TRUE
    if (suppressMatches and !reportable.ISOKnown) {
      addRequest.SuppressMatchInd = ISOConstants.FALSE
      suppressMatches = false
    }
    var testId = requestId.TestId
    if (testId != 0) {
      updateIdsForTesting(addRequest, testId)
    }
    return suppressMatches
  }

  /**
   * Updates fields in the payload by appending an encoded form of the test id.
   * The modified fields are: InsurerId, Policy and the names of claims parties.
   * The updateId utility used to update the fields does nothing if the field
   * is not present.
   */
  protected function updateIdsForTesting(addRequest : ClaimInvestigationAddRq, testId : long) {
    updateId(addRequest.ClaimsOccurrence.ItemIdInfo, "InsurerId", testId)
    updateId(addRequest.Policy, "PolicyNumber", testId)
    updateId(addRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields, "PolicyNumber", testId)
    updateId(addRequest.ComIso_Update.ComIso_OriginalFields.ComIso_KeyFields.ItemIdInfo, "InsurerId", testId)
    for (party in addRequest.ClaimsParty) {
      for (nameInfo in party.GeneralPartyInfo.NameInfo) {
        updateId(nameInfo.PersonName, "Surname", testId)
        updateId(nameInfo.CommlName, "CommercialName", testId)
      }
    }
  }

  /**
   * Update the given field within the given object by appending an encoded
   * version of the supplied testId.
   */
  protected function updateId(enclosing : Object, field : String, testId : long) {
    if (enclosing != null) {
      var value = enclosing[field] as String
      if (value != null) {
        var encodedTestId = testId <= ISORequestId.MAX_SMALL_TEST_ID ? Long.toString(testId) : Long.toHexString(testId)
        enclosing[field] = value + "_" + encodedTestId
      }
    }
  }
 
}
