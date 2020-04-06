package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimNumber :  String, claimStatus :  ClaimSearchType) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 17, column 92
    function action_0 () : void {
      pcf.ArchivedClaim.go(entity.Claim.finder.findClaimInfoByClaimNumber(claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 20, column 92
    function action_3 () : void {
      pcf.ClaimForward.go(entity.Claim.finder.findClaimByClaimNumber(claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 22, column 38
    function action_6 () : void {
      CannotViewClaim.go()
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 17, column 92
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(entity.Claim.finder.findClaimInfoByClaimNumber(claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 20, column 92
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClaimForward.createDestination(entity.Claim.finder.findClaimByClaimNumber(claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 22, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.CannotViewClaim.createDestination()
    }
    
    // 'condition' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 17, column 92
    function condition_2 () : java.lang.Boolean {
      return claimStatus != null and claimStatus.equals(ClaimSearchType.TC_ARCHIVED)
    }
    
    // 'condition' attribute on ForwardCondition at FreeTextClaimForward.pcf: line 20, column 92
    function condition_5 () : java.lang.Boolean {
      return claimStatus == null or !claimStatus.equals(ClaimSearchType.TC_ARCHIVED)
    }
    
    override property get CurrentLocation () : pcf.FreeTextClaimForward {
      return super.CurrentLocation as pcf.FreeTextClaimForward
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get claimStatus () : ClaimSearchType {
      return getVariableValue("claimStatus", 0) as ClaimSearchType
    }
    
    property set claimStatus ($arg :  ClaimSearchType) {
      setVariableValue("claimStatus", 0, $arg)
    }
    
    
  }
  
  
}