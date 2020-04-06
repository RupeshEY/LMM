package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AttorneyAdditionalInfoInputSet.Attorney.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttorneyAdditionalInfoInputSet_AttorneyExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AttorneyAdditionalInfoInputSet.Attorney.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttorneyAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AttorneyAdditionalInfoInputSet.Attorney.pcf: line 24, column 41
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attorney.AttorneyLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AttorneyAdditionalInfoInputSet.Attorney.pcf: line 30, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attorney.AttorneySpecialty = (__VALUE_TO_SET as typekey.LegalSpecialty)
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AttorneyAdditionalInfoInputSet.Attorney.pcf: line 24, column 41
    function valueRoot_3 () : java.lang.Object {
      return Attorney
    }
    
    // 'value' attribute on TextInput (id=AttorneyLicense) at AttorneyAdditionalInfoInputSet.Attorney.pcf: line 24, column 41
    function value_0 () : java.lang.String {
      return Attorney.AttorneyLicense
    }
    
    // 'value' attribute on TypeKeyInput (id=AttorneySpecialty) at AttorneyAdditionalInfoInputSet.Attorney.pcf: line 30, column 43
    function value_4 () : typekey.LegalSpecialty {
      return Attorney.AttorneySpecialty
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
          property get Attorney() : Attorney { return contactHandle.Contact as Attorney; }
        
    
    
  }
  
  
}