package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSyncStatusPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ClaimSyncStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSyncStatusPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=ClaimSyncStatusPopup_ResyncButton) at ClaimSyncStatusPopup.pcf: line 39, column 48
    function allCheckedRowsAction_4 (CheckedValues :  gw.api.admin.DestinationMessageStatistics[], CheckedValuesErrors :  java.util.Map) : void {
      gw.api.claim.ClaimSyncUtil.resync(CurrentLocation, Claim, CheckedValues,CheckedValuesErrors)
    }
    
    // 'canVisit' attribute on Popup (id=ClaimSyncStatusPopup) at ClaimSyncStatusPopup.pcf: line 10, column 81
    static function canVisit_7 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.viewsyncstatus(Claim)
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimSyncStatusPopup_RetryButton) at ClaimSyncStatusPopup.pcf: line 31, column 47
    function checkedRowAction_2 (element :  gw.api.admin.DestinationMessageStatistics, CheckedValue :  gw.api.admin.DestinationMessageStatistics) : void {
      gw.api.claim.ClaimSyncUtil.retry(Claim, CheckedValue)
    }
    
    // 'def' attribute on PanelRef at ClaimSyncStatusPopup.pcf: line 42, column 70
    function def_onEnter_5 (def :  pcf.SyncStatusLV) : void {
      def.onEnter(DestinationMessageStatisticsList, Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimSyncStatusPopup.pcf: line 42, column 70
    function def_refreshVariables_6 (def :  pcf.SyncStatusLV) : void {
      def.refreshVariables(DestinationMessageStatisticsList, Claim)
    }
    
    // 'initialValue' attribute on Variable at ClaimSyncStatusPopup.pcf: line 20, column 59
    function initialValue_0 () : gw.api.admin.DestinationMessageStatistics[] {
      return gw.api.claim.ClaimSyncUtil.getStatistics(Claim)
    }
    
    // 'parent' attribute on Popup (id=ClaimSyncStatusPopup) at ClaimSyncStatusPopup.pcf: line 10, column 81
    static function parent_8 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'title' attribute on Popup (id=ClaimSyncStatusPopup) at ClaimSyncStatusPopup.pcf: line 10, column 81
    static function title_9 (Claim :  Claim) : java.lang.Object {
      return DisplayKey.get("JSP.SyncStatus.Title", Claim.ClaimNumber)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimSyncStatusPopup_RetryButton) at ClaimSyncStatusPopup.pcf: line 31, column 47
    function visible_1 () : java.lang.Boolean {
      return perm.System.retrymessage
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimSyncStatusPopup_ResyncButton) at ClaimSyncStatusPopup.pcf: line 39, column 48
    function visible_3 () : java.lang.Boolean {
      return perm.System.resyncmessage
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimSyncStatusPopup {
      return super.CurrentLocation as pcf.ClaimSyncStatusPopup
    }
    
    property get DestinationMessageStatisticsList () : gw.api.admin.DestinationMessageStatistics[] {
      return getVariableValue("DestinationMessageStatisticsList", 0) as gw.api.admin.DestinationMessageStatistics[]
    }
    
    property set DestinationMessageStatisticsList ($arg :  gw.api.admin.DestinationMessageStatistics[]) {
      setVariableValue("DestinationMessageStatisticsList", 0, $arg)
    }
    
    
  }
  
  
}