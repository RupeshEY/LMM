package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.NullContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactPhoneDisplayCell_NullContactExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/lossdetails/ContactPhoneDisplayCell.NullContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactPhoneDisplayCellExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Contact_PrimaryAddress) at ContactPhoneDisplayCell.NullContact.pcf: line 19, column 37
    function valueRoot_2 () : java.lang.Object {
      return aLodgingProvider.Contact
    }
    
    // 'value' attribute on TextInput (id=Contact_PrimaryAddress) at ContactPhoneDisplayCell.NullContact.pcf: line 19, column 37
    function value_0 () : entity.Address {
      return aLodgingProvider.Contact.PrimaryAddress
    }
    
    property get aLodgingProvider () : entity.LodgingProvider {
      return getRequireValue("aLodgingProvider", 0) as entity.LodgingProvider
    }
    
    property set aLodgingProvider ($arg :  entity.LodgingProvider) {
      setRequireValue("aLodgingProvider", 0, $arg)
    }
    
    property get phoneOwner () : gw.api.phone.PhoneOwner {
      return getRequireValue("phoneOwner", 0) as gw.api.phone.PhoneOwner
    }
    
    property set phoneOwner ($arg :  gw.api.phone.PhoneOwner) {
      setRequireValue("phoneOwner", 0, $arg)
    }
    
    
  }
  
  
}