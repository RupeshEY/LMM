package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewManualCheckPayeeDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewManualCheckPayeeDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_45 () : void {
      AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 18, column 285
    function action_47 () : void {
      if (CheckPayee.Payee != null) { ClaimContactDetailPopup.push(CheckPayee.Payee, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_48 () : void {
      ClaimContactDetailPopup.push(CheckPayee.Payee, Check.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_46 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(CheckPayee.Payee, Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_42 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (CheckPayee.Payee), null, Check.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_43 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (CheckPayee.Payee), null, Check.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at NewManualCheckPayeeDV.pcf: line 94, column 50
    function defaultSetter_64 (__VALUE_TO_SET :  java.lang.Object) : void {
      CheckPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'onChange' attribute on PostOnChange at NewManualCheckPayeeDV.pcf: line 85, column 70
    function onChange_39 () : void {
      Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function onPick_50 (PickedValue :  Contact) : void {
      var contactType = statictypeof (CheckPayee.Payee); var result = eval("CheckPayee.Payee = Check.Claim.resolveContact(CheckPayee.Payee) as " + contactType.Name + ";return null;"); Check.handleOnPickForPayee(CheckPayee);
    }
    
    // 'onPick' attribute on ClaimContactCell (id=PayeeName) at NewManualCheckPayeeDV.pcf: line 83, column 58
    function onPick_57 (PickedValue :  java.lang.Object) : void {
      Check.handleOnPickForPayee(CheckPayee)
    }
    
    // 'validationExpression' attribute on TypeKeyCell (id=PayeeType) at NewManualCheckPayeeDV.pcf: line 94, column 50
    function validationExpression_60 () : java.lang.Object {
      return CheckPayee.PayeeType == TC_CLAIMANT && !CheckPayee.ClaimContact.isClaimant() ? DisplayKey.get("Java.NewPayment.Error.PayeeIsNotClaimant") : null
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_54 () : java.lang.Object {
      return Check.Claim.PayeeCandidates
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_53 () : java.lang.Object {
      return CheckPayee
    }
    
    // 'value' attribute on ClaimContactCell (id=PayeeName) at NewManualCheckPayeeDV.pcf: line 83, column 58
    function value_40 () : entity.Contact {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on TypeKeyCell (id=PayeeType) at NewManualCheckPayeeDV.pcf: line 94, column 50
    function value_61 () : typekey.ContactRole {
      return CheckPayee.PayeeType
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_56 () : void {
      var __valueRangeArg = Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_55(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 14, column 229
    function visible_41 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=PayeeName) at ClaimContactWidget.xml: line 16, column 225
    function visible_44 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (CheckPayee.Payee), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get CheckPayee () : entity.CheckPayee {
      return getIteratedValue(1) as entity.CheckPayee
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/manualcheck/NewManualCheckPayeeDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewManualCheckPayeeDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 18, column 285
    function action_10 () : void {
      if (Check.FirstPayee.Payee != null) { ClaimContactDetailPopup.push(Check.FirstPayee.Payee, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(Check.FirstPayee.Payee, Check.Claim)
    }
    
    // 'action' attribute on ButtonInput (id=AddJointPayees) at NewManualCheckPayeeDV.pcf: line 53, column 48
    function action_36 () : void {
      Check.addNewPayee()
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_8 () : void {
      AddressBookPickerPopup.push(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Check.FirstPayee.Payee, Check.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_9 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at NewManualCheckPayeeDV.pcf: line 150, column 38
    function def_onEnter_101 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(Check.CheckAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_5 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Check.FirstPayee.Payee), null, Check.Claim)
    }
    
    // 'def' attribute on InputSetRef (id=MailingAddressInputSet) at NewManualCheckPayeeDV.pcf: line 150, column 38
    function def_refreshVariables_102 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(Check.CheckAddressOwner)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Check.FirstPayee.Payee), null, Check.Claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Reportability) at NewManualCheckPayeeDV.pcf: line 159, column 47
    function defaultSetter_105 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.Reportability = (__VALUE_TO_SET as typekey.ReportabilityType)
    }
    
    // 'value' attribute on DateInput (id=Check_IssueDate) at NewManualCheckPayeeDV.pcf: line 169, column 34
    function defaultSetter_113 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.IssueDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Check_CheckNumber) at NewManualCheckPayeeDV.pcf: line 174, column 36
    function defaultSetter_119 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.CheckNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_BankAccount) at NewManualCheckPayeeDV.pcf: line 180, column 42
    function defaultSetter_125 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.BankAccount = (__VALUE_TO_SET as typekey.BankAccount)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.FirstPayee.Payee = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.FirstPayee.PayeeType = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on TextAreaInput (id=Check_PayTo) at NewManualCheckPayeeDV.pcf: line 108, column 30
    function defaultSetter_73 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.PayTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function defaultSetter_77 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.DeliveryMethod = (__VALUE_TO_SET as typekey.DeliveryMethod)
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at NewManualCheckPayeeDV.pcf: line 125, column 30
    function defaultSetter_85 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.MailTo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at NewManualCheckPayeeDV.pcf: line 143, column 50
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      showAddressFields = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on DateInput (id=Check_IssueDate) at NewManualCheckPayeeDV.pcf: line 169, column 34
    function editable_107 () : java.lang.Boolean {
      return Check.New
    }
    
    // 'filter' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function filter_79 (VALUE :  typekey.DeliveryMethod, VALUES :  typekey.DeliveryMethod[]) : java.lang.Boolean {
      return VALUE != DeliveryMethod.TC_SEND
    }
    
    // 'onChange' attribute on PostOnChange at NewManualCheckPayeeDV.pcf: line 38, column 126
    function onChange_1 () : void {
      Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Check.FirstPayee.Payee); var result = eval("Check.FirstPayee.Payee = Check.Claim.resolveContact(Check.FirstPayee.Payee) as " + contactType.Name + ";return null;"); Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryPayee_Name) at NewManualCheckPayeeDV.pcf: line 36, column 47
    function onPick_22 (PickedValue :  java.lang.Object) : void {
      Check.handleOnPickForPayee(Check.FirstPayee); showAddressFields = !Check.addressRequiredFieldsValid();
    }
    
    // 'value' attribute on RowIterator at NewManualCheckPayeeDV.pcf: line 83, column 58
    function sortValue_37 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.Payee
    }
    
    // 'value' attribute on RowIterator at NewManualCheckPayeeDV.pcf: line 94, column 50
    function sortValue_38 (CheckPayee :  entity.CheckPayee) : java.lang.Object {
      return CheckPayee.PayeeType
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at NewManualCheckPayeeDV.pcf: line 73, column 45
    function toCreateAndAdd_66 () : entity.CheckPayee {
      return Check.addNewPayee()
    }
    
    // 'toRemove' attribute on RowIterator at NewManualCheckPayeeDV.pcf: line 73, column 45
    function toRemove_67 (CheckPayee :  entity.CheckPayee) : void {
      Check.removeFromPayees(CheckPayee); Check.handleOnPickForPayee(null);
    }
    
    // 'validationExpression' attribute on DateInput (id=Check_IssueDate) at NewManualCheckPayeeDV.pcf: line 169, column 34
    function validationExpression_108 () : java.lang.Object {
      return Check.IssueDate == null || Check.IssueDate <= gw.api.util.DateUtil.currentDate() ? null : DisplayKey.get("Java.NewPayment.Error.IssueDate")
    }
    
    // 'validationExpression' attribute on ListViewPanel (id=NewCheckPayeeDVPayeesLV) at NewManualCheckPayeeDV.pcf: line 66, column 75
    function validationExpression_69 () : java.lang.Object {
      Check.validateCheckPayees(); return null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_18 () : java.lang.Object {
      return Check.Claim.PayeeCandidates
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function valueRange_31 () : java.lang.Object {
      return Check.getAllowedPayeeTypes(Check.FirstPayee.Payee)
    }
    
    // 'valueRange' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function valueRange_80 () : java.lang.Object {
      return DeliveryMethod.getTypeKeys(false)
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_17 () : java.lang.Object {
      return Check.FirstPayee
    }
    
    // 'value' attribute on TextAreaInput (id=Check_PayTo) at NewManualCheckPayeeDV.pcf: line 108, column 30
    function valueRoot_74 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at NewManualCheckPayeeDV.pcf: line 136, column 37
    function valueRoot_94 () : java.lang.Object {
      return Check.CheckAddressOwner
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_Reportability) at NewManualCheckPayeeDV.pcf: line 159, column 47
    function value_103 () : typekey.ReportabilityType {
      return Check.Reportability
    }
    
    // 'value' attribute on DateInput (id=Check_IssueDate) at NewManualCheckPayeeDV.pcf: line 169, column 34
    function value_109 () : java.util.Date {
      return Check.IssueDate
    }
    
    // 'value' attribute on TextInput (id=Check_CheckNumber) at NewManualCheckPayeeDV.pcf: line 174, column 36
    function value_116 () : java.lang.String {
      return Check.CheckNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Check_BankAccount) at NewManualCheckPayeeDV.pcf: line 180, column 42
    function value_122 () : typekey.BankAccount {
      return Check.BankAccount
    }
    
    // 'value' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function value_26 () : typekey.ContactRole {
      return Check.FirstPayee.PayeeType
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryPayee_Name) at NewManualCheckPayeeDV.pcf: line 36, column 47
    function value_3 () : entity.Contact {
      return Check.FirstPayee.Payee
    }
    
    // 'value' attribute on RowIterator at NewManualCheckPayeeDV.pcf: line 73, column 45
    function value_68 () : entity.CheckPayee[] {
      return Check.Payees
    }
    
    // 'value' attribute on TextAreaInput (id=Check_PayTo) at NewManualCheckPayeeDV.pcf: line 108, column 30
    function value_71 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function value_75 () : typekey.DeliveryMethod {
      return Check.DeliveryMethod
    }
    
    // 'value' attribute on TextInput (id=Check_MailToContact) at NewManualCheckPayeeDV.pcf: line 125, column 30
    function value_83 () : java.lang.String {
      return Check.MailTo
    }
    
    // 'value' attribute on TextInput (id=OldMailingAddress) at NewManualCheckPayeeDV.pcf: line 131, column 51
    function value_88 () : java.lang.String {
      return Check.OldMailToAddress
    }
    
    // 'value' attribute on TextInput (id=Check_MailingAddress) at NewManualCheckPayeeDV.pcf: line 136, column 37
    function value_92 () : entity.Address {
      return Check.CheckAddressOwner.Address
    }
    
    // 'value' attribute on CheckBoxInput (id=ToggleAddressEdit) at NewManualCheckPayeeDV.pcf: line 143, column 50
    function value_96 () : java.lang.Boolean {
      return showAddressFields
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function verifyValueRangeIsAllowedType_32 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function verifyValueRangeIsAllowedType_32 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function verifyValueRangeIsAllowedType_81 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function verifyValueRangeIsAllowedType_81 ($$arg :  typekey.DeliveryMethod[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Check.Claim.PayeeCandidates
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=PrimaryPayee_Type) at NewManualCheckPayeeDV.pcf: line 48, column 48
    function verifyValueRange_33 () : void {
      var __valueRangeArg = Check.getAllowedPayeeTypes(Check.FirstPayee.Payee)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_32(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeInput (id=Check_DeliveryMethod) at NewManualCheckPayeeDV.pcf: line 119, column 45
    function verifyValueRange_82 () : void {
      var __valueRangeArg = DeliveryMethod.getTypeKeys(false)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_81(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at NewManualCheckPayeeDV.pcf: line 26, column 48
    function visible_0 () : java.lang.Boolean {
      return Check.Payees.length <= 1
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 14, column 229
    function visible_4 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryPayee_Name) at ClaimContactWidget.xml: line 16, column 225
    function visible_7 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Check.FirstPayee.Payee), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ListViewInput at NewManualCheckPayeeDV.pcf: line 59, column 46
    function visible_70 () : java.lang.Boolean {
      return Check.Payees.length > 1
    }
    
    // 'visible' attribute on TextInput (id=OldMailingAddress) at NewManualCheckPayeeDV.pcf: line 131, column 51
    function visible_87 () : java.lang.Boolean {
      return Check.OldMailToAddress != null
    }
    
    // 'visible' attribute on CheckBoxInput (id=ToggleAddressEdit) at NewManualCheckPayeeDV.pcf: line 143, column 50
    function visible_95 () : java.lang.Boolean {
      return Check.FirstPayee.Payee != null
    }
    
    property get Check () : Check {
      return getRequireValue("Check", 0) as Check
    }
    
    property set Check ($arg :  Check) {
      setRequireValue("Check", 0, $arg)
    }
    
    property get Wizard () : gw.api.financials.CheckWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.financials.CheckWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.financials.CheckWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get showAddressFields () : boolean {
      return getVariableValue("showAddressFields", 0) as java.lang.Boolean
    }
    
    property set showAddressFields ($arg :  boolean) {
      setVariableValue("showAddressFields", 0, $arg)
    }
    
    
  }
  
  
}