package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSubrogationGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/subrogation/ClaimSubrogationGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSubrogationGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 16, column 45
    function action_0 () : void {
      pcf.SubrogationGeneral.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 19, column 45
    function action_2 () : void {
      pcf.SubrogationParties.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 16, column 45
    function action_dest_1 () : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 19, column 45
    function action_dest_3 () : pcf.api.Destination {
      return pcf.SubrogationParties.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 8, column 63
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return (perm.Claim.view(Claim) and perm.System.viewsubrodetails and Claim.SubrogationSummary != null)
    }
    
    // LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 8, column 63
    static function firstVisitableChildDestinationMethod_8 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.SubrogationGeneral.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.SubrogationParties.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 8, column 63
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 8, column 63
    function tabBar_onEnter_6 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimSubrogationGroup) at ClaimSubrogationGroup.pcf: line 8, column 63
    function tabBar_refreshVariables_7 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSubrogationGroup {
      return super.CurrentLocation as pcf.ClaimSubrogationGroup
    }
    
    
  }
  
  
}