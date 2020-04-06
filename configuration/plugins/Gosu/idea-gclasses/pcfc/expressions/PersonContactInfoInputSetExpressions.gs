package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/PersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PersonContactInfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/PersonContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PersonContactInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at PersonContactInfoInputSet.pcf: line 45, column 18
    function def_onEnter_11 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Person#CellPhone), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at PersonContactInfoInputSet.pcf: line 49, column 17
    function def_onEnter_13 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at PersonContactInfoInputSet.pcf: line 37, column 18
    function def_onEnter_7 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Person#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at PersonContactInfoInputSet.pcf: line 41, column 18
    function def_onEnter_9 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at PersonContactInfoInputSet.pcf: line 41, column 18
    function def_refreshVariables_10 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at PersonContactInfoInputSet.pcf: line 45, column 18
    function def_refreshVariables_12 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Person#CellPhone), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at PersonContactInfoInputSet.pcf: line 49, column 17
    function def_refreshVariables_14 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at PersonContactInfoInputSet.pcf: line 37, column 18
    function def_refreshVariables_8 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(contactHandle, Person#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at PersonContactInfoInputSet.pcf: line 56, column 45
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=Primary) at PersonContactInfoInputSet.pcf: line 65, column 37
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Secondary) at PersonContactInfoInputSet.pcf: line 71, column 37
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.EmailAddress2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at PersonContactInfoInputSet.pcf: line 32, column 46
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactProhibited = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'validationExpression' attribute on TypeKeyInput (id=PrimaryPhone) at PersonContactInfoInputSet.pcf: line 56, column 45
    function validationExpression_15 () : java.lang.Object {
      return (Person.PrimaryPhone == null or (Person.PrimaryPhone == TC_WORK and Person.WorkPhone != null) or  (Person.PrimaryPhone == TC_HOME and Person.HomePhone != null) or (Person.PrimaryPhone == TC_MOBILE and Person.CellPhone != null)) ? null : DisplayKey.get("Web.ContactDetail.Phone.PrimaryPhone.Error")
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at PersonContactInfoInputSet.pcf: line 56, column 45
    function valueRoot_20 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at PersonContactInfoInputSet.pcf: line 32, column 46
    function valueRoot_5 () : java.lang.Object {
      return claimContact
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited) at PersonContactInfoInputSet.pcf: line 32, column 46
    function value_1 () : java.lang.Boolean {
      return claimContact.ContactProhibited
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at PersonContactInfoInputSet.pcf: line 56, column 45
    function value_16 () : typekey.PrimaryPhoneType {
      return Person.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=Primary) at PersonContactInfoInputSet.pcf: line 65, column 37
    function value_21 () : java.lang.String {
      return Person.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Secondary) at PersonContactInfoInputSet.pcf: line 71, column 37
    function value_25 () : java.lang.String {
      return Person.EmailAddress2
    }
    
    // 'visible' attribute on BooleanRadioInput (id=ContactProhibited) at PersonContactInfoInputSet.pcf: line 32, column 46
    function visible_0 () : java.lang.Boolean {
      return claimContact.isClaimant()
    }
    
    // 'visible' attribute on InputSet at PersonContactInfoInputSet.pcf: line 26, column 38
    function visible_6 () : java.lang.Boolean {
      return claimContact != null
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
    
    property get Person() : Person { return contactHandle.Contact as Person; }
    
    /**
     * Sets the new primary phone value, based on the phone number inputs. If the current
     * primary phone value is blank, and there is exactly one non-blank phone number input,
     * then the primary phone value corresponding to that non-blank input is returned.
     */
    function setPrimaryPhoneType(phoneNum : String, numType : PrimaryPhoneType) {
      
      var phoneNums = {Person.WorkPhone, Person.HomePhone, Person.CellPhone}
      phoneNums.removeWhere(\ s -> s == null)
      
      if (phoneNums.Count == 1 and phoneNums.single() == phoneNum) {
        Person.PrimaryPhone = numType
      }
    }
    
    
  }
  
  
}