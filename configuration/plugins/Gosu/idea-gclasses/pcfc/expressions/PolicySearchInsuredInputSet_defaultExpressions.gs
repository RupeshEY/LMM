package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchInsuredInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySearchInsuredInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchInsuredInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySearchInsuredInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 35, column 83
    function def_onEnter_13 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 35, column 83
    function def_onEnter_15 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 42, column 46
    function def_onEnter_22 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function def_onEnter_7 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function def_onEnter_9 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function def_refreshVariables_10 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 35, column 83
    function def_refreshVariables_14 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 35, column 83
    function def_refreshVariables_16 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 42, column 46
    function def_refreshVariables_23 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function def_refreshVariables_8 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(PolicySearchCriteria))
    }
    
    // 'value' attribute on TextInput (id=Policy_TaxId) at PolicySearchInsuredInputSet.default.pcf: line 40, column 49
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.TaxIdString = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_ContactType) at PolicySearchInsuredInputSet.default.pcf: line 24, column 45
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearchCriteria.ContactType = (__VALUE_TO_SET as typekey.SearchContactType)
    }
    
    // 'initialValue' attribute on Variable at PolicySearchInsuredInputSet.default.pcf: line 16, column 45
    function initialValue_0 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.PolicySearchAddressOwner(PolicySearchCriteria){ :AlwaysShowSeparateFields = true } 
    }
    
    // 'mode' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function mode_11 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'onChange' attribute on PostOnChange at PolicySearchInsuredInputSet.default.pcf: line 26, column 53
    function onChange_1 () : void {
      clearSearchCriteriaNameFields()
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_ContactType) at PolicySearchInsuredInputSet.default.pcf: line 24, column 45
    function valueRoot_5 () : java.lang.Object {
      return PolicySearchCriteria
    }
    
    // 'value' attribute on TextInput (id=Policy_TaxId) at PolicySearchInsuredInputSet.default.pcf: line 40, column 49
    function value_18 () : java.lang.String {
      return PolicySearchCriteria.TaxIdString
    }
    
    // 'value' attribute on TypeKeyInput (id=Policy_ContactType) at PolicySearchInsuredInputSet.default.pcf: line 24, column 45
    function value_2 () : typekey.SearchContactType {
      return PolicySearchCriteria.ContactType
    }
    
    // 'visible' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 35, column 83
    function visible_12 () : java.lang.Boolean {
      return PolicySearchCriteria.ContactType == SearchContactType.TC_COMPANY
    }
    
    // 'visible' attribute on InputSetRef at PolicySearchInsuredInputSet.default.pcf: line 31, column 82
    function visible_6 () : java.lang.Boolean {
      return PolicySearchCriteria.ContactType == SearchContactType.TC_PERSON
    }
    
    property get PolicySearchCriteria () : PolicySearchCriteria {
      return getRequireValue("PolicySearchCriteria", 0) as PolicySearchCriteria
    }
    
    property set PolicySearchCriteria ($arg :  PolicySearchCriteria) {
      setRequireValue("PolicySearchCriteria", 0, $arg)
    }
    
    property get addressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("addressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("addressOwner", 0, $arg)
    }
    
    /**
     * Clears the name fields when you toggle between search ContactTypes.
     */
    function clearSearchCriteriaNameFields() {
      var searchContactType = PolicySearchCriteria.ContactType
      if(searchContactType==null) {
        PolicySearchCriteria.FirstName = null
        PolicySearchCriteria.LastName = null
        PolicySearchCriteria.CompanyName = null
      }
      else if(searchContactType==TC_PERSON) {
        PolicySearchCriteria.CompanyName = null
      }
      else if(searchContactType==TC_COMPANY) {
        PolicySearchCriteria.FirstName = null
        PolicySearchCriteria.LastName = null
      }
    }
    
    
  }
  
  
}