package libraries

uses gw.api.locale.DisplayKey

uses java.lang.Throwable
uses gw.cc.system.integration.messaging.metro.MetroMessageGenerator

@Export
class Metro {
  private construct() {
    // Enforces static only access
  }

  /**
   * Looks through all the Metro reports on the given claim and returns true if
   * there is at least one with the status "new"
   */
  static function hasNewMetroRequest(claim : Claim) : boolean {
    return claim.MetroReports.toList().hasMatch(\ metroReport -> metroReport.Status == TC_NEW )
  }

  /**
   * Looks for Metro reports with "new" status and checks that they have all the
   * necessary required fields. If a "new" report does have all the required
   * fields its status is set to "validated" and the Metro workflow is started.
   * If a "new" report does not have all the required fields its status is set
   * to "insufficientData" and a new activity is created using the 
   * "metropolitan_request_failed" pattern.
   */
  static function validateAndStartReportFlows(claim : Claim)  { 
    for (metroReport in claim.MetroReports) {
      if (metroReport.Status == TC_NEW) {
        var errorMessage = checkRequiredFields(claim, metroReport); 
        if (errorMessage == "") {
          metroReport.Status = TC_VALIDATED
          metroReport.startReportFlow()
        } else { 
          metroReport.Status = TC_INSUFFICIENTDATA
          var activity = claim.createActivityFromPattern(null,  ActivityPattern.finder.getActivityPatternByCode("metropolitan_request_failed"))
          activity.setFieldValue( "description", errorMessage );
        }
      } 
    }
  }

