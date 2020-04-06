package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ViewAddressBookToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ViewAddressBookToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ViewAddressBookToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewAddressBookToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ViewAddressBookToolbarButtons_ViewAddressBookButton) at ViewAddressBookToolbarButtonSet.pcf: line 31, column 132
    function action_1 () : void {
      ViewAddressBook.push(Contact, allowEditInAddressBook == false ? false : !CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on ToolbarButton (id=ViewAddressBookToolbarButtons_ViewAddressBookButton) at ViewAddressBookToolbarButtonSet.pcf: line 31, column 132
    function action_dest_2 () : pcf.api.Destination {
      return pcf.ViewAddressBook.createDestination(Contact, allowEditInAddressBook == false ? false : !CurrentLocation.InEditMode)
    }
    
    // 'visible' attribute on ToolbarButton (id=ViewAddressBookToolbarButtons_ViewAddressBookButton) at ViewAddressBookToolbarButtonSet.pcf: line 31, column 132
    function visible_0 () : java.lang.Boolean {
      return linkStatus.Known and linkStatus.Linked and !linkStatus.Broken and !Contact.New and perm.Contact.viewab( Contact )
    }
    
    property get allowEditInAddressBook () : boolean {
      return getRequireValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setRequireValue("allowEditInAddressBook", 0, $arg)
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