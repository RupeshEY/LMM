package libraries
uses gw.api.locale.DisplayKey
uses gw.api.util.DateUtil
uses gw.api.iso.ISOKeyFieldUpdateRequest
uses gw.api.iso.ISOLossSection
uses gw.api.iso.ISOClaimSearchRequest
uses java.lang.IllegalStateException
uses java.util.Date
uses gw.api.iso.ISOConstants
uses java.lang.Throwable
uses gw.api.web.RequestVar
uses gw.api.upgrade.Coercions

@Export
class ISO {

  /**
   * Request scoped variable, used to display informational message to user in the UI. Only
   * set if an ISO request is actually sent
   */
  static var submitInfoMessage = new RequestVar<String>()
  
  /** Enforce static only access */
  private construct() {
    // Enforces static only access
  }

  /*
   * Show an informational message in the UI if a request has just been sent to ISO. Returns
   * true if there is a message to show, false otherwise. If called multiple times will only
   * add the message once. Should only be called from the UI (because it is
   * only intended for use by the UI we don't have to guard access to the
   * request scoped submitInfoMessage variable)
   */
  static function showSubmitInfoMessage() : boolean {
    if (submitInfoMessage.get() != null) {
      gw.api.util.LocationUtil.addRequestScopedInfoMessage(submitInfoMessage.get())
      submitInfoMessage.set(null)
      return true
    } else {
      return false
    }
  }

  /**
   * Looks to see if the given claim has changed and needs to be sent to ISO
   * <p>
   * If this claim should be sent to ISO at the exposure level, immediately calls
   * checkForExposureChanges on each exposure and returns
   * <p>
   * Otherwise, first checks if the claim is of interest to ISO, that it and alls
   * its exposures are valid and that we haven't already checked it in this message session.
   * Providing the claim passes these tests it is marked as "checked" (so we won't check it
   * again).
   * <p>
   * The claim is then checked for key field changes - key fields are special fields used by
   * ISO to identify the claim (claim number, policy number, loss date, agencyid) and if any of them change
   * a special key field update is sent to ISO.
   * <p>
   * Then the claim is checked for other changes. If any field relevant to ISO has changed, or
   * if the ISOStatus is "ResendPending" (i.e. the user has pressed the send to ISO button) then
   * a replacement search message is sent to ISO.
   */ 
  static function checkForClaimChanges(messageContext : MessageContext, claim : Claim) {
    if (!claim.ISOClaimLevelMessaging) {
      for (exposure in claim.ISOOrderedExposures) {
        checkForExposureChanges(messageContext, exposure)
      }
      return
    }
    if (!claim.ISOEnabled
        || !claim.isValid(TC_ISO, true)
        || isCheckedForChanges(messageContext, claim)) {
      return
    }
    markAsCheckedForChanges(messageContext, claim)
    var keyFieldChanged = false;
    if (claim.ISOStatus == TC_SENT) {
      keyFieldChanged = checkForKeyFieldChanges(messageContext, claim)
    }
    if (keyFieldChanged
        || claim.New
        || claimFieldChanged(claim, true)
        || claim.ISOOrderedExposures.hasMatch(\ e -> exposureFieldChanged(e, true))
        || claim.ISOStatus == TC_RESENDPENDING) {
      createSearchMessage(messageContext, claim)
    }
  }

  /**
   * Looks to see if the given exposure has changed and needs to be sent to ISO. If this claim should
   * be sent to ISO at the claim level, immediately calls checkForClaimChanges on the exposure's claim
   * and does nothing else.
   * <p>
   * Otherwise, first checks if the exposure is of interest to ISO, that it is valid and that we
   * haven't already checked it in this message session. Providing the exposure passes these tests it is
   * marked as "checked" (so we won't check it again).
   * <p>
   * The exposure is then checked for key field changes - key fields are special fields used by
   * ISO to identify the claim (claim number, policy number, loss date, agencyid) and if any of them change
   * a special key field update is sent to ISO.
   * <p>
   * Then the exposure is checked for other changes. If any field relevant to ISO has changed, or
   * if the ISOStatus is "ResendPending" (i.e. the user has pressed the send to ISO button) then
   * a replacement search message is sent to ISO.
   */ 
  static function checkForExposureChanges(messageContext : MessageContext, exposure : Exposure) {
    if (exposure.Claim.ISOClaimLevelMessaging) {
      checkForClaimChanges(messageContext, exposure.Claim)
      return
    }
    if (!exposure.ISOEnabled
        || !exposure.isValid(TC_ISO)
        || !exposure.Claim.isValid(TC_ISO, false)
        || isCheckedForChanges(messageContext, exposure)) {
      return;
    }
    markAsCheckedForChanges( messageContext, exposure )
    var keyFieldChanged = false;
    if (exposure.ISOStatus == TC_SENT) {
      keyFieldChanged = checkForKeyFieldChanges(messageContext, exposure)
    }
    if (keyFieldChanged
        || exposure.New
        || exposureFieldChanged(exposure, false)
        || claimFieldChanged(exposure.Claim, false)
        || exposure.ISOStatus == TC_RESENDPENDING) {
      createSearchMessage(messageContext, exposure)
    }
  }

