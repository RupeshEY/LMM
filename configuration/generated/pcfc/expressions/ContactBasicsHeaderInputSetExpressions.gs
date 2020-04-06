package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactBasicsHeaderInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/ContactBasicsHeaderInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactBasicsHeaderInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsHeaderInputSet.pcf: line 47, column 52
    function def_onEnter_10 (def :  pcf.EditableClaimContactRolesLV) : void {
      def.onEnter(claimContact)
    }
    
    // 'def' attribute on ListViewInput at ContactBasicsHeaderInputSet.pcf: line 47, column 52
    function def_refreshVariables_11 (def :  pcf.EditableClaimContactRolesLV) : void {
      def.refreshVariables(claimContact)
    }
    
    // 'validationExpression' attribute on ListViewInput at ContactBasicsHeaderInputSet.pcf: line 47, column 52
    function validationExpression_8 () : java.lang.Object {
      return gw.api.claimparties.ClaimContactUtil.isBeingDeleted(claimContact) ? null : claimContact.checkRoleChanges().formatUserMessage()
    }
    
    // 'value' attribute on TextInput (id=LinkStatusMessage) at ContactBasicsHeaderInputSet.pcf: line 32, column 45
    function valueRoot_2 () : java.lang.Object {
      return linkStatus
    }
    
    // 'value' attribute on TextInput (id=LinkStatusMessage) at ContactBasicsHeaderInputSet.pcf: line 32, column 45
    function value_0 () : java.lang.String {
      return linkStatus.LinkStatusMessage
    }
    
    // 'value' attribute on TextInput (id=LinkStatusRelationshipsMessage) at ContactBasicsHeaderInputSet.pcf: line 38, column 67
    function value_4 () : java.lang.String {
      return linkStatus.DifferentRelationshipsMessage
    }
    
    // 'visible' attribute on TextInput (id=LinkStatusRelationshipsMessage) at ContactBasicsHeaderInputSet.pcf: line 38, column 67
    function visible_3 () : java.lang.Boolean {
      return linkStatus.DifferentRelationshipsMessage != null
    }
    
    // 'visible' attribute on ListViewInput at ContactBasicsHeaderInputSet.pcf: line 47, column 52
    function visible_9 () : java.lang.Boolean {
      return showRoles and claimContact != null
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
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    property get showRoles () : boolean {
      return getRequireValue("showRoles", 0) as java.lang.Boolean
    }
    
    property set showRoles ($arg :  boolean) {
      setRequireValue("showRoles", 0, $arg)
    }
    
    
  }
  
  
}