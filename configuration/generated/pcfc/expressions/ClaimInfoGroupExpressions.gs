package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimInfoGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimInfoGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimInfoGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimInfoGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (ClaimInfo :  ClaimInfo) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimInfoGroup) at ClaimInfoGroup.pcf: line 15, column 44
    function action_0 () : void {
      pcf.ArchivedClaim.go(ClaimInfo)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimInfoGroup) at ClaimInfoGroup.pcf: line 15, column 44
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(ClaimInfo)
    }
    
    // LocationGroup (id=ClaimInfoGroup) at ClaimInfoGroup.pcf: line 7, column 77
    static function firstVisitableChildDestinationMethod_4 (ClaimInfo :  ClaimInfo) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ArchivedClaim.createDestination(ClaimInfo)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimInfoGroup) at ClaimInfoGroup.pcf: line 7, column 77
    function tabBar_onEnter_2 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimInfoGroup) at ClaimInfoGroup.pcf: line 7, column 77
    function tabBar_refreshVariables_3 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get ClaimInfo () : ClaimInfo {
      return getVariableValue("ClaimInfo", 0) as ClaimInfo
    }
    
    property set ClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("ClaimInfo", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimInfoGroup {
      return super.CurrentLocation as pcf.ClaimInfoGroup
    }
    
    
  }
  
  
}