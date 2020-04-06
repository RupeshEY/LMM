package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WaitingPeriodInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/shared/WaitingPeriodInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingPeriodInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput (id=WaitingPeriodDetail) at WaitingPeriodInputSet.pcf: line 41, column 25
    function def_onEnter_18 (def :  pcf.EditableWaitingPeriodsLV) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ListViewInput (id=WaitingPeriodDetail) at WaitingPeriodInputSet.pcf: line 41, column 25
    function def_refreshVariables_19 (def :  pcf.EditableWaitingPeriodsLV) : void {
      def.refreshVariables(claim)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaitingPeriodApplied) at WaitingPeriodInputSet.pcf: line 17, column 57
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claim.ClaimWorkComp.WaitingPeriodApplied = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=WCDoesnotApplytoPPD) at WaitingPeriodInputSet.pcf: line 32, column 62
    function valueRoot_12 () : java.lang.Object {
      return claim.findWCBeneCalcRef()
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaitingPeriodApplied) at WaitingPeriodInputSet.pcf: line 17, column 57
    function valueRoot_3 () : java.lang.Object {
      return claim.ClaimWorkComp
    }
    
    // 'value' attribute on BooleanRadioInput (id=WaitingPeriodApplied) at WaitingPeriodInputSet.pcf: line 17, column 57
    function value_0 () : java.lang.Boolean {
      return claim.ClaimWorkComp.WaitingPeriodApplied
    }
    
    // 'value' attribute on TextInput (id=WaitingPeriodDays) at WaitingPeriodInputSet.pcf: line 22, column 37
    function value_4 () : java.lang.Double {
      return claim.getWCWaitingDays( null )
    }
    
    // 'value' attribute on TextInput (id=TTD_RetroactivePeriod) at WaitingPeriodInputSet.pcf: line 27, column 37
    function value_6 () : java.lang.Double {
      return claim.getWCRetroactiveDays( null )
    }
    
    // 'visible' attribute on CheckBoxInput (id=WCDoesnotApplytoPTD) at WaitingPeriodInputSet.pcf: line 37, column 62
    function visible_13 () : java.lang.Boolean {
      return claim.findWCBeneCalcRef().WPNotAppliedToPTD
    }
    
    // 'visible' attribute on CheckBoxInput (id=WCDoesnotApplytoPPD) at WaitingPeriodInputSet.pcf: line 32, column 62
    function visible_8 () : java.lang.Boolean {
      return claim.findWCBeneCalcRef().WPNotAppliedToPPD
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}