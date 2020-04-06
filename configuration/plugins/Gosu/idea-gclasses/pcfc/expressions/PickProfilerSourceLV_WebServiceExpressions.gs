package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WebService.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_WebServiceExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WebService.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 20, column 82
    function pickValue_21 () : java.lang.Object {
      return soapCallHistory.ProfilerData
    }
    
    // 'value' attribute on TextCell (id=ServerName) at PickProfilerSourceLV.WebService.pcf: line 37, column 47
    function valueRoot_8 () : java.lang.Object {
      return soapCallHistory
    }
    
    // 'value' attribute on TextCell (id=OperationName) at PickProfilerSourceLV.WebService.pcf: line 47, column 50
    function value_12 () : java.lang.String {
      return soapCallHistory.OperationName
    }
    
    // 'value' attribute on DateCell (id=StartDate) at PickProfilerSourceLV.WebService.pcf: line 55, column 46
    function value_15 () : java.util.Date {
      return soapCallHistory.StartDate
    }
    
    // 'value' attribute on DateCell (id=CompleteDate) at PickProfilerSourceLV.WebService.pcf: line 61, column 49
    function value_18 () : java.util.Date {
      return soapCallHistory.CompleteDate
    }
    
    // 'value' attribute on TextCell (id=ServerName) at PickProfilerSourceLV.WebService.pcf: line 37, column 47
    function value_6 () : java.lang.String {
      return soapCallHistory.ServerName
    }
    
    // 'value' attribute on TextCell (id=ServiceName) at PickProfilerSourceLV.WebService.pcf: line 42, column 48
    function value_9 () : java.lang.String {
      return soapCallHistory.ServiceName
    }
    
    property get soapCallHistory () : entity.SoapCallHistory {
      return getIteratedValue(1) as entity.SoapCallHistory
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.WebService.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PickProfilerSourceLV.WebService.pcf: line 25, column 91
    function filters_0 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return gw.api.profiler.WebServiceProfilerPageHelper.getServiceNameFilters()
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 37, column 47
    function sortValue_1 (soapCallHistory :  entity.SoapCallHistory) : java.lang.Object {
      return soapCallHistory.ServerName
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 42, column 48
    function sortValue_2 (soapCallHistory :  entity.SoapCallHistory) : java.lang.Object {
      return soapCallHistory.ServiceName
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 47, column 50
    function sortValue_3 (soapCallHistory :  entity.SoapCallHistory) : java.lang.Object {
      return soapCallHistory.OperationName
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 55, column 46
    function sortValue_4 (soapCallHistory :  entity.SoapCallHistory) : java.lang.Object {
      return soapCallHistory.StartDate
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 61, column 49
    function sortValue_5 (soapCallHistory :  entity.SoapCallHistory) : java.lang.Object {
      return soapCallHistory.CompleteDate
    }
    
    // 'toRemove' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 20, column 82
    function toRemove_22 (soapCallHistory :  entity.SoapCallHistory) : void {
      deleteProfilerData(soapCallHistory)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.WebService.pcf: line 20, column 82
    function value_23 () : gw.api.database.IQueryBeanResult<entity.SoapCallHistory> {
      return gw.api.database.Query.make(SoapCallHistory).select()
    }
    
    function deleteProfilerData(soapCallHistory : SoapCallHistory) {
      gw.transaction.Transaction.runWithNewBundle( \ bundle -> {
          bundle.remove( soapCallHistory )
        }
      )
    }
    
    
  }
  
  
}