package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimMessagesLVExpressions {
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMessagesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 32, column 77
    function label_0 () : java.lang.Object {
      return showActionCode? claimNotifyDetails : claimRetrieveDetails
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 46, column 42
    function sortValue_1 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.CreateTime
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 83, column 48
    function sortValue_10 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.AmendmentDetails
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 87, column 78
    function sortValue_11 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TransactionStatus?.DisplayName ?: ""
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 92, column 52
    function sortValue_12 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TransactionType
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 50, column 34
    function sortValue_2 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TR
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 54, column 51
    function sortValue_3 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.TransactionSequence
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 59, column 75
    function sortValue_4 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.ReceiverPartyId.split(":").last()
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 64, column 37
    function sortValue_6 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.ActionCode.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 69, column 51
    function sortValue_7 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.Role
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 74, column 42
    function sortValue_8 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.BureauType
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 79, column 49
    function sortValue_9 (ecfMessage :  entity.ECFMessageClaimData_Ext) : java.lang.Object {
      return ecfMessage.MessageState
    }
    
    // 'value' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 28, column 72
    function value_53 () : java.util.List<entity.ECFMessageClaimData_Ext> {
      return ecfMessages
    }
    
    // 'visible' attribute on RowIterator (id=ecfMessageIterator) at ClaimMessagesLV.pcf: line 64, column 37
    function visible_5 () : java.lang.Boolean {
      return showActionCode
    }
    
    property get claimNotifyDetails () : String {
      return getVariableValue("claimNotifyDetails", 0) as String
    }
    
    property set claimNotifyDetails ($arg :  String) {
      setVariableValue("claimNotifyDetails", 0, $arg)
    }
    
    property get claimRetrieveDetails () : String {
      return getVariableValue("claimRetrieveDetails", 0) as String
    }
    
    property set claimRetrieveDetails ($arg :  String) {
      setVariableValue("claimRetrieveDetails", 0, $arg)
    }
    
    property get ecfMessages () : java.util.List<entity.ECFMessageClaimData_Ext> {
      return getRequireValue("ecfMessages", 0) as java.util.List<entity.ECFMessageClaimData_Ext>
    }
    
    property set ecfMessages ($arg :  java.util.List<entity.ECFMessageClaimData_Ext>) {
      setRequireValue("ecfMessages", 0, $arg)
    }
    
    property get showActionCode () : Boolean {
      return getRequireValue("showActionCode", 0) as Boolean
    }
    
    property set showActionCode ($arg :  Boolean) {
      setRequireValue("showActionCode", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.Generated("config/web/pcf/acc/iplm/claimmessages/ClaimMessagesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimMessagesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=notifyButton) at ClaimMessagesLV.pcf: line 37, column 37
    function action_13 () : void {
      ECFMessageDetailsPopup.push(ecfMessage)
    }
    
    // 'action' attribute on Link (id=notifyButton) at ClaimMessagesLV.pcf: line 37, column 37
    function action_dest_14 () : pcf.api.Destination {
      return pcf.ECFMessageDetailsPopup.createDestination(ecfMessage)
    }
    
    // 'label' attribute on LinkCell at ClaimMessagesLV.pcf: line 32, column 77
    function label_15 () : java.lang.Object {
      return showActionCode? claimNotifyDetails : claimRetrieveDetails
    }
    
    // 'value' attribute on DateCell (id=dateArrived) at ClaimMessagesLV.pcf: line 46, column 42
    function valueRoot_19 () : java.lang.Object {
      return ecfMessage
    }
    
    // 'value' attribute on TextCell (id=actionCode) at ClaimMessagesLV.pcf: line 64, column 37
    function valueRoot_31 () : java.lang.Object {
      return ecfMessage.ActionCode
    }
    
    // 'value' attribute on DateCell (id=dateArrived) at ClaimMessagesLV.pcf: line 46, column 42
    function value_17 () : java.util.Date {
      return ecfMessage.CreateTime
    }
    
    // 'value' attribute on TextCell (id=tr) at ClaimMessagesLV.pcf: line 50, column 34
    function value_20 () : java.lang.String {
      return ecfMessage.TR
    }
    
    // 'value' attribute on TextCell (id=transactionSequence) at ClaimMessagesLV.pcf: line 54, column 51
    function value_23 () : java.lang.String {
      return ecfMessage.TransactionSequence
    }
    
    // 'value' attribute on TextCell (id=messageSyndicate) at ClaimMessagesLV.pcf: line 59, column 75
    function value_26 () : java.lang.String {
      return ecfMessage.ReceiverPartyId.split(":").last()
    }
    
    // 'value' attribute on TextCell (id=actionCode) at ClaimMessagesLV.pcf: line 64, column 37
    function value_29 () : java.lang.String {
      return ecfMessage.ActionCode.DisplayName
    }
    
    // 'value' attribute on TypeKeyCell (id=contractMarket) at ClaimMessagesLV.pcf: line 69, column 51
    function value_32 () : ECFParticipantFunction_Ext {
      return ecfMessage.Role
    }
    
    // 'value' attribute on TypeKeyCell (id=bureauType) at ClaimMessagesLV.pcf: line 74, column 42
    function value_36 () : ECFBureauType_Ext {
      return ecfMessage.BureauType
    }
    
    // 'value' attribute on TypeKeyCell (id=messageState) at ClaimMessagesLV.pcf: line 79, column 49
    function value_40 () : ECFClaimMessageState_Ext {
      return ecfMessage.MessageState
    }
    
    // 'value' attribute on TextCell (id=transactionDescription) at ClaimMessagesLV.pcf: line 83, column 48
    function value_44 () : java.lang.String {
      return ecfMessage.AmendmentDetails
    }
    
    // 'value' attribute on TextCell (id=transactionStatus) at ClaimMessagesLV.pcf: line 87, column 78
    function value_47 () : java.lang.String {
      return ecfMessage.TransactionStatus?.DisplayName ?: ""
    }
    
    // 'value' attribute on TypeKeyCell (id=messageType) at ClaimMessagesLV.pcf: line 92, column 52
    function value_49 () : ECFClaimTransactionType_Ext {
      return ecfMessage.TransactionType
    }
    
    // 'valueType' attribute on TypeKeyCell (id=contractMarket) at ClaimMessagesLV.pcf: line 69, column 51
    function verifyValueType_35 () : void {
      var __valueTypeArg : ECFParticipantFunction_Ext
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'valueType' attribute on TypeKeyCell (id=bureauType) at ClaimMessagesLV.pcf: line 74, column 42
    function verifyValueType_39 () : void {
      var __valueTypeArg : ECFBureauType_Ext
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'valueType' attribute on TypeKeyCell (id=messageState) at ClaimMessagesLV.pcf: line 79, column 49
    function verifyValueType_43 () : void {
      var __valueTypeArg : ECFClaimMessageState_Ext
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'valueType' attribute on TypeKeyCell (id=messageType) at ClaimMessagesLV.pcf: line 92, column 52
    function verifyValueType_52 () : void {
      var __valueTypeArg : ECFClaimTransactionType_Ext
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : gw.entity.TypeKey = __valueTypeArg
    }
    
    // 'visible' attribute on TextCell (id=actionCode) at ClaimMessagesLV.pcf: line 64, column 37
    function visible_28 () : java.lang.Boolean {
      return showActionCode
    }
    
    property get ecfMessage () : entity.ECFMessageClaimData_Ext {
      return getIteratedValue(1) as entity.ECFMessageClaimData_Ext
    }
    
    
  }
  
  
}