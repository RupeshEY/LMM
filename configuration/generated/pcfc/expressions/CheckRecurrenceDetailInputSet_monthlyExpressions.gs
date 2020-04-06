package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckRecurrenceDetailInputSet_monthlyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/check/CheckRecurrenceDetailInputSet.monthly.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckRecurrenceDetailInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceDetailInputSet.monthly.pcf: line 104, column 70
    function def_onEnter_69 (def :  pcf.CheckRecurrenceAdditionalInfoInputSet) : void {
      def.onEnter(recurrenceHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckRecurrenceDetailInputSet.monthly.pcf: line 104, column 70
    function def_refreshVariables_70 (def :  pcf.CheckRecurrenceAdditionalInfoInputSet) : void {
      def.refreshVariables(recurrenceHelper)
    }
    
    // 'value' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.FrequencyType = (__VALUE_TO_SET as gw.financials.MonthlyRecurrenceFrequency)
    }
    
    // 'value' attribute on TextInput (id=EveryXMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 47, column 78
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.Recurrence.MonthlyFrequency = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.DateType = (__VALUE_TO_SET as gw.financials.MonthlyRecurrenceDateType)
    }
    
    // 'value' attribute on TextInput (id=DayOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 67, column 111
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.Recurrence.RecurrenceDate = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TypeKeyInput (id=WeekOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 75, column 105
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.Recurrence.RecurrenceWeek = (__VALUE_TO_SET as typekey.RecurrenceWeek)
    }
    
    // 'value' attribute on TypeKeyInput (id=DayOfWeek) at CheckRecurrenceDetailInputSet.monthly.pcf: line 83, column 105
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.Monthly.Recurrence.RecurrenceDay = (__VALUE_TO_SET as typekey.RecurrenceDay)
    }
    
    // 'value' attribute on CheckBoxInput (id=IssueCheckInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 88, column 158
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.IssueCheckInAdvance = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 20, column 51
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=DaysInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 100, column 63
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      recurrenceHelper.CheckRecurrence.IssuanceDateOffset = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'editable' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 20, column 51
    function editable_0 () : java.lang.Boolean {
      return !check.CheckSet.Approved
    }
    
    // 'editable' attribute on CheckBoxInput (id=IssueCheckInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 88, column 158
    function editable_51 () : java.lang.Boolean {
      return !recurrenceHelper.Check.CheckSet.Approved
    }
    
    // 'requestValidationExpression' attribute on TextInput (id=DayOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 67, column 111
    function requestValidationExpression_32 (VALUE :  java.lang.Integer) : java.lang.Object {
      return (VALUE < 1 or VALUE > 31) ? DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.SubsequentChecks.DayOfMonth.ValidationError") : null
    }
    
    // 'required' attribute on TextInput (id=EveryXMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 47, column 78
    function required_18 () : java.lang.Boolean {
      return recurrenceHelper.Monthly.FrequencyType == gw.financials.MonthlyRecurrenceFrequency.OTHER
    }
    
    // 'validationExpression' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 20, column 51
    function validationExpression_1 () : java.lang.Object {
      return check.ScheduledSendDate.before(java.util.Date.Today) ? DisplayKey.get("Java.Validation.Date.ForbidPast") : null
    }
    
    // 'validationExpression' attribute on TextInput (id=DaysInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 100, column 63
    function validationExpression_58 () : java.lang.Object {
      if(recurrenceHelper.CheckRecurrence.IssuanceDateOffset < 1) {return DisplayKey.get("Wizard.NewCheckWizard.CheckInstructions.Recurrence.SubsequentChecks.SpecialInstructions.DaysInAdvance.LessThanOne")} else return null
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function valueRange_12 () : java.lang.Object {
      return gw.financials.MonthlyRecurrenceFrequency.AllValues
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function valueRange_26 () : java.lang.Object {
      return gw.financials.MonthlyRecurrenceDateType.AllValues
    }
    
    // 'value' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function valueRoot_11 () : java.lang.Object {
      return recurrenceHelper.Monthly
    }
    
    // 'value' attribute on TextInput (id=EveryXMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 47, column 78
    function valueRoot_21 () : java.lang.Object {
      return recurrenceHelper.Monthly.Recurrence
    }
    
    // 'value' attribute on TextInput (id=DaysInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 100, column 63
    function valueRoot_67 () : java.lang.Object {
      return recurrenceHelper.CheckRecurrence
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 20, column 51
    function valueRoot_7 () : java.lang.Object {
      return recurrenceHelper
    }
    
    // 'value' attribute on TextInput (id=EveryXMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 47, column 78
    function value_16 () : java.lang.Integer {
      return recurrenceHelper.Monthly.Recurrence.MonthlyFrequency
    }
    
    // 'value' attribute on DateInput (id=ScheduledSendDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 20, column 51
    function value_2 () : java.util.Date {
      return recurrenceHelper.ScheduledSendDate
    }
    
    // 'value' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function value_22 () : gw.financials.MonthlyRecurrenceDateType {
      return recurrenceHelper.Monthly.DateType
    }
    
    // 'value' attribute on TextInput (id=DayOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 67, column 111
    function value_30 () : java.lang.Integer {
      return recurrenceHelper.Monthly.Recurrence.RecurrenceDate
    }
    
    // 'value' attribute on TypeKeyInput (id=WeekOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 75, column 105
    function value_38 () : typekey.RecurrenceWeek {
      return recurrenceHelper.Monthly.Recurrence.RecurrenceWeek
    }
    
    // 'value' attribute on TypeKeyInput (id=DayOfWeek) at CheckRecurrenceDetailInputSet.monthly.pcf: line 83, column 105
    function value_45 () : typekey.RecurrenceDay {
      return recurrenceHelper.Monthly.Recurrence.RecurrenceDay
    }
    
    // 'value' attribute on CheckBoxInput (id=IssueCheckInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 88, column 158
    function value_52 () : java.lang.Boolean {
      return recurrenceHelper.IssueCheckInAdvance
    }
    
    // 'value' attribute on TextInput (id=DaysInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 100, column 63
    function value_60 () : java.lang.Integer {
      return recurrenceHelper.CheckRecurrence.IssuanceDateOffset
    }
    
    // 'value' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function value_8 () : gw.financials.MonthlyRecurrenceFrequency {
      return recurrenceHelper.Monthly.FrequencyType
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.financials.MonthlyRecurrenceFrequency[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function verifyValueRangeIsAllowedType_27 ($$arg :  gw.financials.MonthlyRecurrenceDateType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function verifyValueRangeIsAllowedType_27 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=Frequency) at CheckRecurrenceDetailInputSet.monthly.pcf: line 36, column 62
    function verifyValueRange_14 () : void {
      var __valueRangeArg = gw.financials.MonthlyRecurrenceFrequency.AllValues
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=TypeOfDueDate) at CheckRecurrenceDetailInputSet.monthly.pcf: line 55, column 61
    function verifyValueRange_28 () : void {
      var __valueRangeArg = gw.financials.MonthlyRecurrenceDateType.AllValues
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_27(__valueRangeArg)
    }
    
    // 'visible' attribute on TextInput (id=EveryXMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 47, column 78
    function visible_15 () : java.lang.Boolean {
      return recurrenceHelper.Monthly.Recurrence.MonthlyFrequency != 1
    }
    
    // 'visible' attribute on TextInput (id=DayOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 67, column 111
    function visible_29 () : java.lang.Boolean {
      return recurrenceHelper.Monthly.DateType == gw.financials.MonthlyRecurrenceDateType.SPECIFIC_DATE
    }
    
    // 'visible' attribute on TypeKeyInput (id=WeekOfMonth) at CheckRecurrenceDetailInputSet.monthly.pcf: line 75, column 105
    function visible_37 () : java.lang.Boolean {
      return recurrenceHelper.Monthly.DateType == gw.financials.MonthlyRecurrenceDateType.WEEKDAY
    }
    
    // 'visible' attribute on TextInput (id=DaysInAdvance) at CheckRecurrenceDetailInputSet.monthly.pcf: line 100, column 63
    function visible_59 () : java.lang.Boolean {
      return recurrenceHelper.IssueCheckInAdvance==true
    }
    
    property get check () : Check {
      return getRequireValue("check", 0) as Check
    }
    
    property set check ($arg :  Check) {
      setRequireValue("check", 0, $arg)
    }
    
    property get recurrenceHelper () : gw.financials.CheckRecurrenceUIHelper {
      return getRequireValue("recurrenceHelper", 0) as gw.financials.CheckRecurrenceUIHelper
    }
    
    property set recurrenceHelper ($arg :  gw.financials.CheckRecurrenceUIHelper) {
      setRequireValue("recurrenceHelper", 0, $arg)
    }
    
    
  }
  
  
}