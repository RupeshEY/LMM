package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MessageControlForDestinationListExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/messaging/MessageControlForDestinationList.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageControlForDestinationListExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (DestinationId :  int, DestinationName :  String) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at MessageControlForDestinationList.pcf: line 19, column 85
    function def_onEnter_0 (def :  pcf.MessageControlForDestinationListScreen) : void {
      def.onEnter(DestinationId, DestinationName)
    }
    
    // 'def' attribute on ScreenRef at MessageControlForDestinationList.pcf: line 19, column 85
    function def_refreshVariables_1 (def :  pcf.MessageControlForDestinationListScreen) : void {
      def.refreshVariables(DestinationId, DestinationName)
    }
    
    // 'parent' attribute on Page (id=MessageControlForDestinationList) at MessageControlForDestinationList.pcf: line 9, column 174
    static function parent_2 (DestinationId :  int, DestinationName :  String) : pcf.api.Destination {
      return pcf.MessagingDestinationControlList.createDestination()
    }
    
    // 'title' attribute on Page (id=MessageControlForDestinationList) at MessageControlForDestinationList.pcf: line 9, column 174
    static function title_3 (DestinationId :  int, DestinationName :  String) : java.lang.Object {
      return DisplayKey.get("Web.Admin.MessageControlForDestinationList", DestinationName, gw.api.util.StringUtil.formatNumber(DestinationId, "Integer"))
    }
    
    override property get CurrentLocation () : pcf.MessageControlForDestinationList {
      return super.CurrentLocation as pcf.MessageControlForDestinationList
    }
    
    property get DestinationId () : int {
      return getVariableValue("DestinationId", 0) as java.lang.Integer
    }
    
    property set DestinationId ($arg :  int) {
      setVariableValue("DestinationId", 0, $arg)
    }
    
    property get DestinationName () : String {
      return getVariableValue("DestinationName", 0) as String
    }
    
    property set DestinationName ($arg :  String) {
      setVariableValue("DestinationName", 0, $arg)
    }
    
    
  }
  
  
}