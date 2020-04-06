package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/BusinessRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessRulesExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/BusinessRules.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessRulesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 10, column 35
    function action_0 () : void {
      pcf.ActivityRules.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 12, column 52
    function action_2 () : void {
      pcf.ActivityRuleExportImportStatus.go()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 10, column 35
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 12, column 52
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ActivityRuleExportImportStatus.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 8, column 63
    static function canVisit_4 () : java.lang.Boolean {
      return gw.bizrules.system.BizRulesConfigParameters.BizRulesEnabled.Value and perm.ActivityRule.view
    }
    
    // LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 8, column 63
    static function firstVisitableChildDestinationMethod_8 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ActivityRules.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ActivityRuleExportImportStatus.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 8, column 63
    static function parent_5 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 8, column 63
    function tabBar_onEnter_6 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessRules) at BusinessRules.pcf: line 8, column 63
    function tabBar_refreshVariables_7 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.BusinessRules {
      return super.CurrentLocation as pcf.BusinessRules
    }
    
    
  }
  
  
}