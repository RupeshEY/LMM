package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/UserContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class UserContactDetailPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/UserContactDetailPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserContactDetailPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (User :  User) : int {
      return 0
    }
    
    // 'canEdit' attribute on Popup (id=UserContactDetailPopup) at UserContactDetailPopup.pcf: line 11, column 30
    function canEdit_5 () : java.lang.Boolean {
      return Contact != null and perm.Contact.editlocal(User.Contact)
    }
    
    // 'canVisit' attribute on Popup (id=UserContactDetailPopup) at UserContactDetailPopup.pcf: line 11, column 30
    static function canVisit_6 (User :  User) : java.lang.Boolean {
      return perm.Contact.viewlocal
    }
    
    // 'def' attribute on ScreenRef at UserContactDetailPopup.pcf: line 32, column 113
    function def_onEnter_3 (def :  pcf.ContactDetailScreen) : void {
      def.onEnter(contactHandle, false, false, linkStatus, null, true, showRelatedObjects, true)
    }
    
    // 'def' attribute on ScreenRef at UserContactDetailPopup.pcf: line 32, column 113
    function def_refreshVariables_4 (def :  pcf.ContactDetailScreen) : void {
      def.refreshVariables(contactHandle, false, false, linkStatus, null, true, showRelatedObjects, true)
    }
    
    // 'initialValue' attribute on Variable at UserContactDetailPopup.pcf: line 20, column 52
    function initialValue_0 () : gw.api.contact.LocationContactHandle {
      return new gw.api.contact.LocationContactHandle(User.Contact)
    }
    
    // 'initialValue' attribute on Variable at UserContactDetailPopup.pcf: line 25, column 54
    function initialValue_1 () : gw.api.contact.ContactSystemLinkStatus {
      return Contact==null ? null : gw.api.contact.ContactSystemUtil.INSTANCE.generateLinkStatus(Contact)
    }
    
    // 'initialValue' attribute on Variable at UserContactDetailPopup.pcf: line 30, column 23
    function initialValue_2 () : boolean {
      return (linkStatus != null and linkStatus.Known and linkStatus.Linked) ? true : false
    }
    
    // 'title' attribute on Popup (id=UserContactDetailPopup) at UserContactDetailPopup.pcf: line 11, column 30
    static function title_7 (User :  User) : java.lang.Object {
      return User.DisplayName
    }
    
    override property get CurrentLocation () : pcf.UserContactDetailPopup {
      return super.CurrentLocation as pcf.UserContactDetailPopup
    }
    
    property get User () : User {
      return getVariableValue("User", 0) as User
    }
    
    property set User ($arg :  User) {
      setVariableValue("User", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.LocationContactHandle {
      return getVariableValue("contactHandle", 0) as gw.api.contact.LocationContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.LocationContactHandle) {
      setVariableValue("contactHandle", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getVariableValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setVariableValue("linkStatus", 0, $arg)
    }
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    
    property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}