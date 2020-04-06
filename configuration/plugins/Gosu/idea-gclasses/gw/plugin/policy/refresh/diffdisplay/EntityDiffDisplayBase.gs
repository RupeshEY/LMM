package gw.plugin.policy.refresh.diffdisplay
uses gw.plugin.policy.refresh.ui.EntityDiffDisplay
uses gw.api.bean.compare.EntityDiff
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.plugin.policy.refresh.ui.PropertyDiffDisplay

/**
 * This class provides a hook for common, customizable behavior for EntityDiffDisplays. The recommended pattern is to use this class
 * as a base for all custom EntityDiffDisplay types so that they can all pick up any common behavior defined in this class.
 */
@Export
class EntityDiffDisplayBase<T extends KeyableBean> extends EntityDiffDisplay<T> {

  construct(theDiff : EntityDiff<T>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override function isChildVisible (child : DiffDisplay) : boolean {
    if (not child.HasDeepChanges) return false
    if (child typeis PropertyDiffDisplay and (this.Type==ADDED or this.Type==REMOVED)) return false
    if (child typeis PropertyDiffDisplay and 
        (child.Diff.PropertyInfo.Name.equalsIgnoreCase("AddressBookUID") or child.Diff.PropertyInfo.Name.equalsIgnoreCase("PolicySystemID"))) 
        return false
    return super.isChildVisible(child)
  }
}
