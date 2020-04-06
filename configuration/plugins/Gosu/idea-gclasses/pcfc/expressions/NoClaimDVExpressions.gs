package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/NoClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NoClaimDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/NoClaimDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoClaimDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on BulletPointTextInput (id=SearchForClaim) at NoClaimDV.pcf: line 18, column 73
    function action_0 () : void {
      ClaimSearch.go()
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateNewClaim) at NoClaimDV.pcf: line 23, column 73
    function action_2 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on BulletPointTextInput (id=SearchForClaim) at NoClaimDV.pcf: line 18, column 73
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateNewClaim) at NoClaimDV.pcf: line 23, column 73
    function action_dest_3 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    
  }
  
  
}