package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewPersonOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimNewPersonOnlyPickerMenuItemSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ClaimNewPersonOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNewPersonOnlyPickerMenuItemSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem) at ClaimNewPersonOnlyPickerMenuItemSet.pcf: line 21, column 70
    function action_1 () : void {
      NewContactPopup.push(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem) at ClaimNewPersonOnlyPickerMenuItemSet.pcf: line 21, column 70
    function action_dest_2 () : pcf.api.Destination {
      return pcf.NewContactPopup.createDestination(typekey.Contact.TC_PERSON, parentContact, claim)
    }
    
    // 'visible' attribute on MenuItem (id=ClaimNewPersonOnlyPickerMenuItemSet_NewPersonMenuItem) at ClaimNewPersonOnlyPickerMenuItemSet.pcf: line 21, column 70
    function visible_0 () : java.lang.Boolean {
      return requiredContactType.isAssignableFrom(entity.Person)
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