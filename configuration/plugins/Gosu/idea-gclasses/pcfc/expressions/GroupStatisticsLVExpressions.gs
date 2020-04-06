package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class GroupStatisticsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupStatisticsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at GroupStatisticsLV.pcf: line 20, column 23
    function initialValue_0 () : boolean {
      return gw.api.system.CCConfigParameters.WeightedAssignmentEnabled.Value and perm.System.wwlview
    }
    
    // 'label' attribute on RowIterator at GroupStatisticsLV.pcf: line 251, column 23
    function label_5 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Claims.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Claims.Open")
    }
    
    // 'label' attribute on RowIterator at GroupStatisticsLV.pcf: line 298, column 23
    function label_6 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Exposures.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Exposures.Open")
    }
    
    // 'label' attribute on RowIterator at GroupStatisticsLV.pcf: line 317, column 23
    function label_7 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Matters.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Matters.Open")
    }
    
    // 'label' attribute on RowIterator at GroupStatisticsLV.pcf: line 336, column 23
    function label_8 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Activities.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Activities.Open")
    }
    
    // 'label' attribute on RowIterator at GroupStatisticsLV.pcf: line 363, column 53
    function label_9 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.GroupStatistics.Subrogations.ActiveClaimExposure", DisplayKey.get("Web.Admin.GroupStatistics.Subrogations.Active"), DisplayKey.get("LV.Admin.GroupStatistics.Claims"), DisplayKey.get("LV.Admin.GroupStatistics.Exposures"))
    }
    
    // '$$sumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 251, column 23
    function sumValueRoot_13 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 231, column 23
    function sumValue_10 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return isWeightedWorkloadVisible ? Statistics.TotalWorkload : null
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 241, column 23
    function sumValue_11 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return isWeightedWorkloadVisible ? Statistics.ClaimsWorkload : null
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 251, column 23
    function sumValue_12 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.OpenClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 260, column 23
    function sumValue_14 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.FlaggedClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 269, column 23
    function sumValue_16 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.NewClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 278, column 23
    function sumValue_18 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.ClosedClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 288, column 23
    function sumValue_20 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return isWeightedWorkloadVisible ? Statistics.ExposuresWorkload : null
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 298, column 23
    function sumValue_21 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.OpenExposures
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 307, column 23
    function sumValue_23 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.ClosedExposures
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 317, column 23
    function sumValue_25 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.OpenMatters
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 326, column 23
    function sumValue_27 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.ClosedMatters
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 336, column 23
    function sumValue_29 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.OpenActivities
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 345, column 23
    function sumValue_31 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.OverdueActivities
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 354, column 24
    function sumValue_33 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.CompletedActivities
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 363, column 53
    function sumValue_35 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.ActiveSubrogations
    }
    
    // 'footerSumValue' attribute on RowIterator at GroupStatisticsLV.pcf: line 371, column 42
    function sumValue_37 (Statistics :  gw.api.statistics.Statistics) : java.lang.Object {
      return Statistics.ClosedSubrogations
    }
    
    // 'tooltip' attribute on BooleanRadioCell (id=Claims_OpenHeader1) at GroupStatisticsLV.pcf: line 91, column 21
    function tooltip_1 () : java.lang.String {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Claims.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Claims.Open")
    }
    
    // 'tooltip' attribute on BooleanRadioCell (id=Exposures_OpenHeader1) at GroupStatisticsLV.pcf: line 136, column 21
    function tooltip_2 () : java.lang.String {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Exposures.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Exposures.Open")
    }
    
    // 'tooltip' attribute on BooleanRadioCell (id=Matters_OpenHeader1) at GroupStatisticsLV.pcf: line 154, column 21
    function tooltip_3 () : java.lang.String {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Matters.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Matters.Open")
    }
    
    // 'tooltip' attribute on BooleanRadioCell (id=Activities_OpenHeader1) at GroupStatisticsLV.pcf: line 172, column 21
    function tooltip_4 () : java.lang.String {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Activities.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Activities.Open")
    }
    
    // 'value' attribute on RowIterator at GroupStatisticsLV.pcf: line 212, column 50
    function value_100 () : gw.api.statistics.Statistics[] {
      return StatisticsList
    }
    
    property get StatisticsList () : gw.api.statistics.Statistics[] {
      return getRequireValue("StatisticsList", 0) as gw.api.statistics.Statistics[]
    }
    
    property set StatisticsList ($arg :  gw.api.statistics.Statistics[]) {
      setRequireValue("StatisticsList", 0, $arg)
    }
    
    property get TeamGroupSummary () : gw.api.team.TeamGroupStatisticsHelper {
      return getRequireValue("TeamGroupSummary", 0) as gw.api.team.TeamGroupStatisticsHelper
    }
    
    property set TeamGroupSummary ($arg :  gw.api.team.TeamGroupStatisticsHelper) {
      setRequireValue("TeamGroupSummary", 0, $arg)
    }
    
    property get isWeightedWorkloadVisible () : boolean {
      return getVariableValue("isWeightedWorkloadVisible", 0) as java.lang.Boolean
    }
    
    property set isWeightedWorkloadVisible ($arg :  boolean) {
      setVariableValue("isWeightedWorkloadVisible", 0, $arg)
    }
    
    property get naWeightedWorkloadValue () : String {
      return getVariableValue("naWeightedWorkloadValue", 0) as String
    }
    
    property set naWeightedWorkloadValue ($arg :  String) {
      setVariableValue("naWeightedWorkloadValue", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/team/summary/GroupStatisticsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends GroupStatisticsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextCell (id=Claims_Open) at GroupStatisticsLV.pcf: line 251, column 23
    function label_48 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Claims.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Claims.Open")
    }
    
    // 'label' attribute on TextCell (id=Exposures_Open) at GroupStatisticsLV.pcf: line 298, column 23
    function label_65 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Exposures.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Exposures.Open")
    }
    
    // 'label' attribute on TextCell (id=Matters_Open) at GroupStatisticsLV.pcf: line 317, column 23
    function label_73 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Matters.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Matters.Open")
    }
    
    // 'label' attribute on TextCell (id=Activities_Open) at GroupStatisticsLV.pcf: line 336, column 23
    function label_81 () : java.lang.Object {
      return TeamGroupSummary.canShowGlobalWorkloadStats() ? DisplayKey.get("Web.Admin.GroupStatistics.Activities.OpenGlobal") : DisplayKey.get("Web.Admin.GroupStatistics.Activities.Open")
    }
    
    // 'label' attribute on TextCell (id=Subrogations_Active) at GroupStatisticsLV.pcf: line 363, column 53
    function label_92 () : java.lang.Object {
      return DisplayKey.get("Web.Admin.GroupStatistics.Subrogations.ActiveClaimExposure", DisplayKey.get("Web.Admin.GroupStatistics.Subrogations.Active"), DisplayKey.get("LV.Admin.GroupStatistics.Claims"), DisplayKey.get("LV.Admin.GroupStatistics.Exposures"))
    }
    
    // 'outputConversion' attribute on TextCell (id=Name) at GroupStatisticsLV.pcf: line 221, column 53
    function outputConversion_40 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return TeamGroupSummary.getDisplayValue(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=User_Workload_Enabled) at GroupStatisticsLV.pcf: line 231, column 23
    function outputConversion_43 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return isWeightedWorkloadVisible ? VALUE.TotalWorkload as String : "-"
    }
    
    // 'outputConversion' attribute on TextCell (id=Claims_Workload_Enabled) at GroupStatisticsLV.pcf: line 241, column 23
    function outputConversion_46 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return isWeightedWorkloadVisible ? VALUE.ClaimsWorkload as String : "-"
    }
    
    // 'outputConversion' attribute on TextCell (id=Claims_Open) at GroupStatisticsLV.pcf: line 251, column 23
    function outputConversion_51 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return TeamGroupSummary.getOpenClaimCount(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposures_Workload_Enabled) at GroupStatisticsLV.pcf: line 288, column 23
    function outputConversion_63 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return isWeightedWorkloadVisible ? VALUE.ExposuresWorkload as String: "-"
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposures_Open) at GroupStatisticsLV.pcf: line 298, column 23
    function outputConversion_68 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return TeamGroupSummary.getOpenExposureCount(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=Matters_Open) at GroupStatisticsLV.pcf: line 317, column 23
    function outputConversion_76 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return TeamGroupSummary.getOpenMatterCount(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=Activities_Open) at GroupStatisticsLV.pcf: line 336, column 23
    function outputConversion_84 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return TeamGroupSummary.getOpenActivityCount(VALUE)
    }
    
    // 'outputConversion' attribute on TextCell (id=Subrogations_Active) at GroupStatisticsLV.pcf: line 363, column 53
    function outputConversion_95 (VALUE :  gw.api.statistics.Statistics) : java.lang.String {
      return DisplayKey.get("Web.Admin.GroupStatistics.Subrogations.ActiveClaimExposure", Statistics.ActiveSubrogations, Statistics.ActiveClaimSubrogations, Statistics.ActiveExposureSubrogations)
    }
    
    // 'value' attribute on TextCell (id=Claims_Flagged) at GroupStatisticsLV.pcf: line 260, column 23
    function valueRoot_55 () : java.lang.Object {
      return Statistics
    }
    
    // 'value' attribute on TextCell (id=Name) at GroupStatisticsLV.pcf: line 221, column 53
    function value_39 () : gw.api.statistics.Statistics {
      return Statistics
    }
    
    // 'value' attribute on TextCell (id=Claims_Flagged) at GroupStatisticsLV.pcf: line 260, column 23
    function value_53 () : java.lang.Integer {
      return Statistics.FlaggedClaims
    }
    
    // 'value' attribute on TextCell (id=Claims_New) at GroupStatisticsLV.pcf: line 269, column 23
    function value_56 () : java.lang.Integer {
      return Statistics.NewClaims
    }
    
    // 'value' attribute on TextCell (id=Claims_Closed) at GroupStatisticsLV.pcf: line 278, column 23
    function value_59 () : java.lang.Integer {
      return Statistics.ClosedClaims
    }
    
    // 'value' attribute on TextCell (id=Exposures_Closed) at GroupStatisticsLV.pcf: line 307, column 23
    function value_70 () : java.lang.Integer {
      return Statistics.ClosedExposures
    }
    
    // 'value' attribute on TextCell (id=Matters_Closed) at GroupStatisticsLV.pcf: line 326, column 23
    function value_78 () : java.lang.Integer {
      return Statistics.ClosedMatters
    }
    
    // 'value' attribute on TextCell (id=Activities_Overdue) at GroupStatisticsLV.pcf: line 345, column 23
    function value_86 () : java.lang.Integer {
      return Statistics.OverdueActivities
    }
    
    // 'value' attribute on TextCell (id=Activities_Completed) at GroupStatisticsLV.pcf: line 354, column 24
    function value_89 () : java.lang.Integer {
      return Statistics.CompletedActivities
    }
    
    // 'value' attribute on TextCell (id=Subrogations_Closed) at GroupStatisticsLV.pcf: line 371, column 42
    function value_97 () : java.lang.Integer {
      return Statistics.ClosedSubrogations
    }
    
    property get Statistics () : gw.api.statistics.Statistics {
      return getIteratedValue(1) as gw.api.statistics.Statistics
    }
    
    
  }
  
  
}