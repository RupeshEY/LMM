package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class BulkInvoiceSearchRequiredInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/search/bulkpay/BulkInvoiceSearchRequiredInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceSearchRequiredInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 24, column 54
    function def_onEnter_10 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 27, column 54
    function def_onEnter_13 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 27, column 54
    function def_onEnter_15 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 24, column 54
    function def_onEnter_8 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 24, column 54
    function def_refreshVariables_11 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 27, column 54
    function def_refreshVariables_14 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 27, column 54
    function def_refreshVariables_16 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'def' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 24, column 54
    function def_refreshVariables_9 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(BulkInvoiceSearchCriteria.NameCriteria) { :NameLabelType = gw.api.name.SearchNameOwner.PAYEE } )
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 16, column 54
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxID) at BulkInvoiceSearchRequiredInputSet.pcf: line 33, column 61
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.NameCriteria.TaxId = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 38, column 54
    function defaultSetter_24 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.CheckNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 21, column 56
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      BulkInvoiceSearchCriteria.InvoiceNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at BulkInvoiceSearchRequiredInputSet.pcf: line 24, column 54
    function mode_12 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'value' attribute on TextInput (id=TaxID) at BulkInvoiceSearchRequiredInputSet.pcf: line 33, column 61
    function valueRoot_21 () : java.lang.Object {
      return BulkInvoiceSearchCriteria.NameCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 16, column 54
    function valueRoot_3 () : java.lang.Object {
      return BulkInvoiceSearchCriteria
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 16, column 54
    function value_0 () : java.lang.String {
      return BulkInvoiceSearchCriteria.ClaimNumber
    }
    
    // 'value' attribute on TextInput (id=TaxID) at BulkInvoiceSearchRequiredInputSet.pcf: line 33, column 61
    function value_18 () : java.lang.String {
      return BulkInvoiceSearchCriteria.NameCriteria.TaxId
    }
    
    // 'value' attribute on TextInput (id=CheckNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 38, column 54
    function value_22 () : java.lang.String {
      return BulkInvoiceSearchCriteria.CheckNumber
    }
    
    // 'value' attribute on TextInput (id=InvoiceNumber) at BulkInvoiceSearchRequiredInputSet.pcf: line 21, column 56
    function value_4 () : java.lang.String {
      return BulkInvoiceSearchCriteria.InvoiceNumber
    }
    
    property get BulkInvoiceSearchCriteria () : BulkInvoiceSearchCriteria {
      return getRequireValue("BulkInvoiceSearchCriteria", 0) as BulkInvoiceSearchCriteria
    }
    
    property set BulkInvoiceSearchCriteria ($arg :  BulkInvoiceSearchCriteria) {
      setRequireValue("BulkInvoiceSearchCriteria", 0, $arg)
    }
    
    
  }
  
  
}