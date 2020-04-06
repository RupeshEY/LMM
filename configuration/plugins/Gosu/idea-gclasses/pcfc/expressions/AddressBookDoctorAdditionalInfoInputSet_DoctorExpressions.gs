package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookDoctorAdditionalInfoInputSet_DoctorExpressions {
  @javax.annotation.Generated("config/web/pcf/addressbook/AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDoctorAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf: line 15, column 56
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      (personVendor as Doctor).MedicalLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf: line 21, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      (personVendor as Doctor).DoctorSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf: line 15, column 56
    function valueRoot_3 () : java.lang.Object {
      return (personVendor as Doctor)
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf: line 15, column 56
    function value_0 () : java.lang.String {
      return (personVendor as Doctor).MedicalLicense
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf: line 21, column 42
    function value_4 () : typekey.SpecialtyType {
      return (personVendor as Doctor).DoctorSpecialty
    }
    
    property get personVendor () : PersonVendor {
      return getRequireValue("personVendor", 0) as PersonVendor
    }
    
    property set personVendor ($arg :  PersonVendor) {
      setRequireValue("personVendor", 0, $arg)
    }
    
    
  }
  
  
}