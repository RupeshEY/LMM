package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryHeadlinePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSummaryHeadlinePanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryHeadlinePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryHeadlinePanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ViewClaimOtherInstructions) at ClaimSummaryHeadlinePanelSet.pcf: line 58, column 42
    function action_25 () : void {
      ClaimOtherInstructionWorksheet.goInWorkspace(claim)
    }
    
    // 'action' attribute on Link (id=ViewClaimOtherInstructions) at ClaimSummaryHeadlinePanelSet.pcf: line 58, column 42
    function action_dest_26 () : pcf.api.Destination {
      return pcf.ClaimOtherInstructionWorksheet.createDestination(claim)
    }
    
    // 'highInclusive' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function highInclusive_4 () : java.lang.Boolean {
      return !onlyTargetValueExists(claim.DaysOpenClaimMetric.Limit)
    }
    
    // 'highThreshold' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function highThreshold_5 () : java.lang.Double {
      return HighThreshold
    }
    
    // 'icon' attribute on Link (id=EmployerThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 67, column 78
    function icon_29 () : java.lang.String {
      return claim.getWCContactEmployerActivityStatus().First
    }
    
    // 'icon' attribute on Link (id=EmployeeThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 71, column 78
    function icon_31 () : java.lang.String {
      return claim.getWCContactEmployeeActivityStatus().First
    }
    
    // 'icon' attribute on Link (id=MedicalProviderThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 75, column 81
    function icon_33 () : java.lang.String {
      return claim.getWCContactMedProviderActivityStatus().First
    }
    
    // 'icon' attribute on Link (id=PieChartIcon) at ClaimSummaryHeadlinePanelSet.pcf: line 95, column 36
    function icon_37 () : java.lang.String {
      return gw.api.financials.FinancialsPieChartIconUtil.getFinancialsPercentageIcon(claim)
    }
    
    // 'label' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function label_1 () : java.lang.Object {
      return claim.State.DisplayName
    }
    
    // 'lowInclusive' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function lowInclusive_6 () : java.lang.Boolean {
      return noYellowValueExists(claim.DaysOpenClaimMetric.Limit)
    }
    
    // 'lowThreshold' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function lowThreshold_7 () : java.lang.Double {
      return LowThreshold
    }
    
    // 'percentage' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function percentage_8 () : java.lang.Double {
      return DaysOpenPercentage
    }
    
    // 'status' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function status_9 () : java.lang.String {
      return OpenStatus
    }
    
    // 'tooltip' attribute on Link (id=EmployerThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 67, column 78
    function tooltip_30 () : java.lang.String {
      return claim.getWCContactEmployerActivityStatus().Second
    }
    
    // 'tooltip' attribute on Link (id=EmployeeThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 71, column 78
    function tooltip_32 () : java.lang.String {
      return claim.getWCContactEmployeeActivityStatus().Second
    }
    
    // 'tooltip' attribute on Link (id=MedicalProviderThreePointContact) at ClaimSummaryHeadlinePanelSet.pcf: line 75, column 81
    function tooltip_34 () : java.lang.String {
      return claim.getWCContactMedProviderActivityStatus().Second
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSummaryHeadlinePanelSet.pcf: line 49, column 55
    function valueRoot_24 () : java.lang.Object {
      return claim
    }
    
    // 'value' attribute on TextInput (id=Paid) at ClaimSummaryHeadlinePanelSet.pcf: line 106, column 64
    function valueRoot_42 () : java.lang.Object {
      return claim.TotalPaidClaimMetric
    }
    
    // 'value' attribute on TextInput (id=DaysOpenText) at ClaimSummaryHeadlinePanelSet.pcf: line 36, column 60
    function value_11 () : java.lang.String {
      return DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimOpenWithState",  claim.State.DisplayName, OpenStatus)
    }
    
    // 'value' attribute on TextInput (id=ClaimClosedText) at ClaimSummaryHeadlinePanelSet.pcf: line 41, column 39
    function value_16 () : java.lang.String {
      return getClaimClosedText()
    }
    
    // 'value' attribute on TextAreaInput (id=Description) at ClaimSummaryHeadlinePanelSet.pcf: line 49, column 55
    function value_21 () : java.lang.String {
      return claim.Description
    }
    
    // 'value' attribute on TextInput (id=TotalGrossIncurred) at ClaimSummaryHeadlinePanelSet.pcf: line 102, column 101
    function value_38 () : java.lang.String {
      return gw.api.util.CurrencyUtil.renderAsCurrency(claim.ClaimRpt.TotalIncurredGross)
    }
    
    // 'value' attribute on TextInput (id=Paid) at ClaimSummaryHeadlinePanelSet.pcf: line 106, column 64
    function value_40 () : java.lang.String {
      return claim.TotalPaidClaimMetric.DisplayValue
    }
    
    // 'value' attribute on TextInput (id=Recovered) at ClaimSummaryHeadlinePanelSet.pcf: line 110, column 98
    function value_43 () : java.lang.String {
      return gw.api.util.CurrencyUtil.renderAsCurrency(claim.ClaimRpt.TotalRecoveries)
    }
    
    // 'value' attribute on InputIterator (id=DeductibleIterator) at ClaimSummaryHeadlinePanelSet.pcf: line 115, column 47
    function value_48 () : entity.Deductible[] {
      return claim.getDeductibles()
    }
    
    // 'value' attribute on InputIterator (id=RiskIndicatorIterator) at ClaimSummaryHeadlinePanelSet.pcf: line 137, column 51
    function value_52 () : entity.ClaimIndicator[] {
      return claim.ClaimIndicators.where( \ c -> c.IsOn).orderBy( \ e -> ((e.Subtype.Priority) as java.lang.Comparable<java.lang.Object>)).toTypedArray()
    }
    
    // 'visible' attribute on BarInput (id=DaysOpenProgressBar) at ClaimSummaryHeadlinePanelSet.pcf: line 31, column 59
    function visible_0 () : java.lang.Boolean {
      return !claim.Closed and showBarInput()
    }
    
    // 'visible' attribute on TextInput (id=DaysOpenText) at ClaimSummaryHeadlinePanelSet.pcf: line 36, column 60
    function visible_10 () : java.lang.Boolean {
      return !claim.Closed and !showBarInput()
    }
    
    // 'visible' attribute on TextInput (id=ClaimClosedText) at ClaimSummaryHeadlinePanelSet.pcf: line 41, column 39
    function visible_14 () : java.lang.Boolean {
      return claim.Closed
    }
    
    // 'visible' attribute on TextAreaInput (id=Description) at ClaimSummaryHeadlinePanelSet.pcf: line 49, column 55
    function visible_20 () : java.lang.Boolean {
      return claim.Description.HasContent
    }
    
    // 'visible' attribute on ContentInput at ClaimSummaryHeadlinePanelSet.pcf: line 53, column 54
    function visible_27 () : java.lang.Boolean {
      return claim.hasOtherInstructions()
    }
    
    // 'visible' attribute on ContentInput (id=ThreePointContactIcons) at ClaimSummaryHeadlinePanelSet.pcf: line 63, column 110
    function visible_35 () : java.lang.Boolean {
      return claim.LossType == LossType.TC_WC and claim.shouldShowWCThreePointContactActivities()
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get DaysOpenPercentage() : java.lang.Double {
      var limit = claim.DaysOpenClaimMetric.Limit
      var daysOpen = claim.DaysOpenClaimMetric.Value as java.lang.Integer
      var result : java.lang.Double = null
      if (limit != null) {
        if (limit.RedValue != null) {
          result = calculatePercentageValue(daysOpen, limit.RedValue)
        } else if (limit.YellowValue != null) {
          result = calculatePercentageValue(daysOpen, limit.YellowValue )
        } else if (limit.TargetValue != null) {
          result = calculatePercentageValue(daysOpen, limit.TargetValue )
        }
      }
      return result
    }
    
    property get LowThreshold() : java.lang.Double {
      var limit = claim.DaysOpenClaimMetric.Limit
      var threshold : java.lang.Double = null
      if (limit != null) {
        if (limit.YellowValue != null and limit.RedValue != null) {
          threshold = (new java.math.BigDecimal(limit.YellowValue as java.lang.Integer)).divide(new java.math.BigDecimal(limit.RedValue as java.lang.Integer), 2, gw.api.util.CurrencyUtil.getRoundingMode()).multiply( 100 ).doubleValue()
        } else {
          threshold = MaxPercentage
        } 
      }
      return threshold
    }
    
    property get HighThreshold() : java.lang.Double {
      var limit = claim.DaysOpenClaimMetric.Limit
      var threshold : java.lang.Double = null
      if (limit != null) {
        if (limit.RedValue != null or onlyTargetValueExists(limit)) {
          //when both yellow and red value is null but target is not null, set high threshold to 100
          //this is done so that the progress bar can show green color
          threshold = MaxPercentage
        }
      }
      return threshold
    }
    
    property get OpenStatus() : String {
      var status : String = null
      var limit = claim.DaysOpenClaimMetric.Limit
      var value = claim.DaysOpenClaimMetric.Value
      if (value == (1 as java.lang.Comparable<java.lang.Object>)) {
        if (limit.TargetValue != null and limit.TargetValue != (0 as java.lang.Comparable<java.lang.Object>)) {
          status = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimOpenStringSingularWithTarget", value, limit.TargetValue )
        } else {
          status = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimOpenStringSingular", value )
        }
      } else {
        if (limit.TargetValue != null and limit.TargetValue != (0 as java.lang.Comparable<java.lang.Object>)) {
          status = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimOpenStringPluralWithTarget", value, limit.TargetValue )
        } else {
          status = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimOpenStringPlural", value )
        }
      }
      return status
    }
    
    function showBarInput() : boolean {
      var limit = claim.DaysOpenClaimMetric.Limit
      if (limit != null) {
        //if any of the red/yellow/target value is not null and not 0, show the progressbar
        if ((limit.RedValue != null and limit.RedValue != (0 as java.lang.Comparable<java.lang.Object>)) 
            or (limit.TargetValue != null and limit.TargetValue != (0 as java.lang.Comparable<java.lang.Object>))
            or (limit.YellowValue != null and limit.YellowValue != (0 as java.lang.Comparable<java.lang.Object>))) {
          return true
        }
      }
      return false
    }
    
    function getClaimClosedText() : String {
      var text : String = null
      var closeDate = claim.CloseDate == null ? DisplayKey.get("Web.NA") : claim.CloseDate.format(gw.api.util.LocaleUtil.getCurrentLocale().DateFormat.Short)
      if (claim.DaysOpenClaimMetric.Value == (1 as java.lang.Comparable<java.lang.Object>)) {
        text = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimClosedStringSingular", closeDate , claim.DaysOpenClaimMetric.Value) 
      } else {
        text = DisplayKey.get("Web.ClaimSummary.Headline.Basics.ClaimClosedStringPlural", closeDate , claim.DaysOpenClaimMetric.Value)
      }
      return text
    }
    
    private function calculatePercentageValue(value : java.lang.Integer, threshold : java.lang.Comparable) : java.lang.Double {
      var result : java.lang.Double = null
      if (value >= threshold) {
        result = MaxPercentage
      } else {
        result = (new java.math.BigDecimal(value)).divide(new java.math.BigDecimal(threshold as java.lang.Integer), 2, gw.api.util.CurrencyUtil.getRoundingMode() ).multiply( 100 ).doubleValue()
      }
      return result
    }
    
    function onlyTargetValueExists(limit : gw.api.metric.MetricLimitMethods ) : boolean {
     return limit.YellowValue == null and limit.RedValue == null and limit.TargetValue != null
    }
    
    function noYellowValueExists(limit : gw.api.metric.MetricLimitMethods) : boolean {
      return limit.YellowValue == null
    }
    
    property get MaxPercentage() : java.lang.Double {
      return 100
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryHeadlinePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSummaryHeadlinePanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'icon' attribute on Link (id=IndicatorIcon) at ClaimSummaryHeadlinePanelSet.pcf: line 143, column 116
    function icon_49 () : java.lang.String {
      return indicator.Icon
    }
    
    // 'label' attribute on Link (id=IndicatorText) at ClaimSummaryHeadlinePanelSet.pcf: line 146, column 43
    function label_51 () : java.lang.Object {
      return indicator.Text
    }
    
    // 'tooltip' attribute on Link (id=IndicatorIcon) at ClaimSummaryHeadlinePanelSet.pcf: line 143, column 116
    function tooltip_50 () : java.lang.String {
      return not (indicator typeis SubrogationClaimIndicator) ? indicator.HoverText : ""
    }
    
    property get indicator () : entity.ClaimIndicator {
      return getIteratedValue(1) as entity.ClaimIndicator
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/summary/ClaimSummaryHeadlinePanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSummaryHeadlinePanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=DeductibleInput) at ClaimSummaryHeadlinePanelSet.pcf: line 119, column 51
    function valueRoot_47 () : java.lang.Object {
      return deductible
    }
    
    // 'value' attribute on TextInput (id=DeductibleInput) at ClaimSummaryHeadlinePanelSet.pcf: line 119, column 51
    function value_45 () : java.lang.String {
      return deductible.DisplayAmount
    }
    
    property get deductible () : entity.Deductible {
      return getIteratedValue(1) as entity.Deductible
    }
    
    
  }
  
  
}