package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/DriversLicenseInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class DriversLicenseInfoInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/DriversLicenseInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriversLicenseInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber) at DriversLicenseInfoInputSet.pcf: line 26, column 37
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.LicenseNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=LicenseState) at DriversLicenseInfoInputSet.pcf: line 33, column 41
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.LicenseState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=LicenseState) at DriversLicenseInfoInputSet.pcf: line 33, column 41
    function filter_8 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_DRIVING_LIC)
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber) at DriversLicenseInfoInputSet.pcf: line 26, column 37
    function valueRoot_3 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber) at DriversLicenseInfoInputSet.pcf: line 26, column 37
    function value_0 () : java.lang.String {
      return Person.LicenseNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=LicenseState) at DriversLicenseInfoInputSet.pcf: line 33, column 41
    function value_4 () : typekey.Jurisdiction {
      return Person.LicenseState
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Person() : Person { return contactHandle.Contact as Person; }
        
    
    
  }
  
  
}