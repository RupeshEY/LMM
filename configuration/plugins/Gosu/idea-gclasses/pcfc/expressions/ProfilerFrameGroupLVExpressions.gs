package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerFrameGroupLVExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends IteratorEntryExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=reportLink) at ProfilerFrameGroupLV.pcf: line 107, column 40
    function action_48 () : void {
      gw.api.profiler.ProfilerPageHelper.downloadReport(report)
    }
    
    // 'label' attribute on Link (id=reportLink) at ProfilerFrameGroupLV.pcf: line 107, column 40
    function label_49 () : java.lang.Object {
      return report.Name
    }
    
    property get report () : gw.api.profiler.DbmsReportZipProvider {
      return getIteratedValue(2) as gw.api.profiler.DbmsReportZipProvider
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ProfilerFrameGroupLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on IteratorSort at ProfilerFrameGroupLV.pcf: line 101, column 30
    function sortBy_47 (report :  gw.api.profiler.DbmsReportZipProvider) : java.lang.Object {
      return report.Name
    }
    
    // 'value' attribute on TextCell (id=path) at ProfilerFrameGroupLV.pcf: line 24, column 43
    function valueRoot_18 () : java.lang.Object {
      return group.ProfilerTag
    }
    
    // 'value' attribute on TextCell (id=num) at ProfilerFrameGroupLV.pcf: line 29, column 42
    function valueRoot_21 () : java.lang.Object {
      return group
    }
    
    // 'value' attribute on TextCell (id=path) at ProfilerFrameGroupLV.pcf: line 24, column 43
    function value_16 () : java.lang.String {
      return group.ProfilerTag.Name
    }
    
    // 'value' attribute on TextCell (id=num) at ProfilerFrameGroupLV.pcf: line 29, column 42
    function value_19 () : java.lang.Integer {
      return group.FrameCount
    }
    
    // 'value' attribute on TextCell (id=time) at ProfilerFrameGroupLV.pcf: line 36, column 42
    function value_22 () : java.lang.Integer {
      return group.TotalElapsedTime
    }
    
    // 'value' attribute on TextCell (id=meanElapsedTime) at ProfilerFrameGroupLV.pcf: line 43, column 41
    function value_25 () : java.lang.Double {
      return group.MeanElapsedTime
    }
    
    // 'value' attribute on TextCell (id=elapsedTimeSD) at ProfilerFrameGroupLV.pcf: line 50, column 41
    function value_28 () : java.lang.Double {
      return group.StandardDeviationOfElapsedTime
    }
    
    // 'value' attribute on TextCell (id=timePct) at ProfilerFrameGroupLV.pcf: line 56, column 41
    function value_31 () : java.lang.Double {
      return getPercentageTime(group.TotalElapsedTime)
    }
    
    // 'value' attribute on TextCell (id=frameTime) at ProfilerFrameGroupLV.pcf: line 64, column 42
    function value_33 () : java.lang.Integer {
      return group.TotalFrameTime
    }
    
    // 'value' attribute on TextCell (id=meanFrameTime) at ProfilerFrameGroupLV.pcf: line 71, column 41
    function value_36 () : java.lang.Double {
      return group.MeanFrameTime
    }
    
    // 'value' attribute on TextCell (id=frameTimeSD) at ProfilerFrameGroupLV.pcf: line 78, column 41
    function value_39 () : java.lang.Double {
      return group.StandardDeviationOfFrameTime
    }
    
    // 'value' attribute on TextCell (id=frameTimePct) at ProfilerFrameGroupLV.pcf: line 85, column 41
    function value_42 () : java.lang.Double {
      return getPercentageTime(group.TotalFrameTime)
    }
    
    // 'value' attribute on TextCell (id=propsAndCounters) at ProfilerFrameGroupLV.pcf: line 90, column 81
    function value_45 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.getPropertiesAndCountersExcludingTracesString( group )
    }
    
    // 'value' attribute on LinkIterator at ProfilerFrameGroupLV.pcf: line 98, column 65
    function value_50 () : gw.api.profiler.DbmsReportZipProvider[] {
      return gw.api.profiler.ProfilerPageHelper.getDbmsReports( group, profilerDataSource ).toTypedArray()
    }
    
    // 'visible' attribute on TextCell (id=propsAndCounters) at ProfilerFrameGroupLV.pcf: line 90, column 81
    function visible_44 () : java.lang.Boolean {
      return profilerFrameGroupSource.shouldShowPropertiesAndCounters()
    }
    
    property get group () : gw.api.profiler.ProfilerFrameGroup {
      return getIteratedValue(1) as gw.api.profiler.ProfilerFrameGroup
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerFrameGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerFrameGroupLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 24, column 43
    function sortValue_0 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.ProfilerTag.Name
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 29, column 42
    function sortValue_1 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.FrameCount
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 90, column 81
    function sortValue_11 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return gw.api.profiler.ProfilerPageHelper.getPropertiesAndCountersExcludingTracesString( group )
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 36, column 42
    function sortValue_2 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.TotalElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 43, column 41
    function sortValue_3 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.MeanElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 50, column 41
    function sortValue_4 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.StandardDeviationOfElapsedTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 56, column 41
    function sortValue_5 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return getPercentageTime(group.TotalElapsedTime)
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 64, column 42
    function sortValue_6 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.TotalFrameTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 71, column 41
    function sortValue_7 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.MeanFrameTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 78, column 41
    function sortValue_8 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.StandardDeviationOfFrameTime
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 85, column 41
    function sortValue_9 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return getPercentageTime(group.TotalFrameTime)
    }
    
    // '$$sumValue' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 64, column 42
    function sumValueRoot_13 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 64, column 42
    function sumValue_12 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return group.TotalFrameTime
    }
    
    // 'footerSumValue' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 85, column 41
    function sumValue_14 (group :  gw.api.profiler.ProfilerFrameGroup) : java.lang.Object {
      return getPercentageTime(group.TotalFrameTime)
    }
    
    // 'value' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 18, column 56
    function value_51 () : gw.api.profiler.ProfilerFrameGroup[] {
      return profilerFrameGroupSource.FrameGroups
    }
    
    // 'visible' attribute on RowIterator at ProfilerFrameGroupLV.pcf: line 90, column 81
    function visible_10 () : java.lang.Boolean {
      return profilerFrameGroupSource.shouldShowPropertiesAndCounters()
    }
    
    property get profilerDataSource () : gw.api.profiler.ProfilerDataSource {
      return getRequireValue("profilerDataSource", 0) as gw.api.profiler.ProfilerDataSource
    }
    
    property set profilerDataSource ($arg :  gw.api.profiler.ProfilerDataSource) {
      setRequireValue("profilerDataSource", 0, $arg)
    }
    
    property get profilerFrameGroupSource () : gw.api.profiler.ProfilerFrameGroupSource {
      return getRequireValue("profilerFrameGroupSource", 0) as gw.api.profiler.ProfilerFrameGroupSource
    }
    
    property set profilerFrameGroupSource ($arg :  gw.api.profiler.ProfilerFrameGroupSource) {
      setRequireValue("profilerFrameGroupSource", 0, $arg)
    }
    
    
    function getPercentageTime(t : int) : java.lang.Double {
        if (profilerFrameGroupSource.TotalElapsedTime == 0) {
          return 0.0
        }
        return t/ profilerFrameGroupSource.TotalElapsedTime  
      }
          
        
    
    
  }
  
  
}