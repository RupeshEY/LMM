package gw.plugin.policy.refresh.diffdisplay

uses gw.api.locale.DisplayKey
uses gw.plugin.policy.refresh.ui.PolicyRefreshMessageContext
uses gw.api.web.UIMessageList
uses gw.api.web.UIMessage
uses gw.api.bean.compare.EntityDiff

/**
 * Custom DiffDisplay for the Policy entity.
 */
@Export
class PolicyDiffDisplay extends EntityDiffDisplayBase<Policy> {
  
  construct(theDiff : EntityDiff<Policy>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }
  
  /**
   * Validates any changes to the Policy.
   */
  override function getMessages(ctx : PolicyRefreshMessageContext) : UIMessageList {
    var messages = new UIMessageList()
    if(Type==CHANGED) {
      if(Diff.SourceValue.Currency!=Diff.CompareValue.Currency) {
        if(not Diff.SourceValue.CurrencyEditable) {
          messages.add(UIMessage.error(DisplayKey.get("PolicyRefresh.DiffDisplay.Policy.CurrencyChange")))
        } else {
          messages.add(UIMessage.warning(DisplayKey.get("PolicyRefresh.DiffDisplay.Policy.CurrencyChange")))
        }
      }
      //warn if the PolicySystemPeriodID is different
      if(Diff.SourceValue.PolicySystemPeriodID!=null and Diff.SourceValue.PolicySystemPeriodID!=Diff.CompareValue.PolicySystemPeriodID) {
        messages.add(UIMessage.warning(DisplayKey.get("PolicyRefresh.DiffDisplay.Policy.PolicySystemPeriodIdChange")))
      }
    }
    return messages
  }
}
