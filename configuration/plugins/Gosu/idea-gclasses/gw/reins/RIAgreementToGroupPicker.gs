package gw.reins
uses entity.Exposure
uses entity.RIAgreementGroup

@Export
class RIAgreementToGroupPicker {
  private var _exposure : Exposure as Exposure
  private var _agreementGroup : RIAgreementGroup as AgreementGroup

  construct(exp : Exposure, ag : RIAgreementGroup) {
    _exposure = exp
    _agreementGroup = ag
  }
  
  property set Picked (isPicked : boolean) {
    if (isPicked) {
      ensureIsPicked()
    } else {
      ensureNotPicked()
    }
  }

  property get Picked () : boolean {
    return _agreementGroup != null
           and _agreementGroup.Exposures != null
           and _agreementGroup.Exposures.contains(_exposure)
  }

  
  private function ensureIsPicked() {
    if (getPicked()) return;
    _agreementGroup.addToExposures(_exposure)
  }
  
  private function ensureNotPicked() {
    if (!getPicked()) return;
    _agreementGroup.removeFromExposures(_exposure)
  }
  

}
