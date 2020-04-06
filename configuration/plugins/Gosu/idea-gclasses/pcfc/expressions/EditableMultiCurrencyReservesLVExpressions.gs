package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableMultiCurrencyReservesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableMultiCurrencyReservesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableMultiCurrencyReservesLV.pcf: line 82, column 40
    function sortValue_1 (ReserveWrapper :  entity.TransactionEditWrapper) : java.lang.Object {
      return EditWrapper.Currency
    }
    
    // 'value' attribute on RowIterator at EditableMultiCurrencyReservesLV.pcf: line 17, column 51
    function value_37 () : entity.TransactionEditWrapper[] {
      return new TransactionEditWrapper[] { EditWrapper }
    }
    
    // 'visible' attribute on RowIterator at EditableMultiCurrencyReservesLV.pcf: line 57, column 29
    function visible_0 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get EditWrapper () : entity.TransactionEditWrapper {
      return getRequireValue("EditWrapper", 0) as entity.TransactionEditWrapper
    }
    
    property set EditWrapper ($arg :  entity.TransactionEditWrapper) {
      setRequireValue("EditWrapper", 0, $arg)
    }
    
    property get WizardHelper () : gw.api.financials.ReserveWizardHelper {
      return getRequireValue("WizardHelper", 0) as gw.api.financials.ReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.ReserveWizardHelper) {
      setRequireValue("WizardHelper", 0, $arg)
    }
    
    
    function setNewTransactionAmountToInitialValue() {
      var initialValue = WizardHelper.getAvailableReservesAmountPair( EditWrapper.Transaction ).Amount + WizardHelper.getPendingApprovalReservesAmountPair( EditWrapper.Transaction ).Amount
      // this sets the transaction and reserving amounts
      EditWrapper.NewAmountInTransactionCurrency.setAmount( initialValue )
    }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/EditableMultiCurrencyReservesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableMultiCurrencyReservesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyReservesLV.pcf: line 82, column 40
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      EditWrapper.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyReservesLV.pcf: line 114, column 29
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      ReserveWrapper.Transaction.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at EditableMultiCurrencyReservesLV.pcf: line 84, column 65
    function onChange_23 () : void {
      setNewTransactionAmountToInitialValue()
    }
    
    // 'outputConversion' attribute on TextCell (id=Exposure) at EditableMultiCurrencyReservesLV.pcf: line 26, column 29
    function outputConversion_3 (VALUE :  java.lang.String) : java.lang.String {
      return VALUE == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : VALUE
    }
    
    // 'value' attribute on TextCell (id=CostType) at EditableMultiCurrencyReservesLV.pcf: line 40, column 29
    function valueRoot_11 () : java.lang.Object {
      return EditWrapper.Transaction
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyReservesLV.pcf: line 82, column 40
    function valueRoot_27 () : java.lang.Object {
      return EditWrapper
    }
    
    // 'value' attribute on CurrencyCell (id=NewAvailableReserves) at EditableMultiCurrencyReservesLV.pcf: line 96, column 28
    function valueRoot_30 () : java.lang.Object {
      return ReserveWrapper
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyReservesLV.pcf: line 114, column 29
    function valueRoot_36 () : java.lang.Object {
      return ReserveWrapper.Transaction
    }
    
    // 'value' attribute on TextCell (id=Exposure) at EditableMultiCurrencyReservesLV.pcf: line 26, column 29
    function valueRoot_5 () : java.lang.Object {
      return EditWrapper.Transaction.Exposure
    }
    
    // 'value' attribute on TextCell (id=CostCategory) at EditableMultiCurrencyReservesLV.pcf: line 48, column 29
    function value_12 () : typekey.CostCategory {
      return EditWrapper.Transaction.CostCategory
    }
    
    // 'value' attribute on TextCell (id=ReservingCurrency) at EditableMultiCurrencyReservesLV.pcf: line 57, column 29
    function value_16 () : typekey.Currency {
      return EditWrapper.Transaction.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=AvailableReserves) at EditableMultiCurrencyReservesLV.pcf: line 65, column 28
    function value_19 () : gw.api.financials.IPairedMoney {
      return WizardHelper.getAvailableReservesAmountPair( ReserveWrapper.Transaction )
    }
    
    // 'value' attribute on TextCell (id=Exposure) at EditableMultiCurrencyReservesLV.pcf: line 26, column 29
    function value_2 () : java.lang.String {
      return EditWrapper.Transaction.Exposure.DisplayName
    }
    
    // 'value' attribute on CurrencyCell (id=PendingReserves) at EditableMultiCurrencyReservesLV.pcf: line 75, column 29
    function value_21 () : gw.api.financials.IPairedMoney {
      return WizardHelper.getPendingApprovalReservesAmountPair( ReserveWrapper.Transaction )
    }
    
    // 'value' attribute on TypeKeyCell (id=Currency) at EditableMultiCurrencyReservesLV.pcf: line 82, column 40
    function value_24 () : typekey.Currency {
      return EditWrapper.Currency
    }
    
    // 'value' attribute on CurrencyCell (id=NewAvailableReserves) at EditableMultiCurrencyReservesLV.pcf: line 96, column 28
    function value_28 () : gw.api.financials.IMutableMoney {
      return ReserveWrapper.NewAmountInTransactionCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=ChangeAmount) at EditableMultiCurrencyReservesLV.pcf: line 106, column 29
    function value_31 () : gw.api.financials.IPairedMoney {
      return WizardHelper.getChangeAmountPair(ReserveWrapper)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableMultiCurrencyReservesLV.pcf: line 114, column 29
    function value_33 () : java.lang.String {
      return ReserveWrapper.Transaction.Comments
    }
    
    // 'value' attribute on TextCell (id=Coverage) at EditableMultiCurrencyReservesLV.pcf: line 32, column 45
    function value_6 () : typekey.CoverageType {
      return EditWrapper.Transaction.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextCell (id=CostType) at EditableMultiCurrencyReservesLV.pcf: line 40, column 29
    function value_9 () : typekey.CostType {
      return EditWrapper.Transaction.CostType
    }
    
    // 'visible' attribute on TextCell (id=ReservingCurrency) at EditableMultiCurrencyReservesLV.pcf: line 57, column 29
    function visible_15 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get ReserveWrapper () : entity.TransactionEditWrapper {
      return getIteratedValue(1) as entity.TransactionEditWrapper
    }
    
    
  }
  
  
}