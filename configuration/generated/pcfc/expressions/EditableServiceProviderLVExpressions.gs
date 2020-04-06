package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableServiceProviderLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableServiceProviderLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 32, column 56
    function sortValue_0 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 36, column 76
    function sortValue_1 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 42, column 53
    function sortValue_2 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.EssentialServiceType
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 48, column 45
    function sortValue_3 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.ProviderType
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 53, column 58
    function sortValue_4 (ClaimContactRole :  entity.ClaimContactRole) : java.lang.Object {
      return ClaimContactRole.ClaimContact.Service
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at EditableServiceProviderLV.pcf: line 23, column 45
    function toCreateAndAdd_39 () : entity.ClaimContactRole {
      return Exposure.addEmptyRole(TC_RSBENPROVIDER)
    }
    
    // 'toRemove' attribute on RowIterator at EditableServiceProviderLV.pcf: line 23, column 45
    function toRemove_40 (ClaimContactRole :  entity.ClaimContactRole) : void {
      Exposure.removeRole(ClaimContactRole)
    }
    
    // 'value' attribute on RowIterator at EditableServiceProviderLV.pcf: line 23, column 45
    function value_41 () : entity.ClaimContactRole[] {
      return ClaimContactRoleList
    }
    
    property get ClaimContactRoleList () : ClaimContactRole[] {
      return getRequireValue("ClaimContactRoleList", 0) as ClaimContactRole[]
    }
    
    property set ClaimContactRoleList ($arg :  ClaimContactRole[]) {
      setRequireValue("ClaimContactRoleList", 0, $arg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/shared/exposures/EditableServiceProviderLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableServiceProviderLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 16, column 225
    function action_10 () : void {
      AddressBookPickerPopup.push(statictypeof (ClaimContactRole.ClaimContact.Contact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 18, column 285
    function action_12 () : void {
      if (ClaimContactRole.ClaimContact.Contact != null) { ClaimContactDetailPopup.push(ClaimContactRole.ClaimContact.Contact, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function action_13 () : void {
      ClaimContactDetailPopup.push(ClaimContactRole.ClaimContact.Contact, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (ClaimContactRole.ClaimContact.Contact), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(ClaimContactRole.ClaimContact.Contact, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_7 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (ClaimContactRole.ClaimContact.Contact), null, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_8 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (ClaimContactRole.ClaimContact.Contact), null, Exposure.Claim)
    }
    
    // 'value' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.Contact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableServiceProvider_ServiceType) at EditableServiceProviderLV.pcf: line 42, column 53
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.EssentialServiceType = (__VALUE_TO_SET as typekey.EssentialServiceType)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableServiceProvider_ProviderType) at EditableServiceProviderLV.pcf: line 48, column 45
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.ProviderType = (__VALUE_TO_SET as typekey.ProviderType)
    }
    
    // 'value' attribute on TextCell (id=EditableServiceProvider_Service) at EditableServiceProviderLV.pcf: line 53, column 58
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      ClaimContactRole.ClaimContact.Service = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onPick' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function onPick_15 (PickedValue :  Contact) : void {
      var contactType = statictypeof (ClaimContactRole.ClaimContact.Contact); var result = eval("ClaimContactRole.ClaimContact.Contact = Exposure.Claim.resolveContact(ClaimContactRole.ClaimContact.Contact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_19 () : java.lang.Object {
      return Exposure.Claim.RelatedContacts
    }
    
    // 'value' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_18 () : java.lang.Object {
      return ClaimContactRole.ClaimContact
    }
    
    // 'value' attribute on TextCell (id=EditableServiceProvider_Phone) at EditableServiceProviderLV.pcf: line 36, column 76
    function valueRoot_26 () : java.lang.Object {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=EditableServiceProvider_Phone) at EditableServiceProviderLV.pcf: line 36, column 76
    function value_24 () : java.lang.String {
      return ClaimContactRole.ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableServiceProvider_ServiceType) at EditableServiceProviderLV.pcf: line 42, column 53
    function value_27 () : typekey.EssentialServiceType {
      return ClaimContactRole.ClaimContact.EssentialServiceType
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableServiceProvider_ProviderType) at EditableServiceProviderLV.pcf: line 48, column 45
    function value_31 () : typekey.ProviderType {
      return ClaimContactRole.ClaimContact.ProviderType
    }
    
    // 'value' attribute on TextCell (id=EditableServiceProvider_Service) at EditableServiceProviderLV.pcf: line 53, column 58
    function value_35 () : java.lang.String {
      return ClaimContactRole.ClaimContact.Service
    }
    
    // 'value' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at EditableServiceProviderLV.pcf: line 32, column 56
    function value_5 () : entity.Contact {
      return ClaimContactRole.ClaimContact.Contact
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_20 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_21 () : void {
      var __valueRangeArg = Exposure.Claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_20(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 14, column 229
    function visible_6 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactCell (id=Exposure_RSBenProvider) at ClaimContactWidget.xml: line 16, column 225
    function visible_9 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (ClaimContactRole.ClaimContact.Contact), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get ClaimContactRole () : entity.ClaimContactRole {
      return getIteratedValue(1) as entity.ClaimContactRole
    }
    
    
  }
  
  
}