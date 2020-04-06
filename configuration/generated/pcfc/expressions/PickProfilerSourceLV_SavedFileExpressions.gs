package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.SavedFile.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_SavedFileExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.SavedFile.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at PickProfilerSourceLV.SavedFile.pcf: line 33, column 42
    function valueRoot_3 () : java.lang.Object {
      return savedStackSource
    }
    
    // 'value' attribute on TextCell (id=Name) at PickProfilerSourceLV.SavedFile.pcf: line 33, column 42
    function value_1 () : java.lang.String {
      return savedStackSource.Name
    }
    
    property get savedStackSource () : gw.api.profiler.ProfilerDataSource {
      return getIteratedValue(1) as gw.api.profiler.ProfilerDataSource
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.SavedFile.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at PickProfilerSourceLV.SavedFile.pcf: line 17, column 59
    function initialValue_0 () : gw.api.profiler.SavedFileProfilerPageHelper {
      return new gw.api.profiler.SavedFileProfilerPageHelper()
    }
    
    // 'pickLocation' attribute on RowIterator at PickProfilerSourceLV.SavedFile.pcf: line 24, column 56
    function pickLocation_4 () : void {
      PickSavedFilePopup.push()
    }
    
    // 'toAdd' attribute on RowIterator at PickProfilerSourceLV.SavedFile.pcf: line 24, column 56
    function toAdd_5 (savedStackSource :  gw.api.profiler.ProfilerDataSource) : void {
      pageHelper.addProfilerSource(savedStackSource)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.SavedFile.pcf: line 24, column 56
    function value_6 () : gw.api.profiler.ProfilerDataSource[] {
      return pageHelper.getSavedProfilerSources()
    }
    
    property get pageHelper () : gw.api.profiler.SavedFileProfilerPageHelper {
      return getVariableValue("pageHelper", 0) as gw.api.profiler.SavedFileProfilerPageHelper
    }
    
    property set pageHelper ($arg :  gw.api.profiler.SavedFileProfilerPageHelper) {
      setVariableValue("pageHelper", 0, $arg)
    }
    
    
  }
  
  
}