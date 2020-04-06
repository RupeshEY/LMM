package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClusterMembersExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMembersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    static function __constructorIndex (Result :  String) : int {
      return 1
    }
    
    // 'action' attribute on ButtonInput (id=ClusterReconnect) at ClusterMembers.pcf: line 87, column 95
    function action_23 () : void {
      Result = gw.api.tools.InternalToolsUtil.reconnectToCluster()
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadReport) at ClusterMembers.pcf: line 41, column 64
    function action_3 () : void {
      ClusterMembersDownloadConfigurePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=ShowUnusedRoles) at ClusterMembers.pcf: line 46, column 50
    function action_6 () : void {
      UnusedServerRolesPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=DownloadReport) at ClusterMembers.pcf: line 41, column 64
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ClusterMembersDownloadConfigurePopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=ShowUnusedRoles) at ClusterMembers.pcf: line 46, column 50
    function action_dest_7 () : pcf.api.Destination {
      return pcf.UnusedServerRolesPopup.createDestination()
    }
    
    // 'available' attribute on ButtonInput (id=ClusterReconnect) at ClusterMembers.pcf: line 87, column 95
    function available_21 () : java.lang.Boolean {
      return perm.User.EditCluster or perm.User.DevAllAccess
    }
    
    // 'canVisit' attribute on Page (id=ClusterMembers) at ClusterMembers.pcf: line 13, column 74
    static function canVisit_122 (Result :  String) : java.lang.Boolean {
      return perm.User.ViewCluster or perm.User.DevAllAccess
    }
    
    // 'initialValue' attribute on Variable at ClusterMembers.pcf: line 24, column 47
    function initialValue_0 () : gw.api.tools.ClusterMembersData {
      return new gw.api.tools.ClusterMembersData()
    }
    
    // 'initialValue' attribute on Variable at ClusterMembers.pcf: line 29, column 30
    function initialValue_1 () : java.util.Date {
      return gw.api.util.DateUtil.currentDate()
    }
    
    // 'initialValue' attribute on Variable at ClusterMembers.pcf: line 34, column 43
    function initialValue_2 () : java.util.Set<String> {
      return ClusterMembersData.UnusedServerRoles
    }
    
    // 'label' attribute on ToolbarButton (id=ShowUnusedRoles) at ClusterMembers.pcf: line 46, column 50
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Web.InternalTools.ClusterMembers.UnusedServerRoles", UnusedServerRoles.size())
    }
    
    // 'parent' attribute on Page (id=ClusterMembers) at ClusterMembers.pcf: line 13, column 74
    static function parent_123 (Result :  String) : pcf.api.Destination {
      return pcf.ClusterPages.createDestination()
    }
    
    // 'value' attribute on TextInput (id=Host) at ClusterMembers.pcf: line 57, column 52
    function valueRoot_11 () : java.lang.Object {
      return ClusterMembersData
    }
    
    // 'value' attribute on TextInput (id=ServerId) at ClusterMembers.pcf: line 61, column 52
    function value_12 () : java.lang.String {
      return ClusterMembersData.ServerId
    }
    
    // 'value' attribute on TextInput (id=Uuid) at ClusterMembers.pcf: line 65, column 48
    function value_15 () : java.lang.String {
      return ClusterMembersData.Uuid
    }
    
    // 'value' attribute on TextInput (id=ServerRoles) at ClusterMembers.pcf: line 69, column 63
    function value_18 () : java.lang.String {
      return ClusterMembersData.ServerRolesAsString
    }
    
    // 'value' attribute on TextInput (id=Host) at ClusterMembers.pcf: line 57, column 52
    function value_9 () : java.lang.String {
      return ClusterMembersData.HostName
    }
    
    // 'visible' attribute on ToolbarButton (id=ShowUnusedRoles) at ClusterMembers.pcf: line 46, column 50
    function visible_5 () : java.lang.Boolean {
      return not UnusedServerRoles.Empty
    }
    
    property get ClusterMembersData () : gw.api.tools.ClusterMembersData {
      return getVariableValue("ClusterMembersData", 0) as gw.api.tools.ClusterMembersData
    }
    
    property set ClusterMembersData ($arg :  gw.api.tools.ClusterMembersData) {
      setVariableValue("ClusterMembersData", 0, $arg)
    }
    
    property get CurrentDbTime () : java.util.Date {
      return getVariableValue("CurrentDbTime", 0) as java.util.Date
    }
    
    property set CurrentDbTime ($arg :  java.util.Date) {
      setVariableValue("CurrentDbTime", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClusterMembers {
      return super.CurrentLocation as pcf.ClusterMembers
    }
    
    property get Result () : String {
      return getVariableValue("Result", 0) as String
    }
    
    property set Result ($arg :  String) {
      setVariableValue("Result", 0, $arg)
    }
    
    property get UnusedServerRoles () : java.util.Set<String> {
      return getVariableValue("UnusedServerRoles", 0) as java.util.Set<String>
    }
    
    property set UnusedServerRoles ($arg :  java.util.Set<String>) {
      setVariableValue("UnusedServerRoles", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterMembers.pcf: line 220, column 59
    function valueRoot_88 () : java.lang.Object {
      return Component.Type
    }
    
    // 'value' attribute on DateCell (id=StartTime) at ClusterMembers.pcf: line 230, column 50
    function valueRoot_93 () : java.lang.Object {
      return Component
    }
    
    // 'value' attribute on TextCell (id=Type) at ClusterMembers.pcf: line 220, column 59
    function value_86 () : java.lang.String {
      return Component.Type.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Name) at ClusterMembers.pcf: line 224, column 65
    function value_89 () : java.lang.String {
      return Component.Name ?: Component.Code
    }
    
    // 'value' attribute on DateCell (id=StartTime) at ClusterMembers.pcf: line 230, column 50
    function value_91 () : java.util.Date {
      return Component.Started
    }
    
    // 'value' attribute on TextCell (id=FailoverState) at ClusterMembers.pcf: line 234, column 74
    function value_94 () : java.lang.String {
      return Component.State.getDisplayName(Component)
    }
    
    // 'value' attribute on DateCell (id=RetryFailover) at ClusterMembers.pcf: line 240, column 56
    function value_96 () : java.util.Date {
      return Component.RetryFailover
    }
    
    property get Component () : gw.api.system.cluster.ComponentInfo {
      return getIteratedValue(2) as gw.api.system.cluster.ComponentInfo
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Host) at ClusterMembers.pcf: line 265, column 48
    function valueRoot_103 () : java.lang.Object {
      return Run
    }
    
    // 'value' attribute on TextCell (id=Host) at ClusterMembers.pcf: line 265, column 48
    function value_101 () : java.lang.String {
      return Run.LogicalName
    }
    
    // 'value' attribute on TextCell (id=Uuid) at ClusterMembers.pcf: line 270, column 41
    function value_104 () : java.lang.String {
      return Run.Uuid
    }
    
    // 'value' attribute on TextCell (id=Env) at ClusterMembers.pcf: line 275, column 40
    function value_107 () : java.lang.String {
      return Run.Env
    }
    
    // 'value' attribute on TextCell (id=RunLevel) at ClusterMembers.pcf: line 280, column 45
    function value_110 () : java.lang.String {
      return Run.RunLevel
    }
    
    // 'value' attribute on TextCell (id=ServerRoles) at ClusterMembers.pcf: line 286, column 36
    function value_113 () : java.lang.String {
      return ClusterMembersData.serverRolesToString(Run.ServerRoles)
    }
    
    // 'value' attribute on DateCell (id=ServerStarted) at ClusterMembers.pcf: line 294, column 50
    function value_115 () : java.util.Date {
      return Run.ServerStarted
    }
    
    // 'value' attribute on DateCell (id=LastUpdate) at ClusterMembers.pcf: line 301, column 54
    function value_118 () : java.util.Date {
      return Run.ConnectionStopped
    }
    
    property get Run () : entity.ClusterMemberData {
      return getIteratedValue(2) as entity.ClusterMemberData
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionAvailable' attribute on TextCell (id=UserSessions) at ClusterMembers.pcf: line 125, column 50
    function actionAvailable_47 () : java.lang.Boolean {
      return Server.InCluster
    }
    
    // 'actionAvailable' attribute on TextCell (id=PlannedShutdown) at ClusterMembers.pcf: line 163, column 32
    function actionAvailable_64 () : java.lang.Boolean {
      return Server.InCluster and Server.Member.PlannedShutdownInitiated != null
    }
    
    // 'action' attribute on TextCell (id=UserSessions) at ClusterMembers.pcf: line 125, column 50
    function action_45 () : void {
      ClusterMemberUserSessionsPopup.push(Server.ServerId)
    }
    
    // 'action' attribute on TextCell (id=PlannedShutdown) at ClusterMembers.pcf: line 163, column 32
    function action_62 () : void {
      PlannedShutdownStatusPopup.push(Server.ServerId)
    }
    
    // 'action' attribute on Link (id=NodeFailed) at ClusterMembers.pcf: line 174, column 76
    function action_69 () : void {
      ClusterMembersData.nodeFailed(Server.ServerId)
    }
    
    // 'action' attribute on Link (id=StartPlannedShutdown) at ClusterMembers.pcf: line 181, column 100
    function action_73 () : void {
      PlannedShutdownPopup.push(Server.ServerId)
    }
    
    // 'action' attribute on Link (id=StopPlannedShutdown) at ClusterMembers.pcf: line 189, column 100
    function action_77 () : void {
      ClusterMembersData.cancelPlannedShutdown(Server.ServerId)
    }
    
    // 'action' attribute on TextCell (id=UserSessions) at ClusterMembers.pcf: line 125, column 50
    function action_dest_46 () : pcf.api.Destination {
      return pcf.ClusterMemberUserSessionsPopup.createDestination(Server.ServerId)
    }
    
    // 'action' attribute on TextCell (id=PlannedShutdown) at ClusterMembers.pcf: line 163, column 32
    function action_dest_63 () : pcf.api.Destination {
      return pcf.PlannedShutdownStatusPopup.createDestination(Server.ServerId)
    }
    
    // 'action' attribute on Link (id=StartPlannedShutdown) at ClusterMembers.pcf: line 181, column 100
    function action_dest_74 () : pcf.api.Destination {
      return pcf.PlannedShutdownPopup.createDestination(Server.ServerId)
    }
    
    // 'available' attribute on Link (id=NodeFailed) at ClusterMembers.pcf: line 174, column 76
    function available_67 () : java.lang.Boolean {
      return not Server.InCluster and not Server.Stopped and (perm.User.EditCluster or perm.User.DevAllAccess)
    }
    
    // 'available' attribute on Link (id=StartPlannedShutdown) at ClusterMembers.pcf: line 181, column 100
    function available_71 () : java.lang.Boolean {
      return Server.InCluster and Server.Member.PlannedShutdownInitiated == null and (perm.User.EditCluster or perm.User.DevAllAccess)
    }
    
    // 'available' attribute on Link (id=StopPlannedShutdown) at ClusterMembers.pcf: line 189, column 100
    function available_75 () : java.lang.Boolean {
      return Server.InCluster and Server.Member.PlannedShutdownInitiated != null and (perm.User.EditCluster or perm.User.DevAllAccess)
    }
    
    // 'confirmMessage' attribute on Link (id=NodeFailed) at ClusterMembers.pcf: line 174, column 76
    function confirmMessage_70 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.ClusterMembers.MembersLV.NodeFailed.Confirmation", Server.ServerId)
    }
    
    // 'confirmMessage' attribute on Link (id=StopPlannedShutdown) at ClusterMembers.pcf: line 189, column 100
    function confirmMessage_78 () : java.lang.String {
      return DisplayKey.get("Web.InternalTools.ClusterMembers.MembersLV.CancelPlannedShutdown.Confirmation", Server.ServerId)
    }
    
    // 'value' attribute on TextCell (id=ServerId) at ClusterMembers.pcf: line 110, column 44
    function valueRoot_37 () : java.lang.Object {
      return Server
    }
    
    // 'value' attribute on TextCell (id=ServerId) at ClusterMembers.pcf: line 110, column 44
    function value_35 () : java.lang.String {
      return Server.ServerId
    }
    
    // 'value' attribute on TextCell (id=Status) at ClusterMembers.pcf: line 114, column 51
    function value_38 () : java.lang.String {
      return Server.StatusLocalized
    }
    
    // 'value' attribute on TextCell (id=Host) at ClusterMembers.pcf: line 118, column 47
    function value_41 () : java.lang.String {
      return Server.LogicalName
    }
    
    // 'value' attribute on TextCell (id=UserSessions) at ClusterMembers.pcf: line 125, column 50
    function value_44 () : java.lang.Integer {
      return Server.InCluster ? Server.Member.UserSessions : null
    }
    
    // 'value' attribute on TextCell (id=RunLevel) at ClusterMembers.pcf: line 129, column 79
    function value_49 () : java.lang.String {
      return not Server.Stopped ? Server.Member.RunLevel : null
    }
    
    // 'value' attribute on TextCell (id=Build) at ClusterMembers.pcf: line 133, column 76
    function value_51 () : java.lang.String {
      return not Server.Stopped ? Server.Member.Build : null
    }
    
    // 'value' attribute on TextCell (id=ServerRoles) at ClusterMembers.pcf: line 138, column 32
    function value_53 () : java.lang.String {
      return not Server.Stopped ? Server.ServerRolesAsString : null
    }
    
    // 'value' attribute on DateCell (id=ServerStarted) at ClusterMembers.pcf: line 144, column 84
    function value_55 () : java.util.Date {
      return not Server.Stopped ? Server.Member.ServerStarted : null
    }
    
    // 'value' attribute on DateCell (id=ConnectionStarted) at ClusterMembers.pcf: line 150, column 88
    function value_57 () : java.util.Date {
      return not Server.Stopped ? Server.Member.ConnectionStarted : null
    }
    
    // 'value' attribute on DateCell (id=LastUpdate) at ClusterMembers.pcf: line 156, column 87
    function value_59 () : java.util.Date {
      return not Server.Stopped ? Server.Member.LastUpdateAsDate : null
    }
    
    // 'value' attribute on TextCell (id=PlannedShutdown) at ClusterMembers.pcf: line 163, column 32
    function value_61 () : java.lang.String {
      return Server.PlannedShutdownStatusLocalized
    }
    
    // 'visible' attribute on Link (id=NodeFailed) at ClusterMembers.pcf: line 174, column 76
    function visible_68 () : java.lang.Boolean {
      return not Server.InCluster and not Server.Stopped
    }
    
    // 'visible' attribute on Link (id=StartPlannedShutdown) at ClusterMembers.pcf: line 181, column 100
    function visible_72 () : java.lang.Boolean {
      return Server.InCluster and Server.Member.PlannedShutdownInitiated == null
    }
    
    property get Server () : gw.api.tools.ClusteredServer {
      return getIteratedValue(2) as gw.api.tools.ClusteredServer
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/cluster/ClusterMembers.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClusterMembersExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at ClusterMembers.pcf: line 214, column 98
    function filters_80 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.tools.ClusterComponentFilters.TypeFilters.toTypedArray()
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 294, column 50
    function sortValue_100 (Run :  entity.ClusterMemberData) : java.lang.Object {
      return Run.ServerStarted
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 110, column 44
    function sortValue_24 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return Server.ServerId
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 114, column 51
    function sortValue_25 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return Server.StatusLocalized
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 118, column 47
    function sortValue_26 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return Server.LogicalName
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 125, column 50
    function sortValue_27 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return Server.InCluster ? Server.Member.UserSessions : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 129, column 79
    function sortValue_28 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.Member.RunLevel : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 133, column 76
    function sortValue_29 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.Member.Build : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 138, column 32
    function sortValue_30 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.ServerRolesAsString : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 144, column 84
    function sortValue_31 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.Member.ServerStarted : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 150, column 88
    function sortValue_32 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.Member.ConnectionStarted : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 156, column 87
    function sortValue_33 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return not Server.Stopped ? Server.Member.LastUpdateAsDate : null
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 163, column 32
    function sortValue_34 (Server :  gw.api.tools.ClusteredServer) : java.lang.Object {
      return Server.PlannedShutdownStatusLocalized
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 220, column 59
    function sortValue_81 (Component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return Component.Type.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 224, column 65
    function sortValue_82 (Component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return Component.Name ?: Component.Code
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 230, column 50
    function sortValue_83 (Component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return Component.Started
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 234, column 74
    function sortValue_84 (Component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return Component.State.getDisplayName(Component)
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 240, column 56
    function sortValue_85 (Component :  gw.api.system.cluster.ComponentInfo) : java.lang.Object {
      return Component.RetryFailover
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 259, column 96
    function value_121 () : gw.api.database.IQueryBeanResult<entity.ClusterMemberData> {
      return ClusterMembersData.getHistoryQuery(SelectedServer.ServerId).Processor as gw.api.database.IQueryBeanResult<ClusterMemberData>
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 105, column 78
    function value_79 () : java.util.List<gw.api.tools.ClusteredServer> {
      return ClusterMembersData.AllServers
    }
    
    // 'value' attribute on RowIterator at ClusterMembers.pcf: line 209, column 89
    function value_99 () : java.util.List<gw.api.system.cluster.ComponentInfo> {
      return gw.api.system.cluster.ClusterStateProvider.instance().getActiveComponents(SelectedServer.ServerId)
    }
    
    property get SelectedServer () : gw.api.tools.ClusteredServer {
      return getCurrentSelection(1) as gw.api.tools.ClusteredServer
    }
    
    property set SelectedServer ($arg :  gw.api.tools.ClusteredServer) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}