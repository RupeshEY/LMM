package gw.api.claim


@Export
class LossDetailsHomeownersHelper extends HomeownersHelper {

  construct(claim : Claim) {
    super(claim, new IncidentListUIHelper(claim, {
      IncidentUIHelpers.DWELLING,
      IncidentUIHelpers.INJURY,
      IncidentUIHelpers.LIVING_EXPENSES,
      IncidentUIHelpers.OTHER_STRUCTURE,
      IncidentUIHelpers.PROPERTY_CONTENTS,
      IncidentUIHelpers.PROPERTY_LIABILITY
    }))
  }  
  
  override property get LocationChoice() : String {
    if(_claim.LossLocation != null) {
      if(_claim.Policy.PrimaryLocation.Address == _claim.LossLocation) {
        _locationChoice = "primary"
      } else {
        _locationChoice = "other" 
      }
    }
    return _locationChoice
  }

}
