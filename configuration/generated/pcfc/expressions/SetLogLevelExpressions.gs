package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/SetLogLevel.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SetLogLevelExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/SetLogLevel.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SetLogLevelExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=SetLevel) at SetLogLevel.pcf: line 73, column 114
    function action_29 () : void {
      Data.updateLoggerLevel(PickedLoggerName, PickedLoggerLevel)
    }
    
    // 'canVisit' attribute on Page (id=SetLogLevel) at SetLogLevel.pcf: line 13, column 71
    static function canVisit_30 () : java.lang.Boolean {
      return perm.User.EditLog or perm.User.DevAllAccess
    }
    
    // 'value' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      PickedLoggerLevel = (__VALUE_TO_SET as gw.logging.LogLevel)
    }
    
    // 'value' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      PickedLoggerName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at SetLogLevel.pcf: line 19, column 44
    function initialValue_0 () : gw.api.tools.SetLogLevelData {
      return new gw.api.tools.SetLogLevelData()
    }
    
    // 'onChange' attribute on PostOnChange at SetLogLevel.pcf: line 39, column 87
    function onChange_1 () : void {
      PickedLoggerLevel = Data.getLoggerLevel(PickedLoggerName)
    }
    
    // 'optionLabel' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function optionLabel_23 (VALUE :  gw.logging.LogLevel) : java.lang.String {
      return VALUE.Name
    }
    
    // 'outputConversion' attribute on TextInput (id=CurConfigLevel) at SetLogLevel.pcf: line 47, column 51
    function outputConversion_11 (VALUE :  gw.logging.LogLevel) : java.lang.String {
      return VALUE != null ? VALUE.Name : DisplayKey.get("Web.InternalTools.SetLogLevel.NoneLevel")
    }
    
    // 'parent' attribute on Page (id=SetLogLevel) at SetLogLevel.pcf: line 13, column 71
    static function parent_31 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'valueRange' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function valueRange_24 () : java.lang.Object {
      return gw.logging.LogLevel.values()
    }
    
    // 'valueRange' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function valueRange_5 () : java.lang.Object {
      return Data.LoggerNames.toList()
    }
    
    // 'value' attribute on TextInput (id=CurActualLevel) at SetLogLevel.pcf: line 54, column 51
    function value_14 () : gw.logging.LogLevel {
      return Data.getActualLoggerLevel(PickedLoggerName)
    }
    
    // 'value' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function value_19 () : gw.logging.LogLevel {
      return PickedLoggerLevel
    }
    
    // 'value' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function value_2 () : java.lang.String {
      return PickedLoggerName
    }
    
    // 'value' attribute on TextInput (id=CurConfigLevel) at SetLogLevel.pcf: line 47, column 51
    function value_9 () : gw.logging.LogLevel {
      return Data.getLoggerLevel(PickedLoggerName)
    }
    
    // 'valueRange' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function verifyValueRangeIsAllowedType_25 ($$arg :  gw.logging.LogLevel[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=NewLevel) at SetLogLevel.pcf: line 65, column 50
    function verifyValueRange_26 () : void {
      var __valueRangeArg = gw.logging.LogLevel.values()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Logger) at SetLogLevel.pcf: line 37, column 44
    function verifyValueRange_7 () : void {
      var __valueRangeArg = Data.LoggerNames.toList()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    // 'visible' attribute on ButtonInput (id=SetLevel) at SetLogLevel.pcf: line 73, column 114
    function visible_27 () : java.lang.Boolean {
      return PickedLoggerName != null and Data.getLoggerLevel(PickedLoggerName) != PickedLoggerLevel
    }
    
    // 'visible' attribute on TextInput (id=CurConfigLevel) at SetLogLevel.pcf: line 47, column 51
    function visible_8 () : java.lang.Boolean {
      return PickedLoggerName != null
    }
    
    override property get CurrentLocation () : pcf.SetLogLevel {
      return super.CurrentLocation as pcf.SetLogLevel
    }
    
    property get Data () : gw.api.tools.SetLogLevelData {
      return getVariableValue("Data", 0) as gw.api.tools.SetLogLevelData
    }
    
    property set Data ($arg :  gw.api.tools.SetLogLevelData) {
      setVariableValue("Data", 0, $arg)
    }
    
    property get PickedLoggerLevel () : gw.logging.LogLevel {
      return getVariableValue("PickedLoggerLevel", 0) as gw.logging.LogLevel
    }
    
    property set PickedLoggerLevel ($arg :  gw.logging.LogLevel) {
      setVariableValue("PickedLoggerLevel", 0, $arg)
    }
    
    property get PickedLoggerName () : String {
      return getVariableValue("PickedLoggerName", 0) as String
    }
    
    property set PickedLoggerName ($arg :  String) {
      setVariableValue("PickedLoggerName", 0, $arg)
    }
    
    
  }
  
  
}