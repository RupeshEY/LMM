package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageXMLContentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageXMLContentPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagelog/ECFMessageXMLContentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageXMLContentPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (message :  LMMessage_Ext) : int {
      return 0
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_onEnter_0 (def :  pcf.IPLMMessageXMLContentDV_default) : void {
      def.onEnter(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_onEnter_2 (def :  pcf.IPLMMessageXMLContentDV_financialauthorisation) : void {
      def.onEnter(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_onEnter_4 (def :  pcf.IPLMMessageXMLContentDV_responserejected) : void {
      def.onEnter(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_onEnter_6 (def :  pcf.IPLMMessageXMLContentDV_responsesuperseded) : void {
      def.onEnter(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_refreshVariables_1 (def :  pcf.IPLMMessageXMLContentDV_default) : void {
      def.refreshVariables(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_refreshVariables_3 (def :  pcf.IPLMMessageXMLContentDV_financialauthorisation) : void {
      def.refreshVariables(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_refreshVariables_5 (def :  pcf.IPLMMessageXMLContentDV_responserejected) : void {
      def.refreshVariables(message)
    }
    
    // 'def' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function def_refreshVariables_7 (def :  pcf.IPLMMessageXMLContentDV_responsesuperseded) : void {
      def.refreshVariables(message)
    }
    
    // 'mode' attribute on PanelRef at ECFMessageXMLContentPopup.pcf: line 16, column 96
    function mode_8 () : java.lang.Object {
      return gw.acc.iplm.controller.LMAdminMessageLogController.messageDetailsMode(message)
    }
    
    override property get CurrentLocation () : pcf.ECFMessageXMLContentPopup {
      return super.CurrentLocation as pcf.ECFMessageXMLContentPopup
    }
    
    property get message () : LMMessage_Ext {
      return getVariableValue("message", 0) as LMMessage_Ext
    }
    
    property set message ($arg :  LMMessage_Ext) {
      setVariableValue("message", 0, $arg)
    }
    
    
  }
  
  
}