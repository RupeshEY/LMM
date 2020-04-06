package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FatalityClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_FatalityClaimIndicatorExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FatalityClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on Link (id=FatalityIcon) at ClaimIndicatorInputSet.FatalityClaimIndicator.pcf: line 18, column 35
    function icon_1 () : java.lang.String {
      return indicator.Icon
    }
    
    // 'label' attribute on Link (id=FatalityText) at ClaimIndicatorInputSet.FatalityClaimIndicator.pcf: line 21, column 33
    function label_3 () : java.lang.Object {
      return indicator.Text
    }
    
    // 'tooltip' attribute on Link (id=FatalityIcon) at ClaimIndicatorInputSet.FatalityClaimIndicator.pcf: line 18, column 35
    function tooltip_2 () : java.lang.String {
      return indicator.HoverText
    }
    
    // 'visible' attribute on Link (id=FatalityIcon) at ClaimIndicatorInputSet.FatalityClaimIndicator.pcf: line 18, column 35
    function visible_0 () : java.lang.Boolean {
      return indicator.IsOn
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    
  }
  
  
}