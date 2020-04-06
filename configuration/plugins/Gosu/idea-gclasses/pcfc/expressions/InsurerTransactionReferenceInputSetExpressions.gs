package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/InsurerTransactionReferenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InsurerTransactionReferenceInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/InsurerTransactionReferenceInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsurerTransactionReferenceInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=insurerTransactionRef) at InsurerTransactionReferenceInputSet.pcf: line 18, column 60
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.InsurerTransactionReference = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=insurerTransactionRef) at InsurerTransactionReferenceInputSet.pcf: line 18, column 60
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=insurerTransactionRef) at InsurerTransactionReferenceInputSet.pcf: line 18, column 60
    function value_0 () : java.lang.String {
      return claimResponseRq.InsurerTransactionReference
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    
  }
  
  
}