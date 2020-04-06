package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class KeyMetricsExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.RedValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.RedValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.TargetValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.TargetValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.TargetValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.TargetValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.YellowValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.YellowValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.YellowValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.YellowValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_94 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.RedValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultLimit.EditableValues.RedValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'sortBy' attribute on IteratorSort at KeyMetrics.pcf: line 122, column 42
    function sortBy_19 (tier :  typekey.ClaimTier) : java.lang.Object {
      return tier
    }
    
    // 'toRemove' attribute on RowIterator (id=ClaimMetricLimitIterator) at KeyMetrics.pcf: line 164, column 59
    function toRemove_214 (limit :  entity.ClaimMetricLimit) : void {
      limits.removeFromClaimMetricLimits(limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 139, column 72
    function validationExpression_29 () : java.lang.Object {
      return validateMetricInput(defaultLimit.EditableValues.TargetValue, defaultLimit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 146, column 72
    function validationExpression_59 () : java.lang.Object {
      return validateMetricInput(defaultLimit.EditableValues.YellowValue, defaultLimit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 153, column 69
    function validationExpression_89 () : java.lang.Object {
      return validateMetricInput(defaultLimit.EditableValues.RedValue, defaultLimit)
    }
    
    // 'value' attribute on TextCell (id=Label) at KeyMetrics.pcf: line 113, column 72
    function valueRoot_25 () : java.lang.Object {
      return defaultLimit.ClaimMetricType
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 132, column 55
    function valueRoot_28 () : java.lang.Object {
      return defaultLimit
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_35 () : java.lang.Object {
      return defaultLimit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 139, column 72
    function valueRoot_58 () : java.lang.Object {
      return defaultLimit.EditableValues
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_65 () : java.lang.Object {
      return defaultLimit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_95 () : java.lang.Object {
      return defaultLimit.EditableValues.RedValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_103 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.RedValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_113 () : gw.api.financials.CurrencyAmount {
      return defaultLimit.EditableValues.RedValue.MoneyValue
    }
    
    // 'value' attribute on TextCell (id=Label) at KeyMetrics.pcf: line 113, column 72
    function value_18 () : java.lang.String {
      return defaultLimit.ClaimMetricType.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=ClaimMetricLimitIterator) at KeyMetrics.pcf: line 164, column 59
    function value_215 () : entity.ClaimMetricLimit[] {
      return getSortedClaimMetricLimits( category, defaultLimit )
    }
    
    // 'value' attribute on AddMenuItemIterator (id=CreateLimitMenu) at KeyMetrics.pcf: line 119, column 62
    function value_23 () : typekey.ClaimTier[] {
      return getClaimTiersWithNoLimit(defaultLimit)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 132, column 55
    function value_26 () : java.lang.String {
      return defaultLimit.UnitLabel
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 139, column 72
    function value_30 () : gw.api.metric.EditableMetricLimitValue {
      return defaultLimit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_33 () : java.lang.Integer {
      return defaultLimit.EditableValues.TargetValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_38 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.TargetValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_43 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.TargetValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_53 () : gw.api.financials.CurrencyAmount {
      return defaultLimit.EditableValues.TargetValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 146, column 72
    function value_60 () : gw.api.metric.EditableMetricLimitValue {
      return defaultLimit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_63 () : java.lang.Integer {
      return defaultLimit.EditableValues.YellowValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_68 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.YellowValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_73 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.YellowValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_83 () : gw.api.financials.CurrencyAmount {
      return defaultLimit.EditableValues.YellowValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 153, column 69
    function value_90 () : gw.api.metric.EditableMetricLimitValue {
      return defaultLimit.EditableValues.RedValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_93 () : java.lang.Integer {
      return defaultLimit.EditableValues.RedValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_98 () : java.math.BigDecimal {
      return defaultLimit.EditableValues.RedValue.DecimalValue
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_102 () : java.lang.Boolean {
      return defaultLimit.EditableValues.RedValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_112 () : java.lang.Boolean {
      return defaultLimit.EditableValues.RedValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on AddMenuItemIterator (id=CreateLimitMenu) at KeyMetrics.pcf: line 119, column 62
    function visible_20 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_32 () : java.lang.Boolean {
      return defaultLimit.EditableValues.TargetValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_37 () : java.lang.Boolean {
      return defaultLimit.EditableValues.TargetValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_42 () : java.lang.Boolean {
      return defaultLimit.EditableValues.TargetValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_52 () : java.lang.Boolean {
      return defaultLimit.EditableValues.TargetValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_62 () : java.lang.Boolean {
      return defaultLimit.EditableValues.YellowValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_67 () : java.lang.Boolean {
      return defaultLimit.EditableValues.YellowValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_72 () : java.lang.Boolean {
      return defaultLimit.EditableValues.YellowValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_82 () : java.lang.Boolean {
      return defaultLimit.EditableValues.YellowValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_92 () : java.lang.Boolean {
      return defaultLimit.EditableValues.RedValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_97 () : java.lang.Boolean {
      return defaultLimit.EditableValues.RedValue.DataType.Name == "decimalmetric"
    }
    
    property get defaultLimit () : entity.ClaimMetricLimit {
      return getIteratedValue(2) as entity.ClaimMetricLimit
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends IteratorEntry2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on AddMenuItem (id=CreateLimitForTier) at KeyMetrics.pcf: line 127, column 77
    function label_21 () : java.lang.Object {
      return tier.DisplayName
    }
    
    // 'toCreateAndAdd' attribute on AddMenuItem (id=CreateLimitForTier) at KeyMetrics.pcf: line 127, column 77
    function toCreateAndAdd_22 (CheckedValues :  Object[]) : java.lang.Object {
      return defaultLimit.copyWithTier(tier)
    }
    
    property get tier () : typekey.ClaimTier {
      return getIteratedValue(3) as typekey.ClaimTier
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry4ExpressionsImpl extends IteratorEntry2ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_129 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_134 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_139 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_149 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_159 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_164 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_169 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_179 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_189 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_194 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_199 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_209 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 180, column 67
    function validationExpression_124 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.TargetValue, limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 187, column 67
    function validationExpression_154 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.YellowValue, limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 194, column 64
    function validationExpression_184 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.RedValue, limit)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 173, column 50
    function valueRoot_123 () : java.lang.Object {
      return limit
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_130 () : java.lang.Object {
      return limit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 180, column 67
    function valueRoot_153 () : java.lang.Object {
      return limit.EditableValues
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_160 () : java.lang.Object {
      return limit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_190 () : java.lang.Object {
      return limit.EditableValues.RedValue
    }
    
    // 'value' attribute on TextCell (id=Tier) at KeyMetrics.pcf: line 170, column 119
    function value_119 () : java.lang.String {
      return DisplayKey.get("Web.Admin.KeyMetrics.Indent", limit.ClaimTier.DisplayName)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 173, column 50
    function value_121 () : java.lang.String {
      return limit.UnitLabel
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 180, column 67
    function value_125 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_128 () : java.lang.Integer {
      return limit.EditableValues.TargetValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_133 () : java.math.BigDecimal {
      return limit.EditableValues.TargetValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_138 () : java.math.BigDecimal {
      return limit.EditableValues.TargetValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_148 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.TargetValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 187, column 67
    function value_155 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_158 () : java.lang.Integer {
      return limit.EditableValues.YellowValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_163 () : java.math.BigDecimal {
      return limit.EditableValues.YellowValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_168 () : java.math.BigDecimal {
      return limit.EditableValues.YellowValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_178 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.YellowValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 194, column 64
    function value_185 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.RedValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_188 () : java.lang.Integer {
      return limit.EditableValues.RedValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_193 () : java.math.BigDecimal {
      return limit.EditableValues.RedValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_198 () : java.math.BigDecimal {
      return limit.EditableValues.RedValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_208 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.RedValue.MoneyValue
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_127 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_132 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_137 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_147 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_157 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_162 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_167 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_177 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_187 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_192 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_197 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_207 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "currencyamount"
    }
    
    property get limit () : entity.ClaimMetricLimit {
      return getIteratedValue(3) as entity.ClaimMetricLimit
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry5ExpressionsImpl extends KeyMetricsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_234 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.TargetValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_239 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.TargetValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_244 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.TargetValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_254 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.TargetValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_264 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.YellowValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_269 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.YellowValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_274 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.YellowValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_284 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.YellowValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_294 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.RedValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_299 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.RedValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_304 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.RedValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_314 (__VALUE_TO_SET :  java.lang.Object) : void {
      defaultExposureLimit.EditableValues.RedValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'sortBy' attribute on IteratorSort at KeyMetrics.pcf: line 269, column 40
    function sortBy_219 (tier :  typekey.ExposureTier) : java.lang.Object {
      return tier
    }
    
    // 'toRemove' attribute on RowIterator (id=ExposureMetricLimitIterator) at KeyMetrics.pcf: line 311, column 60
    function toRemove_414 (limit :  entity.ExposureMetricLimit) : void {
      limits.removeFromExposureMetricLimits(limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 286, column 78
    function validationExpression_229 () : java.lang.Object {
      return validateMetricInput(defaultExposureLimit.EditableValues.TargetValue, defaultExposureLimit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 293, column 78
    function validationExpression_259 () : java.lang.Object {
      return validateMetricInput(defaultExposureLimit.EditableValues.YellowValue, defaultExposureLimit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 300, column 75
    function validationExpression_289 () : java.lang.Object {
      return validateMetricInput(defaultExposureLimit.EditableValues.RedValue, defaultExposureLimit)
    }
    
    // 'value' attribute on TextCell (id=Label) at KeyMetrics.pcf: line 260, column 81
    function valueRoot_225 () : java.lang.Object {
      return defaultExposureLimit.ExposureMetricType
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 279, column 61
    function valueRoot_228 () : java.lang.Object {
      return defaultExposureLimit
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_235 () : java.lang.Object {
      return defaultExposureLimit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 286, column 78
    function valueRoot_258 () : java.lang.Object {
      return defaultExposureLimit.EditableValues
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_265 () : java.lang.Object {
      return defaultExposureLimit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_295 () : java.lang.Object {
      return defaultExposureLimit.EditableValues.RedValue
    }
    
    // 'value' attribute on TextCell (id=Label) at KeyMetrics.pcf: line 260, column 81
    function value_218 () : java.lang.String {
      return defaultExposureLimit.ExposureMetricType.DisplayName
    }
    
    // 'value' attribute on AddMenuItemIterator (id=CreateLimitMenu) at KeyMetrics.pcf: line 266, column 60
    function value_223 () : typekey.ExposureTier[] {
      return getExposureTiersWithNoLimit(defaultExposureLimit)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 279, column 61
    function value_226 () : java.lang.String {
      return defaultExposureLimit.UnitLabel
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 286, column 78
    function value_230 () : gw.api.metric.EditableMetricLimitValue {
      return defaultExposureLimit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_233 () : java.lang.Integer {
      return defaultExposureLimit.EditableValues.TargetValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_238 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.TargetValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_243 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.TargetValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_253 () : gw.api.financials.CurrencyAmount {
      return defaultExposureLimit.EditableValues.TargetValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 293, column 78
    function value_260 () : gw.api.metric.EditableMetricLimitValue {
      return defaultExposureLimit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_263 () : java.lang.Integer {
      return defaultExposureLimit.EditableValues.YellowValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_268 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.YellowValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_273 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.YellowValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_283 () : gw.api.financials.CurrencyAmount {
      return defaultExposureLimit.EditableValues.YellowValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 300, column 75
    function value_290 () : gw.api.metric.EditableMetricLimitValue {
      return defaultExposureLimit.EditableValues.RedValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_293 () : java.lang.Integer {
      return defaultExposureLimit.EditableValues.RedValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_298 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.RedValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_303 () : java.math.BigDecimal {
      return defaultExposureLimit.EditableValues.RedValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_313 () : gw.api.financials.CurrencyAmount {
      return defaultExposureLimit.EditableValues.RedValue.MoneyValue
    }
    
    // 'value' attribute on RowIterator (id=ExposureMetricLimitIterator) at KeyMetrics.pcf: line 311, column 60
    function value_415 () : entity.ExposureMetricLimit[] {
      return getSortedExposureMetricLimits(defaultExposureLimit)
    }
    
    // 'visible' attribute on AddMenuItemIterator (id=CreateLimitMenu) at KeyMetrics.pcf: line 266, column 60
    function visible_220 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_232 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.TargetValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_237 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.TargetValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_242 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.TargetValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_252 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.TargetValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_262 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.YellowValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_267 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.YellowValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_272 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.YellowValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_282 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.YellowValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_292 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.RedValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_297 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.RedValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_302 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.RedValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_312 () : java.lang.Boolean {
      return defaultExposureLimit.EditableValues.RedValue.DataType.Name == "currencyamount"
    }
    
    property get defaultExposureLimit () : entity.ExposureMetricLimit {
      return getIteratedValue(1) as entity.ExposureMetricLimit
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry6ExpressionsImpl extends IteratorEntry5ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on AddMenuItem (id=CreateLimitForTier) at KeyMetrics.pcf: line 274, column 83
    function label_221 () : java.lang.Object {
      return tier.DisplayName
    }
    
    // 'toCreateAndAdd' attribute on AddMenuItem (id=CreateLimitForTier) at KeyMetrics.pcf: line 274, column 83
    function toCreateAndAdd_222 (CheckedValues :  Object[]) : java.lang.Object {
      return defaultExposureLimit.copyWithTier(tier)
    }
    
    property get tier () : typekey.ExposureTier {
      return getIteratedValue(2) as typekey.ExposureTier
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry7ExpressionsImpl extends IteratorEntry5ExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_329 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_334 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_339 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_349 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.TargetValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_359 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_364 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_369 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_379 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.YellowValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function defaultSetter_389 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.IntegerValue = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function defaultSetter_394 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.DecimalValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function defaultSetter_399 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.PercentValue = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function defaultSetter_409 (__VALUE_TO_SET :  java.lang.Object) : void {
      limit.EditableValues.RedValue.MoneyValue = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 327, column 65
    function validationExpression_324 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.TargetValue, limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 334, column 65
    function validationExpression_354 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.YellowValue, limit)
    }
    
    // 'validationExpression' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 341, column 62
    function validationExpression_384 () : java.lang.Object {
      return validateMetricInput(limit.EditableValues.RedValue, limit)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 320, column 48
    function valueRoot_323 () : java.lang.Object {
      return limit
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_330 () : java.lang.Object {
      return limit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 327, column 65
    function valueRoot_353 () : java.lang.Object {
      return limit.EditableValues
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_360 () : java.lang.Object {
      return limit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function valueRoot_390 () : java.lang.Object {
      return limit.EditableValues.RedValue
    }
    
    // 'value' attribute on TextCell (id=Tier) at KeyMetrics.pcf: line 317, column 120
    function value_319 () : java.lang.String {
      return DisplayKey.get("Web.Admin.KeyMetrics.Indent", limit.ExposureTier.DisplayName)
    }
    
    // 'value' attribute on TextCell (id=Unit) at KeyMetrics.pcf: line 320, column 48
    function value_321 () : java.lang.String {
      return limit.UnitLabel
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at KeyMetrics.pcf: line 327, column 65
    function value_325 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.TargetValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_328 () : java.lang.Integer {
      return limit.EditableValues.TargetValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_333 () : java.math.BigDecimal {
      return limit.EditableValues.TargetValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_338 () : java.math.BigDecimal {
      return limit.EditableValues.TargetValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_348 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.TargetValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at KeyMetrics.pcf: line 334, column 65
    function value_355 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.YellowValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_358 () : java.lang.Integer {
      return limit.EditableValues.YellowValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_363 () : java.math.BigDecimal {
      return limit.EditableValues.YellowValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_368 () : java.math.BigDecimal {
      return limit.EditableValues.YellowValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_378 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.YellowValue.MoneyValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at KeyMetrics.pcf: line 341, column 62
    function value_385 () : gw.api.metric.EditableMetricLimitValue {
      return limit.EditableValues.RedValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function value_388 () : java.lang.Integer {
      return limit.EditableValues.RedValue.IntegerValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function value_393 () : java.math.BigDecimal {
      return limit.EditableValues.RedValue.DecimalValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function value_398 () : java.math.BigDecimal {
      return limit.EditableValues.RedValue.PercentValue
    }
    
    // 'value' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function value_408 () : gw.api.financials.CurrencyAmount {
      return limit.EditableValues.RedValue.MoneyValue
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_327 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_332 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_337 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=TargetValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_347 () : java.lang.Boolean {
      return limit.EditableValues.TargetValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_357 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_362 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_367 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=YellowValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_377 () : java.lang.Boolean {
      return limit.EditableValues.YellowValue.DataType.Name == "currencyamount"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 9, column 68
    function visible_387 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "integer"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 16, column 74
    function visible_392 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "decimalmetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 25, column 77
    function visible_397 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "percentagemetric"
    }
    
    // 'visible' attribute on MetricLimitValueCell (id=RedValue) at MetricLimitValueWidget.xml: line 40, column 75
    function visible_407 () : java.lang.Boolean {
      return limit.EditableValues.RedValue.DataType.Name == "currencyamount"
    }
    
    property get limit () : entity.ExposureMetricLimit {
      return getIteratedValue(2) as entity.ExposureMetricLimit
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends KeyMetricsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=ClaimMetricLimitCategoryHeader) at KeyMetrics.pcf: line 99, column 51
    function valueRoot_17 () : java.lang.Object {
      return category
    }
    
    // 'value' attribute on TextCell (id=ClaimMetricLimitCategoryHeader) at KeyMetrics.pcf: line 99, column 51
    function value_15 () : java.lang.String {
      return category.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=ClaimMetricDefaultLimitIterator) at KeyMetrics.pcf: line 108, column 57
    function value_216 () : entity.ClaimMetricLimit[] {
      return limits.ClaimMetricLimits.where(\ l -> l.ClaimMetricCategory == category and l.DefaultLimit).sortBy(\ l -> l.Currency).sortBy(\ l -> l.ClaimMetricType)
    }
    
    property get category () : typekey.ClaimMetricCategory {
      return getIteratedValue(1) as typekey.ClaimMetricCategory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/keymetrics/KeyMetrics.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KeyMetricsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'available' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function available_7 () : java.lang.Boolean {
      return not CurrentLocation.InEditMode
    }
    
    // 'canEdit' attribute on Page (id=KeyMetrics) at KeyMetrics.pcf: line 9, column 62
    function canEdit_419 () : java.lang.Boolean {
      return perm.ClaimMetricLimit.edit
    }
    
    // 'canVisit' attribute on Page (id=KeyMetrics) at KeyMetrics.pcf: line 9, column 62
    static function canVisit_420 () : java.lang.Boolean {
      return perm.ClaimMetricLimit.view
    }
    
    // 'def' attribute on InputSetRef at KeyMetrics.pcf: line 354, column 89
    function def_onEnter_417 (def :  pcf.LargeLossThresholdInputSet) : void {
      def.onEnter(policyType, ccThreshold, psThreshold)
    }
    
    // 'def' attribute on InputSetRef at KeyMetrics.pcf: line 354, column 89
    function def_refreshVariables_418 (def :  pcf.LargeLossThresholdInputSet) : void {
      def.refreshVariables(policyType, ccThreshold, psThreshold)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      policyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'initialValue' attribute on Variable at KeyMetrics.pcf: line 15, column 26
    function initialValue_0 () : PolicyType {
      return typekey.PolicyType.TC_PERSONALAUTO
    }
    
    // 'initialValue' attribute on Variable at KeyMetrics.pcf: line 19, column 34
    function initialValue_1 () : LargeLossThreshold {
      return getThreshold(LargeLossNotificationType.TC_CC)
    }
    
    // 'initialValue' attribute on Variable at KeyMetrics.pcf: line 23, column 34
    function initialValue_2 () : LargeLossThreshold {
      return getThreshold(LargeLossNotificationType.TC_PS)
    }
    
    // 'initialValue' attribute on Variable at KeyMetrics.pcf: line 27, column 45
    function initialValue_3 () : entity.PolicyTypeMetricLimits {
      return PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType).ensureDefaultLimitsCreated()
    }
    
    // 'initialValue' attribute on Variable at KeyMetrics.pcf: line 31, column 19
    function initialValue_4 () : int {
      return 1000
    }
    
    // EditButtons at KeyMetrics.pcf: line 34, column 23
    function label_5 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onChange' attribute on PostOnChange at KeyMetrics.pcf: line 45, column 45
    function onChange_6 () : void {
      policyTypeChanged()
    }
    
    // Page (id=KeyMetrics) at KeyMetrics.pcf: line 9, column 62
    static function parent_421 () : pcf.api.Destination {
      return pcf.BusinessSettings.createDestination()
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function valueRange_12 () : java.lang.Object {
      return typekey.PolicyType.getTypeKeys( false )
    }
    
    // 'value' attribute on RowIterator (id=ClaimMetricLimitCategoryIterator) at KeyMetrics.pcf: line 93, column 59
    function value_217 () : typekey.ClaimMetricCategory[] {
      return ClaimMetricCategory.getTypeKeys(false).toTypedArray()
    }
    
    // 'value' attribute on RowIterator (id=ExposureMetricDefaultLimitIterator) at KeyMetrics.pcf: line 255, column 58
    function value_416 () : entity.ExposureMetricLimit[] {
      return limits.ExposureMetricLimits.where(\ l -> l.DefaultLimit).sortBy(\ l -> l.ExposureMetricType)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function value_8 () : typekey.PolicyType {
      return policyType
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function verifyValueRangeIsAllowedType_13 ($$arg :  typekey.PolicyType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=PolicyType) at KeyMetrics.pcf: line 43, column 42
    function verifyValueRange_14 () : void {
      var __valueRangeArg = typekey.PolicyType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.KeyMetrics {
      return super.CurrentLocation as pcf.KeyMetrics
    }
    
    property get MAX_METRIC_DAYS () : int {
      return getVariableValue("MAX_METRIC_DAYS", 0) as java.lang.Integer
    }
    
    property set MAX_METRIC_DAYS ($arg :  int) {
      setVariableValue("MAX_METRIC_DAYS", 0, $arg)
    }
    
    property get ccThreshold () : LargeLossThreshold {
      return getVariableValue("ccThreshold", 0) as LargeLossThreshold
    }
    
    property set ccThreshold ($arg :  LargeLossThreshold) {
      setVariableValue("ccThreshold", 0, $arg)
    }
    
    property get limits () : entity.PolicyTypeMetricLimits {
      return getVariableValue("limits", 0) as entity.PolicyTypeMetricLimits
    }
    
    property set limits ($arg :  entity.PolicyTypeMetricLimits) {
      setVariableValue("limits", 0, $arg)
    }
    
    property get policyType () : PolicyType {
      return getVariableValue("policyType", 0) as PolicyType
    }
    
    property set policyType ($arg :  PolicyType) {
      setVariableValue("policyType", 0, $arg)
    }
    
    property get psThreshold () : LargeLossThreshold {
      return getVariableValue("psThreshold", 0) as LargeLossThreshold
    }
    
    property set psThreshold ($arg :  LargeLossThreshold) {
      setVariableValue("psThreshold", 0, $arg)
    }
    
    function policyTypeChanged() {
      limits = PolicyTypeMetricLimits.cache.limitsForPolicyType(policyType).ensureDefaultLimitsCreated()
      initThresholds()
    }
    
    function getThreshold(type : LargeLossNotificationType) : LargeLossThreshold {
      var result = LargeLossThreshold.getThreshold( policyType, type )
      if (result == null) {
        result = new LargeLossThreshold()
        result.PolicyType = policyType
        result.NotificationType = type
      }
      return result
    }
    
    function initThresholds() {
      ccThreshold = getThreshold(LargeLossNotificationType.TC_CC)
      psThreshold = getThreshold(LargeLossNotificationType.TC_PS)
    }
    
    function getClaimTiersWithNoLimit(defaultLimit : ClaimMetricLimit) : ClaimTier[] {
      var existingTiers = defaultLimit.PolicyTypeMetricLimits.ClaimMetricLimits
              .where(\l -> l != defaultLimit and l.ClaimMetricType == defaultLimit.ClaimMetricType and l.ClaimTier != null and l.Currency == defaultLimit.Currency)
              .map(\l -> l.ClaimTier)
              .toSet()
      return ClaimTier.getTypeKeys(false)
              .where(\ t -> t.hasCategory(defaultLimit.PolicyTypeMetricLimits.PolicyType) and not existingTiers.contains(t))
              .toTypedArray()
    }
    
    function getSortedClaimMetricLimits(category : ClaimMetricCategory, defaultLimit : ClaimMetricLimit) : ClaimMetricLimit[] {
      return limits.ClaimMetricLimits.where(\ l -> l.ClaimMetricCategory == category 
                                               and l.ClaimMetricType == defaultLimit.ClaimMetricType 
                                               and not l.DefaultLimit 
                                               and l.Currency == defaultLimit.Currency)
                                     .sortBy(\ l -> l.ClaimTier)  
    }
    
    function getExposureTiersWithNoLimit(defaultLimit : ExposureMetricLimit) : ExposureTier[] {
      var existingTiers = defaultLimit.PolicyTypeMetricLimits.ExposureMetricLimits
              .where(\l -> l != defaultLimit and l.ExposureMetricType == defaultLimit.ExposureMetricType and l.ExposureTier != null and l.Currency == defaultLimit.Currency)
              .map(\l -> l.ExposureTier)
              .toSet()
      return ExposureTier.getTypeKeys(false)
              .where(\ t -> t.hasCategory(defaultLimit.PolicyTypeMetricLimits.PolicyType) and not existingTiers.contains(t))
              .toTypedArray()
    }
    
    function getSortedExposureMetricLimits(defaultLimit : ExposureMetricLimit) : ExposureMetricLimit[] {
      return limits.ExposureMetricLimits.where(\ l -> l.ExposureMetricType == defaultLimit.ExposureMetricType 
                                               and not l.DefaultLimit 
                                               and l.Currency == defaultLimit.Currency)
                                     .sortBy(\ l -> l.ExposureTier)  
    }
    
    /**
     * Ensure that the input is valid for the given metric.
     */
    function validateMetricInput(input:gw.api.metric.EditableMetricLimitValue, metricLimit:ClaimMetricLimit) : String {
      var validationResult:String = null
      switch(metricLimit.Unit) {
        case MetricUnit.TC_DAYS:
            if(input.IntegerValue > MAX_METRIC_DAYS) {
              validationResult = DisplayKey.get("Web.Admin.KeyMetrics.Input.MaxDaysExceeded", MAX_METRIC_DAYS, metricLimit.ClaimMetricType)
            }
      }
      return validationResult
    }
    
    function validateMetricInput(input:gw.api.metric.EditableMetricLimitValue, metricLimit:ExposureMetricLimit) : String {
      var validationResult:String = null
      switch(metricLimit.Unit) {
            case MetricUnit.TC_DAYS:
            if(input.IntegerValue > MAX_METRIC_DAYS) {
              validationResult = DisplayKey.get("Web.Admin.KeyMetrics.Input.MaxDaysExceeded", MAX_METRIC_DAYS, metricLimit.ExposureMetricType)
            }
      }
      return validationResult
    }
    
    
  }
  
  
}