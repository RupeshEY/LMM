package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimActivityByCoverageTypeLVExpressions {
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimActivityByCoverageTypeLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 23, column 24
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.CoverageType
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 30, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 37, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 43, column 41
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgCloseTime
    }
    
    // '$$sumValue' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 30, column 42
    function sumValueRoot_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 30, column 42
    function sumValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.NewExposures
    }
    
    // 'footerSumValue' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 37, column 42
    function sumValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClosedExposures
    }
    
    // 'value' attribute on RowIterator at ClaimActivityByCoverageTypeLV.pcf: line 15, column 43
    function value_20 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/dashboard/ClaimActivityByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimActivityByCoverageTypeLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByCoverageType) at ClaimActivityByCoverageTypeLV.pcf: line 23, column 24
    function valueRoot_10 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_NewExposures) at ClaimActivityByCoverageTypeLV.pcf: line 30, column 42
    function value_11 () : java.lang.Integer {
      return DashboardStats.NewExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_ClosedExposures) at ClaimActivityByCoverageTypeLV.pcf: line 37, column 42
    function value_14 () : java.lang.Integer {
      return DashboardStats.ClosedExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimActivity_AvgCloseTime) at ClaimActivityByCoverageTypeLV.pcf: line 43, column 41
    function value_17 () : java.lang.Double {
      return DashboardStats.AvgCloseTime
    }
    
    // 'value' attribute on TypeKeyCell (id=ByCoverageType) at ClaimActivityByCoverageTypeLV.pcf: line 23, column 24
    function value_8 () : typekey.CoverageType {
      return DashboardStats.CoverageType
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}