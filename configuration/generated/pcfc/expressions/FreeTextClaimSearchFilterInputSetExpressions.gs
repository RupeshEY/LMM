package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchFilterInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FreeTextClaimSearchFilterInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/claims/FreeTextClaimSearchFilterInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FreeTextClaimSearchFilterInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function available_16 () : java.lang.Boolean {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function available_26 () : java.lang.Boolean {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at FreeTextClaimSearchFilterInputSet.pcf: line 19, column 34
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AddressCriteria.State = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.DateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on TextInput (id=PostalCode) at FreeTextClaimSearchFilterInputSet.pcf: line 25, column 63
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimSearchCriteria.AddressCriteria.PostalCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function optionLabel_12 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.locale.DisplayKey.get(VALUE)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function valueRange_13 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.Options
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function valueRoot_11 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at FreeTextClaimSearchFilterInputSet.pcf: line 19, column 34
    function valueRoot_3 () : java.lang.Object {
      return ClaimSearchCriteria.AddressCriteria
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function valueRoot_44 () : java.lang.Object {
      return ClaimSearchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=State) at FreeTextClaimSearchFilterInputSet.pcf: line 19, column 34
    function value_0 () : typekey.State {
      return ClaimSearchCriteria.AddressCriteria.State
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_17 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_19 () : typekey.DateRangeChoiceType {
      return ClaimSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_22 () : typekey.DateSearchType {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_25 () : java.lang.Object {
      return ClaimSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_27 () : java.util.Date {
      return ClaimSearchCriteria.DateCriterionChoice.StartDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_33 () : java.util.Date {
      return ClaimSearchCriteria.DateCriterionChoice.EndDate
    }
    
    // 'value' attribute on TextInput (id=PostalCode) at FreeTextClaimSearchFilterInputSet.pcf: line 25, column 63
    function value_4 () : java.lang.String {
      return ClaimSearchCriteria.AddressCriteria.PostalCode
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_8 () : entity.DateCriterionChoice {
      return ClaimSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function value_9 () : java.lang.String {
      return ClaimSearchCriteria.DateCriterionChoice.ChosenOption
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function verifyValueRangeIsAllowedType_14 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at FreeTextClaimSearchFilterInputSet.pcf: line 33, column 56
    function verifyValueRange_15 () : void {
      var __valueRangeArg = ClaimSearchCriteria.DateCriterionChoice.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_14(__valueRangeArg)
    }
    
    property get ClaimSearchCriteria () : ClaimSearchCriteria {
      return getRequireValue("ClaimSearchCriteria", 0) as ClaimSearchCriteria
    }
    
    property set ClaimSearchCriteria ($arg :  ClaimSearchCriteria) {
      setRequireValue("ClaimSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}