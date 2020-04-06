package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPResponseDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LirmaSAPResponseDetailsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LirmaSAPResponseDetailsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LirmaSAPResponseDetailsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on CheckBoxInput (id=multipleResponseIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 33, column 62
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.MultipleResponseIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=noFurtherResponseIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 19, column 63
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.NoFurtherResponseIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=immediatePartCollectionIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 26, column 69
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ImmediatePartCollectionIndicatorBoolean = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=noFurtherResponseIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 19, column 63
    function valueRoot_3 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on CheckBoxInput (id=noFurtherResponseIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 19, column 63
    function value_0 () : java.lang.Boolean {
      return claimResponseRq.NoFurtherResponseIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=immediatePartCollectionIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 26, column 69
    function value_4 () : java.lang.Boolean {
      return claimResponseRq.ImmediatePartCollectionIndicatorBoolean
    }
    
    // 'value' attribute on CheckBoxInput (id=multipleResponseIndicator) at LirmaSAPResponseDetailsInputSet.pcf: line 33, column 62
    function value_8 () : java.lang.Boolean {
      return claimResponseRq.MultipleResponseIndicatorBoolean
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    
  }
  
  
}