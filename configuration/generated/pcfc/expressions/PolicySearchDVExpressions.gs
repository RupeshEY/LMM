package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/claim/policy/PolicySearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 13, column 65
    function def_onEnter_0 (def :  pcf.PolicySearchPolicyInputSet) : void {
      def.onEnter(PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 18, column 164
    function def_onEnter_2 (def :  pcf.PolicySearchInsuredInputSet_default) : void {
      def.onEnter(PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 22, column 41
    function def_onEnter_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 13, column 65
    function def_refreshVariables_1 (def :  pcf.PolicySearchPolicyInputSet) : void {
      def.refreshVariables(PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 18, column 164
    function def_refreshVariables_3 (def :  pcf.PolicySearchInsuredInputSet_default) : void {
      def.refreshVariables(PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PolicySearchDV.pcf: line 22, column 41
    function def_refreshVariables_6 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    // 'mode' attribute on InputSetRef at PolicySearchDV.pcf: line 18, column 164
    function mode_4 () : java.lang.Object {
      return PolicySearchCriteria.InsuredAddress.Country != null ? PolicySearchCriteria.InsuredAddress.Country : gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    property get PolicySearchCriteria () : PolicySearchCriteria {
      return getRequireValue("PolicySearchCriteria", 0) as PolicySearchCriteria
    }
    
    property set PolicySearchCriteria ($arg :  PolicySearchCriteria) {
      setRequireValue("PolicySearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}