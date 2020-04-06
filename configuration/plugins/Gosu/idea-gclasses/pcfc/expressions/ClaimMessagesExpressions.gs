package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMessagesExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMessagesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ClaimMessages.pcf: line 14, column 41
    function def_onEnter_0 (def :  pcf.ClaimMessagesScreen) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on ScreenRef at ClaimMessages.pcf: line 14, column 41
    function def_refreshVariables_1 (def :  pcf.ClaimMessagesScreen) : void {
      def.refreshVariables(claim)
    }
    
    // Page (id=ClaimMessages) at ClaimMessages.pcf: line 7, column 73
    static function parent_2 (claim :  Claim) : pcf.api.Destination {
      return pcf.ECFLocationGroup.createDestination(claim)
    }
    
    override property get CurrentLocation () : pcf.ClaimMessages {
      return super.CurrentLocation as pcf.ClaimMessages
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}