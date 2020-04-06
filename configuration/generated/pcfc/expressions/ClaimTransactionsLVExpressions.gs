package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimTransactionsLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTransactionsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimTransactionsLV.pcf: line 33, column 34
    function sortValue_0 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TR
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimTransactionsLV.pcf: line 37, column 78
    function sortValue_1 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TransactionStatus?.DisplayName ?: ""
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimTransactionsLV.pcf: line 42, column 137
    function sortValue_2 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.SyndicateID+" - "+ecfMessage.BureauType.DisplayName+" - "+ecfMessage.Role.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimTransactionsLV.pcf: line 17, column 72
    function value_15 () : java.util.List<entity.ECFMessageClaimData_Ext> {
      return ecfMessages
    }
    
    property get ecfMessages () : java.util.List<entity.ECFMessageClaimData_Ext> {
      return getRequireValue("ecfMessages", 0) as java.util.List<entity.ECFMessageClaimData_Ext>
    }
    
    property set ecfMessages ($arg :  java.util.List<entity.ECFMessageClaimData_Ext>) {
      setRequireValue("ecfMessages", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimtransactions/ClaimTransactionsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimTransactionsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=responseButton) at ClaimTransactionsLV.pcf: line 27, column 37
    function action_4 () : void {
      ECFTransactionDetailsPopup.push(ecfMessage, true)
    }
    
    // 'action' attribute on TextCell (id=tr) at ClaimTransactionsLV.pcf: line 33, column 34
    function action_7 () : void {
      ECFTransactionDetailsPopup.push(ecfMessage)
    }
    
    // 'action' attribute on Link (id=responseButton) at ClaimTransactionsLV.pcf: line 27, column 37
    function action_dest_5 () : pcf.api.Destination {
      return pcf.ECFTransactionDetailsPopup.createDestination(ecfMessage, true)
    }
    
    // 'action' attribute on TextCell (id=tr) at ClaimTransactionsLV.pcf: line 33, column 34
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ECFTransactionDetailsPopup.createDestination(ecfMessage)
    }
    
    // 'available' attribute on Link (id=responseButton) at ClaimTransactionsLV.pcf: line 27, column 37
    function available_3 () : java.lang.Boolean {
      return ecfMessage.Respondable
    }
    
    // 'value' attribute on TextCell (id=tr) at ClaimTransactionsLV.pcf: line 33, column 34
    function valueRoot_10 () : java.lang.Object {
      return ecfMessage
    }
    
    // 'value' attribute on TextCell (id=transactionStatus) at ClaimTransactionsLV.pcf: line 37, column 78
    function value_11 () : java.lang.String {
      return ecfMessage.TransactionStatus?.DisplayName ?: ""
    }
    
    // 'value' attribute on TextCell (id=messageSyndicate) at ClaimTransactionsLV.pcf: line 42, column 137
    function value_13 () : java.lang.String {
      return ecfMessage.SyndicateID+" - "+ecfMessage.BureauType.DisplayName+" - "+ecfMessage.Role.DisplayName
    }
    
    // 'value' attribute on TextCell (id=tr) at ClaimTransactionsLV.pcf: line 33, column 34
    function value_6 () : java.lang.String {
      return ecfMessage.TR
    }
    
    property get ecfMessage () : entity.ECFMessageClaimData_Ext {
      return getIteratedValue(1) as entity.ECFMessageClaimData_Ext
    }
    
    
  }
  
  
}