package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchContactDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/AddressBookSearchContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchContactDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 55, column 50
    function def_onEnter_14 (def :  pcf.AddressesPanelSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 66, column 64
    function def_onEnter_19 (def :  pcf.ContactRelatedContactsDV) : void {
      def.onEnter(contactHandle, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 78, column 57
    function def_onEnter_21 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 87, column 53
    function def_onEnter_24 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 96, column 56
    function def_onEnter_27 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_onEnter_3 (def :  pcf.ContactBasicsDV_Company) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 105, column 54
    function def_onEnter_30 (def :  pcf.AddressBookContactMattersLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_onEnter_5 (def :  pcf.ContactBasicsDV_Person) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_onEnter_7 (def :  pcf.ContactBasicsDV_Place) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_onEnter_9 (def :  pcf.ContactBasicsDV_default) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_refreshVariables_10 (def :  pcf.ContactBasicsDV_default) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 55, column 50
    function def_refreshVariables_15 (def :  pcf.AddressesPanelSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 66, column 64
    function def_refreshVariables_20 (def :  pcf.ContactRelatedContactsDV) : void {
      def.refreshVariables(contactHandle, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 78, column 57
    function def_refreshVariables_22 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 87, column 53
    function def_refreshVariables_25 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 96, column 56
    function def_refreshVariables_28 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 105, column 54
    function def_refreshVariables_31 (def :  pcf.AddressBookContactMattersLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_refreshVariables_4 (def :  pcf.ContactBasicsDV_Company) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_refreshVariables_6 (def :  pcf.ContactBasicsDV_Person) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function def_refreshVariables_8 (def :  pcf.ContactBasicsDV_Place) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchContactDetailScreen.pcf: line 35, column 23
    function initialValue_0 () : boolean {
      return linkStatus.Known and linkStatus.Linked
    }
    
    // 'mode' attribute on PanelRef at AddressBookSearchContactDetailScreen.pcf: line 43, column 34
    function mode_11 () : java.lang.Object {
      return Contact.Subtype
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 46, column 131
    function toolbarButtonSet_onEnter_1 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 58, column 131
    function toolbarButtonSet_onEnter_12 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 69, column 131
    function toolbarButtonSet_onEnter_17 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 58, column 131
    function toolbarButtonSet_refreshVariables_13 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 69, column 131
    function toolbarButtonSet_refreshVariables_18 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at AddressBookSearchContactDetailScreen.pcf: line 46, column 131
    function toolbarButtonSet_refreshVariables_2 (def :  pcf.AddressBookSearchContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus)
    }
    
    // 'visible' attribute on Card (id=ContactAddressesCard) at AddressBookSearchContactDetailScreen.pcf: line 53, column 43
    function visible_16 () : java.lang.Boolean {
      return !(Contact typeis Place)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactActivitiesCard) at AddressBookSearchContactDetailScreen.pcf: line 76, column 74
    function visible_23 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewactivity
    }
    
    // 'visible' attribute on Card (id=AddressBookContactClaimsCard) at AddressBookSearchContactDetailScreen.pcf: line 85, column 71
    function visible_26 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on Card (id=AddressBookContactExposuresCard) at AddressBookSearchContactDetailScreen.pcf: line 94, column 74
    function visible_29 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewexposure
    }
    
    // 'visible' attribute on Card (id=AddressBookContactMattersCard) at AddressBookSearchContactDetailScreen.pcf: line 103, column 72
    function visible_32 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewmatter
    }
    
    property get canAccessLinkButtons () : boolean {
      return getRequireValue("canAccessLinkButtons", 0) as java.lang.Boolean
    }
    
    property set canAccessLinkButtons ($arg :  boolean) {
      setRequireValue("canAccessLinkButtons", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
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
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    property get showRoles () : boolean {
      return getRequireValue("showRoles", 0) as java.lang.Boolean
    }
    
    property set showRoles ($arg :  boolean) {
      setRequireValue("showRoles", 0, $arg)
    }
    
    
          property get Contact() : Contact { return contactHandle.Contact; }
        
    
    
  }
  
  
}