package gw.assignment
uses gw.api.claim.ClaimAssignmentPopup
uses gw.api.exposure.ExposureAssignmentPopup
uses gw.api.matter.MatterAssignmentPopup
uses gw.api.activity.ActivityAssignmentPopup
uses gw.api.vendormanagement.ServiceRequestAssignmentPopup
uses gw.api.subrogation.SubrogationAssignmentPopup

/**
 * This class shouldn't really be necessary. The claim, exposure, matter and
 * activity CCAssignableMethods delegates in this package need to provide methods
 * which push the appropriate assignment popup for the type of delegate. But if
 * these push calls are included directly in the GScript delegate classes it can
 * cause problems at server startup (the delegate classes get verified very early
 * on, before the PCF types are loaded). So having the delegates call this class
 * allows the delegate classes to be verified without directly requiring any PCF
 * types
 */
@Export
class AssignmentPopupUtil {

  private construct() {}

  static function pushAssignClaims(claims : Claim[]) {
    pcf.AssignClaimsPopup.push(new ClaimAssignmentPopup(claims))
  }

  static function pushAssignExposures(exposures : Exposure[]) {
    pcf.AssignExposuresPopup.push(new ExposureAssignmentPopup(exposures))
  }

  static function pushAssignMatters(matters : Matter[]) {
    pcf.AssignMattersPopup.push(new MatterAssignmentPopup(matters))
  }

  static function pushAssignServiceRequests(serviceRequests : ServiceRequest[]) {
    pcf.AssignServiceRequestPopup.push(new ServiceRequestAssignmentPopup(serviceRequests));
  }

  static function pushAssignSubrogations(subrogations : Subrogation[]) {
    pcf.AssignSubrogationPopup.push(new SubrogationAssignmentPopup(subrogations));
  }

  static function pushAssignActivities(activities : Activity[]) {
    pcf.AssignActivitiesPopup.push(new ActivityAssignmentPopup(activities))
  }

}
