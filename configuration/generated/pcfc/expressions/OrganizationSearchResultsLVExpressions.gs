package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationSearchResultsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OrganizationSearchResultsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickValue' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 15, column 79
    function pickValue_24 () : Organization {
      return Organization
    }
    
    // 'value' attribute on TextCell (id=ContactName) at OrganizationSearchResultsLV.pcf: line 30, column 46
    function valueRoot_14 () : java.lang.Object {
      return Organization.Contact
    }
    
    // 'value' attribute on TextCell (id=ContactCity) at OrganizationSearchResultsLV.pcf: line 34, column 61
    function valueRoot_17 () : java.lang.Object {
      return Organization.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name) at OrganizationSearchResultsLV.pcf: line 21, column 38
    function valueRoot_8 () : java.lang.Object {
      return Organization
    }
    
    // 'value' attribute on TextCell (id=ContactName) at OrganizationSearchResultsLV.pcf: line 30, column 46
    function value_12 () : java.lang.String {
      return Organization.Contact.Name
    }
    
    // 'value' attribute on TextCell (id=ContactCity) at OrganizationSearchResultsLV.pcf: line 34, column 61
    function value_15 () : java.lang.String {
      return Organization.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on TypeKeyCell (id=ContactState) at OrganizationSearchResultsLV.pcf: line 39, column 38
    function value_18 () : typekey.State {
      return Organization.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=ContactPostal) at OrganizationSearchResultsLV.pcf: line 43, column 67
    function value_21 () : java.lang.String {
      return Organization.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on TextCell (id=Name) at OrganizationSearchResultsLV.pcf: line 21, column 38
    function value_6 () : java.lang.String {
      return Organization.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=Type) at OrganizationSearchResultsLV.pcf: line 26, column 45
    function value_9 () : typekey.BusinessType {
      return Organization.Type
    }
    
    property get Organization () : entity.Organization {
      return getIteratedValue(1) as entity.Organization
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchResultsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchResultsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 21, column 38
    function sortValue_0 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Name
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 26, column 45
    function sortValue_1 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Type
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 30, column 46
    function sortValue_2 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Contact.Name
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 34, column 61
    function sortValue_3 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 39, column 38
    function sortValue_4 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 43, column 67
    function sortValue_5 (Organization :  entity.Organization) : java.lang.Object {
      return Organization.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on RowIterator at OrganizationSearchResultsLV.pcf: line 15, column 79
    function value_25 () : gw.api.database.IQueryBeanResult<entity.Organization> {
      return Organizations
    }
    
    property get Organizations () : gw.api.database.IQueryBeanResult<Organization> {
      return getRequireValue("Organizations", 0) as gw.api.database.IQueryBeanResult<Organization>
    }
    
    property set Organizations ($arg :  gw.api.database.IQueryBeanResult<Organization>) {
      setRequireValue("Organizations", 0, $arg)
    }
    
    
  }
  
  
}