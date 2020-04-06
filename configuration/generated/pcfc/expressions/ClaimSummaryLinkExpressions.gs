package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ClaimSummaryLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryLinkExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ClaimSummaryLink.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryLinkExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimNumber :  String) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 22, column 87
    function action_2 () : void {
      ClaimSummary.go(retriveClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 25, column 87
    function action_5 () : void {
      pcf.ArchivedClaim.go(retriveClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 28, column 45
    function action_8 () : void {
      ClaimSearch.go(errorMessage)
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 22, column 87
    function action_dest_3 () : pcf.api.Destination {
      return pcf.ClaimSummary.createDestination(retriveClaimInfo.Claim)
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 25, column 87
    function action_dest_6 () : pcf.api.Destination {
      return pcf.ArchivedClaim.createDestination(retriveClaimInfo)
    }
    
    // 'action' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 28, column 45
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination(errorMessage)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 28, column 45
    function condition_10 () : java.lang.Boolean {
      return retriveClaimInfo == null
    }
    
    // 'condition' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 22, column 87
    function condition_4 () : java.lang.Boolean {
      return retriveClaimInfo != null and retriveClaimInfo.ArchiveState == null
    }
    
    // 'condition' attribute on ForwardCondition at ClaimSummaryLink.pcf: line 25, column 87
    function condition_7 () : java.lang.Boolean {
      return retriveClaimInfo != null and retriveClaimInfo.ArchiveState != null
    }
    
    // 'initialValue' attribute on Variable at ClaimSummaryLink.pcf: line 15, column 25
    function initialValue_0 () : ClaimInfo {
      return (gw.api.database.Query.make(entity.ClaimInfo).compare("ClaimNumber", Equals, claimNumber).select()).getAtMostOneRow()
    }
    
    // 'initialValue' attribute on Variable at ClaimSummaryLink.pcf: line 19, column 22
    function initialValue_1 () : String {
      return getErrorMessage()
    }
    
    override property get CurrentLocation () : pcf.ClaimSummaryLink {
      return super.CurrentLocation as pcf.ClaimSummaryLink
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get errorMessage () : String {
      return getVariableValue("errorMessage", 0) as String
    }
    
    property set errorMessage ($arg :  String) {
      setVariableValue("errorMessage", 0, $arg)
    }
    
    property get retriveClaimInfo () : ClaimInfo {
      return getVariableValue("retriveClaimInfo", 0) as ClaimInfo
    }
    
    property set retriveClaimInfo ($arg :  ClaimInfo) {
      setVariableValue("retriveClaimInfo", 0, $arg)
    }
    
    
    function getErrorMessage() : String {
            if (retriveClaimInfo == null) {
              return DisplayKey.get("Web.ClaimSearch.Error.NoClaimFound", claimNumber)
            }
            return null
          }
          
        
    
    
  }
  
  
}