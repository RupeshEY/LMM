package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCParms.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCParmsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCParms.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCParmsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 13, column 43
    function action_0 () : void {
      pcf.WCBenefitParameterSet.go()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 15, column 34
    function action_2 () : void {
      pcf.WCPDBenefits.go()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 17, column 40
    function action_4 () : void {
      pcf.WCPDWeeksAndLimits.go()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 19, column 35
    function action_6 () : void {
      pcf.DenialPeriods.go()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 13, column 43
    function action_dest_1 () : pcf.api.Destination {
      return pcf.WCBenefitParameterSet.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 15, column 34
    function action_dest_3 () : pcf.api.Destination {
      return pcf.WCPDBenefits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 17, column 40
    function action_dest_5 () : pcf.api.Destination {
      return pcf.WCPDWeeksAndLimits.createDestination()
    }
    
    // 'location' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 19, column 35
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DenialPeriods.createDestination()
    }
    
    // 'canVisit' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 9, column 60
    static function canVisit_8 () : java.lang.Boolean {
      return perm.System.wcrefview
    }
    
    // LocationGroup (id=WCParms) at WCParms.pcf: line 9, column 60
    static function firstVisitableChildDestinationMethod_12 () : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.WCBenefitParameterSet.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WCPDBenefits.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.WCPDWeeksAndLimits.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.DenialPeriods.createDestination()
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 9, column 60
    static function parent_9 () : pcf.api.Destination {
      return pcf.Admin.createDestination()
    }
    
    // 'tabBar' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 9, column 60
    function tabBar_onEnter_10 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=WCParms) at WCParms.pcf: line 9, column 60
    function tabBar_refreshVariables_11 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.WCParms {
      return super.CurrentLocation as pcf.WCParms
    }
    
    
  }
  
  
}