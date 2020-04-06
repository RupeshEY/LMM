package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DashboardCurrentFinancialsExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/DashboardCurrentFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardCurrentFinancialsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : int {
      return 0
    }
    
    // 'available' attribute on PrintToolbarButton (id=PrintButton) at DashboardCurrentFinancials.pcf: line 24, column 61
    function available_1 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'canVisit' attribute on Page (id=DashboardCurrentFinancials) at DashboardCurrentFinancials.pcf: line 8, column 130
    static function canVisit_16 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Boolean {
      return perm.User.viewedbcurrfin and gw.api.financials.FinancialsUtil.isEditableFinancialsVersion()
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 46, column 101
    function def_onEnter_11 (def :  pcf.CurrentFinancialsByLossTypeLV) : void {
      def.onEnter(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 51, column 99
    function def_onEnter_14 (def :  pcf.CurrentFinancialsByCoverageTypeLV) : void {
      def.onEnter(Stats.CoverageTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 38, column 109
    function def_onEnter_5 (def :  pcf.CurrentFinancialsByOrgLevelLV) : void {
      def.onEnter(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 41, column 100
    function def_onEnter_8 (def :  pcf.CurrentFinancialsByLOBLV) : void {
      def.onEnter(Stats.LOBStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 46, column 101
    function def_refreshVariables_12 (def :  pcf.CurrentFinancialsByLossTypeLV) : void {
      def.refreshVariables(Stats.LossTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 51, column 99
    function def_refreshVariables_15 (def :  pcf.CurrentFinancialsByCoverageTypeLV) : void {
      def.refreshVariables(Stats.CoverageTypeStats?.toTypedArray())
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 38, column 109
    function def_refreshVariables_6 (def :  pcf.CurrentFinancialsByOrgLevelLV) : void {
      def.refreshVariables(Stats.getOrgStatsAsArray(GroupInfo.AllGroups?.toTypedArray()))
    }
    
    // 'def' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 41, column 100
    function def_refreshVariables_9 (def :  pcf.CurrentFinancialsByLOBLV) : void {
      def.refreshVariables(Stats.LOBStats?.toTypedArray())
    }
    
    // 'initialValue' attribute on Variable at DashboardCurrentFinancials.pcf: line 17, column 53
    function initialValue_0 () : gw.api.dashboard.DashboardStatsHelper {
      return gw.api.dashboard.DashboardUtil.getHelper()
    }
    
    // Page (id=DashboardCurrentFinancials) at DashboardCurrentFinancials.pcf: line 8, column 130
    static function parent_17 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : pcf.api.Destination {
      return pcf.DashboardSubGroup.createDestination(GroupInfo)
    }
    
    // 'title' attribute on Page (id=DashboardCurrentFinancials) at DashboardCurrentFinancials.pcf: line 8, column 130
    static function title_18 (GroupInfo :  gw.api.dashboard.DashboardTreeGroupInfo) : java.lang.Object {
      return DisplayKey.get("Java.Dashboard.Title", DisplayKey.get("Java.Dashboard.CurrentFinancials.Title"))
    }
    
    // 'value' attribute on TextValue (id=label) at DashboardCurrentFinancials.pcf: line 31, column 41
    function valueRoot_4 () : java.lang.Object {
      return Stats
    }
    
    // 'value' attribute on ToolbarInput (id=label) at DashboardCurrentFinancials.pcf: line 31, column 41
    function value_2 () : java.lang.String {
      return Stats.WhenLastCalculatedString
    }
    
    // 'visible' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 46, column 101
    function visible_10 () : java.lang.Boolean {
      return GroupInfo.isRoot() && gw.api.dashboard.DashboardUtil.isShowByLineOrLoss()
    }
    
    // 'visible' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 51, column 99
    function visible_13 () : java.lang.Boolean {
      return GroupInfo.isRoot() && gw.api.dashboard.DashboardUtil.isShowByCoverage()
    }
    
    // 'visible' attribute on PanelRef at DashboardCurrentFinancials.pcf: line 41, column 100
    function visible_7 () : java.lang.Boolean {
      return GroupInfo.isRoot()&& gw.api.dashboard.DashboardUtil.isShowByLineOrLoss()
    }
    
    override property get CurrentLocation () : pcf.DashboardCurrentFinancials {
      return super.CurrentLocation as pcf.DashboardCurrentFinancials
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