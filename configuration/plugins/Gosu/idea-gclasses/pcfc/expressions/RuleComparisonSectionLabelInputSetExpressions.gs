package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonSectionLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RuleComparisonSectionLabelInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/RuleComparisonSectionLabelInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleComparisonSectionLabelInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'colspan' attribute on LayoutConfig at RuleComparisonSectionLabelInputSet.pcf: line 19, column 53
    function colspan_0 () : java.lang.Integer {
      return controller.TotalColumns
    }
    
    // 'label' attribute on Label (id=SectionLabel) at RuleComparisonSectionLabelInputSet.pcf: line 16, column 28
    function label_1 () : java.lang.String {
      return sectionLabel
    }
    
    property get controller () : gw.bizrules.pcf.RuleVersionComparisonController {
      return getRequireValue("controller", 0) as gw.bizrules.pcf.RuleVersionComparisonController
    }
    
    property set controller ($arg :  gw.bizrules.pcf.RuleVersionComparisonController) {
      setRequireValue("controller", 0, $arg)
    }
    
    property get sectionLabel () : String {
      return getRequireValue("sectionLabel", 0) as String
    }
    
    property set sectionLabel ($arg :  String) {
      setRequireValue("sectionLabel", 0, $arg)
    }
    
    
  }
  
  
}