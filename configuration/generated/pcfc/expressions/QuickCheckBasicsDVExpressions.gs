package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class QuickCheckBasicsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends QuickCheckBasicsDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_46 () : void {
      AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 18, column 285
    function action_48 () : void {
      if (CheckPayee.Payee != null) { ClaimContactDetailPopup.push(CheckPayee.Payee, Payment.Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_49 () : void {
      ClaimContactDetailPopup.push(CheckPayee.Payee, Payment.Check.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_47 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (CheckPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_50 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(CheckPayee.Payee, Payment.Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_43 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (CheckPayee.Payee), null, Payment.Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_44 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (CheckPayee.Payee), null, Payment.Check.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at QuickCheckBasicsDV.pcf: line 95, column 50
    function defaultSetter_65 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'onChange' attribute on PostOnChange at QuickCheckBasicsDV.pcf: line 86, column 78
    function onChange_40 () : void {
      Payment.Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function onPick_51 (PickedValue :  Contact) : void {
      var contactType = statictypeof (CheckPayee.Payee); var result = eval("CheckPayee.Payee = Payment.Check.Claim.resolveContact(CheckPayee.Payee) as " + contactType.Name + ";return null;"); Payment.Check.handleOnPickForPayee(CheckPayee);
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at QuickCheckBasicsDV.pcf: line 84, column 66
    function onPick_58 (PickedValue :  java.lang.Object) : void {
      Payment.Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'validationExpression' attribute on TypeKeyCell (id=PayeeType) at QuickCheckBasicsDV.pcf: line 95, column 50
    function validationExpression_61 () : java.lang.Object {
      return CheckPayee.PayeeType == TC_CLAIMANT && !CheckPayee.ClaimContact.isClaimant() ? DisplayKey.get("Java.NewPayment.Error.PayeeIsNotClaimant") : null
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_55 () : java.lang.Object {
      return Payment.Check.Claim.PayeeCandidates
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_54 () : java.lang.Object {
      return CheckPayee
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at QuickCheckBasicsDV.pcf: line 84, column 66
    function value_41 () : entity.Contact {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at QuickCheckBasicsDV.pcf: line 95, column 50
    function value_62 () : typekey.ContactRole {
      return CheckPayee.PayeeType
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_56 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_57 () : void {
      var __valueRangeArg = Payment.Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_56(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function visible_42 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function visible_45 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get CheckPayee () : entity.CheckPayee {
      return getIteratedValue(1) as entity.CheckPayee
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/QuickCheckBasicsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickCheckBasicsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_11 () : void {
      if (Payment.Check.FirstPayee.Payee != null) { ClaimContactDetailPopup.push(Payment.Check.FirstPayee.Payee, Payment.Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_13 () : void {
      ClaimContactDetailPopup.push(Payment.Check.FirstPayee.Payee, Payment.Check.Claim)
    }
    
    // 'action' attribute on ButtonInput (id=AddJointPayees) at QuickCheckBasicsDV.pcf: line 55, column 56
    function action_37 () : void {
      Payment.Check.addNewPayee()
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_9 () : void {
      AddressBookPickerPopup.push(statictypeof (Payment.Check.FirstPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_10 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Payment.Check.FirstPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Payment.Check.FirstPayee.Payee, Payment.Check.Claim)
    }
    
    // 'available' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 287, column 84
    function available_198 () : java.lang.Boolean {
      return Payment.ReserveLine != null
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at QuickCheckBasicsDV.pcf: line 222, column 96
    function def_onEnter_153 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Payment.Check.CheckAddressOwner)
    }
    
    // 'def' attribute on InputSetRef at QuickCheckBasicsDV.pcf: line 240, column 72
    function def_onEnter_159 (def :  pcf.ReserveLineInputSet) : void {
      def.onEnter(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at QuickCheckBasicsDV.pcf: line 280, column 62
    function def_onEnter_192 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.onEnter(Payment.Check,null)
    }
    
    // 'def' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 287, column 84
    function def_onEnter_200 (def :  pcf.EditablePaymentLineItemsLV_default) : void {
      def.onEnter(Payment)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Payment.Check.FirstPayee.Payee), null, Payment.Check.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at QuickCheckBasicsDV.pcf: line 222, column 96
    function def_refreshVariables_154 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Payment.Check.CheckAddressOwner)
    }
    
    // 'def' attribute on InputSetRef at QuickCheckBasicsDV.pcf: line 240, column 72
    function def_refreshVariables_160 (def :  pcf.ReserveLineInputSet) : void {
      def.refreshVariables(Payment, reserveLineInputSetHelper)
    }
    
    // 'def' attribute on InputSetRef at QuickCheckBasicsDV.pcf: line 280, column 62
    function def_refreshVariables_193 (def :  pcf.CheckExchangeRateInputSet) : void {
      def.refreshVariables(Payment.Check,null)
    }
    
    // 'def' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 287, column 84
    function def_refreshVariables_201 (def :  pcf.EditablePaymentLineItemsLV_default) : void {
      def.refreshVariables(Payment)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_7 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Payment.Check.FirstPayee.Payee), null, Payment.Check.Claim)
    }
    
    // 'value' attribute on TextInput (id=BankName) at QuickCheckBasicsDV.pcf: line 147, column 42
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.BankName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function defaultSetter_110 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.BankAccountType = (__VALUE_TO_SET as typekey.BankAccountType)
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at QuickCheckBasicsDV.pcf: line 170, column 51
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.BankAccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at QuickCheckBasicsDV.pcf: line 180, column 51
    function defaultSetter_126 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.BankRoutingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeliveryMethod) at QuickCheckBasicsDV.pcf: line 195, column 74
    function defaultSetter_134 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.DeliveryMethod = (__VALUE_TO_SET as typekey.DeliveryMethod)
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at QuickCheckBasicsDV.pcf: line 202, column 74
    function defaultSetter_140 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.MailTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at QuickCheckBasicsDV.pcf: line 215, column 116
    function defaultSetter_151 (__VALUE_TO_SET :  java.lang.Object) : void {
      showAddressFields = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Reportability) at QuickCheckBasicsDV.pcf: line 231, column 47
    function defaultSetter_157 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.Reportability = (__VALUE_TO_SET as typekey.ReportabilityType)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function defaultSetter_166 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.PaymentType = (__VALUE_TO_SET as typekey.PaymentType)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.FirstPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_Eroding) at QuickCheckBasicsDV.pcf: line 256, column 98
    function defaultSetter_173 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.ErodesReserves = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Transaction_Comments) at QuickCheckBasicsDV.pcf: line 268, column 35
    function defaultSetter_184 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at QuickCheckBasicsDV.pcf: line 276, column 66
    function defaultSetter_190 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.CheckCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.FirstPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function defaultSetter_74 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.PaymentMethod = (__VALUE_TO_SET as typekey.PaymentMethod)
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at QuickCheckBasicsDV.pcf: line 121, column 73
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      Payment.Check.EFTData = (__VALUE_TO_SET as entity.EFTData)
    }
    
    // 'editable' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function editable_161 () : java.lang.Boolean {
      return Payment.New
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=BankAccountNumber) at QuickCheckBasicsDV.pcf: line 170, column 51
    function encryptionExpression_121 (VALUE :  java.lang.String) : java.lang.String {
      return Payment.Check.maskBankAccountNumber(VALUE)
    }
    
    // 'filter' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function filter_168 (VALUE :  typekey.PaymentType, VALUES :  typekey.PaymentType[]) : java.lang.Boolean {
      return Wizard.isAllowedPaymentType( Payment, VALUE )
    }
    
    // 'filter' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function filter_76 (VALUE :  typekey.PaymentMethod, VALUES :  typekey.PaymentMethod[]) : java.lang.Boolean {
      return VALUE !=  PaymentMethod.TC_MANUAL
    }
    
    // 'initialValue' attribute on Variable at QuickCheckBasicsDV.pcf: line 20, column 26
    function initialValue_0 () : Deductible {
      return Payment.SharedDeductible
    }
    
    // 'mode' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 287, column 84
    function mode_202 () : java.lang.Object {
      return getMode()
    }
    
    // 'onChange' attribute on PostOnChange at QuickCheckBasicsDV.pcf: line 40, column 150
    function onChange_2 () : void {
      Payment.Check.handleOnPickForPayee(Payment.Check.FirstPayee); showAddressFields = !Payment.Check.addressRequiredFieldsValid();
    }
    
    // 'onChange' attribute on PostOnChange at QuickCheckBasicsDV.pcf: line 111, column 64
    function onChange_71 () : void {
      Payment.Check.handleOnPickForPayee(null)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_15 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Payment.Check.FirstPayee.Payee); var result = eval("Payment.Check.FirstPayee.Payee = Payment.Check.Claim.resolveContact(Payment.Check.FirstPayee.Payee) as " + contactType.Name + ";return null;"); Payment.Check.handleOnPickForPayee(Payment.Check.FirstPayee); showAddressFields = !Payment.Check.addressRequiredFieldsValid();;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at QuickCheckBasicsDV.pcf: line 38, column 55
    function onPick_23 (PickedValue :  java.lang.Object) : void {
      Payment.Check.handleOnPickForPayee(Payment.Check.FirstPayee); showAddressFields = !Payment.Check.addressRequiredFieldsValid();
    }
    
    // 'value' attribute on Reflect at QuickCheckBasicsDV.pcf: line 150, column 37
    function reflectionValue_100 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankName
    }
    
    // 'value' attribute on Reflect at QuickCheckBasicsDV.pcf: line 162, column 44
    function reflectionValue_106 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountType
    }
    
    // 'value' attribute on Reflect at QuickCheckBasicsDV.pcf: line 173, column 46
    function reflectionValue_115 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountNumber
    }
    
    // 'value' attribute on Reflect at QuickCheckBasicsDV.pcf: line 183, column 46
    function reflectionValue_122 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankRoutingNumber
    }
    
    // 'value' attribute on Reflect at QuickCheckBasicsDV.pcf: line 141, column 40
    function reflectionValue_94 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.AccountName
    }
    
    // 'requestValidationExpression' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function requestValidationExpression_164 (VALUE :  typekey.PaymentType) : java.lang.Object {
      return Wizard.validatePaymentType(Payment, VALUE)
    }
    
    // 'value' attribute on RowIterator at QuickCheckBasicsDV.pcf: line 84, column 66
    function sortValue_38 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on RowIterator at QuickCheckBasicsDV.pcf: line 95, column 50
    function sortValue_39 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.PayeeType
    }
    
    // 'toCreateAndAdd' attribute on AddButton (id=ApplyDeductibleButton) at QuickCheckBasicsDV.pcf: line 300, column 252
    function toCreateAndAdd_197 (CheckedValues :  Object[]) : java.lang.Object {
      return Payment.addDeductibleLineItem()
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at QuickCheckBasicsDV.pcf: line 74, column 45
    function toCreateAndAdd_67 () : entity.CheckPayee {
      return Payment.Check.addNewPayee()
    }
    
    // 'toRemove' attribute on RowIterator at QuickCheckBasicsDV.pcf: line 74, column 45
    function toRemove_68 (CheckPayee :  entity.CheckPayee) : void {
      Payment.Check.removeFromPayees(CheckPayee); Payment.Check.handleOnPickForPayee(null);
    }
    
    // 'validationExpression' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 287, column 84
    function validationExpression_199 () : java.lang.Object {
      return Payment.getCheckWizardPaymentValidationExpression()
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function valueRange_112 () : java.lang.Object {
      return BankAccountType.getTypeKeys( false )
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_19 () : java.lang.Object {
      return Payment.Check.Claim.PayeeCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function valueRange_32 () : java.lang.Object {
      return Payment.Check.getAllowedPayeeTypes(Payment.Check.FirstPayee.Payee)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function valueRange_77 () : java.lang.Object {
      return PaymentMethod.getTypeKeys( false )
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function valueRange_91 () : java.lang.Object {
      return Payment.Check.FirstPayee.Payee.EFTRecords
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at QuickCheckBasicsDV.pcf: line 208, column 74
    function valueRoot_146 () : java.lang.Object {
      return Payment.Check.CheckAddressOwner
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function valueRoot_167 () : java.lang.Object {
      return Payment
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at QuickCheckBasicsDV.pcf: line 263, column 80
    function valueRoot_179 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_18 () : java.lang.Object {
      return Payment.Check.FirstPayee
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at QuickCheckBasicsDV.pcf: line 276, column 66
    function valueRoot_191 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function valueRoot_75 () : java.lang.Object {
      return Payment.Check
    }
    
    // 'value' attribute on TextInput (id=BankName) at QuickCheckBasicsDV.pcf: line 147, column 42
    function value_102 () : java.lang.String {
      return Payment.Check.BankName
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function value_108 () : typekey.BankAccountType {
      return Payment.Check.BankAccountType
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at QuickCheckBasicsDV.pcf: line 170, column 51
    function value_117 () : java.lang.String {
      return Payment.Check.BankAccountNumber
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at QuickCheckBasicsDV.pcf: line 180, column 51
    function value_124 () : java.lang.String {
      return Payment.Check.BankRoutingNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeliveryMethod) at QuickCheckBasicsDV.pcf: line 195, column 74
    function value_131 () : typekey.DeliveryMethod {
      return Payment.Check.DeliveryMethod
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at QuickCheckBasicsDV.pcf: line 202, column 74
    function value_137 () : java.lang.String {
      return Payment.Check.MailTo
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at QuickCheckBasicsDV.pcf: line 208, column 74
    function value_143 () : entity.Address {
      return Payment.Check.CheckAddressOwner.Address
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at QuickCheckBasicsDV.pcf: line 215, column 116
    function value_148 () : java.lang.Boolean {
      return showAddressFields
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Reportability) at QuickCheckBasicsDV.pcf: line 231, column 47
    function value_155 () : typekey.ReportabilityType {
      return Payment.Check.Reportability
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_PaymentType) at QuickCheckBasicsDV.pcf: line 249, column 42
    function value_162 () : typekey.PaymentType {
      return Payment.PaymentType
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_Eroding) at QuickCheckBasicsDV.pcf: line 256, column 98
    function value_170 () : java.lang.Boolean {
      return Payment.ErodesReserves
    }
    
    // 'value' attribute on CurrencyInput (id=Transaction_AvailableReserves) at QuickCheckBasicsDV.pcf: line 263, column 80
    function value_176 () : gw.api.financials.IPairedMoney {
      return gw.api.financials.FinancialsCalculationsForEditedTransaction.getAvailableReserves(Payment).ReservingAmountTransactionAmountPair
    }
    
    // 'value' attribute on TextInput (id=Transaction_Comments) at QuickCheckBasicsDV.pcf: line 268, column 35
    function value_181 () : java.lang.String {
      return Payment.Comments
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at QuickCheckBasicsDV.pcf: line 276, column 66
    function value_187 () : typekey.Currency {
      return Wizard.CheckCurrency
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function value_27 () : typekey.ContactRole {
      return Payment.Check.FirstPayee.PayeeType
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at QuickCheckBasicsDV.pcf: line 38, column 55
    function value_4 () : entity.Contact {
      return Payment.Check.FirstPayee.Payee
    }
    
    // 'value' attribute on RowIterator at QuickCheckBasicsDV.pcf: line 74, column 45
    function value_69 () : entity.CheckPayee[] {
      return Payment.Check.Payees
    }
    
    // 'value' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function value_72 () : typekey.PaymentMethod {
      return Payment.Check.PaymentMethod
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at QuickCheckBasicsDV.pcf: line 121, column 73
    function value_81 () : java.lang.String {
      return Payment.Check.PayTo
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function value_87 () : entity.EFTData {
      return Payment.Check.EFTData
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function verifyValueRangeIsAllowedType_113 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function verifyValueRangeIsAllowedType_113 ($$arg :  typekey.BankAccountType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function verifyValueRangeIsAllowedType_33 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function verifyValueRangeIsAllowedType_78 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function verifyValueRangeIsAllowedType_78 ($$arg :  typekey.PaymentMethod[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function verifyValueRangeIsAllowedType_92 ($$arg :  entity.EFTData[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function verifyValueRangeIsAllowedType_92 ($$arg :  gw.api.database.IQueryBeanResult<entity.EFTData>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function verifyValueRangeIsAllowedType_92 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at QuickCheckBasicsDV.pcf: line 159, column 47
    function verifyValueRange_114 () : void {
      var __valueRangeArg = BankAccountType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_113(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_21 () : void {
      var __valueRangeArg = Payment.Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at QuickCheckBasicsDV.pcf: line 50, column 56
    function verifyValueRange_34 () : void {
      var __valueRangeArg = Payment.Check.getAllowedPayeeTypes(Payment.Check.FirstPayee.Payee)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=PaymentMethod) at QuickCheckBasicsDV.pcf: line 109, column 43
    function verifyValueRange_79 () : void {
      var __valueRangeArg = PaymentMethod.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_78(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at QuickCheckBasicsDV.pcf: line 132, column 39
    function verifyValueRange_93 () : void {
      var __valueRangeArg = Payment.Check.FirstPayee.Payee.EFTRecords
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_92(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at QuickCheckBasicsDV.pcf: line 28, column 56
    function visible_1 () : java.lang.Boolean {
      return Payment.Check.Payees.length <= 1
    }
    
    // 'visible' attribute on InputSet (id=EFTDataInputSet) at QuickCheckBasicsDV.pcf: line 125, column 71
    function visible_128 () : java.lang.Boolean {
      return Payment.Check.PaymentMethod == PaymentMethod.TC_EFT
    }
    
    // 'visible' attribute on CheckBoxInput (id=ToggleAddressEdit) at QuickCheckBasicsDV.pcf: line 215, column 116
    function visible_147 () : java.lang.Boolean {
      return Payment.Check.PaymentMethod == PaymentMethod.TC_CHECK and Payment.Check.FirstPayee.Payee != null
    }
    
    // 'visible' attribute on InputSetRef (id=MailingAddressInputSet) at QuickCheckBasicsDV.pcf: line 222, column 96
    function visible_152 () : java.lang.Boolean {
      return Payment.Check.PaymentMethod == PaymentMethod.TC_CHECK and showAddressFields
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Payment_Eroding) at QuickCheckBasicsDV.pcf: line 256, column 98
    function visible_169 () : java.lang.Boolean {
      return !Payment.Exposure.Closed and Payment.PaymentType != PaymentType.TC_SUPPLEMENT
    }
    
    // 'visible' attribute on CurrencyInput (id=Transaction_AvailableReserves) at QuickCheckBasicsDV.pcf: line 263, column 80
    function visible_175 () : java.lang.Boolean {
      return Payment.ReserveLine != null and not Payment.ReserveLine.New
    }
    
    // 'visible' attribute on TypeKeyInput (id=Payment_Currency) at QuickCheckBasicsDV.pcf: line 276, column 66
    function visible_186 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'addVisible' attribute on IteratorButtons at QuickCheckBasicsDV.pcf: line 294, column 90
    function visible_194 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems()
    }
    
    // 'visible' attribute on AddButton (id=ApplyDeductibleButton) at QuickCheckBasicsDV.pcf: line 300, column 252
    function visible_196 () : java.lang.Boolean {
      return gw.api.financials.FinancialsUtil.isAllowMultipleLineItems() and !Payment.Check.CheckSet.Recurring and deductible != null and !deductible.Paid and !deductible.Waived and gw.api.financials.FinancialsUtil.isUseDeductibleHandling()
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_5 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ListViewInput at QuickCheckBasicsDV.pcf: line 61, column 54
    function visible_70 () : java.lang.Boolean {
      return Payment.Check.Payees.length > 1
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_8 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Payment.Check.FirstPayee.Payee), Payment.Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on TextAreaInput (id=PayTo) at QuickCheckBasicsDV.pcf: line 121, column 73
    function visible_80 () : java.lang.Boolean {
      return Payment.Check.PaymentMethod == PaymentMethod.TC_CHECK
    }
    
    property get Payment () : Payment {
      return getRequireValue("Payment", 0) as Payment
    }
    
    property set Payment ($arg :  Payment) {
      setRequireValue("Payment", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.QuickCreateCheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.QuickCreateCheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.QuickCreateCheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get deductible () : Deductible {
      return getVariableValue("deductible", 0) as Deductible
    }
    
    property set deductible ($arg :  Deductible) {
      setVariableValue("deductible", 0, $arg)
    }
    
    property get reserveLineInputSetHelper () : gw.api.financials.ReserveLineInputSetHelper {
      return getRequireValue("reserveLineInputSetHelper", 0) as gw.api.financials.ReserveLineInputSetHelper
    }
    
    property set reserveLineInputSetHelper ($arg :  gw.api.financials.ReserveLineInputSetHelper) {
      setRequireValue("reserveLineInputSetHelper", 0, $arg)
    }
    
    property get showAddressFields () : boolean {
      return getVariableValue("showAddressFields", 0) as java.lang.Boolean
    }
    
    property set showAddressFields ($arg :  boolean) {
      setVariableValue("showAddressFields", 0, $arg)
    }
    
    function getMode() : String {
      if (Payment.LineItems.where( \ t -> t.LineCategory==TC_DEDUCTIBLE ).Count == 1) {
        return "deductible"
      } else {
        return "default"
      }
    }
    
    
  }
  
  
}