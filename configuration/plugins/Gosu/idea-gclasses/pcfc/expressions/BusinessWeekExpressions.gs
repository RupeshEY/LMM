package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeek.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeek.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'canVisit' attribute on LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    static function canVisit_0 () : java.lang.Boolean {
      return perm.BusinessWeek.view
    }
    
    // LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    static function firstVisitableChildDestinationMethod_6 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.BusinessWeekPage.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuLinks' attribute on LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    function menuLinks_onEnter_1 (def :  pcf.BlankMenuLinks) : void {
      def.onEnter()
    }
    
    // 'menuLinks' attribute on LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    function menuLinks_refreshVariables_2 (def :  pcf.BlankMenuLinks) : void {
      def.refreshVariables()
    }
    
    // LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    static function parent_3 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    function tabBar_onEnter_4 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=BusinessWeek) at BusinessWeek.pcf: line 9, column 64
    function tabBar_refreshVariables_5 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.BusinessWeek {
      return super.CurrentLocation as pcf.BusinessWeek
    }
    
    
  }
  
  
}