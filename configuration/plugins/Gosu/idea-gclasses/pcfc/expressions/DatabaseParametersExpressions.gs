package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParameters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseParametersExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParameters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseParametersExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex () : int {
      return 0
    }
    
    // 'initialValue' attribute on Variable at DatabaseParameters.pcf: line 16, column 54
    function initialValue_0 () : gw.api.database.DatabaseParameterSet[] {
      return gw.api.tools.DatabaseParametersHelper.getParameters()
    }
    
    // 'parent' attribute on Page (id=DatabaseParameters) at DatabaseParameters.pcf: line 12, column 88
    static function parent_12 () : pcf.api.Destination {
      return pcf.InfoPages.createDestination()
    }
    
    override property get CurrentLocation () : pcf.DatabaseParameters {
      return super.CurrentLocation as pcf.DatabaseParameters
    }
    
    property get ParameterSets () : gw.api.database.DatabaseParameterSet[] {
      return getVariableValue("ParameterSets", 0) as gw.api.database.DatabaseParameterSet[]
    }
    
    property set ParameterSets ($arg :  gw.api.database.DatabaseParameterSet[]) {
      setVariableValue("ParameterSets", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseParameters.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ScreenExpressionsImpl extends DatabaseParametersExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=DownloadParms) at DatabaseParameters.pcf: line 40, column 106
    function action_3 () : void {
      gw.api.tools.DatabaseParametersHelper.download()
    }
    
    // 'def' attribute on PanelRef at DatabaseParameters.pcf: line 55, column 122
    function def_onEnter_10 (def :  pcf.DatabaseParametersLV) : void {
      def.onEnter(gw.api.tools.DatabaseParametersHelper.getSetByName( ParameterSetName, ParameterSets))
    }
    
    // 'def' attribute on PanelRef at DatabaseParameters.pcf: line 55, column 122
    function def_refreshVariables_11 (def :  pcf.DatabaseParametersLV) : void {
      def.refreshVariables(gw.api.tools.DatabaseParametersHelper.getSetByName( ParameterSetName, ParameterSets))
    }
    
    // 'value' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ParameterSetName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at DatabaseParameters.pcf: line 21, column 26
    function initialValue_1 () : String[] {
      return gw.api.tools.DatabaseParametersHelper.getParameterSetNames( ParameterSets )
    }
    
    // 'valueRange' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function valueRange_7 () : java.lang.Object {
      return ParameterSetNames
    }
    
    // 'value' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function value_4 () : java.lang.String {
      return ParameterSetName
    }
    
    // 'valueRange' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=paramSetPicker) at DatabaseParameters.pcf: line 49, column 30
    function verifyValueRange_9 () : void {
      var __valueRangeArg = ParameterSetNames
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    // 'visible' attribute on Verbatim at DatabaseParameters.pcf: line 29, column 46
    function visible_2 () : java.lang.Boolean {
      return ParameterSets.length == 0
    }
    
    property get ParameterSetName () : String {
      return getVariableValue("ParameterSetName", 1) as String
    }
    
    property set ParameterSetName ($arg :  String) {
      setVariableValue("ParameterSetName", 1, $arg)
    }
    
    property get ParameterSetNames () : String[] {
      return getVariableValue("ParameterSetNames", 1) as String[]
    }
    
    property set ParameterSetNames ($arg :  String[]) {
      setVariableValue("ParameterSetNames", 1, $arg)
    }
    
    
  }
  
  
}