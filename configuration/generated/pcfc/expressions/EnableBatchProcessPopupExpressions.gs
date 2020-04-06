package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/EnableBatchProcessPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EnableBatchProcessPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/EnableBatchProcessPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EnableBatchProcessPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'afterCommit' attribute on Popup (id=EnableBatchProcessPopup) at EnableBatchProcessPopup.pcf: line 12, column 85
    function afterCommit_7 (TopLocation :  pcf.api.Location) : void {
      gw.api.profiler.GosuProfilerPageHelper.enableProfilingFor( typekey.ProfilerConfig.TC_BPPROFILERCONFIG, com.guidewire.pl.system.batchprocessing.BatchProcessProfiler.getEntryPointName( batchProcessType ) );
    }
    
    // 'value' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      batchProcessType = (__VALUE_TO_SET as typekey.BatchProcessType)
    }
    
    // EditButtons at EnableBatchProcessPopup.pcf: line 19, column 32
    function label_0 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'valueRange' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function valueRange_4 () : java.lang.Object {
      return gw.api.profiler.BatchProcessWorkQueueProfilerPageHelper.getNotEnabledBatchProcessTypes().toTypedArray()
    }
    
    // 'value' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function value_1 () : typekey.BatchProcessType {
      return batchProcessType
    }
    
    // 'valueRange' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function verifyValueRangeIsAllowedType_5 ($$arg :  typekey.BatchProcessType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=BatchProcess) at EnableBatchProcessPopup.pcf: line 30, column 51
    function verifyValueRange_6 () : void {
      var __valueRangeArg = gw.api.profiler.BatchProcessWorkQueueProfilerPageHelper.getNotEnabledBatchProcessTypes().toTypedArray()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.EnableBatchProcessPopup {
      return super.CurrentLocation as pcf.EnableBatchProcessPopup
    }
    
    property get batchProcessType () : BatchProcessType {
      return getVariableValue("batchProcessType", 0) as BatchProcessType
    }
    
    property set batchProcessType ($arg :  BatchProcessType) {
      setVariableValue("batchProcessType", 0, $arg)
    }
    
    
  }
  
  
}