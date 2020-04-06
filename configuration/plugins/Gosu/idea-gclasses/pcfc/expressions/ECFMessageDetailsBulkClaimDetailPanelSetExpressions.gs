package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsBulkClaimDetailPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsBulkClaimDetailPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function label_2 () : java.lang.Object {
      return bulkClaim.Details[0]?.Currency
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function label_5 () : java.lang.Object {
      return bulkClaim.Details[1]?.Currency
    }
    
    // 'label' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function label_8 () : java.lang.Object {
      return bulkClaim.Details[2]?.Currency
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 28, column 122
    function sortValue_0 (name :  java.lang.String) : java.lang.Object {
      return DisplayKey.get("Accelerator.IPLM.Web.ECFMessageDetails.BulkClaim.SettlementAmount")
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function sortValue_3 (name :  java.lang.String) : java.lang.Object {
      return bulkClaim.Details[0]?.SettlementAmount
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function sortValue_6 (name :  java.lang.String) : java.lang.Object {
      return bulkClaim.Details[1]?.SettlementAmount
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function sortValue_9 (name :  java.lang.String) : java.lang.Object {
      return bulkClaim.Details[2]?.SettlementAmount
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 22, column 46
    function value_85 () : java.lang.String[] {
      return {'tableActingAsFields'}
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function visible_1 () : java.lang.Boolean {
      return bulkClaim.Details.length > 0
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function visible_4 () : java.lang.Boolean {
      return bulkClaim.Details.length > 1
    }
    
    // 'visible' attribute on RowIterator at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function visible_7 () : java.lang.Boolean {
      return bulkClaim.Details.length > 2
    }
    
    property get bulkClaim () : ECFMessageBulkClaim_Ext {
      return getRequireValue("bulkClaim", 0) as ECFMessageBulkClaim_Ext
    }
    
    property set bulkClaim ($arg :  ECFMessageBulkClaim_Ext) {
      setRequireValue("bulkClaim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsBulkClaimDetailPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsBulkClaimDetailPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on MonetaryAmountCell (id=SettlementAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function label_11 () : java.lang.Object {
      return bulkClaim.Details[0]?.Currency
    }
    
    // 'label' attribute on MonetaryAmountCell (id=SettlementAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function label_16 () : java.lang.Object {
      return bulkClaim.Details[1]?.Currency
    }
    
    // 'label' attribute on MonetaryAmountCell (id=SettlementAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function label_21 () : java.lang.Object {
      return bulkClaim.Details[2]?.Currency
    }
    
    // 'value' attribute on MonetaryAmountCell (id=SettlementAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function value_12 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.SettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=SettlementAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function value_17 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.SettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=SettlementAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function value_22 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.SettlementAmount
    }
    
    // 'value' attribute on TextCell (id=SettlementCurrency1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 54, column 59
    function value_26 () : java.lang.String {
      return bulkClaim.Details[0]?.SettlementCurrency.DisplayName
    }
    
    // 'value' attribute on MonetaryAmountCell (id=OutstandingAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 64, column 59
    function value_29 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.OutstandingAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=OutstandingAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 68, column 59
    function value_32 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.OutstandingAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=OutstandingAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 72, column 59
    function value_35 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.OutstandingAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PreviouslyPaidAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 82, column 59
    function value_38 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.PreviouslyPaidAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PreviouslyPaidAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 86, column 59
    function value_41 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.PreviouslyPaidAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PreviouslyPaidAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 90, column 59
    function value_44 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.PreviouslyPaidAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=IncurredAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 100, column 59
    function value_47 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.IncurredAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=IncurredAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 104, column 59
    function value_50 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.IncurredAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=IncurredAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 108, column 59
    function value_53 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.IncurredAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=VatAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 118, column 59
    function value_56 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.VatAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=VatAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 122, column 59
    function value_59 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.VatAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=VatAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 126, column 59
    function value_62 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.VatAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PaidThisTimeAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 136, column 59
    function value_65 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.PaidThisTimeAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PaidThisTimeAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 140, column 59
    function value_68 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.PaidThisTimeAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=PaidThisTimeAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 144, column 59
    function value_71 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.PaidThisTimeAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ImportedServicesAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 154, column 59
    function value_74 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[0]?.ImportedServicesAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ImportedServicesAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 158, column 59
    function value_77 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[1]?.ImportedServicesAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ImportedServicesAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 162, column 59
    function value_80 () : gw.pl.currency.MonetaryAmount {
      return bulkClaim.Details[2]?.ImportedServicesAmount
    }
    
    // 'value' attribute on TextCell (id=ImportedServicesNarrative1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 173, column 59
    function value_83 () : java.lang.String {
      return bulkClaim.Details[0]?.ImportedServicesNarrative
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=SettlementAmount1) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 33, column 59
    function visible_10 () : java.lang.Boolean {
      return bulkClaim.Details.length > 0
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=SettlementAmount2) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 38, column 59
    function visible_15 () : java.lang.Boolean {
      return bulkClaim.Details.length > 1
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=SettlementAmount3) at ECFMessageDetailsBulkClaimDetailPanelSet.pcf: line 43, column 59
    function visible_20 () : java.lang.Boolean {
      return bulkClaim.Details.length > 2
    }
    
    property get name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}