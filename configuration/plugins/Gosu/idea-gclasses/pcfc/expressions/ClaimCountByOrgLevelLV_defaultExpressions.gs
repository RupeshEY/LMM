package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimCountByOrgLevelLV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCountByOrgLevelLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 25, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Group.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 31, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 37, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 43, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Handlers
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 49, column 41
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgPending
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 55, column 42
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 61, column 42
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 67, column 42
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 73, column 42
    function sortValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OverIncurredLimit
    }
    
    // 'value' attribute on RowIterator at ClaimCountByOrgLevelLV.default.pcf: line 19, column 43
    function value_36 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByOrgLevelLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimCountByOrgLevelLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimCountByOrgLevelLV.default.pcf: line 25, column 24
    function valueRoot_11 () : java.lang.Object {
      return DashboardStats.Group
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByOrgLevelLV.default.pcf: line 31, column 42
    function valueRoot_14 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByOrgLevelLV.default.pcf: line 31, column 42
    function value_12 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenClaims) at ClaimCountByOrgLevelLV.default.pcf: line 37, column 42
    function value_15 () : java.lang.Integer {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Handlers) at ClaimCountByOrgLevelLV.default.pcf: line 43, column 42
    function value_18 () : java.lang.Integer {
      return DashboardStats.Handlers
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_AvgPending) at ClaimCountByOrgLevelLV.default.pcf: line 49, column 41
    function value_21 () : java.lang.Double {
      return DashboardStats.AvgPending
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_NoticeOnly) at ClaimCountByOrgLevelLV.default.pcf: line 55, column 42
    function value_24 () : java.lang.Integer {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Flagged) at ClaimCountByOrgLevelLV.default.pcf: line 61, column 42
    function value_27 () : java.lang.Integer {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Litigated) at ClaimCountByOrgLevelLV.default.pcf: line 67, column 42
    function value_30 () : java.lang.Integer {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OverIncurredLimit) at ClaimCountByOrgLevelLV.default.pcf: line 73, column 42
    function value_33 () : java.lang.Integer {
      return DashboardStats.OverIncurredLimit
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimCountByOrgLevelLV.default.pcf: line 25, column 24
    function value_9 () : java.lang.String {
      return DashboardStats.Group.DisplayName
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}