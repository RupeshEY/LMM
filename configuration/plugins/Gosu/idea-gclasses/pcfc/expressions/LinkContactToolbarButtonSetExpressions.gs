package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LinkContactToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/LinkContactToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkContactToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=LinkContactToolbarButtons_LinkButton) at LinkContactToolbarButtonSet.pcf: line 29, column 156
    function action_1 () : void {
      gw.api.contact.ContactUtil.linkCMContact(CurrentLocation, Contact)
    }
    
    // 'action' attribute on ToolbarButton (id=LinkContactToolbarButtons_UnlinkButton) at LinkContactToolbarButtonSet.pcf: line 36, column 131
    function action_4 () : void {
      gw.api.contact.ContactUtil.unlinkCMContact(CurrentLocation, Contact)
    }
    
    // 'action' attribute on ToolbarButton (id=LinkContactToolbarButtons_SyncFromAddressBookButton) at LinkContactToolbarButtonSet.pcf: line 44, column 230
    function action_7 () : void {
      gw.api.contact.ContactSystemUtil.INSTANCE.syncContactToContactSystem(CurrentLocation, contactHandle)
    }
    
    // 'label' attribute on ToolbarButton (id=LinkContactToolbarButtons_LinkButton) at LinkContactToolbarButtonSet.pcf: line 29, column 156
    function label_2 () : java.lang.Object {
      return linkStatus.Broken ? DisplayKey.get("Button.RelinkToAddressBook") : DisplayKey.get("Button.LinkToAddressBook")
    }
    
    // 'label' attribute on ToolbarButton (id=LinkContactToolbarButtons_UnlinkButton) at LinkContactToolbarButtonSet.pcf: line 36, column 131
    function label_5 () : java.lang.Object {
      return linkStatus.Broken ? DisplayKey.get("Button.DiscardBrokenLink") : DisplayKey.get("Button.UnlinkFromAddressBook")
    }
    
    // 'visible' attribute on ToolbarButton (id=LinkContactToolbarButtons_LinkButton) at LinkContactToolbarButtonSet.pcf: line 29, column 156
    function visible_0 () : java.lang.Boolean {
      return ( linkStatus.Known and (!linkStatus.Linked or linkStatus.Broken) ) and perm.Contact.editlocal(Contact) and not Contact.PendingLinkMessage
    }
    
    // 'visible' attribute on ToolbarButton (id=LinkContactToolbarButtons_UnlinkButton) at LinkContactToolbarButtonSet.pcf: line 36, column 131
    function visible_3 () : java.lang.Boolean {
      return ( linkStatus.Known and linkStatus.Linked) and perm.Contact.editlocal(Contact) and not Contact.PendingLinkMessage
    }
    
    // 'visible' attribute on ToolbarButton (id=LinkContactToolbarButtons_SyncFromAddressBookButton) at LinkContactToolbarButtonSet.pcf: line 44, column 230
    function visible_6 () : java.lang.Boolean {
      return ( linkStatus.Known and linkStatus.Linked and !linkStatus.Broken and (!linkStatus.Synced or linkStatus.DifferentRelationshipsMessage != null)) and perm.Contact.editlocal(Contact) and !linkStatus.isPendingCreate()
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