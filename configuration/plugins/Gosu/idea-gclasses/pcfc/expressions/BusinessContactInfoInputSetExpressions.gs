package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BusinessContactInfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/BusinessContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BusinessContactInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 16, column 225
    function action_13 () : void {
      AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 18, column 285
    function action_15 () : void {
      if (Contact.PrimaryContact != null) { ClaimContactDetailPopup.push(Contact.PrimaryContact, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function action_16 () : void {
      ClaimContactDetailPopup.push(Contact.PrimaryContact, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_14 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_17 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Contact.PrimaryContact, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_10 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(entity.Person.Type, Contact, claim)
    }
    
    // 'def' attribute on InputSetRef (id=Work) at BusinessContactInfoInputSet.pcf: line 50, column 18
    function def_onEnter_27 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at BusinessContactInfoInputSet.pcf: line 55, column 40
    function def_onEnter_30 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at BusinessContactInfoInputSet.pcf: line 60, column 40
    function def_onEnter_33 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(createCellPhoneDelegate(), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at BusinessContactInfoInputSet.pcf: line 64, column 17
    function def_onEnter_35 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_11 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(entity.Person.Type, Contact, claim)
    }
    
    // 'def' attribute on InputSetRef (id=Work) at BusinessContactInfoInputSet.pcf: line 50, column 18
    function def_refreshVariables_28 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at BusinessContactInfoInputSet.pcf: line 55, column 40
    function def_refreshVariables_31 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at BusinessContactInfoInputSet.pcf: line 60, column 40
    function def_refreshVariables_34 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(createCellPhoneDelegate(), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at BusinessContactInfoInputSet.pcf: line 64, column 17
    function def_refreshVariables_36 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.PrimaryContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at BusinessContactInfoInputSet.pcf: line 72, column 40
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      (Contact as Person).PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at BusinessContactInfoInputSet.pcf: line 35, column 46
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=Email1) at BusinessContactInfoInputSet.pcf: line 83, column 38
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Email2) at BusinessContactInfoInputSet.pcf: line 89, column 38
    function defaultSetter_57 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.EmailAddress2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'label' attribute on Label at BusinessContactInfoInputSet.pcf: line 27, column 27
    function label_0 () : java.lang.String {
      return topLabel()
    }
    
    // 'label' attribute on TextInput (id=Email1) at BusinessContactInfoInputSet.pcf: line 83, column 38
    function label_47 () : java.lang.Object {
      return mainEmailLabel()
    }
    
    // 'label' attribute on TextInput (id=Email2) at BusinessContactInfoInputSet.pcf: line 89, column 38
    function label_53 () : java.lang.Object {
      return alternateEmailLabel()
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function onPick_18 (PickedValue :  Contact) : void {
      var contactType = entity.Person.Type; var result = eval("Contact.PrimaryContact = claim.resolveContact(Contact.PrimaryContact) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on TypeKeyInput (id=PrimaryPhone) at BusinessContactInfoInputSet.pcf: line 72, column 40
    function validationExpression_37 () : java.lang.Object {
      return (Contact.PrimaryPhone == null or (Contact.PrimaryPhone == TC_WORK and Contact.WorkPhone != null) or  (Contact.PrimaryPhone == TC_HOME and Contact.HomePhone != null) or (Contact.PrimaryPhone == TC_MOBILE and (Contact as Person).CellPhone != null)) ? null : DisplayKey.get("Web.ContactDetail.Phone.PrimaryPhone.Error")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_22 () : java.lang.Object {
      return claim.RelatedContacts
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_21 () : java.lang.Object {
      return Contact
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at BusinessContactInfoInputSet.pcf: line 72, column 40
    function valueRoot_44 () : java.lang.Object {
      return (Contact as Person)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at BusinessContactInfoInputSet.pcf: line 35, column 46
    function valueRoot_6 () : java.lang.Object {
      return claimContact
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at BusinessContactInfoInputSet.pcf: line 35, column 46
    function value_2 () : java.lang.Boolean {
      return claimContact.ContactProhibited
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at BusinessContactInfoInputSet.pcf: line 72, column 40
    function value_39 () : typekey.PrimaryPhoneType {
      return (Contact as Person).PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=Email1) at BusinessContactInfoInputSet.pcf: line 83, column 38
    function value_48 () : java.lang.String {
      return Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Email2) at BusinessContactInfoInputSet.pcf: line 89, column 38
    function value_54 () : java.lang.String {
      return Contact.EmailAddress2
    }
    
    // 'value' attribute on ClaimContactInput (id=PrimaryContact) at BusinessContactInfoInputSet.pcf: line 46, column 43
    function value_8 () : entity.Contact {
      return Contact.PrimaryContact
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_23 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_24 () : void {
      var __valueRangeArg = claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_23(__valueRangeArg)
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ContactProhibited) at BusinessContactInfoInputSet.pcf: line 35, column 46
    function visible_1 () : java.lang.Boolean {
      return claimContact.isClaimant()
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 16, column 225
    function visible_12 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on InputSetRef (id=Home) at BusinessContactInfoInputSet.pcf: line 55, column 40
    function visible_29 () : java.lang.Boolean {
      return Contact typeis Person
    }
    
    // 'visible' attribute on InputSet at BusinessContactInfoInputSet.pcf: line 29, column 38
    function visible_7 () : java.lang.Boolean {
      return claimContact != null
    }
    
    // 'visible' attribute on ClaimContactInput (id=PrimaryContact) at ClaimContactWidget.xml: line 14, column 229
    function visible_9 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getRequireValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setRequireValue("claimContact", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    property get Contact() : Contact { return contactHandle.Contact; }
    
    function createCellPhoneDelegate() : gw.api.phone.ContactPhoneDelegate {
      if (Contact typeis Person) {
        return new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#CellPhone)
      } else {
        return null
      }
    }
    
    function topLabel() : String {
      if (Contact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Phone")
      } else {
        return DisplayKey.get("Web.ContactDetail.ContactInfo")
      }
    }
    
    function mainEmailLabel() : String {
      if (Contact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Email.Primary")
      } else {
        return DisplayKey.get("Web.ContactDetail.PrimaryContact.Email1")
      }
    }
    
    function alternateEmailLabel() : String {
      if (Contact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Email.Secondary")
      } else {
        return DisplayKey.get("Web.ContactDetail.PrimaryContact.Email2")
      }
    }
    
    
  }
  
  
}