  /**
   * Checks to see if a key field (claim number, policy number, agencyid, or loss date) has changed. If so
   * creates a new key field update message to send to ISO
   */ 
  static function checkForKeyFieldChanges(messageContext : MessageContext, reportable : ISOReportable) : boolean {
    if (!keyFieldChanged(reportable)) {
      return false
    }
    var payload = new ISOKeyFieldUpdateRequest(reportable).populate().asUTFString()
    if (payload != null) {
      var msg = messageContext.createMessage(payload)
      msg.ISOMessageType = ISOMessageType.TC_KEYFIELDUPDATE
      msg.MessageRoot = reportable
      reportable.ISOSendDate = new java.util.Date()
      setSubmitInfoMessage()
      return true;
    } else {
      return false;
    }
  }

  /**
   * Returns true if any exposure fields of interest to ISO have changed
   */
  static function exposureFieldChanged(exposure : Exposure, claimLevelMessaging : boolean) : boolean {
    if (fieldFromListChanged(exposure, { "PrimaryCoverage", "CoverageSubtype", "ISOStatus" })) {
      return true      
    }
    if (!claimLevelMessaging
        && (fieldFromListChanged(exposure, {"Incident"})
            || fieldFromListChanged(exposure.Incident, {"Description"}))) {
      return true
    }
    if (exposure.ExposureType == TC_BODILYINJURYDAMAGE) {
      if (fieldFromListChanged(exposure, { "Incident" })
          || detailedBodyPartChanged(exposure.InjuryIncident.FirstBodyPart)) {
        return true
      }
    } else if (exposure.ExposureType == TC_VEHICLEDAMAGE) {
      if (fieldFromListChanged( exposure, { "Incident" } )
          || fieldFromListChanged( exposure.VehicleIncident, { "Vehicle" } )
          || fieldFromListChanged( exposure.VehicleIncident.Vehicle, { "Year", "Vin", "Make", "Manufacturer", "SerialNumber", "BoatType", "OffRoadStyle" } )) {
        return true
      }
    }
    if (exposure.Claim.LossType != TC_WC) {
      if (exposure.isFieldChanged("ClaimantDenorm")
          || contactFieldChanged(exposure.ClaimantDenorm)) {
        return true
      }
    }
    return false;
  }
  
  /**
   * Returns true if any claim fields of interest to ISO have changed
   */
  static function claimFieldChanged(claim : Claim, claimLevelMessaging : boolean) : boolean {
    if (fieldFromListChanged(claim, {"Policy", "ClaimNumber", "LossDate", "LossLocation", "ISOEnabled"})
        || (claimLevelMessaging && fieldFromListChanged(claim, {"Description"}))
        || addressFieldChanged(claim.LossLocation)
        || claim.isFieldChanged("InsuredDenorm")
        || contactFieldChanged(claim.InsuredDenorm)) {
      return true
    }
    if (claim.LossType == TC_WC) {
      if (claim.isFieldChanged("ClaimantDenorm")
          || contactFieldChanged(claim.ClaimantDenorm)
          || claimInjuryIncidentChanged(claim.ClaimInjuryIncident)) {
        return true
      }
    }
    return false
  }
  
  /**
   * Are these key fields different from the specified ones? Not quite an
   * equality operation because if the loss dates only differ in the time of
   * day then the key fields are not considered to be different.
   */
  static function keyFieldChanged(reportable : ISOReportable) : boolean {
    var claim = reportable.ISOClaim 
    return claim.isFieldChanged("ClaimNumber")
        || claim.isFieldChanged("AgencyId")
        || claim.Policy.PolicyNumber != claim.OriginalPolicyNumber
        || (claim.isFieldChanged("LossDate")
            && DateUtil.compareIgnoreTime(Coercions.makeDateFrom(claim.getOriginalValue("LossDate")), claim.LossDate) != 0)
  }
  
  /**
   * Helper for claimFieldChanged; returns true if anything of interest to ISO has changed in the claim
   * injury incident
   */
  static function claimInjuryIncidentChanged(injuryIncident : InjuryIncident) : boolean {
    return injuryIncident.New
        || detailedBodyPartChanged(injuryIncident.FirstBodyPart)
        || fieldFromListChanged(injuryIncident, { "Description" })
  }
  
  /**
   * Helper for exposureFieldChanged and claimInjuryIncidentChanged; see if the primary body part field changed
   */
  static function detailedBodyPartChanged(bodyPart : BodyPartDetails) : boolean {
    return bodyPart.New || fieldFromListChanged(bodyPart, { "Ordering", "DetailedBodyPart"})
  }

  /**
   * Helper for anyFieldChanged; returns true if any policy fields of interest to ISO have changed
   */
  static function policyFieldChanged(policy : Policy) : boolean {
    return fieldFromListChanged(policy, { "PolicyNumber" })
  }

