package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/workspace/activity/ECFTransactionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ECFTransactionLVExpressions {
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ECFTransactionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ECFTransactionLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ECFTransactionLV.pcf: line 13, column 48
    function initialValue_0 () : gw.api.financials.CurrencyAmount {
      return ECFClaimResponse.carrierShareOfTransactionFinancialsInCurrency(ECFClaimResponse.Claim.Currency)
    }
    
    // 'initialValue' attribute on Variable at ECFTransactionLV.pcf: line 17, column 48
    function initialValue_1 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.OpenReserves.withClaim(ECFClaimResponse.Claim).Amount?:new gw.api.financials.CurrencyAmount(0, ECFClaimResponse.Claim.Currency)
    }
    
    // 'value' attribute on RowIterator at ECFTransactionLV.pcf: line 29, column 40
    function sortValue_2 (transaction :  java.lang.String) : java.lang.Object {
      return ECFClaimResponse.TR
    }
    
    // 'value' attribute on RowIterator at ECFTransactionLV.pcf: line 34, column 29
    function sortValue_3 (transaction :  java.lang.String) : java.lang.Object {
      return claimAmt
    }
    
    // 'value' attribute on RowIterator at ECFTransactionLV.pcf: line 40, column 35
    function sortValue_4 (transaction :  java.lang.String) : java.lang.Object {
      return transactionAmt
    }
    
    // 'footerSumValue' attribute on RowIterator at ECFTransactionLV.pcf: line 40, column 35
    function sumValue_5 (transaction :  java.lang.String) : java.lang.Object {
      return transactionAmt.add(claimAmt)
    }
    
    // 'value' attribute on RowIterator at ECFTransactionLV.pcf: line 22, column 38
    function value_13 () : java.lang.String[] {
      return {'tableInsteadOfFields'}
    }
    
    property get ECFClaimResponse () : ECFMessageClaimResponseRq_Ext {
      return getRequireValue("ECFClaimResponse", 0) as ECFMessageClaimResponseRq_Ext
    }
    
    property set ECFClaimResponse ($arg :  ECFMessageClaimResponseRq_Ext) {
      setRequireValue("ECFClaimResponse", 0, $arg)
    }
    
    property get claimAmt () : gw.api.financials.CurrencyAmount {
      return getVariableValue("claimAmt", 0) as gw.api.financials.CurrencyAmount
    }
    
    property set claimAmt ($arg :  gw.api.financials.CurrencyAmount) {
      setVariableValue("claimAmt", 0, $arg)
    }
    
    property get transactionAmt () : gw.api.financials.CurrencyAmount {
      return getVariableValue("transactionAmt", 0) as gw.api.financials.CurrencyAmount
    }
    
    property set transactionAmt ($arg :  gw.api.financials.CurrencyAmount) {
      setVariableValue("transactionAmt", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/workspace/activity/ECFTransactionLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ECFTransactionLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=TransactionReference) at ECFTransactionLV.pcf: line 29, column 40
    function valueRoot_8 () : java.lang.Object {
      return ECFClaimResponse
    }
    
    // 'value' attribute on CurrencyCell (id=Amount) at ECFTransactionLV.pcf: line 40, column 35
    function value_11 () : gw.api.financials.CurrencyAmount {
      return transactionAmt
    }
    
    // 'value' attribute on TextCell (id=TransactionReference) at ECFTransactionLV.pcf: line 29, column 40
    function value_6 () : java.lang.String {
      return ECFClaimResponse.TR
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves) at ECFTransactionLV.pcf: line 34, column 29
    function value_9 () : gw.api.financials.CurrencyAmount {
      return claimAmt
    }
    
    property get transaction () : java.lang.String {
      return getIteratedValue(1) as java.lang.String
    }
    
    
  }
  
  
}