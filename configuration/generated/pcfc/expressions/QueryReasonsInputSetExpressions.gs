package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/QueryReasonsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QueryReasonsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/QueryReasonsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QueryReasonsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      selectedQueryReason.Reason = (__VALUE_TO_SET as ECFQueryReason_Ext)
    }
    
    // 'valueRange' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function valueRange_6 () : java.lang.Object {
      return ECFQueryReason_Ext.AllTypeKeys.where(\queryReason -> not(claimResponseRq.QueryReasons*.Reason.contains(queryReason)) or queryReason == selectedQueryReason.Reason)
    }
    
    // 'value' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function valueRoot_5 () : java.lang.Object {
      return selectedQueryReason
    }
    
    // 'value' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function value_2 () : ECFQueryReason_Ext {
      return selectedQueryReason.Reason
    }
    
    // 'valueRange' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function verifyValueRangeIsAllowedType_7 ($$arg :  ECFQueryReason_Ext[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function verifyValueRangeIsAllowedType_7 ($$arg :  gw.api.database.IQueryBeanResult) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function verifyValueRangeIsAllowedType_7 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=queryCode) at QueryReasonsInputSet.pcf: line 41, column 47
    function verifyValueRange_8 () : void {
      var __valueRangeArg = ECFQueryReason_Ext.AllTypeKeys.where(\queryReason -> not(claimResponseRq.QueryReasons*.Reason.contains(queryReason)) or queryReason == selectedQueryReason.Reason)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_7(__valueRangeArg)
    }
    
    property get selectedQueryReason () : ECFResponseQueryReason_Ext {
      return getIteratedValue(1) as ECFResponseQueryReason_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/QueryReasonsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueryReasonsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=queryIterator) at QueryReasonsInputSet.pcf: line 41, column 47
    function sortValue_1 (selectedQueryReason :  ECFResponseQueryReason_Ext) : java.lang.Object {
      return selectedQueryReason.Reason
    }
    
    // 'toAdd' attribute on RowIterator (id=queryIterator) at QueryReasonsInputSet.pcf: line 30, column 52
    function toAdd_9 (selectedQueryReason :  ECFResponseQueryReason_Ext) : void {
      claimResponseRq.addToQueryReasons(selectedQueryReason)
    }
    
    // 'toRemove' attribute on RowIterator (id=queryIterator) at QueryReasonsInputSet.pcf: line 30, column 52
    function toRemove_10 (selectedQueryReason :  ECFResponseQueryReason_Ext) : void {
      claimResponseRq.removeFromQueryReasons(selectedQueryReason)
    }
    
    // 'value' attribute on RowIterator (id=queryIterator) at QueryReasonsInputSet.pcf: line 30, column 52
    function value_11 () : ECFResponseQueryReason_Ext[] {
      return claimResponseRq.QueryReasons
    }
    
    // 'addVisible' attribute on IteratorButtons at QueryReasonsInputSet.pcf: line 19, column 37
    function visible_0 () : java.lang.Boolean {
      return claimResponseRq.QueryReasonAvailable
    }
    
    property get claimResponseRq () : entity.ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as entity.ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  entity.ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    
  }
  
  
}