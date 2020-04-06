package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimActivityByOrgLevelLVExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivityByOrgLevelLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 21, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Group.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 27, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 33, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 39, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewNoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 45, column 42
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 51, column 41
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgCloseTime
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 57, column 42
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ReopenedClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 63, column 42
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewLitigation
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByOrgLevelLV.pcf: line 15, column 43
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
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByOrgLevelLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimActivityByOrgLevelLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimActivityByOrgLevelLV.pcf: line 21, column 24
    function valueRoot_10 () : java.lang.Object {
      return DashboardStats.Group
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewExposures) at ClaimActivityByOrgLevelLV.pcf: line 27, column 42
    function valueRoot_13 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewExposures) at ClaimActivityByOrgLevelLV.pcf: line 27, column 42
    function value_11 () : java.lang.Integer {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewClaims) at ClaimActivityByOrgLevelLV.pcf: line 33, column 42
    function value_14 () : java.lang.Integer {
      return DashboardStats.NewClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewNoticeOnly) at ClaimActivityByOrgLevelLV.pcf: line 39, column 42
    function value_17 () : java.lang.Integer {
      return DashboardStats.NewNoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_ClosedClaims) at ClaimActivityByOrgLevelLV.pcf: line 45, column 42
    function value_20 () : java.lang.Integer {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_AvgCloseTime) at ClaimActivityByOrgLevelLV.pcf: line 51, column 41
    function value_23 () : java.lang.Double {
      return DashboardStats.AvgCloseTime
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_ReopenedClaims) at ClaimActivityByOrgLevelLV.pcf: line 57, column 42
    function value_26 () : java.lang.Integer {
      return DashboardStats.ReopenedClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewLitigation) at ClaimActivityByOrgLevelLV.pcf: line 63, column 42
    function value_29 () : java.lang.Integer {
      return DashboardStats.NewLitigation
    }
    
    // 'value' attribute on TextCell (id=ByOrgLevel) at ClaimActivityByOrgLevelLV.pcf: line 21, column 24
    function value_8 () : java.lang.String {
      return DashboardStats.Group.DisplayName
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}