package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimPeopleInvolvedDetailedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimPeopleInvolvedDetailedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name) at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function action_21 () : void {
      NewClaimWizard_PartyInvolvedPopup.push(Wizard, ClaimContact, false)
    }
    
    // 'action' attribute on TextCell (id=Name) at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function action_dest_22 () : pcf.api.Destination {
      return pcf.NewClaimWizard_PartyInvolvedPopup.createDestination(Wizard, ClaimContact, false)
    }
    
    // 'value' attribute on TextCell (id=Name) at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function valueRoot_24 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at NewClaimPeopleInvolvedDetailedLV.pcf: line 87, column 59
    function valueRoot_33 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Address) at NewClaimPeopleInvolvedDetailedLV.pcf: line 93, column 76
    function valueRoot_36 () : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name) at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function value_20 () : entity.Contact {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles) at NewClaimPeopleInvolvedDetailedLV.pcf: line 77, column 45
    function value_25 () : java.lang.String {
      return ClaimContact.RolesString
    }
    
    // 'value' attribute on BooleanRadioCell (id=ContactProhibited) at NewClaimPeopleInvolvedDetailedLV.pcf: line 82, column 51
    function value_28 () : java.lang.Boolean {
      return ClaimContact.ContactProhibited
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at NewClaimPeopleInvolvedDetailedLV.pcf: line 87, column 59
    function value_31 () : java.lang.String {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Address) at NewClaimPeopleInvolvedDetailedLV.pcf: line 93, column 76
    function value_34 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at NewClaimPeopleInvolvedDetailedLV.pcf: line 99, column 68
    function value_37 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at NewClaimPeopleInvolvedDetailedLV.pcf: line 105, column 38
    function value_40 () : typekey.State {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at NewClaimPeopleInvolvedDetailedLV.pcf: line 110, column 67
    function value_43 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    property get ClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/NewClaimPeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimPeopleInvolvedDetailedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'cacheKey' attribute on ToolbarFilter at NewClaimPeopleInvolvedDetailedLV.pcf: line 37, column 53
    function cacheKey_5 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'filter' attribute on ToolbarFilterOption at NewClaimPeopleInvolvedDetailedLV.pcf: line 41, column 33
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at NewClaimPeopleInvolvedDetailedLV.pcf: line 44, column 75
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.ClaimFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at NewClaimPeopleInvolvedDetailedLV.pcf: line 53, column 71
    function filter_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'filter' attribute on ToolbarFilterOption at NewClaimPeopleInvolvedDetailedLV.pcf: line 58, column 78
    function filter_8 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.Separator
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at NewClaimPeopleInvolvedDetailedLV.pcf: line 46, column 62
    function filters_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.ExposureFilters.FilterOptions
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at NewClaimPeopleInvolvedDetailedLV.pcf: line 55, column 73
    function filters_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.ContactRoleCategoryFilters.FilterOptions
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at NewClaimPeopleInvolvedDetailedLV.pcf: line 60, column 48
    function filters_9 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return rolesFilter.FilterOptions
    }
    
    // 'initialValue' attribute on Variable at NewClaimPeopleInvolvedDetailedLV.pcf: line 21, column 62
    function initialValue_0 () : gw.api.claimparties.ClaimPartiesToolbarFilters {
      return new gw.api.claimparties.ClaimPartiesToolbarFilters(Claim)
    }
    
    // 'initialValue' attribute on Variable at NewClaimPeopleInvolvedDetailedLV.pcf: line 26, column 62
    function initialValue_1 () : gw.api.filters.ClaimPartiesRolesToolbarFilters {
      return new gw.api.filters.ClaimPartiesRolesToolbarFilters(Claim)
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function sortValue_10 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function sortValue_11 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function sortValue_12 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 71, column 39
    function sortValue_13 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 82, column 51
    function sortValue_14 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.ContactProhibited
    }
    
    // 'value' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 87, column 59
    function sortValue_15 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 93, column 76
    function sortValue_16 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 99, column 68
    function sortValue_17 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 105, column 38
    function sortValue_18 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 110, column 67
    function sortValue_19 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on RowIterator at NewClaimPeopleInvolvedDetailedLV.pcf: line 32, column 41
    function value_46 () : entity.ClaimContact[] {
      return Claim.Contacts
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get FilterSet () : gw.api.claimparties.ClaimPartiesToolbarFilters {
      return getVariableValue("FilterSet", 0) as gw.api.claimparties.ClaimPartiesToolbarFilters
    }
    
    property set FilterSet ($arg :  gw.api.claimparties.ClaimPartiesToolbarFilters) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get rolesFilter () : gw.api.filters.ClaimPartiesRolesToolbarFilters {
      return getVariableValue("rolesFilter", 0) as gw.api.filters.ClaimPartiesRolesToolbarFilters
    }
    
    property set rolesFilter ($arg :  gw.api.filters.ClaimPartiesRolesToolbarFilters) {
      setVariableValue("rolesFilter", 0, $arg)
    }
    
    
  }
  
  
}