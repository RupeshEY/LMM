package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonCommandLabelInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonCommandLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonCommandLabelInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'colspan' attribute on LayoutConfig at RuleComparisonCommandLabelInputSet.pcf: line 18, column 52
    function colspan_0 () : java.lang.Integer {
      return controller.TotalColumns
    }
    
    // 'label' attribute on Label (id=ActionLabel) at RuleComparisonCommandLabelInputSet.pcf: line 15, column 27
    function label_1 () : java.lang.String {
      return actionLabel
    }
    
    property get actionLabel () : String {
      return getRequireValue("actionLabel", 0) as String
    }
    
    property set actionLabel ($arg :  String) {
      setRequireValue("actionLabel", 0, $arg)
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    
  }
  
  
}