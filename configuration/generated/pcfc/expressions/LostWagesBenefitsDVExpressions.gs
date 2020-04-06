package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LostWagesBenefitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/LostWagesBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LostWagesBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at LostWagesBenefitsDV.pcf: line 21, column 27
    function def_onEnter_1 (def :  pcf.EditableBenefitPeriodsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef (id=TTD) at LostWagesBenefitsDV.pcf: line 54, column 19
    function def_onEnter_20 (def :  pcf.WCBenefitTTDInputSet) : void {
      def.onEnter(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=TPD) at LostWagesBenefitsDV.pcf: line 58, column 19
    function def_onEnter_22 (def :  pcf.WCBenefitTPDInputSet) : void {
      def.onEnter(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=WPInputSet) at LostWagesBenefitsDV.pcf: line 63, column 26
    function def_onEnter_24 (def :  pcf.WaitingPeriodInputSet) : void {
      def.onEnter(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=PTD) at LostWagesBenefitsDV.pcf: line 72, column 19
    function def_onEnter_26 (def :  pcf.WCBenefitPTDInputSet) : void {
      def.onEnter(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=PPD) at LostWagesBenefitsDV.pcf: line 76, column 19
    function def_onEnter_28 (def :  pcf.WCBenefitPPDInputSet) : void {
      def.onEnter(Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=OtherJurisdictionalFactors) at LostWagesBenefitsDV.pcf: line 94, column 27
    function def_onEnter_34 (def :  pcf.WCBenefitFactorsLV) : void {
      def.onEnter(ReferenceData)
    }
    
    // 'def' attribute on ListViewInput at LostWagesBenefitsDV.pcf: line 102, column 27
    function def_onEnter_36 (def :  pcf.EditableSettlementsLV) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on ListViewInput at LostWagesBenefitsDV.pcf: line 21, column 27
    function def_refreshVariables_2 (def :  pcf.EditableBenefitPeriodsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef (id=TTD) at LostWagesBenefitsDV.pcf: line 54, column 19
    function def_refreshVariables_21 (def :  pcf.WCBenefitTTDInputSet) : void {
      def.refreshVariables(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=TPD) at LostWagesBenefitsDV.pcf: line 58, column 19
    function def_refreshVariables_23 (def :  pcf.WCBenefitTPDInputSet) : void {
      def.refreshVariables(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=WPInputSet) at LostWagesBenefitsDV.pcf: line 63, column 26
    function def_refreshVariables_25 (def :  pcf.WaitingPeriodInputSet) : void {
      def.refreshVariables(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=PTD) at LostWagesBenefitsDV.pcf: line 72, column 19
    function def_refreshVariables_27 (def :  pcf.WCBenefitPTDInputSet) : void {
      def.refreshVariables(Exposure.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=PPD) at LostWagesBenefitsDV.pcf: line 76, column 19
    function def_refreshVariables_29 (def :  pcf.WCBenefitPPDInputSet) : void {
      def.refreshVariables(Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput (id=OtherJurisdictionalFactors) at LostWagesBenefitsDV.pcf: line 94, column 27
    function def_refreshVariables_35 (def :  pcf.WCBenefitFactorsLV) : void {
      def.refreshVariables(ReferenceData)
    }
    
    // 'def' attribute on ListViewInput at LostWagesBenefitsDV.pcf: line 102, column 27
    function def_refreshVariables_37 (def :  pcf.EditableSettlementsLV) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on CurrencyInput (id=WageAmtPostInjury) at LostWagesBenefitsDV.pcf: line 43, column 71
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.EmploymentData.WageAmountPostInjury   = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at LostWagesBenefitsDV.pcf: line 50, column 43
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at LostWagesBenefitsDV.pcf: line 85, column 55
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.DeathBenefits.MaxBurialRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=AWW) at LostWagesBenefitsDV.pcf: line 37, column 61
    function defaultSetter_7 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.Claim.EmploymentData.WageAmount   = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Jurisdiction) at LostWagesBenefitsDV.pcf: line 50, column 43
    function filter_19 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'initialValue' attribute on Variable at LostWagesBenefitsDV.pcf: line 15, column 37
    function initialValue_0 () : WCBenefitParameterSet {
      return Exposure.Claim.findWCBeneCalcRef()
    }
    
    // 'label' attribute on CurrencyInput (id=AWW) at LostWagesBenefitsDV.pcf: line 37, column 61
    function label_3 () : java.lang.Object {
      return DisplayKey.get("NVV.Exposure.LostWagesBenefits.WageAmountPreInjury")  
    }
    
    // 'label' attribute on CurrencyInput (id=WageAmtPostInjury) at LostWagesBenefitsDV.pcf: line 43, column 71
    function label_9 () : java.lang.Object {
      return DisplayKey.get("NVV.Exposure.LostWagesBenefits.WageAmountPostInjury")  
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at LostWagesBenefitsDV.pcf: line 50, column 43
    function valueRoot_18 () : java.lang.Object {
      return Exposure.Claim
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at LostWagesBenefitsDV.pcf: line 85, column 55
    function valueRoot_33 () : java.lang.Object {
      return Exposure.DeathBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=AWW) at LostWagesBenefitsDV.pcf: line 37, column 61
    function valueRoot_8 () : java.lang.Object {
      return Exposure.Claim.EmploymentData
    }
    
    // 'value' attribute on CurrencyInput (id=WageAmtPostInjury) at LostWagesBenefitsDV.pcf: line 43, column 71
    function value_10 () : gw.api.financials.CurrencyAmount {
      return Exposure.Claim.EmploymentData.WageAmountPostInjury  
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at LostWagesBenefitsDV.pcf: line 50, column 43
    function value_15 () : typekey.Jurisdiction {
      return Exposure.Claim.JurisdictionState
    }
    
    // 'value' attribute on CurrencyInput (id=Death_MaxBurialRate) at LostWagesBenefitsDV.pcf: line 85, column 55
    function value_30 () : gw.api.financials.CurrencyAmount {
      return Exposure.DeathBenefits.MaxBurialRate
    }
    
    // 'value' attribute on CurrencyInput (id=AWW) at LostWagesBenefitsDV.pcf: line 37, column 61
    function value_4 () : gw.api.financials.CurrencyAmount {
      return Exposure.Claim.EmploymentData.WageAmount  
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    property get ReferenceData () : WCBenefitParameterSet {
      return getVariableValue("ReferenceData", 0) as WCBenefitParameterSet
    }
    
    property set ReferenceData ($arg :  WCBenefitParameterSet) {
      setVariableValue("ReferenceData", 0, $arg)
    }
    
    
  }
  
  
}