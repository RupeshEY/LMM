package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SyncStatusLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SyncStatusLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ClaimSyncIcon_red) at SyncStatusLV.pcf: line 52, column 72
    function action_11 () : void {
      
    }
    
    // 'action' attribute on Link (id=ClaimSyncIcon_green) at SyncStatusLV.pcf: line 40, column 70
    function action_7 () : void {
      
    }
    
    // 'action' attribute on Link (id=ClaimSyncIcon_yellow) at SyncStatusLV.pcf: line 46, column 120
    function action_9 () : void {
      
    }
    
    // 'value' attribute on TextCell (id=Destination) at SyncStatusLV.pcf: line 30, column 65
    function valueRoot_5 () : java.lang.Object {
      return DestinationMessageStatistics
    }
    
    // 'value' attribute on TextCell (id=Unsent) at SyncStatusLV.pcf: line 58, column 42
    function value_12 () : java.lang.Integer {
      return DestinationMessageStatistics.TotalUnsent
    }
    
    // 'value' attribute on TextCell (id=Error) at SyncStatusLV.pcf: line 62, column 97
    function value_15 () : java.lang.String {
      return gw.api.claim.ClaimSyncUtil.getErrorDescription(DestinationMessageStatistics)
    }
    
    // 'value' attribute on TextCell (id=Destination) at SyncStatusLV.pcf: line 30, column 65
    function value_3 () : java.lang.String {
      return DestinationMessageStatistics.DestinationName
    }
    
    // 'visible' attribute on Link (id=ClaimSyncIcon_red) at SyncStatusLV.pcf: line 52, column 72
    function visible_10 () : java.lang.Boolean {
      return DestinationMessageStatistics.TotalFailed > 0
    }
    
    // 'visible' attribute on Link (id=ClaimSyncIcon_green) at SyncStatusLV.pcf: line 40, column 70
    function visible_6 () : java.lang.Boolean {
      return DestinationMessageStatistics.TotalUnsent == 0
    }
    
    // 'visible' attribute on Link (id=ClaimSyncIcon_yellow) at SyncStatusLV.pcf: line 46, column 120
    function visible_8 () : java.lang.Boolean {
      return DestinationMessageStatistics.TotalUnsent != 0 and DestinationMessageStatistics.TotalFailed == 0
    }
    
    property get DestinationMessageStatistics () : gw.api.admin.DestinationMessageStatistics {
      return getIteratedValue(1) as gw.api.admin.DestinationMessageStatistics
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/SyncStatusLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SyncStatusLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at SyncStatusLV.pcf: line 30, column 65
    function sortValue_0 (DestinationMessageStatistics :  gw.api.admin.DestinationMessageStatistics) : java.lang.Object {
      return DestinationMessageStatistics.DestinationName
    }
    
    // 'value' attribute on RowIterator at SyncStatusLV.pcf: line 58, column 42
    function sortValue_1 (DestinationMessageStatistics :  gw.api.admin.DestinationMessageStatistics) : java.lang.Object {
      return DestinationMessageStatistics.TotalUnsent
    }
    
    // 'value' attribute on RowIterator at SyncStatusLV.pcf: line 62, column 97
    function sortValue_2 (DestinationMessageStatistics :  gw.api.admin.DestinationMessageStatistics) : java.lang.Object {
      return gw.api.claim.ClaimSyncUtil.getErrorDescription(DestinationMessageStatistics)
    }
    
    // 'value' attribute on RowIterator at SyncStatusLV.pcf: line 23, column 63
    function value_17 () : gw.api.admin.DestinationMessageStatistics[] {
      return DestinationMessageStatisticsList
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get DestinationMessageStatisticsList () : gw.api.admin.DestinationMessageStatistics[] {
      return getRequireValue("DestinationMessageStatisticsList", 0) as gw.api.admin.DestinationMessageStatistics[]
    }
    
    property set DestinationMessageStatisticsList ($arg :  gw.api.admin.DestinationMessageStatistics[]) {
      setRequireValue("DestinationMessageStatisticsList", 0, $arg)
    }
    
    
  }
  
  
}