package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ResponseInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ResponseInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/ResponseInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResponseInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ResponseCode = (__VALUE_TO_SET as ECFResponseCode_Ext)
    }
    
    // 'disablePostOnEnter' attribute on PostOnChange at ResponseInputSet.pcf: line 23, column 54
    function disablePostOnEnter_0 () : java.lang.Boolean {
      return not enablePostOnChange
    }
    
    // 'valueRange' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function valueRange_5 () : java.lang.Object {
      return claimResponseRq.AvailableResponseCodes
    }
    
    // 'value' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function valueRoot_4 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function value_1 () : ECFResponseCode_Ext {
      return claimResponseRq.ResponseCode
    }
    
    // 'valueRange' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function verifyValueRangeIsAllowedType_6 ($$arg :  ECFResponseCode_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function verifyValueRangeIsAllowedType_6 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function verifyValueRangeIsAllowedType_6 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=response) at ResponseInputSet.pcf: line 21, column 39
    function verifyValueRange_7 () : void {
      var __valueRangeArg = claimResponseRq.AvailableResponseCodes
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_6(__valueRangeArg)
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get enablePostOnChange () : Boolean {
      return getRequireValue("enablePostOnChange", 0) as Boolean
    }
    
    property set enablePostOnChange ($arg :  Boolean) {
      setRequireValue("enablePostOnChange", 0, $arg)
    }
    
    
  }
  
  
}