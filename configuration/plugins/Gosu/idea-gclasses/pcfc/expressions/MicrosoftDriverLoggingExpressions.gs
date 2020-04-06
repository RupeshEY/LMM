package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class MicrosoftDriverLoggingExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends MicrosoftDriverLoggingExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=msgCell) at MicrosoftDriverLogging.pcf: line 81, column 28
    function value_20 () : java.lang.String {
      return msg
    }
    
    property get msg () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/MicrosoftDriverLogging.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MicrosoftDriverLoggingExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=SetLoggingLevel) at MicrosoftDriverLogging.pcf: line 66, column 117
    function action_19 () : void {
      commandResult = PageHelper.setMicrosoftJdbcDriverLogging()
    }
    
    // 'canVisit' attribute on Page (id=MicrosoftDriverLogging) at MicrosoftDriverLogging.pcf: line 12, column 92
    static function canVisit_23 () : java.lang.Boolean {
      return gw.api.tools.MicrosoftDriverLoggingPageHelper.supportsMicrosoftDriverLogging()
    }
    
    // 'value' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.Formatter = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=topNHotObjects) at MicrosoftDriverLogging.pcf: line 59, column 49
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.LogFileLocation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      PageHelper.LoggingLevel = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at MicrosoftDriverLogging.pcf: line 16, column 61
    function initialValue_0 () : gw.api.tools.MicrosoftDriverLoggingPageHelper {
      return new gw.api.tools.MicrosoftDriverLoggingPageHelper()
    }
    
    // 'parent' attribute on Page (id=MicrosoftDriverLogging) at MicrosoftDriverLogging.pcf: line 12, column 92
    static function parent_24 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function valueRange_12 () : java.lang.Object {
      return PageHelper.AvailableLoggingFormatters
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function valueRange_5 () : java.lang.Object {
      return PageHelper.AvailableLoggingLevels
    }
    
    // 'value' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function valueRoot_4 () : java.lang.Object {
      return PageHelper
    }
    
    // 'value' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function value_1 () : java.lang.String {
      return PageHelper.LoggingLevel
    }
    
    // 'value' attribute on TextInput (id=topNHotObjects) at MicrosoftDriverLogging.pcf: line 59, column 49
    function value_15 () : java.lang.String {
      return PageHelper.LogFileLocation
    }
    
    // 'value' attribute on RowIterator at MicrosoftDriverLogging.pcf: line 75, column 42
    function value_22 () : java.lang.String[] {
      return commandResult
    }
    
    // 'value' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function value_8 () : java.lang.String {
      return PageHelper.Formatter
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingFormat) at MicrosoftDriverLogging.pcf: line 48, column 43
    function verifyValueRange_14 () : void {
      var __valueRangeArg = PageHelper.AvailableLoggingFormatters
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=loggingLevel) at MicrosoftDriverLogging.pcf: line 36, column 43
    function verifyValueRange_7 () : void {
      var __valueRangeArg = PageHelper.AvailableLoggingLevels
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.MicrosoftDriverLogging {
      return super.CurrentLocation as pcf.MicrosoftDriverLogging
    }
    
    property get PageHelper () : gw.api.tools.MicrosoftDriverLoggingPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.tools.MicrosoftDriverLoggingPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.tools.MicrosoftDriverLoggingPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get commandResult () : String[] {
      return getVariableValue("commandResult", 0) as String[]
    }
    
    property set commandResult ($arg :  String[]) {
      setVariableValue("commandResult", 0, $arg)
    }
    
    
  }
  
  
}