package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedHandlerDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewAutomatedHandlerDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/specialhandling/NewAutomatedHandlerDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAutomatedHandlerDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 18, column 57
    function def_onEnter_0 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.onEnter(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 21, column 57
    function def_onEnter_2 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.onEnter(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 21, column 57
    function def_onEnter_4 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.onEnter(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 26, column 22
    function def_onEnter_7 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.onEnter(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 26, column 22
    function def_onEnter_9 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.onEnter(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 18, column 57
    function def_refreshVariables_1 (def :  pcf.AutomatedHandlerBaseInputSet) : void {
      def.refreshVariables(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 26, column 22
    function def_refreshVariables_10 (def :  pcf.AutomatedHandlerActionInputSet_notification) : void {
      def.refreshVariables(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 21, column 57
    function def_refreshVariables_3 (def :  pcf.AutomatedHandlerTriggerInputSet_claimindicatortrigger) : void {
      def.refreshVariables(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 21, column 57
    function def_refreshVariables_5 (def :  pcf.AutomatedHandlerTriggerInputSet_financialthresholdtrigger) : void {
      def.refreshVariables(newHandler)
    }
    
    // 'def' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 26, column 22
    function def_refreshVariables_8 (def :  pcf.AutomatedHandlerActionInputSet_activity) : void {
      def.refreshVariables(newHandler)
    }
    
    // 'mode' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 26, column 22
    function mode_11 () : java.lang.Object {
      return mode
    }
    
    // 'mode' attribute on InputSetRef at NewAutomatedHandlerDV.pcf: line 21, column 57
    function mode_6 () : java.lang.Object {
      return (typeof newHandler.Trigger).DisplayName
    }
    
    property get mode () : String {
      return getRequireValue("mode", 0) as String
    }
    
    property set mode ($arg :  String) {
      setRequireValue("mode", 0, $arg)
    }
    
    property get newHandler () : AutomatedHandler {
      return getRequireValue("newHandler", 0) as AutomatedHandler
    }
    
    property set newHandler ($arg :  AutomatedHandler) {
      setRequireValue("newHandler", 0, $arg)
    }
    
    
  }
  
  
}