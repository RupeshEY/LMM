package gw.plugin.policy.refresh.diffdisplay
uses gw.api.bean.compare.EntityDiff

/**
 * In the out of box implementation this is the fallback EntityDiffDisplay implementation, used if there is no
 * specific mapping for an entity type in the PolicyRefreshConfiguration.DiffDisplayTypes map. It is, by default,
 * mapped to KeyableBean. Most customers will not need to modify this class, or change that mapping. 
 *
 * See EntityDiffDisplayBase for providing common, customized behavior for EntityDiffDisplays.
 */
@Export
class KeyableBeanDiffDisplay extends EntityDiffDisplayBase<KeyableBean> {
  construct(theDiff : EntityDiff<KeyableBean>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }
}
