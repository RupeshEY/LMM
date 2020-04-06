package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Web.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PickProfilerSourceLV_WebExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Web.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PickProfilerSourceLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=WebProfilerName) at PickProfilerSourceLV.Web.pcf: line 30, column 37
    function valueRoot_3 () : java.lang.Object {
      return webProfiler
    }
    
    // 'value' attribute on TextCell (id=WebProfilerName) at PickProfilerSourceLV.Web.pcf: line 30, column 37
    function value_1 () : java.lang.String {
      return webProfiler.Name
    }
    
    property get webProfiler () : com.guidewire.pl.web.internaltools.profiler.WebProfiler {
      return getIteratedValue(1) as com.guidewire.pl.web.internaltools.profiler.WebProfiler
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/profiler/PickProfilerSourceLV.Web.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickProfilerSourceLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Web.pcf: line 30, column 37
    function sortValue_0 (webProfiler :  com.guidewire.pl.web.internaltools.profiler.WebProfiler) : java.lang.Object {
      return webProfiler.Name
    }
    
    // 'value' attribute on RowIterator at PickProfilerSourceLV.Web.pcf: line 18, column 77
    function value_4 () : com.guidewire.pl.web.internaltools.profiler.WebProfiler[] {
      return getSavedWebProfilers()
    }
    
    function getSavedWebProfilers() : com.guidewire.pl.web.internaltools.profiler.WebProfiler[] {
      var savedWebProfilers = gw.api.profiler.WebSessionProfilerPageHelper.getCurrentSession().getSavedWebProfilers()
      return savedWebProfilers.toTypedArray()
    }
    
    
  }
  
  
}