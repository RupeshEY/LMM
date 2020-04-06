package libraries

@Export
class Activityassignment
{

  private construct()
  {
    // Enforces static only access
  }

  static function getUserRoleGroupTypeBasedonActivityPattern(activitypattern : String) : String[]
  {
  var userrole : String
  var grouptype  : String
  if (activitypattern == "legal_review")
  {
  userrole = "Attorney"
  grouptype = "Litigation"
  }
  if (activitypattern == "fnol" || activitypattern == "fnol_review")
  {
  grouptype = "Intake"
  }
  if (activitypattern == "appraisal_drivein")
  {
  grouptype = "drive_in"
  }
  if (activitypattern == "appraisal_preferred")
  {
  grouptype = "preferred"
  }
  if (activitypattern == "appraisal_independent" )
  {
  userrole = "indepappr"
  grouptype = "independent"
  }
  if (activitypattern == "nurse_visit")
  {
  userrole = "nursecasemgr"
  grouptype = "rehab"
  }
  if (activitypattern == "property_inspection")
  {
  userrole = "propinsp"
  grouptype = "prop_inspectors"
  }
  if (activitypattern == "fraud_review"  || activitypattern == "theft_statement" || activitypattern == "SIU_escalation" || activitypattern == "SI_review")
  {
  userrole = "siu"
  grouptype = "siu"
  }
  if (activitypattern == "salvage_vehicle" || activitypattern == "salvage_vehicle")
  {
  userrole = "salvgowner"
  grouptype = "salvage"
  }
  if (activitypattern == "subro" || activitypattern == "subroletter1" || activitypattern == "subroletter2" || activitypattern == "subroletter3" 
  || activitypattern == "deductible_refund")
  {
  userrole = "subrogationowner"
  grouptype = "subro"
  }
  if (activitypattern == "medical_review")
  {
  userrole = "doctor"
  grouptype = "medical_mgmt"
  }
  if (activitypattern == "police_report")
  {
  userrole = "police"
  grouptype = "police"
  }
  
  return new String[] {userrole, grouptype}
  }

}
