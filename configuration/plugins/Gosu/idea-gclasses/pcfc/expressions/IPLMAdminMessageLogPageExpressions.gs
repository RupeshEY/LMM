package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/admin/IPLMAdminMessageLogPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMAdminMessageLogPageExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/admin/IPLMAdminMessageLogPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMAdminMessageLogPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at IPLMAdminMessageLogPage.pcf: line 13, column 36
    function def_onEnter_0 (def :  pcf.ECFMessageLogScreen) : void {
      def.onEnter()
    }
    
    // 'def' attribute on ScreenRef at IPLMAdminMessageLogPage.pcf: line 13, column 36
    function def_refreshVariables_1 (def :  pcf.ECFMessageLogScreen) : void {
      def.refreshVariables()
    }
    
    // Page (id=IPLMAdminMessageLogPage) at IPLMAdminMessageLogPage.pcf: line 11, column 88
    static function parent_2 () : pcf.api.Destination {
      return pcf.IPLMAdminLocationGroup.createDestination()
    }
    
    override property get CurrentLocation () : pcf.IPLMAdminMessageLogPage {
      return super.CurrentLocation as pcf.IPLMAdminMessageLogPage
    }
    
    
  }
  
  
}