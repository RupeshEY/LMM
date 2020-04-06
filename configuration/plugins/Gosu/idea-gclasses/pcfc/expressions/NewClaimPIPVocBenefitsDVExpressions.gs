package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPIPVocBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimPIPVocBenefitsDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPIPVocBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPIPVocBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 16, column 225
    function action_15 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.casemgmtco), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 18, column 285
    function action_17 () : void {
      if (Exposure.casemgmtco != null) { ClaimContactDetailPopup.push(Exposure.casemgmtco, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function action_18 () : void {
      ClaimContactDetailPopup.push(Exposure.casemgmtco, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 16, column 225
    function action_45 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.casemgr), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 18, column 285
    function action_47 () : void {
      if (Exposure.casemgr != null) { ClaimContactDetailPopup.push(Exposure.casemgr, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function action_48 () : void {
      ClaimContactDetailPopup.push(Exposure.casemgr, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_16 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.casemgmtco), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_19 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.casemgmtco, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_46 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.casemgr), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.casemgr, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_12 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.casemgmtco), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_42 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.casemgr), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_13 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.casemgmtco), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_43 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.casemgr), null, Exposure.Claim)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimPIPVocBenefitsDV.pcf: line 18, column 60
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPVocBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.casemgmtco = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_52 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.casemgr = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at NewClaimPIPVocBenefitsDV.pcf: line 69, column 54
    function defaultSetter_67 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPVocBenefits.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimPIPVocBenefitsDV.pcf: line 24, column 58
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPVocBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function onPick_20 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.casemgmtco); var result = eval("Exposure.casemgmtco = Exposure.Claim.resolveContact(Exposure.casemgmtco) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function onPick_50 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.casemgr); var result = eval("Exposure.casemgr = Exposure.Claim.resolveContact(Exposure.casemgr) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at NewClaimPIPVocBenefitsDV.pcf: line 39, column 53
    function reflectionValue_30 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on Reflect at NewClaimPIPVocBenefitsDV.pcf: line 47, column 44
    function reflectionValue_35 (TRIGGER_INDEX :  int, VALUE :  entity.Company) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'value' attribute on Reflect at NewClaimPIPVocBenefitsDV.pcf: line 63, column 44
    function reflectionValue_60 (TRIGGER_INDEX :  int, VALUE :  entity.Person) : java.lang.Object {
      return VALUE.PrimaryPhoneValue
    }
    
    // 'validationExpression' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimPIPVocBenefitsDV.pcf: line 24, column 58
    function validationExpression_4 () : java.lang.Object {
      return !(Exposure.PIPVocBenefits.BenefitsBeginDate > Exposure.PIPVocBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_24 () : java.lang.Object {
      return Exposure.Claim.RelatedCompanyArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_54 () : java.lang.Object {
      return Exposure.Claim.RelatedPersonArray
    }
    
    // 'value' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_23 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimPIPVocBenefitsDV.pcf: line 18, column 60
    function valueRoot_3 () : java.lang.Object {
      return Exposure.PIPVocBenefits
    }
    
    // 'value' attribute on TextInput (id=CaseManagementCompany_PrimaryAddress) at NewClaimPIPVocBenefitsDV.pcf: line 36, column 64
    function valueRoot_34 () : java.lang.Object {
      return Exposure.casemgmtco
    }
    
    // 'value' attribute on TextInput (id=CaseMgr_PrimaryPhone) at NewClaimPIPVocBenefitsDV.pcf: line 60, column 52
    function valueRoot_64 () : java.lang.Object {
      return Exposure.casemgr
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate) at NewClaimPIPVocBenefitsDV.pcf: line 18, column 60
    function value_0 () : java.util.Date {
      return Exposure.PIPVocBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at NewClaimPIPVocBenefitsDV.pcf: line 32, column 37
    function value_10 () : entity.Company {
      return Exposure.casemgmtco
    }
    
    // 'value' attribute on TextInput (id=CaseManagementCompany_PrimaryAddress) at NewClaimPIPVocBenefitsDV.pcf: line 36, column 64
    function value_32 () : java.lang.String {
      return Exposure.casemgmtco.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=CaseManagementCompany_PrimaryPhone) at NewClaimPIPVocBenefitsDV.pcf: line 44, column 55
    function value_37 () : java.lang.String {
      return Exposure.casemgmtco.PrimaryPhoneValue
    }
    
    // 'value' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at NewClaimPIPVocBenefitsDV.pcf: line 56, column 36
    function value_40 () : entity.Person {
      return Exposure.casemgr
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate) at NewClaimPIPVocBenefitsDV.pcf: line 24, column 58
    function value_5 () : java.util.Date {
      return Exposure.PIPVocBenefits.BenefitsEndDate
    }
    
    // 'value' attribute on TextInput (id=CaseMgr_PrimaryPhone) at NewClaimPIPVocBenefitsDV.pcf: line 60, column 52
    function value_62 () : java.lang.String {
      return Exposure.casemgr.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description) at NewClaimPIPVocBenefitsDV.pcf: line 69, column 54
    function value_65 () : java.lang.String {
      return Exposure.PIPVocBenefits.Description
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_25 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_55 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_26 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_25(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_56 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_55(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at NewClaimPIPVocBenefitsDV.pcf: line 32, column 37
    function verifyValueType_29 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at NewClaimPIPVocBenefitsDV.pcf: line 56, column 36
    function verifyValueType_59 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 14, column 229
    function visible_11 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManagementCompany) at ClaimContactWidget.xml: line 16, column 225
    function visible_14 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.casemgmtco), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on ClaimContactInput (id=LostWagesBenefits_CaseManager) at ClaimContactWidget.xml: line 16, column 225
    function visible_44 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.casemgr), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}