package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchContactDetailToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchContactDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=UpdateAndLink) at AddressBookSearchContactDetailToolbarButtonSet.pcf: line 34, column 160
    function action_2 () : void {
      gw.api.contact.ContactUtil.CMSearchCustomUpdate(CurrentLocation, Contact)
    }
    
    // 'pickValue' attribute on EditButtons at AddressBookSearchContactDetailToolbarButtonSet.pcf: line 29, column 29
    function pickValue_0 () : Contact {
      return Contact
    }
    
    // 'visible' attribute on ToolbarButton (id=UpdateAndLink) at AddressBookSearchContactDetailToolbarButtonSet.pcf: line 34, column 160
    function visible_1 () : java.lang.Boolean {
      return ( ! linkStatus.Synced ) and perm.Contact.editlocal(Contact) and gw.api.contact.CCContactMinimalTagsImpl.checkCreatePermission(typeof Contact)
    }
    
    property get canAccessLinkButtons () : boolean {
      return getRequireValue("canAccessLinkButtons", 0) as java.lang.Boolean
    }
    
    property set canAccessLinkButtons ($arg :  boolean) {
      setRequireValue("canAccessLinkButtons", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    
          property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}