  /**
   * Checks a new Metro report to see if it has all the required fields needed
   * to construct a request to Metro. It first checks a set of common fields
   * required for all Metro report types, then checks fields specific to
   * individual test types.
   * <p>
   * This method returns an empty string ("") if all the required fields
   * are present and an error message describing the missing required fields
   * if some are missing. The error message is typically used as the description
   * in an activity warning the user of the problem.
   */
  static function checkRequiredFields(claim : Claim, metroReport : MetroReport) : String {
    var type = metroReport.MetroReportType.Code;
    var missingFields = new java.util.ArrayList();
    
   // Checks apply to all type of report.
    if (claim.ClaimNumber == null) {missingFields.add(DisplayKey.get("Metro.Fields.ClaimNumber"))}
    if (claim.Policy.PolicyNumber == null) {missingFields.add(DisplayKey.get("Metro.Fields.PolicyNumber"))}
    if (claim.LossDate == null) {missingFields.add(DisplayKey.get("Metro.Fields.LossDate"))}
    if (claim.LossLocation.AddressLine1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.LossLocation.AddressLine1"))}
    if (claim.LossLocation.City == null) {missingFields.add(DisplayKey.get("Metro.Fields.LossLocation.City") )}
    if (claim.LossLocation.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.LossLocation.State"))}
    if (metroReport.AgentCity == null ) {missingFields.add(DisplayKey.get("Metro.Fields.AgentCity"))}
    if (metroReport.AgentState == null ) {missingFields.add(DisplayKey.get("Metro.Fields.AgentState"))}
    if (metroReport.CreateUser.Contact.FirstName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Requester.FirstName"))}
    if (metroReport.CreateUser.Contact.LastName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Requester.LastName"))}
    if (metroReport.CreateUser.Contact.EmailAddress1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.Requester.Email"))}
    if (metroReport.CreateUser.Contact.PrimaryPhoneValue == null) {missingFields.add(DisplayKey.get("Metro.Fields.Requester.Phone"))}
    if (claim.Insured == null ) {missingFields.add(DisplayKey.get("Metro.Fields.Insured"))}
    if (claim.Insured typeis Company) { // Commercial 
      if (claim.Insured.Name == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Company.Name"))}
    } else if (claim.Insured typeis Person){
      if (claim.Insured.LastName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Person.LastName"))}
      if (claim.Insured.FirstName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Person.FirstNumber"))}
    }
    if (claim.LossType == TC_WC) {
      if (claim.claimant.LastName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Claimant.LastName"))}
      if (claim.claimant.FirstName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Claimant.FirstName"))}
    }
        
    switch( type )
    {
      case "A": // Auto Accident report type
      {
        // if Driver is null, the we put "Parked" in first name and last name fields.
        //if (metroReport.VehicleIncident.driver.LastName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.LastName"))}
        //if (metroReport.VehicleIncident.driver.FirstName == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.FirstName"))}        
        break;
      }
      case "D":
      {
        if (claim.Insured typeis Person ) {
          if (claim.Insured.LicenseNumber == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Person.LicenseNumber"))}
          if (claim.Insured.LicenseState == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Person.LicenseState"))}
        }
        if (metroReport.VehicleIncident.driver.LicenseNumber == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.LicenseNumber"))}
        if (metroReport.VehicleIncident.driver.LicenseState == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.LicenseState"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.AddressLine1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.AddressLine1"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.City == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.City"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.State"))}
        break;
      }
      case "E":
      {  
        if (metroReport.DateOfDeath == null) {missingFields.add(DisplayKey.get("Metro.Fields.DeathDate"))}
        break;
      }
      case "H":
      {
        if (metroReport.DateOfDeath == null) {missingFields.add(DisplayKey.get("Metro.Fields.DeathDate"))}
        break;
      }
      case "M" :
      {  
        if (claim.Insured typeis Person ) {
          if (claim.Insured.DateOfBirth == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.Person.DateOfBirth"))}
        }
        if (claim.Insured.PrimaryAddress.AddressLine1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.AddressLine1"))}
        if (claim.Insured.PrimaryAddress.City == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.City"))}
        if (claim.Insured.PrimaryAddress.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.State"))}
        if (metroReport.VehicleIncident.driver.DateOfBirth == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.DateOfBirth"))}
        if (metroReport.ThirdPartyVehicle.driver.DateOfBirth == null) {missingFields.add(DisplayKey.get("Metro.Fields.ThirdPartyVehicle.Driver.DateOfBirth"))}
        break;
      }
      case "N" :
      {
        if (claim.Insured.TaxID == null) {missingFields.add(DisplayKey.get("Metro.Fields.Insured.FEINOfficial"))}
        break;
      }
      case "O" :
      {
        if (metroReport.LossDescription == null){missingFields.add(DisplayKey.get("Metro.Fields.LossDate"))}
        break;
      }
      case "R" :
      {
        if (metroReport.VehicleIncident.driver.PrimaryAddress.AddressLine1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.AddressLine1"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.City == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.City"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.State"))}
        if (metroReport.VehicleIncident.Vehicle.Year == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Year"))}
        if (metroReport.VehicleIncident.Vehicle.LicensePlate == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.LicensePlate"))}
        if (metroReport.VehicleIncident.Vehicle.Make == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Make"))}
        if (metroReport.VehicleIncident.Vehicle.Model == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Model"))}
        if (metroReport.VehicleIncident.Vehicle.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.State"))}
        if (metroReport.VehicleIncident.Vehicle.Vin == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.VIN"))}
        break;
      }
      case "S" :
      {
        if (metroReport.VehicleIncident.driver.PrimaryAddress.AddressLine1 == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.AddressLine1"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.City == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.City"))}
        if (metroReport.VehicleIncident.driver.PrimaryAddress.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Driver.State"))}
        if (metroReport.VehicleIncident.Vehicle.Year == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Year"))}
        if (metroReport.VehicleIncident.Vehicle.LicensePlate == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.LicensePlate"))}
        if (metroReport.VehicleIncident.Vehicle.Make == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Make"))}
        if (metroReport.VehicleIncident.Vehicle.Model == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.Model"))}
        if (metroReport.VehicleIncident.Vehicle.State == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.State"))}
        if (metroReport.VehicleIncident.Vehicle.Vin == null) {missingFields.add(DisplayKey.get("Metro.Fields.Vehicle.VIN"))}
        break;
      }
      default: 
      {
       
      }
    }
    return (missingFields.size() == 0) ? "" : composeInsufficientDataMessage(missingFields) ;
     
  }

  /**
   * Used by checkRequiredFields to construct an error message describing the
   * given list of missing required fields. The missingFields argument should
   * be a list of required field names which are missing their values.
   * <p>
   * Returns "" (meaning no error) if the list is empty. Returns a localizable
   * error message followed by a comma separated list of field names if the list
   * is not empty.
   */
  static function composeInsufficientDataMessage(missingFields : java.util.List) : String {
    if ( missingFields.size() == 0 ) {
      return "";
    }
    return DisplayKey.get("Metro.Activity.InsufficientData.Message") + missingFields.join(",")
  }

  /**
   * Used by the event messaging rules to construct a new "order file" message
   * to sent to the Metro service. An order file message is the initial message
   * sent to Metro, notifying the service that we'll be requesting a report.
   */
  static function composeOrderFileMessage(messageContext : MessageContext, metroReport : MetroReport) {
    var payload : String;
    try {
      metroReport.SentDate = gw.api.util.DateUtil.currentDate();
      payload = MetroMessageGenerator.generatePayload(metroReport)
    } catch(e : Throwable){
      metroReport.Status = TC_ERROR
      metroReport.ErrorMessage = e.getMessage()
    } 
    if (payload != null) {
      var msg = messageContext.createMessage(payload);
    } else {
      metroReport.SentDate = null
      metroReport.Status = TC_ERROR
      metroReport.ErrorMessage = DisplayKey.get("Metro.Order.Payload.ErrorMessage");
    }  
  }

  /**
   * Used by the event messaging rules to construct a new "order inquiry"
   * message to send to the Metro service. An order inquiry message is sent
   * some time after the initial "order file" message, to check if the report
   * is ready and to return status including the URL of the completed report
   * if it is available. The exact time between the initial order file and
   * the first order inquiry message is configurable via the
   * Metro.InquiryInterval property in the Metro.properties file.
   */
  static function composeOrderInquiryFileMessage(messageContext : MessageContext, 
            metroReport :MetroReport) {
    var payload : String;
    try {
      payload = MetroMessageGenerator.generateInquiryPayload(metroReport)
    } catch(e : Throwable){
      metroReport.Status = TC_ERROR
      metroReport.ErrorMessage = e.getMessage()
    } 
    if (payload != null) {
      var msg = messageContext.createMessage(payload);
      msg.MessageRoot = metroReport;
    } else {
      metroReport.Status = TC_ERROR
      metroReport.ErrorMessage = DisplayKey.get("Metro.Inquiry.Payload.ErrorMessage");
    }  
  }

  /**
   * Downloads the Metro report as a document, using the DocumentURL in the
   * Metro report object. This method is called after a succesful reply to an
   * order inquiry message, so it is assumed the DocumentURL has been set by
   * the Metro transport. If it has been set the document will be downloaded
   * and the report status is changed to "received". If the DocumentURL is
   * missing or cannot be downloaded the report status is set to error.
   */
  static function downloadHasReportDocument(metroReport : MetroReport) {
    if (metroReport.DocumentURL == null ) {
       metroReport.ErrorMessage = DisplayKey.get("Metro.Inquiry.DownloadReport.EmptyURL.ErrorMessage"); 
       metroReport.Status = TC_ERROR;  
       return;
    }
    try{
      metroReport.createMetroDocument();
      //the document entity can be modify here before downloading. for example : metroReport.Doc.Author = DisplayKey.get("Java.Activity.AssignedByUser.SystemUser"); 
      metroReport.downloadDocument();
      metroReport.Status = TC_RECEIVED;  // notify the metroflow the report is successfully downloaded.
    } catch (e : Throwable) {
      metroReport.Status = TC_ERROR;
      metroReport.ErrorMessage = DisplayKey.get("Metro.Inquiry.DownloadReport.ErrorMessage", metroReport.DocumentURL);
    }
  }

  /**
   * Downloads the Metro report as a document, using the DocumentURL in the
   * Metro report object. This method is very similar to
   * downloadHasReportDocument. The difference is that it does not require the
   * DownloadURL to be present; if it is not this method just does nothing
   * instead of setting the report status to "error". This method is called
   * from a different point in the workflow, when Metro has replied that the
   * order is closed, so at this point it is not essential for the report to
   * be present.
   */
  static function downloadClosedDocument(metroReport : MetroReport) {
    // the closed metro report is not necessary having a document associated to it. 
    // Only download the document if the documentURL is not null 
    if (metroReport.DocumentURL == null ) {
      return;
    }
    try {
      metroReport.createMetroDocument();
      //the document entity can be modify here before downloading. for example : metroReport.Doc.Author = "Guidewire"; 
      metroReport.downloadDocument();
    } catch (e : Throwable) {
      metroReport.Status = TC_ERROR;
      metroReport.ErrorMessage = DisplayKey.get("Metro.Inquiry.DownloadReport.ErrorMessage", metroReport.DocumentURL); 
    } 
  }

}
