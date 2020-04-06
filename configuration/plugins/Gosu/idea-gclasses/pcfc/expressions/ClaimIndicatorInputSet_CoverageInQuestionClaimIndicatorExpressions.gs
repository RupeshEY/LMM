package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_CoverageInQuestionClaimIndicatorExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 40, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      indicator.Claim.CoverageInQuestion = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 40, column 45
    function editable_8 () : java.lang.Boolean {
      return editCovInQuestion()
    }
    
    // 'icon' attribute on Link (id=CoverageInQuestionIcon) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 28, column 35
    function icon_3 () : java.lang.String {
      return indicator.Icon
    }
    
    // 'initialValue' attribute on Variable at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 15, column 23
    function initialValue_0 () : boolean {
      return CurrentLocation.InEditMode
    }
    
    // 'initialValue' attribute on Variable at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 19, column 75
    function initialValue_1 () : java.util.HashMap<java.lang.Object, java.lang.Object> {
      return indicator.Claim.getCoverageInQuestionFactors()
    }
    
    // 'label' attribute on Link (id=CoverageInQuestionText) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 31, column 33
    function label_5 () : java.lang.Object {
      return indicator.Text
    }
    
    // 'tooltip' attribute on Link (id=CoverageInQuestionIcon) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 28, column 35
    function tooltip_4 () : java.lang.String {
      return indicator.HoverText
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 40, column 45
    function valueRoot_15 () : java.lang.Object {
      return indicator.Claim
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyStatusReason) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 51, column 143
    function valueRoot_20 () : java.lang.Object {
      return indicator.Claim.Policy
    }
    
    // 'value' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 40, column 45
    function value_10 () : java.lang.Boolean {
      return indicator.Claim.CoverageInQuestion
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyStatusReason) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 51, column 143
    function value_17 () : typekey.PolicyStatus {
      return indicator.Claim.Policy.Status
    }
    
    // 'value' attribute on TextInput (id=LossDateReason) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 57, column 139
    function value_22 () : java.lang.Object {
      return coverageInQuestionFactors.get(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.LossDate"))
    }
    
    // 'visible' attribute on TypeKeyInput (id=PolicyStatusReason) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 51, column 143
    function visible_16 () : java.lang.Boolean {
      return coverageInQuestionFactors.containsKey(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.PolicyStatus"))
    }
    
    // 'visible' attribute on Link (id=CoverageInQuestionIcon) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 28, column 35
    function visible_2 () : java.lang.Boolean {
      return indicator.IsOn
    }
    
    // 'visible' attribute on TextInput (id=LossDateReason) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 57, column 139
    function visible_21 () : java.lang.Boolean {
      return coverageInQuestionFactors.containsKey(DisplayKey.get("Web.Claim.CoverageInQuestionClaimIndicator.LossDate"))
    }
    
    // 'visible' attribute on InputSet at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 42, column 89
    function visible_25 () : java.lang.Boolean {
      return !coverageInQuestionFactors.Empty and indicator.Claim.CoverageInQuestion
    }
    
    // 'visible' attribute on ContentInput (id=CoverageInQuestionOnLabel) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 23, column 29
    function visible_6 () : java.lang.Boolean {
      return !inEditMode
    }
    
    // 'visible' attribute on BooleanRadioInput (id=CoverageInQuestion) at ClaimIndicatorInputSet.CoverageInQuestionClaimIndicator.pcf: line 40, column 45
    function visible_9 () : java.lang.Boolean {
      return CurrentLocation.InEditMode
    }
    
    property get coverageInQuestionFactors () : java.util.HashMap<java.lang.Object, java.lang.Object> {
      return getVariableValue("coverageInQuestionFactors", 0) as java.util.HashMap<java.lang.Object, java.lang.Object>
    }
    
    property set coverageInQuestionFactors ($arg :  java.util.HashMap<java.lang.Object, java.lang.Object>) {
      setVariableValue("coverageInQuestionFactors", 0, $arg)
    }
    
    property get inEditMode () : boolean {
      return getVariableValue("inEditMode", 0) as java.lang.Boolean
    }
    
    property set inEditMode ($arg :  boolean) {
      setVariableValue("inEditMode", 0, $arg)
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    // Used to allow editing the CoverageInQuestion field. Allow editing the field if the value is not true, otherwise only
    // allow editing if the user has the unsetcovinquestion permission   
    function editCovInQuestion() : Boolean{
       if( indicator.Claim.CoverageInQuestion != true)
         return true
       else if(indicator.Claim.CoverageInQuestion == true and perm.System.unsetcovinquestion == true) 
         return true
       return false    
    }
    
    
  }
  
  
}