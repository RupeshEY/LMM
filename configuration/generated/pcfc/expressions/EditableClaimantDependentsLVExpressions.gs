package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableClaimantDependentsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableClaimantDependentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 43, column 72
    function sortValue_0 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Contact
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 50, column 46
    function sortValue_1 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.DependentType
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 54, column 123
    function sortValue_2 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact != null ? ClaimContactRole.ClaimContact.Person.DateOfBirth : null
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 64, column 53
    function sortValue_3 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.BenefitEndReasonType
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 69, column 65
    function sortValue_4 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.BenefitEndDate
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 32, column 45
    function toCreateAndAdd_40 () : entity.ClaimContactRole {
      return ClaimContactRoleOwner.addEmptyRole(role)
    }
    
    // 'toRemove' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 32, column 45
    function toRemove_41 (ClaimContactRole :  entity.ClaimContactRole) : void {
      ClaimContactRoleOwner.removeRole(ClaimContactRole)
    }
    
    // 'value' attribute on RowIterator at EditableClaimantDependentsLV.pcf: line 32, column 45
    function value_42 () : entity.ClaimContactRole[] {
      return ClaimContactRoleList
    }
    
    property get ClaimContactRoleList () : ClaimContactRole[] {
      return getRequireValue("ClaimContactRoleList", 0) as ClaimContactRole[]
    }
    
    property set ClaimContactRoleList ($arg :  ClaimContactRole[]) {
      setRequireValue("ClaimContactRoleList", 0, $arg)
    }
    
    property get ClaimContactRoleOwner () : gw.api.contact.ClaimContactRoleOwner {
      return getRequireValue("ClaimContactRoleOwner", 0) as gw.api.contact.ClaimContactRoleOwner
    }
    
    property set ClaimContactRoleOwner ($arg :  gw.api.contact.ClaimContactRoleOwner) {
      setRequireValue("ClaimContactRoleOwner", 0, $arg)
    }
    
    property get role () : ContactRole {
      return getRequireValue("role", 0) as ContactRole
    }
    
    property set role ($arg :  ContactRole) {
      setRequireValue("role", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableClaimantDependentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableClaimantDependentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 16, column 225
    function action_10 () : void {
      AddressBookPickerPopup.push(statictypeof (ClaimContactRole.Contact), ClaimContactRoleOwner.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 18, column 285
    function action_12 () : void {
      if (ClaimContactRole.Contact != null) { ClaimContactDetailPopup.push(ClaimContactRole.Contact, ClaimContactRoleOwner.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function action_13 () : void {
      ClaimContactDetailPopup.push(ClaimContactRole.Contact, ClaimContactRoleOwner.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (ClaimContactRole.Contact), ClaimContactRoleOwner.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimContactRole.Contact, ClaimContactRoleOwner.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_7 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(statictypeof (ClaimContactRole.Contact), null, ClaimContactRoleOwner.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_8 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (ClaimContactRole.Contact), null, ClaimContactRoleOwner.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Contact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableClaimantDependents_DependentType) at EditableClaimantDependentsLV.pcf: line 50, column 46
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.DependentType = (__VALUE_TO_SET as typekey.DependentType)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableClaimantDependents_BenefitEndReasonType) at EditableClaimantDependentsLV.pcf: line 64, column 53
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.BenefitEndReasonType = (__VALUE_TO_SET as typekey.BenefitEndReasonType)
    }
    
    // 'value' attribute on DateCell (id=EditableClaimantDependents_BenefitEndDate) at EditableClaimantDependentsLV.pcf: line 69, column 65
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.BenefitEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function onPick_15 (PickedValue :  Contact) : void {
      var contactType = statictypeof (ClaimContactRole.Contact); var result = eval("ClaimContactRole.Contact = ClaimContactRoleOwner.Claim.resolveContact(ClaimContactRole.Contact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at EditableClaimantDependentsLV.pcf: line 57, column 71
    function reflectionValue_28 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return VALUE typeis Person ? (VALUE).DateOfBirth : null
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_19 () : java.lang.Object {
      return ClaimContactRoleOwner.Claim.RelatedPersonArray
    }
    
    // 'value' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_18 () : java.lang.Object {
      return ClaimContactRole
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableClaimantDependents_DependentType) at EditableClaimantDependentsLV.pcf: line 50, column 46
    function valueRoot_27 () : java.lang.Object {
      return ClaimContactRole.ClaimContact
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableClaimantDependents_DependentType) at EditableClaimantDependentsLV.pcf: line 50, column 46
    function value_24 () : typekey.DependentType {
      return ClaimContactRole.ClaimContact.DependentType
    }
    
    // 'value' attribute on DateCell (id=EditableClaimantDependents_DateOfBirth) at EditableClaimantDependentsLV.pcf: line 54, column 123
    function value_30 () : java.util.Date {
      return ClaimContactRole.ClaimContact.Contact != null ? ClaimContactRole.ClaimContact.Person.DateOfBirth : null
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableClaimantDependents_BenefitEndReasonType) at EditableClaimantDependentsLV.pcf: line 64, column 53
    function value_32 () : typekey.BenefitEndReasonType {
      return ClaimContactRole.ClaimContact.BenefitEndReasonType
    }
    
    // 'value' attribute on DateCell (id=EditableClaimantDependents_BenefitEndDate) at EditableClaimantDependentsLV.pcf: line 69, column 65
    function value_36 () : java.util.Date {
      return ClaimContactRole.ClaimContact.BenefitEndDate
    }
    
    // 'value' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at EditableClaimantDependentsLV.pcf: line 43, column 72
    function value_5 () : entity.Contact {
      return ClaimContactRole.Contact
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_21 () : void {
      var __valueRangeArg = ClaimContactRoleOwner.Claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 14, column 229
    function visible_6 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=EditableClaimantDependents_Dependent) at ClaimContactWidget.xml: line 16, column 225
    function visible_9 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (ClaimContactRole.Contact), ClaimContactRoleOwner.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get ClaimContactRole () : entity.ClaimContactRole {
      return getIteratedValue(1) as entity.ClaimContactRole
    }
    
    
  }
  
  
}