package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/vacation/Vacation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VacationExpressions {
  @javax.annotation.Generated("config/web/pcf/vacation/Vacation.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 10, column 40
    function action_0 () : void {
      pcf.VacationActivities.go()
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 12, column 36
    function action_2 () : void {
      pcf.VacationClaims.go()
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 14, column 39
    function action_4 () : void {
      pcf.VacationExposures.go()
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 10, column 40
    function action_dest_1 () : pcf.api.Destination {
      return pcf.VacationActivities.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 12, column 36
    function action_dest_3 () : pcf.api.Destination {
      return pcf.VacationClaims.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 14, column 39
    function action_dest_5 () : pcf.api.Destination {
      return pcf.VacationExposures.createDestination()
    }
    
    // LocationGroup (id=Vacation) at Vacation.pcf: line 8, column 61
    static function firstVisitableChildDestinationMethod_10 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.VacationActivities.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.VacationClaims.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.VacationExposures.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'menuActions' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 8, column 61
    function menuActions_onEnter_6 (def :  pcf.VacationMenuActions) : void {
      def.onEnter()
    }
    
    // 'menuActions' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 8, column 61
    function menuActions_refreshVariables_7 (def :  pcf.VacationMenuActions) : void {
      def.refreshVariables()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 8, column 61
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=Vacation) at Vacation.pcf: line 8, column 61
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.Vacation {
      return super.CurrentLocation as pcf.Vacation
    }
    
    
  }
  
  
}