package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckRecurrenceDVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/CheckRecurrenceDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckRecurrenceDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at CheckRecurrenceDV.pcf: line 15, column 27
    function def_onEnter_0 (def :  pcf.EditableRecurrenceChecksLV) : void {
      def.onEnter(Check.CheckSet)
    }
    
    // 'def' attribute on ListViewInput at CheckRecurrenceDV.pcf: line 15, column 27
    function def_refreshVariables_1 (def :  pcf.EditableRecurrenceChecksLV) : void {
      def.refreshVariables(Check.CheckSet)
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    
  }
  
  
}