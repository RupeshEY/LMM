package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MatterDetailGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/litigation/MatterDetailGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MatterDetailGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Matter :  Matter) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 20, column 51
    function action_0 () : void {
      pcf.MatterDetailPage.go(Claim, Matter)
    }
    
    // 'location' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 20, column 51
    function action_dest_1 () : pcf.api.Destination {
      return pcf.MatterDetailPage.createDestination(Claim, Matter)
    }
    
    // 'canVisit' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 9, column 80
    static function canVisit_2 (Claim :  Claim, Matter :  Matter) : java.lang.Boolean {
      return perm.Matter.view(Claim) and perm.System.viewmatters
    }
    
    // LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 9, column 80
    static function firstVisitableChildDestinationMethod_6 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.MatterDetailPage.createDestination(Claim, Matter)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 9, column 80
    static function parent_3 (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
      return pcf.ClaimMatters.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 9, column 80
    function tabBar_onEnter_4 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=MatterDetailGroup) at MatterDetailGroup.pcf: line 9, column 80
    function tabBar_refreshVariables_5 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.MatterDetailGroup {
      return super.CurrentLocation as pcf.MatterDetailGroup
    }
    
    property get Matter () : Matter {
      return getVariableValue("Matter", 0) as Matter
    }
    
    property set Matter ($arg :  Matter) {
      setVariableValue("Matter", 0, $arg)
    }
    
    
  }
  
  
}