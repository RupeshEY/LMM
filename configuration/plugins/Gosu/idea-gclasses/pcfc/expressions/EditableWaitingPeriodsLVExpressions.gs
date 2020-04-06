package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableWaitingPeriodsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWaitingPeriodsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at EditableWaitingPeriodsLV.pcf: line 17, column 29
    function initialValue_0 () : ClaimWorkComp {
      return claim.ClaimWorkComp
    }
    
    // 'value' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 35, column 29
    function sortValue_1 (WaitingPeriod :  entity.WCWaitingPeriod) : java.lang.Object {
      return WaitingPeriod.DateStarted
    }
    
    // 'value' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 43, column 29
    function sortValue_2 (WaitingPeriod :  entity.WCWaitingPeriod) : java.lang.Object {
      return WaitingPeriod.DateEnded
    }
    
    // 'value' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 51, column 29
    function sortValue_3 (WaitingPeriod :  entity.WCWaitingPeriod) : java.lang.Object {
      return WaitingPeriod.WaitingDaysApplied
    }
    
    // 'value' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 59, column 29
    function sortValue_4 (WaitingPeriod :  entity.WCWaitingPeriod) : java.lang.Object {
      return WaitingPeriod.WaitingDaysRepaid
    }
    
    // 'toAdd' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 26, column 44
    function toAdd_29 (WaitingPeriod :  entity.WCWaitingPeriod) : void {
      ClaimWorkComp.addToWaitingPeriodDetails( WaitingPeriod )
    }
    
    // 'toRemove' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 26, column 44
    function toRemove_30 (WaitingPeriod :  entity.WCWaitingPeriod) : void {
      ClaimWorkComp.removeFromWaitingPeriodDetails( WaitingPeriod )
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=EditableWaitingPeriodsLV) at EditableWaitingPeriodsLV.pcf: line 7, column 182
    function validationExpression_32 () : java.lang.Object {
      return (claim.getWCWaitingDaysApplied() > claim.getWCWaitingDays( null)) ? DisplayKey.get("Warning.WaitingPeriod.DaysEnteredGTJurisdiction") : null
    }
    
    // 'value' attribute on RowIterator (id=WaitingPeriods) at EditableWaitingPeriodsLV.pcf: line 26, column 44
    function value_31 () : entity.WCWaitingPeriod[] {
      return ClaimWorkComp.WaitingPeriodDetails
    }
    
    property get ClaimWorkComp () : ClaimWorkComp {
      return getVariableValue("ClaimWorkComp", 0) as ClaimWorkComp
    }
    
    property set ClaimWorkComp ($arg :  ClaimWorkComp) {
      setVariableValue("ClaimWorkComp", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableWaitingPeriodsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=DateEnded) at EditableWaitingPeriodsLV.pcf: line 43, column 29
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      WaitingPeriod.DateEnded = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextCell (id=WaitingDaysApplied) at EditableWaitingPeriodsLV.pcf: line 51, column 29
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      WaitingPeriod.WaitingDaysApplied = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=WaitingDaysRepaid) at EditableWaitingPeriodsLV.pcf: line 59, column 29
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      WaitingPeriod.WaitingDaysRepaid = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on DateCell (id=DateStarted) at EditableWaitingPeriodsLV.pcf: line 35, column 29
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      WaitingPeriod.DateStarted = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on TextCell (id=WaitingDaysApplied) at EditableWaitingPeriodsLV.pcf: line 51, column 29
    function validationExpression_17 () : java.lang.Object {
      return  (WaitingPeriod.WaitingDaysApplied < 0 ? DisplayKey.get("LV.EditableWaitingPeriods.Message.NegativeWaitingDaysApplied") : ( WaitingPeriod.WaitingDaysRepaid > WaitingPeriod.WaitingDaysApplied ? DisplayKey.get("LV.EditableWaitingPeriods.DaysRepaidGTDaysApplied") : null))
    }
    
    // 'validationExpression' attribute on TextCell (id=WaitingDaysRepaid) at EditableWaitingPeriodsLV.pcf: line 59, column 29
    function validationExpression_23 () : java.lang.Object {
      return  (WaitingPeriod.WaitingDaysRepaid < 0 ? DisplayKey.get("LV.EditableWaitingPeriods.Message.NegativeWaitingDaysRepaid") :( WaitingPeriod.WaitingDaysRepaid > WaitingPeriod.WaitingDaysApplied  ? DisplayKey.get("LV.EditableWaitingPeriods.DaysRepaidGTDaysApplied"): null))
    }
    
    // 'validationExpression' attribute on DateCell (id=DateStarted) at EditableWaitingPeriodsLV.pcf: line 35, column 29
    function validationExpression_5 () : java.lang.Object {
      return ( WaitingPeriod.DateStarted > WaitingPeriod.DateEnded  ? DisplayKey.get("LV.EditableWaitingPeriods.StartedDatePriorToEnded_Error"): null)
    }
    
    // 'value' attribute on DateCell (id=DateStarted) at EditableWaitingPeriodsLV.pcf: line 35, column 29
    function valueRoot_10 () : java.lang.Object {
      return WaitingPeriod
    }
    
    // 'value' attribute on DateCell (id=DateEnded) at EditableWaitingPeriodsLV.pcf: line 43, column 29
    function value_12 () : java.util.Date {
      return WaitingPeriod.DateEnded
    }
    
    // 'value' attribute on TextCell (id=WaitingDaysApplied) at EditableWaitingPeriodsLV.pcf: line 51, column 29
    function value_18 () : java.math.BigDecimal {
      return WaitingPeriod.WaitingDaysApplied
    }
    
    // 'value' attribute on TextCell (id=WaitingDaysRepaid) at EditableWaitingPeriodsLV.pcf: line 59, column 29
    function value_24 () : java.math.BigDecimal {
      return WaitingPeriod.WaitingDaysRepaid
    }
    
    // 'value' attribute on DateCell (id=DateStarted) at EditableWaitingPeriodsLV.pcf: line 35, column 29
    function value_6 () : java.util.Date {
      return WaitingPeriod.DateStarted
    }
    
    property get WaitingPeriod () : entity.WCWaitingPeriod {
      return getIteratedValue(1) as entity.WCWaitingPeriod
    }
    
    
  }
  
  
}