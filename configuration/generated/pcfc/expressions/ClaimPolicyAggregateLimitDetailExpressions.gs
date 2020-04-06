package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyAggregateLimitDetailExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, AggregateLimit :  AggregateLimit) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    function afterCancel_3 () : void {
      PageHelper.afterCancel()
    }
    
    // 'afterCommit' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      PageHelper.afterCommit()
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    function beforeCommit_5 (pickedValue :  java.lang.Object) : void {
      PageHelper.beforeCommit(AggregateLimit)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    function canEdit_6 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    static function canVisit_7 (AggregateLimit :  AggregateLimit, Claim :  Claim) : java.lang.Boolean {
      return perm.Policy.view(Claim)
    }
    
    // 'def' attribute on ScreenRef at ClaimPolicyAggregateLimitDetail.pcf: line 28, column 87
    function def_onEnter_1 (def :  pcf.ClaimPolicyAggregateLimitDetailScreen) : void {
      def.onEnter(Claim, AggregateLimit, PageHelper)
    }
    
    // 'def' attribute on ScreenRef at ClaimPolicyAggregateLimitDetail.pcf: line 28, column 87
    function def_refreshVariables_2 (def :  pcf.ClaimPolicyAggregateLimitDetailScreen) : void {
      def.refreshVariables(Claim, AggregateLimit, PageHelper)
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyAggregateLimitDetail.pcf: line 20, column 49
    function initialValue_0 () : gw.api.admin.AggregateLimitHelper {
      return new gw.api.admin.AggregateLimitHelper()
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyAggregateLimitDetail) at ClaimPolicyAggregateLimitDetail.pcf: line 14, column 85
    static function parent_8 (AggregateLimit :  AggregateLimit, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    property get AggregateLimit () : AggregateLimit {
      return getVariableValue("AggregateLimit", 0) as AggregateLimit
    }
    
    property set AggregateLimit ($arg :  AggregateLimit) {
      setVariableValue("AggregateLimit", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimPolicyAggregateLimitDetail {
      return super.CurrentLocation as pcf.ClaimPolicyAggregateLimitDetail
    }
    
    property get PageHelper () : gw.api.admin.AggregateLimitHelper {
      return getVariableValue("PageHelper", 0) as gw.api.admin.AggregateLimitHelper
    }
    
    property set PageHelper ($arg :  gw.api.admin.AggregateLimitHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}