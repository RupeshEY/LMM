package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/DoctorAdditionalInfoInputSet.Doctor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DoctorAdditionalInfoInputSet_DoctorExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/DoctorAdditionalInfoInputSet.Doctor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DoctorAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at DoctorAdditionalInfoInputSet.Doctor.pcf: line 24, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Doctor.MedicalLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at DoctorAdditionalInfoInputSet.Doctor.pcf: line 30, column 42
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Doctor.DoctorSpecialty = (__VALUE_TO_SET as typekey.SpecialtyType)
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at DoctorAdditionalInfoInputSet.Doctor.pcf: line 24, column 38
    function valueRoot_3 () : java.lang.Object {
      return Doctor
    }
    
    // 'value' attribute on TextInput (id=MedicalLicense) at DoctorAdditionalInfoInputSet.Doctor.pcf: line 24, column 38
    function value_0 () : java.lang.String {
      return Doctor.MedicalLicense
    }
    
    // 'value' attribute on TypeKeyInput (id=DoctorSpecialty) at DoctorAdditionalInfoInputSet.Doctor.pcf: line 30, column 42
    function value_4 () : typekey.SpecialtyType {
      return Doctor.DoctorSpecialty
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Doctor() : Doctor { return contactHandle.Contact as Doctor; }
        
    
    
  }
  
  
}