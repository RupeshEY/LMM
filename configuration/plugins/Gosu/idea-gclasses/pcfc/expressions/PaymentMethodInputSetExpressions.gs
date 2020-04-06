package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentMethodInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/checks/PaymentMethodInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentMethodInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_17 () : java.lang.Boolean {
      return owner.Payee != null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function action_11 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(owner.Payee),false)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function action_6 () : void {
      AddressBookPickerPopup.push(statictypeof (owner.Payee))
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 14, column 151
    function action_8 () : void {
      owner.Payee = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_12 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(owner.Payee),false)
    }
    
    // 'action' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_7 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (owner.Payee))
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInput) at PaymentMethodInputSet.pcf: line 100, column 154
    function def_onEnter_66 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(owner.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInput) at PaymentMethodInputSet.pcf: line 100, column 154
    function def_refreshVariables_67 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(owner.AddressOwner)
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at PaymentMethodInputSet.pcf: line 146, column 42
    function defaultSetter_106 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.BankRoutingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=PaymentMethod) at PaymentMethodInputSet.pcf: line 44, column 41
    function defaultSetter_28 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.PaymentMethod = (__VALUE_TO_SET as typekey.PaymentMethod)
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at PaymentMethodInputSet.pcf: line 57, column 30
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at PaymentMethodInputSet.pcf: line 63, column 36
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.CheckNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at PaymentMethodInputSet.pcf: line 69, column 45
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.DeliveryMethod = (__VALUE_TO_SET as typekey.DeliveryMethod)
    }
    
    // 'value' attribute on TextInput (id=MailTo) at PaymentMethodInputSet.pcf: line 76, column 31
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.MailTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at PaymentMethodInputSet.pcf: line 93, column 118
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      showAddressFields.Value = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      eft = (__VALUE_TO_SET as entity.EFTData)
    }
    
    // 'value' attribute on TextAreaInput (id=AccountName) at PaymentMethodInputSet.pcf: line 121, column 36
    function defaultSetter_81 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.AccountName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BankName) at PaymentMethodInputSet.pcf: line 126, column 33
    function defaultSetter_87 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.BankName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=BankAccountType) at PaymentMethodInputSet.pcf: line 133, column 46
    function defaultSetter_93 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.BankAccountType = (__VALUE_TO_SET as typekey.BankAccountType)
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at PaymentMethodInputSet.pcf: line 140, column 42
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      owner.BankAccountNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on AddressBookContactInput (id=Payee) at PaymentMethodInputSet.pcf: line 36, column 33
    function editable_2 () : java.lang.Boolean {
      return isPayeeChangeable
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=BankAccountNumber) at PaymentMethodInputSet.pcf: line 140, column 42
    function encryptionExpression_101 (VALUE :  java.lang.String) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskBankAccountNumber(VALUE)
    }
    
    // 'filter' attribute on TypeKeyRadioInput (id=PaymentMethod) at PaymentMethodInputSet.pcf: line 44, column 41
    function filter_30 (VALUE :  typekey.PaymentMethod, VALUES :  typekey.PaymentMethod[]) : java.lang.Boolean {
      return VALUE != PaymentMethod.TC_MANUAL
    }
    
    // 'initialValue' attribute on Variable at PaymentMethodInputSet.pcf: line 23, column 30
    function initialValue_0 () : entity.EFTData {
      return helper.SelectedEFTData
    }
    
    // 'initialValue' attribute on Variable at PaymentMethodInputSet.pcf: line 27, column 52
    function initialValue_1 () : gw.api.contact.ExternalContactSource {
      return gw.api.contact.AddressBookUtil.newAddressBookContactSource()
    }
    
    // 'onChange' attribute on PostOnChange at PaymentMethodInputSet.pcf: line 46, column 79
    function onChange_23 () : void {
      showAddressFields.Value = owner.updatePayeeFields(helper)
    }
    
    // 'onChange' attribute on PostOnChange at PaymentMethodInputSet.pcf: line 112, column 51
    function onChange_68 () : void {
      helper.onEFTDataChange(eft)
    }
    
    // 'onPick' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function onPick_13 (PickedValue :  Contact) : void {
      showAddressFields.Value = owner.updatePayeeFields(helper)
    }
    
    // 'onPick' attribute on AddressBookContactInput (id=Payee) at PaymentMethodInputSet.pcf: line 36, column 33
    function onPick_20 (PickedValue :  java.lang.Object) : void {
      showAddressFields.Value = owner.updatePayeeFields(helper)
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function valueRange_74 () : java.lang.Object {
      return owner.Payee.EFTRecords
    }
    
    // 'value' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 10, column 154
    function valueRoot_16 () : java.lang.Object {
      return owner
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at PaymentMethodInputSet.pcf: line 93, column 118
    function valueRoot_64 () : java.lang.Object {
      return showAddressFields
    }
    
    // 'value' attribute on TextInput (id=BankRoutingNumber) at PaymentMethodInputSet.pcf: line 146, column 42
    function value_103 () : java.lang.String {
      return owner.BankRoutingNumber
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=PaymentMethod) at PaymentMethodInputSet.pcf: line 44, column 41
    function value_25 () : typekey.PaymentMethod {
      return owner.PaymentMethod
    }
    
    // 'value' attribute on TextAreaInput (id=PayTo) at PaymentMethodInputSet.pcf: line 57, column 30
    function value_32 () : java.lang.String {
      return owner.PayTo
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at PaymentMethodInputSet.pcf: line 63, column 36
    function value_37 () : java.lang.String {
      return owner.CheckNumber
    }
    
    // 'value' attribute on AddressBookContactInput (id=Payee) at PaymentMethodInputSet.pcf: line 36, column 33
    function value_4 () : entity.Contact {
      return owner.Payee
    }
    
    // 'value' attribute on TypeKeyInput (id=DeliveryMethod) at PaymentMethodInputSet.pcf: line 69, column 45
    function value_41 () : typekey.DeliveryMethod {
      return owner.DeliveryMethod
    }
    
    // 'value' attribute on TextInput (id=MailTo) at PaymentMethodInputSet.pcf: line 76, column 31
    function value_46 () : java.lang.String {
      return owner.MailTo
    }
    
    // 'value' attribute on TextInput (id=OldMailingAddress) at PaymentMethodInputSet.pcf: line 81, column 82
    function value_52 () : java.lang.String {
      return owner.OldMailToAddress
    }
    
    // 'value' attribute on TextInput (id=MailingAddress) at PaymentMethodInputSet.pcf: line 86, column 51
    function value_56 () : java.lang.String {
      return owner.FormatAddressSummary(true)
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at PaymentMethodInputSet.pcf: line 93, column 118
    function value_60 () : java.lang.Boolean {
      return showAddressFields.Value
    }
    
    // 'value' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function value_70 () : entity.EFTData {
      return eft
    }
    
    // 'value' attribute on TextAreaInput (id=AccountName) at PaymentMethodInputSet.pcf: line 121, column 36
    function value_78 () : java.lang.String {
      return owner.AccountName
    }
    
    // 'value' attribute on TextInput (id=BankName) at PaymentMethodInputSet.pcf: line 126, column 33
    function value_84 () : java.lang.String {
      return owner.BankName
    }
    
    // 'value' attribute on TypeKeyRadioInput (id=BankAccountType) at PaymentMethodInputSet.pcf: line 133, column 46
    function value_90 () : typekey.BankAccountType {
      return owner.BankAccountType
    }
    
    // 'value' attribute on PrivacyInput (id=BankAccountNumber) at PaymentMethodInputSet.pcf: line 140, column 42
    function value_96 () : java.lang.String {
      return owner.BankAccountNumber
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function verifyValueRangeIsAllowedType_75 ($$arg :  entity.EFTData[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function verifyValueRangeIsAllowedType_75 ($$arg :  gw.api.database.IQueryBeanResult<entity.EFTData>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function verifyValueRangeIsAllowedType_75 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=ContactEFTData) at PaymentMethodInputSet.pcf: line 110, column 36
    function verifyValueRange_76 () : void {
      var __valueRangeArg = owner.Payee.EFTRecords
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_75(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSet at PaymentMethodInputSet.pcf: line 102, column 61
    function visible_108 () : java.lang.Boolean {
      return owner.PaymentMethod == PaymentMethod.TC_EFT
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Payee) at PaymentMethodInputSet.pcf: line 36, column 33
    function visible_3 () : java.lang.Boolean {
      return helper != null
    }
    
    // 'visible' attribute on AddressBookContactInput (id=Payee) at AddressBookContactWidget.xml: line 12, column 225
    function visible_5 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (owner.Payee))" != "" && true
    }
    
    // 'visible' attribute on TextInput (id=OldMailingAddress) at PaymentMethodInputSet.pcf: line 81, column 82
    function visible_51 () : java.lang.Boolean {
      return owner.OldMailToAddress != null and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on InputSet at PaymentMethodInputSet.pcf: line 49, column 63
    function visible_58 () : java.lang.Boolean {
      return owner.PaymentMethod == PaymentMethod.TC_CHECK
    }
    
    // 'visible' attribute on CheckBoxInput (id=ToggleAddressEdit) at PaymentMethodInputSet.pcf: line 93, column 118
    function visible_59 () : java.lang.Boolean {
      return owner.PaymentMethod == PaymentMethod.TC_CHECK and owner.Payee != null and CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on InputSetRef (id=MailingAddressInput) at PaymentMethodInputSet.pcf: line 100, column 154
    function visible_65 () : java.lang.Boolean {
      return owner.PaymentMethod == PaymentMethod.TC_CHECK and owner.Payee != null and showAddressFields.Value and CurrentLocation.InEditMode
    }
    
    property get eft () : entity.EFTData {
      return getVariableValue("eft", 0) as entity.EFTData
    }
    
    property set eft ($arg :  entity.EFTData) {
      setVariableValue("eft", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get helper () : gw.api.financials.PaymentMethodHelper {
      return getRequireValue("helper", 0) as gw.api.financials.PaymentMethodHelper
    }
    
    property set helper ($arg :  gw.api.financials.PaymentMethodHelper) {
      setRequireValue("helper", 0, $arg)
    }
    
    property get isPayeeChangeable () : boolean {
      return getRequireValue("isPayeeChangeable", 0) as java.lang.Boolean
    }
    
    property set isPayeeChangeable ($arg :  boolean) {
      setRequireValue("isPayeeChangeable", 0, $arg)
    }
    
    property get owner () : entity.BulkInvoice {
      return getRequireValue("owner", 0) as entity.BulkInvoice
    }
    
    property set owner ($arg :  entity.BulkInvoice) {
      setRequireValue("owner", 0, $arg)
    }
    
    property get showAddressFields () : org.apache.commons.lang3.mutable.MutableBoolean {
      return getRequireValue("showAddressFields", 0) as org.apache.commons.lang3.mutable.MutableBoolean
    }
    
    property set showAddressFields ($arg :  org.apache.commons.lang3.mutable.MutableBoolean) {
      setRequireValue("showAddressFields", 0, $arg)
    }
    
    
  }
  
  
}