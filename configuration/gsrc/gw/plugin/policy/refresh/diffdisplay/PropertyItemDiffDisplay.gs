package gw.plugin.policy.refresh.diffdisplay
uses gw.api.locale.DisplayKey
uses gw.api.bean.compare.EntityDiff
uses gw.api.web.UIMessageList
uses gw.api.web.UIMessage
uses gw.plugin.policy.refresh.ui.PolicyRefreshMessageContext

/**
 * DiffDisplay for PropertyItems.
 */
@Export
class PropertyItemDiffDisplay extends EntityDiffDisplayBase<PropertyItem> {

  construct(theDiff : EntityDiff<PropertyItem>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override function getMessages (ctx : PolicyRefreshMessageContext) : UIMessageList {
    var result = new UIMessageList()
    if (this.Type==REMOVED) {
      if (ctx.findClaimEntitiesOfTypeLinkedTo(Diff.SourceValue, PropertyContentsScheduledItem).HasElements) {
        result.add(UIMessage.warning(DisplayKey.get("PolicyRefresh.DiffDisplay.PropertyItem.MissingPropertyItem", Diff.SourceValue)))
      }
    }
    return result;
  }
}
