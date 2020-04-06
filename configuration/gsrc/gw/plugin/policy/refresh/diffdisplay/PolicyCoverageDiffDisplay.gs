package gw.plugin.policy.refresh.diffdisplay

uses gw.api.bean.compare.EntityDiff

/**
 * EntityDiffDisplay implementation for the RUCoverage entity.
 */
@Export
class PolicyCoverageDiffDisplay extends CoverageDiffDisplay<PolicyCoverage> 
{ 
  /**
   * Constructs the DiffDisplay with the entity differences and the type.
   */
  construct(theDiff : EntityDiff<PolicyCoverage>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }
}
