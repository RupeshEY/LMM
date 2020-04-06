package gw.plugin.policy.refresh.diffdisplay
uses gw.plugin.policy.refresh.ui.EntityDiffDisplay
uses gw.api.bean.compare.EntityDiff
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.plugin.policy.refresh.ui.PropertyDiffDisplay
uses java.util.List

/**
 * DiffDisplay for PolicyLocation entities.
 */
@Export
class PolicyLocationDiffDisplay extends EntityDiffDisplayBase<PolicyLocation> {

  construct(theDiff : EntityDiff<PolicyLocation>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override property get AllChildren () : List<DiffDisplay> {
    var children =  super.AllChildren
    return children.where(\ d -> (d typeis EntityDiffDisplay and d.Diff.EntityType!=Building.Type) or (d typeis PropertyDiffDisplay))
  }

}
