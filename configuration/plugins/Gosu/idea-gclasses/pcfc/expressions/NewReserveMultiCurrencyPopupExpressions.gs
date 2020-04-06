package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewReserveMultiCurrencyPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveMultiCurrencyPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (WizardHelper :  gw.api.financials.ReserveWizardHelper, EditWrapper :  TransactionEditWrapper) : int {
      return 0
    }
    
    // 'def' attribute on ListViewInput at NewReserveMultiCurrencyPopup.pcf: line 44, column 53
    function def_onEnter_1 (def :  pcf.EditableMultiCurrencyReservesLV) : void {
      def.onEnter(WizardHelper,EditWrapper)
    }
    
    // 'def' attribute on InputSetRef at NewReserveMultiCurrencyPopup.pcf: line 55, column 76
    function def_onEnter_5 (def :  pcf.TransactionEditWrapperExchangeRateInputSet) : void {
      def.onEnter(EditWrapper)
    }
    
    // 'def' attribute on ListViewInput at NewReserveMultiCurrencyPopup.pcf: line 44, column 53
    function def_refreshVariables_2 (def :  pcf.EditableMultiCurrencyReservesLV) : void {
      def.refreshVariables(WizardHelper,EditWrapper)
    }
    
    // 'def' attribute on InputSetRef at NewReserveMultiCurrencyPopup.pcf: line 55, column 76
    function def_refreshVariables_6 (def :  pcf.TransactionEditWrapperExchangeRateInputSet) : void {
      def.refreshVariables(EditWrapper)
    }
    
    // 'initialValue' attribute on Variable at NewReserveMultiCurrencyPopup.pcf: line 18, column 27
    function initialValue_0 () : Transaction {
      return EditWrapper.Transaction
    }
    
    // 'mode' attribute on ListViewInput at NewReserveMultiCurrencyPopup.pcf: line 44, column 53
    function mode_3 () : java.lang.Object {
      return WizardHelper.getReservesUIMode()
    }
    
    // 'visible' attribute on Label at NewReserveMultiCurrencyPopup.pcf: line 53, column 129
    function visible_4 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode() and Transaction.Currency != Transaction.ReservingCurrency
    }
    
    override property get CurrentLocation () : pcf.NewReserveMultiCurrencyPopup {
      return super.CurrentLocation as pcf.NewReserveMultiCurrencyPopup
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
    
    property get WizardHelper () : gw.api.financials.ReserveWizardHelper {
      return getVariableValue("WizardHelper", 0) as gw.api.financials.ReserveWizardHelper
    }
    
    property set WizardHelper ($arg :  gw.api.financials.ReserveWizardHelper) {
      setVariableValue("WizardHelper", 0, $arg)
    }
    
    
  }
  
  
}