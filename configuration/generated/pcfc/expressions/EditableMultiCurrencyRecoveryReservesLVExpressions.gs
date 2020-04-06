package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableMultiCurrencyRecoveryReservesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableMultiCurrencyRecoveryReservesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableMultiCurrencyRecoveryReservesLV.pcf: line 72, column 40
    function sortValue_1 (RecoveryReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return EditWrapper.Currency
    }
    
    // 'value' attribute on RowIterator at EditableMultiCurrencyRecoveryReservesLV.pcf: line 17, column 51
    function value_35 () : entity.TransactionEditWrapper[] {
      return new TransactionEditWrapper[] { EditWrapper }
    }
    
    // 'visible' attribute on RowIterator at EditableMultiCurrencyRecoveryReservesLV.pcf: line 57, column 29
    function visible_0 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get EditWrapper () : entity.TransactionEditWrapper {
      return getRequireValue("EditWrapper", 0) as entity.TransactionEditWrapper
    }
    
    property set EditWrapper ($arg :  entity.TransactionEditWrapper) {
      setRequireValue("EditWrapper", 0, $arg)
    }
    
    property get WizardHelper () : gw.api.financials.RecoveryReserveWizardHelper {
      return getRequireValue("WizardHelper", 0) as gw.api.financials.RecoveryReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.RecoveryReserveWizardHelper) {
      setRequireValue("WizardHelper", 0, $arg)
    }
    
    
    function setNewTransactionAmountToInitialValue() {
      var initialValue = WizardHelper.getOpenRecoveryReservesAmountPair( EditWrapper.Transaction ).Amount
      // this sets the transaction and reserving amounts
      EditWrapper.NewAmountInTransactionCurrency.setAmount( initialValue )
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/EditableMultiCurrencyRecoveryReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableMultiCurrencyRecoveryReservesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 72, column 40
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      EditWrapper.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 104, column 29
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      RecoveryReserveWrapper.Transaction.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at EditableMultiCurrencyRecoveryReservesLV.pcf: line 74, column 65
    function onChange_21 () : void {
      setNewTransactionAmountToInitialValue()
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 26, column 29
    function outputConversion_3 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : VALUE
    }
    
    // 'value' attribute on TextCell (id=LV_Financials_RecoveryReserveSet_RecoveryReserves_CostType) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 40, column 29
    function valueRoot_11 () : java.lang.Object {
      return EditWrapper.Transaction
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 72, column 40
    function valueRoot_25 () : java.lang.Object {
      return EditWrapper
    }
    
    // 'value' attribute on CurrencyCell (id=NewOpenRecoveryReserves) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 86, column 28
    function valueRoot_28 () : java.lang.Object {
      return RecoveryReserveWrapper
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 104, column 29
    function valueRoot_34 () : java.lang.Object {
      return RecoveryReserveWrapper.Transaction
    }
    
    // 'value' attribute on TextCell (id=Exposure) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 26, column 29
    function valueRoot_5 () : java.lang.Object {
      return EditWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on TextCell (id=CostCategories) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 48, column 29
    function value_12 () : typekey.CostCategory {
      return EditWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on TextCell (id=ReservingCurrency) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 57, column 29
    function value_16 () : typekey.Currency {
      return EditWrapper.Transaction.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=OpenRecoveryReserves) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 65, column 29
    function value_19 () : gw.api.financials.IPairedMoney {
      return WizardHelper.getOpenRecoveryReservesAmountPair( RecoveryReserveWrapper.Transaction )
    }
    
    // 'value' attribute on TextCell (id=Exposure) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 26, column 29
    function value_2 () : java.lang.String {
      return EditWrapper.Transaction.Exposure.DisplayName
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 72, column 40
    function value_22 () : typekey.Currency {
      return EditWrapper.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=NewOpenRecoveryReserves) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 86, column 28
    function value_26 () : gw.api.financials.IMutableMoney {
      return RecoveryReserveWrapper.NewAmountInTransactionCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=ChangeAmount) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 96, column 29
    function value_29 () : gw.api.financials.IPairedMoney {
      return WizardHelper.getChangeAmountPair(RecoveryReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 104, column 29
    function value_31 () : java.lang.String {
      return RecoveryReserveWrapper.Transaction.Comments
    }
    
    // 'value' attribute on TextCell (id=Coverage) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 32, column 45
    function value_6 () : typekey.CoverageType {
      return EditWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=LV_Financials_RecoveryReserveSet_RecoveryReserves_CostType) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 40, column 29
    function value_9 () : typekey.CostType {
      return EditWrapper.Transaction.CostType
    }
    
    // 'visible' attribute on TextCell (id=ReservingCurrency) at EditableMultiCurrencyRecoveryReservesLV.pcf: line 57, column 29
    function visible_15 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get RecoveryReserveWrapper () : entity.TransactionEditWrapper {
      return getIteratedValue(1) as entity.TransactionEditWrapper
    }
    
    
  }
  
  
}