package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleExportImportStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityRuleExportImportStatusExpressions {
  @javax.annotation.Generated("config/web/pcf/bizrules/ActivityRuleExportImportStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleExportImportStatusExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'def' attribute on ScreenRef at ActivityRuleExportImportStatus.pcf: line 11, column 96
    function def_onEnter_0 (def :  pcf.RuleExportImportStatusScreen) : void {
      def.onEnter(gw.bizrules.ActivityRulesNavigationSupport.Instance)
    }
    
    // 'def' attribute on ScreenRef at ActivityRuleExportImportStatus.pcf: line 11, column 96
    function def_refreshVariables_1 (def :  pcf.RuleExportImportStatusScreen) : void {
      def.refreshVariables(gw.bizrules.ActivityRulesNavigationSupport.Instance)
    }
    
    // 'parent' attribute on Page (id=ActivityRuleExportImportStatus) at ActivityRuleExportImportStatus.pcf: line 9, column 75
    static function parent_2 () : pcf.api.Destination {
      return pcf.ActivityRules.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ActivityRuleExportImportStatus {
      return super.CurrentLocation as pcf.ActivityRuleExportImportStatus
    }
    
    
  }
  
  
}