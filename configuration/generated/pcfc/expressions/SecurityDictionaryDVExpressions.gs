package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/importexport/SecurityDictionaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SecurityDictionaryDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/importexport/SecurityDictionaryDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityDictionaryDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=DownloadButton) at SecurityDictionaryDV.pcf: line 31, column 90
    function action_8 () : void {
      gw.api.tools.SecurityDictionaryHelper.download(outputFormat)
    }
    
    // 'value' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      outputFormat = (__VALUE_TO_SET as gw.api.tools.SecurityDictionaryOutputFormat)
    }
    
    // 'initialValue' attribute on Variable at SecurityDictionaryDV.pcf: line 10, column 59
    function initialValue_0 () : gw.api.tools.SecurityDictionaryOutputFormat {
      return gw.api.tools.SecurityDictionaryOutputFormat.HTML
    }
    
    // 'optionLabel' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function optionLabel_4 (VALUE :  gw.api.tools.SecurityDictionaryOutputFormat) : java.lang.String {
      return VALUE.LocalizedName
    }
    
    // 'valueRange' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function valueRange_5 () : java.lang.Object {
      return gw.api.tools.SecurityDictionaryOutputFormat.values()
    }
    
    // 'value' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function value_1 () : gw.api.tools.SecurityDictionaryOutputFormat {
      return outputFormat
    }
    
    // 'valueRange' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function verifyValueRangeIsAllowedType_6 ($$arg :  gw.api.tools.SecurityDictionaryOutputFormat[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=OutputFormat) at SecurityDictionaryDV.pcf: line 24, column 66
    function verifyValueRange_7 () : void {
      var __valueRangeArg = gw.api.tools.SecurityDictionaryOutputFormat.values()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get outputFormat () : gw.api.tools.SecurityDictionaryOutputFormat {
      return getVariableValue("outputFormat", 0) as gw.api.tools.SecurityDictionaryOutputFormat
    }
    
    property set outputFormat ($arg :  gw.api.tools.SecurityDictionaryOutputFormat) {
      setVariableValue("outputFormat", 0, $arg)
    }
    
    
  }
  
  
}