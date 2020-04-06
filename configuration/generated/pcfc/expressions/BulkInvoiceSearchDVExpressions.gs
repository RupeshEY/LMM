package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceSearchDVExpressions {
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 13, column 77
    function def_onEnter_0 (def :  pcf.BulkInvoiceSearchRequiredInputSet) : void {
      def.onEnter(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 17, column 77
    function def_onEnter_2 (def :  pcf.BulkInvoiceSearchOptionalInputSet) : void {
      def.onEnter(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 21, column 41
    function def_onEnter_4 (def :  pcf.SearchAndResetInputSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 13, column 77
    function def_refreshVariables_1 (def :  pcf.BulkInvoiceSearchRequiredInputSet) : void {
      def.refreshVariables(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 17, column 77
    function def_refreshVariables_3 (def :  pcf.BulkInvoiceSearchOptionalInputSet) : void {
      def.refreshVariables(BulkInvoiceSearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchDV.pcf: line 21, column 41
    function def_refreshVariables_5 (def :  pcf.SearchAndResetInputSet) : void {
      def.refreshVariables()
    }
    
    property get BulkInvoiceSearchCriteria () : BulkInvoiceSearchCriteria {
      return getRequireValue("BulkInvoiceSearchCriteria", 0) as BulkInvoiceSearchCriteria
    }
    
    property set BulkInvoiceSearchCriteria ($arg :  BulkInvoiceSearchCriteria) {
      setRequireValue("BulkInvoiceSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}