package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BatchProcessDownloadConfigureExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessDownloadConfigureExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (batchProcessType :  BatchProcessType) : int {
      return 0
    }
    
    // 'parent' attribute on Page (id=BatchProcessDownloadConfigure) at BatchProcessDownloadConfigure.pcf: line 12, column 97
    static function parent_12 (batchProcessType :  BatchProcessType) : pcf.api.Destination {
      return pcf.BatchProcessInfo.createDestination()
    }
    
    override property get CurrentLocation () : pcf.BatchProcessDownloadConfigure {
      return super.CurrentLocation as pcf.BatchProcessDownloadConfigure
    }
    
    property get batchProcessType () : BatchProcessType {
      return getVariableValue("batchProcessType", 0) as BatchProcessType
    }
    
    property set batchProcessType ($arg :  BatchProcessType) {
      setVariableValue("batchProcessType", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessDownloadConfigureScreenExpressionsImpl extends BatchProcessDownloadConfigureExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=BackButton) at BatchProcessDownloadConfigure.pcf: line 51, column 118
    function action_10 () : void {
      BatchProcessInfo.go()
    }
    
    // 'action' attribute on ButtonInput (id=download) at BatchProcessDownloadConfigure.pcf: line 47, column 75
    function action_9 () : void {
      BatchInfoHelper.download()
    }
    
    // 'action' attribute on ButtonInput (id=BackButton) at BatchProcessDownloadConfigure.pcf: line 51, column 118
    function action_dest_11 () : pcf.api.Destination {
      return pcf.BatchProcessInfo.createDestination()
    }
    
    // 'value' attribute on DateInput (id=StartDate) at BatchProcessDownloadConfigure.pcf: line 34, column 48
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      BatchInfoHelper.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=StopDate) at BatchProcessDownloadConfigure.pcf: line 42, column 46
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      BatchInfoHelper.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'initialValue' attribute on Variable at BatchProcessDownloadConfigure.pcf: line 24, column 73
    function initialValue_0 () : com.guidewire.pl.system.batchprocessing.BatchInfoHelper {
      return new com.guidewire.pl.system.batchprocessing.BatchInfoHelper(batchProcessType)
    }
    
    // 'value' attribute on DateInput (id=StartDate) at BatchProcessDownloadConfigure.pcf: line 34, column 48
    function valueRoot_4 () : java.lang.Object {
      return BatchInfoHelper
    }
    
    // 'value' attribute on DateInput (id=StartDate) at BatchProcessDownloadConfigure.pcf: line 34, column 48
    function value_1 () : java.util.Date {
      return BatchInfoHelper.StartDate
    }
    
    // 'value' attribute on DateInput (id=StopDate) at BatchProcessDownloadConfigure.pcf: line 42, column 46
    function value_5 () : java.util.Date {
      return BatchInfoHelper.EndDate
    }
    
    property get BatchInfoHelper () : com.guidewire.pl.system.batchprocessing.BatchInfoHelper {
      return getVariableValue("BatchInfoHelper", 1) as com.guidewire.pl.system.batchprocessing.BatchInfoHelper
    }
    
    property set BatchInfoHelper ($arg :  com.guidewire.pl.system.batchprocessing.BatchInfoHelper) {
      setVariableValue("BatchInfoHelper", 1, $arg)
    }
    
    
  }
  
  
}