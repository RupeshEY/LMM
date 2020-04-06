package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SCMClaimMessagesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SCMClaimMessagesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'format' attribute on TextCell (id=totalIncurredIndemnity) at SCMClaimMessagesLV.pcf: line 58, column 45
    function format_32 () : java.lang.String {
      return selectedMessage.FinancialAmountFormatPattern
    }
    
    // 'value' attribute on TextCell (id=ocr) at SCMClaimMessagesLV.pcf: line 24, column 40
    function valueRoot_13 () : java.lang.Object {
      return selectedMessage
    }
    
    // 'value' attribute on TextCell (id=ocr) at SCMClaimMessagesLV.pcf: line 24, column 40
    function value_11 () : java.lang.String {
      return selectedMessage.OCR
    }
    
    // 'value' attribute on TextCell (id=movementReference) at SCMClaimMessagesLV.pcf: line 30, column 62
    function value_14 () : java.lang.String {
      return selectedMessage.MovementReferenceSequence
    }
    
    // 'value' attribute on DateCell (id=creationDate) at SCMClaimMessagesLV.pcf: line 34, column 49
    function value_17 () : java.util.Date {
      return selectedMessage.CreationDate
    }
    
    // 'value' attribute on TextCell (id=syndicate) at SCMClaimMessagesLV.pcf: line 38, column 80
    function value_20 () : java.lang.String {
      return selectedMessage.ReceiverPartyId.split(":").last()
    }
    
    // 'value' attribute on TextCell (id=narrative) at SCMClaimMessagesLV.pcf: line 42, column 46
    function value_22 () : java.lang.String {
      return selectedMessage.Narrative
    }
    
    // 'value' attribute on TypeKeyCell (id=originalCurrency) at SCMClaimMessagesLV.pcf: line 47, column 41
    function value_25 () : typekey.Currency {
      return selectedMessage.OriginalCurrency
    }
    
    // 'value' attribute on TypeKeyCell (id=settlementCurrency) at SCMClaimMessagesLV.pcf: line 52, column 41
    function value_28 () : typekey.Currency {
      return selectedMessage.SettlementCurrency
    }
    
    // 'value' attribute on TextCell (id=totalIncurredIndemnity) at SCMClaimMessagesLV.pcf: line 58, column 45
    function value_31 () : java.math.BigDecimal {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumTotalIncurred)
    }
    
    // 'value' attribute on TextCell (id=paidThisTimeIndemnity) at SCMClaimMessagesLV.pcf: line 64, column 45
    function value_34 () : java.math.BigDecimal {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumPaidThisTime)
    }
    
    // 'value' attribute on TextCell (id=paidThisTimeFees) at SCMClaimMessagesLV.pcf: line 70, column 45
    function value_37 () : java.math.BigDecimal {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumPaidToDate)
    }
    
    // 'value' attribute on TextCell (id=outstandingIndemnity) at SCMClaimMessagesLV.pcf: line 76, column 45
    function value_40 () : java.math.BigDecimal {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumOutstandingAmount)
    }
    
    property get selectedMessage () : entity.LMMessageLloydsSCM_Ext {
      return getIteratedValue(1) as entity.LMMessageLloydsSCM_Ext
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/scm/SCMClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SCMClaimMessagesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 24, column 40
    function sortValue_0 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.OCR
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 30, column 62
    function sortValue_1 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.MovementReferenceSequence
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 76, column 45
    function sortValue_10 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumOutstandingAmount)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 34, column 49
    function sortValue_2 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.CreationDate
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 38, column 80
    function sortValue_3 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.ReceiverPartyId.split(":").last()
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 42, column 46
    function sortValue_4 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.Narrative
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 47, column 41
    function sortValue_5 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.OriginalCurrency
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 52, column 41
    function sortValue_6 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.SettlementCurrency
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 58, column 45
    function sortValue_7 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumTotalIncurred)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 64, column 45
    function sortValue_8 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumPaidThisTime)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 70, column 45
    function sortValue_9 (selectedMessage :  entity.LMMessageLloydsSCM_Ext) : java.lang.Object {
      return selectedMessage.calculateReceiverShare(selectedMessage.SumPaidToDate)
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at SCMClaimMessagesLV.pcf: line 17, column 71
    function value_43 () : java.util.List<entity.LMMessageLloydsSCM_Ext> {
      return messages
    }
    
    property get messages () : java.util.List<entity.LMMessageLloydsSCM_Ext> {
      return getRequireValue("messages", 0) as java.util.List<entity.LMMessageLloydsSCM_Ext>
    }
    
    property set messages ($arg :  java.util.List<entity.LMMessageLloydsSCM_Ext>) {
      setRequireValue("messages", 0, $arg)
    }
    
    
  }
  
  
}