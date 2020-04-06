package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/contacts/ContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ContactDetailScreenExpressions {
  @javax.annotation.Generated("config/web/pcf/contacts/ContactDetailScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=ShowActivitiesButton) at ContactDetailScreen.pcf: line 110, column 116
    function action_28 () : void {
      helper.revealContent(ACTIVITIES)
    }
    
    // 'action' attribute on ButtonInput (id=ShowClaimsButton) at ContactDetailScreen.pcf: line 133, column 113
    function action_35 () : void {
      helper.revealContent(CLAIMS)
    }
    
    // 'action' attribute on ButtonInput (id=ShowExposuresButton) at ContactDetailScreen.pcf: line 156, column 116
    function action_42 () : void {
      helper.revealContent(EXPOSURES)
    }
    
    // 'action' attribute on ButtonInput (id=ShowMattersButton) at ContactDetailScreen.pcf: line 179, column 114
    function action_49 () : void {
      helper.revealContent(MATTERS)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 65, column 50
    function def_onEnter_15 (def :  pcf.AddressesPanelSet) : void {
      def.onEnter(contactHandle)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 77, column 56
    function def_onEnter_19 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 89, column 64
    function def_onEnter_24 (def :  pcf.ContactRelatedContactsDV) : void {
      def.onEnter(contactHandle, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_onEnter_3 (def :  pcf.ContactBasicsDV_Company) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 115, column 57
    function def_onEnter_31 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 138, column 53
    function def_onEnter_38 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 161, column 56
    function def_onEnter_45 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_onEnter_5 (def :  pcf.ContactBasicsDV_Person) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 184, column 54
    function def_onEnter_52 (def :  pcf.AddressBookContactMattersLV) : void {
      def.onEnter(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 194, column 62
    function def_onEnter_58 (def :  pcf.ReviewsPanelSet) : void {
      def.onEnter(claim, Contact, true, false)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_onEnter_7 (def :  pcf.ContactBasicsDV_Place) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_onEnter_9 (def :  pcf.ContactBasicsDV_default) : void {
      def.onEnter(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_refreshVariables_10 (def :  pcf.ContactBasicsDV_default) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 65, column 50
    function def_refreshVariables_16 (def :  pcf.AddressesPanelSet) : void {
      def.refreshVariables(contactHandle)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 77, column 56
    function def_refreshVariables_20 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 89, column 64
    function def_refreshVariables_25 (def :  pcf.ContactRelatedContactsDV) : void {
      def.refreshVariables(contactHandle, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 115, column 57
    function def_refreshVariables_32 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 138, column 53
    function def_refreshVariables_39 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_refreshVariables_4 (def :  pcf.ContactBasicsDV_Company) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 161, column 56
    function def_refreshVariables_46 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 184, column 54
    function def_refreshVariables_53 (def :  pcf.AddressBookContactMattersLV) : void {
      def.refreshVariables(Contact)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 194, column 62
    function def_refreshVariables_59 (def :  pcf.ReviewsPanelSet) : void {
      def.refreshVariables(claim, Contact, true, false)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_refreshVariables_6 (def :  pcf.ContactBasicsDV_Person) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'def' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function def_refreshVariables_8 (def :  pcf.ContactBasicsDV_Place) : void {
      def.refreshVariables(contactHandle, showRoles, linkStatus, claim)
    }
    
    // 'initialValue' attribute on Variable at ContactDetailScreen.pcf: line 43, column 50
    function initialValue_0 () : gw.api.contact.ContactDetailHelper {
      return new gw.api.contact.ContactDetailHelper(contactHandle.Contact.IsHighlyLinked)
    }
    
    // 'mode' attribute on PanelRef at ContactDetailScreen.pcf: line 52, column 34
    function mode_11 () : java.lang.Object {
      return Contact.Subtype
    }
    
    // 'onSelect' attribute on Card (id=ContactBasicsCard) at ContactDetailScreen.pcf: line 49, column 80
    function onSelect_12 () : void {
      helper.CurrentCard = BASICS
    }
    
    // 'onSelect' attribute on Card (id=ContactAddressesCard) at ContactDetailScreen.pcf: line 63, column 43
    function onSelect_18 () : void {
      helper.CurrentCard = ADDRESSES
    }
    
    // 'onSelect' attribute on Card (id=ContactRelatedContactsCard) at ContactDetailScreen.pcf: line 87, column 66
    function onSelect_27 () : void {
      helper.CurrentCard = RELATED_CONTACTS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactActivitiesCard) at ContactDetailScreen.pcf: line 100, column 74
    function onSelect_34 () : void {
      helper.CurrentCard = ACTIVITIES
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactClaimsCard) at ContactDetailScreen.pcf: line 123, column 71
    function onSelect_41 () : void {
      helper.CurrentCard = CLAIMS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactExposuresCard) at ContactDetailScreen.pcf: line 146, column 74
    function onSelect_48 () : void {
      helper.CurrentCard = EXPOSURES
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactMattersCard) at ContactDetailScreen.pcf: line 169, column 72
    function onSelect_55 () : void {
      helper.CurrentCard = MATTERS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactReviewCard) at ContactDetailScreen.pcf: line 192, column 94
    function onSelect_61 () : void {
      helper.CurrentCard = REVIEWS
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 55, column 147
    function toolbarButtonSet_onEnter_1 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 68, column 147
    function toolbarButtonSet_onEnter_13 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 92, column 147
    function toolbarButtonSet_onEnter_22 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 197, column 147
    function toolbarButtonSet_onEnter_56 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.onEnter(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 68, column 147
    function toolbarButtonSet_refreshVariables_14 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 55, column 147
    function toolbarButtonSet_refreshVariables_2 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 92, column 147
    function toolbarButtonSet_refreshVariables_23 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'toolbarButtonSet' attribute on ToolbarButtonSetRef at ContactDetailScreen.pcf: line 197, column 147
    function toolbarButtonSet_refreshVariables_57 (def :  pcf.ContactDetailToolbarButtonSet) : void {
      def.refreshVariables(contactHandle, canAccessLinkButtons, linkStatus, canPick, allowEditInAddressBook)
    }
    
    // 'visible' attribute on Card (id=ContactAddressesCard) at ContactDetailScreen.pcf: line 63, column 43
    function visible_17 () : java.lang.Boolean {
      return !(Contact typeis Place)
    }
    
    // 'visible' attribute on Card (id=ContactDocumentsCard) at ContactDetailScreen.pcf: line 75, column 97
    function visible_21 () : java.lang.Boolean {
      return new gw.contact.ContactDocumentsUIHelper().isVendorDocumentsSupported(Contact)
    }
    
    // 'visible' attribute on Card (id=ContactRelatedContactsCard) at ContactDetailScreen.pcf: line 87, column 66
    function visible_26 () : java.lang.Boolean {
      return not (contactHandle.Contact typeis UserContact)
    }
    
    // 'visible' attribute on DetailViewPanel at ContactDetailScreen.pcf: line 103, column 57
    function visible_29 () : java.lang.Boolean {
      return helper.isWarningVisible(ACTIVITIES)
    }
    
    // 'visible' attribute on PanelRef at ContactDetailScreen.pcf: line 115, column 57
    function visible_30 () : java.lang.Boolean {
      return helper.isContentVisible(ACTIVITIES)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactActivitiesCard) at ContactDetailScreen.pcf: line 100, column 74
    function visible_33 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewactivity
    }
    
    // 'visible' attribute on DetailViewPanel at ContactDetailScreen.pcf: line 126, column 53
    function visible_36 () : java.lang.Boolean {
      return helper.isWarningVisible(CLAIMS)
    }
    
    // 'visible' attribute on PanelRef at ContactDetailScreen.pcf: line 138, column 53
    function visible_37 () : java.lang.Boolean {
      return helper.isContentVisible(CLAIMS)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactClaimsCard) at ContactDetailScreen.pcf: line 123, column 71
    function visible_40 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on DetailViewPanel at ContactDetailScreen.pcf: line 149, column 56
    function visible_43 () : java.lang.Boolean {
      return helper.isWarningVisible(EXPOSURES)
    }
    
    // 'visible' attribute on PanelRef at ContactDetailScreen.pcf: line 161, column 56
    function visible_44 () : java.lang.Boolean {
      return helper.isContentVisible(EXPOSURES)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactExposuresCard) at ContactDetailScreen.pcf: line 146, column 74
    function visible_47 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewexposure
    }
    
    // 'visible' attribute on DetailViewPanel at ContactDetailScreen.pcf: line 172, column 54
    function visible_50 () : java.lang.Boolean {
      return helper.isWarningVisible(MATTERS)
    }
    
    // 'visible' attribute on PanelRef at ContactDetailScreen.pcf: line 184, column 54
    function visible_51 () : java.lang.Boolean {
      return helper.isContentVisible(MATTERS)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactMattersCard) at ContactDetailScreen.pcf: line 169, column 72
    function visible_54 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewmatter
    }
    
    // 'visible' attribute on Card (id=AddressBookContactReviewCard) at ContactDetailScreen.pcf: line 192, column 94
    function visible_60 () : java.lang.Boolean {
      return util.ReviewPageHelper.shouldDisplayReviewTab(Contact) and perm.Review.list
    }
    
    property get allowEditInAddressBook () : boolean {
      return getRequireValue("allowEditInAddressBook", 0) as java.lang.Boolean
    }
    
    property set allowEditInAddressBook ($arg :  boolean) {
      setRequireValue("allowEditInAddressBook", 0, $arg)
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
    
    property get helper () : gw.api.contact.ContactDetailHelper {
      return getVariableValue("helper", 0) as gw.api.contact.ContactDetailHelper
    }
    
    property set helper ($arg :  gw.api.contact.ContactDetailHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    property get linkStatus () : gw.api.contact.ContactSystemLinkStatus {
      return getRequireValue("linkStatus", 0) as gw.api.contact.ContactSystemLinkStatus
    }
    
    property set linkStatus ($arg :  gw.api.contact.ContactSystemLinkStatus) {
      setRequireValue("linkStatus", 0, $arg)
    }
    
    property get showRelatedObjects () : boolean {
      return getRequireValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setRequireValue("showRelatedObjects", 0, $arg)
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