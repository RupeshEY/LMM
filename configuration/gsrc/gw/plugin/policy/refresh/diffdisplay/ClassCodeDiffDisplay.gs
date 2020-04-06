package gw.plugin.policy.refresh.diffdisplay
uses gw.api.locale.DisplayKey
uses gw.api.bean.compare.EntityDiff
uses gw.api.web.UIMessageList
uses gw.api.web.UIMessage
uses gw.plugin.policy.refresh.ui.PolicyRefreshMessageContext

/**
 * DiffDisplay for a ClassCode entity.
 */
@Export
class ClassCodeDiffDisplay extends EntityDiffDisplayBase<ClassCode> {

  construct(theDiff : EntityDiff<ClassCode>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override function getMessages(ctx : PolicyRefreshMessageContext) : UIMessageList {
    var result = new UIMessageList()
    if (Type==REMOVED) {
      if (ctx.findClaimEntitiesOfTypeLinkedTo(Diff.SourceValue, EmploymentData).HasElements) {
        result.add(UIMessage.error(DisplayKey.get("PolicyRefresh.DiffDisplay.ClassCode.MissingClassCode", Diff.SourceValue)))
      }
    }
    return result;
  }
}
