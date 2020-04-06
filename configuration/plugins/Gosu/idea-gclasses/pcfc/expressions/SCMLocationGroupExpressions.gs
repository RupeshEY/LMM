package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/SCMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SCMLocationGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/SCMLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SCMLocationGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 17, column 43
    function action_0 () : void {
      pcf.SCMClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 17, column 43
    function action_dest_1 () : pcf.api.Destination {
      return pcf.SCMClaimMessages.createDestination(claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 9, column 82
    static function canVisit_2 (claim :  Claim) : java.lang.Boolean {
      return claim.SCMVisible
    }
    
    // LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 9, column 82
    static function firstVisitableChildDestinationMethod_6 (claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.SCMClaimMessages.createDestination(claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 9, column 82
    static function parent_3 (claim :  Claim) : pcf.api.Destination {
      return pcf.IPLMLocationGroup.createDestination(claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 9, column 82
    function tabBar_onEnter_4 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=SCMLocationGroup) at SCMLocationGroup.pcf: line 9, column 82
    function tabBar_refreshVariables_5 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.SCMLocationGroup {
      return super.CurrentLocation as pcf.SCMLocationGroup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}