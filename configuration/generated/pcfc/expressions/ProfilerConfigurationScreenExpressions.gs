package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.NumberFormatException
@javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ProfilerConfigurationScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ProfilerConfigurationScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on BooleanRadioCell (id=IndividualStacks) at ProfilerConfigurationScreen.pcf: line 103, column 35
    function action_38 () : void {
      toggleIndividualStacks( profilerConfig )
    }
    
    // 'action' attribute on BooleanRadioCell (id=StackTraceTracking) at ProfilerConfigurationScreen.pcf: line 112, column 35
    function action_40 () : void {
      toggleStackTraceTracking( profilerConfig )
    }
    
    // 'action' attribute on BooleanRadioCell (id=QueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 124, column 35
    function action_44 () : void {
      toggleQueryOptimizerTracing( profilerConfig )
    }
    
    // 'action' attribute on BooleanRadioCell (id=ExtendedQueryTracing) at ProfilerConfigurationScreen.pcf: line 135, column 35
    function action_49 () : void {
      toggleExtendedQueryTracing( profilerConfig )
    }
    
    // 'action' attribute on BooleanRadioCell (id=DiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 146, column 35
    function action_54 () : void {
      toggleDiffDbmsCounters( profilerConfig )
    }
    
    // 'action' attribute on MenuItem (id=ToggleStackTraceTracking) at ProfilerConfigurationScreen.pcf: line 160, column 285
    function action_60 () : void {
      toggleStackTraceTracking( profilerConfig )
    }
    
    // 'action' attribute on MenuItem (id=ToggleQueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 165, column 100
    function action_63 () : void {
      toggleQueryOptimizerTracing( profilerConfig )
    }
    
    // 'action' attribute on MenuItem (id=ToggleDiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 170, column 98
    function action_66 () : void {
      toggleDiffDbmsCounters( profilerConfig )
    }
    
    // 'action' attribute on MenuItem (id=UpdateDbmsCounters) at ProfilerConfigurationScreen.pcf: line 177, column 141
    function action_69 () : void {
      setDbmsCounterThresholdMs(profilerConfig, getNewDbmsCounterThresholdMs())
    }
    
    // 'action' attribute on MenuItem (id=Delete) at ProfilerConfigurationScreen.pcf: line 182, column 86
    function action_73 () : void {
      disableProfilingFor( profilerConfig )
    }
    
    // 'available' attribute on BooleanRadioCell (id=IndividualStacks) at ProfilerConfigurationScreen.pcf: line 103, column 35
    function available_36 () : java.lang.Boolean {
      return profilerConfig typeis WQProfilerConfig
    }
    
    // 'available' attribute on BooleanRadioCell (id=QueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 124, column 35
    function available_42 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isQueryOptimizerTracingAvailable()
    }
    
    // 'available' attribute on BooleanRadioCell (id=ExtendedQueryTracing) at ProfilerConfigurationScreen.pcf: line 135, column 35
    function available_47 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isExtendedQueryTracingAvailable()
    }
    
    // 'available' attribute on BooleanRadioCell (id=DiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 146, column 35
    function available_52 () : java.lang.Boolean {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=QueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 124, column 35
    function iconLabel_46 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isQueryOptimizerTracingAvailable()?"":DisplayKey.get("Web.Profiler.NotSupportedByDatabase")
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=ExtendedQueryTracing) at ProfilerConfigurationScreen.pcf: line 135, column 35
    function iconLabel_51 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isExtendedQueryTracingAvailable()?"":DisplayKey.get("Web.Profiler.NotSupportedByDatabase")
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=DiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 146, column 35
    function iconLabel_56 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()?"":DisplayKey.get("Web.Profiler.NotSupportedByDatabase")
    }
    
    // 'icon' attribute on BooleanRadioCell (id=IndividualStacks) at ProfilerConfigurationScreen.pcf: line 103, column 35
    function icon_39 () : java.lang.String {
      return (profilerConfig typeis WQProfilerConfig)? ((profilerConfig.IndividualStacks == true)?"profiler_green.png":"profiler_red.png"):"profiler_gray.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=StackTraceTracking) at ProfilerConfigurationScreen.pcf: line 112, column 35
    function icon_41 () : java.lang.String {
      return profilerConfig.StackTraceTracking?"profiler_green.png":"profiler_red.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=QueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 124, column 35
    function icon_45 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isQueryOptimizerTracingAvailable()?profilerConfig.QueryOptimizerTracing?"profiler_green.png":"profiler_red.png":"profiler_gray.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=ExtendedQueryTracing) at ProfilerConfigurationScreen.pcf: line 135, column 35
    function icon_50 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isExtendedQueryTracingAvailable()?profilerConfig.ExtendedQueryTracing?"profiler_green.png":"profiler_red.png":"profiler_gray.png"
    }
    
    // 'icon' attribute on BooleanRadioCell (id=DiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 146, column 35
    function icon_55 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()?profilerConfig.DiffDbmsCounters?"profiler_green.png":"profiler_red.png":"profiler_gray.png"
    }
    
    // 'label' attribute on MenuItem (id=ToggleStackTraceTracking) at ProfilerConfigurationScreen.pcf: line 160, column 285
    function label_61 () : java.lang.Object {
      return profilerConfig.StackTraceTracking?DisplayKey.get("Web.Profiler.Disable",  DisplayKey.get("Web.Profiler.StackTraceTracking") ):DisplayKey.get("Web.Profiler.Enable",  DisplayKey.get("Web.Profiler.StackTraceTracking") )
    }
    
    // 'label' attribute on MenuItem (id=ToggleQueryOptimizerTracing) at ProfilerConfigurationScreen.pcf: line 165, column 100
    function label_64 () : java.lang.Object {
      return profilerConfig.QueryOptimizerTracing?DisplayKey.get("Web.Profiler.Disable",  DisplayKey.get("Web.Profiler.QueryOptimizerTracing") ):DisplayKey.get("Web.Profiler.Enable",  DisplayKey.get("Web.Profiler.QueryOptimizerTracing") )
    }
    
    // 'label' attribute on MenuItem (id=ToggleDiffDbmsCounters) at ProfilerConfigurationScreen.pcf: line 170, column 98
    function label_67 () : java.lang.Object {
      return profilerConfig.DiffDbmsCounters?DisplayKey.get("Web.Profiler.Disable",  DisplayKey.get("Web.Profiler.DiffDbmsInstrumentationCounters") ):DisplayKey.get("Web.Profiler.Enable",  DisplayKey.get("Web.Profiler.DiffDbmsInstrumentationCounters") )
    }
    
    // 'label' attribute on MenuItem (id=UpdateDbmsCounters) at ProfilerConfigurationScreen.pcf: line 177, column 141
    function label_70 () : java.lang.Object {
      return DisplayKey.get("Web.Profiler.Edit", DisplayKey.get("Web.Profiler.DbmsInstrumentationCaptureThresholdMs"))
    }
    
    // 'promptDefault' attribute on MenuItem (id=UpdateDbmsCounters) at ProfilerConfigurationScreen.pcf: line 177, column 141
    function promptDefault_71 () : java.lang.String {
      return profilerConfig.DbmsCounterThresholdMs as String
    }
    
    // 'promptQuestion' attribute on MenuItem (id=UpdateDbmsCounters) at ProfilerConfigurationScreen.pcf: line 177, column 141
    function promptQuestion_72 () : java.lang.String {
      return DisplayKey.get("Web.Profiler.NewValue", DisplayKey.get("Web.Profiler.DbmsInstrumentationCaptureThresholdMs"))
    }
    
    // 'value' attribute on TextCell (id=EntryPointName) at ProfilerConfigurationScreen.pcf: line 93, column 52
    function valueRoot_35 () : java.lang.Object {
      return profilerConfig
    }
    
    // 'value' attribute on TextCell (id=EntryPointType) at ProfilerConfigurationScreen.pcf: line 86, column 72
    function value_31 () : java.lang.String {
      return getDisplayNameForType(profilerConfig.Subtype)
    }
    
    // 'value' attribute on TextCell (id=EntryPointName) at ProfilerConfigurationScreen.pcf: line 93, column 52
    function value_33 () : java.lang.String {
      return profilerConfig.EntryPoint
    }
    
    // 'value' attribute on TextCell (id=DbmsCounterThresholdMs) at ProfilerConfigurationScreen.pcf: line 153, column 35
    function value_57 () : java.lang.String {
      return profilerConfig.DiffDbmsCounters ? profilerConfig.DbmsCounterThresholdMs.toString() : ""
    }
    
    // 'visible' attribute on MenuItem (id=UpdateDbmsCounters) at ProfilerConfigurationScreen.pcf: line 177, column 141
    function visible_68 () : java.lang.Boolean {
      return profilerConfig.DiffDbmsCounters && gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()
    }
    
    property get profilerConfig () : entity.ProfilerConfig {
      return getIteratedValue(1) as entity.ProfilerConfig
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerConfigurationScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on AlertBar (id=RestartToTakeEffectAlert) at ProfilerConfigurationScreen.pcf: line 18, column 82
    function action_0 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=EnableStartablePluginButton) at ProfilerConfigurationScreen.pcf: line 47, column 97
    function action_11 () : void {
      EnableStartablePluginPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableBatchProcessButton) at ProfilerConfigurationScreen.pcf: line 31, column 94
    function action_3 () : void {
      EnableBatchProcessPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableWorkQueueButton) at ProfilerConfigurationScreen.pcf: line 35, column 91
    function action_5 () : void {
      EnableWorkQueuePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableMessageDestinationButton) at ProfilerConfigurationScreen.pcf: line 39, column 100
    function action_7 () : void {
      EnableMessageDestinationPopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableWebServiceButton) at ProfilerConfigurationScreen.pcf: line 43, column 92
    function action_9 () : void {
      EnableWebServicePopup.push()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableWebServiceButton) at ProfilerConfigurationScreen.pcf: line 43, column 92
    function action_dest_10 () : pcf.api.Destination {
      return pcf.EnableWebServicePopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableStartablePluginButton) at ProfilerConfigurationScreen.pcf: line 47, column 97
    function action_dest_12 () : pcf.api.Destination {
      return pcf.EnableStartablePluginPopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableBatchProcessButton) at ProfilerConfigurationScreen.pcf: line 31, column 94
    function action_dest_4 () : pcf.api.Destination {
      return pcf.EnableBatchProcessPopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableWorkQueueButton) at ProfilerConfigurationScreen.pcf: line 35, column 91
    function action_dest_6 () : pcf.api.Destination {
      return pcf.EnableWorkQueuePopup.createDestination()
    }
    
    // 'action' attribute on ToolbarButton (id=EnableMessageDestinationButton) at ProfilerConfigurationScreen.pcf: line 39, column 100
    function action_dest_8 () : pcf.api.Destination {
      return pcf.EnableMessageDestinationPopup.createDestination()
    }
    
    // 'def' attribute on PanelRef at ProfilerConfigurationScreen.pcf: line 20, column 95
    function def_onEnter_1 (def :  pcf.EnableWebProfilerPanelSet) : void {
      def.onEnter(enableWebProfilingActions, disableWebProfilingActions)
    }
    
    // 'def' attribute on PanelRef at ProfilerConfigurationScreen.pcf: line 20, column 95
    function def_refreshVariables_2 (def :  pcf.EnableWebProfilerPanelSet) : void {
      def.refreshVariables(enableWebProfilingActions, disableWebProfilingActions)
    }
    
    // 'filter' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 64, column 55
    function filter_13 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'filter' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 67, column 71
    function filter_14 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.profiler.ProfilerConfigTypeKeyFilter( TC_BPPROFILERCONFIG )
    }
    
    // 'filter' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 70, column 71
    function filter_16 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.profiler.ProfilerConfigTypeKeyFilter( TC_WQPROFILERCONFIG )
    }
    
    // 'filter' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 73, column 69
    function filter_18 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.profiler.ProfilerConfigTypeKeyFilter( TC_MDPROFILERCONFIG )
    }
    
    // 'filter' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 76, column 71
    function filter_20 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return new gw.api.profiler.ProfilerConfigTypeKeyFilter( TC_WSPROFILERCONFIG )
    }
    
    // 'label' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 67, column 71
    function label_15 () : java.lang.Object {
      return getDisplayNameForType( TC_BPPROFILERCONFIG )
    }
    
    // 'label' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 70, column 71
    function label_17 () : java.lang.Object {
      return getDisplayNameForType( TC_WQPROFILERCONFIG )
    }
    
    // 'label' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 73, column 69
    function label_19 () : java.lang.Object {
      return getDisplayNameForType(TC_MDPROFILERCONFIG)
    }
    
    // 'label' attribute on ToolbarFilterOption at ProfilerConfigurationScreen.pcf: line 76, column 71
    function label_21 () : java.lang.Object {
      return getDisplayNameForType( TC_WSPROFILERCONFIG )
    }
    
    // 'sortBy' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 86, column 72
    function sortValue_22 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return profilerConfig.Subtype
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 93, column 52
    function sortValue_23 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return profilerConfig.EntryPoint
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 103, column 35
    function sortValue_24 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 112, column 35
    function sortValue_25 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 124, column 35
    function sortValue_26 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 135, column 35
    function sortValue_27 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 146, column 35
    function sortValue_28 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return true
    }
    
    // 'sortBy' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 153, column 35
    function sortValue_30 (profilerConfig :  entity.ProfilerConfig) : java.lang.Object {
      return profilerConfig.DbmsCounterThresholdMs
    }
    
    // 'toRemove' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 59, column 87
    function toRemove_74 (profilerConfig :  entity.ProfilerConfig) : void {
      profilerConfig.remove()
    }
    
    // 'tooltip' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 153, column 35
    function tooltip_29 () : java.lang.String {
      return gw.api.profiler.ProfilerPageHelper.isDbmsCounterSnapshotAvailable()?"":DisplayKey.get("Web.Profiler.NotSupportedByDatabase")
    }
    
    // 'value' attribute on RowIterator at ProfilerConfigurationScreen.pcf: line 59, column 87
    function value_75 () : gw.api.database.IQueryBeanResult<entity.ProfilerConfig> {
      return gw.api.database.Query.make(ProfilerConfig).compare("ProfilerEnabled", Equals, true).select()
    }
    
    property get disableWebProfilingActions () : block() {
      return getRequireValue("disableWebProfilingActions", 0) as block()
    }
    
    property set disableWebProfilingActions ($arg :  block()) {
      setRequireValue("disableWebProfilingActions", 0, $arg)
    }
    
    property get enableWebProfilingActions () : block() {
      return getRequireValue("enableWebProfilingActions", 0) as block()
    }
    
    property set enableWebProfilingActions ($arg :  block()) {
      setRequireValue("enableWebProfilingActions", 0, $arg)
    }
    
    function getDisplayNameForType(subtype : typekey.ProfilerConfig) : String {
      if (subtype == TC_BPPROFILERCONFIG) {
        return DisplayKey.get("Web.Profiler.BatchProcess")
      } else if (subtype == TC_WQPROFILERCONFIG) {
        return DisplayKey.get("Web.Profiler.WorkQueue")
      } else  if (subtype == TC_WSPROFILERCONFIG) {
        return DisplayKey.get("Web.Profiler.WebService")
      } else  if (subtype == TC_MDPROFILERCONFIG) {
        return DisplayKey.get("Web.Profiler.MessageDestination")
      } else {
        return subtype.DisplayName
      }
    }
    
    function enableProfilingFor( type : typekey.ProfilerConfig, entryPointName : String) : entity.ProfilerConfig {
      var profilerConfig : entity.ProfilerConfig
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
    
        profilerConfig = com.guidewire.pl.system.profiler.ProfilerConfiguration.getProfilerConfigOrCreateAllOffProfilerConfig( type, entryPointName)
        profilerConfig = bundle.add( profilerConfig )
        profilerConfig.ProfilerEnabled = true
      })
      return profilerConfig
    }
    
    function disableProfilingFor( profilerConfig : ProfilerConfig) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        bundle.remove( profilerConfig )
      })
    }
    
    function toggleIndividualStacks( profilerConfig : ProfilerConfig ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig) as WQProfilerConfig
        localProfilerConfig.IndividualStacks = !localProfilerConfig.IndividualStacks
      })
    }
    
    function toggleStackTraceTracking( profilerConfig : ProfilerConfig ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig)
        localProfilerConfig.StackTraceTracking = !profilerConfig.StackTraceTracking
      })
    }
    
    function toggleQueryOptimizerTracing( profilerConfig : ProfilerConfig ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig)
        localProfilerConfig.QueryOptimizerTracing = !profilerConfig.QueryOptimizerTracing
      })
    }
    
    function toggleExtendedQueryTracing( profilerConfig : ProfilerConfig ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig)
        localProfilerConfig.ExtendedQueryTracing = !profilerConfig.ExtendedQueryTracing
      })
    }
    
    function setDbmsCounterThresholdMs( profilerConfig : ProfilerConfig, dbmsCounterThresholdMs: int ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig)
        localProfilerConfig.DbmsCounterThresholdMs = dbmsCounterThresholdMs
      })
    }
    
    function getNewDbmsCounterThresholdMs() : int {
      try {
        return gw.api.web.WebUtil.getActionEventParameter().toInt()
      } catch (e : NumberFormatException) {
        throw new com.guidewire.pl.web.controller.UserDisplayableException(DisplayKey.get("Java.Validation.Number.NotAnInteger",
            DisplayKey.get("Web.Profiler.DbmsInstrumentationCaptureThresholdMs")), e)
      }
    }
    
    function toggleDiffDbmsCounters( profilerConfig : ProfilerConfig ) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
        var localProfilerConfig = bundle.add(profilerConfig)
        localProfilerConfig.DiffDbmsCounters = !profilerConfig.DiffDbmsCounters
      })
    }
    
    function leavePopup() {
       gw.api.profiler.WebSessionProfilerPageHelper.disableProfiler()
    }
    
    
  }
  
  
}