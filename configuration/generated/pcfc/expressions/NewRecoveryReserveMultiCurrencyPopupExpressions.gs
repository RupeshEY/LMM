package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewRecoveryReserveMultiCurrencyPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryReserveMultiCurrencyPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (WizardHelper :  gw.api.financials.RecoveryReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : int {
      return 0
    }
    
    // 'def' attribute on ListViewInput at NewRecoveryReserveMultiCurrencyPopup.pcf: line 43, column 31
    function def_onEnter_1 (def :  pcf.EditableMultiCurrencyRecoveryReservesLV) : void {
      def.onEnter(WizardHelper,EditWrapper)
    }
    
    // 'def' attribute on InputSetRef at NewRecoveryReserveMultiCurrencyPopup.pcf: line 54, column 76
    function def_onEnter_4 (def :  pcf.TransactionEditWrapperExchangeRateInputSet) : void {
      def.onEnter(EditWrapper)
    }
    
    // 'def' attribute on ListViewInput at NewRecoveryReserveMultiCurrencyPopup.pcf: line 43, column 31
    function def_refreshVariables_2 (def :  pcf.EditableMultiCurrencyRecoveryReservesLV) : void {
      def.refreshVariables(WizardHelper,EditWrapper)
    }
    
    // 'def' attribute on InputSetRef at NewRecoveryReserveMultiCurrencyPopup.pcf: line 54, column 76
    function def_refreshVariables_5 (def :  pcf.TransactionEditWrapperExchangeRateInputSet) : void {
      def.refreshVariables(EditWrapper)
    }
    
    // 'initialValue' attribute on Variable at NewRecoveryReserveMultiCurrencyPopup.pcf: line 18, column 27
    function initialValue_0 () : Transaction {
      return EditWrapper.Transaction
    }
    
    // 'visible' attribute on Label at NewRecoveryReserveMultiCurrencyPopup.pcf: line 52, column 129
    function visible_3 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and Transaction.Currency != Transaction.ReservingCurrency
    }
    
    override property get CurrentLocation () : pcf.NewRecoveryReserveMultiCurrencyPopup {
      return super.CurrentLocation as pcf.NewRecoveryReserveMultiCurrencyPopup
    }
    
    property get EditWrapper () : TransactionEditWrapper {
      return getVariableValue("EditWrapper", 0) as TransactionEditWrapper
    }
    
    property set EditWrapper ($arg :  TransactionEditWrapper) {
      setVariableValue("EditWrapper", 0, $arg)
    }
    
    property get Transaction () : Transaction {
      return getVariableValue("Transaction", 0) as Transaction
    }
    
    property set Transaction ($arg :  Transaction) {
      setVariableValue("Transaction", 0, $arg)
    }
    
    property get WizardHelper () : gw.api.financials.RecoveryReserveWizardHelper {
      return getVariableValue("WizardHelper", 0) as gw.api.financials.RecoveryReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.RecoveryReserveWizardHelper) {
      setVariableValue("WizardHelper", 0, $arg)
    }
    
    
  }
  
  
}