package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.UserContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalInfoInputSet_UserContactExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.UserContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber) at AdditionalInfoInputSet.UserContact.pcf: line 31, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserContact.EmployeeNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.UserContact.pcf: line 38, column 65
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      UserContact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber) at AdditionalInfoInputSet.UserContact.pcf: line 31, column 43
    function valueRoot_3 () : java.lang.Object {
      return UserContact
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber) at AdditionalInfoInputSet.UserContact.pcf: line 31, column 43
    function value_0 () : java.lang.String {
      return UserContact.EmployeeNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.UserContact.pcf: line 38, column 65
    function value_5 () : typekey.Currency {
      return UserContact.PreferredCurrency
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency) at AdditionalInfoInputSet.UserContact.pcf: line 38, column 65
    function visible_4 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
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
    
    
    property get UserContact() : UserContact { return contactHandle.Contact as UserContact; }
        
    
    
  }
  
  
}