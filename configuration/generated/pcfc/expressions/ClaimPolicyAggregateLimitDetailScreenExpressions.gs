package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimPolicyAggregateLimitDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimPolicyAggregateLimitDetailScreen_EditButton) at ClaimPolicyAggregateLimitDetailScreen.pcf: line 26, column 44
    function action_2 () : void {
      AggregateLimitHelper.initializeCoverageLineList(AggregateLimit, Claim.Policy); CurrentLocation.startEditing()
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyAggregateLimitDetailScreen.pcf: line 29, column 89
    function def_onEnter_3 (def :  pcf.AggregateLimitDetailDV) : void {
      def.onEnter(AggregateLimit, Claim.Policy, AggregateLimitHelper)
    }
    
    // 'def' attribute on PanelRef at ClaimPolicyAggregateLimitDetailScreen.pcf: line 29, column 89
    function def_refreshVariables_4 (def :  pcf.AggregateLimitDetailDV) : void {
      def.refreshVariables(AggregateLimit, Claim.Policy, AggregateLimitHelper)
    }
    
    // EditButtons at ClaimPolicyAggregateLimitDetailScreen.pcf: line 19, column 31
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimPolicyAggregateLimitDetailScreen_EditButton) at ClaimPolicyAggregateLimitDetailScreen.pcf: line 26, column 44
    function visible_1 () : java.lang.Boolean {
      return perm.Policy.edit(Claim)
    }
    
    property get AggregateLimit () : AggregateLimit {
      return getRequireValue("AggregateLimit", 0) as AggregateLimit
    }
    
    property set AggregateLimit ($arg :  AggregateLimit) {
      setRequireValue("AggregateLimit", 0, $arg)
    }
    
    property get AggregateLimitHelper () : gw.api.admin.AggregateLimitHelper {
      return getRequireValue("AggregateLimitHelper", 0) as gw.api.admin.AggregateLimitHelper
    }
    
    property set AggregateLimitHelper ($arg :  gw.api.admin.AggregateLimitHelper) {
      setRequireValue("AggregateLimitHelper", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  
}