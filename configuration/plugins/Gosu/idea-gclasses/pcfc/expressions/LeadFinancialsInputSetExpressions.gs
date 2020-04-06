package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class LeadFinancialsInputSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends LeadFinancialsInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=importedServicesAmount3) at LeadFinancialsInputSet.pcf: line 182, column 44
    function currency_106 () : typekey.Currency {
      return claimResponseRq.ImportedServicesAmount3.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function currency_16 () : typekey.Currency {
      return claimResponseRq.Currency1
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=vatAmount2) at LeadFinancialsInputSet.pcf: line 64, column 31
    function currency_24 () : typekey.Currency {
      return claimResponseRq.Currency2
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=vatAmount3) at LeadFinancialsInputSet.pcf: line 74, column 31
    function currency_32 () : typekey.Currency {
      return claimResponseRq.Currency3
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveAmount1) at LeadFinancialsInputSet.pcf: line 90, column 39
    function currency_40 () : typekey.Currency {
      return claimResponseRq.LeadReserveAmount1.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveAmount2) at LeadFinancialsInputSet.pcf: line 100, column 39
    function currency_48 () : typekey.Currency {
      return claimResponseRq.LeadReserveAmount2.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveAmount3) at LeadFinancialsInputSet.pcf: line 110, column 39
    function currency_56 () : typekey.Currency {
      return claimResponseRq.LeadReserveAmount3.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveFees1) at LeadFinancialsInputSet.pcf: line 126, column 37
    function currency_65 () : typekey.Currency {
      return claimResponseRq.LeadReserveFees1.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveFees2) at LeadFinancialsInputSet.pcf: line 136, column 37
    function currency_73 () : typekey.Currency {
      return claimResponseRq.LeadReserveFees2.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=leadReserveFees3) at LeadFinancialsInputSet.pcf: line 146, column 37
    function currency_81 () : typekey.Currency {
      return claimResponseRq.LeadReserveFees3.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=importedServicesAmount1) at LeadFinancialsInputSet.pcf: line 162, column 44
    function currency_90 () : typekey.Currency {
      return claimResponseRq.ImportedServicesAmount1.Currency
    }
    
    // 'currency' attribute on MonetaryAmountCell (id=importedServicesAmount2) at LeadFinancialsInputSet.pcf: line 172, column 44
    function currency_98 () : typekey.Currency {
      return claimResponseRq.ImportedServicesAmount2.Currency
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount3) at LeadFinancialsInputSet.pcf: line 182, column 44
    function defaultSetter_104 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ImportedServicesAmount3 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function defaultSetter_14 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.VATAmount1 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount2) at LeadFinancialsInputSet.pcf: line 64, column 31
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.VATAmount2 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount3) at LeadFinancialsInputSet.pcf: line 74, column 31
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.VATAmount3 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount1) at LeadFinancialsInputSet.pcf: line 90, column 39
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveAmount1 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount2) at LeadFinancialsInputSet.pcf: line 100, column 39
    function defaultSetter_46 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveAmount2 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount3) at LeadFinancialsInputSet.pcf: line 110, column 39
    function defaultSetter_54 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveAmount3 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees1) at LeadFinancialsInputSet.pcf: line 126, column 37
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveFees1 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees2) at LeadFinancialsInputSet.pcf: line 136, column 37
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveFees2 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees3) at LeadFinancialsInputSet.pcf: line 146, column 37
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.LeadReserveFees3 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount1) at LeadFinancialsInputSet.pcf: line 162, column 44
    function defaultSetter_88 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ImportedServicesAmount1 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount2) at LeadFinancialsInputSet.pcf: line 172, column 44
    function defaultSetter_96 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimResponseRq.ImportedServicesAmount2 = (__VALUE_TO_SET as gw.pl.currency.MonetaryAmount)
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=vatAmount2) at LeadFinancialsInputSet.pcf: line 64, column 31
    function editable_17 () : java.lang.Boolean {
      return claimResponseRq.VATAmount2 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=vatAmount3) at LeadFinancialsInputSet.pcf: line 74, column 31
    function editable_25 () : java.lang.Boolean {
      return claimResponseRq.VATAmount3 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveAmount1) at LeadFinancialsInputSet.pcf: line 90, column 39
    function editable_33 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveAmount1 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveAmount2) at LeadFinancialsInputSet.pcf: line 100, column 39
    function editable_41 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveAmount2 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveAmount3) at LeadFinancialsInputSet.pcf: line 110, column 39
    function editable_49 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveAmount3 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveFees1) at LeadFinancialsInputSet.pcf: line 126, column 37
    function editable_58 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveFees1 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveFees2) at LeadFinancialsInputSet.pcf: line 136, column 37
    function editable_66 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveFees2 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=leadReserveFees3) at LeadFinancialsInputSet.pcf: line 146, column 37
    function editable_74 () : java.lang.Boolean {
      return claimResponseRq.LeadReserveFees3 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=importedServicesAmount1) at LeadFinancialsInputSet.pcf: line 162, column 44
    function editable_83 () : java.lang.Boolean {
      return claimResponseRq.ImportedServicesAmount1 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function editable_9 () : java.lang.Boolean {
      return claimResponseRq.VATAmount1 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=importedServicesAmount2) at LeadFinancialsInputSet.pcf: line 172, column 44
    function editable_91 () : java.lang.Boolean {
      return claimResponseRq.ImportedServicesAmount2 != null
    }
    
    // 'editable' attribute on MonetaryAmountCell (id=importedServicesAmount3) at LeadFinancialsInputSet.pcf: line 182, column 44
    function editable_99 () : java.lang.Boolean {
      return claimResponseRq.ImportedServicesAmount3 != null
    }
    
    // 'outputConversion' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function outputConversion_12 (VALUE :  gw.pl.currency.MonetaryAmount) : java.lang.String {
      return VALUE.Amount == 0?"":VALUE.Amount?.toString()
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred1) at LeadFinancialsInputSet.pcf: line 197, column 43
    function valueRoot_111 () : java.lang.Object {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency1)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred2) at LeadFinancialsInputSet.pcf: line 204, column 43
    function valueRoot_116 () : java.lang.Object {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency2)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred3) at LeadFinancialsInputSet.pcf: line 211, column 43
    function valueRoot_121 () : java.lang.Object {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency3)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function valueRoot_15 () : java.lang.Object {
      return claimResponseRq
    }
    
    // 'value' attribute on TextCell (id=currency1) at LeadFinancialsInputSet.pcf: line 32, column 62
    function valueRoot_2 () : java.lang.Object {
      return claimResponseRq.Currency1
    }
    
    // 'value' attribute on TextCell (id=currency2) at LeadFinancialsInputSet.pcf: line 37, column 62
    function valueRoot_5 () : java.lang.Object {
      return claimResponseRq.Currency2
    }
    
    // 'value' attribute on TextCell (id=currency3) at LeadFinancialsInputSet.pcf: line 42, column 62
    function valueRoot_8 () : java.lang.Object {
      return claimResponseRq.Currency3
    }
    
    // 'value' attribute on TextCell (id=currency1) at LeadFinancialsInputSet.pcf: line 32, column 62
    function value_0 () : java.lang.String {
      return claimResponseRq.Currency1.DisplayName
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount1) at LeadFinancialsInputSet.pcf: line 54, column 31
    function value_10 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.VATAmount1
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount3) at LeadFinancialsInputSet.pcf: line 182, column 44
    function value_100 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.ImportedServicesAmount3
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred1) at LeadFinancialsInputSet.pcf: line 197, column 43
    function value_108 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency1).LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred2) at LeadFinancialsInputSet.pcf: line 204, column 43
    function value_113 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency2).LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LossAndExpensesIncurred3) at LeadFinancialsInputSet.pcf: line 211, column 43
    function value_118 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency3).LossAndExpensesIncurred
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ProfAdvisorFeesOutstanding1) at LeadFinancialsInputSet.pcf: line 224, column 48
    function value_123 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency1).ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ProfAdvisorFeesOutstanding2) at LeadFinancialsInputSet.pcf: line 231, column 48
    function value_128 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency2).ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=ProfAdvisorFeesOutstanding3) at LeadFinancialsInputSet.pcf: line 238, column 48
    function value_133 () : gw.pl.currency.MonetaryAmount {
      return ecfClaimData.Financials.firstWhere(\elt -> elt.Currency == claimResponseRq.Currency3).ProfAdvisorFeesOutstanding
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount2) at LeadFinancialsInputSet.pcf: line 64, column 31
    function value_18 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.VATAmount2
    }
    
    // 'value' attribute on MonetaryAmountCell (id=vatAmount3) at LeadFinancialsInputSet.pcf: line 74, column 31
    function value_26 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.VATAmount3
    }
    
    // 'value' attribute on TextCell (id=currency2) at LeadFinancialsInputSet.pcf: line 37, column 62
    function value_3 () : java.lang.String {
      return claimResponseRq.Currency2.DisplayName
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount1) at LeadFinancialsInputSet.pcf: line 90, column 39
    function value_34 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveAmount1
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount2) at LeadFinancialsInputSet.pcf: line 100, column 39
    function value_42 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveAmount2
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveAmount3) at LeadFinancialsInputSet.pcf: line 110, column 39
    function value_50 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveAmount3
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees1) at LeadFinancialsInputSet.pcf: line 126, column 37
    function value_59 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveFees1
    }
    
    // 'value' attribute on TextCell (id=currency3) at LeadFinancialsInputSet.pcf: line 42, column 62
    function value_6 () : java.lang.String {
      return claimResponseRq.Currency3.DisplayName
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees2) at LeadFinancialsInputSet.pcf: line 136, column 37
    function value_67 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveFees2
    }
    
    // 'value' attribute on MonetaryAmountCell (id=leadReserveFees3) at LeadFinancialsInputSet.pcf: line 146, column 37
    function value_75 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.LeadReserveFees3
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount1) at LeadFinancialsInputSet.pcf: line 162, column 44
    function value_84 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.ImportedServicesAmount1
    }
    
    // 'value' attribute on MonetaryAmountCell (id=importedServicesAmount2) at LeadFinancialsInputSet.pcf: line 172, column 44
    function value_92 () : gw.pl.currency.MonetaryAmount {
      return claimResponseRq.ImportedServicesAmount2
    }
    
    // 'visible' attribute on Row at LeadFinancialsInputSet.pcf: line 152, column 55
    function visible_107 () : java.lang.Boolean {
      return not ecfClaimData.LloydsLeadClaim
    }
    
    // 'visible' attribute on Row at LeadFinancialsInputSet.pcf: line 80, column 83
    function visible_57 () : java.lang.Boolean {
      return ecfClaimData.LloydsLeadClaim or ecfClaimData.LirmaLeadClaim
    }
    
    // 'visible' attribute on Row at LeadFinancialsInputSet.pcf: line 116, column 52
    function visible_82 () : java.lang.Boolean {
      return ecfClaimData.LloydsLeadClaim
    }
    
    property get name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimresponse/LeadFinancialsInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LeadFinancialsInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator at LeadFinancialsInputSet.pcf: line 24, column 42
    function value_139 () : java.lang.String[] {
      return {'tableInsteadOfFields'}
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
  
  
}