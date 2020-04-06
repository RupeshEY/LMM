package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/shared/ClaimContactRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimContactRelatedContactsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/shared/ClaimContactRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactRelatedContactsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 51, column 47
    function sortValue_0 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(Contact).PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 51, column 47
    function sortValue_1 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(Contact).SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 51, column 47
    function sortValue_2 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(Contact).TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 51, column 47
    function sortValue_3 (contactContact :  entity.ContactContact) : java.lang.Object {
      return contactContact.getOtherContact(Contact).QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function sortValue_4 (contactContact :  entity.ContactContact) : java.lang.Object {
      return new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).BidiRel
    }
    
    // 'toAdd' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 36, column 43
    function toAdd_28 (contactContact :  entity.ContactContact) : void {
      Contact.addContactContact(contactContact)
    }
    
    // 'toRemove' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 36, column 43
    function toRemove_29 (contactContact :  entity.ContactContact) : void {
      Contact.removeContactContact(contactContact)
    }
    
    // 'value' attribute on RowIterator at ClaimContactRelatedContactsLV.pcf: line 36, column 43
    function value_30 () : entity.ContactContact[] {
      return Contact.AllContactContacts
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
    property get Contact() : Contact { return contactHandle.Contact; }
          
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/shared/ClaimContactRelatedContactsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimContactRelatedContactsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 14, column 225
    function action_10 () : void {
      AddressBookPickerPopup.push(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContactType)
    }
    
    // 'action' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 16, column 285
    function action_12 () : void {
      if (new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact != null) { ClaimContactDetailPopup.push(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function action_13 () : void {
      ClaimContactDetailPopup.push(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact, claim)
    }
    
    // 'action' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 14, column 225
    function action_dest_11 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContactType)
    }
    
    // 'action' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact, claim)
    }
    
    // 'def' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 12, column 229
    function def_onEnter_7 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContactType, Contact, claim)
    }
    
    // 'def' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 12, column 229
    function def_refreshVariables_8 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContactType, Contact, claim)
    }
    
    // 'value' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function defaultSetter_16 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'value' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).BidiRel = (__VALUE_TO_SET as typekey.ContactBidiRel)
    }
    
    // 'valueRange' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function valueRange_17 () : java.lang.Object {
      return claim.RelatedContacts
    }
    
    // 'valueRange' attribute on Reflect at ClaimContactRelatedContactsLV.pcf: line 63, column 71
    function valueRange_21 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return Contact.getPossibleBidiRelsToContact(VALUE)
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function valueRange_25 () : java.lang.Object {
      return Contact.getPossibleBidiRelsToContact(contactContact.getOtherContact(Contact))
    }
    
    // 'value' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function value_22 () : typekey.ContactBidiRel {
      return new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).BidiRel
    }
    
    // 'value' attribute on ClaimRelatedContactCell (id=Contact) at ClaimContactRelatedContactsLV.pcf: line 51, column 47
    function value_5 () : entity.Contact {
      return new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContact
    }
    
    // 'valueRange' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function verifyValueRangeIsAllowedType_18 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function verifyValueRangeIsAllowedType_18 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function verifyValueRangeIsAllowedType_18 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function verifyValueRangeIsAllowedType_26 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function verifyValueRangeIsAllowedType_26 ($$arg :  typekey.ContactBidiRel[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 10, column 83
    function verifyValueRange_19 () : void {
      var __valueRangeArg = claim.RelatedContacts
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_18(__valueRangeArg)
    }
    
    // 'valueRange' attribute on RangeCell (id=Rel) at ClaimContactRelatedContactsLV.pcf: line 60, column 46
    function verifyValueRange_27 () : void {
      var __valueRangeArg = Contact.getPossibleBidiRelsToContact(contactContact.getOtherContact(Contact))
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_26(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 12, column 229
    function visible_6 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimRelatedContactCell (id=Contact) at ClaimRelatedContactWidget.xml: line 14, column 225
    function visible_9 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(new util.lvwrapper.ClaimContactContactLVWrapper(contactContact, Contact, claim).OtherContactType)" != "" && true
    }
    
    property get contactContact () : entity.ContactContact {
      return getIteratedValue(1) as entity.ContactContact
    }
    
    
  }
  
  
}