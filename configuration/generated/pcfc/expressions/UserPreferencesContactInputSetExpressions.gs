package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserPreferencesContactInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserPreferencesContactInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_onEnter_10 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_onEnter_12 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=UserHomePhone) at UserPreferencesContactInputSet.pcf: line 41, column 27
    function def_onEnter_19 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact,Contact#HomePhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_HOME))
    }
    
    // 'def' attribute on InputSetRef (id=UserFaxPhone) at UserPreferencesContactInputSet.pcf: line 44, column 26
    function def_onEnter_21 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Contact#FaxPhone), false))
    }
    
    // 'def' attribute on InputSetRef (id=UserCellPhone) at UserPreferencesContactInputSet.pcf: line 47, column 27
    function def_onEnter_23 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Person#CellPhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_MOBILE))
    }
    
    // 'def' attribute on InputSetRef (id=UserWorkPhone) at UserPreferencesContactInputSet.pcf: line 50, column 27
    function def_onEnter_25 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Contact#WorkPhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_WORK))
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_onEnter_8 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_refreshVariables_11 (def :  pcf.GlobalAddressInputSet_PostCodeBeforeCity) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_refreshVariables_13 (def :  pcf.GlobalAddressInputSet_default) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on InputSetRef (id=UserHomePhone) at UserPreferencesContactInputSet.pcf: line 41, column 27
    function def_refreshVariables_20 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact,Contact#HomePhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_HOME))
    }
    
    // 'def' attribute on InputSetRef (id=UserFaxPhone) at UserPreferencesContactInputSet.pcf: line 44, column 26
    function def_refreshVariables_22 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Contact#FaxPhone), false))
    }
    
    // 'def' attribute on InputSetRef (id=UserCellPhone) at UserPreferencesContactInputSet.pcf: line 47, column 27
    function def_refreshVariables_24 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Person#CellPhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_MOBILE))
    }
    
    // 'def' attribute on InputSetRef (id=UserWorkPhone) at UserPreferencesContactInputSet.pcf: line 50, column 27
    function def_refreshVariables_26 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(user.Contact, Contact#WorkPhone), user.Contact.PrimaryPhone == typekey.PrimaryPhoneType.TC_WORK))
    }
    
    // 'def' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function def_refreshVariables_9 (def :  pcf.GlobalAddressInputSet_BigToSmall) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at UserPreferencesContactInputSet.pcf: line 35, column 44
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.Contact.PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=JobTitle) at UserPreferencesContactInputSet.pcf: line 17, column 30
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.JobTitle = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Email) at UserPreferencesContactInputSet.pcf: line 56, column 43
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.Contact.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Department) at UserPreferencesContactInputSet.pcf: line 22, column 32
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      user.Department = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef (id=UserAddress) at UserPreferencesContactInputSet.pcf: line 28, column 30
    function mode_14 () : java.lang.Object {
      return addressOwner.SelectedMode
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at UserPreferencesContactInputSet.pcf: line 35, column 44
    function valueRoot_18 () : java.lang.Object {
      return user.Contact
    }
    
    // 'value' attribute on TextInput (id=JobTitle) at UserPreferencesContactInputSet.pcf: line 17, column 30
    function valueRoot_3 () : java.lang.Object {
      return user
    }
    
    // 'value' attribute on TextInput (id=JobTitle) at UserPreferencesContactInputSet.pcf: line 17, column 30
    function value_0 () : java.lang.String {
      return user.JobTitle
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone) at UserPreferencesContactInputSet.pcf: line 35, column 44
    function value_15 () : typekey.PrimaryPhoneType {
      return user.Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=Email) at UserPreferencesContactInputSet.pcf: line 56, column 43
    function value_27 () : java.lang.String {
      return user.Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Department) at UserPreferencesContactInputSet.pcf: line 22, column 32
    function value_4 () : java.lang.String {
      return user.Department
    }
    
    property get addressOwner () : gw.api.address.AddressOwner {
      return getRequireValue("addressOwner", 0) as gw.api.address.AddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.AddressOwner) {
      setRequireValue("addressOwner", 0, $arg)
    }
    
    property get user () : User {
      return getRequireValue("user", 0) as User
    }
    
    property set user ($arg :  User) {
      setRequireValue("user", 0, $arg)
    }
    
    
  }
  
  
}