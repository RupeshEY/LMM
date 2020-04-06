package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessWeekDayDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/businessweek/BusinessWeekDayDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessWeekDayDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=ThursdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 161, column 53
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.ThursdayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=FridayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 169, column 48
    function defaultSetter_112 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.FridayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=FridayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 179, column 51
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.FridayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SundayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 34, column 48
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SundayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=FridayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 188, column 51
    function defaultSetter_128 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.FridayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SaturdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 196, column 50
    function defaultSetter_132 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SaturdayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=SaturdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 206, column 53
    function defaultSetter_139 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SaturdayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=SaturdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 215, column 53
    function defaultSetter_148 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SaturdayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=SundayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 44, column 51
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SundayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=BusinessWeekEndInput) at BusinessWeekDayDetailDV.pcf: line 17, column 39
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.BusinessWeekEnd = (__VALUE_TO_SET as typekey.Weekdays)
    }
    
    // 'value' attribute on DateInput (id=SundayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 53, column 51
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.SundayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=MondayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 61, column 48
    function defaultSetter_32 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.MondayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=MondayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 71, column 51
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.MondayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=MondayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 80, column 51
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.MondayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=TuesdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 88, column 49
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.TuesdayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=TuesdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 98, column 52
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.TuesdayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=TuesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 107, column 52
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.TuesdayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=WednesdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 115, column 51
    function defaultSetter_72 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.WednesdayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=WednesdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 125, column 54
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.WednesdayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=BusinessDayDemarcation) at BusinessWeekDayDetailDV.pcf: line 26, column 54
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.BusinessDayDemarcation = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=WednesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 134, column 54
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.WednesdayBusinessEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ThursdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 142, column 50
    function defaultSetter_92 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.ThursdayBusinessDay = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=ThursdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 152, column 53
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessWeek.ThursdayBusinessStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=ThursdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 161, column 53
    function validationExpression_101 () : java.lang.Object {
      return businessWeek.validateThursdayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=FridayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 188, column 51
    function validationExpression_121 () : java.lang.Object {
      return businessWeek.validateFridayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=SaturdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 215, column 53
    function validationExpression_141 () : java.lang.Object {
      return businessWeek.validateSaturdayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=SundayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 53, column 51
    function validationExpression_21 () : java.lang.Object {
      return businessWeek.validateSundayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=BusinessDayDemarcation) at BusinessWeekDayDetailDV.pcf: line 26, column 54
    function validationExpression_4 () : java.lang.Object {
      return businessWeek.validateBusinessDayDemarcation()
    }
    
    // 'validationExpression' attribute on DateInput (id=MondayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 80, column 51
    function validationExpression_41 () : java.lang.Object {
      return businessWeek.validateMondayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=TuesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 107, column 52
    function validationExpression_61 () : java.lang.Object {
      return businessWeek.validateTuesdayStartAndEndTimes()
    }
    
    // 'validationExpression' attribute on DateInput (id=WednesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 134, column 54
    function validationExpression_81 () : java.lang.Object {
      return businessWeek.validateWednesdayStartAndEndTimes()
    }
    
    // 'value' attribute on TypeKeyInput (id=BusinessWeekEndInput) at BusinessWeekDayDetailDV.pcf: line 17, column 39
    function valueRoot_3 () : java.lang.Object {
      return businessWeek
    }
    
    // 'value' attribute on TypeKeyInput (id=BusinessWeekEndInput) at BusinessWeekDayDetailDV.pcf: line 17, column 39
    function value_0 () : typekey.Weekdays {
      return businessWeek.BusinessWeekEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=SundayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 34, column 48
    function value_10 () : java.lang.Boolean {
      return businessWeek.SundayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=ThursdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 161, column 53
    function value_103 () : java.util.Date {
      return businessWeek.ThursdayBusinessEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=FridayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 169, column 48
    function value_110 () : java.lang.Boolean {
      return businessWeek.FridayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=FridayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 179, column 51
    function value_115 () : java.util.Date {
      return businessWeek.FridayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=FridayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 188, column 51
    function value_123 () : java.util.Date {
      return businessWeek.FridayBusinessEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=SaturdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 196, column 50
    function value_130 () : java.lang.Boolean {
      return businessWeek.SaturdayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=SaturdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 206, column 53
    function value_135 () : java.util.Date {
      return businessWeek.SaturdayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=SaturdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 215, column 53
    function value_143 () : java.util.Date {
      return businessWeek.SaturdayBusinessEnd
    }
    
    // 'value' attribute on DateInput (id=SundayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 44, column 51
    function value_15 () : java.util.Date {
      return businessWeek.SundayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=SundayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 53, column 51
    function value_23 () : java.util.Date {
      return businessWeek.SundayBusinessEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=MondayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 61, column 48
    function value_30 () : java.lang.Boolean {
      return businessWeek.MondayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=MondayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 71, column 51
    function value_35 () : java.util.Date {
      return businessWeek.MondayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=MondayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 80, column 51
    function value_43 () : java.util.Date {
      return businessWeek.MondayBusinessEnd
    }
    
    // 'value' attribute on DateInput (id=BusinessDayDemarcation) at BusinessWeekDayDetailDV.pcf: line 26, column 54
    function value_5 () : java.util.Date {
      return businessWeek.BusinessDayDemarcation
    }
    
    // 'value' attribute on BooleanRadioInput (id=TuesdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 88, column 49
    function value_50 () : java.lang.Boolean {
      return businessWeek.TuesdayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=TuesdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 98, column 52
    function value_55 () : java.util.Date {
      return businessWeek.TuesdayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=TuesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 107, column 52
    function value_63 () : java.util.Date {
      return businessWeek.TuesdayBusinessEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=WednesdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 115, column 51
    function value_70 () : java.lang.Boolean {
      return businessWeek.WednesdayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=WednesdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 125, column 54
    function value_75 () : java.util.Date {
      return businessWeek.WednesdayBusinessStart
    }
    
    // 'value' attribute on DateInput (id=WednesdayBusinessEnd) at BusinessWeekDayDetailDV.pcf: line 134, column 54
    function value_83 () : java.util.Date {
      return businessWeek.WednesdayBusinessEnd
    }
    
    // 'value' attribute on BooleanRadioInput (id=ThursdayBusinessDay) at BusinessWeekDayDetailDV.pcf: line 142, column 50
    function value_90 () : java.lang.Boolean {
      return businessWeek.ThursdayBusinessDay
    }
    
    // 'value' attribute on DateInput (id=ThursdayBusinessStart) at BusinessWeekDayDetailDV.pcf: line 152, column 53
    function value_95 () : java.util.Date {
      return businessWeek.ThursdayBusinessStart
    }
    
    property get businessWeek () : BusinessWeek {
      return getRequireValue("businessWeek", 0) as BusinessWeek
    }
    
    property set businessWeek ($arg :  BusinessWeek) {
      setRequireValue("businessWeek", 0, $arg)
    }
    
    
  }
  
  
}