package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReissueCheckDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReissueCheckDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_49 () : void {
      AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 18, column 285
    function action_51 () : void {
      if (CheckPayee.Payee != null) { ClaimContactDetailPopup.push(CheckPayee.Payee, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_52 () : void {
      ClaimContactDetailPopup.push(CheckPayee.Payee, Check.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_50 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_53 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(CheckPayee.Payee, Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_46 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (CheckPayee.Payee), null, Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_47 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (CheckPayee.Payee), null, Check.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_56 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at ReissueCheckDV.pcf: line 95, column 50
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'onChange' attribute on PostOnChange at ReissueCheckDV.pcf: line 86, column 70
    function onChange_43 () : void {
      Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function onPick_54 (PickedValue :  Contact) : void {
      var contactType = statictypeof (CheckPayee.Payee); var result = eval("CheckPayee.Payee = Check.Claim.resolveContact(CheckPayee.Payee) as " + contactType.Name + ";return null;"); Check.handleOnPickForPayee(CheckPayee);
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at ReissueCheckDV.pcf: line 84, column 58
    function onPick_61 (PickedValue :  java.lang.Object) : void {
      Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'validationExpression' attribute on TypeKeyCell (id=PayeeType) at ReissueCheckDV.pcf: line 95, column 50
    function validationExpression_64 () : java.lang.Object {
      return CheckPayee.PayeeType == TC_CLAIMANT && !CheckPayee.ClaimContact.isClaimant() ? DisplayKey.get("Java.NewPayment.Error.PayeeIsNotClaimant") : null
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_58 () : java.lang.Object {
      return Check.Claim.PayeeCandidates
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_57 () : java.lang.Object {
      return CheckPayee
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ReissueCheckDV.pcf: line 84, column 58
    function value_44 () : entity.Contact {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at ReissueCheckDV.pcf: line 95, column 50
    function value_65 () : typekey.ContactRole {
      return CheckPayee.PayeeType
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_59 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_59 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_59 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_60 () : void {
      var __valueRangeArg = Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_59(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function visible_45 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function visible_48 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get CheckPayee () : entity.CheckPayee {
      return getIteratedValue(1) as entity.CheckPayee
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/financials/transactions/ReissueCheckDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReissueCheckDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_12 () : void {
      AddressBookPickerPopup.push(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_14 () : void {
      if (Check.FirstPayee.Payee != null) { ClaimContactDetailPopup.push(Check.FirstPayee.Payee, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_16 () : void {
      ClaimContactDetailPopup.push(Check.FirstPayee.Payee, Check.Claim)
    }
    
    // 'action' attribute on ButtonInput (id=AddJointPayees) at ReissueCheckDV.pcf: line 55, column 48
    function action_40 () : void {
      Check.addNewPayee()
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_13 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Check.FirstPayee.Payee, Check.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at ReissueCheckDV.pcf: line 148, column 86
    function def_onEnter_102 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Check.CheckAddressOwner)
    }
    
    // 'def' attribute on ListViewInput at ReissueCheckDV.pcf: line 175, column 27
    function def_onEnter_116 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.onEnter(Check.Group.PrimaryCheck.Payments)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_9 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Check.FirstPayee.Payee), null, Check.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_10 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Check.FirstPayee.Payee), null, Check.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at ReissueCheckDV.pcf: line 148, column 86
    function def_refreshVariables_103 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Check.CheckAddressOwner)
    }
    
    // 'def' attribute on ListViewInput at ReissueCheckDV.pcf: line 175, column 27
    function def_refreshVariables_117 (def :  pcf.CheckSummaryPaymentsLV) : void {
      def.refreshVariables(Check.Group.PrimaryCheck.Payments)
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at ReissueCheckDV.pcf: line 141, column 98
    function defaultSetter_100 (__VALUE_TO_SET :  java.lang.Object) : void {
      showAddressFields = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeductionType) at ReissueCheckDV.pcf: line 160, column 40
    function defaultSetter_111 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.DeductionType = (__VALUE_TO_SET as typekey.DeductionType)
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at ReissueCheckDV.pcf: line 24, column 33
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.FirstPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.FirstPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on TextAreaInput (id=Check_PayTo) at ReissueCheckDV.pcf: line 109, column 30
    function defaultSetter_76 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeliveryMethod) at ReissueCheckDV.pcf: line 121, column 64
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.DeliveryMethod = (__VALUE_TO_SET as typekey.DeliveryMethod)
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at ReissueCheckDV.pcf: line 128, column 64
    function defaultSetter_89 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.MailTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onChange' attribute on PostOnChange at ReissueCheckDV.pcf: line 40, column 126
    function onChange_5 () : void {
      Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_18 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Check.FirstPayee.Payee); var result = eval("Check.FirstPayee.Payee = Check.Claim.resolveContact(Check.FirstPayee.Payee) as " + contactType.Name + ";return null;"); Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ReissueCheckDV.pcf: line 38, column 47
    function onPick_26 (PickedValue :  java.lang.Object) : void {
      Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();
    }
    
    // 'value' attribute on RowIterator at ReissueCheckDV.pcf: line 84, column 58
    function sortValue_41 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on RowIterator at ReissueCheckDV.pcf: line 95, column 50
    function sortValue_42 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.PayeeType
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at ReissueCheckDV.pcf: line 74, column 45
    function toCreateAndAdd_70 () : entity.CheckPayee {
      return Check.addNewPayee()
    }
    
    // 'toRemove' attribute on RowIterator at ReissueCheckDV.pcf: line 74, column 45
    function toRemove_71 (CheckPayee :  entity.CheckPayee) : void {
      Check.removeFromPayees(CheckPayee); Check.handleOnPickForPayee(null)
    }
    
    // 'validationExpression' attribute on TypeKeyInput (id=Check_DeductionType) at ReissueCheckDV.pcf: line 160, column 40
    function validationExpression_105 () : java.lang.Object {
      return (Check.isPrimary()) ? ((Check.DeductionType != null) ? DisplayKey.get("Java.NewPayment.Error.DeductionTypeNotNull") : null) : ((Check.DeductionType == null) ? DisplayKey.get("Java.NewPayment.Error.DeductionTypeNull") : null)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_22 () : java.lang.Object {
      return Check.Claim.PayeeCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function valueRange_35 () : java.lang.Object {
      return Check.getAllowedPayeeTypes(Check.FirstPayee.Payee)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_21 () : java.lang.Object {
      return Check.FirstPayee
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at ReissueCheckDV.pcf: line 24, column 33
    function valueRoot_3 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at ReissueCheckDV.pcf: line 134, column 64
    function valueRoot_95 () : java.lang.Object {
      return Check.CheckAddressOwner
    }
    
    // 'value' attribute on TextInput (id=Check_Comments) at ReissueCheckDV.pcf: line 24, column 33
    function value_0 () : java.lang.String {
      return Check.Comments
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeductionType) at ReissueCheckDV.pcf: line 160, column 40
    function value_107 () : typekey.DeductionType {
      return Check.DeductionType
    }
    
    // 'value' attribute on CurrencyInput (id=Check_NetAmount) at ReissueCheckDV.pcf: line 168, column 59
    function value_113 () : gw.api.financials.CurrencyAmountPair {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function value_30 () : typekey.ContactRole {
      return Check.FirstPayee.PayeeType
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ReissueCheckDV.pcf: line 38, column 47
    function value_7 () : entity.Contact {
      return Check.FirstPayee.Payee
    }
    
    // 'value' attribute on RowIterator at ReissueCheckDV.pcf: line 74, column 45
    function value_72 () : entity.CheckPayee[] {
      return Check.Payees
    }
    
    // 'value' attribute on TextAreaInput (id=Check_PayTo) at ReissueCheckDV.pcf: line 109, column 30
    function value_74 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_DeliveryMethod) at ReissueCheckDV.pcf: line 121, column 64
    function value_80 () : typekey.DeliveryMethod {
      return Check.DeliveryMethod
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at ReissueCheckDV.pcf: line 128, column 64
    function value_86 () : java.lang.String {
      return Check.MailTo
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at ReissueCheckDV.pcf: line 134, column 64
    function value_92 () : entity.Address {
      return Check.CheckAddressOwner.Address
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at ReissueCheckDV.pcf: line 141, column 98
    function value_97 () : java.lang.Boolean {
      return showAddressFields
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function verifyValueRangeIsAllowedType_36 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function verifyValueRangeIsAllowedType_36 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_24 () : void {
      var __valueRangeArg = Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at ReissueCheckDV.pcf: line 50, column 48
    function verifyValueRange_37 () : void {
      var __valueRangeArg = Check.getAllowedPayeeTypes(Check.FirstPayee.Payee)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_36(__valueRangeArg)
    }
    
    // 'visible' attribute on InputSetRef (id=MailingAddressInputSet) at ReissueCheckDV.pcf: line 148, column 86
    function visible_101 () : java.lang.Boolean {
      return Check.PaymentMethod != PaymentMethod.TC_EFT and showAddressFields
    }
    
    // 'visible' attribute on InputDivider at ReissueCheckDV.pcf: line 150, column 40
    function visible_104 () : java.lang.Boolean {
      return oldCheckIsSecondary
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_11 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on Label at ReissueCheckDV.pcf: line 28, column 48
    function visible_4 () : java.lang.Boolean {
      return Check.Payees.length <= 1
    }
    
    // 'visible' attribute on ListViewInput at ReissueCheckDV.pcf: line 61, column 46
    function visible_73 () : java.lang.Boolean {
      return Check.Payees.length > 1
    }
    
    // 'visible' attribute on Label at ReissueCheckDV.pcf: line 114, column 64
    function visible_78 () : java.lang.Boolean {
      return Check.PaymentMethod != PaymentMethod.TC_EFT
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_8 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on CheckBoxInput (id=ToggleAddressEdit) at ReissueCheckDV.pcf: line 141, column 98
    function visible_96 () : java.lang.Boolean {
      return Check.PaymentMethod != PaymentMethod.TC_EFT and Check.FirstPayee.Payee != null
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    property get oldCheckIsSecondary () : Boolean {
      return getRequireValue("oldCheckIsSecondary", 0) as Boolean
    }
    
    property set oldCheckIsSecondary ($arg :  Boolean) {
      setRequireValue("oldCheckIsSecondary", 0, $arg)
    }
    
    property get showAddressFields () : boolean {
      return getVariableValue("showAddressFields", 0) as java.lang.Boolean
    }
    
    property set showAddressFields ($arg :  boolean) {
      setVariableValue("showAddressFields", 0, $arg)
    }
    
    
  }
  
  
}