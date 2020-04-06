package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/ECFLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFLocationGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/ECFLocationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFLocationGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 17, column 44
    function action_0 () : void {
      pcf.ClaimTransactions.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 20, column 40
    function action_2 () : void {
      pcf.ClaimMessages.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 23, column 47
    function action_4 () : void {
      pcf.ClaimRetrieveRequest.go(claim)
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 17, column 44
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimTransactions.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 20, column 40
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimMessages.createDestination(claim)
    }
    
    // 'location' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 23, column 47
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ClaimRetrieveRequest.createDestination(claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 9, column 82
    static function canVisit_6 (claim :  Claim) : java.lang.Boolean {
      return claim.isECFVisible()
    }
    
    // LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 9, column 82
    static function firstVisitableChildDestinationMethod_10 (claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimTransactions.createDestination(claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimMessages.createDestination(claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimRetrieveRequest.createDestination(claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // 'parent' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 9, column 82
    static function parent_7 (claim :  Claim) : pcf.api.Destination {
      return pcf.IPLMLocationGroup.createDestination(claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 9, column 82
    function tabBar_onEnter_8 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ECFLocationGroup) at ECFLocationGroup.pcf: line 9, column 82
    function tabBar_refreshVariables_9 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    override property get CurrentLocation () : pcf.ECFLocationGroup {
      return super.CurrentLocation as pcf.ECFLocationGroup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  
}