package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageSuspenseQueueExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/suspensequeue/ECFMessageSuspenseQueue.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageSuspenseQueueExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterReturnFromPopup' attribute on Page (id=ECFMessageSuspenseQueue) at ECFMessageSuspenseQueue.pcf: line 8, column 90
    function afterReturnFromPopup_2 (popupCommitted :  boolean) : void {
      wasChildPopupCommitted = popupCommitted
    }
    
    // 'def' attribute on ScreenRef at ECFMessageSuspenseQueue.pcf: line 13, column 68
    function def_onEnter_0 (def :  pcf.ECFMessageSuspenseQueueScreen) : void {
      def.onEnter(wasChildPopupCommitted)
    }
    
    // 'def' attribute on ScreenRef at ECFMessageSuspenseQueue.pcf: line 13, column 68
    function def_refreshVariables_1 (def :  pcf.ECFMessageSuspenseQueueScreen) : void {
      def.refreshVariables(wasChildPopupCommitted)
    }
    
    // Page (id=ECFMessageSuspenseQueue) at ECFMessageSuspenseQueue.pcf: line 8, column 90
    static function parent_3 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ECFMessageSuspenseQueue {
      return super.CurrentLocation as pcf.ECFMessageSuspenseQueue
    }
    
    property get wasChildPopupCommitted () : boolean {
      return getVariableValue("wasChildPopupCommitted", 0) as java.lang.Boolean
    }
    
    property set wasChildPopupCommitted ($arg :  boolean) {
      setVariableValue("wasChildPopupCommitted", 0, $arg)
    }
    
    
  }
  
  
}