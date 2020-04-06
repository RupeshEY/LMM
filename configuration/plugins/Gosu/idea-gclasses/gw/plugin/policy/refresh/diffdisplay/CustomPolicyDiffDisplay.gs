package gw.plugin.policy.refresh.diffdisplay

uses gw.api.locale.DisplayKey
uses gw.plugin.policy.refresh.ui.EntityDiffDisplay
uses gw.api.bean.compare.EntityDiff
uses gw.plugin.policy.refresh.ui.DiffDisplay
uses gw.api.web.UIMessageList
uses java.util.ArrayList
uses gw.plugin.policy.refresh.ui.PolicyRefreshMessageContext
uses gw.api.web.UIMessage
uses gw.api.bean.compare.ui.HierarchicalDiff
uses java.util.List

/**
 * Custom DiffDisplay for the Policy entity that demonstrates
 * an alternate arrangement of children in the tree display.
 */
@Export
class CustomPolicyDiffDisplay extends EntityDiffDisplayBase<Policy> {
  
  static class ContainerDiffDisplay implements DiffDisplay, HierarchicalDiff<DiffDisplay> {

    private var _children = new ArrayList<DiffDisplay>()
    
    override property get AllChildren() : List<DiffDisplay> {
      return _children.copy()
    }

      override property get Label() : String {
      return DisplayKey.get("PolicyRefresh.DiffDisplay.AllPeople")
    }

      override function getMessages(ctx : PolicyRefreshMessageContext) : UIMessageList {
      return new UIMessageList()
    }

      override property get NewValue() : String {
      return ""
    }

      override property get OldValue() : String {
      return ""
    }

      override property get Type() : gw.api.bean.compare.ui.DiffDisplay.Type {
      return UNCHANGED
    }

      override property get VisibleChildren() : List<DiffDisplay> {
      return AllChildren
    }

      override function addChild(p0 : DiffDisplay) {
        _children.add(p0)
    }

    }

  private var _container : ContainerDiffDisplay = null
  
  construct(theDiff : EntityDiff<Policy>, theType : gw.api.bean.compare.ui.DiffDisplay.Type) {
    super(theDiff, theType)
  }

  override function addChild (child : DiffDisplay) {
    if (child typeis EntityDiffDisplay and child.Diff.EntityType == Person) {
      if (_container == null) {
        _container = new ContainerDiffDisplay()
        super.addChild(_container)
      }
      _container.addChild(child)
    } else {
      super.addChild(child)
    }
  }
  
  /**
   * Validates any changes to the Policy.
   */
  override function getMessages(ctx : PolicyRefreshMessageContext) : UIMessageList {
    var messages = new UIMessageList()
    if(Type==CHANGED) {
      if( Diff.SourceValue.Currency!=Diff.CompareValue.Currency) {
        messages.add(UIMessage.error(DisplayKey.get("PolicyRefresh.DiffDisplay.Policy.CurrencyChange")))
      }
    }
    return messages
  }
}
