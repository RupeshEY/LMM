package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/util/ClaimExposureEntryPointForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimExposureEntryPointForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/util/ClaimExposureEntryPointForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimExposureEntryPointForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claimNumber :  String, exposureClaimOrder :  String, exposureId :  String) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 35, column 205
    function action_10 () : void {
      EndUserError.go(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotVisitExposure", exposureClaimOrder != null ? exposureClaimOrder : exposureId, claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 28, column 34
    function action_2 () : void {
      EndUserError.go(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotFindClaim", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 31, column 37
    function action_5 () : void {
      EndUserError.go(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotFindExposure", exposureClaimOrder != null ? exposureClaimOrder : exposureId, claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 33, column 59
    function action_8 () : void {
      ExposureDetailForward.go(claim, exposure)
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 35, column 205
    function action_dest_11 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotVisitExposure", exposureClaimOrder != null ? exposureClaimOrder : exposureId, claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 28, column 34
    function action_dest_3 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotFindClaim", claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 31, column 37
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EndUserError.createDestination(DisplayKey.get("Web.EntryPoint.ClaimExposureEntryPointForward.CouldNotFindExposure", exposureClaimOrder != null ? exposureClaimOrder : exposureId, claimNumber))
    }
    
    // 'action' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 33, column 59
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ExposureDetailForward.createDestination(claim, exposure)
    }
    
    // 'condition' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 28, column 34
    function condition_4 () : java.lang.Boolean {
      return claim == null
    }
    
    // 'condition' attribute on ForwardCondition at ClaimExposureEntryPointForward.pcf: line 31, column 37
    function condition_7 () : java.lang.Boolean {
      return exposure == null
    }
    
    // 'initialValue' attribute on Variable at ClaimExposureEntryPointForward.pcf: line 21, column 28
    function initialValue_0 () : entity.Claim {
      return gw.api.database.Query.make(entity.Claim).compare("ClaimNumber", Equals, claimNumber).select().FirstResult
    }
    
    // 'initialValue' attribute on Variable at ClaimExposureEntryPointForward.pcf: line 25, column 24
    function initialValue_1 () : Exposure {
      return claim != null ? claim.Exposures.firstWhere(\ e -> (e.ClaimOrder as String == exposureClaimOrder or e.ID.Value as String == exposureId)) : null
    }
    
    override property get CurrentLocation () : pcf.ClaimExposureEntryPointForward {
      return super.CurrentLocation as pcf.ClaimExposureEntryPointForward
    }
    
    property get claim () : entity.Claim {
      return getVariableValue("claim", 0) as entity.Claim
    }
    
    property set claim ($arg :  entity.Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get claimNumber () : String {
      return getVariableValue("claimNumber", 0) as String
    }
    
    property set claimNumber ($arg :  String) {
      setVariableValue("claimNumber", 0, $arg)
    }
    
    property get exposure () : Exposure {
      return getVariableValue("exposure", 0) as Exposure
    }
    
    property set exposure ($arg :  Exposure) {
      setVariableValue("exposure", 0, $arg)
    }
    
    property get exposureClaimOrder () : String {
      return getVariableValue("exposureClaimOrder", 0) as String
    }
    
    property set exposureClaimOrder ($arg :  String) {
      setVariableValue("exposureClaimOrder", 0, $arg)
    }
    
    property get exposureId () : String {
      return getVariableValue("exposureId", 0) as String
    }
    
    property set exposureId ($arg :  String) {
      setVariableValue("exposureId", 0, $arg)
    }
    
    
  }
  
  
}