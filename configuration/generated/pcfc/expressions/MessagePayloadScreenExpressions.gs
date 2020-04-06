package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessagePayloadScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessagePayloadScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessagePayloadScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagePayloadScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at MessagePayloadScreen.pcf: line 14, column 33
    function def_onEnter_1 (def :  pcf.PayLoadDV) : void {
      def.onEnter(Message)
    }
    
    // 'def' attribute on PanelRef at MessagePayloadScreen.pcf: line 14, column 33
    function def_refreshVariables_2 (def :  pcf.PayLoadDV) : void {
      def.refreshVariables(Message)
    }
    
    // EditButtons at MessagePayloadScreen.pcf: line 11, column 21
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    property get Message () : Message {
      return getRequireValue("Message", 0) as Message
    }
    
    property set Message ($arg :  Message) {
      setRequireValue("Message", 0, $arg)
    }
    
    
  }
  
  
}