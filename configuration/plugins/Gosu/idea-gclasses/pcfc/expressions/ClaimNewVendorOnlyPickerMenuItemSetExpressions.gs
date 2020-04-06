package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewVendorOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewVendorOnlyPickerMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewVendorOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewVendorOnlyPickerMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ClaimNewVendorOnlyPickerMenuItemSet.pcf: line 20, column 80
    function action_0 () : void {
      NewContactPopup.push(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_PersonVendor) at ClaimNewVendorOnlyPickerMenuItemSet.pcf: line 24, column 79
    function action_2 () : void {
      NewContactPopup.push(typekey.Contact.TC_PERSONVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_CompanyVendor) at ClaimNewVendorOnlyPickerMenuItemSet.pcf: line 20, column 80
    function action_dest_1 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_COMPANYVENDOR, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=NewContactPickerMenuItemSet_PersonVendor) at ClaimNewVendorOnlyPickerMenuItemSet.pcf: line 24, column 79
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_PERSONVENDOR, parentContact, claim)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get parentContact () : Contact {
      return getRequireValue("parentContact", 0) as Contact
    }
    
    property set parentContact ($arg :  Contact) {
      setRequireValue("parentContact", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getRequireValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setRequireValue("requiredContactType", 0, $arg)
    }
    
    
  }
  
  
}