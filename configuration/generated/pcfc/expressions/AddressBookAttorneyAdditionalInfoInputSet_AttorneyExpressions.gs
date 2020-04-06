package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAttorneyAdditionalInfoInputSet_AttorneyExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAttorneyAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf: line 15, column 59
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      (personVendor as Attorney).AttorneyLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf: line 21, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      (personVendor as Attorney).AttorneySpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf: line 15, column 59
    function valueRoot_3 () : java.lang.Object {
      return (personVendor as Attorney)
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf: line 15, column 59
    function value_0 () : java.lang.String {
      return (personVendor as Attorney).AttorneyLicense
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AddressBookAttorneyAdditionalInfoInputSet.Attorney.pcf: line 21, column 43
    function value_4 () : typekey.LegalSpecialty {
      return (personVendor as Attorney).AttorneySpecialty
    }
    
    property get personVendor () : PersonVendor {
      return getRequireValue("personVendor", 0) as PersonVendor
    }
    
    property set personVendor ($arg :  PersonVendor) {
      setRequireValue("personVendor", 0, $arg)
    }
    
    
  }
  
  
}