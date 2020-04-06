package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessagePayloadPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessagePayloadPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagePayloadPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (MessageId :  long) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at MessagePayloadPopup.pcf: line 20, column 44
    function def_onEnter_1 (def :  pcf.MessagePayloadScreen) : void {
      def.onEnter(Message)
    }
    
    // 'def' attribute on ScreenRef at MessagePayloadPopup.pcf: line 20, column 44
    function def_refreshVariables_2 (def :  pcf.MessagePayloadScreen) : void {
      def.refreshVariables(Message)
    }
    
    // 'initialValue' attribute on Variable at MessagePayloadPopup.pcf: line 18, column 23
    function initialValue_0 () : Message {
      return gw.api.admin.MessagingUtil.getMessage(MessageId)
    }
    
    // 'parent' attribute on Popup (id=MessagePayloadPopup) at MessagePayloadPopup.pcf: line 9, column 66
    static function parent_3 (MessageId :  long) : pcf.api.Destination {
      return pcf.MessagingDestinationControlList.createDestination()
    }
    
    override property get CurrentLocation () : pcf.MessagePayloadPopup {
      return super.CurrentLocation as pcf.MessagePayloadPopup
    }
    
    property get Message () : Message {
      return getVariableValue("Message", 0) as Message
    }
    
    property set Message ($arg :  Message) {
      setVariableValue("Message", 0, $arg)
    }
    
    property get MessageId () : long {
      return getVariableValue("MessageId", 0) as java.lang.Long
    }
    
    property set MessageId ($arg :  long) {
      setVariableValue("MessageId", 0, $arg)
    }
    
    
  }
  
  
}