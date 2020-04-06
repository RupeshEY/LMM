package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewCheckWizardAddressBookPickerPopupExpressions {
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckWizardAddressBookPickerPopupExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (requiredContactType :  Type, claim :  Claim) : int {
      return 0
    }
    
    // 'afterReturnFromPopup' attribute on Popup (id=NewCheckWizardAddressBookPickerPopup) at NewCheckWizardAddressBookPickerPopup.pcf: line 12, column 69
    function afterReturnFromPopup_53 (popupCommitted :  boolean) : void {
      if (popupCommitted) { CurrentLocation.pickValueAndCommit(pickedContact) }
    }
    
    // 'canVisit' attribute on Popup (id=NewCheckWizardAddressBookPickerPopup) at NewCheckWizardAddressBookPickerPopup.pcf: line 12, column 69
    static function canVisit_54 (claim :  Claim, requiredContactType :  Type) : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'initialValue' attribute on Variable at NewCheckWizardAddressBookPickerPopup.pcf: line 25, column 21
    function initialValue_0 () : Claim {
      return null
    }
    
    override property get CurrentLocation () : pcf.NewCheckWizardAddressBookPickerPopup {
      return super.CurrentLocation as pcf.NewCheckWizardAddressBookPickerPopup
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get externalSearchEnabled () : boolean {
      return getVariableValue("externalSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set externalSearchEnabled ($arg :  boolean) {
      setVariableValue("externalSearchEnabled", 0, $arg)
    }
    
    property get pickedContact () : Contact {
      return getVariableValue("pickedContact", 0) as Contact
    }
    
    property set pickedContact ($arg :  Contact) {
      setVariableValue("pickedContact", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getVariableValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setVariableValue("requiredContactType", 0, $arg)
    }
    
    property get showCancel () : boolean {
      return getVariableValue("showCancel", 0) as java.lang.Boolean
    }
    
    property set showCancel ($arg :  boolean) {
      setVariableValue("showCancel", 0, $arg)
    }
    
    
          function newSearchCriteria() : ContactSearchCriteria {
            var aCriteria = new ContactSearchCriteria();
            aCriteria.ContactSubtype = typekey.Contact.get(requiredContactType.RelativeName);
            aCriteria.SearchType = TC_INTERNAL;
            if (claim != null) {
              aCriteria.initializeProximitySearch(claim.Addresses?.toList(), claim.LossLocation);
            }
            return aCriteria;
          }
    
          function isLeafSearch(searchCriteria : ContactSearchCriteria) : Boolean {
            return searchCriteria == null ? false
                                          : searchCriteria.ContactIntrinsicType != Contact
                                            and searchCriteria.ContactIntrinsicType != Person
                                            and searchCriteria.ContactIntrinsicType != PersonVendor
                                            and searchCriteria.ContactIntrinsicType != Company
                                            and searchCriteria.ContactIntrinsicType != CompanyVendor
                                            and searchCriteria.ContactIntrinsicType != Place
                                          ;
          }
    
        
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckWizardAddressBookSearchScreenExpressionsImpl extends NewCheckWizardAddressBookPickerPopupExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=cancel) at NewCheckWizardAddressBookPickerPopup.pcf: line 48, column 33
    function action_3 () : void {
      CurrentLocation.cancel()
    }
    
    // 'initialValue' attribute on Variable at NewCheckWizardAddressBookPickerPopup.pcf: line 38, column 60
    function initialValue_1 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // 'visible' attribute on ToolbarButton (id=cancel) at NewCheckWizardAddressBookPickerPopup.pcf: line 48, column 33
    function visible_2 () : java.lang.Boolean {
      return showCancel
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 1) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 1, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 1) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 1, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/newcheckwizard/NewCheckWizardAddressBookPickerPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends NewCheckWizardAddressBookSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimSearchScreen_CreateNewContactButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 90, column 146
    function action_11 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, searchCriteria.ContactSubtype, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_NewPerson) at NewCheckWizardAddressBookPickerPopup.pcf: line 100, column 55
    function action_14 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_PERSON, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_AutoRepairShop) at NewCheckWizardAddressBookPickerPopup.pcf: line 108, column 57
    function action_17 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_AUTOREPAIRSHOP, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_AutoTowingAgcy) at NewCheckWizardAddressBookPickerPopup.pcf: line 113, column 57
    function action_20 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_AUTOTOWINGAGCY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Doctor) at NewCheckWizardAddressBookPickerPopup.pcf: line 118, column 57
    function action_23 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_DOCTOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_MedicalCareOrg) at NewCheckWizardAddressBookPickerPopup.pcf: line 123, column 57
    function action_26 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_MEDICALCAREORG, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_CompanyVendor) at NewCheckWizardAddressBookPickerPopup.pcf: line 128, column 57
    function action_29 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_COMPANYVENDOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Company) at NewCheckWizardAddressBookPickerPopup.pcf: line 134, column 55
    function action_32 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_COMPANY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Adjudicator) at NewCheckWizardAddressBookPickerPopup.pcf: line 142, column 57
    function action_35 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_ADJUDICATOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Attorney) at NewCheckWizardAddressBookPickerPopup.pcf: line 147, column 57
    function action_38 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_ATTORNEY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_LawFirm) at NewCheckWizardAddressBookPickerPopup.pcf: line 152, column 57
    function action_41 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_LAWFIRM, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_LegalVenue) at NewCheckWizardAddressBookPickerPopup.pcf: line 157, column 57
    function action_44 () : void {
      AddressBookSearchNewContactPopup.push(searchCriteria, typekey.Contact.TC_LEGALVENUE, null, claim)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 82, column 29
    function action_9 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("Web.Search.Results"), null)
    }
    
    // 'action' attribute on PickerToolbarButton (id=ClaimSearchScreen_CreateNewContactButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 90, column 146
    function action_dest_12 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, searchCriteria.ContactSubtype, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_NewPerson) at NewCheckWizardAddressBookPickerPopup.pcf: line 100, column 55
    function action_dest_15 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_PERSON, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_AutoRepairShop) at NewCheckWizardAddressBookPickerPopup.pcf: line 108, column 57
    function action_dest_18 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_AUTOREPAIRSHOP, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_AutoTowingAgcy) at NewCheckWizardAddressBookPickerPopup.pcf: line 113, column 57
    function action_dest_21 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_AUTOTOWINGAGCY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Doctor) at NewCheckWizardAddressBookPickerPopup.pcf: line 118, column 57
    function action_dest_24 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_DOCTOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_MedicalCareOrg) at NewCheckWizardAddressBookPickerPopup.pcf: line 123, column 57
    function action_dest_27 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_MEDICALCAREORG, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_CompanyVendor) at NewCheckWizardAddressBookPickerPopup.pcf: line 128, column 57
    function action_dest_30 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_COMPANYVENDOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Company) at NewCheckWizardAddressBookPickerPopup.pcf: line 134, column 55
    function action_dest_33 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_COMPANY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Adjudicator) at NewCheckWizardAddressBookPickerPopup.pcf: line 142, column 57
    function action_dest_36 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_ADJUDICATOR, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_Attorney) at NewCheckWizardAddressBookPickerPopup.pcf: line 147, column 57
    function action_dest_39 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_ATTORNEY, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_LawFirm) at NewCheckWizardAddressBookPickerPopup.pcf: line 152, column 57
    function action_dest_42 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_LAWFIRM, null, claim)
    }
    
    // 'action' attribute on PickerMenuItem (id=ClaimContacts_LegalVenue) at NewCheckWizardAddressBookPickerPopup.pcf: line 157, column 57
    function action_dest_45 () : pcf.api.Destination {
      return pcf.AddressBookSearchNewContactPopup.createDestination(searchCriteria, typekey.Contact.TC_LEGALVENUE, null, claim)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at NewCheckWizardAddressBookPickerPopup.pcf: line 75, column 61
    function allCheckedRowsAction_7 (CheckedValues :  Contact[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, searchCriteria);
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 82, column 29
    function available_8 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at NewCheckWizardAddressBookPickerPopup.pcf: line 62, column 124
    function def_onEnter_4 (def :  pcf.AddressBookSearchDV) : void {
      def.onEnter(searchCriteria, PageHelper, requiredContactType, externalSearchEnabled, claim, false)
    }
    
    // 'def' attribute on PanelRef at NewCheckWizardAddressBookPickerPopup.pcf: line 64, column 124
    function def_onEnter_48 (def :  pcf.AddressBookSearchLV) : void {
      def.onEnter(null, PageHelper, searchCriteria.ExternalContactSource, searchResults, searchCriteria)
    }
    
    // 'def' attribute on PanelRef at NewCheckWizardAddressBookPickerPopup.pcf: line 64, column 124
    function def_refreshVariables_49 (def :  pcf.AddressBookSearchLV) : void {
      def.refreshVariables(null, PageHelper, searchCriteria.ExternalContactSource, searchResults, searchCriteria)
    }
    
    // 'def' attribute on PanelRef at NewCheckWizardAddressBookPickerPopup.pcf: line 62, column 124
    function def_refreshVariables_5 (def :  pcf.AddressBookSearchDV) : void {
      def.refreshVariables(searchCriteria, PageHelper, requiredContactType, externalSearchEnabled, claim, false)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at NewCheckWizardAddressBookPickerPopup.pcf: line 60, column 62
    function maxSearchResults_50 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forContacts()
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=ClaimSearchScreen_CreateNewContactButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 90, column 146
    function onPick_13 (PickedValue :  Contact) : void {
      pickedContact = PickedValue
    }
    
    // 'searchCriteria' attribute on SearchPanel at NewCheckWizardAddressBookPickerPopup.pcf: line 60, column 62
    function searchCriteria_52 () : entity.ContactSearchCriteria {
      return newSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at NewCheckWizardAddressBookPickerPopup.pcf: line 60, column 62
    function search_51 () : java.lang.Object {
      return PageHelper.performProximitySearch(CurrentLocation,searchCriteria)
    }
    
    // 'visible' attribute on PickerToolbarButton (id=ClaimSearchScreen_CreateNewContactButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 90, column 146
    function visible_10 () : java.lang.Boolean {
      return claim != null and isLeafSearch(searchCriteria) and perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'visible' attribute on ToolbarButton (id=ClaimContacts_CreateNewContactButton) at NewCheckWizardAddressBookPickerPopup.pcf: line 95, column 148
    function visible_47 () : java.lang.Boolean {
      return claim != null and (!isLeafSearch(searchCriteria)) and perm.Claim.managepartiesinvolved(claim) and perm.Contact.createlocal
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at NewCheckWizardAddressBookPickerPopup.pcf: line 75, column 61
    function visible_6 () : java.lang.Boolean {
      return searchCriteria.isProximitySearch()
    }
    
    property get searchCriteria () : entity.ContactSearchCriteria {
      return getCriteriaValue(2) as entity.ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  entity.ContactSearchCriteria) {
      setCriteriaValue(2, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult {
      return getResultsValue(2) as gw.api.database.IQueryBeanResult
    }
    
    
  }
  
  
}