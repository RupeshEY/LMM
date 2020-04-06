package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceSearchOptionalInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchOptionalInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchOptionalInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function available_15 () : java.lang.Boolean {
      return (true)                         and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or BulkInvoiceSearchCriteria.FinancialCriterion.Currency != null)                         and (BulkInvoiceSearchCriteria.FinancialCriterion.Options.length == 0 or BulkInvoiceSearchCriteria.FinancialCriterion.ChosenOption != null)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function available_39 () : java.lang.Boolean {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_FROMLIST
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function available_49 () : java.lang.Boolean {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateSearchType == DateSearchType.TC_ENTEREDRANGE
    }
    
    // 'available' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function available_7 () : java.lang.Boolean {
      return (true)                                    and ( gw.api.util.CurrencyUtil.isSingleCurrencyMode() or BulkInvoiceSearchCriteria.FinancialCriterion.Currency != null)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.FinancialCriterion.AmountStart = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.FinancialCriterion.AmountEnd = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=PayTo) at BulkInvoiceSearchOptionalInputSet.pcf: line 22, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.FinancialCriterion.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice.DateRangeChoice = (__VALUE_TO_SET as typekey.DateRangeChoiceType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice.DateSearchType = (__VALUE_TO_SET as typekey.DateSearchType)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice.StartDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice.EndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.DateCriterionChoice = (__VALUE_TO_SET as entity.DateCriterionChoice)
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.FinancialCriterion.ChosenOption = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'format' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function format_16 () : java.lang.String {
      return gw.api.util.CurrencyUtil.getCurrencyFormatExpression(BulkInvoiceSearchCriteria.FinancialCriterion.Currency)
    }
    
    // 'optionLabel' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function optionLabel_11 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.locale.DisplayKey.get(VALUE)
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function valueRange_12 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.FinancialCriterion.Options
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function valueRange_36 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.Options
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at BulkInvoiceSearchOptionalInputSet.pcf: line 17, column 61
    function valueRoot_26 () : java.lang.Object {
      return BulkInvoiceSearchCriteria
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function valueRoot_34 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function valueRoot_5 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at BulkInvoiceSearchOptionalInputSet.pcf: line 17, column 61
    function value_0 () : entity.FinancialCriterionMC {
      return BulkInvoiceSearchCriteria.FinancialCriterion
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 47, column 48
    function value_17 () : java.math.BigDecimal {
      return BulkInvoiceSearchCriteria.FinancialCriterion.AmountStart
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 56, column 48
    function value_22 () : java.math.BigDecimal {
      return BulkInvoiceSearchCriteria.FinancialCriterion.AmountEnd
    }
    
    // 'value' attribute on TextInput (id=PayTo) at BulkInvoiceSearchOptionalInputSet.pcf: line 22, column 48
    function value_27 () : java.lang.String {
      return BulkInvoiceSearchCriteria.PayTo
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 16, column 74
    function value_3 () : typekey.Currency {
      return BulkInvoiceSearchCriteria.FinancialCriterion.Currency
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_31 () : entity.DateCriterionChoice {
      return BulkInvoiceSearchCriteria.DateCriterionChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_32 () : java.lang.String {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.ChosenOption
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_40 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_42 () : typekey.DateRangeChoiceType {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateRangeChoice
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_45 () : typekey.DateSearchType {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_48 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.DateSearchType
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_50 () : java.util.Date {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.StartDate
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function value_56 () : java.util.Date {
      return BulkInvoiceSearchCriteria.DateCriterionChoice.EndDate
    }
    
    // 'value' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function value_8 () : java.lang.String {
      return BulkInvoiceSearchCriteria.FinancialCriterion.ChosenOption
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function verifyValueRangeIsAllowedType_37 ($$arg :  java.lang.String[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function verifyValueRangeIsAllowedType_37 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 32, column 58
    function verifyValueRange_14 () : void {
      var __valueRangeArg = BulkInvoiceSearchCriteria.FinancialCriterion.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'value' attribute on DateCriterionChoiceInput (id=DateSearch) at BulkInvoiceSearchOptionalInputSet.pcf: line 29, column 62
    function verifyValueRange_38 () : void {
      var __valueRangeArg = BulkInvoiceSearchCriteria.DateCriterionChoice.Options
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_37(__valueRangeArg)
    }
    
    // 'visible' attribute on FinancialCriterionMultiCurrencyChoiceInput (id=InvoiceTotal) at FinancialCriterionMultiCurrencyChoiceWidget.xml: line 11, column 72
    function visible_1 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get BulkInvoiceSearchCriteria () : BulkInvoiceSearchCriteria {
      return getRequireValue("BulkInvoiceSearchCriteria", 0) as BulkInvoiceSearchCriteria
    }
    
    property set BulkInvoiceSearchCriteria ($arg :  BulkInvoiceSearchCriteria) {
      setRequireValue("BulkInvoiceSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}