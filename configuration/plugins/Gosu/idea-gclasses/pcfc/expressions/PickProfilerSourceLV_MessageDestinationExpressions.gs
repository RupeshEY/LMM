package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_MessageDestinationExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.MessageDestination.pcf: line 28, column 27
    function condition_4 () : java.lang.Boolean {
      return instrumentedMessage.EndTime != null
    }
    
    // 'condition' attribute on ToolbarFlag at PickProfilerSourceLV.MessageDestination.pcf: line 31, column 30
    function condition_5 () : java.lang.Boolean {
      return instrumentedMessage.EndTime == null
    }
    
    // 'value' attribute on TextCell (id=MessageDestinationID) at PickProfilerSourceLV.MessageDestination.pcf: line 38, column 42
    function valueRoot_8 () : java.lang.Object {
      return instrumentedMessage
    }
    
    // 'value' attribute on DateCell (id=StartTime) at PickProfilerSourceLV.MessageDestination.pcf: line 51, column 50
    function value_12 () : java.util.Date {
      return instrumentedMessage.StartTime
    }
    
    // 'value' attribute on DateCell (id=EndTime) at PickProfilerSourceLV.MessageDestination.pcf: line 57, column 48
    function value_15 () : java.util.Date {
      return instrumentedMessage.EndTime
    }
    
    // 'value' attribute on TextCell (id=MessageDestinationID) at PickProfilerSourceLV.MessageDestination.pcf: line 38, column 42
    function value_6 () : java.lang.Integer {
      return instrumentedMessage.DestinationID
    }
    
    // 'value' attribute on TextCell (id=MessageDestinationName) at PickProfilerSourceLV.MessageDestination.pcf: line 43, column 45
    function value_9 () : java.lang.String {
      return instrumentedMessage.Name
    }
    
    property get instrumentedMessage () : entity.InstrumentedMessage {
      return getIteratedValue(1) as entity.InstrumentedMessage
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PickProfilerSourceLV.MessageDestination.pcf: line 24, column 90
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return new gw.api.filters.MessageDestinationFilterSet().getFilterOptions()
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.MessageDestination.pcf: line 38, column 42
    function sortValue_1 (instrumentedMessage :  entity.InstrumentedMessage) : java.lang.Object {
      return instrumentedMessage.DestinationID
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.MessageDestination.pcf: line 51, column 50
    function sortValue_2 (instrumentedMessage :  entity.InstrumentedMessage) : java.lang.Object {
      return instrumentedMessage.StartTime
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.MessageDestination.pcf: line 57, column 48
    function sortValue_3 (instrumentedMessage :  entity.InstrumentedMessage) : java.lang.Object {
      return instrumentedMessage.EndTime
    }
    
    // 'toRemove' attribute on RowIterator at PickProfilerSourceLV.MessageDestination.pcf: line 19, column 86
    function toRemove_18 (instrumentedMessage :  entity.InstrumentedMessage) : void {
      deleteProfilerData(instrumentedMessage)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.MessageDestination.pcf: line 19, column 86
    function value_19 () : gw.api.database.IQueryBeanResult<entity.InstrumentedMessage> {
      return gw.api.database.Query.make(InstrumentedMessage).compare("ProfilerData", NotEquals, null).select()
    }
    
    function deleteProfilerData(instrumentedMessage : InstrumentedMessage) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
          var localSource = bundle.add( instrumentedMessage )
          localSource.ProfilerData = null
        }
      )
    }
    
    
  }
  
  
}