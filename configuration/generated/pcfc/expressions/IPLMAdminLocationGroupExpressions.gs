package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/IPLMAdminLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class IPLMAdminLocationGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/IPLMAdminLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IPLMAdminLocationGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 10, column 45
    function action_0 () : void {
      pcf.IPLMAdminMessageLogPage.go()
    }
    
    // 'location' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 12, column 47
    function action_2 () : void {
      pcf.ECFAdminClaimRetrievePage.go()
    }
    
    // 'location' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 10, column 45
    function action_dest_1 () : pcf.api.Destination {
      return pcf.IPLMAdminMessageLogPage.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 12, column 47
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ECFAdminClaimRetrievePage.createDestination()
    }
    
    // LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 8, column 90
    static function firstVisitableChildDestinationMethod_7 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.IPLMAdminMessageLogPage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ECFAdminClaimRetrievePage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 8, column 90
    static function parent_4 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 8, column 90
    function tabBar_onEnter_5 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=IPLMAdminLocationGroup) at IPLMAdminLocationGroup.pcf: line 8, column 90
    function tabBar_refreshVariables_6 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.IPLMAdminLocationGroup {
      return super.CurrentLocation as pcf.IPLMAdminLocationGroup
    }
    
    
  }
  
  
}