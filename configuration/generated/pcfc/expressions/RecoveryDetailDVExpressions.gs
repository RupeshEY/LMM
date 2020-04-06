package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class RecoveryDetailDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/recovery/RecoveryDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 16, column 225
    function action_41 () : void {
      AddressBookPickerPopup.push(statictypeof (recovery.OnBehalfOf), recovery.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 18, column 285
    function action_43 () : void {
      if (recovery.OnBehalfOf != null) { ClaimContactDetailPopup.push(recovery.OnBehalfOf, recovery.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function action_45 () : void {
      ClaimContactDetailPopup.push(recovery.OnBehalfOf, recovery.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 16, column 225
    function action_6 () : void {
      AddressBookPickerPopup.push(statictypeof (recovery.Payer), recovery.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 18, column 285
    function action_8 () : void {
      if (recovery.Payer != null) { ClaimContactDetailPopup.push(recovery.Payer, recovery.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function action_9 () : void {
      ClaimContactDetailPopup.push(recovery.Payer, recovery.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_10 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(recovery.Payer, recovery.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_42 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (recovery.OnBehalfOf), recovery.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_46 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(recovery.OnBehalfOf, recovery.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (recovery.Payer), recovery.Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on InputSetRef at RecoveryDetailDV.pcf: line 30, column 73
    function def_onEnter_21 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(recovery, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_3 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (recovery.Payer), null, recovery.Claim)
    }
    
    // 'def' attribute on InputSetRef at RecoveryDetailDV.pcf: line 50, column 58
    function def_onEnter_33 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.onEnter(recovery)
    }
    
    // 'def' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_38 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (recovery.OnBehalfOf), null, recovery.Claim)
    }
    
    // 'def' attribute on ListViewInput at RecoveryDetailDV.pcf: line 97, column 27
    function def_onEnter_79 (def :  pcf.EditableRecoveryLineItemsLV) : void {
      def.onEnter(recovery)
    }
    
    // 'def' attribute on InputSetRef at RecoveryDetailDV.pcf: line 30, column 73
    function def_refreshVariables_22 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(recovery, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at RecoveryDetailDV.pcf: line 50, column 58
    function def_refreshVariables_34 (def :  pcf.TransactionExchangeRateInputSet) : void {
      def.refreshVariables(recovery)
    }
    
    // 'def' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_39 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (recovery.OnBehalfOf), null, recovery.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_4 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (recovery.Payer), null, recovery.Claim)
    }
    
    // 'def' attribute on ListViewInput at RecoveryDetailDV.pcf: line 97, column 27
    function def_refreshVariables_80 (def :  pcf.EditableRecoveryLineItemsLV) : void {
      def.refreshVariables(recovery)
    }
    
    // 'value' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      recovery.Payer = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoveryDetailDV.pcf: line 37, column 46
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      recovery.RecoveryCategory = (__VALUE_TO_SET as typekey.RecoveryCategory)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at RecoveryDetailDV.pcf: line 46, column 66
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      recoveryHelper.RecoveryCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      recovery.OnBehalfOf = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecoveryDetailDV.pcf: line 68, column 36
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      recovery.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on ListViewInput at RecoveryDetailDV.pcf: line 97, column 27
    function editable_78 () : java.lang.Boolean {
      return recovery.ReserveLine != null
    }
    
    // 'onChange' attribute on PostOnChange at RecoveryDetailDV.pcf: line 27, column 64
    function onChange_0 () : void {
      recoveryHelper.autoSetRecoveryCurrency()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function onPick_11 (PickedValue :  Contact) : void {
      var contactType = statictypeof (recovery.Payer); var result = eval("recovery.Payer = recovery.Claim.resolveContact(recovery.Payer) as " + contactType.Name + ";return null;"); recoveryHelper.autoSetRecoveryCurrency();
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Payer) at RecoveryDetailDV.pcf: line 25, column 53
    function onPick_18 (PickedValue :  java.lang.Object) : void {
      recoveryHelper.autoSetRecoveryCurrency()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function onPick_47 (PickedValue :  Contact) : void {
      var contactType = statictypeof (recovery.OnBehalfOf); var result = eval("recovery.OnBehalfOf = recovery.Claim.resolveContact(recovery.OnBehalfOf) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_15 () : java.lang.Object {
      return recovery.Claim.RelatedContacts
    }
    
    // 'value' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_14 () : java.lang.Object {
      return recovery
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at RecoveryDetailDV.pcf: line 46, column 66
    function valueRoot_32 () : java.lang.Object {
      return recoveryHelper
    }
    
    // 'value' attribute on CurrencyInput (id=OpenRecoveryReserves) at RecoveryDetailDV.pcf: line 75, column 147
    function valueRoot_65 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getOpenRecoveryReserves(recovery)
    }
    
    // 'value' attribute on CurrencyInput (id=Payments) at RecoveryDetailDV.pcf: line 82, column 95
    function valueRoot_70 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalPayments(recovery)
    }
    
    // 'value' attribute on CurrencyInput (id=PastRecoveries) at RecoveryDetailDV.pcf: line 89, column 97
    function valueRoot_75 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalRecoveries(recovery)
    }
    
    // 'value' attribute on ClaimContactInput (id=Payer) at RecoveryDetailDV.pcf: line 25, column 53
    function value_1 () : entity.Contact {
      return recovery.Payer
    }
    
    // 'value' attribute on TypeKeyInput (id=RecoveryCategory) at RecoveryDetailDV.pcf: line 37, column 46
    function value_23 () : typekey.RecoveryCategory {
      return recovery.RecoveryCategory
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at RecoveryDetailDV.pcf: line 46, column 66
    function value_28 () : typekey.Currency {
      return recoveryHelper.RecoveryCurrency
    }
    
    // 'value' attribute on ClaimContactInput (id=OnBehalfOf) at RecoveryDetailDV.pcf: line 60, column 74
    function value_36 () : entity.Contact {
      return recovery.OnBehalfOf
    }
    
    // 'value' attribute on TextInput (id=Comments) at RecoveryDetailDV.pcf: line 68, column 36
    function value_57 () : java.lang.String {
      return recovery.Comments
    }
    
    // 'value' attribute on CurrencyInput (id=OpenRecoveryReserves) at RecoveryDetailDV.pcf: line 75, column 147
    function value_62 () : gw.api.financials.IMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getOpenRecoveryReserves(recovery).ReservingAmount
    }
    
    // 'value' attribute on CurrencyInput (id=Payments) at RecoveryDetailDV.pcf: line 82, column 95
    function value_67 () : gw.api.financials.IMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalPayments(recovery).ReservingAmount
    }
    
    // 'value' attribute on CurrencyInput (id=PastRecoveries) at RecoveryDetailDV.pcf: line 89, column 97
    function value_72 () : gw.api.financials.IMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getTotalRecoveries(recovery).ReservingAmount
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_16 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_52 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_17 () : void {
      var __valueRangeArg = recovery.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_16(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_53 () : void {
      var __valueRangeArg = recovery.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_52(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 14, column 229
    function visible_2 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at RecoveryDetailDV.pcf: line 46, column 66
    function visible_27 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on ClaimContactInput (id=OnBehalfOf) at RecoveryDetailDV.pcf: line 60, column 74
    function visible_35 () : java.lang.Boolean {
      return recovery.RecoveryCategory == RecoveryCategory.TC_SUBRO
    }
    
    // 'visible' attribute on ClaimContactInput (id=OnBehalfOf) at ClaimContactWidget.xml: line 16, column 225
    function visible_40 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (recovery.OnBehalfOf), recovery.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=Payer) at ClaimContactWidget.xml: line 16, column 225
    function visible_5 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (recovery.Payer), recovery.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on CurrencyInput (id=OpenRecoveryReserves) at RecoveryDetailDV.pcf: line 75, column 147
    function visible_61 () : java.lang.Boolean {
      return shouldShowCalculation() && recovery.isUseRecoveryReserves() && perm.Claim.viewrecoveryreserves(recovery.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=Payments) at RecoveryDetailDV.pcf: line 82, column 95
    function visible_66 () : java.lang.Boolean {
      return shouldShowCalculation() && perm.Claim.viewpayments(recovery.Claim)
    }
    
    // 'visible' attribute on CurrencyInput (id=PastRecoveries) at RecoveryDetailDV.pcf: line 89, column 97
    function visible_71 () : java.lang.Boolean {
      return shouldShowCalculation() && perm.Claim.viewrecoveries(recovery.Claim)
    }
    
    // 'addVisible' attribute on IteratorButtons at RecoveryDetailDV.pcf: line 104, column 90
    function visible_76 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems()
    }
    
    property get recovery () : Recovery {
      return getRequireValue("recovery", 0) as Recovery
    }
    
    property set recovery ($arg :  Recovery) {
      setRequireValue("recovery", 0, $arg)
    }
    
    property get recoveryHelper () : gw.api.financials.RecoveryHelper {
      return getRequireValue("recoveryHelper", 0) as gw.api.financials.RecoveryHelper
    }
    
    property set recoveryHelper ($arg :  gw.api.financials.RecoveryHelper) {
      setRequireValue("recoveryHelper", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    function shouldShowCalculation() : boolean {
      var reserveLine = recovery.ReserveLine
      if (reserveLine == null) {
        return false
      } else if (reserveLine.New) {
        return recovery.CostType != null && recovery.CostCategory != null && recovery.ReservingCurrency != null
      }
      return true
    }
    
    
  }
  
  
}