package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
uses gw.api.util.DisplayableException
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimContactTransferRolesPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimContactTransferRolesPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim, targetContact :  ClaimContact) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=PerformContactRoleTransferButton) at ClaimContactTransferRolesPopup.pcf: line 35, column 25
    function action_3 () : void {
      performTransfer(); CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=CancelTransferRolesButton) at ClaimContactTransferRolesPopup.pcf: line 40, column 25
    function action_5 () : void {
      CurrentLocation.cancel()
    }
    
    // 'afterEnter' attribute on Popup (id=ClaimContactTransferRolesPopup) at ClaimContactTransferRolesPopup.pcf: line 9, column 105
    function afterEnter_84 () : void {
      onEnterPopup()
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RemoveFromSourceContacts) at ClaimContactTransferRolesPopup.pcf: line 132, column 31
    function allCheckedRowsAction_45 (CheckedValues :  entity.ClaimContact[], CheckedValuesErrors :  java.util.Map) : void {
      removeFromSourceContacts(CheckedValues.toList())
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=AddToSourceContacts) at ClaimContactTransferRolesPopup.pcf: line 58, column 31
    function allCheckedRowsAction_7 (CheckedValues :  entity.ClaimContact[], CheckedValuesErrors :  java.util.Map) : void {
      addToSourceContacts(CheckedValues.toList())
    }
    
    // 'available' attribute on ToolbarButton (id=PerformContactRoleTransferButton) at ClaimContactTransferRolesPopup.pcf: line 35, column 25
    function available_2 () : java.lang.Boolean {
      return not contactsToTransfer.Empty
    }
    
    // 'confirmMessage' attribute on ToolbarButton (id=PerformContactRoleTransferButton) at ClaimContactTransferRolesPopup.pcf: line 35, column 25
    function confirmMessage_4 () : java.lang.String {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.ConfirmDialog.Message", targetContact.Contact, targetContact.createCombinedRolesString(contactsToTransfer), contactsToTransfer.join(", "))
    }
    
    // 'initialValue' attribute on Variable at ClaimContactTransferRolesPopup.pcf: line 21, column 62
    function initialValue_0 () : java.util.ArrayList<entity.ClaimContact> {
      return new java.util.ArrayList<ClaimContact>()
    }
    
    // 'label' attribute on ListViewInput (id=AvailableClaimContacts) at ClaimContactTransferRolesPopup.pcf: line 50, column 31
    function label_44 () : java.lang.String {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.AvailableContactListView.Title", targetContact.Contact)
    }
    
    // 'label' attribute on Verbatim at ClaimContactTransferRolesPopup.pcf: line 43, column 144
    function label_6 () : java.lang.String {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.CurrentRoles", targetContact.Contact, targetContact.RolesString)
    }
    
    // 'label' attribute on ListViewInput (id=SourceContact) at ClaimContactTransferRolesPopup.pcf: line 124, column 31
    function label_82 () : java.lang.String {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.SelectedContactListView.Title", targetContact.Contact)
    }
    
    // 'label' attribute on Verbatim at ClaimContactTransferRolesPopup.pcf: line 195, column 176
    function label_83 () : java.lang.String {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.NewRoles", targetContact.Contact, targetContact.createCombinedRolesString(contactsToTransfer))
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function sortValue_10 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function sortValue_11 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 82, column 61
    function sortValue_12 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.RolesString
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 88, column 39
    function sortValue_13 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.ContactProhibited
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 92, column 75
    function sortValue_14 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 97, column 92
    function sortValue_15 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 102, column 84
    function sortValue_16 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 107, column 48
    function sortValue_17 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 112, column 83
    function sortValue_18 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function sortValue_46 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function sortValue_47 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function sortValue_48 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function sortValue_49 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 156, column 61
    function sortValue_50 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.RolesString
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 162, column 39
    function sortValue_51 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.ContactProhibited
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 166, column 75
    function sortValue_52 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 171, column 92
    function sortValue_53 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 176, column 84
    function sortValue_54 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 181, column 48
    function sortValue_55 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 186, column 83
    function sortValue_56 (SourceClaimContact :  entity.ClaimContact) : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function sortValue_8 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function sortValue_9 (ChooseClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ChooseClaimContact.Contact.SecondarySortValue
    }
    
    // 'title' attribute on Popup (id=ClaimContactTransferRolesPopup) at ClaimContactTransferRolesPopup.pcf: line 9, column 105
    static function title_85 (claim :  Claim, targetContact :  ClaimContact) : java.lang.Object {
      return DisplayKey.get("Web.ClaimContactTransferRolesPopup.Title", targetContact.Contact)
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 68, column 76
    function value_43 () : java.util.ArrayList<entity.ClaimContact> {
      return availableClaimContacts
    }
    
    // 'value' attribute on RowIterator at ClaimContactTransferRolesPopup.pcf: line 142, column 76
    function value_81 () : java.util.ArrayList<entity.ClaimContact> {
      return contactsToTransfer
    }
    
    override property get CurrentLocation () : pcf.ClaimContactTransferRolesPopup {
      return super.CurrentLocation as pcf.ClaimContactTransferRolesPopup
    }
    
    property get availableClaimContacts () : java.util.ArrayList<entity.ClaimContact> {
      return getVariableValue("availableClaimContacts", 0) as java.util.ArrayList<entity.ClaimContact>
    }
    
    property set availableClaimContacts ($arg :  java.util.ArrayList<entity.ClaimContact>) {
      setVariableValue("availableClaimContacts", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get contactsToTransfer () : java.util.ArrayList<entity.ClaimContact> {
      return getVariableValue("contactsToTransfer", 0) as java.util.ArrayList<entity.ClaimContact>
    }
    
    property set contactsToTransfer ($arg :  java.util.ArrayList<entity.ClaimContact>) {
      setVariableValue("contactsToTransfer", 0, $arg)
    }
    
    property get targetContact () : ClaimContact {
      return getVariableValue("targetContact", 0) as ClaimContact
    }
    
    property set targetContact ($arg :  ClaimContact) {
      setVariableValue("targetContact", 0, $arg)
    }
    
    
    function performTransfer() {
      var checkedErrors = new java.util.TreeMap<Object, DisplayableException>()
      gw.api.claimparties.ClaimContactUtil.transferClaimContacts(CurrentLocation, contactsToTransfer.toTypedArray(), targetContact, checkedErrors)
      // There might be several errors but we will just show one at a time.
      if (!checkedErrors.Empty) {
        throw checkedErrors.values().first()
      }
    }
    
    function onEnterPopup() {
      for (cc in claim.getContactsWithPreload()) {
        if (cc != targetContact) {
          availableClaimContacts.add(cc)
        }
      }
    }
    
    function addToSourceContacts(chosenContacts : java.util.List<ClaimContact>) {
      contactsToTransfer.addAll(chosenContacts) 
      availableClaimContacts.removeAll(chosenContacts)
    }
    
    function removeFromSourceContacts(chosenContacts : java.util.List<ClaimContact>) {
      availableClaimContacts.addAll(chosenContacts)  
      contactsToTransfer.removeAll(chosenContacts) 
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimContactTransferRolesPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function valueRoot_59 () : java.lang.Object {
      return SourceClaimContact
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at ClaimContactTransferRolesPopup.pcf: line 166, column 75
    function valueRoot_68 () : java.lang.Object {
      return SourceClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimContactTransferRolesPopup.pcf: line 171, column 92
    function valueRoot_71 () : java.lang.Object {
      return SourceClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimContactTransferRolesPopup.pcf: line 152, column 49
    function value_57 () : entity.Contact {
      return SourceClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles) at ClaimContactTransferRolesPopup.pcf: line 156, column 61
    function value_60 () : java.lang.String {
      return SourceClaimContact.RolesString
    }
    
    // 'value' attribute on BooleanRadioCell (id=ContactProhibited) at ClaimContactTransferRolesPopup.pcf: line 162, column 39
    function value_63 () : java.lang.Boolean {
      return SourceClaimContact.ContactProhibited
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at ClaimContactTransferRolesPopup.pcf: line 166, column 75
    function value_66 () : java.lang.String {
      return SourceClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimContactTransferRolesPopup.pcf: line 171, column 92
    function value_69 () : java.lang.String {
      return SourceClaimContact.Contact.PrimaryAddress.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimContactTransferRolesPopup.pcf: line 176, column 84
    function value_72 () : java.lang.String {
      return SourceClaimContact.Contact.PrimaryAddress.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at ClaimContactTransferRolesPopup.pcf: line 181, column 48
    function value_75 () : typekey.State {
      return SourceClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at ClaimContactTransferRolesPopup.pcf: line 186, column 83
    function value_78 () : java.lang.String {
      return SourceClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    property get SourceClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/ClaimContactTransferRolesPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimContactTransferRolesPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function valueRoot_21 () : java.lang.Object {
      return ChooseClaimContact
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at ClaimContactTransferRolesPopup.pcf: line 92, column 75
    function valueRoot_30 () : java.lang.Object {
      return ChooseClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimContactTransferRolesPopup.pcf: line 97, column 92
    function valueRoot_33 () : java.lang.Object {
      return ChooseClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name) at ClaimContactTransferRolesPopup.pcf: line 78, column 49
    function value_19 () : entity.Contact {
      return ChooseClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles) at ClaimContactTransferRolesPopup.pcf: line 82, column 61
    function value_22 () : java.lang.String {
      return ChooseClaimContact.RolesString
    }
    
    // 'value' attribute on BooleanRadioCell (id=ContactProhibited) at ClaimContactTransferRolesPopup.pcf: line 88, column 39
    function value_25 () : java.lang.Boolean {
      return ChooseClaimContact.ContactProhibited
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at ClaimContactTransferRolesPopup.pcf: line 92, column 75
    function value_28 () : java.lang.String {
      return ChooseClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Address) at ClaimContactTransferRolesPopup.pcf: line 97, column 92
    function value_31 () : java.lang.String {
      return ChooseClaimContact.Contact.PrimaryAddress.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at ClaimContactTransferRolesPopup.pcf: line 102, column 84
    function value_34 () : java.lang.String {
      return ChooseClaimContact.Contact.PrimaryAddress.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at ClaimContactTransferRolesPopup.pcf: line 107, column 48
    function value_37 () : typekey.State {
      return ChooseClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at ClaimContactTransferRolesPopup.pcf: line 112, column 83
    function value_40 () : java.lang.String {
      return ChooseClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    property get ChooseClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  
}