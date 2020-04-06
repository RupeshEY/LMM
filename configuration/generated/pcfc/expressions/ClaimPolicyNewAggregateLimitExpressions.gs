package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyNewAggregateLimitExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyNewAggregateLimitExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    function afterCancel_4 () : void {
      ClaimPolicyAggregateLimits.go(Claim)
    }
    
    // 'afterCancel' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    function afterCancel_dest_5 () : pcf.api.Destination {
      return pcf.ClaimPolicyAggregateLimits.createDestination(Claim)
    }
    
    // 'afterCommit' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    function afterCommit_6 (TopLocation :  pcf.api.Location) : void {
      ClaimPolicyAggregateLimits.go(Claim)
    }
    
    // 'beforeCommit' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    function beforeCommit_7 (pickedValue :  java.lang.Object) : void {
      PageHelper.beforeCommit(AggregateLimit)
    }
    
    // 'canEdit' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    function canEdit_8 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    // 'canVisit' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    static function canVisit_9 (Claim :  Claim) : java.lang.Boolean {
      return perm.Policy.view(Claim)
    }
    
    // 'def' attribute on ScreenRef at ClaimPolicyNewAggregateLimit.pcf: line 30, column 87
    function def_onEnter_2 (def :  pcf.ClaimPolicyAggregateLimitDetailScreen) : void {
      def.onEnter(Claim, AggregateLimit, PageHelper)
    }
    
    // 'def' attribute on ScreenRef at ClaimPolicyNewAggregateLimit.pcf: line 30, column 87
    function def_refreshVariables_3 (def :  pcf.ClaimPolicyAggregateLimitDetailScreen) : void {
      def.refreshVariables(Claim, AggregateLimit, PageHelper)
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyNewAggregateLimit.pcf: line 21, column 49
    function initialValue_0 () : gw.api.admin.AggregateLimitHelper {
      return new gw.api.admin.AggregateLimitHelper()
    }
    
    // 'initialValue' attribute on Variable at ClaimPolicyNewAggregateLimit.pcf: line 28, column 30
    function initialValue_1 () : AggregateLimit {
      return PageHelper.makeNewAggregateLimit(Claim, CurrentLocation)
    }
    
    // 'parent' attribute on Page (id=ClaimPolicyNewAggregateLimit) at ClaimPolicyNewAggregateLimit.pcf: line 15, column 85
    static function parent_10 (Claim :  Claim) : pcf.api.Destination {
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
    
    override property get CurrentLocation () : pcf.ClaimPolicyNewAggregateLimit {
      return super.CurrentLocation as pcf.ClaimPolicyNewAggregateLimit
    }
    
    property get PageHelper () : gw.api.admin.AggregateLimitHelper {
      return getVariableValue("PageHelper", 0) as gw.api.admin.AggregateLimitHelper
    }
    
    property set PageHelper ($arg :  gw.api.admin.AggregateLimitHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    
  }
  
  
}