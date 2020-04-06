package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_FlagClaimIndicatorExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.FlagClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on Link (id=FlagIndicatorIcon) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 18, column 35
    function icon_1 () : java.lang.String {
      return indicator.Icon
    }
    
    // 'label' attribute on Link (id=FlagIndicatorText) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 21, column 33
    function label_3 () : java.lang.Object {
      return indicator.Text
    }
    
    // 'tooltip' attribute on Link (id=FlagIndicatorIcon) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 18, column 35
    function tooltip_2 () : java.lang.String {
      return indicator.HoverText
    }
    
    // 'value' attribute on DateInput (id=FlaggedDate) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 27, column 28
    function valueRoot_8 () : java.lang.Object {
      return indicator.Claim
    }
    
    // 'value' attribute on TextAreaInput (id=FlaggedReason) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 34, column 28
    function value_10 () : java.lang.String {
      return indicator.Claim.FlaggedReason
    }
    
    // 'value' attribute on DateInput (id=FlaggedDate) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 27, column 28
    function value_5 () : java.util.Date {
      return indicator.Claim.FlaggedDate
    }
    
    // 'visible' attribute on Link (id=FlagIndicatorIcon) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 18, column 35
    function visible_0 () : java.lang.Boolean {
      return indicator.IsOn
    }
    
    // 'visible' attribute on DateInput (id=FlaggedDate) at ClaimIndicatorInputSet.FlagClaimIndicator.pcf: line 27, column 28
    function visible_4 () : java.lang.Boolean {
      return isFlagged
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    
    property get isFlagged() : boolean {
      return indicator.Claim.Flagged == FlaggedType.TC_ISFLAGGED
    }
        
    
    
  }
  
  
}