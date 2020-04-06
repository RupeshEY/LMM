package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.util.Pair
@javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DatabaseStorageDV_OneAtATimeExpressions {
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DatabaseStorageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      NameValuePairs = (__VALUE_TO_SET as gw.util.Pair<java.lang.Object, java.lang.Object>[])
    }
    
    // 'initialValue' attribute on Variable at DatabaseStorageDV.OneAtATime.pcf: line 14, column 30
    function initialValue_0 () : gw.util.Pair[] {
      return ParameterSet.NameValuePairArrays[0]
    }
    
    // 'label' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function label_1 () : java.lang.Object {
      return ParameterSet.RowItemLabel
    }
    
    // 'optionLabel' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function optionLabel_6 (VALUE :  gw.util.Pair<java.lang.Object, java.lang.Object>[]) : java.lang.String {
      return getOptionLabel(VALUE) as java.lang.String
    }
    
    // 'value' attribute on RowIterator at DatabaseStorageDV.OneAtATime.pcf: line 44, column 47
    function sortValue_10 (onerow :  gw.util.Pair<java.lang.Object, java.lang.Object>) : java.lang.Object {
      return onerow.First
    }
    
    // 'value' attribute on RowIterator at DatabaseStorageDV.OneAtATime.pcf: line 49, column 47
    function sortValue_11 (onerow :  gw.util.Pair<java.lang.Object, java.lang.Object>) : java.lang.Object {
      return onerow.Second
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function valueRange_7 () : java.lang.Object {
      return ParameterSet.NameValuePairArrays
    }
    
    // 'value' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function value_2 () : gw.util.Pair<java.lang.Object, java.lang.Object>[] {
      return NameValuePairs
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function verifyValueRangeIsAllowedType_8 ($$arg :  gw.util.Pair<java.lang.Object, java.lang.Object>[][]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function verifyValueRangeIsAllowedType_8 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ToolbarRangeInput (id=rangeInput) at DatabaseStorageDV.OneAtATime.pcf: line 26, column 82
    function verifyValueRange_9 () : void {
      var __valueRangeArg = ParameterSet.NameValuePairArrays
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_8(__valueRangeArg)
    }
    
    property get NameValuePairs () : gw.util.Pair[] {
      return getVariableValue("NameValuePairs", 0) as gw.util.Pair[]
    }
    
    property set NameValuePairs ($arg :  gw.util.Pair[]) {
      setVariableValue("NameValuePairs", 0, $arg)
    }
    
    property get ParameterSet () : gw.api.database.DatabaseParameterSet {
      return getRequireValue("ParameterSet", 0) as gw.api.database.DatabaseParameterSet
    }
    
    property set ParameterSet ($arg :  gw.api.database.DatabaseParameterSet) {
      setRequireValue("ParameterSet", 0, $arg)
    }
    
    function getOptionLabel(attributePairs: Pair[]): Object {
      var optionLabel = ""
      for (i in ParameterSet.KeyColumns) {
        optionLabel +=  ((attributePairs[i].Second as String)  + " ")
      }
      return optionLabel
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/tools/infopages/DatabaseStorageDV.OneAtATime.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends DatabaseStorageDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=name) at DatabaseStorageDV.OneAtATime.pcf: line 44, column 47
    function valueRoot_14 () : java.lang.Object {
      return onerow
    }
    
    // 'value' attribute on TextCell (id=name) at DatabaseStorageDV.OneAtATime.pcf: line 44, column 47
    function value_12 () : java.lang.Object {
      return onerow.First
    }
    
    // 'value' attribute on TextCell (id=value) at DatabaseStorageDV.OneAtATime.pcf: line 49, column 47
    function value_15 () : java.lang.Object {
      return onerow.Second
    }
    
    property get onerow () : gw.util.Pair<java.lang.Object, java.lang.Object> {
      return getIteratedValue(1) as gw.util.Pair<java.lang.Object, java.lang.Object>
    }
    
    
  }
  
  
}