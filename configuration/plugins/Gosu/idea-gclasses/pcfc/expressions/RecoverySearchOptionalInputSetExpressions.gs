package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoverySearchOptionalInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoverySearchOptionalInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function available_15 () : java.lang.Boolean {
      return (true)                         and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or RecoverySearchCriteria.FinancialCriterion.Currency != null)                         and (RecoverySearchCriteria.FinancialCriterion.Options.length == 0 or RecoverySearchCriteria.FinancialCriterion.ChosenOption != null)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function available_47 () : java.lang.Boolean {
      return RecoverySearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function available_57 () : java.lang.Boolean {
      return RecoverySearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function available_7 () : java.lang.Boolean {
      return (true)                                    and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or RecoverySearchCriteria.FinancialCriterion.Currency != null)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.FinancialCriterion.AmountStart = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.FinancialCriterion.AmountEnd = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at RecoverySearchOptionalInputSet.pcf: line 25, column 46
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.RecoveryStatus = (__VALUE_TO_SET as typekey.TransactionStatus)
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at RecoverySearchOptionalInputSet.pcf: line 32, column 37
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.CostType = (__VALUE_TO_SET as typekey.CostType)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoverySearchOptionalInputSet.pcf: line 39, column 45
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.RecoveryCategory = (__VALUE_TO_SET as typekey.RecoveryCategory)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.FinancialCriterion.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_61 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.DateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoverySearchCriteria.FinancialCriterion.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'format' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function format_16 () : java.lang.String {
      return gw.api.util.CurrencyUtil.getCurrencyFormatExpression(RecoverySearchCriteria.FinancialCriterion.Currency)
    }
    
    // 'optionLabel' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function optionLabel_11 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.locale.DisplayKey.get(VALUE)
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function valueRange_12 () : java.lang.Object {
      return RecoverySearchCriteria.FinancialCriterion.Options
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function valueRange_44 () : java.lang.Object {
      return RecoverySearchCriteria.DateCriterionChoice.Options
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at RecoverySearchOptionalInputSet.pcf: line 18, column 58
    function valueRoot_26 () : java.lang.Object {
      return RecoverySearchCriteria
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function valueRoot_42 () : java.lang.Object {
      return RecoverySearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function valueRoot_5 () : java.lang.Object {
      return RecoverySearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at RecoverySearchOptionalInputSet.pcf: line 18, column 58
    function value_0 () : entity.FinancialCriterionMC {
      return RecoverySearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function value_17 () : java.math.BigDecimal {
      return RecoverySearchCriteria.FinancialCriterion.AmountStart
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function value_22 () : java.math.BigDecimal {
      return RecoverySearchCriteria.FinancialCriterion.AmountEnd
    }
    
    // 'value' attribute on TypeKeyInput (id=Status) at RecoverySearchOptionalInputSet.pcf: line 25, column 46
    function value_27 () : typekey.TransactionStatus {
      return RecoverySearchCriteria.RecoveryStatus
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function value_3 () : typekey.Currency {
      return RecoverySearchCriteria.FinancialCriterion.Currency
    }
    
    // 'value' attribute on TypeKeyInput (id=CostType) at RecoverySearchOptionalInputSet.pcf: line 32, column 37
    function value_31 () : typekey.CostType {
      return RecoverySearchCriteria.CostType
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoverySearchOptionalInputSet.pcf: line 39, column 45
    function value_35 () : typekey.RecoveryCategory {
      return RecoverySearchCriteria.RecoveryCategory
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_39 () : entity.DateCriterionChoice {
      return RecoverySearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_40 () : java.lang.String {
      return RecoverySearchCriteria.DateCriterionChoice.ChosenOption
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_48 () : java.lang.Object {
      return RecoverySearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_50 () : typekey.DateRangeChoiceType {
      return RecoverySearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_53 () : typekey.DateSearchType {
      return RecoverySearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_56 () : java.lang.Object {
      return RecoverySearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_58 () : java.util.Date {
      return RecoverySearchCriteria.DateCriterionChoice.StartDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function value_64 () : java.util.Date {
      return RecoverySearchCriteria.DateCriterionChoice.EndDate
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function value_8 () : java.lang.String {
      return RecoverySearchCriteria.FinancialCriterion.ChosenOption
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function verifyValueRangeIsAllowedType_45 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function verifyValueRangeIsAllowedType_45 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRange_14 () : void {
      var __valueRangeArg = RecoverySearchCriteria.FinancialCriterion.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at RecoverySearchOptionalInputSet.pcf: line 46, column 59
    function verifyValueRange_46 () : void {
      var __valueRangeArg = RecoverySearchCriteria.DateCriterionChoice.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_45(__valueRangeArg)
    }
    
    // 'visible' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=Amount) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 11, column 72
    function visible_1 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get RecoverySearchCriteria () : RecoverySearchCriteria {
      return getRequireValue("RecoverySearchCriteria", 0) as RecoverySearchCriteria
    }
    
    property set RecoverySearchCriteria ($arg :  RecoverySearchCriteria) {
      setRequireValue("RecoverySearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}