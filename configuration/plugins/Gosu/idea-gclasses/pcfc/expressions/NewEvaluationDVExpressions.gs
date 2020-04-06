package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newother/NewEvaluationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewEvaluationDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newother/NewEvaluationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewEvaluationDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_InsuredLiability) at NewEvaluationDV.pcf: line 38, column 42
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.InsuredLiability = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_ClaimantLiability) at NewEvaluationDV.pcf: line 48, column 43
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.ClaimantLiability = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=SettlementCostEstimate_Name) at NewEvaluationDV.pcf: line 19, column 34
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_OtherLiability) at NewEvaluationDV.pcf: line 55, column 43
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.OtherLiability = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_HospitalER) at NewEvaluationDV.pcf: line 65, column 39
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.HospitalER = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_TreatingPhysician) at NewEvaluationDV.pcf: line 75, column 46
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.TreatingPhysician = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_PhysicalTherapy) at NewEvaluationDV.pcf: line 85, column 44
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.PhysicalTherapy = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_Diagnostic) at NewEvaluationDV.pcf: line 95, column 39
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Diagnostic = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_MedicalEquipment) at NewEvaluationDV.pcf: line 105, column 45
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.MedicalEquipment = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_FutureMedical) at NewEvaluationDV.pcf: line 115, column 42
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.FutureMedical = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_ClmtOutOfPocket) at NewEvaluationDV.pcf: line 125, column 44
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.ClmtOutOfPocket = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_Other) at NewEvaluationDV.pcf: line 135, column 34
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Other = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.RelatedTo = (__VALUE_TO_SET as gw.pl.persistence.core.Bean)
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_Low) at NewEvaluationDV.pcf: line 155, column 32
    function defaultSetter_62 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Low = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_High) at NewEvaluationDV.pcf: line 165, column 33
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.High = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_Likely) at NewEvaluationDV.pcf: line 175, column 35
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Likely = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=TotalValue_Amount) at NewEvaluationDV.pcf: line 206, column 36
    function defaultSetter_80 (__VALUE_TO_SET :  java.lang.Object) : void {
      Evaluation.Amount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'optionGroupLabel' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function optionGroupLabel_8 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionGroupLabel(VALUE as KeyableBean)
    }
    
    // 'optionLabel' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function optionLabel_9 (VALUE :  gw.pl.persistence.core.Bean) : java.lang.String {
      return gw.pcf.RelatedToUtil.getOptionLabel(VALUE as KeyableBean)
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function valueRange_10 () : java.lang.Object {
      return Evaluation.Claim.RelatedToCandidates
    }
    
    // 'value' attribute on TextInput (id=SettlementCostEstimate_Name) at NewEvaluationDV.pcf: line 19, column 34
    function valueRoot_3 () : java.lang.Object {
      return Evaluation
    }
    
    // 'value' attribute on TextInput (id=SettlementCostEstimate_Name) at NewEvaluationDV.pcf: line 19, column 34
    function value_0 () : java.lang.String {
      return Evaluation.Name
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_InsuredLiability) at NewEvaluationDV.pcf: line 38, column 42
    function value_13 () : java.math.BigDecimal {
      return Evaluation.InsuredLiability
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_ClaimantLiability) at NewEvaluationDV.pcf: line 48, column 43
    function value_17 () : java.math.BigDecimal {
      return Evaluation.ClaimantLiability
    }
    
    // 'value' attribute on TextInput (id=LiabilityDistribution_OtherLiability) at NewEvaluationDV.pcf: line 55, column 43
    function value_21 () : java.math.BigDecimal {
      return Evaluation.OtherLiability
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_HospitalER) at NewEvaluationDV.pcf: line 65, column 39
    function value_25 () : gw.api.financials.CurrencyAmount {
      return Evaluation.HospitalER
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_TreatingPhysician) at NewEvaluationDV.pcf: line 75, column 46
    function value_29 () : gw.api.financials.CurrencyAmount {
      return Evaluation.TreatingPhysician
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_PhysicalTherapy) at NewEvaluationDV.pcf: line 85, column 44
    function value_33 () : gw.api.financials.CurrencyAmount {
      return Evaluation.PhysicalTherapy
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_Diagnostic) at NewEvaluationDV.pcf: line 95, column 39
    function value_37 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Diagnostic
    }
    
    // 'value' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function value_4 () : gw.pl.persistence.core.Bean {
      return Evaluation.RelatedTo
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_MedicalEquipment) at NewEvaluationDV.pcf: line 105, column 45
    function value_41 () : gw.api.financials.CurrencyAmount {
      return Evaluation.MedicalEquipment
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_FutureMedical) at NewEvaluationDV.pcf: line 115, column 42
    function value_45 () : gw.api.financials.CurrencyAmount {
      return Evaluation.FutureMedical
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_ClmtOutOfPocket) at NewEvaluationDV.pcf: line 125, column 44
    function value_49 () : gw.api.financials.CurrencyAmount {
      return Evaluation.ClmtOutOfPocket
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_Other) at NewEvaluationDV.pcf: line 135, column 34
    function value_53 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Other
    }
    
    // 'value' attribute on CurrencyInput (id=EconomicDamages_Total) at NewEvaluationDV.pcf: line 145, column 50
    function value_57 () : gw.api.financials.CurrencyAmount {
      return Evaluation.TotalEconomicDamages
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_Low) at NewEvaluationDV.pcf: line 155, column 32
    function value_60 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Low
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_High) at NewEvaluationDV.pcf: line 165, column 33
    function value_64 () : gw.api.financials.CurrencyAmount {
      return Evaluation.High
    }
    
    // 'value' attribute on CurrencyInput (id=NonEconomicDamages_Likely) at NewEvaluationDV.pcf: line 175, column 35
    function value_68 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Likely
    }
    
    // 'value' attribute on CurrencyInput (id=TotalValue_Low) at NewEvaluationDV.pcf: line 187, column 141
    function value_72 () : gw.api.financials.CurrencyAmount {
      return Evaluation.calculateTotalValue(Evaluation.TotalEconomicDamages.Amount, Evaluation.Low.Amount, Evaluation.InsuredLiability)
    }
    
    // 'value' attribute on CurrencyInput (id=TotalValue_High) at NewEvaluationDV.pcf: line 193, column 142
    function value_74 () : gw.api.financials.CurrencyAmount {
      return Evaluation.calculateTotalValue(Evaluation.TotalEconomicDamages.Amount, Evaluation.High.Amount, Evaluation.InsuredLiability)
    }
    
    // 'value' attribute on CurrencyInput (id=TotalValue_Likely) at NewEvaluationDV.pcf: line 199, column 144
    function value_76 () : gw.api.financials.CurrencyAmount {
      return Evaluation.calculateTotalValue(Evaluation.TotalEconomicDamages.Amount, Evaluation.Likely.Amount, Evaluation.InsuredLiability)
    }
    
    // 'value' attribute on CurrencyInput (id=TotalValue_Amount) at NewEvaluationDV.pcf: line 206, column 36
    function value_78 () : gw.api.financials.CurrencyAmount {
      return Evaluation.Amount
    }
    
    // 'value' attribute on TextInput (id=TotalValue_AvailableReserves) at NewEvaluationDV.pcf: line 210, column 62
    function value_82 () : java.lang.String {
      return Evaluation.getAvailableReservesAsCurrency()
    }
    
    // 'value' attribute on TextInput (id=TotalValue_TotalIncurredNet) at NewEvaluationDV.pcf: line 214, column 61
    function value_84 () : java.lang.String {
      return Evaluation.getTotalIncurredNetAsCurrency()
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function verifyValueRangeIsAllowedType_11 ($$arg :  gw.pl.persistence.core.Bean[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function verifyValueRangeIsAllowedType_11 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Note_RelatedTo) at NewEvaluationDV.pcf: line 30, column 50
    function verifyValueRange_12 () : void {
      var __valueRangeArg = Evaluation.Claim.RelatedToCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_11(__valueRangeArg)
    }
    
    property get Evaluation () : Evaluation {
      return getRequireValue("Evaluation", 0) as Evaluation
    }
    
    property set Evaluation ($arg :  Evaluation) {
      setRequireValue("Evaluation", 0, $arg)
    }
    
    
  }
  
  
}