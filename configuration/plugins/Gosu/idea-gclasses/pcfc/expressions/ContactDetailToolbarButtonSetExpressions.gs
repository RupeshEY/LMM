package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses java.lang.Exception
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactDetailToolbarButtonSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactDetailToolbarButtonSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactDetailToolbarButtonSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=CustomUpdateButton) at ContactDetailToolbarButtonSet.pcf: line 40, column 109
    function action_1 () : void {
      customUpdate()
    }
    
    // 'action' attribute on ToolbarButton (id=CheckDuplicatesButton) at ContactDetailToolbarButtonSet.pcf: line 55, column 109
    function action_11 () : void {
      checkForDuplicates(true)
    }
    
    // EditButtons at ContactDetailToolbarButtonSet.pcf: line 43, column 87
    function label_4 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'pickValue' attribute on EditButtons at ContactDetailToolbarButtonSet.pcf: line 43, column 87
    function pickValue_2 () : Contact {
      return canPick ? Contact : null
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailToolbarButtonSet.pcf: line 47, column 39
    function toolbarButtonSet_onEnter_6 (def :  pcf.LinkContactToolbarButtonSet) : void {
      def.onEnter(contactHandle, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailToolbarButtonSet.pcf: line 50, column 110
    function toolbarButtonSet_onEnter_8 (def :  pcf.ViewAddressBookToolbarButtonSet) : void {
      def.onEnter(contactHandle, linkStatus, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailToolbarButtonSet.pcf: line 47, column 39
    function toolbarButtonSet_refreshVariables_7 (def :  pcf.LinkContactToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailToolbarButtonSet.pcf: line 50, column 110
    function toolbarButtonSet_refreshVariables_9 (def :  pcf.ViewAddressBookToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, linkStatus, allowEditInAddressBook)
    }
    
    // 'visible' attribute on ToolbarButton (id=CustomUpdateButton) at ContactDetailToolbarButtonSet.pcf: line 40, column 109
    function visible_0 () : java.lang.Boolean {
      return CurrentLocation.InEditMode and Contact.PublicID == null and Contact.AddressBookUID == null
    }
    
    // 'visible' attribute on ToolbarButton (id=CheckDuplicatesButton) at ContactDetailToolbarButtonSet.pcf: line 55, column 109
    function visible_10 () : java.lang.Boolean {
      return Contact.PublicID == null and Contact.AddressBookUID == null and CurrentLocation.InEditMode
    }
    
    // 'updateVisible' attribute on EditButtons at ContactDetailToolbarButtonSet.pcf: line 43, column 87
    function visible_3 () : java.lang.Boolean {
      return !(Contact.PublicID == null and Contact.AddressBookUID == null)
    }
    
    // 'visible' attribute on ToolbarButtonSetRef at ContactDetailToolbarButtonSet.pcf: line 47, column 39
    function visible_5 () : java.lang.Boolean {
      return canAccessLinkButtons
    }
    
    property get allowEditInAddressBook () : boolean {
      return getRequireValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setRequireValue("allowEditInAddressBook", 0, $arg)
    }
    
    property get alreadyCheckedDuplicates () : boolean {
      return getVariableValue("alreadyCheckedDuplicates", 0) as java.lang.Boolean
    }
    
    property set alreadyCheckedDuplicates ($arg :  boolean) {
      setVariableValue("alreadyCheckedDuplicates", 0, $arg)
    }
    
    property get canAccessLinkButtons () : boolean {
      return getRequireValue("canAccessLinkButtons", 0) as java.lang.Boolean
    }
    
    property set canAccessLinkButtons ($arg :  boolean) {
      setRequireValue("canAccessLinkButtons", 0, $arg)
    }
    
    property get canPick () : boolean {
      return getRequireValue("canPick", 0) as java.lang.Boolean
    }
    
    property set canPick ($arg :  boolean) {
      setRequireValue("canPick", 0, $arg)
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
    
    property get ClaimContact() : ClaimContact { return contactHandle typeis ClaimContact ? (contactHandle) : null; }
    
    function customUpdate() {
      if (!alreadyCheckedDuplicates and Contact.PublicID == null and Contact.AddressBookUID == null and (gw.plugin.contact.ContactSystemApprovalUtil.shouldCreateInContactSystem(Contact) or ClaimContact == null)) {
        if (!checkForDuplicates(false)) {
          gw.api.contact.ContactUtil.customCommit(canPick, Contact, CurrentLocation) 
        }
      } else {
        gw.api.contact.ContactUtil.customCommit(canPick, Contact, CurrentLocation)
      }
    }
    
    function checkForDuplicates(showMessage : boolean) : boolean {
      var hasDuplicates : boolean
      try {
        hasDuplicates = gw.api.contact.ContactUtil.findDuplicates(Contact, ClaimContact, showMessage, null)    
      } catch (e : Exception) {
        if (showMessage) {
          throw e
        }  
      }
      alreadyCheckedDuplicates = true;
      return hasDuplicates;
    }
    
    
  }
  
  
}