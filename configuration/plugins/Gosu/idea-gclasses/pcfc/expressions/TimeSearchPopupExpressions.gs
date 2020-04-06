package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/profiler/TimeSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TimeSearchPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/profiler/TimeSearchPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TimeSearchPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'value' attribute on DateInput (id=StartTime) at TimeSearchPopup.pcf: line 31, column 32
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      beginTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=EndTime) at TimeSearchPopup.pcf: line 41, column 30
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      endTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // EditButtons at TimeSearchPopup.pcf: line 20, column 111
    function label_1 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at TimeSearchPopup.pcf: line 20, column 111
    function pickValue_0 () : gw.api.profiler.ProfilerDataSource {
      return gw.api.profiler.TimeSearchProfilerPageHelper.getProfilerDataSource(beginTime, endTime)
    }
    
    // 'value' attribute on DateInput (id=StartTime) at TimeSearchPopup.pcf: line 31, column 32
    function value_2 () : java.util.Date {
      return beginTime
    }
    
    // 'value' attribute on DateInput (id=EndTime) at TimeSearchPopup.pcf: line 41, column 30
    function value_5 () : java.util.Date {
      return endTime
    }
    
    override property get CurrentLocation () : pcf.TimeSearchPopup {
      return super.CurrentLocation as pcf.TimeSearchPopup
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