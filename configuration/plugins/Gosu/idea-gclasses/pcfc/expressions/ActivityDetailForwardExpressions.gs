package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityDetailForwardExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ActivityDetailForward.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailForwardExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Activity :  Activity) : int {
      return 0
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 19, column 85
    function action_0 () : void {
      ApprovalDetailWorksheet.goInWorkspace(Claim, Activity)
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 22, column 82
    function action_3 () : void {
      BulkInvoiceApprovalDetailWorksheet.goInWorkspace(Activity)
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 24, column 72
    function action_6 () : void {
      ActivityDetailWorksheet.goInWorkspace(Claim, Activity)
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 19, column 85
    function action_dest_1 () : pcf.api.Destination {
      return pcf.ApprovalDetailWorksheet.createDestination(Claim, Activity)
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 22, column 82
    function action_dest_4 () : pcf.api.Destination {
      return pcf.BulkInvoiceApprovalDetailWorksheet.createDestination(Activity)
    }
    
    // 'action' attribute on ForwardCondition at ActivityDetailForward.pcf: line 24, column 72
    function action_dest_7 () : pcf.api.Destination {
      return pcf.ActivityDetailWorksheet.createDestination(Claim, Activity)
    }
    
    // 'canVisit' attribute on Forward (id=ActivityDetailForward) at ActivityDetailForward.pcf: line 8, column 83
    static function canVisit_8 (Activity :  Activity, Claim :  Claim) : java.lang.Boolean {
      return perm.Activity.view(Activity)
    }
    
    // 'condition' attribute on ForwardCondition at ActivityDetailForward.pcf: line 19, column 85
    function condition_2 () : java.lang.Boolean {
      return Activity.Type == TC_APPROVAL and Activity.TransactionSet != null
    }
    
    // 'condition' attribute on ForwardCondition at ActivityDetailForward.pcf: line 22, column 82
    function condition_5 () : java.lang.Boolean {
      return Activity.Type == TC_APPROVAL and Activity.BulkInvoice != null
    }
    
    // 'onBeforeForward' attribute on Forward (id=ActivityDetailForward) at ActivityDetailForward.pcf: line 8, column 83
    function onBeforeForward_9 () : void {
      gw.api.activity.ActivityUtil.markActivityAsViewed(Activity)
    }
    
    property get Activity () : Activity {
      return getVariableValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setVariableValue("Activity", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ActivityDetailForward {
      return super.CurrentLocation as pcf.ActivityDetailForward
    }
    
    
  }
  
  
}