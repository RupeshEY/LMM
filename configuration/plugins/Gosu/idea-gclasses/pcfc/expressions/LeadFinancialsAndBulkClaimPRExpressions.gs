package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsAndBulkClaimPR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LeadFinancialsAndBulkClaimPRExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsAndBulkClaimPR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends selectBulkClaimLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=currency1) at LeadFinancialsAndBulkClaimPR.pcf: line 108, column 135
    function value_25 () : java.lang.String {
      return selectedBulkClaim.Details.Count > 0 ? selectedBulkClaim.Details[0]?.Currency.DisplayName : null
    }
    
    // 'value' attribute on TextCell (id=currency2) at LeadFinancialsAndBulkClaimPR.pcf: line 113, column 135
    function value_27 () : java.lang.String {
      return selectedBulkClaim.Details.Count > 1 ? selectedBulkClaim.Details[1]?.Currency.DisplayName : null
    }
    
    // 'value' attribute on TextCell (id=currency3) at LeadFinancialsAndBulkClaimPR.pcf: line 118, column 135
    function value_29 () : java.lang.String {
      return selectedBulkClaim.Details.Count > 2 ? selectedBulkClaim.Details[2]?.Currency.DisplayName : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsAndBulkClaimPR.pcf: line 128, column 44
    function value_31 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 0 ? selectedBulkClaim.Details[0]?.VatAmount : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount2) at LeadFinancialsAndBulkClaimPR.pcf: line 133, column 44
    function value_33 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 1 ? selectedBulkClaim.Details[1]?.VatAmount : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount3) at LeadFinancialsAndBulkClaimPR.pcf: line 138, column 44
    function value_35 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 2 ? selectedBulkClaim.Details[2]?.VatAmount : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount1) at LeadFinancialsAndBulkClaimPR.pcf: line 148, column 57
    function value_37 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 0 ? selectedBulkClaim.Details[0]?.ImportedServicesAmount : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount2) at LeadFinancialsAndBulkClaimPR.pcf: line 153, column 57
    function value_39 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 1 ? selectedBulkClaim.Details[1]?.ImportedServicesAmount : null
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount3) at LeadFinancialsAndBulkClaimPR.pcf: line 158, column 57
    function value_41 () : gw.pl.currency.MonetaryAmount {
      return selectedBulkClaim.Details.Count > 2 ? selectedBulkClaim.Details[2]?.ImportedServicesAmount : null
    }
    
    property get dtos () : java.lang.String {
      return getIteratedValue(2) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsAndBulkClaimPR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends selectBulkClaimLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=componentUCR) at LeadFinancialsAndBulkClaimPR.pcf: line 71, column 40
    function valueRoot_20 () : java.lang.Object {
      return bulkClaim
    }
    
    // 'value' attribute on TextCell (id=componentUCR) at LeadFinancialsAndBulkClaimPR.pcf: line 71, column 40
    function value_18 () : java.lang.String {
      return bulkClaim.UCR
    }
    
    // 'value' attribute on TextCell (id=componentTR) at LeadFinancialsAndBulkClaimPR.pcf: line 77, column 39
    function value_21 () : java.lang.String {
      return bulkClaim.TR
    }
    
    property get bulkClaim () : ECFMessageBulkClaim_Ext {
      return getIteratedValue(2) as ECFMessageBulkClaim_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsAndBulkClaimPR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LeadFinancialsAndBulkClaimPRExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at LeadFinancialsAndBulkClaimPR.pcf: line 17, column 74
    function def_onEnter_0 (def :  pcf.LeadFinancialsInputSet) : void {
      def.onEnter(ecfClaimData, claimResponseRq)
    }
    
    // 'def' attribute on InputSetRef at LeadFinancialsAndBulkClaimPR.pcf: line 17, column 74
    function def_refreshVariables_1 (def :  pcf.LeadFinancialsInputSet) : void {
      def.refreshVariables(ecfClaimData, claimResponseRq)
    }
    
    // 'value' attribute on TextInput (id=importedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 25, column 65
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ImportedServicesNarrative1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=bulkHeaderRef) at LeadFinancialsAndBulkClaimPR.pcf: line 41, column 54
    function valueRoot_10 () : java.lang.Object {
      return ecfClaimData
    }
    
    // 'value' attribute on TextInput (id=importedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 25, column 65
    function valueRoot_7 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextInput (id=bulkHeaderTR) at LeadFinancialsAndBulkClaimPR.pcf: line 48, column 53
    function value_11 () : java.lang.String {
      return ecfClaimData.BulkClaimHeaderTR
    }
    
    // 'value' attribute on TextInput (id=importedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 25, column 65
    function value_3 () : java.lang.String {
      return claimResponseRq.ImportedServicesNarrative1
    }
    
    // 'value' attribute on TextInput (id=bulkHeaderRef) at LeadFinancialsAndBulkClaimPR.pcf: line 41, column 54
    function value_8 () : java.lang.String {
      return ecfClaimData.BulkClaimHeaderUCR
    }
    
    // 'visible' attribute on DetailViewPanel at LeadFinancialsAndBulkClaimPR.pcf: line 30, column 58
    function visible_14 () : java.lang.Boolean {
      return ecfClaimData.BulkClaimNoOfItems > 0
    }
    
    // 'visible' attribute on TextInput (id=importedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 25, column 65
    function visible_2 () : java.lang.Boolean {
      return ecfClaimData.Financials.first() != null
    }
    
    property get claimResponseRq () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("claimResponseRq", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set claimResponseRq ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("claimResponseRq", 0, $arg)
    }
    
    property get ecfClaimData () : ECFMessageClaimData_Ext {
      return getRequireValue("ecfClaimData", 0) as ECFMessageClaimData_Ext
    }
    
    property set ecfClaimData ($arg :  ECFMessageClaimData_Ext) {
      setRequireValue("ecfClaimData", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsAndBulkClaimPR.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class selectBulkClaimLVExpressionsImpl extends LeadFinancialsAndBulkClaimPRExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=bulkClaimIterator) at LeadFinancialsAndBulkClaimPR.pcf: line 71, column 40
    function sortValue_15 (bulkClaim :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bulkClaim.UCR
    }
    
    // 'value' attribute on RowIterator (id=bulkClaimIterator) at LeadFinancialsAndBulkClaimPR.pcf: line 77, column 39
    function sortValue_16 (bulkClaim :  ECFMessageBulkClaim_Ext) : java.lang.Object {
      return bulkClaim.TR
    }
    
    // 'value' attribute on RowIterator (id=bulkClaimIterator) at LeadFinancialsAndBulkClaimPR.pcf: line 64, column 62
    function value_24 () : ECFMessageBulkClaim_Ext[] {
      return ecfClaimData.BulkClaims
    }
    
    // 'value' attribute on RowIterator at LeadFinancialsAndBulkClaimPR.pcf: line 100, column 54
    function value_43 () : java.lang.String[] {
      return {'tableInsteadOfFields'}
    }
    
    // 'value' attribute on TextInput (id=bulkClaimImportedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 170, column 83
    function value_46 () : java.lang.String {
      return selectedBulkClaim.Details[0].ImportedServicesNarrative
    }
    
    // 'visible' attribute on RowIterator (id=bulkClaimIterator) at LeadFinancialsAndBulkClaimPR.pcf: line 64, column 62
    function visible_17 () : java.lang.Boolean {
      return ecfClaimData.BulkClaimNoOfItems > 0
    }
    
    // 'visible' attribute on ListViewInput at LeadFinancialsAndBulkClaimPR.pcf: line 91, column 55
    function visible_44 () : java.lang.Boolean {
      return selectedBulkClaim != null
    }
    
    // 'visible' attribute on TextInput (id=bulkClaimImportedServicesNarrative) at LeadFinancialsAndBulkClaimPR.pcf: line 170, column 83
    function visible_45 () : java.lang.Boolean {
      return selectedBulkClaim.Details.Count > 0
    }
    
    property get selectedBulkClaim () : ECFMessageBulkClaim_Ext {
      return getCurrentSelection(1) as ECFMessageBulkClaim_Ext
    }
    
    property set selectedBulkClaim ($arg :  ECFMessageBulkClaim_Ext) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}