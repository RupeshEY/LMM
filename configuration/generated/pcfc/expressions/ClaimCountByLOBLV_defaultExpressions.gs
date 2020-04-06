package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLOBLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimCountByLOBLV_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLOBLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCountByLOBLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 24, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 31, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 38, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 45, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 52, column 42
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 59, column 42
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 66, column 42
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OverIncurredLimit
    }
    
    // '$$sumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 31, column 42
    function sumValueRoot_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 45, column 42
    function sumValue_11 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 52, column 42
    function sumValue_13 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 59, column 42
    function sumValue_15 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 66, column 42
    function sumValue_17 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OverIncurredLimit
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 31, column 42
    function sumValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 38, column 42
    function sumValue_9 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLOBLV.default.pcf: line 16, column 43
    function value_40 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLOBLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimCountByLOBLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at ClaimCountByLOBLV.default.pcf: line 24, column 24
    function valueRoot_21 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at ClaimCountByLOBLV.default.pcf: line 24, column 24
    function value_19 () : typekey.LOBCode {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByLOBLV.default.pcf: line 31, column 42
    function value_22 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenClaims) at ClaimCountByLOBLV.default.pcf: line 38, column 42
    function value_25 () : java.lang.Integer {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_NoticeOnly) at ClaimCountByLOBLV.default.pcf: line 45, column 42
    function value_28 () : java.lang.Integer {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Flagged) at ClaimCountByLOBLV.default.pcf: line 52, column 42
    function value_31 () : java.lang.Integer {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Litigated) at ClaimCountByLOBLV.default.pcf: line 59, column 42
    function value_34 () : java.lang.Integer {
      return DashboardStats.Litigated
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OverIncurredLimit) at ClaimCountByLOBLV.default.pcf: line 66, column 42
    function value_37 () : java.lang.Integer {
      return DashboardStats.OverIncurredLimit
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}