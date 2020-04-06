package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/FireDamageQuestionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FireDamageQuestionsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/FireDamageQuestionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FireDamageQuestionsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=HowWasFireDiscovered) at FireDamageQuestionsPanelSet.pcf: line 28, column 67
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.HowWasFireDiscovered = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireDeptResponded) at FireDamageQuestionsPanelSet.pcf: line 33, column 64
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.FireDeptResponded = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsAnyoneInjured) at FireDamageQuestionsPanelSet.pcf: line 40, column 62
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.IsAnyoneInjured = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at FireDamageQuestionsPanelSet.pcf: line 16, column 52
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.Arson = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SmokeDamageOnly) at FireDamageQuestionsPanelSet.pcf: line 45, column 62
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.SmokeDamageOnly = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeHabitable) at FireDamageQuestionsPanelSet.pcf: line 50, column 62
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.IsHomeHabitable = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeSecure) at FireDamageQuestionsPanelSet.pcf: line 55, column 59
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.IsHomeSecure = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextAreaInput (id=FireSource) at FireDamageQuestionsPanelSet.pcf: line 22, column 57
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyFireDamage.FireSource = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at FireDamageQuestionsPanelSet.pcf: line 16, column 52
    function valueRoot_3 () : java.lang.Object {
      return aClaim.PropertyFireDamage
    }
    
    // 'value' attribute on BooleanRadioInput (id=ArsonInvolved) at FireDamageQuestionsPanelSet.pcf: line 16, column 52
    function value_0 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.Arson
    }
    
    // 'value' attribute on BooleanRadioInput (id=FireDeptResponded) at FireDamageQuestionsPanelSet.pcf: line 33, column 64
    function value_12 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.FireDeptResponded
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsAnyoneInjured) at FireDamageQuestionsPanelSet.pcf: line 40, column 62
    function value_16 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.IsAnyoneInjured
    }
    
    // 'value' attribute on BooleanRadioInput (id=SmokeDamageOnly) at FireDamageQuestionsPanelSet.pcf: line 45, column 62
    function value_20 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.SmokeDamageOnly
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeHabitable) at FireDamageQuestionsPanelSet.pcf: line 50, column 62
    function value_24 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.IsHomeHabitable
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsHomeSecure) at FireDamageQuestionsPanelSet.pcf: line 55, column 59
    function value_28 () : java.lang.Boolean {
      return aClaim.PropertyFireDamage.IsHomeSecure
    }
    
    // 'value' attribute on TextAreaInput (id=FireSource) at FireDamageQuestionsPanelSet.pcf: line 22, column 57
    function value_4 () : java.lang.String {
      return aClaim.PropertyFireDamage.FireSource
    }
    
    // 'value' attribute on TextAreaInput (id=HowWasFireDiscovered) at FireDamageQuestionsPanelSet.pcf: line 28, column 67
    function value_8 () : java.lang.String {
      return aClaim.PropertyFireDamage.HowWasFireDiscovered
    }
    
    property get aClaim () : Claim {
      return getRequireValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setRequireValue("aClaim", 0, $arg)
    }
    
    
  }
  
  
}