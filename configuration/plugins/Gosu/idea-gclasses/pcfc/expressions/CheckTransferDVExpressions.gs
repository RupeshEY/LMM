package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckTransferDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/CheckTransferDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransferDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function action_8 () : void {
      ClaimSearchPopup.push()
    }
    
    // 'pickLocation' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function action_dest_9 () : pcf.api.Destination {
      return pcf.ClaimSearchPopup.createDestination()
    }
    
    // 'conversionExpression' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function conversionExpression_11 (PickedValue :  Object) : entity.ClaimInfo {
      return (PickedValue as ClaimSearchView).Claim.ClaimInfo
    }
    
    // 'def' attribute on ListViewInput at CheckTransferDV.pcf: line 70, column 89
    function def_onEnter_25 (def :  pcf.CheckTransferPaymentsLV) : void {
      def.onEnter(NewCheck, Claim, displayLink, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckTransferDV.pcf: line 75, column 238
    function def_onEnter_28 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.onEnter(NewCheck,DisplayKey.get("NVV.Financials.CheckTransfer.Check.SelectExchangeRate"))
    }
    
    // 'def' attribute on ListViewInput at CheckTransferDV.pcf: line 70, column 89
    function def_refreshVariables_26 (def :  pcf.CheckTransferPaymentsLV) : void {
      def.refreshVariables(NewCheck, Claim, displayLink, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at CheckTransferDV.pcf: line 75, column 238
    function def_refreshVariables_29 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.refreshVariables(NewCheck,DisplayKey.get("NVV.Financials.CheckTransfer.Check.SelectExchangeRate"))
    }
    
    // 'value' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewCheck.ClaimInfo = (__VALUE_TO_SET as entity.ClaimInfo)
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetReservingCurrency) at CheckTransferDV.pcf: line 57, column 102
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      targetReservingCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=Comments) at CheckTransferDV.pcf: line 65, column 36
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      NewCheck.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on TextInput (id=LinkedServiceRequestInvoicesMessage) at CheckTransferDV.pcf: line 34, column 64
    function label_1 () : java.lang.Object {
      return DisplayKey.get("NVV.Financials.CheckTransfer.Check.InvoicesTip", ServiceRequestInvoiceStatus.TC_APPROVED.DisplayName, OldCheck.BulletedListOfServiceRequestInvoicesForWarning)
    }
    
    // 'onChange' attribute on PostOnChange at CheckTransferDV.pcf: line 59, column 41
    function onChange_15 () : void {
      prepareTransfer()
    }
    
    // 'onPick' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function onPick_10 (PickedValue :  Object) : void {
      claimNumberOnPick()
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at CheckTransferDV.pcf: line 38, column 39
    function valueRoot_6 () : java.lang.Object {
      return NewCheck
    }
    
    // 'value' attribute on TypeKeyInput (id=TargetReservingCurrency) at CheckTransferDV.pcf: line 57, column 102
    function value_17 () : typekey.Currency {
      return targetReservingCurrency
    }
    
    // 'value' attribute on TextInput (id=Comments) at CheckTransferDV.pcf: line 65, column 36
    function value_21 () : java.lang.String {
      return NewCheck.Comments
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at CheckTransferDV.pcf: line 38, column 39
    function value_4 () : java.lang.String {
      return NewCheck.CheckNumber
    }
    
    // 'value' attribute on PickerInput (id=Claim) at CheckTransferDV.pcf: line 49, column 39
    function value_7 () : entity.ClaimInfo {
      return NewCheck.ClaimInfo
    }
    
    // 'visible' attribute on TextInput (id=LinkedServiceRequestInvoicesMessage) at CheckTransferDV.pcf: line 34, column 64
    function visible_0 () : java.lang.Boolean {
      return OldCheck.ServiceRequestInvoices.HasElements
    }
    
    // 'visible' attribute on TypeKeyInput (id=TargetReservingCurrency) at CheckTransferDV.pcf: line 57, column 102
    function visible_16 () : java.lang.Boolean {
      return NewCheck.ClaimInfo != null and gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on InputSetRef at CheckTransferDV.pcf: line 75, column 238
    function visible_27 () : java.lang.Boolean {
      return NewCheck.Claim != null and NewCheck.ReservingCurrency != OldCheck.ReservingCurrency and NewCheck.ReservingCurrency != NewCheck.Currency and NewCheck.ReservingCurrency != gw.api.util.CurrencyUtil.getReportingCurrency()
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get NewCheck () : Check {
      return getRequireValue("NewCheck", 0) as Check
    }
    
    property set NewCheck ($arg :  Check) {
      setRequireValue("NewCheck", 0, $arg)
    }
    
    property get OldCheck () : Check {
      return getRequireValue("OldCheck", 0) as Check
    }
    
    property set OldCheck ($arg :  Check) {
      setRequireValue("OldCheck", 0, $arg)
    }
    
    property get displayLink () : boolean {
      return getVariableValue("displayLink", 0) as java.lang.Boolean
    }
    
    property set displayLink ($arg :  boolean) {
      setVariableValue("displayLink", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    property get targetReservingCurrency () : Currency {
      return getVariableValue("targetReservingCurrency", 0) as Currency
    }
    
    property set targetReservingCurrency ($arg :  Currency) {
      setVariableValue("targetReservingCurrency", 0, $arg)
    }
    
    function claimNumberOnPick() {
      displayLink = (NewCheck.ClaimInfo.ClaimNumber != Claim.ClaimNumber);
      targetReservingCurrency = OldCheck.getDefaultTargetReservingCurrencyForTransfer(NewCheck.Claim)
      prepareTransfer()
    }
    
    function prepareTransfer() {
      NewCheck.updateCheckForTransfer(NewCheck.Claim, OldCheck, targetReservingCurrency)
      NewCheck.Claim.freezeCurrency()
    }
    
    
  }
  
  
}