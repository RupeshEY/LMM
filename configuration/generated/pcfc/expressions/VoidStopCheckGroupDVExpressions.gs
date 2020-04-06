package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VoidStopCheckGroupDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckGroupDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckGroupDV.pcf: line 25, column 98
    function def_onEnter_4 (def :  pcf.VoidStopCheckGroupLV) : void {
      def.onEnter(Check.Group)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckGroupDV.pcf: line 31, column 94
    function def_onEnter_6 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.onEnter(Check.Group.PrimaryCheck.Payments)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckGroupDV.pcf: line 25, column 98
    function def_refreshVariables_5 (def :  pcf.VoidStopCheckGroupLV) : void {
      def.refreshVariables(Check.Group)
    }
    
    // 'def' attribute on ListViewInput at VoidStopCheckGroupDV.pcf: line 31, column 94
    function def_refreshVariables_7 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.refreshVariables(Check.Group.PrimaryCheck.Payments)
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at VoidStopCheckGroupDV.pcf: line 21, column 33
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at VoidStopCheckGroupDV.pcf: line 21, column 33
    function valueRoot_3 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at VoidStopCheckGroupDV.pcf: line 21, column 33
    function value_0 () : java.lang.String {
      return Check.Comments
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    
  }
  
  
}