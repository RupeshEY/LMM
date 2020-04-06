package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/ViewLogs.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ViewLogsExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/ViewLogs.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLogsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'action' attribute on ButtonInput (id=ViewLogs) at ViewLogs.pcf: line 61, column 86
    function action_17 () : void {
      logText = gw.api.system.logging.LogViewerUtil.readLog(logFile, maxLines, filter)
    }
    
    // 'available' attribute on ButtonInput (id=ViewLogs) at ViewLogs.pcf: line 61, column 86
    function available_15 () : java.lang.Boolean {
      return logFile != null
    }
    
    // 'canVisit' attribute on Page (id=ViewLogs) at ViewLogs.pcf: line 13, column 68
    static function canVisit_20 () : java.lang.Boolean {
      return perm.User.ViewLog or perm.User.DevAllAccess
    }
    
    // 'value' attribute on TextInput (id=LogFilter) at ViewLogs.pcf: line 49, column 29
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      filter = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=MaxLines) at ViewLogs.pcf: line 55, column 44
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      maxLines = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      logFile = (__VALUE_TO_SET as java.nio.file.Path)
    }
    
    // 'initialValue' attribute on Variable at ViewLogs.pcf: line 19, column 19
    function initialValue_0 () : int {
      return 1000
    }
    
    // 'onChange' attribute on PostOnChange at ViewLogs.pcf: line 43, column 42
    function onChange_1 () : void {
      logText = null
    }
    
    // 'optionLabel' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function optionLabel_5 (VALUE :  java.nio.file.Path) : java.lang.String {
      return VALUE.FileName.toString()
    }
    
    // 'parent' attribute on Page (id=ViewLogs) at ViewLogs.pcf: line 13, column 68
    static function parent_21 () : pcf.api.Destination {
      return pcf.ServerTools.createDestination()
    }
    
    // 'valueRange' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function valueRange_6 () : java.lang.Object {
      return gw.api.system.logging.LogViewerUtil.getLogFiles()
    }
    
    // 'value' attribute on TextInput (id=MaxLines) at ViewLogs.pcf: line 55, column 44
    function value_12 () : java.lang.Integer {
      return maxLines
    }
    
    // 'value' attribute on TextAreaInput (id=LogDisplay) at ViewLogs.pcf: line 71, column 30
    function value_18 () : java.lang.String {
      return logText
    }
    
    // 'value' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function value_2 () : java.nio.file.Path {
      return logFile
    }
    
    // 'value' attribute on TextInput (id=LogFilter) at ViewLogs.pcf: line 49, column 29
    function value_9 () : java.lang.String {
      return filter
    }
    
    // 'valueRange' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.nio.file.Path[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=LogFile) at ViewLogs.pcf: line 41, column 44
    function verifyValueRange_8 () : void {
      var __valueRangeArg = gw.api.system.logging.LogViewerUtil.getLogFiles()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    override property get CurrentLocation () : pcf.ViewLogs {
      return super.CurrentLocation as pcf.ViewLogs
    }
    
    property get filter () : String {
      return getVariableValue("filter", 0) as String
    }
    
    property set filter ($arg :  String) {
      setVariableValue("filter", 0, $arg)
    }
    
    property get logFile () : java.nio.file.Path {
      return getVariableValue("logFile", 0) as java.nio.file.Path
    }
    
    property set logFile ($arg :  java.nio.file.Path) {
      setVariableValue("logFile", 0, $arg)
    }
    
    property get logText () : String {
      return getVariableValue("logText", 0) as String
    }
    
    property set logText ($arg :  String) {
      setVariableValue("logText", 0, $arg)
    }
    
    property get maxLinesValue () : int {
      return getVariableValue("maxLinesValue", 0) as java.lang.Integer
    }
    
    property set maxLinesValue ($arg :  int) {
      setVariableValue("maxLinesValue", 0, $arg)
    }
    
    property get maxLines():java.lang.Integer {
            return maxLinesValue
          }
          /**
           * Set the maximum length to a number between 1 and 10,000.
           * This will ensure that no strange memory issues occur.
           */
          property set maxLines(len:java.lang.Integer){
             if (len == null) {
                throw new gw.api.util.DisplayableException(DisplayKey.get("Web.InternalTools.ViewLogs.MaxLinesNotSpecifiedMsg"))
             }
             if (len <= 0){
                throw new gw.api.util.DisplayableException(DisplayKey.get("Web.InternalTools.ViewLogs.MaxLinesTooSmallMsg"))
             }
             if (len > 10000){
                throw new gw.api.util.DisplayableException(DisplayKey.get("Web.InternalTools.ViewLogs.MaxLinesTooBigMsg"))
             }
             maxLinesValue = len
          }
    
    
  }
  
  
}