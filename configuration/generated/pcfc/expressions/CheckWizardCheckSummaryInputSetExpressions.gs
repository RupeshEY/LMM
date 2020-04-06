package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CheckWizardCheckSummaryInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizardCheckSummaryInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on CurrencyInput (id=Check_Deductions) at CheckWizardCheckSummaryInputSet.pcf: line 55, column 57
    function action_22 () : void {
      CheckWizard_PaymentDeductionsPagePopup.push(Check.Claim, Wizard, Check)
    }
    
    // 'action' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_33 () : void {
      AddressBookPickerPopup.push(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 18, column 285
    function action_35 () : void {
      if (Check.Claimant != null) { ClaimContactDetailPopup.push(Check.Claimant, Check.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_36 () : void {
      ClaimContactDetailPopup.push(Check.Claimant, Check.Claim)
    }
    
    // 'action' attribute on CurrencyInput (id=Check_Deductions) at CheckWizardCheckSummaryInputSet.pcf: line 55, column 57
    function action_dest_23 () : pcf.api.Destination {
      return pcf.CheckWizard_PaymentDeductionsPagePopup.createDestination(Check.Claim, Wizard, Check)
    }
    
    // 'action' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_34 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_37 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Check.Claimant, Check.Claim)
    }
    
    // 'available' attribute on CurrencyInput (id=Check_Deductions) at CheckWizardCheckSummaryInputSet.pcf: line 55, column 57
    function available_19 () : java.lang.Boolean {
      return Check.Deductions.length != 0
    }
    
    // 'def' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 18, column 44
    function def_onEnter_1 (def :  pcf.NewCheckGroupChecksLV) : void {
      def.onEnter(Check.Group)
    }
    
    // 'def' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_30 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Check.Claimant), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 116, column 38
    function def_onEnter_86 (def :  pcf.TransactionSetDocumentsLV) : void {
      def.onEnter(Check.CheckSet)
    }
    
    // 'def' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 18, column 44
    function def_refreshVariables_2 (def :  pcf.NewCheckGroupChecksLV) : void {
      def.refreshVariables(Check.Group)
    }
    
    // 'def' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_31 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Check.Claimant), null, Check.Claim)
    }
    
    // 'def' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 116, column 38
    function def_refreshVariables_87 (def :  pcf.TransactionSetDocumentsLV) : void {
      def.refreshVariables(Check.CheckSet)
    }
    
    // 'value' attribute on DateInput (id=Check_DateOfService) at CheckWizardCheckSummaryInputSet.pcf: line 76, column 56
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.DateOfService = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ServicePeriod_Start) at CheckWizardCheckSummaryInputSet.pcf: line 84, column 55
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ServicePdStart = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=ServicePeriod_End) at CheckWizardCheckSummaryInputSet.pcf: line 92, column 55
    function defaultSetter_70 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.ServicePdEnd = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=Check_InvoiceNumber) at CheckWizardCheckSummaryInputSet.pcf: line 104, column 36
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.InvoiceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Check_Memo) at CheckWizardCheckSummaryInputSet.pcf: line 110, column 27
    function defaultSetter_83 (__VALUE_TO_SET :  java.lang.Object) : void {
      Check.Memo = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on DateInput (id=ServicePeriod_Start) at CheckWizardCheckSummaryInputSet.pcf: line 84, column 55
    function editable_52 () : java.lang.Boolean {
      return Check.Editable and !Check.CheckSet.Recurring
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function onPick_38 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Check.Claimant); var result = eval("Check.Claimant = Check.Claim.resolveContact(Check.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=ServicePeriod_Start) at CheckWizardCheckSummaryInputSet.pcf: line 84, column 55
    function validationExpression_53 () : java.lang.Object {
      return validateServiceStartDate()
    }
    
    // 'validationExpression' attribute on DateInput (id=ServicePeriod_End) at CheckWizardCheckSummaryInputSet.pcf: line 92, column 55
    function validationExpression_63 () : java.lang.Object {
      return validateServicePeriod()
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_41 () : java.lang.Object {
      return Check.Claim.RelatedContacts
    }
    
    // 'value' attribute on TextInput (id=Check_PayTo) at CheckWizardCheckSummaryInputSet.pcf: line 26, column 96
    function valueRoot_7 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextInput (id=Check_MailTo) at CheckWizardCheckSummaryInputSet.pcf: line 39, column 96
    function value_14 () : java.lang.String {
      return Check.FormatAddressSummary(true)
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Gross) at CheckWizardCheckSummaryInputSet.pcf: line 46, column 57
    function value_17 () : gw.api.financials.CurrencyAmountPair {
      return (!Check.isGroupMember(false) ? Check.GrossAmountPair : Check.Group.GrossAmountPair)
    }
    
    // 'value' attribute on CurrencyInput (id=Check_Deductions) at CheckWizardCheckSummaryInputSet.pcf: line 55, column 57
    function value_20 () : gw.api.financials.CurrencyAmountPair {
      return Check.DeductionsTotalPair
    }
    
    // 'value' attribute on CurrencyInput (id=Amount_Net) at CheckWizardCheckSummaryInputSet.pcf: line 62, column 57
    function value_26 () : gw.api.financials.CurrencyAmountPair {
      return (!Check.isGroupMember(false) ? Check.NetAmountPair : Check.Group.NetAmountPair)
    }
    
    // 'value' attribute on ClaimContactInput (id=Check_Claimant) at CheckWizardCheckSummaryInputSet.pcf: line 69, column 49
    function value_28 () : entity.Contact {
      return Check.Claimant
    }
    
    // 'value' attribute on TextInput (id=Check_PayTo) at CheckWizardCheckSummaryInputSet.pcf: line 26, column 96
    function value_4 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on DateInput (id=Check_DateOfService) at CheckWizardCheckSummaryInputSet.pcf: line 76, column 56
    function value_47 () : java.util.Date {
      return Check.DateOfService
    }
    
    // 'value' attribute on DateInput (id=ServicePeriod_Start) at CheckWizardCheckSummaryInputSet.pcf: line 84, column 55
    function value_55 () : java.util.Date {
      return Check.ServicePdStart
    }
    
    // 'value' attribute on DateInput (id=ServicePeriod_End) at CheckWizardCheckSummaryInputSet.pcf: line 92, column 55
    function value_65 () : java.util.Date {
      return Check.ServicePdEnd
    }
    
    // 'value' attribute on TextInput (id=Check_PrevServiceDate) at CheckWizardCheckSummaryInputSet.pcf: line 98, column 55
    function value_73 () : java.lang.String {
      return Check.PrevPaidOrScheduledServicePeriod
    }
    
    // 'value' attribute on TextInput (id=Check_InvoiceNumber) at CheckWizardCheckSummaryInputSet.pcf: line 104, column 36
    function value_77 () : java.lang.String {
      return Check.InvoiceNumber
    }
    
    // 'value' attribute on TextInput (id=Check_Memo) at CheckWizardCheckSummaryInputSet.pcf: line 110, column 27
    function value_81 () : java.lang.String {
      return Check.Memo
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_42 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_42 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_42 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_43 () : void {
      var __valueRangeArg = Check.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_42(__valueRangeArg)
    }
    
    // 'visible' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 18, column 44
    function visible_0 () : java.lang.Boolean {
      return Check.isGroupMember(false)
    }
    
    // 'visible' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 14, column 229
    function visible_29 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on TextInput (id=Check_PayTo) at CheckWizardCheckSummaryInputSet.pcf: line 26, column 96
    function visible_3 () : java.lang.Boolean {
      return !Check.isGroupMember(false) and Check.PaymentMethod == PaymentMethod.TC_CHECK
    }
    
    // 'visible' attribute on ClaimContactInput (id=Check_Claimant) at ClaimContactWidget.xml: line 16, column 225
    function visible_32 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Check.Claimant), Check.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on DateInput (id=Check_DateOfService) at CheckWizardCheckSummaryInputSet.pcf: line 76, column 56
    function visible_46 () : java.lang.Boolean {
      return !Check.hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on DateInput (id=ServicePeriod_Start) at CheckWizardCheckSummaryInputSet.pcf: line 84, column 55
    function visible_54 () : java.lang.Boolean {
      return Check.hasExposureWithServicePeriod()
    }
    
    // 'visible' attribute on TextAreaInput (id=PayTo_AccountName) at CheckWizardCheckSummaryInputSet.pcf: line 33, column 62
    function visible_8 () : java.lang.Boolean {
      return Check.PaymentMethod == PaymentMethod.TC_EFT
    }
    
    // 'visible' attribute on ListViewInput at CheckWizardCheckSummaryInputSet.pcf: line 116, column 38
    function visible_85 () : java.lang.Boolean {
      return perm.System.viewdocs
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
    
    function validateServicePeriod(): String {
          var result: String = null
    
          if ((Check.ServicePdStart != null and Check.ServicePdEnd == null)
            or (Check.ServicePdStart == null and Check.ServicePdEnd != null)) {
            result = DisplayKey.get("Web.Financials.Check.ServicePeriodNotInSync")
          } else if (Check.ServicePdEnd != null and !Check.ServicePdEnd.after(Check.ServicePdStart)) {
            result = DisplayKey.get("Web.Financials.Check.ServicePeriodRangeError")
          }
    
          return result
        }
    
          function validateServiceStartDate(): String {
            var result: String = null
            if (Check.ServicePdStart != null and Check.Claim.LossDate != null) {
              if (Check.ServicePdStart.before(Check.Claim.LossDate.trimToMidnight())) {
                result = DisplayKey.get("Web.Financials.Check.ServicePeriodStartDate")
              }
            }
            return result
          }
    
    
  }
  
  
}