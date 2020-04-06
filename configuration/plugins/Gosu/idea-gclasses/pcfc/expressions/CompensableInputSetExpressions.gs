package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CompensableInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensableInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on TypeKeyInput (id=CompensableStatus) at CompensableInputSet.pcf: line 26, column 50
    function available_6 () : java.lang.Boolean {
      return Claim.isAllWCCompensabilityFactorsAnswered()
    }
    
    // 'value' attribute on TypeKeyInput (id=CompensableStatus) at CompensableInputSet.pcf: line 26, column 50
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.Compensable = (__VALUE_TO_SET as typekey.CompensabilityDecision)
    }
    
    // 'value' attribute on TypeKeyInput (id=PartialDenialReason) at CompensableInputSet.pcf: line 37, column 79
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.PartialDenialReason = (__VALUE_TO_SET as typekey.PartialDenialReason)
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_FullDenialEffectiveDate) at CompensableInputSet.pcf: line 52, column 72
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.FullDenialEffectiveDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_DueDate) at CompensableInputSet.pcf: line 18, column 44
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.DateCompDcsnDue = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextAreaInput (id=CompensabilityDecision_BenefitsDecisionReason) at CompensableInputSet.pcf: line 96, column 45
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.BenefitsDecisionReason = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'helpText' attribute on TypeKeyInput (id=CompensableStatus) at CompensableInputSet.pcf: line 26, column 50
    function helpText_9 () : java.lang.String {
      return Claim.isAllWCCompensabilityFactorsAnswered() ? "" : DisplayKey.get("NVV.Claim.SubView.LossDetailsWorkersComp.Claim.CompensabilityDecision.CompensableStatus.Tooltip")
    }
    
    // 'required' attribute on TextAreaInput (id=CompensabilityDecision_BenefitsDecisionReason) at CompensableInputSet.pcf: line 96, column 45
    function required_45 () : java.lang.Boolean {
      return Claim.Compensable == TC_DENIED
    }
    
    // 'value' attribute on RowIterator (id=DenialReasonCodes) at CompensableInputSet.pcf: line 84, column 53
    function sortValue_32 (denialReason :  entity.FullDenialReason) : java.lang.Object {
      return denialReason.FullDenialReasonCode
    }
    
    // 'toCreateAndAdd' attribute on RowIterator (id=DenialReasonCodes) at CompensableInputSet.pcf: line 75, column 49
    function toCreateAndAdd_38 () : entity.FullDenialReason {
      return Claim.createNewFullDenialReason()
    }
    
    // 'toRemove' attribute on RowIterator (id=DenialReasonCodes) at CompensableInputSet.pcf: line 75, column 49
    function toRemove_39 (denialReason :  entity.FullDenialReason) : void {
      Claim.removeFromFullDenialReasons(denialReason)
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_DueDate) at CompensableInputSet.pcf: line 18, column 44
    function valueRoot_5 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_DueDate) at CompensableInputSet.pcf: line 18, column 44
    function value_1 () : java.util.Date {
      return Claim.DateCompDcsnDue
    }
    
    // 'value' attribute on TypeKeyInput (id=PartialDenialReason) at CompensableInputSet.pcf: line 37, column 79
    function value_14 () : typekey.PartialDenialReason {
      return Claim.PartialDenialReason
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_DecisionMadeDate) at CompensableInputSet.pcf: line 44, column 79
    function value_21 () : java.util.Date {
      return Claim.DateCompDcsnMade
    }
    
    // 'value' attribute on DateInput (id=CompensabilityDecision_FullDenialEffectiveDate) at CompensableInputSet.pcf: line 52, column 72
    function value_26 () : java.util.Date {
      return Claim.FullDenialEffectiveDate
    }
    
    // 'value' attribute on RowIterator (id=DenialReasonCodes) at CompensableInputSet.pcf: line 75, column 49
    function value_40 () : entity.FullDenialReason[] {
      return Claim.FullDenialReasons
    }
    
    // 'value' attribute on TextAreaInput (id=CompensabilityDecision_BenefitsDecisionReason) at CompensableInputSet.pcf: line 96, column 45
    function value_43 () : java.lang.String {
      return Claim.BenefitsDecisionReason
    }
    
    // 'value' attribute on TypeKeyInput (id=CompensableStatus) at CompensableInputSet.pcf: line 26, column 50
    function value_7 () : typekey.CompensabilityDecision {
      return Claim.Compensable
    }
    
    // 'visible' attribute on DateInput (id=CompensabilityDecision_DueDate) at CompensableInputSet.pcf: line 18, column 44
    function visible_0 () : java.lang.Boolean {
      return Claim.Compensable == null
    }
    
    // 'visible' attribute on TypeKeyInput (id=PartialDenialReason) at CompensableInputSet.pcf: line 37, column 79
    function visible_13 () : java.lang.Boolean {
      return Claim.Compensable == CompensabilityDecision.TC_PARTIALDENIAL
    }
    
    // 'visible' attribute on DateInput (id=CompensabilityDecision_DecisionMadeDate) at CompensableInputSet.pcf: line 44, column 79
    function visible_20 () : java.lang.Boolean {
      return Claim.Compensable != null and Claim.DateCompDcsnMade != null
    }
    
    // 'visible' attribute on DateInput (id=CompensabilityDecision_FullDenialEffectiveDate) at CompensableInputSet.pcf: line 52, column 72
    function visible_25 () : java.lang.Boolean {
      return Claim.Compensable == CompensabilityDecision.TC_DENIED
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/CompensableInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CompensableInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=DenialReasonCodes) at CompensableInputSet.pcf: line 75, column 49
    function checkBoxVisible_37 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'value' attribute on TypeKeyCell (id=Code) at CompensableInputSet.pcf: line 84, column 53
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      denialReason.FullDenialReasonCode = (__VALUE_TO_SET as typekey.FullDenialReason)
    }
    
    // 'value' attribute on TypeKeyCell (id=Code) at CompensableInputSet.pcf: line 84, column 53
    function valueRoot_36 () : java.lang.Object {
      return denialReason
    }
    
    // 'value' attribute on TypeKeyCell (id=Code) at CompensableInputSet.pcf: line 84, column 53
    function value_33 () : typekey.FullDenialReason {
      return denialReason.FullDenialReasonCode
    }
    
    property get denialReason () : entity.FullDenialReason {
      return getIteratedValue(1) as entity.FullDenialReason
    }
    
    
  }
  
  
}