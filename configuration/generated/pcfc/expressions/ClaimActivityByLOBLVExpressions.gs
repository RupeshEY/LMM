package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimActivityByLOBLVExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivityByLOBLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 23, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 30, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 37, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 44, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewNoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 51, column 42
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 57, column 41
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgCloseTime
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 64, column 42
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ReopenedClaims
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 71, column 42
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewLitigation
    }
    
    // '$$sumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 30, column 42
    function sumValueRoot_9 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 37, column 42
    function sumValue_10 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 44, column 42
    function sumValue_12 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewNoticeOnly
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 51, column 42
    function sumValue_14 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 64, column 42
    function sumValue_16 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ReopenedClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 71, column 42
    function sumValue_18 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewLitigation
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 30, column 42
    function sumValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByLOBLV.pcf: line 15, column 43
    function value_44 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimActivityByLOBLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at ClaimActivityByLOBLV.pcf: line 23, column 24
    function valueRoot_22 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at ClaimActivityByLOBLV.pcf: line 23, column 24
    function value_20 () : typekey.LOBCode {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewExposures) at ClaimActivityByLOBLV.pcf: line 30, column 42
    function value_23 () : java.lang.Integer {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewClaims) at ClaimActivityByLOBLV.pcf: line 37, column 42
    function value_26 () : java.lang.Integer {
      return DashboardStats.NewClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewNoticeOnly) at ClaimActivityByLOBLV.pcf: line 44, column 42
    function value_29 () : java.lang.Integer {
      return DashboardStats.NewNoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_ClosedClaims) at ClaimActivityByLOBLV.pcf: line 51, column 42
    function value_32 () : java.lang.Integer {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_AvgCloseTime) at ClaimActivityByLOBLV.pcf: line 57, column 41
    function value_35 () : java.lang.Double {
      return DashboardStats.AvgCloseTime
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_ReopenedClaims) at ClaimActivityByLOBLV.pcf: line 64, column 42
    function value_38 () : java.lang.Integer {
      return DashboardStats.ReopenedClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewLitigation) at ClaimActivityByLOBLV.pcf: line 71, column 42
    function value_41 () : java.lang.Integer {
      return DashboardStats.NewLitigation
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}