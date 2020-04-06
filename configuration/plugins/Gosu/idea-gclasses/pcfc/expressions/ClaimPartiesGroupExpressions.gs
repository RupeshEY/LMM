package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPartiesGroupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimPartiesGroup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPartiesGroupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 17, column 21
    function action_0 () : void {
      pcf.ClaimContacts.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 21, column 21
    function action_2 () : void {
      pcf.ClaimUsers.go(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 17, column 21
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimContacts.createDestination(Claim)
    }
    
    // 'location' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 21, column 21
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimUsers.createDestination(Claim)
    }
    
    // 'canVisit' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 8, column 84
    static function canVisit_4 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewclaimparties and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 8, column 84
    static function firstVisitableChildDestinationMethod_8 (Claim :  Claim) : pcf.api.Destination {
      var dest : pcf.api.Destination
      dest = pcf.ClaimContacts.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      dest = pcf.ClaimUsers.createDestination(Claim)
      if (dest.canVisitSelf()) {
        return dest
      }
      return null
    }
    
    // LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 8, column 84
    static function parent_5 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 8, column 84
    function tabBar_onEnter_6 (def :  pcf.TabBar) : void {
      def.onEnter()
    }
    
    // 'tabBar' attribute on LocationGroup (id=ClaimPartiesGroup) at ClaimPartiesGroup.pcf: line 8, column 84
    function tabBar_refreshVariables_7 (def :  pcf.TabBar) : void {
      def.refreshVariables()
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPartiesGroup {
      return super.CurrentLocation as pcf.ClaimPartiesGroup
    }
    
    
  }
  
  
}