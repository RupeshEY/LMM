package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizardCheckDV_readyExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizardCheckDV.ready.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizardCheckDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_11 () : void {
      AddressBookPickerPopup.push(statictypeof (check.Payee), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 18, column 285
    function action_13 () : void {
      if (check.Payee != null) { ClaimContactDetailPopup.push(check.Payee, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_14 () : void {
      ClaimContactDetailPopup.push(check.Payee, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_12 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (check.Payee), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_15 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(check.Payee, claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at FNOLWizardCheckDV.ready.pcf: line 207, column 33
    function def_onEnter_148 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(check.ClaimCheckAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_8 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (check.Payee), null, claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at FNOLWizardCheckDV.ready.pcf: line 207, column 33
    function def_refreshVariables_149 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(check.ClaimCheckAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_9 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (check.Payee), null, claim)
    }
    
    // 'value' attribute on TextInput (id=Payment_RateSet_Description) at FNOLWizardCheckDV.ready.pcf: line 153, column 49
    function defaultSetter_107 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.ExchangeRateDescription = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ApplyDeductible) at FNOLWizardCheckDV.ready.pcf: line 174, column 71
    function defaultSetter_123 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.ApplyDeductible = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at FNOLWizardCheckDV.ready.pcf: line 190, column 33
    function defaultSetter_134 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.DeliveryMethod = (__VALUE_TO_SET as typekey.DeliveryMethod)
    }
    
    // 'value' attribute on TextInput (id=CheckMailTo) at FNOLWizardCheckDV.ready.pcf: line 197, column 33
    function defaultSetter_140 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.MailTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=ScheduledDeliveryDate) at FNOLWizardCheckDV.ready.pcf: line 214, column 42
    function defaultSetter_154 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.ScheduledSendDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.EFTData = (__VALUE_TO_SET as entity.EFTData)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=PaymentMethod) at FNOLWizardCheckDV.ready.pcf: line 27, column 43
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.PaymentMethod = (__VALUE_TO_SET as typekey.PaymentMethod)
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at FNOLWizardCheckDV.ready.pcf: line 56, column 31
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankName) at FNOLWizardCheckDV.ready.pcf: line 65, column 34
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.BankName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function defaultSetter_48 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.BankAccountType = (__VALUE_TO_SET as typekey.BankAccountType)
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at FNOLWizardCheckDV.ready.pcf: line 88, column 43
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.BankAccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at FNOLWizardCheckDV.ready.pcf: line 98, column 43
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.BankRoutingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function defaultSetter_69 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.PayeeRole = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on TextInput (id=CheckInvoiceNumber) at FNOLWizardCheckDV.ready.pcf: line 116, column 38
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.InvoiceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at FNOLWizardCheckDV.ready.pcf: line 124, column 66
    function defaultSetter_82 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.TransactionCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_ExchangeRateOverride) at FNOLWizardCheckDV.ready.pcf: line 134, column 48
    function defaultSetter_90 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.OverrideExchangeRate = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Payment_ExchangeRate) at FNOLWizardCheckDV.ready.pcf: line 145, column 48
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      check.ExchangeRate = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=Payment_ExchangeRateOverride) at FNOLWizardCheckDV.ready.pcf: line 134, column 48
    function editable_84 () : java.lang.Boolean {
      return perm.ExchangeRate.edit
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=BankAccountNumber) at FNOLWizardCheckDV.ready.pcf: line 88, column 43
    function encryptionExpression_59 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskBankAccountNumber(VALUE)
    }
    
    // 'filter' attribute on TypeKeyRadioInput (id=PaymentMethod) at FNOLWizardCheckDV.ready.pcf: line 27, column 43
    function filter_5 (VALUE :  typekey.PaymentMethod, VALUES :  typekey.PaymentMethod[]) : java.lang.Boolean {
      return VALUE != PaymentMethod.TC_MANUAL
    }
    
    // 'format' attribute on TextInput (id=Payment_ExchangeRate) at FNOLWizardCheckDV.ready.pcf: line 145, column 48
    function format_97 () : java.lang.String {
      return "1 " + check.TransactionCurrency.DisplayName + " = #.###### " + claim.Currency.DisplayName;
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardCheckDV.ready.pcf: line 17, column 42
    function initialValue_0 () : gw.api.claim.NewClaimCheck {
      return Wizard.Check
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function onPick_16 (PickedValue :  Contact) : void {
      var contactType = statictypeof (check.Payee); var result = eval("check.Payee = claim.resolveContact(check.Payee) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at FNOLWizardCheckDV.ready.pcf: line 59, column 40
    function reflectionValue_32 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.AccountName
    }
    
    // 'value' attribute on Reflect at FNOLWizardCheckDV.ready.pcf: line 68, column 37
    function reflectionValue_38 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankName
    }
    
    // 'value' attribute on Reflect at FNOLWizardCheckDV.ready.pcf: line 80, column 44
    function reflectionValue_44 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountType
    }
    
    // 'value' attribute on Reflect at FNOLWizardCheckDV.ready.pcf: line 91, column 46
    function reflectionValue_53 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankAccountNumber
    }
    
    // 'value' attribute on Reflect at FNOLWizardCheckDV.ready.pcf: line 101, column 46
    function reflectionValue_60 (TRIGGER_INDEX :  int, VALUE :  entity.EFTData) : java.lang.Object {
      return VALUE.BankRoutingNumber
    }
    
    // 'validationExpression' attribute on CurrencyInput (id=CheckAmount) at FNOLWizardCheckDV.ready.pcf: line 166, column 66
    function validationExpression_114 () : java.lang.Object {
      return check.validateCheckAmount()
    }
    
    // 'validationExpression' attribute on DateInput (id=ScheduledDeliveryDate) at FNOLWizardCheckDV.ready.pcf: line 214, column 42
    function validationExpression_150 () : java.lang.Object {
      return check.ScheduledSendDate.before(java.util.Date.Today) ? DisplayKey.get("Java.Validation.Date.ForbidPast") : null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_20 () : java.lang.Object {
      return claim.PayeeCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function valueRange_29 () : java.lang.Object {
      return check.Payee.EFTRecords
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function valueRange_50 () : java.lang.Object {
      return BankAccountType.getTypeKeys( false )
    }
    
    // 'valueRange' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function valueRange_71 () : java.lang.Object {
      return claim.getAllowedPayeeTypes( check.Payee)
    }
    
    // 'value' attribute on TextInput (id=CheckMailToAddr) at FNOLWizardCheckDV.ready.pcf: line 203, column 33
    function valueRoot_146 () : java.lang.Object {
      return check.ClaimCheckAddressOwner
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=PaymentMethod) at FNOLWizardCheckDV.ready.pcf: line 27, column 43
    function valueRoot_4 () : java.lang.Object {
      return check
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=PaymentMethod) at FNOLWizardCheckDV.ready.pcf: line 27, column 43
    function value_1 () : typekey.PaymentMethod {
      return check.PaymentMethod
    }
    
    // 'value' attribute on TextInput (id=Payment_RateSet_Description) at FNOLWizardCheckDV.ready.pcf: line 153, column 49
    function value_103 () : java.lang.String {
      return check.ExchangeRateDescription
    }
    
    // 'value' attribute on DateInput (id=RateSet_Date) at FNOLWizardCheckDV.ready.pcf: line 158, column 49
    function value_110 () : java.util.Date {
      return check.UpdateTime
    }
    
    // 'value' attribute on CurrencyInput (id=CheckAmount) at FNOLWizardCheckDV.ready.pcf: line 166, column 66
    function value_115 () : gw.api.financials.AbstractMutablePairedMoney {
      return check.TransactionAmount
    }
    
    // 'value' attribute on BooleanRadioInput (id=ApplyDeductible) at FNOLWizardCheckDV.ready.pcf: line 174, column 71
    function value_120 () : java.lang.Boolean {
      return check.ApplyDeductible
    }
    
    // 'value' attribute on CurrencyInput (id=CheckTotalAmount) at FNOLWizardCheckDV.ready.pcf: line 182, column 98
    function value_126 () : gw.api.financials.CurrencyAmountPair {
      return check.CheckAmount
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at FNOLWizardCheckDV.ready.pcf: line 190, column 33
    function value_131 () : typekey.DeliveryMethod {
      return check.DeliveryMethod
    }
    
    // 'value' attribute on TextInput (id=CheckMailTo) at FNOLWizardCheckDV.ready.pcf: line 197, column 33
    function value_137 () : java.lang.String {
      return check.MailTo
    }
    
    // 'value' attribute on TextInput (id=CheckMailToAddr) at FNOLWizardCheckDV.ready.pcf: line 203, column 33
    function value_143 () : entity.Address {
      return check.ClaimCheckAddressOwner.Address
    }
    
    // 'value' attribute on DateInput (id=ScheduledDeliveryDate) at FNOLWizardCheckDV.ready.pcf: line 214, column 42
    function value_151 () : java.util.Date {
      return check.ScheduledSendDate
    }
    
    // 'value' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function value_25 () : entity.EFTData {
      return check.EFTData
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at FNOLWizardCheckDV.ready.pcf: line 56, column 31
    function value_34 () : java.lang.String {
      return check.PayTo
    }
    
    // 'value' attribute on TextInput (id=BankName) at FNOLWizardCheckDV.ready.pcf: line 65, column 34
    function value_40 () : java.lang.String {
      return check.BankName
    }
    
    // 'value' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function value_46 () : typekey.BankAccountType {
      return check.BankAccountType
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at FNOLWizardCheckDV.ready.pcf: line 88, column 43
    function value_55 () : java.lang.String {
      return check.BankAccountNumber
    }
    
    // 'value' attribute on ClaimContactInput (id=Payee_Picker) at FNOLWizardCheckDV.ready.pcf: line 37, column 44
    function value_6 () : entity.Contact {
      return check.Payee
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at FNOLWizardCheckDV.ready.pcf: line 98, column 43
    function value_62 () : java.lang.String {
      return check.BankRoutingNumber
    }
    
    // 'value' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function value_67 () : typekey.ContactRole {
      return check.PayeeRole
    }
    
    // 'value' attribute on TextInput (id=CheckInvoiceNumber) at FNOLWizardCheckDV.ready.pcf: line 116, column 38
    function value_74 () : java.lang.String {
      return check.InvoiceNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Payment_Currency) at FNOLWizardCheckDV.ready.pcf: line 124, column 66
    function value_79 () : typekey.Currency {
      return check.TransactionCurrency
    }
    
    // 'value' attribute on BooleanRadioInput (id=Payment_ExchangeRateOverride) at FNOLWizardCheckDV.ready.pcf: line 134, column 48
    function value_86 () : java.lang.Boolean {
      return check.OverrideExchangeRate
    }
    
    // 'value' attribute on TextInput (id=Payment_ExchangeRate) at FNOLWizardCheckDV.ready.pcf: line 145, column 48
    function value_94 () : java.math.BigDecimal {
      return check.ExchangeRate
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_21 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_21 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_21 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function verifyValueRangeIsAllowedType_30 ($$arg :  entity.EFTData[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function verifyValueRangeIsAllowedType_30 ($$arg :  gw.api.database.IQueryBeanResult<entity.EFTData>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function verifyValueRangeIsAllowedType_30 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function verifyValueRangeIsAllowedType_51 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function verifyValueRangeIsAllowedType_51 ($$arg :  typekey.BankAccountType[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function verifyValueRangeIsAllowedType_72 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function verifyValueRangeIsAllowedType_72 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_22 () : void {
      var __valueRangeArg = claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_21(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=EFTRecords) at FNOLWizardCheckDV.ready.pcf: line 49, column 39
    function verifyValueRange_31 () : void {
      var __valueRangeArg = check.Payee.EFTRecords
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_30(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=BankAccountType) at FNOLWizardCheckDV.ready.pcf: line 77, column 47
    function verifyValueRange_52 () : void {
      var __valueRangeArg = BankAccountType.getTypeKeys( false )
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_51(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=PayeeRole) at FNOLWizardCheckDV.ready.pcf: line 111, column 42
    function verifyValueRange_73 () : void {
      var __valueRangeArg = claim.getAllowedPayeeTypes( check.Payee)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_72(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 16, column 225
    function visible_10 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (check.Payee), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ApplyDeductible) at FNOLWizardCheckDV.ready.pcf: line 174, column 71
    function visible_119 () : java.lang.Boolean {
      return claim.Exposures[0].Coverage.ClaimDeductible != null
    }
    
    // 'visible' attribute on CurrencyInput (id=CheckTotalAmount) at FNOLWizardCheckDV.ready.pcf: line 182, column 98
    function visible_125 () : java.lang.Boolean {
      return claim.Exposures[0].Coverage.ClaimDeductible != null and check.ApplyDeductible
    }
    
    // 'visible' attribute on TypeKeyInput (id=DeliveryMethod) at FNOLWizardCheckDV.ready.pcf: line 190, column 33
    function visible_130 () : java.lang.Boolean {
      return !check.IsEFT
    }
    
    // 'visible' attribute on InputSet (id=EFTDataInputSet) at FNOLWizardCheckDV.ready.pcf: line 42, column 31
    function visible_66 () : java.lang.Boolean {
      return check.IsEFT
    }
    
    // 'visible' attribute on ClaimContactInput (id=Payee_Picker) at ClaimContactWidget.xml: line 14, column 229
    function visible_7 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on TypeKeyInput (id=Payment_Currency) at FNOLWizardCheckDV.ready.pcf: line 124, column 66
    function visible_78 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on BooleanRadioInput (id=Payment_ExchangeRateOverride) at FNOLWizardCheckDV.ready.pcf: line 134, column 48
    function visible_85 () : java.lang.Boolean {
      return check.UseExchangeRate(claim)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get check () : gw.api.claim.NewClaimCheck {
      return getVariableValue("check", 0) as gw.api.claim.NewClaimCheck
    }
    
    property set check ($arg :  gw.api.claim.NewClaimCheck) {
      setVariableValue("check", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}