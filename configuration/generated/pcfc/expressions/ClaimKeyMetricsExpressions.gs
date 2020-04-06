package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimKeyMetricsExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimKeyMetricsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    // Page (id=ClaimKeyMetrics) at ClaimKeyMetrics.pcf: line 7, column 73
    static function parent_36 (claim :  Claim) : pcf.api.Destination {
      return pcf.ClaimSummaryGroup.createDestination(claim)
    }
    
    // 'value' attribute on RowIterator (id=ClaimMetricCategoryIterator) at ClaimKeyMetrics.pcf: line 41, column 53
    function value_15 () : typekey.ClaimMetricCategory[] {
      return ClaimMetricCategory.getTypeKeys( false ).toTypedArray()
    }
    
    // 'value' attribute on RowIterator (id=ExposureIterator) at ClaimKeyMetrics.pcf: line 106, column 41
    function value_33 () : entity.Exposure[] {
      return claim.OrderedExposures
    }
    
    // 'value' attribute on TextCell (id=ClaimTier) at ClaimKeyMetrics.pcf: line 168, column 26
    function value_34 () : java.lang.String {
      return DisplayKey.get("Web.Claim.ClaimKeyMetrics.Footer.ClaimTier", claim.ClaimTier)
    }
    
    override property get CurrentLocation () : pcf.ClaimKeyMetrics {
      return super.CurrentLocation as pcf.ClaimKeyMetrics
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'fontColor' attribute on TextCell (id=MetricValue) at ClaimKeyMetrics.pcf: line 68, column 46
    function fontColor_7 () : java.lang.String {
      return metric.DisplayColor
    }
    
    // 'icon' attribute on BooleanRadioCell (id=MetricStatus) at ClaimKeyMetrics.pcf: line 81, column 38
    function icon_13 () : java.lang.String {
      return metric.Status.Icon
    }
    
    // 'value' attribute on TypeKeyCell (id=MetricName) at ClaimKeyMetrics.pcf: line 62, column 50
    function valueRoot_5 () : java.lang.Object {
      return metric
    }
    
    // 'value' attribute on TextCell (id=MetricTargetValue) at ClaimKeyMetrics.pcf: line 74, column 35
    function value_10 () : java.lang.String {
      return metric.DisplayTargetValue
    }
    
    // 'value' attribute on TypeKeyCell (id=MetricName) at ClaimKeyMetrics.pcf: line 62, column 50
    function value_3 () : typekey.ClaimMetric {
      return metric.Subtype
    }
    
    // 'value' attribute on TextCell (id=MetricValue) at ClaimKeyMetrics.pcf: line 68, column 46
    function value_6 () : java.lang.String {
      return metric.DisplayValue
    }
    
    property get metric () : entity.ClaimMetric {
      return getIteratedValue(2) as entity.ClaimMetric
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends ClaimKeyMetricsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ExposureTierLabel) at ClaimKeyMetrics.pcf: line 117, column 58
    function valueRoot_20 () : java.lang.Object {
      return exposure.ExposureTier
    }
    
    // 'value' attribute on TextCell (id=ExposureName) at ClaimKeyMetrics.pcf: line 113, column 196
    function value_16 () : java.lang.String {
      return DisplayKey.get("Web.ClaimSummary.ClaimKeyMetrics.Exposure.Label", exposure.DisplayName, exposure.getPrimaryCoverage().DisplayName, exposure.Incident.DisplayName)
    }
    
    // 'value' attribute on TextCell (id=ExposureTierLabel) at ClaimKeyMetrics.pcf: line 117, column 58
    function value_18 () : java.lang.String {
      return exposure.ExposureTier.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimKeyMetrics.pcf: line 124, column 49
    function value_32 () : entity.ExposureMetric[] {
      return exposure.ExposureMetrics.orderBy(\ e -> e.Subtype).toTypedArray()
    }
    
    property get exposure () : entity.Exposure {
      return getIteratedValue(1) as entity.Exposure
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends IteratorEntry3ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'fontColor' attribute on TextCell (id=metricValue) at ClaimKeyMetrics.pcf: line 136, column 46
    function fontColor_25 () : java.lang.String {
      return metric.DisplayColor
    }
    
    // 'icon' attribute on BooleanRadioCell (id=ExposureMetricStatus) at ClaimKeyMetrics.pcf: line 148, column 38
    function icon_31 () : java.lang.String {
      return metric.Status.Icon
    }
    
    // 'value' attribute on TypeKeyCell (id=metricName) at ClaimKeyMetrics.pcf: line 131, column 35
    function valueRoot_23 () : java.lang.Object {
      return metric
    }
    
    // 'value' attribute on TypeKeyCell (id=metricName) at ClaimKeyMetrics.pcf: line 131, column 35
    function value_21 () : typekey.ExposureMetric {
      return metric.Subtype
    }
    
    // 'value' attribute on TextCell (id=metricValue) at ClaimKeyMetrics.pcf: line 136, column 46
    function value_24 () : java.lang.String {
      return metric.DisplayValue
    }
    
    // 'value' attribute on TextCell (id=MetricTargetValue) at ClaimKeyMetrics.pcf: line 142, column 35
    function value_28 () : java.lang.String {
      return metric.DisplayTargetValue
    }
    
    property get metric () : entity.ExposureMetric {
      return getIteratedValue(2) as entity.ExposureMetric
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/keymetrics/ClaimKeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimKeyMetricsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ClaimMetricCategoryHeader) at ClaimKeyMetrics.pcf: line 48, column 51
    function valueRoot_2 () : java.lang.Object {
      return metricCategory
    }
    
    // 'value' attribute on TextCell (id=ClaimMetricCategoryHeader) at ClaimKeyMetrics.pcf: line 48, column 51
    function value_0 () : java.lang.String {
      return metricCategory.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=ClaimMetricIterator) at ClaimKeyMetrics.pcf: line 56, column 46
    function value_14 () : entity.ClaimMetric[] {
      return claim.ClaimMetrics.where(\ c -> c.ClaimMetricCategory == metricCategory).orderBy(\ c -> c.Subtype).toTypedArray()
    }
    
    property get metricCategory () : typekey.ClaimMetricCategory {
      return getIteratedValue(1) as typekey.ClaimMetricCategory
    }
    
    
  }
  
  
}