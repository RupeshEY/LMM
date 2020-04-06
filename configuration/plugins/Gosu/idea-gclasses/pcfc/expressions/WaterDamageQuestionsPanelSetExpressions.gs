package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/WaterDamageQuestionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WaterDamageQuestionsPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/WaterDamageQuestionsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaterDamageQuestionsPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsRoofCovered) at WaterDamageQuestionsPanelSet.pcf: line 34, column 72
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyWaterDamage.IsRoofProtected = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=WaterSource) at WaterDamageQuestionsPanelSet.pcf: line 18, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyWaterDamage.WaterSource = (__VALUE_TO_SET as typekey.WaterSource)
    }
    
    // 'value' attribute on BooleanRadioInput (id=HasWaterBeenTurnedOff) at WaterDamageQuestionsPanelSet.pcf: line 28, column 87
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      aClaim.PropertyWaterDamage.HasWaterBeenTurnedOff = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=WaterSource) at WaterDamageQuestionsPanelSet.pcf: line 18, column 43
    function valueRoot_3 () : java.lang.Object {
      return aClaim.PropertyWaterDamage
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=WaterSource) at WaterDamageQuestionsPanelSet.pcf: line 18, column 43
    function value_0 () : typekey.WaterSource {
      return aClaim.PropertyWaterDamage.WaterSource
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsRoofCovered) at WaterDamageQuestionsPanelSet.pcf: line 34, column 72
    function value_11 () : java.lang.Boolean {
      return aClaim.PropertyWaterDamage.IsRoofProtected
    }
    
    // 'value' attribute on BooleanRadioInput (id=HasWaterBeenTurnedOff) at WaterDamageQuestionsPanelSet.pcf: line 28, column 87
    function value_5 () : java.lang.Boolean {
      return aClaim.PropertyWaterDamage.HasWaterBeenTurnedOff
    }
    
    // 'visible' attribute on BooleanRadioInput (id=IsRoofCovered) at WaterDamageQuestionsPanelSet.pcf: line 34, column 72
    function visible_10 () : java.lang.Boolean {
      return aClaim.PropertyWaterDamage.WaterSource == TC_ROOF
    }
    
    // 'visible' attribute on BooleanRadioInput (id=HasWaterBeenTurnedOff) at WaterDamageQuestionsPanelSet.pcf: line 28, column 87
    function visible_4 () : java.lang.Boolean {
      return aClaim.PropertyWaterDamage.WaterSource == TC_PLUMBING_APPLIANCES
    }
    
    property get aClaim () : Claim {
      return getRequireValue("aClaim", 0) as Claim
    }
    
    property set aClaim ($arg :  Claim) {
      setRequireValue("aClaim", 0, $arg)
    }
    
    
  }
  
  
}