  /**
   * Helper for anyFieldChanged; returns true if any contact fields of interest to ISO have changed
   */
  static function contactFieldChanged(contact : Contact) : boolean {
    if (fieldFromListChanged(contact, { "PrimaryAddress", "WorkPhone", "HomePhone", "TaxId" })) {
      return true;
    }
    if ((contact typeis Person) && fieldFromListChanged(contact, { "LastName", "FirstName", "MiddleName" })) {
      return true;
    }
    if ((contact typeis Company) && fieldFromListChanged(contact, { "Name" })) {
      return true;
    }
    return false;
  }

  /**
   * Helper for anyFieldChanged; returns true if any address fields of interest to ISO have changed
   */
  static function addressFieldChanged(address : Address) : boolean {
    return fieldFromListChanged(address, { "AddressLine1", "AddressLine2", "AddressLine3", "City", "State", "PostalCode" })
  }

  /**
   * Utility method, checks if any of the named fields of the given bean have changed
   */
  static function fieldFromListChanged(bean : KeyableBean, fields : String[]) : boolean {
    if (bean == null) {
      return false;
    }
    for (field in fields) {
      if (bean.isFieldChanged(field)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Returns true if the given reportable (claim or exposure) has already been checked for changes in this
   * message session. Prevents multiple messages if a single bundle commit results in several change
   * messages
   */
  static function isCheckedForChanges(messageContext : MessageContext, reportable : ISOReportable) : boolean {
    var checkedKey = getReportableHandledKey(reportable);
    return messageContext.SessionMarker.getFromTempMap(checkedKey) != null;
  }

  /**
   * Marks the reportable (claim or exposure) as checked for this message session - see
   * isCheckedForChanges, above
   */
  static function markAsCheckedForChanges(messageContext : MessageContext, reportable : ISOReportable) {
    var checkedKey = getReportableHandledKey(reportable);
    messageContext.SessionMarker.addToTempMap(checkedKey, "Checked");
  }

  /**
   * Helper method for isCheckedForChanges, markAsCheckedForChanges. Constructs a key to store in
   * the session temp map, used to store a value which marks this reportable as already checked
   */
  static function getReportableHandledKey(reportable : ISOReportable) : String {
    return "ISOReportableHandled_" + reportable.ID.Value;
  }

  /**
   * Creates a new search message to send to ISO. Used when a reportable becomes ISO valid or if a
   * field of interest to ISO changes. This function should be suitable for most customers as it is,
   * but it calls the createSearchPayload function to create the message payload and that method
   * will need to be customized by different customers according to the exposure types in their
   * system
   */
  static function createSearchMessage(messageContext : MessageContext, reportable : ISOReportable) {
    var exposure = reportable.ISOExposure
    var payload = exposure != null
        ? createExposureLevelSearchPayload(exposure)
        : new ISOClaimSearchRequest(reportable.ISOClaim).createClaimLevelSearchPayload()
    if (payload != null) {
      var msg = messageContext.createMessage(payload)
      msg.ISOMessageType = ISOMessageType.TC_CLAIMSEARCH
      msg.MessageRoot = reportable
      reportable.ISOSendDate = new java.util.Date()
      reportable.ISOStatus = TC_SENT
      setSubmitInfoMessage()
    } else {
      if (exposure != null) {
        exposure.ISOStatus = TC_NOTOFINTEREST
      }
    }
  }

  /**
   * Sets a request scoped variable used to store an informational message
   * to display to the user. Because this method is called from event
   * messaging rules which can execute in any context (due to user change,
   * batch process, SOAP call etc.) it has to be careful about accessing
   * the request scoped variable - it's possible it won't be available in
   * the current context in which case setting it will throw an exception.
   * However setting the variable is bound to work in the one case we
   * actually care about, which is when the user has made a change through
   * the UI and we want to inform the user that their change resulted in
   * a message being sent to ISO
   */
  static function setSubmitInfoMessage() {
    try {
      submitInfoMessage.set(DisplayKey.get("Web.ISO.Send.InfoMessage"))
    } catch (e : Throwable) {
      // If couldn't set request scoped variable then don't worry - if there's
      // no request scope then there is no user to display the message to in
      // any case
    }
  }
  
  /**
   * Create an ISO search message payload appropriate to the given exposure. At this point we
   * know the exposure is valid or changed so we need to send a new search request to ISO. This
   * function examines the exposure type and decides which type of payload to send. This function
   * will need to be customized according to the exposure types configured at a customer site.
   * If this method returns null then the exposure will be marked as "not of interest" to ISO, and
   * no message will be sent. 
   */
  static function createExposureLevelSearchPayload(exposure : Exposure) : String {
    var payloadGenerator = constructExposureLevelLossSection(exposure)
    if (payloadGenerator != null) {
      return payloadGenerator.populate().asUTFString()
    } else {
      return null
    }
  }
  
  static function constructExposureLevelLossSection(exposure : Exposure) : ISOLossSection {
    var lossSectionType = exposure.ISOLossSectionType
    if (lossSectionType == null) {
      return null
    }
    var constructor = lossSectionType.TypeInfo.getConstructor({entity.Exposure})
    if (constructor == null) {
      throw new IllegalStateException(DisplayKey.get("Java.Error.ISO.NoConstructorForExposure", lossSectionType))
    }
    return constructor.Constructor.newInstance({exposure}) as ISOLossSection
  }

}
