package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookPersonContactInfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookPersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookPersonContactInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at AddressBookPersonContactInfoInputSet.pcf: line 36, column 18
    function def_onEnter_11 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, person#CellPhone), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at AddressBookPersonContactInfoInputSet.pcf: line 40, column 17
    function def_onEnter_13 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at AddressBookPersonContactInfoInputSet.pcf: line 28, column 18
    function def_onEnter_7 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at AddressBookPersonContactInfoInputSet.pcf: line 32, column 18
    function def_onEnter_9 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at AddressBookPersonContactInfoInputSet.pcf: line 32, column 18
    function def_refreshVariables_10 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at AddressBookPersonContactInfoInputSet.pcf: line 36, column 18
    function def_refreshVariables_12 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, person#CellPhone), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at AddressBookPersonContactInfoInputSet.pcf: line 40, column 17
    function def_refreshVariables_14 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at AddressBookPersonContactInfoInputSet.pcf: line 28, column 18
    function def_refreshVariables_8 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(person, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at AddressBookPersonContactInfoInputSet.pcf: line 47, column 45
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=Primary) at AddressBookPersonContactInfoInputSet.pcf: line 56, column 37
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Secondary) at AddressBookPersonContactInfoInputSet.pcf: line 62, column 37
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.EmailAddress2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at AddressBookPersonContactInfoInputSet.pcf: line 23, column 46
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'validationExpression' attribute on TypeKeyInput (id=PrimaryPhone) at AddressBookPersonContactInfoInputSet.pcf: line 47, column 45
    function validationExpression_15 () : java.lang.Object {
      return (person.PrimaryPhone == null or (person.PrimaryPhone == TC_WORK and person.WorkPhone != null) or (person.PrimaryPhone == TC_HOME and person.HomePhone != null) or (person.PrimaryPhone == TC_MOBILE and person.CellPhone != null)) ? null : DisplayKey.get("Web.ContactDetail.Phone.PrimaryPhone.Error")
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at AddressBookPersonContactInfoInputSet.pcf: line 47, column 45
    function valueRoot_20 () : java.lang.Object {
      return person
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at AddressBookPersonContactInfoInputSet.pcf: line 23, column 46
    function valueRoot_5 () : java.lang.Object {
      return claimContact
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at AddressBookPersonContactInfoInputSet.pcf: line 23, column 46
    function value_1 () : java.lang.Boolean {
      return claimContact.ContactProhibited
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at AddressBookPersonContactInfoInputSet.pcf: line 47, column 45
    function value_16 () : typekey.PrimaryPhoneType {
      return person.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=Primary) at AddressBookPersonContactInfoInputSet.pcf: line 56, column 37
    function value_21 () : java.lang.String {
      return person.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Secondary) at AddressBookPersonContactInfoInputSet.pcf: line 62, column 37
    function value_25 () : java.lang.String {
      return person.EmailAddress2
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ContactProhibited) at AddressBookPersonContactInfoInputSet.pcf: line 23, column 46
    function visible_0 () : java.lang.Boolean {
      return claimContact.isClaimant()
    }
    
    // 'visible' attribute on InputSet at AddressBookPersonContactInfoInputSet.pcf: line 17, column 38
    function visible_6 () : java.lang.Boolean {
      return claimContact != null
    }
    
    property get claimContact () : ClaimContact {
      return getRequireValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setRequireValue("claimContact", 0, $arg)
    }
    
    property get person () : Person {
      return getRequireValue("person", 0) as Person
    }
    
    property set person ($arg :  Person) {
      setRequireValue("person", 0, $arg)
    }
    
    /**
     * Sets the new primary phone value, based on the phone number inputs. If the current
     * primary phone value is blank, and there is exactly one non-blank phone number input,
     * then the primary phone value corresponding to that non-blank input is returned.
     */
    function setPrimaryPhoneType(phoneNum : String, numType : PrimaryPhoneType) {
      
      var phoneNums = {person.WorkPhone, person.HomePhone, person.CellPhone}
      phoneNums.removeWhere(\ s -> s == null)
      
      if (phoneNums.Count == 1 and phoneNums.single() == phoneNum) {
        person.PrimaryPhone = numType
      }
    }
    
    
  }
  
  
}