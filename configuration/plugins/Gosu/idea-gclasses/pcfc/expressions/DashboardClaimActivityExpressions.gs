package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardClaimActivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardClaimActivityExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardClaimActivity.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardClaimActivityExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : int {
      return 0
    }
    
    // 'available' attribute on PrintToolbarButton (id=PrintButton) at DashboardClaimActivity.pcf: line 24, column 61
    function available_1 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DashboardClaimActivity) at DashboardClaimActivity.pcf: line 8, column 177
    static function canVisit_16 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewedbclaimact
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 42, column 101
    function def_onEnter_11 (def :  pcf.ClaimActivityByLossTypeLV) : void {
      def.onEnter(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 47, column 99
    function def_onEnter_14 (def :  pcf.ClaimActivityByCoverageTypeLV) : void {
      def.onEnter(Stats.CoverageTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 34, column 105
    function def_onEnter_5 (def :  pcf.ClaimActivityByOrgLevelLV) : void {
      def.onEnter(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 37, column 101
    function def_onEnter_8 (def :  pcf.ClaimActivityByLOBLV) : void {
      def.onEnter(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 42, column 101
    function def_refreshVariables_12 (def :  pcf.ClaimActivityByLossTypeLV) : void {
      def.refreshVariables(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 47, column 99
    function def_refreshVariables_15 (def :  pcf.ClaimActivityByCoverageTypeLV) : void {
      def.refreshVariables(Stats.CoverageTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 34, column 105
    function def_refreshVariables_6 (def :  pcf.ClaimActivityByOrgLevelLV) : void {
      def.refreshVariables(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardClaimActivity.pcf: line 37, column 101
    function def_refreshVariables_9 (def :  pcf.ClaimActivityByLOBLV) : void {
      def.refreshVariables(Stats.LOBStats?.toTypedArray())
    }
    
    // 'initialValue' attribute on Variable at DashboardClaimActivity.pcf: line 17, column 53
    function initialValue_0 () : gw.api.dashboard.DashboardStatsHelper {
      return gw.api.dashboard.DashboardUtil.getHelper()
    }
    
    // Page (id=DashboardClaimActivity) at DashboardClaimActivity.pcf: line 8, column 177
    static function parent_17 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
      return pcf.DashboardSubGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=DashboardClaimActivity) at DashboardClaimActivity.pcf: line 8, column 177
    static function title_18 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Java.Dashboard.Title", DisplayKey.get("Java.Dashboard.ClaimActivity.Title", gw.api.dashboard.DashboardUtil.getHelper().Period))
    }
    
    // 'value' attribute on TextValue (id=label) at DashboardClaimActivity.pcf: line 31, column 41
    function valueRoot_4 () : java.lang.Object {
      return Stats
    }
    
    // 'value' attribute on ToolbarInput (id=label) at DashboardClaimActivity.pcf: line 31, column 41
    function value_2 () : java.lang.String {
      return Stats.WhenLastCalculatedString
    }
    
    // 'visible' attribute on PanelRef at DashboardClaimActivity.pcf: line 47, column 99
    function visible_13 () : java.lang.Boolean {
      return GroupInfo.isRoot() && gw.api.dashboard.DashboardUtil.isShowByCoverage()
    }
    
    // 'visible' attribute on PanelRef at DashboardClaimActivity.pcf: line 37, column 101
    function visible_7 () : java.lang.Boolean {
      return GroupInfo.isRoot() && gw.api.dashboard.DashboardUtil.isShowByLineOrLoss()
    }
    
    override property get CurrentLocation () : pcf.DashboardClaimActivity {
      return super.CurrentLocation as pcf.DashboardClaimActivity
    }
    
    property get GroupInfo () : gw.api.dashboard.DashboardTreeGroupInfo {
      return getVariableValue("GroupInfo", 0) as gw.api.dashboard.DashboardTreeGroupInfo
    }
    
    property set GroupInfo ($arg :  gw.api.dashboard.DashboardTreeGroupInfo) {
      setVariableValue("GroupInfo", 0, $arg)
    }
    
    property get Stats () : gw.api.dashboard.DashboardStatsHelper {
      return getVariableValue("Stats", 0) as gw.api.dashboard.DashboardStatsHelper
    }
    
    property set Stats ($arg :  gw.api.dashboard.DashboardStatsHelper) {
      setVariableValue("Stats", 0, $arg)
    }
    
    
  }
  
  
}