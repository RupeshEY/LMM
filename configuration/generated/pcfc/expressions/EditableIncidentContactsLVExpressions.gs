package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/vehicle/EditableIncidentContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableIncidentContactsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/vehicle/EditableIncidentContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableIncidentContactsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 34, column 29
    function sortValue_0 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Contact
    }
    
    // 'value' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 43, column 28
    function sortValue_1 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Role
    }
    
    // 'value' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 54, column 44
    function sortValue_2 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Active
    }
    
    // 'value' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 61, column 29
    function sortValue_3 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.Comments
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 21, column 45
    function toCreateAndAdd_40 () : entity.ClaimContactRole {
      return Incident.addEmptyRole(null)
    }
    
    // 'toRemove' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 21, column 45
    function toRemove_41 (ClaimContactRole :  entity.ClaimContactRole) : void {
      Incident.removeRole(ClaimContactRole)
    }
    
    // 'value' attribute on RowIterator at EditableIncidentContactsLV.pcf: line 21, column 45
    function value_42 () : entity.ClaimContactRole[] {
      return Incident.getNonExclusiveRoles()
    }
    
    property get Incident () : Incident {
      return getRequireValue("Incident", 0) as Incident
    }
    
    property set Incident ($arg :  Incident) {
      setRequireValue("Incident", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/shared/vehicle/EditableIncidentContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableIncidentContactsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 18, column 285
    function action_11 () : void {
      if (ClaimContactRole.Contact != null) { ClaimContactDetailPopup.push(ClaimContactRole.Contact, Incident.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function action_12 () : void {
      ClaimContactDetailPopup.push(ClaimContactRole.Contact, Incident.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function action_9 () : void {
      AddressBookPickerPopup.push(statictypeof (ClaimContactRole.Contact), Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_10 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (ClaimContactRole.Contact), Incident.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_13 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimContactRole.Contact, Incident.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_6 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (ClaimContactRole.Contact), null, Incident.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_7 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (ClaimContactRole.Contact), null, Incident.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Contact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Role = (__VALUE_TO_SET as typekey.ContactRole)
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsActive) at EditableIncidentContactsLV.pcf: line 54, column 44
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Active = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableIncidentContactsLV.pcf: line 61, column 29
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.Comments = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'editable' attribute on Row at EditableIncidentContactsLV.pcf: line 23, column 55
    function editable_39 () : java.lang.Boolean {
      return ClaimContactRole.isEditableInELV()
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_14 (PickedValue :  Contact) : void {
      var contactType = statictypeof (ClaimContactRole.Contact); var result = eval("ClaimContactRole.Contact = Incident.Claim.resolveContact(ClaimContactRole.Contact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_18 () : java.lang.Object {
      return Incident.Claim.RelatedContacts
    }
    
    // 'valueRange' attribute on Reflect at EditableIncidentContactsLV.pcf: line 46, column 75
    function valueRange_23 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return Incident.getSuitableNonExclusiveRolesFor(VALUE)
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function valueRange_28 () : java.lang.Object {
      return Incident.getSuitableNonExclusiveRolesFor(ClaimContactRole.Contact)
    }
    
    // 'value' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_17 () : java.lang.Object {
      return ClaimContactRole
    }
    
    // 'value' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function value_24 () : typekey.ContactRole {
      return ClaimContactRole.Role
    }
    
    // 'value' attribute on BooleanRadioCell (id=IsActive) at EditableIncidentContactsLV.pcf: line 54, column 44
    function value_31 () : java.lang.Boolean {
      return ClaimContactRole.Active
    }
    
    // 'value' attribute on TextCell (id=Comments) at EditableIncidentContactsLV.pcf: line 61, column 29
    function value_35 () : java.lang.String {
      return ClaimContactRole.Comments
    }
    
    // 'value' attribute on ClaimContactCell (id=Contact) at EditableIncidentContactsLV.pcf: line 34, column 29
    function value_4 () : entity.Contact {
      return ClaimContactRole.Contact
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_19 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function verifyValueRangeIsAllowedType_29 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function verifyValueRangeIsAllowedType_29 ($$arg :  typekey.ContactRole[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_20 () : void {
      var __valueRangeArg = Incident.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_19(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=Role) at EditableIncidentContactsLV.pcf: line 43, column 28
    function verifyValueRange_30 () : void {
      var __valueRangeArg = Incident.getSuitableNonExclusiveRolesFor(ClaimContactRole.Contact)
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_29(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 14, column 229
    function visible_5 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=Contact) at ClaimContactWidget.xml: line 16, column 225
    function visible_8 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (ClaimContactRole.Contact), Incident.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get ClaimContactRole () : entity.ClaimContactRole {
      return getIteratedValue(1) as entity.ClaimContactRole
    }
    
    
  }
  
  
}