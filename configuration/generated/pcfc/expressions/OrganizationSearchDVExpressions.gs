package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OrganizationSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/admin/groups/OrganizationSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrganizationSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at OrganizationSearchDV.pcf: line 46, column 41
    function def_onEnter_24 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at OrganizationSearchDV.pcf: line 46, column 41
    function def_refreshVariables_25 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on TextInput (id=ContactName) at OrganizationSearchDV.pcf: line 26, column 45
    function defaultSetter_10 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ContactName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ContactCity) at OrganizationSearchDV.pcf: line 31, column 45
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ContactCity = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=ContactState) at OrganizationSearchDV.pcf: line 37, column 36
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ContactState = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TextInput (id=Name) at OrganizationSearchDV.pcf: line 15, column 38
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ContactPostal) at OrganizationSearchDV.pcf: line 42, column 47
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.ContactPostal = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at OrganizationSearchDV.pcf: line 21, column 43
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      SearchCriteria.Type = (__VALUE_TO_SET as typekey.BusinessType)
    }
    
    // 'value' attribute on TextInput (id=Name) at OrganizationSearchDV.pcf: line 15, column 38
    function valueRoot_3 () : java.lang.Object {
      return SearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Name) at OrganizationSearchDV.pcf: line 15, column 38
    function value_0 () : java.lang.String {
      return SearchCriteria.Name
    }
    
    // 'value' attribute on TextInput (id=ContactCity) at OrganizationSearchDV.pcf: line 31, column 45
    function value_12 () : java.lang.String {
      return SearchCriteria.ContactCity
    }
    
    // 'value' attribute on TypeKeyInput (id=ContactState) at OrganizationSearchDV.pcf: line 37, column 36
    function value_16 () : typekey.State {
      return SearchCriteria.ContactState
    }
    
    // 'value' attribute on TextInput (id=ContactPostal) at OrganizationSearchDV.pcf: line 42, column 47
    function value_20 () : java.lang.String {
      return SearchCriteria.ContactPostal
    }
    
    // 'value' attribute on TypeKeyInput (id=Type) at OrganizationSearchDV.pcf: line 21, column 43
    function value_4 () : typekey.BusinessType {
      return SearchCriteria.Type
    }
    
    // 'value' attribute on TextInput (id=ContactName) at OrganizationSearchDV.pcf: line 26, column 45
    function value_8 () : java.lang.String {
      return SearchCriteria.ContactName
    }
    
    property get SearchCriteria () : OrganizationSearchCriteria {
      return getRequireValue("SearchCriteria", 0) as OrganizationSearchCriteria
    }
    
    property set SearchCriteria ($arg :  OrganizationSearchCriteria) {
      setRequireValue("SearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}