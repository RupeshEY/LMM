package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PaymentSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/checks/PaymentSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 14, column 69
    function def_onEnter_0 (def :  pcf.PaymentSearchRequiredInputSet) : void {
      def.onEnter(PaymentSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 18, column 69
    function def_onEnter_2 (def :  pcf.PaymentSearchOptionalInputSet) : void {
      def.onEnter(PaymentSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 22, column 41
    function def_onEnter_4 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 14, column 69
    function def_refreshVariables_1 (def :  pcf.PaymentSearchRequiredInputSet) : void {
      def.refreshVariables(PaymentSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 18, column 69
    function def_refreshVariables_3 (def :  pcf.PaymentSearchOptionalInputSet) : void {
      def.refreshVariables(PaymentSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at PaymentSearchDV.pcf: line 22, column 41
    function def_refreshVariables_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    property get PaymentSearchCriteria () : PaymentSearchCriteria {
      return getRequireValue("PaymentSearchCriteria", 0) as PaymentSearchCriteria
    }
    
    property set PaymentSearchCriteria ($arg :  PaymentSearchCriteria) {
      setRequireValue("PaymentSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}