package gw.plugin.policy.refresh.diffdisplay

uses java.lang.String
uses entity.RUCoverage
uses gw.api.bean.compare.EntityDiff
uses gw.plugin.policy.refresh.ui.DiffDisplay

/**
 * EntityDiffDisplay implementation for the RUCoverage entity.
 */
@Export
class RUCoverageDiffDisplay extends CoverageDiffDisplay<RUCoverage> 
{ 
  construct(theDiff : EntityDiff<RUCoverage>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override function getEntityName(bean : RUCoverage) : String {
    return bean.Type.DisplayName
  }
}
