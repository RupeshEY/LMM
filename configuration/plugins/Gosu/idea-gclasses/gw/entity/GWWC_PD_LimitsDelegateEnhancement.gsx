package gw.entity
uses gw.api.locale.DisplayKey
uses gw.api.util.LocationUtil
uses java.util.List

@Export
enhancement GWWC_PD_LimitsDelegateEnhancement : WC_PD_LimitsDelegate
{
  
  function findOverlaps(others : List<entity.WC_PD_LimitsDelegate>) : boolean {
    var foundOverlap = false
    for (other in others) {
      if (this.overlaps(other)) {
        LocationUtil.addRequestScopedErrorMessage(
          DisplayKey.get("Web.Admin.WCParams.PDBenefits.OverlappingBenefits",  this, other ))
        foundOverlap = true
      }
    }
    return foundOverlap
  }
}
