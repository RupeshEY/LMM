package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PeriodFinancialsByLOBLVExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PeriodFinancialsByLOBLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at PeriodFinancialsByLOBLV.pcf: line 52, column 24
    function valueRoot_21 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness) at PeriodFinancialsByLOBLV.pcf: line 52, column 24
    function value_19 () : typekey.LOBCode {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_ClosedClaims) at PeriodFinancialsByLOBLV.pcf: line 60, column 24
    function value_22 () : java.lang.Integer {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_ExpensesOnClosed) at PeriodFinancialsByLOBLV.pcf: line 68, column 45
    function value_25 () : java.math.BigDecimal {
      return DashboardStats.ExpensesOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_ClaimCostsOnClosed) at PeriodFinancialsByLOBLV.pcf: line 76, column 45
    function value_27 () : java.math.BigDecimal {
      return DashboardStats.ClaimCostsOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_PaidOnClosed) at PeriodFinancialsByLOBLV.pcf: line 84, column 45
    function value_29 () : java.math.BigDecimal {
      return DashboardStats.PaidOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_AvgPaidOnClosed) at PeriodFinancialsByLOBLV.pcf: line 91, column 45
    function value_31 () : java.math.BigDecimal {
      return DashboardStats.AvgPaidOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_ExpensesInPeriod) at PeriodFinancialsByLOBLV.pcf: line 99, column 45
    function value_33 () : java.math.BigDecimal {
      return DashboardStats.ExpensesInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_ClaimCostsInPeriod) at PeriodFinancialsByLOBLV.pcf: line 107, column 45
    function value_35 () : java.math.BigDecimal {
      return DashboardStats.ClaimCostsInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_PaidInPeriod) at PeriodFinancialsByLOBLV.pcf: line 115, column 45
    function value_37 () : java.math.BigDecimal {
      return DashboardStats.PaidInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=PeriodFinancials_RecoveredInPeriod) at PeriodFinancialsByLOBLV.pcf: line 123, column 45
    function value_39 () : java.math.BigDecimal {
      return DashboardStats.RecoveredInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/PeriodFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeriodFinancialsByLOBLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 52, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 60, column 24
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedClaims
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 68, column 45
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 76, column 45
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 84, column 45
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.PaidOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 91, column 45
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgPaidOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 99, column 45
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 107, column 45
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 115, column 45
    function sortValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.PaidInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 123, column 45
    function sortValue_9 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.RecoveredInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // '$$sumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 60, column 24
    function sumValueRoot_11 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 60, column 24
    function sumValue_10 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 68, column 45
    function sumValue_12 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 76, column 45
    function sumValue_13 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 84, column 45
    function sumValue_14 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.PaidOnClosed.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 99, column 45
    function sumValue_15 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 107, column 45
    function sumValue_16 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 115, column 45
    function sumValue_17 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.PaidInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 123, column 45
    function sumValue_18 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.RecoveredInPeriod.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on RowIterator at PeriodFinancialsByLOBLV.pcf: line 43, column 43
    function value_41 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  
}