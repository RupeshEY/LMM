package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/reports/ReportsConfigWarningPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReportsConfigWarningPageExpressions {
  @javax.annotation.Generated("config/web/pcf/reports/ReportsConfigWarningPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportsConfigWarningPageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=ReportsConfigWarningPage) at ReportsConfigWarningPage.pcf: line 8, column 71
    static function parent_0 () : pcf.api.Destination {
      return pcf.Reports.createDestination()
    }
    
    override property get CurrentLocation () : pcf.ReportsConfigWarningPage {
      return super.CurrentLocation as pcf.ReportsConfigWarningPage
    }
    
    
  }
  
  
}