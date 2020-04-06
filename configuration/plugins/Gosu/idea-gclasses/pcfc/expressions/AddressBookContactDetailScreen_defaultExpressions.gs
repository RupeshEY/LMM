package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookContactDetailScreen_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/shared/contacts/AddressBookContactDetailScreen.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookContactDetailScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ButtonInput (id=ShowActivitiesButton) at AddressBookContactDetailScreen.default.pcf: line 124, column 116
    function action_30 () : void {
      helper.revealContent(ACTIVITIES)
    }
    
    // 'action' attribute on ButtonInput (id=ShowClaimsButton) at AddressBookContactDetailScreen.default.pcf: line 154, column 113
    function action_38 () : void {
      helper.revealContent(CLAIMS)
    }
    
    // 'action' attribute on ButtonInput (id=ShowExposuresButton) at AddressBookContactDetailScreen.default.pcf: line 184, column 116
    function action_46 () : void {
      helper.revealContent(EXPOSURES)
    }
    
    // 'action' attribute on ButtonInput (id=ShowMattersButton) at AddressBookContactDetailScreen.default.pcf: line 214, column 114
    function action_54 () : void {
      helper.revealContent(MATTERS)
    }
    
    // 'action' attribute on ToolbarButton (id=ViewInCM) at AddressBookContactDetailScreen.default.pcf: line 48, column 126
    function action_6 () : void {
      viewInContactManger(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_onEnter_10 (def :  pcf.AddressBookContactBasicsDV_Person) : void {
      def.onEnter(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_onEnter_12 (def :  pcf.AddressBookContactBasicsDV_Place) : void {
      def.onEnter(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_onEnter_14 (def :  pcf.AddressBookContactBasicsDV_default) : void {
      def.onEnter(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 74, column 55
    function def_onEnter_19 (def :  pcf.AddressBookAddressesPanelSet) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 90, column 56
    function def_onEnter_23 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 99, column 106
    function def_onEnter_27 (def :  pcf.AddressBookRelatedContactsLV) : void {
      def.onEnter(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 129, column 57
    function def_onEnter_34 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 159, column 53
    function def_onEnter_42 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 189, column 56
    function def_onEnter_50 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 219, column 54
    function def_onEnter_58 (def :  pcf.AddressBookContactMattersLV) : void {
      def.onEnter(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 236, column 59
    function def_onEnter_62 (def :  pcf.ReviewsPanelSet) : void {
      def.onEnter(null,contact,false,true)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_onEnter_8 (def :  pcf.AddressBookContactBasicsDV_Company) : void {
      def.onEnter(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_refreshVariables_11 (def :  pcf.AddressBookContactBasicsDV_Person) : void {
      def.refreshVariables(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_refreshVariables_13 (def :  pcf.AddressBookContactBasicsDV_Place) : void {
      def.refreshVariables(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_refreshVariables_15 (def :  pcf.AddressBookContactBasicsDV_default) : void {
      def.refreshVariables(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 74, column 55
    function def_refreshVariables_20 (def :  pcf.AddressBookAddressesPanelSet) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 90, column 56
    function def_refreshVariables_24 (def :  pcf.AddressBookContactDocumentsLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 99, column 106
    function def_refreshVariables_28 (def :  pcf.AddressBookRelatedContactsLV) : void {
      def.refreshVariables(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 129, column 57
    function def_refreshVariables_35 (def :  pcf.AddressBookContactActivitiesLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 159, column 53
    function def_refreshVariables_43 (def :  pcf.AddressBookContactClaimsLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 189, column 56
    function def_refreshVariables_51 (def :  pcf.AddressBookContactExposuresLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 219, column 54
    function def_refreshVariables_59 (def :  pcf.AddressBookContactMattersLV) : void {
      def.refreshVariables(contact)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 236, column 59
    function def_refreshVariables_63 (def :  pcf.ReviewsPanelSet) : void {
      def.refreshVariables(null,contact,false,true)
    }
    
    // 'def' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function def_refreshVariables_9 (def :  pcf.AddressBookContactBasicsDV_Company) : void {
      def.refreshVariables(contact, externalContactSource, abcHelper.AllowEditContact)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailScreen.default.pcf: line 15, column 30
    function initialValue_0 () : entity.Contact {
      return abcHelper.Contact
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailScreen.default.pcf: line 19, column 52
    function initialValue_1 () : gw.api.contact.ExternalContactSource {
      return abcHelper.ExternalContactSource
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailScreen.default.pcf: line 24, column 23
    function initialValue_2 () : boolean {
      return externalContactSource.supportsLinking() and not externalContactSource.isNewContact(contact)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailScreen.default.pcf: line 36, column 50
    function initialValue_3 () : gw.api.contact.ContactDetailHelper {
      return new gw.api.contact.ContactDetailHelper(contact.IsHighlyLinked)
    }
    
    // 'initialValue' attribute on Variable at AddressBookContactDetailScreen.default.pcf: line 40, column 43
    function initialValue_4 () : gw.api.addressbook.ABSystem {
      return new gw.api.addressbook.ContactManager()
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 81, column 29
    function locationRef_18 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 106, column 29
    function locationRef_26 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 136, column 29
    function locationRef_32 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 166, column 29
    function locationRef_40 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 196, column 29
    function locationRef_48 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 226, column 29
    function locationRef_56 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'locationRef' attribute on PrintToolbarButton (id=PrintButton) at AddressBookContactDetailScreen.default.pcf: line 64, column 29
    function locationRef_7 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPrint.createDestination(externalContactSource.wrap(contact))
    }
    
    // 'mode' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 57, column 34
    function mode_16 () : java.lang.Object {
      return contact.Subtype
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactBasicsCard) at AddressBookContactDetailScreen.default.pcf: line 54, column 92
    function onSelect_17 () : void {
      helper.CurrentCard = BASICS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactAddressesCard) at AddressBookContactDetailScreen.default.pcf: line 72, column 43
    function onSelect_22 () : void {
      helper.CurrentCard = ADDRESSES
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactRelatedContactsCard) at AddressBookContactDetailScreen.default.pcf: line 97, column 101
    function onSelect_29 () : void {
      helper.CurrentCard = RELATED_CONTACTS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactActivitiesCard) at AddressBookContactDetailScreen.default.pcf: line 114, column 74
    function onSelect_37 () : void {
      helper.CurrentCard = ACTIVITIES
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactClaimsCard) at AddressBookContactDetailScreen.default.pcf: line 144, column 71
    function onSelect_45 () : void {
      helper.CurrentCard = CLAIMS
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactExposuresCard) at AddressBookContactDetailScreen.default.pcf: line 174, column 73
    function onSelect_53 () : void {
      helper.CurrentCard = EXPOSURES
    }
    
    // 'onSelect' attribute on Card (id=AddressBookContactMattersCard) at AddressBookContactDetailScreen.default.pcf: line 204, column 71
    function onSelect_61 () : void {
      helper.CurrentCard = MATTERS
    }
    
    // 'onSelect' attribute on Card (id=ReviewsCard) at AddressBookContactDetailScreen.default.pcf: line 234, column 149
    function onSelect_65 () : void {
      helper.CurrentCard = REVIEWS
    }
    
    // 'visible' attribute on Card (id=AddressBookContactAddressesCard) at AddressBookContactDetailScreen.default.pcf: line 72, column 43
    function visible_21 () : java.lang.Boolean {
      return !(contact typeis Place)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactDocumentsCard) at AddressBookContactDetailScreen.default.pcf: line 88, column 97
    function visible_25 () : java.lang.Boolean {
      return new gw.contact.ContactDocumentsUIHelper().isVendorDocumentsSupported(contact)
    }
    
    // 'visible' attribute on DetailViewPanel at AddressBookContactDetailScreen.default.pcf: line 117, column 57
    function visible_31 () : java.lang.Boolean {
      return helper.isWarningVisible(ACTIVITIES)
    }
    
    // 'visible' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 129, column 57
    function visible_33 () : java.lang.Boolean {
      return helper.isContentVisible(ACTIVITIES)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactActivitiesCard) at AddressBookContactDetailScreen.default.pcf: line 114, column 74
    function visible_36 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewactivity
    }
    
    // 'visible' attribute on DetailViewPanel at AddressBookContactDetailScreen.default.pcf: line 147, column 53
    function visible_39 () : java.lang.Boolean {
      return helper.isWarningVisible(CLAIMS)
    }
    
    // 'visible' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 159, column 53
    function visible_41 () : java.lang.Boolean {
      return helper.isContentVisible(CLAIMS)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactClaimsCard) at AddressBookContactDetailScreen.default.pcf: line 144, column 71
    function visible_44 () : java.lang.Boolean {
      return  showRelatedObjects and perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on DetailViewPanel at AddressBookContactDetailScreen.default.pcf: line 177, column 56
    function visible_47 () : java.lang.Boolean {
      return helper.isWarningVisible(EXPOSURES)
    }
    
    // 'visible' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 189, column 56
    function visible_49 () : java.lang.Boolean {
      return helper.isContentVisible(EXPOSURES)
    }
    
    // 'visible' attribute on ToolbarButton (id=ViewInCM) at AddressBookContactDetailScreen.default.pcf: line 48, column 126
    function visible_5 () : java.lang.Boolean {
      return gw.api.suite.GuidewireSuiteUtil.getProductInfo("ab").Url!=null and perm.Contact.editab(contact)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactExposuresCard) at AddressBookContactDetailScreen.default.pcf: line 174, column 73
    function visible_52 () : java.lang.Boolean {
      return showRelatedObjects and perm.Claim.genericviewexposure
    }
    
    // 'visible' attribute on DetailViewPanel at AddressBookContactDetailScreen.default.pcf: line 207, column 54
    function visible_55 () : java.lang.Boolean {
      return helper.isWarningVisible(MATTERS)
    }
    
    // 'visible' attribute on PanelRef at AddressBookContactDetailScreen.default.pcf: line 219, column 54
    function visible_57 () : java.lang.Boolean {
      return helper.isContentVisible(MATTERS)
    }
    
    // 'visible' attribute on Card (id=AddressBookContactMattersCard) at AddressBookContactDetailScreen.default.pcf: line 204, column 71
    function visible_60 () : java.lang.Boolean {
      return showRelatedObjects and perm.Claim.genericviewmatter
    }
    
    // 'visible' attribute on Card (id=ReviewsCard) at AddressBookContactDetailScreen.default.pcf: line 234, column 149
    function visible_64 () : java.lang.Boolean {
      return util.ReviewPageHelper.shouldDisplayReviewTab(contact) and showRelatedObjects and perm.Claim.genericviewclaim and perm.Review.list
    }
    
    property get AddressBookContactDetailPrint () : java.lang.String {
      return getVariableValue("AddressBookContactDetailPrint", 0) as java.lang.String
    }
    
    property set AddressBookContactDetailPrint ($arg :  java.lang.String) {
      setVariableValue("AddressBookContactDetailPrint", 0, $arg)
    }
    
    property get RemoteSystem () : gw.api.addressbook.ABSystem {
      return getVariableValue("RemoteSystem", 0) as gw.api.addressbook.ABSystem
    }
    
    property set RemoteSystem ($arg :  gw.api.addressbook.ABSystem) {
      setVariableValue("RemoteSystem", 0, $arg)
    }
    
    property get abcHelper () : gw.pcf.AddressBookContactHelper {
      return getRequireValue("abcHelper", 0) as gw.pcf.AddressBookContactHelper
    }
    
    property set abcHelper ($arg :  gw.pcf.AddressBookContactHelper) {
      setRequireValue("abcHelper", 0, $arg)
    }
    
    property get contact () : entity.Contact {
      return getVariableValue("contact", 0) as entity.Contact
    }
    
    property set contact ($arg :  entity.Contact) {
      setVariableValue("contact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getVariableValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setVariableValue("externalContactSource", 0, $arg)
    }
    
    property get hasLoadedRelatedContacts () : boolean {
      return getVariableValue("hasLoadedRelatedContacts", 0) as java.lang.Boolean
    }
    
    property set hasLoadedRelatedContacts ($arg :  boolean) {
      setVariableValue("hasLoadedRelatedContacts", 0, $arg)
    }
    
    property get helper () : gw.api.contact.ContactDetailHelper {
      return getVariableValue("helper", 0) as gw.api.contact.ContactDetailHelper
    }
    
    property set helper ($arg :  gw.api.contact.ContactDetailHelper) {
      setVariableValue("helper", 0, $arg)
    }
    
    property get showRelatedObjects () : boolean {
      return getVariableValue("showRelatedObjects", 0) as java.lang.Boolean
    }
    
    property set showRelatedObjects ($arg :  boolean) {
      setVariableValue("showRelatedObjects", 0, $arg)
    }
    
    function viewInContactManger(viewContact:Contact) {
      var error = false
      if(viewContact.AddressBookUID==null) {
        error = true
        gw.api.util.LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("Web.AddressBook.ContactNotInAB", viewContact))
      }
      if(not RemoteSystem.Enabled) {
        gw.api.util.LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("Web.AddressBook.RemoteSystemNotEnabled"))
      }
      if(not error) {
        pcf.ViewContact.push(RemoteSystem.getContactDetailURL(viewContact), viewContact.AddressBookUID)
      }
    }
    
    
  }
  
  
}