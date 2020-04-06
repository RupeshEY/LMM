package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PlannedShutdownStatusPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PlannedShutdownStatusPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=StopRequested) at PlannedShutdownStatusPopup.pcf: line 46, column 52
    function valueRoot_9 () : java.lang.Object {
      return component
    }
    
    // 'value' attribute on DateCell (id=Stopped) at PlannedShutdownStatusPopup.pcf: line 52, column 46
    function value_10 () : java.util.Date {
      return component.Stopped
    }
    
    // 'value' attribute on TextCell (id=Name) at PlannedShutdownStatusPopup.pcf: line 40, column 69
    function value_5 () : java.lang.String {
      return DisplayKey.get(component.NameDisplayKey)
    }
    
    // 'value' attribute on DateCell (id=StopRequested) at PlannedShutdownStatusPopup.pcf: line 46, column 52
    function value_7 () : java.util.Date {
      return component.StopRequested
    }
    
    property get component () : gw.api.system.cluster.ComponentPlannedShutdownStatus {
      return getIteratedValue(1) as gw.api.system.cluster.ComponentPlannedShutdownStatus
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/PlannedShutdownStatusPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PlannedShutdownStatusPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (serverId :  String) : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at PlannedShutdownStatusPopup.pcf: line 18, column 63
    function initialValue_0 () : gw.api.system.cluster.NodePlannedShutdownStatus {
      return new gw.api.tools.ClusterMembersData().getPlannedShutdownStatus(serverId)
    }
    
    // 'value' attribute on RowIterator at PlannedShutdownStatusPopup.pcf: line 40, column 69
    function sortValue_2 (component :  gw.api.system.cluster.ComponentPlannedShutdownStatus) : java.lang.Object {
      return DisplayKey.get(component.NameDisplayKey)
    }
    
    // 'value' attribute on RowIterator at PlannedShutdownStatusPopup.pcf: line 46, column 52
    function sortValue_3 (component :  gw.api.system.cluster.ComponentPlannedShutdownStatus) : java.lang.Object {
      return component.StopRequested
    }
    
    // 'value' attribute on RowIterator at PlannedShutdownStatusPopup.pcf: line 52, column 46
    function sortValue_4 (component :  gw.api.system.cluster.ComponentPlannedShutdownStatus) : java.lang.Object {
      return component.Stopped
    }
    
    // 'title' attribute on Popup (id=PlannedShutdownStatusPopup) at PlannedShutdownStatusPopup.pcf: line 8, column 102
    static function title_15 (serverId :  String) : java.lang.Object {
      return DisplayKey.get("Web.InternalTools.PlannedShutdownStatusPopup.Title", serverId)
    }
    
    // 'value' attribute on RowIterator at PlannedShutdownStatusPopup.pcf: line 35, column 102
    function value_13 () : java.util.List<gw.api.system.cluster.ComponentPlannedShutdownStatus> {
      return shutdownStatus.ComponentStatuses
    }
    
    // 'visible' attribute on Verbatim at PlannedShutdownStatusPopup.pcf: line 22, column 43
    function visible_1 () : java.lang.Boolean {
      return shutdownStatus == null
    }
    
    // 'visible' attribute on PanelRef at PlannedShutdownStatusPopup.pcf: line 25, column 44
    function visible_14 () : java.lang.Boolean {
      return shutdownStatus != null
    }
    
    override property get CurrentLocation () : pcf.PlannedShutdownStatusPopup {
      return super.CurrentLocation as pcf.PlannedShutdownStatusPopup
    }
    
    property get serverId () : String {
      return getVariableValue("serverId", 0) as String
    }
    
    property set serverId ($arg :  String) {
      setVariableValue("serverId", 0, $arg)
    }
    
    property get shutdownStatus () : gw.api.system.cluster.NodePlannedShutdownStatus {
      return getVariableValue("shutdownStatus", 0) as gw.api.system.cluster.NodePlannedShutdownStatus
    }
    
    property set shutdownStatus ($arg :  gw.api.system.cluster.NodePlannedShutdownStatus) {
      setVariableValue("shutdownStatus", 0, $arg)
    }
    
    
  }
  
  
}