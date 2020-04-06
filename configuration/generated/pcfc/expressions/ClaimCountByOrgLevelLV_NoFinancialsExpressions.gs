package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimCountByOrgLevelLV_NoFinancialsExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCountByOrgLevelLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 22, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Group.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 28, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 34, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 40, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Handlers
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 46, column 41
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgPending
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 52, column 42
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 58, column 42
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 64, column 42
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 16, column 43
    function value_32 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimCountByOrgLevelLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 22, column 24
    function valueRoot_10 () : java.lang.Object {
      return DashboardStats.Group
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 28, column 42
    function valueRoot_13 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 28, column 42
    function value_11 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenClaims) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 34, column 42
    function value_14 () : java.lang.Integer {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Handlers) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 40, column 42
    function value_17 () : java.lang.Integer {
      return DashboardStats.Handlers
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_AvgPending) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 46, column 41
    function value_20 () : java.lang.Double {
      return DashboardStats.AvgPending
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_NoticeOnly) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 52, column 42
    function value_23 () : java.lang.Integer {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Flagged) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 58, column 42
    function value_26 () : java.lang.Integer {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Litigated) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 64, column 42
    function value_29 () : java.lang.Integer {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimCountByOrgLevelLV.NoFinancials.pcf: line 22, column 24
    function value_8 () : java.lang.String {
      return DashboardStats.Group.DisplayName
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}