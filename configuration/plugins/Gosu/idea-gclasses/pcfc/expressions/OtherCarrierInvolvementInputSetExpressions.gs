package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherCarrierInvolvementInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/OtherCarrierInvolvementInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCarrierInvolvementInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at OtherCarrierInvolvementInputSet.pcf: line 22, column 25
    function def_onEnter_4 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at OtherCarrierInvolvementInputSet.pcf: line 22, column 25
    function def_refreshVariables_5 (def :  pcf.EditableOtherCoverageDetailsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at OtherCarrierInvolvementInputSet.pcf: line 17, column 39
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherCoverage = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at OtherCarrierInvolvementInputSet.pcf: line 17, column 39
    function valueRoot_3 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on BooleanRadioInput (id=Claimant_OtherCoverage) at OtherCarrierInvolvementInputSet.pcf: line 17, column 39
    function value_0 () : java.lang.Boolean {
      return Exposure.OtherCoverage
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}