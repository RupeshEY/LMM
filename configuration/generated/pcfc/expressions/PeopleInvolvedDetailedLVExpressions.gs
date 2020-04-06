package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PeopleInvolvedDetailedLVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends PeopleInvolvedDetailedLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name) at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function valueRoot_21 () : java.lang.Object {
      return ClaimContact
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at PeopleInvolvedDetailedLV.pcf: line 85, column 59
    function valueRoot_30 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Address) at PeopleInvolvedDetailedLV.pcf: line 91, column 76
    function valueRoot_33 () : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name) at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function value_19 () : entity.Contact {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles) at PeopleInvolvedDetailedLV.pcf: line 73, column 45
    function value_22 () : java.lang.String {
      return ClaimContact.RolesString
    }
    
    // 'value' attribute on BooleanRadioCell (id=ContactProhibited) at PeopleInvolvedDetailedLV.pcf: line 80, column 29
    function value_25 () : java.lang.Boolean {
      return ClaimContact.ContactProhibited
    }
    
    // 'value' attribute on TextCell (id=Phone_Work) at PeopleInvolvedDetailedLV.pcf: line 85, column 59
    function value_28 () : java.lang.String {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextCell (id=Address) at PeopleInvolvedDetailedLV.pcf: line 91, column 76
    function value_31 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.DisplayAddressLine1
    }
    
    // 'value' attribute on TextCell (id=City) at PeopleInvolvedDetailedLV.pcf: line 97, column 68
    function value_34 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State) at PeopleInvolvedDetailedLV.pcf: line 103, column 38
    function value_37 () : typekey.State {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=PostalCode) at PeopleInvolvedDetailedLV.pcf: line 109, column 67
    function value_40 () : java.lang.String {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    property get ClaimContact () : entity.ClaimContact {
      return getIteratedValue(1) as entity.ClaimContact
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/claim/partiesinvolved/PeopleInvolvedDetailedLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PeopleInvolvedDetailedLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'filter' attribute on ToolbarFilterOption at PeopleInvolvedDetailedLV.pcf: line 38, column 33
    function filter_2 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.AllFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at PeopleInvolvedDetailedLV.pcf: line 41, column 75
    function filter_3 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.ClaimFilter
    }
    
    // 'filter' attribute on ToolbarFilterOption at PeopleInvolvedDetailedLV.pcf: line 50, column 71
    function filter_5 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return gw.api.util.CoreFilters.ALL
    }
    
    // 'filter' attribute on ToolbarFilterOption at PeopleInvolvedDetailedLV.pcf: line 55, column 78
    function filter_7 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter {
      return FilterSet.Separator
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PeopleInvolvedDetailedLV.pcf: line 43, column 62
    function filters_4 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.ExposureFilters.FilterOptions
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PeopleInvolvedDetailedLV.pcf: line 52, column 73
    function filters_6 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return FilterSet.ContactRoleCategoryFilters.FilterOptions
    }
    
    // 'filters' attribute on ToolbarFilterOptionGroup at PeopleInvolvedDetailedLV.pcf: line 57, column 48
    function filters_8 () : com.guidewire.pl.system.filters.BeanBasedQueryFilter[] {
      return rolesFilter.FilterOptions
    }
    
    // 'initialValue' attribute on Variable at PeopleInvolvedDetailedLV.pcf: line 18, column 62
    function initialValue_0 () : gw.api.claimparties.ClaimPartiesToolbarFilters {
      return new gw.api.claimparties.ClaimPartiesToolbarFilters(claim)
    }
    
    // 'initialValue' attribute on Variable at PeopleInvolvedDetailedLV.pcf: line 23, column 62
    function initialValue_1 () : gw.api.filters.ClaimPartiesRolesToolbarFilters {
      return new gw.api.filters.ClaimPartiesRolesToolbarFilters(claim)
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function sortValue_10 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.SecondarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function sortValue_11 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.TertiarySortValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function sortValue_12 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.QuaternarySortValue
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 80, column 29
    function sortValue_13 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.ContactProhibited
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 85, column 59
    function sortValue_14 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryPhoneValue
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 91, column 76
    function sortValue_15 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 97, column 68
    function sortValue_16 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 103, column 38
    function sortValue_17 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 109, column 67
    function sortValue_18 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'sortBy' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 67, column 39
    function sortValue_9 (ClaimContact :  entity.ClaimContact) : java.lang.Object {
      return ClaimContact.Contact.PrimarySortValue
    }
    
    // 'value' attribute on RowIterator at PeopleInvolvedDetailedLV.pcf: line 30, column 41
    function value_43 () : entity.ClaimContact[] {
      return claim.getContactsWithPreload()
    }
    
    property get FilterSet () : gw.api.claimparties.ClaimPartiesToolbarFilters {
      return getVariableValue("FilterSet", 0) as gw.api.claimparties.ClaimPartiesToolbarFilters
    }
    
    property set FilterSet ($arg :  gw.api.claimparties.ClaimPartiesToolbarFilters) {
      setVariableValue("FilterSet", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get rolesFilter () : gw.api.filters.ClaimPartiesRolesToolbarFilters {
      return getVariableValue("rolesFilter", 0) as gw.api.filters.ClaimPartiesRolesToolbarFilters
    }
    
    property set rolesFilter ($arg :  gw.api.filters.ClaimPartiesRolesToolbarFilters) {
      setVariableValue("rolesFilter", 0, $arg)
    }
    
    
  }
  
  
}