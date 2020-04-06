package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyCarrierPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFMessageDetailsPolicyCarrierPanelSetExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyCarrierPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFMessageDetailsPolicyCarrierPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Contact) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 20, column 36
    function valueRoot_2 () : java.lang.Object {
      return carrier
    }
    
    // 'value' attribute on TextInput (id=Contact) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 20, column 36
    function value_0 () : java.lang.String {
      return carrier.Contact
    }
    
    // 'value' attribute on RowIterator at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 48, column 46
    function value_29 () : java.lang.String[] {
      return {'tableActingAsFields'}
    }
    
    // 'value' attribute on TextInput (id=Phone) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 26, column 34
    function value_3 () : java.lang.String {
      return carrier.Phone
    }
    
    // 'value' attribute on TextInput (id=Reference1) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 93, column 39
    function value_30 () : java.lang.String {
      return carrier.Reference1
    }
    
    // 'value' attribute on TextInput (id=Reference2) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 99, column 39
    function value_33 () : java.lang.String {
      return carrier.Reference2
    }
    
    // 'value' attribute on TextInput (id=ClaimLineNumber) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 105, column 56
    function value_36 () : java.lang.String {
      return carrier.ClaimLineNumber?.toString()
    }
    
    // 'value' attribute on TextInput (id=Email) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 32, column 34
    function value_6 () : java.lang.String {
      return carrier.Email
    }
    
    // 'value' attribute on TextInput (id=Share) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 38, column 100
    function value_9 () : java.lang.String {
      return carrier.Share != null ? carrier.Share.stripTrailingZeros()+"%" : null
    }
    
    property get carrier () : ECFMessageClaimDataCarrier_Ext {
      return getRequireValue("carrier", 0) as ECFMessageClaimDataCarrier_Ext
    }
    
    property set carrier ($arg :  ECFMessageClaimDataCarrier_Ext) {
      setRequireValue("carrier", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/messagedetails/ECFMessageDetailsPolicyCarrierPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFMessageDetailsPolicyCarrierPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on MonetaryAmountCell (id=CashSettlementAmount1) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 57, column 72
    function value_12 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[0]?.CashSettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=CashSettlementAmount2) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 61, column 72
    function value_15 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[1]?.CashSettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=CashSettlementAmount3) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 65, column 72
    function value_18 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[2]?.CashSettlementAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LetterOfCreditAmount1) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 75, column 72
    function value_21 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[0]?.LetterOfCreditAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LetterOfCreditAmount2) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 79, column 72
    function value_24 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[1]?.LetterOfCreditAmount
    }
    
    // 'value' attribute on MonetaryAmountCell (id=LetterOfCreditAmount3) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 83, column 72
    function value_27 () : gw.pl.currency.MonetaryAmount {
      return carrier.MarketFinancialAmounts[2]?.LetterOfCreditAmount
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=CashSettlementAmount1) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 57, column 72
    function visible_11 () : java.lang.Boolean {
      return carrier.MarketFinancialAmounts.length > 0
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=CashSettlementAmount2) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 61, column 72
    function visible_14 () : java.lang.Boolean {
      return carrier.MarketFinancialAmounts.length > 1
    }
    
    // 'visible' attribute on MonetaryAmountCell (id=CashSettlementAmount3) at ECFMessageDetailsPolicyCarrierPanelSet.pcf: line 65, column 72
    function visible_17 () : java.lang.Boolean {
      return carrier.MarketFinancialAmounts.length > 2
    }
    
    property get name () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}