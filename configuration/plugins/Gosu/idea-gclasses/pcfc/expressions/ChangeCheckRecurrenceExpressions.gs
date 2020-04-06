package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ChangeCheckRecurrenceExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/ChangeCheckRecurrence.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ChangeCheckRecurrenceExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim, Check :  Check) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=ChangeCheckRecurrence_SaveButton) at ChangeCheckRecurrence.pcf: line 30, column 60
    function action_0 () : void {
      CurrentLocation.commit()
    }
    
    // 'action' attribute on ToolbarButton (id=ChangeCheckRecurrence_ResetButton) at ChangeCheckRecurrence.pcf: line 34, column 61
    function action_1 () : void {
      CurrentLocation.cancel(); ChangeCheckRecurrence.go(Claim, Check)
    }
    
    // 'afterCancel' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    function afterCancel_5 () : void {
      ClaimFinancialsChecksDetail.go(Claim, Check)
    }
    
    // 'afterCancel' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    function afterCancel_dest_6 () : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Check)
    }
    
    // 'afterCommit' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    function afterCommit_7 (TopLocation :  pcf.api.Location) : void {
      ClaimFinancialsChecks.go(Claim);
    }
    
    // 'beforeCommit' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    function beforeCommit_8 (pickedValue :  java.lang.Object) : void {
      prepareToCommit()
    }
    
    // 'canVisit' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    static function canVisit_9 (Check :  Check, Claim :  Claim) : java.lang.Boolean {
      return perm.Payment.edit(Check)
    }
    
    // 'def' attribute on PanelRef at ChangeCheckRecurrence.pcf: line 41, column 41
    function def_onEnter_3 (def :  pcf.CheckRecurrenceDV) : void {
      def.onEnter(Check)
    }
    
    // 'def' attribute on PanelRef at ChangeCheckRecurrence.pcf: line 41, column 41
    function def_refreshVariables_4 (def :  pcf.CheckRecurrenceDV) : void {
      def.refreshVariables(Check)
    }
    
    // EditButtons at ChangeCheckRecurrence.pcf: line 38, column 34
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=ChangeCheckRecurrence) at ChangeCheckRecurrence.pcf: line 15, column 76
    static function parent_10 (Check :  Check, Claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimFinancialsChecksDetail.createDestination(Claim, Check)
    }
    
    property get Check () : Check {
      return getVariableValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setVariableValue("Check", 0, $arg)
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ChangeCheckRecurrence {
      return super.CurrentLocation as pcf.ChangeCheckRecurrence
    }
    
    function prepareToCommit() {
       Check.CheckSet.RequestingUser = User.util.CurrentUser        
       gw.api.financials.CheckUtil.saveRecurringCheckSet(Check.CheckSet);
    }
    
    
  }
  
  
}