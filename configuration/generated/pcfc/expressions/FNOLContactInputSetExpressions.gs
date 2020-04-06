package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLContactInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLContactInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 27, column 60
    function def_onEnter_11 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(contactPerson.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=reporter_businessphone) at FNOLContactInputSet.pcf: line 31, column 36
    function def_onEnter_13 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Contact#WorkPhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.BusinessPhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_homephone) at FNOLContactInputSet.pcf: line 35, column 32
    function def_onEnter_15 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Contact#HomePhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.HomePhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_mobile) at FNOLContactInputSet.pcf: line 39, column 29
    function def_onEnter_17 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Person#CellPhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.Mobile.Label"), false))
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 25, column 54
    function def_onEnter_6 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(contactPerson as Person)))
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 25, column 54
    function def_onEnter_8 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(contactPerson as Person)))
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 27, column 60
    function def_refreshVariables_12 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(contactPerson.AddressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=reporter_businessphone) at FNOLContactInputSet.pcf: line 31, column 36
    function def_refreshVariables_14 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Contact#WorkPhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.BusinessPhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_homephone) at FNOLContactInputSet.pcf: line 35, column 32
    function def_refreshVariables_16 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Contact#HomePhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.HomePhone.Label"), false))
    }
    
    // 'def' attribute on InputSetRef (id=reporter_mobile) at FNOLContactInputSet.pcf: line 39, column 29
    function def_refreshVariables_18 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactPerson, Person#CellPhone), DisplayKey.get("Web.FNOLContactPopup.ContactDV.Mobile.Label"), false))
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 25, column 54
    function def_refreshVariables_7 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(contactPerson as Person)))
    }
    
    // 'def' attribute on InputSetRef at FNOLContactInputSet.pcf: line 25, column 54
    function def_refreshVariables_9 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.ContactNameOwner(new gw.api.name.PersonNameDelegate(contactPerson as Person)))
    }
    
    // 'value' attribute on TypeKeyInput (id=reporter_primarytype) at FNOLContactInputSet.pcf: line 45, column 45
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at FNOLContactInputSet.pcf: line 50, column 56
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Email2) at FNOLContactInputSet.pcf: line 56, column 56
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).EmailAddress2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=DriverLicense) at FNOLContactInputSet.pcf: line 64, column 48
    function defaultSetter_36 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).LicenseNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=DriverRelationToOwner) at FNOLContactInputSet.pcf: line 22, column 48
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      (incident as VehicleIncident).DriverRelation = (__VALUE_TO_SET as typekey.PersonRelationType)
    }
    
    // 'value' attribute on TypeKeyInput (id=DriverLicenseState) at FNOLContactInputSet.pcf: line 72, column 48
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).LicenseState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'value' attribute on TypeKeyInput (id=reason) at FNOLContactInputSet.pcf: line 79, column 48
    function defaultSetter_49 (__VALUE_TO_SET :  java.lang.Object) : void {
      (incident as VehicleIncident).VehicleUseReason = (__VALUE_TO_SET as typekey.ReasonForUse)
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at FNOLContactInputSet.pcf: line 85, column 48
    function defaultSetter_53 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contactPerson as Person).Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'filter' attribute on TypeKeyInput (id=DriverLicenseState) at FNOLContactInputSet.pcf: line 72, column 48
    function filter_44 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_DRIVING_LIC)
    }
    
    // 'mode' attribute on InputSetRef at FNOLContactInputSet.pcf: line 25, column 54
    function mode_10 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TypeKeyInput (id=reporter_primarytype) at FNOLContactInputSet.pcf: line 45, column 45
    function valueRoot_22 () : java.lang.Object {
      return (contactPerson as Person)
    }
    
    // 'value' attribute on TypeKeyInput (id=DriverRelationToOwner) at FNOLContactInputSet.pcf: line 22, column 48
    function valueRoot_5 () : java.lang.Object {
      return (incident as VehicleIncident)
    }
    
    // 'value' attribute on TypeKeyInput (id=DriverRelationToOwner) at FNOLContactInputSet.pcf: line 22, column 48
    function value_1 () : typekey.PersonRelationType {
      return (incident as VehicleIncident).DriverRelation
    }
    
    // 'value' attribute on TypeKeyInput (id=reporter_primarytype) at FNOLContactInputSet.pcf: line 45, column 45
    function value_19 () : typekey.PrimaryPhoneType {
      return (contactPerson as Person).PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=reporter_email) at FNOLContactInputSet.pcf: line 50, column 56
    function value_23 () : java.lang.String {
      return (contactPerson as Person).EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Email2) at FNOLContactInputSet.pcf: line 56, column 56
    function value_27 () : java.lang.String {
      return (contactPerson as Person).EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=DriverLicense) at FNOLContactInputSet.pcf: line 64, column 48
    function value_33 () : java.lang.String {
      return (contactPerson as Person).LicenseNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=DriverLicenseState) at FNOLContactInputSet.pcf: line 72, column 48
    function value_39 () : typekey.Jurisdiction {
      return (contactPerson as Person).LicenseState
    }
    
    // 'value' attribute on TypeKeyInput (id=reason) at FNOLContactInputSet.pcf: line 79, column 48
    function value_46 () : typekey.ReasonForUse {
      return (incident as VehicleIncident).VehicleUseReason
    }
    
    // 'value' attribute on TextAreaInput (id=Notes) at FNOLContactInputSet.pcf: line 85, column 48
    function value_51 () : java.lang.String {
      return (contactPerson as Person).Notes
    }
    
    // 'visible' attribute on TypeKeyInput (id=DriverRelationToOwner) at FNOLContactInputSet.pcf: line 22, column 48
    function visible_0 () : java.lang.Boolean {
      return role == ContactRole.TC_DRIVER
    }
    
    property get contactPerson () : Contact {
      return getRequireValue("contactPerson", 0) as Contact
    }
    
    property set contactPerson ($arg :  Contact) {
      setRequireValue("contactPerson", 0, $arg)
    }
    
    property get incident () : Incident {
      return getRequireValue("incident", 0) as Incident
    }
    
    property set incident ($arg :  Incident) {
      setRequireValue("incident", 0, $arg)
    }
    
    property get role () : ContactRole {
      return getRequireValue("role", 0) as ContactRole
    }
    
    property set role ($arg :  ContactRole) {
      setRequireValue("role", 0, $arg)
    }
    
    
  }
  
  
}