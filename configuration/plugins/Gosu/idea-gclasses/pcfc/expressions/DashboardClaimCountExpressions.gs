package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardClaimCount.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardClaimCountExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardClaimCount.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimCountExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : int {
      return 0
    }
    
    // 'available' attribute on PrintToolbarButton (id=PrintButton) at DashboardClaimCount.pcf: line 28, column 61
    function available_2 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DashboardClaimCount) at DashboardClaimCount.pcf: line 8, column 123
    static function canVisit_25 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewedbclaimcounts
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 43, column 101
    function def_onEnter_12 (def :  pcf.ClaimCountByLOBLV_NoFinancials) : void {
      def.onEnter(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 43, column 101
    function def_onEnter_14 (def :  pcf.ClaimCountByLOBLV_default) : void {
      def.onEnter(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 49, column 101
    function def_onEnter_18 (def :  pcf.ClaimCountByLossTypeLV_NoFinancials) : void {
      def.onEnter(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 49, column 101
    function def_onEnter_20 (def :  pcf.ClaimCountByLossTypeLV_default) : void {
      def.onEnter(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 39, column 28
    function def_onEnter_6 (def :  pcf.ClaimCountByOrgLevelLV_NoFinancials) : void {
      def.onEnter(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 39, column 28
    function def_onEnter_8 (def :  pcf.ClaimCountByOrgLevelLV_default) : void {
      def.onEnter(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 43, column 101
    function def_refreshVariables_13 (def :  pcf.ClaimCountByLOBLV_NoFinancials) : void {
      def.refreshVariables(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 43, column 101
    function def_refreshVariables_15 (def :  pcf.ClaimCountByLOBLV_default) : void {
      def.refreshVariables(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 49, column 101
    function def_refreshVariables_19 (def :  pcf.ClaimCountByLossTypeLV_NoFinancials) : void {
      def.refreshVariables(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 49, column 101
    function def_refreshVariables_21 (def :  pcf.ClaimCountByLossTypeLV_default) : void {
      def.refreshVariables(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 39, column 28
    function def_refreshVariables_7 (def :  pcf.ClaimCountByOrgLevelLV_NoFinancials) : void {
      def.refreshVariables(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardClaimCount.pcf: line 39, column 28
    function def_refreshVariables_9 (def :  pcf.ClaimCountByOrgLevelLV_default) : void {
      def.refreshVariables(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'initialValue' attribute on Variable at DashboardClaimCount.pcf: line 17, column 53
    function initialValue_0 () : gw.api.dashboard.DashboardStatsHelper {
      return gw.api.dashboard.DashboardUtil.getHelper()
    }
    
    // 'initialValue' attribute on Variable at DashboardClaimCount.pcf: line 21, column 22
    function initialValue_1 () : String {
      return gw.api.dashboard.DashboardUtil.getMode()
    }
    
    // 'label' attribute on Verbatim at DashboardClaimCount.pcf: line 55, column 56
    function label_24 () : java.lang.String {
      return Stats.getIncurredLimitTip()
    }
    
    // 'mode' attribute on PanelRef at DashboardClaimCount.pcf: line 39, column 28
    function mode_10 () : java.lang.Object {
      return ModeSource
    }
    
    // Page (id=DashboardClaimCount) at DashboardClaimCount.pcf: line 8, column 123
    static function parent_26 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
      return pcf.DashboardSubGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=DashboardClaimCount) at DashboardClaimCount.pcf: line 8, column 123
    static function title_27 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Java.Dashboard.Title", DisplayKey.get("Java.Dashboard.ClaimCount.Title"))
    }
    
    // 'value' attribute on TextValue (id=label) at DashboardClaimCount.pcf: line 35, column 41
    function valueRoot_5 () : java.lang.Object {
      return Stats
    }
    
    // 'value' attribute on ToolbarInput (id=label) at DashboardClaimCount.pcf: line 35, column 41
    function value_3 () : java.lang.String {
      return Stats.WhenLastCalculatedString
    }
    
    // 'visible' attribute on PanelRef at DashboardClaimCount.pcf: line 43, column 101
    function visible_11 () : java.lang.Boolean {
      return GroupInfo.isRoot() && gw.api.dashboard.DashboardUtil.isShowByLineOrLoss()
    }
    
    // 'visible' attribute on Verbatim at DashboardClaimCount.pcf: line 55, column 56
    function visible_23 () : java.lang.Boolean {
      return ModeSource == "default"
    }
    
    override property get CurrentLocation () : pcf.DashboardClaimCount {
      return super.CurrentLocation as pcf.DashboardClaimCount
    }
    
    property get GroupInfo () : gw.api.dashboard.DashboardTreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.dashboard.DashboardTreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.dashboard.DashboardTreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    property get ModeSource () : String {
      return getVariableValue("ModeSource", 0) as String
    }
    
    property set ModeSource ($arg :  String) {
      setVariableValue("ModeSource", 0, $arg)
    }
    
    property get Stats () : gw.api.dashboard.DashboardStatsHelper {
      return getVariableValue("Stats", 0) as gw.api.dashboard.DashboardStatsHelper
    }
    
    property set Stats ($arg :  gw.api.dashboard.DashboardStatsHelper) {
      setVariableValue("Stats", 0, $arg)
    }
    
    
  }
  
  
}