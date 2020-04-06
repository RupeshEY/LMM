package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ArchiveInfoByDateRangeExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/ArchiveInfoByDateRange.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveInfoByDateRangeExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (archiveCountSummaryByDatamodelVersion :  gw.api.archiving.ArchiveCountSummaryByDatamodelVersion, beginTime :  java.util.Date, endTime :  java.util.Date) : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=Search) at ArchiveInfoByDateRange.pcf: line 67, column 83
    function action_12 () : void {
      archiveCountSummaryByDateRange.BeginTime = beginTime; archiveCountSummaryByDateRange.EndTime = endTime
    }
    
    // 'action' attribute on ButtonInput (id=ResetExcludedBecauseOfRules) at ArchiveInfoByDateRange.pcf: line 97, column 86
    function action_20 () : void {
      archiveCountSummaryByDateRange.resetExcludedBecauseOfRulesFlag()
    }
    
    // 'action' attribute on ButtonInput (id=ResetExcludedBecauseOfFailure) at ArchiveInfoByDateRange.pcf: line 113, column 86
    function action_25 () : void {
      archiveCountSummaryByDateRange.resetExcludedBecauseOfFailureFlag()
    }
    
    // 'action' attribute on ButtonInput (id=BackButton) at ArchiveInfoByDateRange.pcf: line 39, column 152
    function action_3 () : void {
      ArchiveInfo.go()
    }
    
    // 'action' attribute on ButtonInput (id=BackButton) at ArchiveInfoByDateRange.pcf: line 39, column 152
    function action_dest_4 () : pcf.api.Destination {
      return pcf.ArchiveInfo.createDestination()
    }
    
    // 'available' attribute on ButtonInput (id=ResetExcludedBecauseOfRules) at ArchiveInfoByDateRange.pcf: line 97, column 86
    function available_18 () : java.lang.Boolean {
      return archiveCountSummaryByDateRange.getExcludedBecauseOfRulesCount() > 0
    }
    
    // 'available' attribute on ButtonInput (id=ResetExcludedBecauseOfFailure) at ArchiveInfoByDateRange.pcf: line 113, column 86
    function available_23 () : java.lang.Boolean {
      return archiveCountSummaryByDateRange.getExcludedBecauseOfFailureCount() > 0
    }
    
    // 'available' attribute on PanelRef at ArchiveInfoByDateRange.pcf: line 121, column 64
    function available_26 () : java.lang.Boolean {
      return archiveCountSummaryByDateRange.canQuery()
    }
    
    // 'def' attribute on PanelRef at ArchiveInfoByDateRange.pcf: line 121, column 64
    function def_onEnter_28 (def :  pcf.ArchiveExcludeDetailsCV) : void {
      def.onEnter(archiveCountSummaryByDateRange)
    }
    
    // 'def' attribute on PanelRef at ArchiveInfoByDateRange.pcf: line 121, column 64
    function def_refreshVariables_29 (def :  pcf.ArchiveExcludeDetailsCV) : void {
      def.refreshVariables(archiveCountSummaryByDateRange)
    }
    
    // 'value' attribute on DateInput (id=EndTime) at ArchiveInfoByDateRange.pcf: line 60, column 30
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      endTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=BeginTime) at ArchiveInfoByDateRange.pcf: line 50, column 32
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      beginTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at ArchiveInfoByDateRange.pcf: line 26, column 63
    function initialValue_0 () : gw.api.archiving.ArchiveCountSummaryByDateRange {
      return new gw.api.archiving.ArchiveCountSummaryByDateRange(archiveCountSummaryByDatamodelVersion, beginTime, endTime)
    }
    
    // 'parent' attribute on Page (id=ArchiveInfoByDateRange) at ArchiveInfoByDateRange.pcf: line 11, column 86
    static function parent_32 (archiveCountSummaryByDatamodelVersion :  gw.api.archiving.ArchiveCountSummaryByDatamodelVersion, beginTime :  java.util.Date, endTime :  java.util.Date) : pcf.api.Destination {
      return pcf.ArchiveInfo.createDestination()
    }
    
    // 'title' attribute on TitleBar at ArchiveInfoByDateRange.pcf: line 30, column 142
    function title_1 () : java.lang.String {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.ArchiveInfoFor", archiveCountSummaryByDatamodelVersion.VersionString)
    }
    
    // 'value' attribute on TextInput (id=Archived) at ArchiveInfoByDateRange.pcf: line 81, column 46
    function valueRoot_15 () : java.lang.Object {
      return archiveCountSummaryByDateRange
    }
    
    // 'value' attribute on TextInput (id=Archived) at ArchiveInfoByDateRange.pcf: line 81, column 46
    function value_13 () : java.lang.Integer {
      return archiveCountSummaryByDateRange.ArchivedCount
    }
    
    // 'value' attribute on TextInput (id=ExcludedBecauseOfRules) at ArchiveInfoByDateRange.pcf: line 88, column 46
    function value_16 () : java.lang.Integer {
      return archiveCountSummaryByDateRange.getExcludedBecauseOfRulesCount()
    }
    
    // 'value' attribute on ButtonInput (id=BackButton) at ArchiveInfoByDateRange.pcf: line 39, column 152
    function value_2 () : java.lang.String {
      return DisplayKey.get("Web.ServerTools.ArchiveInfo.Back", DisplayKey.get("Web.InternalTools.InfoPages.ArchiveInfo"))
    }
    
    // 'value' attribute on TextInput (id=ExcludedBecauseOfFailure) at ArchiveInfoByDateRange.pcf: line 104, column 46
    function value_21 () : java.lang.Integer {
      return archiveCountSummaryByDateRange.getExcludedBecauseOfFailureCount()
    }
    
    // 'value' attribute on DateInput (id=BeginTime) at ArchiveInfoByDateRange.pcf: line 50, column 32
    function value_6 () : java.util.Date {
      return beginTime
    }
    
    // 'value' attribute on DateInput (id=EndTime) at ArchiveInfoByDateRange.pcf: line 60, column 30
    function value_9 () : java.util.Date {
      return endTime
    }
    
    override property get CurrentLocation () : pcf.ArchiveInfoByDateRange {
      return super.CurrentLocation as pcf.ArchiveInfoByDateRange
    }
    
    property get archiveCountSummaryByDatamodelVersion () : gw.api.archiving.ArchiveCountSummaryByDatamodelVersion {
      return getVariableValue("archiveCountSummaryByDatamodelVersion", 0) as gw.api.archiving.ArchiveCountSummaryByDatamodelVersion
    }
    
    property set archiveCountSummaryByDatamodelVersion ($arg :  gw.api.archiving.ArchiveCountSummaryByDatamodelVersion) {
      setVariableValue("archiveCountSummaryByDatamodelVersion", 0, $arg)
    }
    
    property get archiveCountSummaryByDateRange () : gw.api.archiving.ArchiveCountSummaryByDateRange {
      return getVariableValue("archiveCountSummaryByDateRange", 0) as gw.api.archiving.ArchiveCountSummaryByDateRange
    }
    
    property set archiveCountSummaryByDateRange ($arg :  gw.api.archiving.ArchiveCountSummaryByDateRange) {
      setVariableValue("archiveCountSummaryByDateRange", 0, $arg)
    }
    
    property get beginTime () : java.util.Date {
      return getVariableValue("beginTime", 0) as java.util.Date
    }
    
    property set beginTime ($arg :  java.util.Date) {
      setVariableValue("beginTime", 0, $arg)
    }
    
    property get endTime () : java.util.Date {
      return getVariableValue("endTime", 0) as java.util.Date
    }
    
    property set endTime ($arg :  java.util.Date) {
      setVariableValue("endTime", 0, $arg)
    }
    
    
  }
  
  
}