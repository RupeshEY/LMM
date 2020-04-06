package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterComponentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 30, column 47
    function sortValue_0 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.Type.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 36, column 53
    function sortValue_1 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.Name ?: component.Code
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 95, column 45
    function sortValue_10 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.TransferTarget
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 101, column 44
    function sortValue_11 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.RetryFailover
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 40, column 62
    function sortValue_2 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.State.getDisplayName(component)
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 46, column 45
    function sortValue_3 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.StartRequested
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 52, column 38
    function sortValue_4 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.Started
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 56, column 39
    function sortValue_5 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.ServerId
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 62, column 46
    function sortValue_6 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.LeaseExpiration
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 68, column 38
    function sortValue_7 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.Stopped
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 85, column 49
    function sortValue_8 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.TerminateRequested
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 91, column 48
    function sortValue_9 (component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return component.TransferRequested
    }
    
    // 'value' attribute on RowIterator (id=Iterator) at ClusterComponentsLV.pcf: line 25, column 77
    function value_52 () : java.util.List<gw.api.system.cluster.ComponentInfo> {
      return components
    }
    
    property get components () : List<gw.api.system.cluster.ComponentInfo> {
      return getRequireValue("components", 0) as List<gw.api.system.cluster.ComponentInfo>
    }
    
    property set components ($arg :  List<gw.api.system.cluster.ComponentInfo>) {
      setRequireValue("components", 0, $arg)
    }
    
    property get data () : gw.api.tools.ClusterComponentsData {
      return getRequireValue("data", 0) as gw.api.tools.ClusterComponentsData
    }
    
    property set data ($arg :  gw.api.tools.ClusterComponentsData) {
      setRequireValue("data", 0, $arg)
    }
    
    property get navigateToHistoryAvailable () : boolean {
      return getRequireValue("navigateToHistoryAvailable", 0) as java.lang.Boolean
    }
    
    property set navigateToHistoryAvailable ($arg :  boolean) {
      setRequireValue("navigateToHistoryAvailable", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterComponentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClusterComponentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at ClusterComponentsLV.pcf: line 36, column 53
    function action_18 () : void {
      ClusterComponentHistoryPopup.push(data, component)
    }
    
    // 'action' attribute on Link (id=CompleteFailedFailover) at ClusterComponentsLV.pcf: line 78, column 112
    function action_39 () : void {
      data.completeFailedFailover(component)
    }
    
    // 'action' attribute on TextCell (id=Name) at ClusterComponentsLV.pcf: line 36, column 53
    function action_dest_19 () : pcf.api.Destination {
      return pcf.ClusterComponentHistoryPopup.createDestination(data, component)
    }
    
    // 'available' attribute on TextCell (id=Name) at ClusterComponentsLV.pcf: line 36, column 53
    function available_15 () : java.lang.Boolean {
      return navigateToHistoryAvailable
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterComponentsLV.pcf: line 30, column 47
    function valueRoot_14 () : java.lang.Object {
      return component.Type
    }
    
    // 'value' attribute on DateCell (id=StartRequested) at ClusterComponentsLV.pcf: line 46, column 45
    function valueRoot_25 () : java.lang.Object {
      return component
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterComponentsLV.pcf: line 30, column 47
    function value_12 () : java.lang.String {
      return component.Type.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Name) at ClusterComponentsLV.pcf: line 36, column 53
    function value_16 () : java.lang.String {
      return component.Name ?: component.Code
    }
    
    // 'value' attribute on TextCell (id=State) at ClusterComponentsLV.pcf: line 40, column 62
    function value_21 () : java.lang.String {
      return component.State.getDisplayName(component)
    }
    
    // 'value' attribute on DateCell (id=StartRequested) at ClusterComponentsLV.pcf: line 46, column 45
    function value_23 () : java.util.Date {
      return component.StartRequested
    }
    
    // 'value' attribute on DateCell (id=Started) at ClusterComponentsLV.pcf: line 52, column 38
    function value_26 () : java.util.Date {
      return component.Started
    }
    
    // 'value' attribute on TextCell (id=ServerId) at ClusterComponentsLV.pcf: line 56, column 39
    function value_29 () : java.lang.String {
      return component.ServerId
    }
    
    // 'value' attribute on DateCell (id=LeaseExpiration) at ClusterComponentsLV.pcf: line 62, column 46
    function value_32 () : java.util.Date {
      return component.LeaseExpiration
    }
    
    // 'value' attribute on DateCell (id=Stopped) at ClusterComponentsLV.pcf: line 68, column 38
    function value_35 () : java.util.Date {
      return component.Stopped
    }
    
    // 'value' attribute on DateCell (id=TerminateRequested) at ClusterComponentsLV.pcf: line 85, column 49
    function value_40 () : java.util.Date {
      return component.TerminateRequested
    }
    
    // 'value' attribute on DateCell (id=TransferRequested) at ClusterComponentsLV.pcf: line 91, column 48
    function value_43 () : java.util.Date {
      return component.TransferRequested
    }
    
    // 'value' attribute on TextCell (id=TransferTarget) at ClusterComponentsLV.pcf: line 95, column 45
    function value_46 () : java.lang.String {
      return component.TransferTarget
    }
    
    // 'value' attribute on DateCell (id=RetryFailover) at ClusterComponentsLV.pcf: line 101, column 44
    function value_49 () : java.util.Date {
      return component.RetryFailover
    }
    
    // 'visible' attribute on Link (id=CompleteFailedFailover) at ClusterComponentsLV.pcf: line 78, column 112
    function visible_38 () : java.lang.Boolean {
      return component.State == REQUIRES_MANUAL_INTERVENTION || component.State == RESTART_POSTPONED
    }
    
    property get component () : gw.api.system.cluster.ComponentInfo {
      return getIteratedValue(1) as gw.api.system.cluster.ComponentInfo
    }
    
    
  }
  
  
}