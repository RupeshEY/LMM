package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLossTypeLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimCountByLossTypeLV_NoFinancialsExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLossTypeLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimCountByLossTypeLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 24, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.LossType
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 31, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 38, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 45, column 42
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 52, column 42
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 59, column 42
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // '$$sumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 31, column 42
    function sumValueRoot_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 45, column 42
    function sumValue_10 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NoticeOnly
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 52, column 42
    function sumValue_12 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Flagged
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 59, column 42
    function sumValue_14 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.Litigated
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 31, column 42
    function sumValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 38, column 42
    function sumValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on RowIterator at ClaimCountByLossTypeLV.NoFinancials.pcf: line 16, column 43
    function value_34 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimCountByLossTypeLV.NoFinancials.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimCountByLossTypeLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLossType) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 24, column 24
    function valueRoot_18 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLossType) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 24, column 24
    function value_16 () : typekey.LossType {
      return DashboardStats.LossType
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenExposures) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 31, column 42
    function value_19 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_OpenClaims) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 38, column 42
    function value_22 () : java.lang.Integer {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_NoticeOnly) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 45, column 42
    function value_25 () : java.lang.Integer {
      return DashboardStats.NoticeOnly
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Flagged) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 52, column 42
    function value_28 () : java.lang.Integer {
      return DashboardStats.Flagged
    }
    
    // 'value' attribute on TextCell (id=ClaimCount_Litigated) at ClaimCountByLossTypeLV.NoFinancials.pcf: line 59, column 42
    function value_31 () : java.lang.Integer {
      return DashboardStats.Litigated
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}