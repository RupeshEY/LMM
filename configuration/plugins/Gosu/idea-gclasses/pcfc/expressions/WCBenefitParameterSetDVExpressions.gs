package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WCBenefitParameterSetDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/wcparms/WCBenefitParameterSetDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCBenefitParameterSetDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput (id=Factors) at WCBenefitParameterSetDV.pcf: line 195, column 27
    function def_onEnter_121 (def :  pcf.WCBenefitFactorsLV) : void {
      def.onEnter(WCBenefitParameterSet)
    }
    
    // 'def' attribute on ListViewInput (id=Factors) at WCBenefitParameterSetDV.pcf: line 195, column 27
    function def_refreshVariables_122 (def :  pcf.WCBenefitFactorsLV) : void {
      def.refreshVariables(WCBenefitParameterSet)
    }
    
    // 'value' attribute on TextInput (id=PPDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 168, column 43
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PPDPercentOfWages = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=PPDMax) at WCBenefitParameterSetDV.pcf: line 175, column 43
    function defaultSetter_109 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PPDMax = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=PPDMin) at WCBenefitParameterSetDV.pcf: line 182, column 43
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PPDMin = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PPDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 187, column 55
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PPDMinAdjToAWW = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WCBenefitParameterSetDV.pcf: line 36, column 48
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=RateCommentsw) at WCBenefitParameterSetDV.pcf: line 41, column 53
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.RateComments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at WCBenefitParameterSetDV.pcf: line 22, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.JurisdictionState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TextInput (id=TTDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 51, column 43
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TTDPercentOfWages = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=TTDMax) at WCBenefitParameterSetDV.pcf: line 58, column 43
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TTDMax = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=TTDMin) at WCBenefitParameterSetDV.pcf: line 65, column 43
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TTDMin = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TTDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 70, column 55
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TTDMinAdjToAWW = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=TPDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 80, column 43
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TPDPercentOfWages = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=TPDMax) at WCBenefitParameterSetDV.pcf: line 87, column 43
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TPDMax = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=TPDMin) at WCBenefitParameterSetDV.pcf: line 94, column 43
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TPDMin = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TPDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 99, column 55
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.TPDMinAdjToAWW = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=WaitingPeriodDays) at WCBenefitParameterSetDV.pcf: line 112, column 40
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.WaitingPeriodDays = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=RetroactivePeriod) at WCBenefitParameterSetDV.pcf: line 119, column 40
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.RetroactivePeriod = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on CheckBoxInput (id=WPNotAppliedToPTD) at WCBenefitParameterSetDV.pcf: line 124, column 58
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.WPNotAppliedToPTD = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on CheckBoxInput (id=WPNotAppliedToPPD) at WCBenefitParameterSetDV.pcf: line 129, column 58
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.WPNotAppliedToPPD = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=PTDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 139, column 43
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PTDPercentOfWages = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=TPTDMax) at WCBenefitParameterSetDV.pcf: line 146, column 43
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PTDMax = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WCBenefitParameterSetDV.pcf: line 29, column 50
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=PTDMin) at WCBenefitParameterSetDV.pcf: line 153, column 43
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PTDMin = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on BooleanRadioInput (id=PTDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 158, column 55
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      WCBenefitParameterSet.PTDMinAdjToAWW = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Jurisdiction) at WCBenefitParameterSetDV.pcf: line 22, column 43
    function filter_4 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_INSURANCE)
    }
    
    // 'validationExpression' attribute on TextInput (id=PPDMax) at WCBenefitParameterSetDV.pcf: line 175, column 43
    function validationExpression_105 () : java.lang.Object {
      return validatePPDBenefit(WCBenefitParameterSet.PPDMin, WCBenefitParameterSet.PPDMax)
    }
    
    // 'validationExpression' attribute on TextInput (id=TTDMax) at WCBenefitParameterSetDV.pcf: line 58, column 43
    function validationExpression_25 () : java.lang.Object {
      return validateTTDBenefit(WCBenefitParameterSet.TTDMin, WCBenefitParameterSet.TTDMax)
    }
    
    // 'validationExpression' attribute on TextInput (id=TPDMax) at WCBenefitParameterSetDV.pcf: line 87, column 43
    function validationExpression_45 () : java.lang.Object {
      return validateTPDBenefit(WCBenefitParameterSet.TPDMin, WCBenefitParameterSet.TPDMax)
    }
    
    // 'validationExpression' attribute on DateInput (id=StartDate) at WCBenefitParameterSetDV.pcf: line 29, column 50
    function validationExpression_5 () : java.lang.Object {
      return validateThisDate()
    }
    
    // 'validationExpression' attribute on TextInput (id=WaitingPeriodDays) at WCBenefitParameterSetDV.pcf: line 112, column 40
    function validationExpression_61 () : java.lang.Object {
      return WCBenefitParameterSet.WaitingPeriodDays < 0 ? DisplayKey.get("DV.Admin.WCBenefitParameterSet.Message.NegativeNumberOfDays") : null
    }
    
    // 'validationExpression' attribute on TextInput (id=RetroactivePeriod) at WCBenefitParameterSetDV.pcf: line 119, column 40
    function validationExpression_67 () : java.lang.Object {
      return WCBenefitParameterSet.RetroactivePeriod < 0 ?  DisplayKey.get("DV.Admin.WCBenefitParameterSet.Message.NegativeRetroactivePeriod") : null
    }
    
    // 'validationExpression' attribute on TextInput (id=TPTDMax) at WCBenefitParameterSetDV.pcf: line 146, column 43
    function validationExpression_85 () : java.lang.Object {
      return validatePTDBenefit(WCBenefitParameterSet.PTDMin, WCBenefitParameterSet.PTDMax)
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at WCBenefitParameterSetDV.pcf: line 22, column 43
    function valueRoot_3 () : java.lang.Object {
      return WCBenefitParameterSet
    }
    
    // 'value' attribute on TypeKeyInput (id=Jurisdiction) at WCBenefitParameterSetDV.pcf: line 22, column 43
    function value_0 () : typekey.Jurisdiction {
      return WCBenefitParameterSet.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=PPDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 168, column 43
    function value_101 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PPDPercentOfWages
    }
    
    // 'value' attribute on TextInput (id=PPDMax) at WCBenefitParameterSetDV.pcf: line 175, column 43
    function value_106 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PPDMax
    }
    
    // 'value' attribute on TextInput (id=PPDMin) at WCBenefitParameterSetDV.pcf: line 182, column 43
    function value_112 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PPDMin
    }
    
    // 'value' attribute on BooleanRadioInput (id=PPDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 187, column 55
    function value_117 () : java.lang.Boolean {
      return WCBenefitParameterSet.PPDMinAdjToAWW
    }
    
    // 'value' attribute on DateInput (id=EndDate) at WCBenefitParameterSetDV.pcf: line 36, column 48
    function value_12 () : java.util.Date {
      return WCBenefitParameterSet.EndDate
    }
    
    // 'value' attribute on TextInput (id=RateCommentsw) at WCBenefitParameterSetDV.pcf: line 41, column 53
    function value_17 () : java.lang.String {
      return WCBenefitParameterSet.RateComments
    }
    
    // 'value' attribute on TextInput (id=TTDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 51, column 43
    function value_21 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TTDPercentOfWages
    }
    
    // 'value' attribute on TextInput (id=TTDMax) at WCBenefitParameterSetDV.pcf: line 58, column 43
    function value_26 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TTDMax
    }
    
    // 'value' attribute on TextInput (id=TTDMin) at WCBenefitParameterSetDV.pcf: line 65, column 43
    function value_32 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TTDMin
    }
    
    // 'value' attribute on BooleanRadioInput (id=TTDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 70, column 55
    function value_37 () : java.lang.Boolean {
      return WCBenefitParameterSet.TTDMinAdjToAWW
    }
    
    // 'value' attribute on TextInput (id=TPDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 80, column 43
    function value_41 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TPDPercentOfWages
    }
    
    // 'value' attribute on TextInput (id=TPDMax) at WCBenefitParameterSetDV.pcf: line 87, column 43
    function value_46 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TPDMax
    }
    
    // 'value' attribute on TextInput (id=TPDMin) at WCBenefitParameterSetDV.pcf: line 94, column 43
    function value_52 () : java.math.BigDecimal {
      return WCBenefitParameterSet.TPDMin
    }
    
    // 'value' attribute on BooleanRadioInput (id=TPDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 99, column 55
    function value_57 () : java.lang.Boolean {
      return WCBenefitParameterSet.TPDMinAdjToAWW
    }
    
    // 'value' attribute on DateInput (id=StartDate) at WCBenefitParameterSetDV.pcf: line 29, column 50
    function value_6 () : java.util.Date {
      return WCBenefitParameterSet.StartDate
    }
    
    // 'value' attribute on TextInput (id=WaitingPeriodDays) at WCBenefitParameterSetDV.pcf: line 112, column 40
    function value_62 () : java.lang.Integer {
      return WCBenefitParameterSet.WaitingPeriodDays
    }
    
    // 'value' attribute on TextInput (id=RetroactivePeriod) at WCBenefitParameterSetDV.pcf: line 119, column 40
    function value_68 () : java.lang.Integer {
      return WCBenefitParameterSet.RetroactivePeriod
    }
    
    // 'value' attribute on CheckBoxInput (id=WPNotAppliedToPTD) at WCBenefitParameterSetDV.pcf: line 124, column 58
    function value_73 () : java.lang.Boolean {
      return WCBenefitParameterSet.WPNotAppliedToPTD
    }
    
    // 'value' attribute on CheckBoxInput (id=WPNotAppliedToPPD) at WCBenefitParameterSetDV.pcf: line 129, column 58
    function value_77 () : java.lang.Boolean {
      return WCBenefitParameterSet.WPNotAppliedToPPD
    }
    
    // 'value' attribute on TextInput (id=PTDPercentOfWages) at WCBenefitParameterSetDV.pcf: line 139, column 43
    function value_81 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PTDPercentOfWages
    }
    
    // 'value' attribute on TextInput (id=TPTDMax) at WCBenefitParameterSetDV.pcf: line 146, column 43
    function value_86 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PTDMax
    }
    
    // 'value' attribute on TextInput (id=PTDMin) at WCBenefitParameterSetDV.pcf: line 153, column 43
    function value_92 () : java.math.BigDecimal {
      return WCBenefitParameterSet.PTDMin
    }
    
    // 'value' attribute on BooleanRadioInput (id=PTDMinAdjToAWW) at WCBenefitParameterSetDV.pcf: line 158, column 55
    function value_97 () : java.lang.Boolean {
      return WCBenefitParameterSet.PTDMinAdjToAWW
    }
    
    property get WCBenefitParameterSet () : WCBenefitParameterSet {
      return getRequireValue("WCBenefitParameterSet", 0) as WCBenefitParameterSet
    }
    
    property set WCBenefitParameterSet ($arg :  WCBenefitParameterSet) {
      setRequireValue("WCBenefitParameterSet", 0, $arg)
    }
    
    
    function validateThisDate() : String {
      if (WCBenefitParameterSet.StartDate > WCBenefitParameterSet.EndDate ) {
         return DisplayKey.get("Rules.Validation.Admin.EffDateGTExpiryDate")
      } else {
        return null
      }
    }
    
    function validateTTDBenefit(min : java.math.BigDecimal, max : java.math.BigDecimal) : String {
      if (testMinMax( min, max )) {
        return DisplayKey.get("DV.Admin.WCBenefitParameterSet.TTD.MinMaxException")
      } else {    
        return null
      }
    }
    
    function validateTPDBenefit(min : java.math.BigDecimal, max : java.math.BigDecimal) : String {
      if (testMinMax( min, max )) {
        return DisplayKey.get("DV.Admin.WCBenefitParameterSet.TPD.MinMaxException")
      } else {
        return null
      }
    }
    
    function validatePTDBenefit(min : java.math.BigDecimal, max : java.math.BigDecimal) : String {
      if (testMinMax( min, max )) {
        return DisplayKey.get("DV.Admin.WCBenefitParameterSet.PTD.MinMaxException")
      } else {
        return null
      }
    }
    
    function validatePPDBenefit(min : java.math.BigDecimal, max : java.math.BigDecimal) : String {
      if (testMinMax( min, max )) {
        return DisplayKey.get("DV.Admin.WCBenefitParameterSet.PPD.MinMaxException")
      } else {
        return null
      }
    }
    
    private function testMinMax(min : java.math.BigDecimal, max : java.math.BigDecimal) : boolean {
      return (min != null and max != null) and (min > max)  
    }
          
        
    
    
  }
  
  
}