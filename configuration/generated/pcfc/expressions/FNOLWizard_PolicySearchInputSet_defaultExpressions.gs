package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_PolicySearchInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_PolicySearchInputSet_defaultExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/FNOL/FNOLWizard_PolicySearchInputSet.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_PolicySearchInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_PolicySearchInputSet.default.pcf: line 25, column 46
    function def_onEnter_5 (def :  pcf.CCAddressInputSet) : void {
      def.onEnter(addressOwner)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizard_PolicySearchInputSet.default.pcf: line 25, column 46
    function def_refreshVariables_6 (def :  pcf.CCAddressInputSet) : void {
      def.refreshVariables(addressOwner)
    }
    
    // 'value' attribute on TextInput (id=ssn) at FNOLWizard_PolicySearchInputSet.default.pcf: line 23, column 41
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearch.TaxIdString = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=vin) at FNOLWizard_PolicySearchInputSet.default.pcf: line 32, column 33
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      PolicySearch.Vin = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_PolicySearchInputSet.default.pcf: line 18, column 45
    function initialValue_0 () : gw.api.address.CCAddressOwner {
      return new gw.api.address.PolicySearchAddressOwner(PolicySearch)
    }
    
    // 'value' attribute on TextInput (id=ssn) at FNOLWizard_PolicySearchInputSet.default.pcf: line 23, column 41
    function valueRoot_4 () : java.lang.Object {
      return PolicySearch
    }
    
    // 'value' attribute on TextInput (id=ssn) at FNOLWizard_PolicySearchInputSet.default.pcf: line 23, column 41
    function value_1 () : java.lang.String {
      return PolicySearch.TaxIdString
    }
    
    // 'value' attribute on TextInput (id=vin) at FNOLWizard_PolicySearchInputSet.default.pcf: line 32, column 33
    function value_7 () : java.lang.String {
      return PolicySearch.Vin
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get PolicySearch () : PolicySearchCriteria {
      return getRequireValue("PolicySearch", 0) as PolicySearchCriteria
    }
    
    property set PolicySearch ($arg :  PolicySearchCriteria) {
      setRequireValue("PolicySearch", 0, $arg)
    }
    
    property get addressOwner () : gw.api.address.CCAddressOwner {
      return getVariableValue("addressOwner", 0) as gw.api.address.CCAddressOwner
    }
    
    property set addressOwner ($arg :  gw.api.address.CCAddressOwner) {
      setVariableValue("addressOwner", 0, $arg)
    }
    
    
  }
  
  
}